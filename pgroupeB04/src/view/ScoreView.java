package view;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ScoreView extends AnchorPane{
	
	private Label lblWon;

	public ScoreView() {
		
		this.setPadding(new Insets(10));

		this.getChildren().addAll(getLblWon());
		
		AnchorPane.setTopAnchor(lblWon, 200.);
		AnchorPane.setRightAnchor(getLblWon(), 200.);
	}

	public Label getLblWon() {
		if(lblWon==null) {
			lblWon=new Label(" You won !");
		}
		return lblWon;
	}
	
	

}
