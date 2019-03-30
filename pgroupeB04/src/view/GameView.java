package view;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import application.MainApp;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.css.PseudoClass;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import model.Game;
import model.J5050Strategy;
import model.JPublicStrategy;
import model.Levels;

public class GameView extends AnchorPane {

	private static Label lblStatement;
	private Label lblLevel1;
	private Label lblLevel2;
	private Label lblLevel3;
	private Label lblLevel4;
	private Label lblLevel5;
	private Label lblLevel6;
	private Label lblLevel7;
	private Label lblLevel8;
	private Label lblLevel9;
	private Label lblLevel10;
	private Label lblLevel11;
	private Label lblLevel12;
	private Label lblLevel13;
	private Label lblLevel14;
	private Label lblLevel15;
	
	private Label lblPublic1;
	private Label lblPublic2;
	private Label lblPublic3;
	private Label lblPublic4;
	
	private Button j5050;
	private Button jPublic;
	private Button jCall;

	private static Button btnChoice1;
	private static Button btnChoice2;
	private static Button btnChoice3;
	private static Button btnChoice4;

	private static List<Button> buttonList = new ArrayList<Button>();
	private static List<Label> lblLevelsList = new ArrayList<Label>();

	private VBox vbLevels;

	private static Game game;

	public GameView() {
		this.setPadding(new Insets(10));
		this.getChildren().addAll(getLblStatement(), getBtnChoice1(), getBtnChoice2(), getBtnChoice3(), getBtnChoice4(),
				getVbLevels(),getJ5050(),getJCall(),getJPublic());

		buttonList.addAll(Arrays.asList(btnChoice1, btnChoice2, btnChoice3, btnChoice4));

		/*
		 * lblLevelsList.addAll(Arrays.asList(getLblLevel15(), getLblLevel14(),
		 * getLblLevel13(), getLblLevel12(), getLblLevel11(), getLblLevel10(),
		 * getLblLevel9(), getLblLevel8(), getLblLevel7(), getLblLevel6(),
		 * getLblLevel5(), getLblLevel4(), getLblLevel3(), getLblLevel2(),
		 * getLblLevel1()));
		 */

		AnchorPane.setTopAnchor(getLblStatement(), 500.0);
		AnchorPane.setLeftAnchor(getLblStatement(), 310.0);

		AnchorPane.setBottomAnchor(getBtnChoice1(), 300.0);
		AnchorPane.setLeftAnchor(getBtnChoice1(), 350.0);

		AnchorPane.setBottomAnchor(getBtnChoice2(), 300.0);
		AnchorPane.setRightAnchor(getBtnChoice2(), 350.0);

		AnchorPane.setBottomAnchor(getBtnChoice3(), 150.0);
		AnchorPane.setLeftAnchor(getBtnChoice3(), 350.0);

		AnchorPane.setBottomAnchor(getBtnChoice4(), 150.0);
		AnchorPane.setRightAnchor(getBtnChoice4(), 350.0);

		// getVbLevels().getChildren().addAll(getLblLevelsList());
		getVbLevels().setSpacing(10);
		AnchorPane.setTopAnchor(getVbLevels(), 0.);
		AnchorPane.setRightAnchor(getVbLevels(), 0.);
		
		AnchorPane.setTopAnchor(getJ5050(), 30.0);
		AnchorPane.setLeftAnchor(getJ5050(), 50.0);
		
		AnchorPane.setTopAnchor(getJCall(), 30.0);
		AnchorPane.setLeftAnchor(getJCall(), 140.0);
		
		
		AnchorPane.setTopAnchor(getJPublic(), 30.0);
		AnchorPane.setLeftAnchor(getJPublic(), 230.0);
		
	}

	// Getter for the label with the statement of the current question
	public static Label getLblStatement() {
		if (lblStatement == null) {
			lblStatement = new Label();
			lblStatement.setId("lblStatement");
			lblStatement.setMinWidth(1300);
			lblStatement.setMinHeight(120);
		}
		return lblStatement;
	}

