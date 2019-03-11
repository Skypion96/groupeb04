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
import view.GameView;
import view.WelcomeMenu;

public class Main extends Application {
	
	private static WelcomeMenu welM = new WelcomeMenu();
	private static GameView gameView = new GameView();
	private static AddQuestion addQ = new AddQuestion();
    private static Stage primaryStage;
    
    private static Scene menu = new Scene(welM, 1000, 600);
    private static Scene game = new Scene(gameView, 1000, 600);
    
    private static AudioClip audioClip = new AudioClip(Paths.get("QVGDM.wav").toUri().toString());

	@Override
	public void start(Stage primaryStage) {
		
		this.primaryStage = primaryStage;
		
		try {
			primaryStage.setFullScreen(true);
			primaryStage.setFullScreenExitHint("Press Esc to exit full screen");
			

			welM.setId("welcome");
			gameView.setId("welcome");
			
            menu.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            game.getStylesheets().add(getClass().getResource("gameview.css").toExternalForm());
            
			WelcomeMenu welM = new WelcomeMenu();
            AddQuestion addQ = new AddQuestion();
            welM.setId("welcome");
            
            //game music
	        int volume = 100;
	        Platform.runLater(() -> audioClip.play(volume));
	        Thread.sleep(10);
            
            Scene scene = new Scene(welM, 1920, 1080);primaryStage.setFullScreen(true);
            primaryStage.setFullScreenExitHint("");
            primaryStage.setMinHeight(1080);
            primaryStage.setMinWidth(1920);

            
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("Add question");
            primaryStage.setScene(menu);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	public static void showGame() {
		primaryStage.setScene(game);
		primaryStage.setFullScreen(true);
	}
	
	public static void exitFrame() {
		primaryStage.close();
	}
}