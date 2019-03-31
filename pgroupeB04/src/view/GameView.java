package view;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import application.MainApp;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.css.PseudoClass;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import model.Game;
import model.J5050Strategy;
import model.JCallStrategy;
import model.JAudienceStrategy;
import model.Levels;

public class GameView extends AnchorPane {

	private Integer timeLeft;

	private boolean canSelect;

	private Label lblStatement;

	private Label lblPublic1;
	private Label lblPublic2;
	private Label lblPublic3;
	private Label lblPublic4;

	private Button j5050;
	private Button jAudience;
	private Button jCall;

	private Button btnChoice1;
	private Button btnChoice2;
	private Button btnChoice3;
	private Button btnChoice4;

	private List<Button> buttonList = new ArrayList<Button>();
	private List<Label> lblLevelsList = new ArrayList<Label>();

	private VBox vbLevels;

	private Game game;

	private HBox HJPublic;

	private Label lblCall;

	private Label lblTimer;

	private List<Levels> levelsList;

	private PseudoClass current = PseudoClass.getPseudoClass("current-level");

	private String actualWinnings;
	private String anchorWinnings;

	private Button btnLeave;

	private Timeline tlTimer;

	public GameView() {
		this.setPadding(new Insets(10));
		this.getChildren().addAll(getLblStatement(), getBtnChoice1(), getBtnChoice2(), getBtnChoice3(), getBtnChoice4(),
				getVbLevels(), getJ5050(), getJCall(), getJAudience(), getHJPublic(), getLblCall(), getBtnLeave(),
				getLblTimer());

		buttonList.addAll(Arrays.asList(btnChoice1, btnChoice2, btnChoice3, btnChoice4));

		getHJPublic().setVisible(false);

		AnchorPane.setTopAnchor(getLblStatement(), MainApp.getScreenHeight() * 0.45);
		AnchorPane.setLeftAnchor(getLblStatement(), MainApp.getScreenWidth() * 0.1);
		AnchorPane.setRightAnchor(getLblStatement(), MainApp.getScreenWidth() * 0.1);

		AnchorPane.setBottomAnchor(getBtnChoice1(), MainApp.getScreenHeight() * 0.3);
		AnchorPane.setLeftAnchor(getBtnChoice1(), MainApp.getScreenWidth() * 0.15);
		AnchorPane.setRightAnchor(getBtnChoice1(), MainApp.getScreenWidth() * 0.51);

		AnchorPane.setBottomAnchor(getBtnChoice2(), MainApp.getScreenHeight() * 0.3);
		AnchorPane.setRightAnchor(getBtnChoice2(), MainApp.getScreenWidth() * 0.15);
		AnchorPane.setLeftAnchor(getBtnChoice2(), MainApp.getScreenWidth() * 0.51);

		AnchorPane.setBottomAnchor(getBtnChoice3(), MainApp.getScreenHeight() * 0.15);
		AnchorPane.setLeftAnchor(getBtnChoice3(), MainApp.getScreenWidth() * 0.15);
		AnchorPane.setRightAnchor(getBtnChoice3(), MainApp.getScreenWidth() * 0.51);

		AnchorPane.setBottomAnchor(getBtnChoice4(), MainApp.getScreenHeight() * 0.15);
		AnchorPane.setRightAnchor(getBtnChoice4(), MainApp.getScreenWidth() * 0.15);
		AnchorPane.setLeftAnchor(getBtnChoice4(), MainApp.getScreenWidth() * 0.51);

		getVbLevels().setSpacing(10);

		AnchorPane.setTopAnchor(getVbLevels(), 0.);
		AnchorPane.setRightAnchor(getVbLevels(), 0.);

		AnchorPane.setTopAnchor(getJ5050(), MainApp.getScreenHeight() * 0.02);
		AnchorPane.setLeftAnchor(getJ5050(), MainApp.getScreenWidth() * 0.02);

		AnchorPane.setTopAnchor(getJCall(), MainApp.getScreenHeight() * 0.02);
		AnchorPane.setLeftAnchor(getJCall(), MainApp.getScreenWidth() * 0.08);

		AnchorPane.setTopAnchor(getJAudience(), MainApp.getScreenHeight() * 0.02);
		AnchorPane.setLeftAnchor(getJAudience(), MainApp.getScreenWidth() * 0.14);

		AnchorPane.setBottomAnchor(getBtnLeave(), MainApp.getScreenHeight() * 0.02);
		AnchorPane.setRightAnchor(getBtnLeave(), MainApp.getScreenWidth() * 0.02);

		// TODO A mettre en forme
		AnchorPane.setTopAnchor(getHJPublic(), 100.0);
		AnchorPane.setLeftAnchor(getHJPublic(), 200.0);

		AnchorPane.setTopAnchor(getLblCall(), 100.0);
		AnchorPane.setLeftAnchor(getLblCall(), 200.0);

		AnchorPane.setTopAnchor(getLblTimer(), MainApp.getScreenHeight() * 0.3);
		AnchorPane.setLeftAnchor(getLblTimer(), MainApp.getScreenWidth() * 0.5);

	}

