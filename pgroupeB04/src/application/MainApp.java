package application;

import java.net.URL;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import view.AddQuestion;
import view.GameView;
import view.LoginAP;
import view.Registration;
import view.RulesView;
import view.ScoreView;
import view.Sound;
import view.TableViewHighScore;
import view.WelcomeMenu;

public class MainApp extends Application {

	private static Scene scene;;

	private static Stage primaryStage;

	private static Rectangle2D screen = Screen.getPrimary().getBounds();

	
	private static WelcomeMenu welM;
	private static GameView gameView;

	// Not used yet
	private static AddQuestion addQ;
	private static ScoreView scV;
	private static RulesView rlV;
	private static LoginAP login;
	private static TableViewHighScore tvHS;
	private static Registration regist;
	
	private static Sound sound;

	@Override
	public void start(Stage primaryStage) {

		try {
			// App
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
			rlV = new RulesView();
			login = new LoginAP();
			tvHS = new TableViewHighScore();
			regist = new Registration();

			// Style for panes
			URL urlBackGround = getClass().getResource("/backgroundMenu.jpg");
			String backgroundStyle = "-fx-background-image: url(" + urlBackGround.toString() + ");\r\n"
					+ "	-fx-background-size: cover;\r\n" + "    -fx-background-repeat: stretch;\r\n"
					+ "    -fx-background-position: center center;\r\n"
					+ "    -fx-effect: dropshadow(three-pass-box, black, 30.0, 0.5, 0.0, 0.0); ";
			
			//Style for RulesView
			URL urlBackGround2 = getClass().getResource("/black.jpg");
			String backgroundStyle2 = "-fx-background-image: url(" + urlBackGround2.toString() + ");\r\n"
					+ "	-fx-background-size: cover;\r\n" + "    -fx-background-repeat: stretch;\r\n"
					+ "    -fx-background-position: center center;\r\n"
					+ "    -fx-effect: dropshadow(three-pass-box, black, 30.0, 0.5, 0.0, 0.0); ";
			
			welM.setStyle(backgroundStyle);
			gameView.setStyle(backgroundStyle);
			rlV.setStyle(backgroundStyle2);
			scV.setStyle(backgroundStyle);
			login.setStyle(backgroundStyle2);
			addQ.setStyle(backgroundStyle2);
			tvHS.setStyle(backgroundStyle2);
			regist.setStyle(backgroundStyle);

			// Setting welM as ROOT
			scene.setRoot(welM);
			
			sound = new Sound();
			sound.playSound();

			primaryStage.setTitle("Who wants to be a millionaire");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}

	// Shows the WelcomeMenu
	public static void showWelcome() {
		scene.setRoot(welM);
	}

	// Shows the GameView
	public static void showGame() {
		scene.setRoot(gameView);
	}
	
	// Shows the RulesView
	public static void showRules() {
		scene.setRoot(rlV);
	}
	
	// Shows the ScoreView
	public static void showScoreView() {
		scene.setRoot(scV);
	}

	public static void showTableView() {
		scene.setRoot(tvHS);
	}
	
	public static void showRegistration() {
		scene.setRoot(regist);
	}
	
	// Exit the Game (Closes the app)
	public static void exitFrame() {
		primaryStage.close();
	}

	// Getter for screen Height used to make relative position of buttons depending
	// on the screen you are using the app
	public static double getScreenHeight() {
		return screen.getHeight();
	}

	// Getter for screen Width used to make relative position of buttons depending
	// on the screen you are using the app
	public static double getScreenWidth() {
		return screen.getWidth();
	}
	
	// Getter for the Gameview
	public static GameView getGameView() {
		return gameView;
	}
	
	// Getter for the TableViewHighScore
	public static TableViewHighScore getTableViewHighScore() {
		return tvHS;
	}
	
	// Getter for ScoreView
	public static ScoreView getScv() {
		return scV;
	}
	
	// Getter for Registration
	public static Registration getRg() {
		return regist;
	}

	public static Sound getSound() {
		return sound;
	}

	// Shows the LoginAP
	public static void showLoginAP() {
		scene.setRoot(login);
	}
	
	// Shows the AddQuestion
	public static void showAddQuestion() {
		scene.setRoot(addQ);
	}
}