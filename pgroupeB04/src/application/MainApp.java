package application;

import java.net.URL;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Screen;
import javafx.stage.Stage;
import model.Deck;
import model.Question;
import model.Round;
import serialisation.Serialisation;
import view.AddQuestion;
import view.GameView;
import view.RulesView;
import view.ScoreView;
import view.WelcomeMenu;

public class MainApp extends Application {

	private static Scene scene;;

	private static Stage primaryStage;

	private static Rectangle2D screen = Screen.getPrimary().getBounds();

	// Music
	private static double volume;
	Media music = new Media(getClass().getResource("/MenuPrinc.wav").toString());
	MediaPlayer musicPlayer = new MediaPlayer(music);
	private static WelcomeMenu welM;
	private static GameView gameView;

	// Not used yet
	private static AddQuestion addQ;
	private static ScoreView scV;
	private static RulesView rlV;

	@Override
	public void start(Stage primaryStage) {

		try {
			// Deck / Json
			Question q1 = new Question("Maxime", Round.FIRST_ROUND, "What is the capital of Switzerland ?");
			q1.addChoice("Geneva", false);
			q1.addChoice("Berlin", false);
			q1.addChoice("Zurich", false);
			q1.addChoice("Bern", true);
			Question q2 = new Question("Vincent", Round.FIRST_ROUND,
					"Which United States president was assassinated in Dallas in 1963 ?");
			q2.addChoice("John Fitzgerald Kennedy", true);
			q2.addChoice("Richard Nixon", false);
			q2.addChoice("Ronald Reagan", false);
			q2.addChoice("Lyndon B. Johnson", false);
			Question q3 = new Question("Maxime", Round.FIRST_ROUND,
					"In the Mendeleev's table, which acronym stands for gold ?");
			q3.addChoice("Go", false);
			q3.addChoice("Au", true);
			q3.addChoice("Gd", false);
			q3.addChoice("Or", false);
			Question q4 = new Question("David", Round.FIRST_ROUND, "Example FIRST round question number 1");
			q4.addChoice("No1", false);
			q4.addChoice("No2", false);
			q4.addChoice("No3", false);
			q4.addChoice("Yes", true);
			Question q5 = new Question("David", Round.FIRST_ROUND, "Example FIRST round question number 2");
			q5.addChoice("No1", false);
			q5.addChoice("No2", false);
			q5.addChoice("No3", false);
			q5.addChoice("Yes", true);
			Question q6 = new Question("Vincent", Round.SECOND_ROUND,
					"What was the direct cause of the First World War  ?");
			q6.addChoice("The assassination of Archduke Franz Ferdinand", true);
			q6.addChoice("Mutual Defense Alliances", false);
			q6.addChoice("Imperialism", false);
			q6.addChoice("The increase of militarism", false);
			Question q7 = new Question("Maxime", Round.SECOND_ROUND,
					"Which beach name was a real name during the Normandy landing?");
			q7.addChoice("Iron Beach", false);
			q7.addChoice("Yumaha Beach", false);
			q7.addChoice("Gold Beach", true);
			q7.addChoice("Silver Beach", false);
			Question q8 = new Question("David", Round.SECOND_ROUND, "Who discovered photon ?");
			q8.addChoice("Isaac Newton", false);
			q8.addChoice("Albert Einstein", true);
			q8.addChoice("Nikola Tesla", false);
			q8.addChoice("Stephen Hawking", false);
			Question q9 = new Question("David", Round.SECOND_ROUND, "Example SECOND round question number 1");
			q9.addChoice("No1", false);
			q9.addChoice("No2", false);
			q9.addChoice("No3", false);
			q9.addChoice("Yes", true);
			Question q10 = new Question("David", Round.SECOND_ROUND, "Example SECOND round question number 2");
			q10.addChoice("No1", false);
			q10.addChoice("No2", false);
			q10.addChoice("No3", false);
			q10.addChoice("Yes", true);
			Question q11 = new Question("Vincent", Round.LAST_ROUND,
					"When was created the Federal Bureau of Investigation ?");
			q11.addChoice("26 july 1908", true);
			q11.addChoice("21 july 1969", false);
			q11.addChoice("4 novembre 1952", false);
			q11.addChoice("18 septembre 1947", false);
			Question q12 = new Question("Maxime", Round.LAST_ROUND, "What’s the old name of Taiwan?");
			q12.addChoice("Taïti", false);
			q12.addChoice("Aqcuera", false);
			q12.addChoice("Tortuga", false);
			q12.addChoice("Formosa", true);
			Question q13 = new Question("David", Round.LAST_ROUND,
					"When did the construction of the Statue of Liberty start ?");
			q13.addChoice("1875", true);
			q13.addChoice("1902", false);
			q13.addChoice("1825", false);
			q13.addChoice("1893", false);
			Question q14 = new Question("David", Round.LAST_ROUND, "Example LAST round question number 1");
			q14.addChoice("No1", false);
			q14.addChoice("No2", false);
			q14.addChoice("No3", false);
			q14.addChoice("Yes", true);
			Question q15 = new Question("David", Round.LAST_ROUND, "Example LAST round question number 2");
			q15.addChoice("No1", false);
			q15.addChoice("No2", false);
			q15.addChoice("No3", false);
			q15.addChoice("Yes", true);
			Deck deck = new Deck();
			deck.addQuestion(q1);
			deck.addQuestion(q2);
			deck.addQuestion(q3);
			deck.addQuestion(q4);
			deck.addQuestion(q5);
			deck.addQuestion(q6);
			deck.addQuestion(q7);
			deck.addQuestion(q8);
			deck.addQuestion(q9);
			deck.addQuestion(q10);
			deck.addQuestion(q11);
			deck.addQuestion(q12);
			deck.addQuestion(q13);
			deck.addQuestion(q14);
			deck.addQuestion(q15);
			Serialisation.writeDeck(deck.toJson());

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

			// Style for panes
			URL urlBackGround = getClass().getResource("/backgroundMenu.jpg");
			String backgroundStyle = "-fx-background-image: url(" + urlBackGround.toString() + ");\r\n"
					+ "	-fx-background-size: cover;\r\n" + "    -fx-background-repeat: stretch;\r\n"
					+ "    -fx-background-position: center center;\r\n"
					+ "    -fx-effect: dropshadow(three-pass-box, black, 30.0, 0.5, 0.0, 0.0); ";

			welM.setStyle(backgroundStyle);
			gameView.setStyle(backgroundStyle);
			rlV.setStyle(backgroundStyle);

			// Setting welM as ROOT
			scene.setRoot(welM);

			// Game music
			volume = 1.;
			musicPlayer.setVolume(volume);
			musicPlayer.play();

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
	
	// Shows the RulesView
	public static void showRules() {
		scene.setRoot(rlV);
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

	// Getter for the volume to allow disabling every sounds
	public static double getVolume() {
		return volume;
	}
}