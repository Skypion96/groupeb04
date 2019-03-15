package application;

import java.nio.file.Paths;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import view.AddQuestion;
import view.GameView;
import view.ScoreView;
import view.WelcomeMenu;

public class MainApp extends Application {
	
	private static Scene scene;;
	
	private static Stage primaryStage;

	private static AudioClip audioClip = new AudioClip(Paths.get("MenuPrinc.wav").toUri().toString());
	
	private static WelcomeMenu welM;
	private static GameView gameView;
	private static AddQuestion addQ;
	private static ScoreView scV;
	
	private static double volume;

	@Override
	public void start(Stage primaryStage) {

		try {
			MainApp.primaryStage = primaryStage;
			
			BorderPane root = new BorderPane();
			scene = new Scene(root);
			
			primaryStage.setFullScreen(true);
			primaryStage.setFullScreenExitHint("Press Esc to exit full screen");
			primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			welM = new WelcomeMenu();
			gameView = new GameView();
			addQ = new AddQuestion();
			scV = new ScoreView();

			welM.setId("welcome");
			gameView.setId("welcome");

			scene.setRoot(welM);

			// Game music
			volume = 0.;
			Platform.runLater(() -> audioClip.play(volume));
			Thread.sleep(10);

			primaryStage.setTitle("Who wants to be a millionaire");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
	
	public static void shwowWelcome() {
		scene.setRoot(welM);
	}

	public static void showGame() {
		scene.setRoot(gameView);
	}

	public static void exitFrame() {
		primaryStage.close();
	}
	
	public static double getSceneHeight() {
		return scene.getHeight();
	}
	
	public static double getSceneWidth() {
		return scene.getWidth();
	}
	
	public static double getVolume() {
		return volume;
	}
}