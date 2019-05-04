package view;

import application.MainApp;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Registration extends AnchorPane{
	
	private Label lblName;
	private TextField txtName;
	
	private Button btnBack;
	private Button btnOk;

	public Registration() {
		this.setPadding(new Insets(10));
		
		this.getChildren().addAll(getLblName(), getTxtName(), getBtnBack());
		
		AnchorPane.setLeftAnchor(getLblName(), 20.);
		AnchorPane.setTopAnchor(getLblName(), 100.);
		
		AnchorPane.setLeftAnchor(getTxtName(), 60.);
		AnchorPane.setTopAnchor(getLblName(), 100.);
		
		AnchorPane.setLeftAnchor(getBtnBack(), 20.);
		AnchorPane.setBottomAnchor(getBtnBack(), 20.);
		
	}

	public Label getLblName() {
		if(lblName==null) {
			lblName = new Label("Enter your name");
		}
		return lblName;
	}

	public TextField getTxtName() {
		if(txtName==null) {
			txtName = new TextField();
		}
		return txtName;
	}

	public Button getBtnBack() {
		if(btnBack==null) {
			btnBack = new Button("Back");
			btnBack.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					MainApp.showScoreView();
				}
			});
		}
		return btnBack;
	}

	public Button getBtnOk() {
		if(btnOk==null) {
			btnOk = new Button("Ok");
			btnOk.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					
					
				}
			});
		}
		return btnOk;
	}
	
	

}
