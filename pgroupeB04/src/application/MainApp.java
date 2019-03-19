package application;

import java.net.URL;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import model.Deck;
import model.Question;
import model.Round;
import serialisation.Serialisation;
import view.AddQuestion;
import view.GameView;
import view.ScoreView;
import view.WelcomeMenu;

public class MainApp extends Application {

	private static Scene scene;;

	private static Stage primaryStage;

	// Music
	URL resource = getClass().getResource("/MenuPrinc.wav");
	private AudioClip audioClip = new AudioClip(resource.toString());
	private static double volume;

	private static WelcomeMenu welM;
	private static GameView gameView;

	// Not used yet
	private static AddQuestion addQ;
	private static ScoreView scV;

	@Override
	public void start(Stage primaryStage) {

		try {
			// Deck / Json
			Question q1 = new Question("Maxime", Round.FIRST_ROUND, "What's the capital of France ?");
			q1.addChoice("Bruxelles", false);
			q1.addChoice("Paris", true);
			q1.addChoice("Luxembourg", false);
			q1.addChoice("Berlin", false);
			Question q2 = new Question("Vincent", Round.FIRST_ROUND, "Who build the Eiffel Tower ?");
			q2.addChoice("Gustave Eiffel", true);
			q2.addChoice("Jean-Pierre Foucault", false);
			q2.addChoice("Nicolas Sarkozy", false);
			q2.addChoice("François Mitterrand", false);
			Question q3 = new Question("Vincent", Round.FIRST_ROUND,
					"Which United States president was assassinated in Dallas in 1963 ?");
			q3.addChoice("John Fitzgerald Kennedy", true);
			q3.addChoice("Richard Nixon", false);
			q3.addChoice("Ronald Reagan", false);
			q3.addChoice("Lyndon B. Johnson", false);
			Question q4 = new Question("David", Round.FIRST_ROUND, "Example FIRST round question number 2");
			q4.addChoice("No1", false);
			q4.addChoice("No2", false);
			q4.addChoice("No3", false);
			q4.addChoice("Yes", true);
			Question q5 = new Question("David", Round.FIRST_ROUND, "Example FIRST round question number 3");
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
			Question q7 = new Question("David", Round.SECOND_ROUND, "Example SECOND round question number 2");
			q7.addChoice("No1", false);
			q7.addChoice("No2", false);
			q7.addChoice("No3", false);
			q7.addChoice("Yes", true);
			Question q8 = new Question("David", Round.SECOND_ROUND, "Example SECOND round question number 3");
			q8.addChoice("No1", false);
			q8.addChoice("No2", false);
			q8.addChoice("No3", false);
			q8.addChoice("Yes", true);
			Question q9 = new Question("David", Round.SECOND_ROUND, "Example SECOND round question number 4");
			q9.addChoice("No1", false);
			q9.addChoice("No2", false);
			q9.addChoice("No3", false);
			q9.addChoice("Yes", true);
			Question q10 = new Question("David", Round.SECOND_ROUND, "Example SECOND round question number 5");
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
			Question q12 = new Question("David", Round.LAST_ROUND, "Example LAST round question number 2");
			q12.addChoice("No1", false);
			q12.addChoice("No2", false);
			q12.addChoice("No3", false);
			q12.addChoice("Yes", true);
			Question q13 = new Question("David", Round.LAST_ROUND, "Example LAST round question number 3");
			q13.addChoice("No1", false);
			q13.addChoice("No2", false);
			q13.addChoice("No3", false);
			q13.addChoice("Yes", true);
			Question q14 = new Question("David", Round.LAST_ROUND, "Example LAST round question number 4");
			q14.addChoice("No1", false);
			q14.addChoice("No2", false);
			q14.addChoice("No3", false);
			q14.addChoice("Yes", true);
			Question q15 = new Question("David", Round.LAST_ROUND, "Example LAST round question number 5");
			q15.addChoice("No1", false);
			q15.addChoice("No2", false);
			q15.addChoice("No3", false);
			q15.addChoice("Yes", true);
			Question q16 = new Question("Maxime", Round.FIRST_ROUND,
					"In the Mendeleev's table, which acronym stands for gold?");
			q15.addChoice("Go", false);
			q15.addChoice("Au", true);
			q15.addChoice("Gd", false);
			q15.addChoice("Or", false);
			Question q17 = new Question("Maxime", Round.SECOND_ROUND,
					"Which beach name was a real name during the Normandy landing?");
			q15.addChoice("Iron beach", false);
			q15.addChoice("Yumaha beach", false);
			q15.addChoice("Gold beach", true);
			q15.addChoice("Silver beach", false);
			Question q18 = new Question("Maxime", Round.LAST_ROUND, "What’s the old name of Taiwan?");
			q15.addChoice("Taïti", false);
			q15.addChoice("Aqcuera", false);
			q15.addChoice("Tortuga", false);
			q15.addChoice("Formosa", true);
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
			deck.addQuestion(q16);
			deck.addQuestion(q17);
			deck.addQuestion(q18);
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

			// Style for panes
			URL urlBackGround = getClass().getResource("/backgroundMenu.jpg");
			String backgroundStyle = "-fx-background-image: url(" + urlBackGround.toString() + ");\r\n"
					+ "	-fx-background-size: cover;\r\n" + "    -fx-background-repeat: stretch;\r\n"
					+ "    -fx-background-position: center center;\r\n"
					+ "    -fx-effect: dropshadow(three-pass-box, black, 30.0, 0.5, 0.0, 0.0); ";

			welM.setStyle(backgroundStyle);
			gameView.setStyle(backgroundStyle);

			// Setting welM as ROOT
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