	// Getter for the label with the statement of the current question
	public Label getLblStatement() {
		if (lblStatement == null) {
			lblStatement = new Label();
			lblStatement.setId("lblStatement");
			lblStatement.setMinWidth(1300);
			lblStatement.setMinHeight(120);
		}
		return lblStatement;
	}

	// All individual button getters
	public Button getBtnChoice1() {
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

	public Button getBtnChoice2() {
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

	public Button getBtnChoice3() {
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

	public Button getBtnChoice4() {
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
	public List<Button> getButtonList() {
		return buttonList;
	}

	// Pseudoclasses used for the CSS
	PseudoClass common = PseudoClass.getPseudoClass("common-level");
	PseudoClass anchor = PseudoClass.getPseudoClass("anchor-level");

	// Getter for the levels list, used to iterate easier between the 15 levels
	public List<Label> getLblLevelsList() {
		return lblLevelsList;
	}

	// Getters for the VBox used to make the winning tree int the top right of the
	// screen
	public VBox getVbLevels() {
		if (vbLevels == null) {
			vbLevels = new VBox();
			vbLevels.setId("vbLevels");
			vbLevels.setMinWidth(150.);

			levelsList = new ArrayList<>();
			levelsList.addAll(Arrays.asList(Levels.values()));
			for (int i = 0; i < 15; i++) {
				lblLevelsList.add(new Label(levelsList.get(i).toString()));
				if ((i != 14) && ((15 - i) % 5 == 0)) {
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
	public void newGame() {
		game = new Game();
		game.newQuestion();
		showQuestion(game.getCurrentQuestionNumber());
		for (int i = 1; i <= 15; i++) {
			getLblLevelsList().get(15 - i).pseudoClassStateChanged(current, false);
		}
		getLblLevelsList().get(14).pseudoClassStateChanged(current, true);

		getBtnChoice1().setDisable(false);
		getBtnChoice2().setDisable(false);
		getBtnChoice3().setDisable(false);
		getBtnChoice4().setDisable(false);
		getHJPublic().setVisible(false);
		getLblCall().setVisible(false);

		getJ5050().setDisable(false);
		getJCall().setDisable(false);
		getJAudience().setDisable(false);

		canSelect = true;
		actualWinnings = "0€";
		anchorWinnings = "0€";
		setTimer();
		tlTimer.play();
	}

	// Getter for the current game
	public Game getGame() {
		return game;
	}

	// Action when clicking a button then tests if it is the correct answer
	// Setting the background of the chosen answer orange for the "suspense"
	public void buttonClick(int n) {
		if (canSelect) {
			tlTimer.stop();
			canSelect = false;
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

	}

	// Setting the background of the chosen answer blinking green as it is the
	// correct answer
	public void correctChoice(int n) {
		Timeline correct = new Timeline(

				new KeyFrame(Duration.seconds(0.2), e -> {
					// use "flash" color
					buttonList.get(n).setStyle("-fx-background-color:#008000");
				}),

				new KeyFrame(Duration.seconds(0.4), e -> {
					// revert to regular color
					buttonList.get(n).setStyle("-fx-background-color: #9800AA;");
				}));

		actualWinnings = levelsList.get(15 - game.getCurrentQuestionNumber()).getValue();
		if (game.getCurrentQuestionNumber() % 5 == 0) {
			anchorWinnings = levelsList.get(15 - game.getCurrentQuestionNumber()).getValue();
		}

		correct.setCycleCount(10);
		correct.play();

		if (game.getCurrentQuestionNumber() == 15) {
			correct.setOnFinished(e -> {
				MainApp.getScv().setWinnings(actualWinnings);
				MainApp.showScoreView();
			});

		}

		else {
			correct.setOnFinished(e -> {
				game.newQuestion();
				showQuestion(game.getCurrentQuestionNumber());
				canSelect = true;
				setTimer();
				tlTimer.play();

				getBtnChoice1().setDisable(false);
				getBtnChoice2().setDisable(false);
				getBtnChoice3().setDisable(false);
				getBtnChoice4().setDisable(false);
				getHJPublic().setVisible(false);
				getLblCall().setVisible(false);
			});
		}
	}

	// Setting the background of the chosen answer red as it is a wrong answer
	public void wrongChoice(int n) {
		int correctIndex = game.getCorrectAnswer();
		Timeline incorrect = new Timeline(

				new KeyFrame(Duration.seconds(0.01), e -> {
					// use "flash" color
					buttonList.get(n).setStyle("-fx-background-color:red");
				})

		);

		Timeline correct = new Timeline(

				new KeyFrame(Duration.seconds(0.2), e -> {
					// use "flash" color
					buttonList.get(correctIndex).setStyle("-fx-background-color:#008000");
				}),

				new KeyFrame(Duration.seconds(0.4), e -> {
					// revert to regular color
					buttonList.get(correctIndex).setStyle("-fx-background-color: #9800AA;");
				}));

		MainApp.getScv().setWinnings(anchorWinnings);

		incorrect.setCycleCount(1);
		incorrect.play();

		correct.setCycleCount(10);
		correct.play();
		correct.setOnFinished(e -> MainApp.showScoreView());
	}

	// Jokers

	public Button getJ5050() {
		if (j5050 == null) {
			j5050 = new Button();
			URL urlJ5050 = getClass().getResource("/50_50.png");
			String j5050Style = "-fx-background-image: url(" + urlJ5050.toString() + ");\r\n"
					+ "	-fx-background-size: cover;\r\n" + "    -fx-background-repeat: stretch;\r\n"
					+ "    -fx-background-position: center center;\r\n" + " -fx-background-color : transparent;";

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
					for (int i = 0; i < use.size(); i++) {
						if (getBtnChoice1().getText() == use.get(i)) {
							getBtnChoice1().setText("");
							getBtnChoice1().setDisable(true);
						} else if (getBtnChoice2().getText() == use.get(i)) {
							getBtnChoice2().setText("");
							getBtnChoice2().setDisable(true);
						} else if (getBtnChoice3().getText() == use.get(i)) {
							getBtnChoice3().setText("");
							getBtnChoice3().setDisable(true);
						} else if (getBtnChoice4().getText() == use.get(i)) {
							getBtnChoice4().setText("");
							getBtnChoice4().setDisable(true);
						}
						if (i > 1) {
							break;
						}
					}
					getJ5050().setDisable(true);
				}

			});
		}
		return j5050;
	}

	public Button getJAudience() {
		if (jAudience == null) {
			jAudience = new Button();
			URL urlJPublic = getClass().getResource("/public.png");
			String jPublicStyle = "-fx-background-image: url(" + urlJPublic.toString() + ");\r\n"
					+ "	-fx-background-size: cover;\r\n" + "    -fx-background-repeat: stretch;\r\n"
					+ "    -fx-background-position: center center;\r\n" + " -fx-background-color : transparent;";

			jAudience.setStyle(jPublicStyle);
			jAudience.setScaleX(2.5);
			jAudience.setScaleY(2.5);
			jAudience.setMinWidth(32.5);
			jAudience.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					game.setStrategy(new JAudienceStrategy());
					List<Integer> vote = new ArrayList<>();
					int indexCorrect = game.getCorrectAnswer();
					game.useJoker();
					vote = game.getRandomJoker();
					
					if (indexCorrect == 0) {
						getHJPublic().setVisible(true);
						getLblAudience1().setText(" A : " + vote.get(0) + "%");
						getLblAudience2().setText(" B : " + vote.get(1) + "%");
						getLblAudience3().setText(" C : " + vote.get(2) + "%");
						getLblAudience4().setText(" D : " + vote.get(3) + "%");
					} else if (indexCorrect == 1) {
						getHJPublic().setVisible(true);
						getLblAudience2().setText(" B : " + vote.get(0) + "%");
						getLblAudience1().setText(" A : " + vote.get(1) + "%");
						getLblAudience3().setText(" C : " + vote.get(2) + "%");
						getLblAudience4().setText(" D : " + vote.get(3) + "%");
					} else if (indexCorrect == 2) {
						getHJPublic().setVisible(true);
						getLblAudience3().setText(" C : " + vote.get(0) + "%");
						getLblAudience2().setText(" B : " + vote.get(1) + "%");
						getLblAudience1().setText(" A : " + vote.get(2) + "%");
						getLblAudience4().setText(" D : " + vote.get(3) + "%");
					} else if (indexCorrect == 3) {
						getHJPublic().setVisible(true);
						getLblAudience4().setText(" D : " + vote.get(0) + "%");
						getLblAudience2().setText(" B : " + vote.get(1) + "%");
						getLblAudience3().setText(" C : " + vote.get(2) + "%");
						getLblAudience1().setText(" A : " + vote.get(3) + "%");
					}
					jAudience.setDisable(true);
					getHJPublic().setVisible(true);
					getLblCall().setVisible(false);
				}
			});
		}
		return jAudience;
	}

	public Button getJCall() {
		if (jCall == null) {
			jCall = new Button();
			URL urlJCall = getClass().getResource("/call.png");
			String jCallStyle = "-fx-background-image: url(" + urlJCall.toString() + ");\r\n"
					+ "	-fx-background-size: cover;\r\n" + "    -fx-background-repeat: stretch;\r\n"
					+ "    -fx-background-position: center center;\r\n" + " -fx-background-color : transparent;";

			jCall.setStyle(jCallStyle);
			jCall.setScaleX(2.5);
			jCall.setScaleY(2.5);
			jCall.setMinWidth(32.5);
			jCall.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					game.setStrategy(new JCallStrategy());
					getGame().useJoker();
					getLblCall().setVisible(true);
					List<String> answers = new ArrayList<>();
					answers = getGame().getCurrentAnswers();
					int correct = getGame().getCorrectAnswer();

					String lblTxt = getGame().getrCall();
					if (lblTxt == "I really don't know the answer. Sorry.") {
						getLblCall().setText(lblTxt);
					} else if (lblTxt == "I'm not sure but i think it's ") {
						Random rand = new Random();
						int ind = rand.nextInt(3 - 0 + 1);
						getLblCall().setText(lblTxt + answers.get(ind));
					} else if (lblTxt == "I'm sure that the answer is ") {
						getLblCall().setText(lblTxt + answers.get(correct));
					}
					jCall.setDisable(true);
					getHJPublic().setVisible(false);
					getLblCall().setVisible(true);
				}
			});
		}
		return jCall;
	}

