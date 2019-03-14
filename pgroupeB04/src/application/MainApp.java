package application;

import java.nio.file.Paths;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import view.AddQuestion;
import view.GameView;
import view.ScoreView;
import view.WelcomeMenu;

public class MainApp extends Application {

	private static WelcomeMenu welM = new WelcomeMenu();
	private static GameView gameView = new GameView();
	private static AddQuestion addQ = new AddQuestion();
	private static ScoreView scV = new ScoreView();
	private static Stage primaryStage;

	private static Scene scene;

	private static AudioClip audioClip = new AudioClip(Paths.get("MenuPrinc.wav").toUri().toString());

	@Override
	public void start(Stage primaryStage) {

		try {
			MainApp.primaryStage = primaryStage;
			primaryStage.setFullScreen(true);
			primaryStage.setFullScreenExitHint("Press Esc to exit full screen");
			primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);

			welM.setId("welcome");
			gameView.setId("welcome");

			scene = new Scene(welM, 1920, 1080);
			primaryStage.setFullScreen(true);
			primaryStage.setFullScreenExitHint("");

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			WelcomeMenu welM = new WelcomeMenu();
			AddQuestion addQ = new AddQuestion();

			// Game music
			int volume = 100;
			Platform.runLater(() -> audioClip.play(volume));
			Thread.sleep(10);

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Who wants to be a millionaire");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}

	public static void showGame() {
		scene.setRoot(gameView);
	}

	public static void exitFrame() {
		primaryStage.close();
	}
}