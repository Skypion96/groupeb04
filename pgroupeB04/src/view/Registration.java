package view;

import application.MainApp;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Pseudo;
import serialisation.Serialisation;

public class Registration extends AnchorPane{
	
	private Label lblName;
	private TextField txtName;
	
	private Button btnBack;
	private Button btnAdd;

	private Label lblGain;
	
	public Registration() {
		this.setPadding(new Insets(10));
		
		this.getChildren().addAll(getLblGain(), getTxtName(), getBtnBack(),getLblName(),getBtnAdd());
		
		AnchorPane.setLeftAnchor(getLblName(), MainApp.getScreenWidth()*0.40);
		AnchorPane.setTopAnchor(getLblName(), MainApp.getScreenHeight()*0.15);
		
		AnchorPane.setLeftAnchor(getTxtName(), MainApp.getScreenWidth()*0.40);
		AnchorPane.setTopAnchor(getTxtName(), MainApp.getScreenHeight()*0.3);
		
		AnchorPane.setLeftAnchor(getLblGain(), MainApp.getScreenWidth()*0.40);
		AnchorPane.setBottomAnchor(getLblGain(), MainApp.getScreenHeight()*0.40);
		
		AnchorPane.setLeftAnchor(getBtnAdd(), MainApp.getScreenWidth()*0.40);
		AnchorPane.setBottomAnchor(getBtnAdd(), MainApp.getScreenHeight()*0.30);
		
		AnchorPane.setBottomAnchor(getBtnBack(), MainApp.getScreenHeight()*0.02);
		AnchorPane.setRightAnchor(getBtnBack(), MainApp.getScreenWidth()*0.02);
		
	}

	public Label getLblName() {
		if(lblName==null) {
			lblName = new Label("Enter your name");
			lblName.setId("pseudo");
			lblName.setMinHeight(120.);
			lblName.setMaxHeight(120.);
			lblName.setMinWidth(400.);
			lblName.setMaxWidth(400.);
		}
		return lblName;
	}

	public TextField getTxtName() {
		if(txtName==null) {
			txtName = new TextField();
			txtName.setId("pseudo");
			txtName.setMinHeight(120.);
			txtName.setMaxHeight(120.);
			txtName.setMinWidth(400.);
			txtName.setMaxWidth(400.);
		}
		return txtName;
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
	
	public Button getBtnAdd() {
		if(btnAdd ==null) {
			btnAdd = new Button("ajouter");
			btnAdd.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
						Pseudo ps = new Pseudo(getTxtName().getText(),getLblGain().getText());
						System.out.println(ps);
						MainApp.getTableViewHighScore().getTvScores().getItems().add(ps);
						MainApp.getTableViewHighScore().getScorel().add(ps);
						Serialisation.writeScore(MainApp.getTableViewHighScore().getScorel().toJson());
						MainApp.showWelcome();
					
				}
			});
		}
		return btnAdd;
	}
	
	public Label getLblGain() {
		if(lblGain==null) {
			lblGain = new Label();
			lblGain.setId("pseudo");
			lblGain.setMinHeight(120.);
			lblGain.setMaxHeight(120.);
			lblGain.setMinWidth(400.);
			lblGain.setMaxWidth(400.);
			
		}
		return lblGain;
	}
	
	public void setWinnings(String winnings) {
		lblGain.setText(winnings);
	}

}
