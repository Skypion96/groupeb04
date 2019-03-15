package view;

import java.util.ArrayList;

import application.MainApp;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.util.Duration;
import model.Game;

public class GameView extends AnchorPane {

	private static Label lblStatement;

	private static Button btnChoice1;
	private static Button btnChoice2;
	private static Button btnChoice3;
	private static Button btnChoice4;
	
	private static ArrayList<Button> buttonList = new ArrayList<Button>();

	private Label money;

	private static Game game;
	
	public GameView() {
		this.setPadding(new Insets(10));
		this.getChildren().addAll(getLblStatement(), getBtnChoice1(), getBtnChoice2(), getBtnChoice3(), getBtnChoice4(),
				getMoney());
		
		buttonList.add(btnChoice1);
		buttonList.add(btnChoice2);
		buttonList.add(btnChoice3);
		buttonList.add(btnChoice4);

		AnchorPane.setTopAnchor(getLblStatement(), 500.0);
		AnchorPane.setLeftAnchor(getLblStatement(), 610.0);

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

	}

	public static Label getLblStatement() {
		if (lblStatement == null) {
			lblStatement = new Label();
			lblStatement.setId("lblStatement");
			lblStatement.setMinWidth(700);
			lblStatement.setMinHeight(120);
		}
		return lblStatement;
	}

	public static Button getBtnChoice1() {
		if (btnChoice1 == null) {
			btnChoice1 = new Button();
			btnChoice1.setId("btnChoice1");
			btnChoice1.setMinWidth(350);
			btnChoice1.setMinHeight(100);
			btnChoice1.setMaxWidth(350);
			btnChoice1.setMaxHeight(100);
			
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
			btnChoice2.setMinWidth(350);
			btnChoice2.setMinHeight(100);
			btnChoice2.setMaxWidth(350);
			btnChoice2.setMaxHeight(100);
			
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
			btnChoice3.setMinWidth(350);
			btnChoice3.setMinHeight(100);
			btnChoice3.setMaxWidth(350);
			btnChoice3.setMaxHeight(100);
			
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
			btnChoice4.setMinWidth(350);
			btnChoice4.setMinHeight(100);
			btnChoice4.setMaxWidth(350);
			btnChoice4.setMaxHeight(100);
			
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