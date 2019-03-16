package view;

import java.util.ArrayList;

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
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.util.Duration;
import model.Game;

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
	

	private static Button btnChoice1;
	private static Button btnChoice2;
	private static Button btnChoice3;
	private static Button btnChoice4;
	
	private static ArrayList<Button> buttonList = new ArrayList<Button>();
	private static ArrayList<Label> lblLevelsList = new ArrayList<Label>();
	
	private VBox vbLevels;

	private Label money;

	private static Game game;
	
	public GameView() {
		this.setPadding(new Insets(10));
		this.getChildren().addAll(getLblStatement(), getBtnChoice1(), getBtnChoice2(), getBtnChoice3(), getBtnChoice4(),
				getMoney(), getVbLevels());
		
		buttonList.add(btnChoice1);
		buttonList.add(btnChoice2);
		buttonList.add(btnChoice3);
		buttonList.add(btnChoice4);
		
		lblLevelsList.add(getLblLevel15());
		lblLevelsList.add(getLblLevel14());
		lblLevelsList.add(getLblLevel13());
		lblLevelsList.add(getLblLevel12());
		lblLevelsList.add(getLblLevel11());
		lblLevelsList.add(getLblLevel10());
		lblLevelsList.add(getLblLevel9());
		lblLevelsList.add(getLblLevel8());
		lblLevelsList.add(getLblLevel7());
		lblLevelsList.add(getLblLevel6());
		lblLevelsList.add(getLblLevel5());
		lblLevelsList.add(getLblLevel4());
		lblLevelsList.add(getLblLevel3());
		lblLevelsList.add(getLblLevel2());
		lblLevelsList.add(getLblLevel1());

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

		AnchorPane.setTopAnchor(getMoney(), 5.0);
		AnchorPane.setRightAnchor(getMoney(), 300.0);
		
		getVbLevels().getChildren().addAll(getLblLevelsList());
		getVbLevels().setSpacing(10);
		AnchorPane.setTopAnchor(getVbLevels(), 0.);
		AnchorPane.setRightAnchor(getVbLevels(), 0.);

	}

	public static Label getLblStatement() {
		if (lblStatement == null) {
			lblStatement = new Label();
			lblStatement.setId("lblStatement");
			lblStatement.setMinWidth(1300);
			lblStatement.setMinHeight(120);
		}
		return lblStatement;
	}

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
	
	public static ArrayList<Button> getButtonList(){
		return buttonList;
	}

	public Label getMoney() {
		if (money == null) {
			money = new Label("Money Win");
		}
		return money;
	}
	
	PseudoClass common = PseudoClass.getPseudoClass("common-level");
	PseudoClass anchor = PseudoClass.getPseudoClass("anchor-level");
	
	public Label getLblLevel1() {
		if(lblLevel1==null) {
			lblLevel1 = new Label("1 -                     200 €");
			lblLevel1.pseudoClassStateChanged(common, true);
		}
		return lblLevel1;
	}

	public Label getLblLevel2() {
		if(lblLevel2==null) {
			lblLevel2 = new Label("2 -                     300 €");
			lblLevel2.pseudoClassStateChanged(common, true);
		}
		return lblLevel2;
	}

	public Label getLblLevel3() {
		if(lblLevel3==null) {
			lblLevel3 = new Label("3 -                     500 €");
			lblLevel3.pseudoClassStateChanged(common, true);
		}
		return lblLevel3;
	}

	public Label getLblLevel4() {
		if(lblLevel4==null) {
			lblLevel4 = new Label("4 -                     800 €");
			lblLevel4.pseudoClassStateChanged(common, true);
		}
		return lblLevel4;
	}

	public Label getLblLevel5() {
		if(lblLevel5==null) {
			lblLevel5 = new Label("5 -                  1 500 €");
			lblLevel5.pseudoClassStateChanged(anchor, true);
		}
		return lblLevel5;
	}

	public Label getLblLevel6() {
		if(lblLevel6==null) {
			lblLevel6 = new Label("6 -                  3 000 €");
			lblLevel6.pseudoClassStateChanged(common, true);
		}
		return lblLevel6;
	}

	public Label getLblLevel7() {
		if(lblLevel7==null) {
			lblLevel7 = new Label("7 -                  6 000 €");
			lblLevel7.pseudoClassStateChanged(common, true);
		}
		return lblLevel7;
	}

	public Label getLblLevel8() {
		if(lblLevel8==null) {
			lblLevel8 = new Label("8 -                12 000 €");
			lblLevel8.pseudoClassStateChanged(common, true);
		}
		return lblLevel8;
	}

	public Label getLblLevel9() {
		if(lblLevel9==null) {
			lblLevel9 = new Label("9 -                24 000 €");
			lblLevel9.pseudoClassStateChanged(common, true);
		}
		return lblLevel9;
	}

	public Label getLblLevel10() {
		if(lblLevel10==null) {
			lblLevel10 = new Label("10 -              48 000 €");
			lblLevel10.pseudoClassStateChanged(anchor, true);
		}
		return lblLevel10;
	}

	public Label getLblLevel11() {
		if(lblLevel11==null) {
			lblLevel11 = new Label("11 -              72 000 €");
			lblLevel11.pseudoClassStateChanged(common, true);
		}
		return lblLevel11;
	}

	public Label getLblLevel12() {
		if(lblLevel12==null) {
			lblLevel12 = new Label("12 -            100 000 €");
			lblLevel12.pseudoClassStateChanged(common, true);
		}
		return lblLevel12;
	}

	public Label getLblLevel13() {
		if(lblLevel13==null) {
			lblLevel13 = new Label("13 -            150 000 €");
			lblLevel13.pseudoClassStateChanged(common, true);
		}
		return lblLevel13;
	}

	public Label getLblLevel14() {
		if(lblLevel14==null) {
			lblLevel14 = new Label("14 -            300 000 €");
			lblLevel14.pseudoClassStateChanged(common, true);
		}
		return lblLevel14;
	}

	public Label getLblLevel15() {
		if(lblLevel15==null) {
			lblLevel15 = new Label("15 -         1 000 000 €");
			lblLevel15.pseudoClassStateChanged(anchor, true);
		}
		return lblLevel15;
	}

	public static ArrayList<Label> getLblLevelsList() {
		return lblLevelsList;
	}

	public VBox getVbLevels() {
		if(vbLevels==null) {
			vbLevels = new VBox();
			vbLevels.setId("vbLevels");
			vbLevels.setMinWidth(150.);
		}
		return vbLevels;
	}

	public static void newGame() {
		game = new Game();
		GameView.getGame().newQuestion();
	}

	public static Game getGame() {
		return game;
	}
	
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
		
		if(game.isAnswerCorrect(n)) {
			orange.setOnFinished(e -> correctChoice(n));
		}
		else {
			orange.setOnFinished(e -> wrongChoice(n));
		}
		
	}
	
	public static void correctChoice(int n) {
		Timeline correct = new Timeline(

			    new KeyFrame(Duration.seconds(0.1), e -> {
			        // use "flash" color
			    	buttonList.get(n).setStyle("-fx-background-color:#008000");
			    }),

			    new KeyFrame(Duration.seconds(0.2), e -> {
			        // revert to regular color
			    	buttonList.get(n).setStyle("-fx-background-color: #9800AA;");
			    })
			);
		correct.setCycleCount(20);
		correct.play();
		
		correct.setOnFinished(e -> game.newQuestion());
		
	}
	
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
			    })
			);
		
		incorrect.setCycleCount(1);
		incorrect.play();
		
		correct.setCycleCount(20);
		correct.play();
		correct.setOnFinished(e -> MainApp.shwowWelcome());
	}

	
	
	

}