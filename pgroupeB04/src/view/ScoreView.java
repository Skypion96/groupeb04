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

	public ScoreView() {

		this.setPadding(new Insets(10));

		this.getChildren().addAll(getLblWon(), getMoneyWon(), getLblCongratulation(),getBtnBack(),getBtnSave());

		AnchorPane.setTopAnchor(getLblWon(), 200.);
		AnchorPane.setRightAnchor(getLblWon(), 610.);

		AnchorPane.setBottomAnchor(getMoneyWon(), 450.);
		AnchorPane.setRightAnchor(getMoneyWon(), 660.);

		AnchorPane.setBottomAnchor(getLblCongratulation(), 100.);
		AnchorPane.setRightAnchor(getLblCongratulation(), 350.);
		
		AnchorPane.setBottomAnchor(getBtnBack(), 50.);
		AnchorPane.setRightAnchor(getBtnBack(), 50.);
		
		AnchorPane.setBottomAnchor(getBtnSave(), 50.);
		AnchorPane.setLeftAnchor(getBtnSave(), 50.);


	}

	public Label getLblWon() {
		if (lblWon == null) {
			lblWon = new Label(" You won : ");
			lblWon.setId("lblWon");
			lblWon.setMinWidth(700);

		}
		return lblWon;
	}

	public Label getMoneyWon() {
		if (moneyWon == null) {
			moneyWon = new Label(" moneyWon ");
			moneyWon.setId("moneyWon");
			moneyWon.setMinWidth(500);

		}
		return moneyWon;
	}

	public Label getLblCongratulation() {
		if (lblCongratulation == null) {
			lblCongratulation = new Label(" CONGRATULATIONS ! ");
			lblCongratulation.setId("lblCongratulation");
			lblCongratulation.setMinWidth(1200);

		}
		return lblCongratulation;
	}

	public Button getBtnBack(){
		if (btnBack == null) {
			btnBack = new Button(" Back menu ");
			btnBack.setId("btnBack");
			btnBack.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
				//	MainApp.showWelcomeMenu();
				}
			});
		}
		return btnBack;
	}
	
	public Button getBtnSave(){
		if (btnSave == null) {
			btnSave = new Button(" Save ");
			btnSave.setId("btnExitScore");
			btnSave.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
				}
			});
		}
		return btnSave;
	}
}
