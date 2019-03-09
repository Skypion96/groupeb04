package view;

import java.io.File;
import java.net.MalformedURLException;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class WelcomeMenu extends AnchorPane{
	
	private Button btnPlay;
	private Button btnRules;
	private Button btnHighScore;
	private Button btnExit;
	private ImageView logo;

	public WelcomeMenu(){
		this.setPadding(new Insets(10));
		this.getChildren().addAll(getBtnPlay(), getBtnRules(), getBtnHighScore(), getBtnExit(), getLogo());
		
		AnchorPane.setTopAnchor(btnPlay, 300.);
		AnchorPane.setLeftAnchor(btnPlay, 40.);
		
		AnchorPane.setTopAnchor(btnRules, 450.);
		AnchorPane.setLeftAnchor(btnRules, 40.);
		
		AnchorPane.setTopAnchor(btnHighScore, 580.);
		AnchorPane.setLeftAnchor(btnHighScore, 40.);
		
		AnchorPane.setTopAnchor(btnExit, 710.);
		AnchorPane.setLeftAnchor(btnExit, 40.);
		
		AnchorPane.setRightAnchor(logo, -100.);
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

	public ImageView getLogo() {
		if(logo==null) {
			File fLogo = new File("logo.png");
			String localUrl = null;
			try {
				localUrl = fLogo.toURI().toURL().toString();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Image iLogo = new Image(localUrl);
			logo = new ImageView(iLogo);
			logo.setScaleX(0.6);
			logo.setScaleY(0.6);
		}
		return logo;
	}
	
	
}