	// All individual button getters
	public static Button getBtnChoice1() {
		if (btnChoice1 == null) {
			btnChoice1 = new Button();
			btnChoice1.setId("btnChoice1");
			btnChoice1.setMinWidth(500);
			btnChoice1.setMinHeight(100);

			btnChoice1.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					buttonClick(0);
				}
			});
		}
		return btnChoice1;
	}

	public static Button getBtnChoice2() {
		if (btnChoice2 == null) {
			btnChoice2 = new Button();
			btnChoice2.setId("btnChoice2");
			btnChoice2.setMinWidth(500);
			btnChoice2.setMinHeight(100);

			btnChoice2.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					buttonClick(1);
				}
			});
		}
		return btnChoice2;
	}

	public static Button getBtnChoice3() {
		if (btnChoice3 == null) {
			btnChoice3 = new Button();
			btnChoice3.setId("btnChoice3");
			btnChoice3.setMinWidth(500);
			btnChoice3.setMinHeight(100);

			btnChoice3.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					buttonClick(2);
				}
			});

		}
		return btnChoice3;
	}

	public static Button getBtnChoice4() {
		if (btnChoice4 == null) {
			btnChoice4 = new Button();
			btnChoice4.setId("btnChoice4");
			btnChoice4.setMinWidth(500);
			btnChoice4.setMinHeight(100);

			btnChoice4.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					buttonClick(3);
				}
			});

		}
		return btnChoice4;
	}

	// Getter for the button list, used to iterate easier between the answer buttons
	public static List<Button> getButtonList() {
		return buttonList;
	}

	// Pseudoclasses used for the CSS
	PseudoClass common = PseudoClass.getPseudoClass("common-level");
	PseudoClass anchor = PseudoClass.getPseudoClass("anchor-level");

	// All individuals level getters
	public Label getLblLevel1() {
		if (lblLevel1 == null) {
			lblLevel1 = new Label("1 -                     200 €");
			lblLevel1.pseudoClassStateChanged(common, true);
		}
		return lblLevel1;
	}

	public Label getLblLevel2() {
		if (lblLevel2 == null) {
			lblLevel2 = new Label("2 -                     300 €");
			lblLevel2.pseudoClassStateChanged(common, true);
		}
		return lblLevel2;
	}

	public Label getLblLevel3() {
		if (lblLevel3 == null) {
			lblLevel3 = new Label("3 -                     500 €");
			lblLevel3.pseudoClassStateChanged(common, true);
		}
		return lblLevel3;
	}

	public Label getLblLevel4() {
		if (lblLevel4 == null) {
			lblLevel4 = new Label("4 -                     800 €");
			lblLevel4.pseudoClassStateChanged(common, true);
		}
		return lblLevel4;
	}

	public Label getLblLevel5() {
		if (lblLevel5 == null) {
			lblLevel5 = new Label("5 -                  1 500 €");
			lblLevel5.pseudoClassStateChanged(anchor, true);
		}
		return lblLevel5;
	}

	public Label getLblLevel6() {
		if (lblLevel6 == null) {
			lblLevel6 = new Label("6 -                  3 000 €");
			lblLevel6.pseudoClassStateChanged(common, true);
		}
		return lblLevel6;
	}

	public Label getLblLevel7() {
		if (lblLevel7 == null) {
			lblLevel7 = new Label("7 -                  6 000 €");
			lblLevel7.pseudoClassStateChanged(common, true);
		}
		return lblLevel7;
	}

	public Label getLblLevel8() {
		if (lblLevel8 == null) {
			lblLevel8 = new Label("8 -                12 000 €");
			lblLevel8.pseudoClassStateChanged(common, true);
		}
		return lblLevel8;
	}

	public Label getLblLevel9() {
		if (lblLevel9 == null) {
			lblLevel9 = new Label("9 -                24 000 €");
			lblLevel9.pseudoClassStateChanged(common, true);
		}
		return lblLevel9;
	}

	public Label getLblLevel10() {
		if (lblLevel10 == null) {
			lblLevel10 = new Label("10 -              48 000 €");
			lblLevel10.pseudoClassStateChanged(anchor, true);
		}
		return lblLevel10;
	}

	public Label getLblLevel11() {
		if (lblLevel11 == null) {
			lblLevel11 = new Label("11 -              72 000 €");
			lblLevel11.pseudoClassStateChanged(common, true);
		}
		return lblLevel11;
	}

	public Label getLblLevel12() {
		if (lblLevel12 == null) {
			lblLevel12 = new Label("12 -            100 000 €");
			lblLevel12.pseudoClassStateChanged(common, true);
		}
		return lblLevel12;
	}

	public Label getLblLevel13() {
		if (lblLevel13 == null) {
			lblLevel13 = new Label("13 -            150 000 €");
			lblLevel13.pseudoClassStateChanged(common, true);
		}
		return lblLevel13;
	}

	public Label getLblLevel14() {
		if (lblLevel14 == null) {
			lblLevel14 = new Label("14 -            300 000 €");
			lblLevel14.pseudoClassStateChanged(common, true);
		}
		return lblLevel14;
	}

	public Label getLblLevel15() {
		if (lblLevel15 == null) {
			lblLevel15 = new Label("15 -         1 000 000 €");
			lblLevel15.pseudoClassStateChanged(anchor, true);
		}
		return lblLevel15;
	}

	// Getter for the levels list, used to iterate easier between the 15 levels
	public static List<Label> getLblLevelsList() {
		return lblLevelsList;
	}

	// Getters for the VBox used to make the winning tree int the top right of the
	// screen
	public VBox getVbLevels() {
		if (vbLevels == null) {
			vbLevels = new VBox();
			vbLevels.setId("vbLevels");
			vbLevels.setMinWidth(150.);

			List<Levels> levelsList = new ArrayList<>();
			levelsList.addAll(Arrays.asList(Levels.values()));
			for (int i = 0; i < 15; i++) {
				lblLevelsList.add(new Label(levelsList.get(i).toString()));
				if ((i != 0) && ((i + 1) % 5 == 0)) {
					lblLevelsList.get(i).pseudoClassStateChanged(anchor, true);
				} else {
					lblLevelsList.get(i).pseudoClassStateChanged(common, true);
				}
			}
			vbLevels.getChildren().addAll(lblLevelsList);
		}
		return vbLevels;
	}

	// Creates a new game
	public static void newGame() {
		game = new Game();
		GameView.getGame().newQuestion();
	}

	// Getter for the current game
	public static Game getGame() {
		getBtnChoice1().setDisable(false);
		getBtnChoice2().setDisable(false);
		getBtnChoice3().setDisable(false);
		getBtnChoice4().setDisable(false);
		return game;
	}

	// Action when clicking a button then tests if it is the correct answer
	// Setting the background of the chosen answer orange for the "suspense"
	public static void buttonClick(int n) {
		Timeline orange = new Timeline(

				new KeyFrame(Duration.seconds(0.01), e -> {
					// use "flash" color
					buttonList.get(n).setStyle("-fx-background-color:#FF8C00");
				}),

				new KeyFrame(Duration.seconds(3), e -> {
					// wait
				})

		);
		orange.setCycleCount(1);
		orange.play();

		if (game.isAnswerCorrect(n)) {
			orange.setOnFinished(e -> correctChoice(n));
		} else {
			orange.setOnFinished(e -> wrongChoice(n));
		}

	}

	// Setting the background of the chosen answer blinking green as it is the
	// correct answer
	public static void correctChoice(int n) {
		Timeline correct = new Timeline(

				new KeyFrame(Duration.seconds(0.1), e -> {
					// use "flash" color
					buttonList.get(n).setStyle("-fx-background-color:#008000");
				}),

				new KeyFrame(Duration.seconds(0.2), e -> {
					// revert to regular color
					buttonList.get(n).setStyle("-fx-background-color: #9800AA;");
				}));
		correct.setCycleCount(20);
		correct.play();

		correct.setOnFinished(e -> game.newQuestion());

	}

	// Setting the background of the chosen answer red as it is a wrong answer
	public static void wrongChoice(int n) {
		int correctIndex = game.getCorrectAnswer();
		Timeline incorrect = new Timeline(

				new KeyFrame(Duration.seconds(0.01), e -> {
					// use "flash" color
					buttonList.get(n).setStyle("-fx-background-color:red");
				})

		);

		Timeline correct = new Timeline(

				new KeyFrame(Duration.seconds(0.1), e -> {
					// use "flash" color
					buttonList.get(correctIndex).setStyle("-fx-background-color:#008000");
				}),

				new KeyFrame(Duration.seconds(0.2), e -> {
					// revert to regular color
					buttonList.get(correctIndex).setStyle("-fx-background-color: #9800AA;");
				}));

		incorrect.setCycleCount(1);
		incorrect.play();

		correct.setCycleCount(20);
		correct.play();
		correct.setOnFinished(e -> MainApp.shwowWelcome());
	}

	//Jokers
	
	public Button getJ5050() {
		if (j5050 == null) {
			j5050=new Button();
			URL urlJ5050 = getClass().getResource("/50_50.png");
			String j5050Style = "-fx-background-image: url(" + urlJ5050.toString() + ");\r\n"
					+ "	-fx-background-size: cover;\r\n" + "    -fx-background-repeat: stretch;\r\n"
					+ "    -fx-background-position: center center;\r\n"
					+ " -fx-background-color : transparent;";
					
			j5050.setStyle(j5050Style);
			j5050.setScaleX(2.5);
			j5050.setScaleY(2.5);
			j5050.setMinWidth(32.5);
			j5050.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					game.setStrategy(new J5050Strategy());
					
					
					List<String> use = new ArrayList<>();
					getGame().useJoker();
					use = getGame().getCurrentAnswers();
					//System.out.println(use);
					for(int i=0; i<use.size(); i++) {
						if(getBtnChoice1().getText() == use.get(i)) {
							getBtnChoice1().setText("");
							getBtnChoice1().setDisable(true);
						}
						else if(getBtnChoice2().getText() == use.get(i)) {
							getBtnChoice2().setText("");
							getBtnChoice2().setDisable(true);
						}
						else if(getBtnChoice3().getText() == use.get(i)) {
							getBtnChoice3().setText("");
							getBtnChoice3().setDisable(true);
						}
						else if(getBtnChoice4().getText() == use.get(i)){
							getBtnChoice4().setText("");
							getBtnChoice4().setDisable(true);
						}
						if(i>1) {
							break;
						}
					}
					getJ5050().setDisable(true);
				}
				
			});
		}
		return j5050;
	}

	public Button getJPublic() {
		if (jPublic == null) {
			jPublic= new Button();
			URL urlJPublic = getClass().getResource("/public.png");
			String jPublicStyle = "-fx-background-image: url(" + urlJPublic.toString() + ");\r\n"
					+ "	-fx-background-size: cover;\r\n" + "    -fx-background-repeat: stretch;\r\n"
					+ "    -fx-background-position: center center;\r\n"
					+ " -fx-background-color : transparent;";
					
			jPublic.setStyle(jPublicStyle);
			jPublic.setScaleX(2.5);
			jPublic.setScaleY(2.5);
			jPublic.setMinWidth(32.5);
			jPublic.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					game.setStrategy(new JPublicStrategy());
					List<Integer> vote = new ArrayList<>();
					List<String> answers = new ArrayList<>();
					getGame().useJoker();
					answers = getGame().getCurrentAnswers();
					int indexCorrect = game.getCorrectAnswer();
					getLblPublic1().setText(answers.get(indexCorrect)+" : ");
					
				}
			});
		}
		return jPublic;
	}

	public Button getJCall() {
		if (jCall == null) {
			jCall = new Button();
			URL urlJCall = getClass().getResource("/call.png");
			String jCallStyle = "-fx-background-image: url(" + urlJCall.toString() + ");\r\n"
					+ "	-fx-background-size: cover;\r\n" + "    -fx-background-repeat: stretch;\r\n"
					+ "    -fx-background-position: center center;\r\n"
					+ " -fx-background-color : transparent;";
					
			jCall.setStyle(jCallStyle);
			jCall.setScaleX(2.5);
			jCall.setScaleY(2.5);
			jCall.setMinWidth(32.5);
		}
		return jCall;
	}

	public Label getLblPublic1() {
		if(lblPublic1==null) {
			lblPublic1 = new Label();
		}
		return lblPublic1;
	}

	public Label getLblPublic2() {
		if(lblPublic2==null) {
			lblPublic2 = new Label();
		}
		return lblPublic2;
	}

	public Label getLblPublic3() {
		if(lblPublic3==null) {
			lblPublic3 = new Label();
		}
		return lblPublic3;
	}

	public Label getLblPublic4() {
		if(lblPublic4==null) {
			lblPublic4 = new Label();
		}
		return lblPublic4;
	}
	
	

}