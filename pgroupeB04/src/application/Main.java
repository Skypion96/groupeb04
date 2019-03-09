package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
