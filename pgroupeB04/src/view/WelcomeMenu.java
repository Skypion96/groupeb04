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
		
		AnchorPane.setTopAnchor(btnPlay, 300.);
		AnchorPane.setLeftAnchor(btnPlay, 40.);
		
		AnchorPane.setTopAnchor(btnRules, 450.);
		AnchorPane.setLeftAnchor(btnRules, 40.);
		
		AnchorPane.setTopAnchor(btnHighScore, 580.);
		AnchorPane.setLeftAnchor(btnHighScore, 40.);
		
		AnchorPane.setTopAnchor(btnExit, 710.);
		AnchorPane.setLeftAnchor(btnExit, 40.);
	}

	public Button getBtnPlay() {
		if(btnPlay==null) {
			btnPlay = new Button("Play");
			btnPlay.setMinHeight(120.);
			btnPlay.setMaxHeight(120.);
			btnPlay.setMinWidth(400.);
			btnPlay.setMaxWidth(400.);
			btnPlay.setId("btnPlay");
		}
		return btnPlay;
	}

	public Button getBtnRules() {
		if(btnRules==null) {
			btnRules = new Button("Rules");
			btnRules.setMinHeight(100.);
			btnRules.setMaxHeight(100.);
			btnRules.setMinWidth(300.);
			btnRules.setMaxWidth(300.);
			btnRules.setId("btnRules");
		}
		return btnRules;
	}

	public Button getBtnHighScore() {
		if(btnHighScore==null) {
			btnHighScore = new Button("High Scores");
			btnHighScore.setMinHeight(100.);
			btnHighScore.setMaxHeight(100.);
			btnHighScore.setMinWidth(300.);
			btnHighScore.setMaxWidth(300.);
			btnHighScore.setId("btnHighScore");
		}
		return btnHighScore;
	}

	public Button getBtnExit() {
		if(btnExit==null) {
			btnExit = new Button("Exit");
			btnExit.setMinHeight(100.);
			btnExit.setMaxHeight(100.);
			btnExit.setMinWidth(300.);
			btnExit.setMaxWidth(300.);
			btnExit.setId("btnExit");
		}
		return btnExit;
	}
	
	

}
