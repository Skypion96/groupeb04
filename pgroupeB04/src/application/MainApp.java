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

	// Music
	private static AudioClip audioClip = new AudioClip(Paths.get("MenuPrinc.wav").toUri().toString());
	private static double volume;

	private static WelcomeMenu welM;
	private static GameView gameView;

	// Not used yet
	private static AddQuestion addQ;
	private static ScoreView scV;

	@Override
	public void start(Stage primaryStage) {

		try {
			MainApp.primaryStage = primaryStage;

			BorderPane root = new BorderPane();
			scene = new Scene(root);

			// Setting the stage on full screen and disable the "Esc" key to exit fullscreen
			primaryStage.setFullScreen(true);
			primaryStage.setFullScreenExitHint("Press Esc to exit full screen");
			primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
			primaryStage.setScene(scene);
			primaryStage.show();

			// CSS
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			// Each pane
			welM = new WelcomeMenu();
			gameView = new GameView();
			addQ = new AddQuestion();
			scV = new ScoreView();

			// ID for CSS
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

	// Shows the WelcomeMenu
	public static void shwowWelcome() {
		scene.setRoot(welM);
	}

	// Shows the GameView
	public static void showGame() {
		scene.setRoot(gameView);
	}

	// Exit the Game (Closes the app)
	public static void exitFrame() {
		primaryStage.close();
	}

	// Getter for screen Height used to make relative position of buttons depending
	// on the screen you are using the app
	public static double getSceneHeight() {
		return scene.getHeight();
	}

	// Getter for screen Width used to make relative position of buttons depending
	// on the screen you are using the app
	public static double getSceneWidth() {
		return scene.getWidth();
	}

	// Getter for the volume to allow disabling every sounds
	public static double getVolume() {
		return volume;
	}
}