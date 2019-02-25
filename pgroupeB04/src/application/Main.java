package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.AddQuestion;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		try {
			
            AddQuestion addQ = new AddQuestion();

            
            Scene scene = new Scene(addQ, 600, 250);

            
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
