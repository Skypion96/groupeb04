package view;

import java.io.File;
import java.net.MalformedURLException;

import application.MainApp;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class WelcomeMenu extends AnchorPane {

	private Button btnPlay;
	private Button btnRules;
	private Button btnHighScore;
	private Button btnExit;
	private ImageView logo;
	private ImageView sound;

	public WelcomeMenu() {
		this.setPadding(new Insets(10));
		this.getChildren().addAll(getBtnPlay(), getBtnRules(), getBtnHighScore(), getBtnExit(), getLogo(), getSound());

		AnchorPane.setTopAnchor(btnPlay, MainApp.getSceneHeight() * 0.3);
		AnchorPane.setLeftAnchor(btnPlay, MainApp.getSceneWidth() * 0.02);

		AnchorPane.setTopAnchor(btnRules, MainApp.getSceneHeight() * 0.3 + 150.);
		AnchorPane.setLeftAnchor(btnRules, MainApp.getSceneWidth() * 0.02);

		AnchorPane.setTopAnchor(btnHighScore, MainApp.getSceneHeight() * 0.3 + 280.);
		AnchorPane.setLeftAnchor(btnHighScore, MainApp.getSceneWidth() * 0.02);

		AnchorPane.setTopAnchor(btnExit, MainApp.getSceneHeight() * 0.3 + 410.);
		AnchorPane.setLeftAnchor(btnExit, MainApp.getSceneWidth() * 0.02);

		AnchorPane.setRightAnchor(logo, MainApp.getSceneWidth() * 0.2 - 552);

		AnchorPane.setRightAnchor(sound, MainApp.getSceneWidth() * 0.02 - 240);
		AnchorPane.setBottomAnchor(sound, MainApp.getSceneHeight() * 0.02 - 310);
	}

	// Getter for the play button which creates a new game
	public Button getBtnPlay() {
		if (btnPlay == null) {
			btnPlay = new Button("Play");
			btnPlay.setMinHeight(120.);
			btnPlay.setMaxHeight(120.);
			btnPlay.setMinWidth(400.);
			btnPlay.setMaxWidth(400.);
			btnPlay.setId("btnPlay");
			btnPlay.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					MainApp.showGame();
					GameView.newGame();
				}
			});
		}
		return btnPlay;
	}

	// Getter for the rules button, not used yet
	public Button getBtnRules() {
		if (btnRules == null) {
			btnRules = new Button("Rules");
			btnRules.setMinHeight(100.);
			btnRules.setMaxHeight(100.);
			btnRules.setMinWidth(300.);
			btnRules.setMaxWidth(300.);
			btnRules.setId("btnRules");
		}
		return btnRules;
	}

	// Getter for the high scores button, not used yet
	public Button getBtnHighScore() {
		if (btnHighScore == null) {
			btnHighScore = new Button("High Scores");
			btnHighScore.setMinHeight(100.);
			btnHighScore.setMaxHeight(100.);
			btnHighScore.setMinWidth(300.);
			btnHighScore.setMaxWidth(300.);
			btnHighScore.setId("btnHighScore");
		}
		return btnHighScore;
	}

	// Getter for the exit button
	public Button getBtnExit() {
		if (btnExit == null) {
			btnExit = new Button("Exit");
			btnExit.setMinHeight(100.);
			btnExit.setMaxHeight(100.);
			btnExit.setMinWidth(300.);
			btnExit.setMaxWidth(300.);
			btnExit.setId("btnExit");
			btnExit.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					MainApp.exitFrame();
				}
			});
		}
		return btnExit;
	}

	// Getter for the logo "Who wants to be a millionnaire?"
	public ImageView getLogo() {
		if (logo == null) {
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

	// Getter for the sound logo, not used yet
	public ImageView getSound() {
		if (sound == null) {
			File fSound = new File("music.png");
			File fNoSound = new File("no_music.png");
			String localUrl1 = null;
			String localUrl2 = null;
			try {
				localUrl1 = fSound.toURI().toURL().toString();
				localUrl2 = fSound.toURI().toURL().toString();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Image iSound = new Image(localUrl1);
			Image iNoSound = new Image(localUrl2);
			sound = new ImageView(iSound);
			sound.setScaleX(0.1);
			sound.setScaleY(0.1);
			sound.setOnMousePressed(new EventHandler<Event>() {

				@SuppressWarnings("unlikely-arg-type")
				public void handle(Event event) {
					if (sound.equals(iSound)) {
						sound.setImage(iNoSound);
						sound.setScaleX(0.1);
						sound.setScaleY(0.1);
					}
				}
			});
		}
		return sound;
	}

}