	public Label getLblAudience1() {
		if (lblPublic1 == null) {
			lblPublic1 = new Label();
			lblPublic1.setId("Jpublic");
		}
		return lblPublic1;
	}

	public Label getLblAudience2() {
		if (lblPublic2 == null) {
			lblPublic2 = new Label();
			lblPublic2.setId("Jpublic");
		}
		return lblPublic2;
	}

	public Label getLblAudience3() {
		if (lblPublic3 == null) {
			lblPublic3 = new Label();
			lblPublic3.setId("Jpublic");
		}
		return lblPublic3;
	}

	public Label getLblAudience4() {
		if (lblPublic4 == null) {
			lblPublic4 = new Label();
			lblPublic4.setId("Jpublic");
		}
		return lblPublic4;
	}

	public HBox getHJPublic() {
		if (HJPublic == null) {
			HJPublic = new HBox();
			HJPublic.getChildren().addAll(getLblAudience1(), getLblAudience2(), getLblAudience3(), getLblAudience4());
		}
		return HJPublic;
	}

	public Label getLblCall() {
		if (lblCall == null) {
			lblCall = new Label();
			lblCall.setId("Jcall");
		}
		return lblCall;
	}

	// Showing the question's statement and choices on screen + colours
	public void showQuestion(int currentQuestionNumber) {
		getLblStatement().setText(game.showStatement());

		for (int i = 0; i <= 3; i++) {
			getButtonList().get(i).setText(game.showAnswer(i));
			getButtonList().get(i).setStyle("-fx-background-color: #9800AA;");
		}

		// Showing the tree that shows where the player is
		if (currentQuestionNumber != 1) {
			getLblLevelsList().get(16 - currentQuestionNumber).pseudoClassStateChanged(current, false);
		}

		getLblLevelsList().get(15 - currentQuestionNumber).pseudoClassStateChanged(current, true);
	}

