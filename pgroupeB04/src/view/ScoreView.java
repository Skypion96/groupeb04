package view;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ScoreView extends AnchorPane{
	
	private Label lblWon;
	private Label moneyWon;
	private Label lblCongratulation;


	public ScoreView() {
		
		this.setPadding(new Insets(10));

		this.getChildren().addAll(getLblWon(),getMoneyWon(),getLblCongratulation());
		
		AnchorPane.setTopAnchor(getLblWon(), 200.);
		AnchorPane.setRightAnchor(getLblWon(), 610.);
		
		
		AnchorPane.setBottomAnchor(getMoneyWon(), 450.);
		AnchorPane.setRightAnchor(getMoneyWon(), 660.);
		
		AnchorPane.setBottomAnchor(getLblCongratulation(), 100.);
		AnchorPane.setRightAnchor(getLblCongratulation(), 350.);
		
	}

	public Label getLblWon() {
		if(lblWon==null) {
			lblWon=new Label(" You won : ");
			lblWon.setId("lblWon");
			lblWon.setMinWidth(700);

		}
		return lblWon;
	}
	public Label getMoneyWon() {
		if(moneyWon==null) {
			moneyWon=new Label(" moneyWon ");
			moneyWon.setId("moneyWon");
			moneyWon.setMinWidth(500);

		}
		return moneyWon;
	}
	public Label getLblCongratulation() {
		if(lblCongratulation==null) {
			lblCongratulation=new Label(" CONGRATULATIONS ! ");
			lblCongratulation.setId("lblCongratulation");
			lblCongratulation.setMinWidth(1200);
			
		}
		return lblCongratulation;
	}

}
