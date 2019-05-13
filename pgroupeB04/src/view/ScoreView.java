package view;

import application.MainApp;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ScoreView extends AnchorPane {

	private Label lblWon;
	private Label moneyWon;
	private Label lblCongratulation;

	private Button btnBack;
	private Button btnSave;
	
	private String win;
	

	public ScoreView() {

		this.setPadding(new Insets(10));

		this.getChildren().addAll(getLblWon(), getMoneyWon(), getLblCongratulation(),getBtnBack(),getBtnSave());

		AnchorPane.setTopAnchor(getLblWon(), MainApp.getScreenHeight()*0.1);
		AnchorPane.setRightAnchor(getLblWon(), MainApp.getScreenWidth()*0.2);
		AnchorPane.setLeftAnchor(getLblWon(), MainApp.getScreenWidth()*0.2);

		AnchorPane.setBottomAnchor(getMoneyWon(), MainApp.getScreenHeight()*0.5);
		AnchorPane.setRightAnchor(getMoneyWon(), MainApp.getScreenWidth()*0.25);
		AnchorPane.setLeftAnchor(getMoneyWon(), MainApp.getScreenWidth()*0.25);

		AnchorPane.setBottomAnchor(getLblCongratulation(), MainApp.getScreenHeight()*0.2);
		AnchorPane.setRightAnchor(getLblCongratulation(), MainApp.getScreenWidth()*0.2);
		AnchorPane.setLeftAnchor(getLblCongratulation(), MainApp.getScreenWidth()*0.2);
		
		AnchorPane.setBottomAnchor(getBtnBack(), MainApp.getScreenHeight()*0.02);
		AnchorPane.setRightAnchor(getBtnBack(), MainApp.getScreenWidth()*0.02);
		
		AnchorPane.setBottomAnchor(getBtnSave(), MainApp.getScreenHeight()*0.02);
		AnchorPane.setLeftAnchor(getBtnSave(), MainApp.getScreenWidth()*0.02);


	}

	public Label getLblWon() {
		if (lblWon == null) {
			lblWon = new Label("You won :");
			lblWon.setId("lblWon");
			lblWon.setMinWidth(700);

		}
		return lblWon;
	}

	public Label getMoneyWon() {
		if (moneyWon == null) {
			moneyWon = new Label("moneyWon");
			moneyWon.setId("moneyWon");
			moneyWon.setMinWidth(500);

		}
		return moneyWon;
	}

	public Label getLblCongratulation() {
		if (lblCongratulation == null) {
			lblCongratulation = new Label("CONGRATULATIONS !");
			lblCongratulation.setId("lblCongratulation");
			lblCongratulation.setMinWidth(1200);

		}
		return lblCongratulation;
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
					MainApp.getSound().playSound();
				}
			});
		}
		return btnBack;
	}
	
	public Button getBtnSave(){
		if (btnSave == null) {
			btnSave = new Button("Save");
			btnSave.setId("btnSaveScore");
			btnSave.setMinHeight(120.);
			btnSave.setMaxHeight(120.);
			btnSave.setMinWidth(400.);
			btnSave.setMaxWidth(400.);
			btnSave.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					MainApp.getRg().setWinnings(win);
					MainApp.showRegistration();
				}
			});
		}
		return btnSave;
	}
	
	public void setWinnings(String winnings) {
		moneyWon.setText(winnings);
		win = winnings;
	}
	
}