	public Button getBtnLeave() {
		if (btnLeave == null) {
			btnLeave = new Button("Leave with winnings");
			btnLeave.setMinHeight(100.);
			btnLeave.setMaxHeight(120.);
			btnLeave.setMinWidth(300.);
			btnLeave.setMaxWidth(300.);
			btnLeave.setId("btnExitGV");
			btnLeave.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					if(canSelect) {
						tlTimer.stop();
						MainApp.getScv().setWinnings(actualWinnings);
						MainApp.showScoreView();
					}	
				}
			});
		}
		return btnLeave;
	}

	public Label getLblTimer() {
		if (lblTimer == null) {
			lblTimer = new Label();
			lblTimer.setId("lblTimer");
		}
		return lblTimer;
	}

	public void setTimer() {
		timeLeft = 30;

		tlTimer = new Timeline(

				new KeyFrame(Duration.seconds(1), e -> {
					lblTimer.setText(timeLeft.toString());
					timeLeft--;
				}));

		tlTimer.setCycleCount(31);
		tlTimer.setOnFinished(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				canSelect = false;
				Timeline correct = new Timeline(

						new KeyFrame(Duration.seconds(0.2), e -> {
							// use "flash" color
							buttonList.get(game.getCorrectAnswer()).setStyle("-fx-background-color:#008000");
						}),

						new KeyFrame(Duration.seconds(0.4), e -> {
							// revert to regular color
							buttonList.get(game.getCorrectAnswer()).setStyle("-fx-background-color: #9800AA;");
						}));

				MainApp.getScv().setWinnings(anchorWinnings);

				correct.setCycleCount(10);
				correct.play();
				correct.setOnFinished(e -> MainApp.showScoreView());

			}
		});
	}

}