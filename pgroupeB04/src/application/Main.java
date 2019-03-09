package application;

import java.nio.file.Paths;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import view.AddQuestion;
import view.WelcomeMenu;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		try {
			
			WelcomeMenu welM = new WelcomeMenu();
            AddQuestion addQ = new AddQuestion();
            welM.setId("welcome");
            
            //musique du jeu
            AudioClip audioClip = new AudioClip(Paths.get("QVGDM.wav").toUri().toString());
	        int volume = 2;
	        Platform.runLater(() -> audioClip.play(volume));
	        Thread.sleep(10);
            
            Scene scene = new Scene(welM, 1000, 600);primaryStage.setFullScreen(true);
            primaryStage.setFullScreenExitHint("Press Esc to exit full screen");

            
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("Add question");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
