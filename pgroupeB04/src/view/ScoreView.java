package view;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ScoreView extends AnchorPane{
	
	private Label lblWon;

	public ScoreView() {
		
		this.setPadding(new Insets(10));

		this.getChildren().addAll(getLblWon());
		
		AnchorPane.setTopAnchor(getLblWon(), 200.);
		AnchorPane.setRightAnchor(getLblWon(), 700.);
		AnchorPane.setLeftAnchor(getLblWon(), 700.);
	}

	public Label getLblWon() {
		if(lblWon==null) {
			lblWon=new Label(" You won !");
			lblWon.setId("lblWon");
		}
		return lblWon;
	}
	
	

}
