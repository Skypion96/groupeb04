package view;



import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class WelcomeMenu extends AnchorPane{
	
	private Button btnPlay;
	private Button btnRules;
	private Button btnHighScore;
	private Button btnExit;
	
	public WelcomeMenu() {
		this.setPadding(new Insets(10));
		this.getChildren().addAll(getBtnPlay(), getBtnRules(), getBtnHighScore(), getBtnExit());
		
		AnchorPane.setTopAnchor(btnPlay, 30.);
		AnchorPane.setLeftAnchor(btnPlay, 10.);
		
		AnchorPane.setTopAnchor(btnRules, 80.);
		AnchorPane.setLeftAnchor(btnRules, 10.);
		
		AnchorPane.setTopAnchor(btnHighScore, 130.);
		AnchorPane.setLeftAnchor(btnHighScore, 10.);
		
		AnchorPane.setTopAnchor(btnExit, 180.);
		AnchorPane.setLeftAnchor(btnExit, 10.);
	}

	public Button getBtnPlay() {
		if(btnPlay==null) {
			btnPlay = new Button("Play");
			btnPlay.setMinHeight(50.);
		}
		return btnPlay;
	}

	public Button getBtnRules() {
		if(btnRules==null) {
			btnRules = new Button("Rules");
		}
		return btnRules;
	}

	public Button getBtnHighScore() {
		if(btnHighScore==null) {
			btnHighScore = new Button("High Scores");
		}
		return btnHighScore;
	}

	public Button getBtnExit() {
		if(btnExit==null) {
			btnExit = new Button("Exit");
		}
		return btnExit;
	}
	
	

}
