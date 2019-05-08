package view;

import java.net.URL;

import application.MainApp;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class RulesView extends AnchorPane{
	
	private Label lblTitle;
	private Label lblAnswerQuest;
	private Label lblJ5050;
	private Label lblJPublic;
	private Label lblJCall;
	private ImageView imgJ5050;
	private ImageView imgJPublic;
	private ImageView imgJCall;
	private Button btnBack;
	
	public RulesView() {
		this.setPadding(new Insets(10));
		this.getChildren().addAll(getLblTitle(),getLblAnswerQuest(),getLblJ5050(),getLblJCall(),getLblJPublic(),getImgJ5050(),getImgJCall(),getImgJPublic(),getBtnBack());

		AnchorPane.setTopAnchor(getLblTitle(), MainApp.getScreenHeight()*0.05);
		AnchorPane.setLeftAnchor(getLblTitle(), MainApp.getScreenWidth()*0.05);
		
		AnchorPane.setTopAnchor(getLblAnswerQuest(), MainApp.getScreenHeight()*0.15);
		AnchorPane.setLeftAnchor(getLblAnswerQuest(), MainApp.getScreenWidth()*0.01);

		AnchorPane.setTopAnchor(getLblJ5050(), MainApp.getScreenHeight()*0.35);
		AnchorPane.setLeftAnchor(getLblJ5050(), MainApp.getScreenWidth()*0.10);

		AnchorPane.setBottomAnchor(getLblJCall(), MainApp.getScreenHeight()*0.30);
		AnchorPane.setLeftAnchor(getLblJCall(), MainApp.getScreenWidth()*0.10);

		AnchorPane.setBottomAnchor(getLblJPublic(), MainApp.getScreenHeight()*0.20);
		AnchorPane.setLeftAnchor(getLblJPublic(), MainApp.getScreenWidth()*0.10);

		AnchorPane.setTopAnchor(getImgJ5050(), MainApp.getScreenHeight()*0.25);
		AnchorPane.setLeftAnchor(getImgJ5050(), MainApp.getScreenWidth()*0.01);
		
		AnchorPane.setBottomAnchor(getImgJCall(), MainApp.getScreenHeight()*0.30);
		AnchorPane.setLeftAnchor(getImgJCall(), MainApp.getScreenWidth()*0.01);
		
		AnchorPane.setBottomAnchor(getImgJPublic(), MainApp.getScreenHeight()*0.10);
		AnchorPane.setLeftAnchor(getImgJPublic(), MainApp.getScreenWidth()*0.01);
		
		AnchorPane.setBottomAnchor(getBtnBack(), MainApp.getScreenHeight()*0.02);
		AnchorPane.setRightAnchor(getBtnBack(), MainApp.getScreenWidth()*0.10);
	}
	
	


	public Label getLblTitle() {
		if(lblTitle == null) {
			lblTitle = new Label("RULES : ");
			lblTitle.setId("Rules");
		}
		return lblTitle;
	}




	public Label getLblAnswerQuest() {
		if(lblAnswerQuest == null) {
			lblAnswerQuest = new Label("You will answer questions with four choices but only one is true.\n If it's correct you continue to play.\n "
					+ "If it's not, the game stop and you keep the gains of the last bearing that you passed.");
			lblAnswerQuest.setId("lbl");
		}
		return lblAnswerQuest;
	}


	public Label getLblJ5050() {
		if(lblJ5050 == null) {
			lblJ5050 = new Label("                  Warning : only one use ! This joker remove two wrong answers.");
			lblJ5050.setId("lbl");
		}
		return lblJ5050;
	}


	public Label getLblJPublic() {
		if(lblJPublic == null) {
			lblJPublic = new Label("                  Warning : only one use ! This joker show you in percent what does the public think");
			lblJPublic.setId("lbl");
		}
		return lblJPublic;
	}


	public Label getLblJCall() {
		if(lblJCall == null) {
			lblJCall = new Label("                  Warning : only one use ! There is three types of answers :\n                  - The people know the answer.\n "
					+ "                 - The people think to know the answer.\n                  - The people don't know the answer.");
			lblJCall.setId("lbl");
		}
		return lblJCall;
	}


	public ImageView getImgJ5050() {
		if(imgJ5050 == null) {
			URL urlJ5050 = getClass().getResource("/50_50.png");
			Image iJ5050 = new Image(urlJ5050.toString());
			imgJ5050 = new ImageView(iJ5050);
			imgJ5050.setScaleX(0.4);
			imgJ5050.setScaleY(0.4);
		}
		return imgJ5050;
	}


	public ImageView getImgJPublic() {
		if(imgJPublic == null) {
			URL urlPublic = getClass().getResource("/public.png");
			Image iPublic = new Image(urlPublic.toString());
			imgJPublic = new ImageView(iPublic);
			imgJPublic.setScaleX(0.4);
			imgJPublic.setScaleY(0.4);
			
		}
		return imgJPublic;
	}


	public ImageView getImgJCall() {
		if(imgJCall == null) {
			URL urlCall = getClass().getResource("/call.png");
			Image iCall = new Image(urlCall.toString());
			imgJCall = new ImageView(iCall);
			imgJCall.setScaleX(0.4);
			imgJCall.setScaleY(0.4);
		}
		return imgJCall;
	}




	public Button getBtnBack(){
		if (btnBack == null) {
			btnBack = new Button("Back to menu");
			btnBack.setMinHeight(120.);
			btnBack.setMaxHeight(120.);
			btnBack.setMinWidth(400.);
			btnBack.setMaxWidth(400.);
			btnBack.setId("btnBack");
			btnBack.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					MainApp.showWelcome();
				}
			});
		}
		return btnBack;
	}
	

}
