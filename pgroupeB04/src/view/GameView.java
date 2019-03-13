package view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Game;
import model.Round;

public class GameView extends AnchorPane{
	
private Label lblStatement;
	
	private Button btnChoice1;
	private Button btnChoice2;
	private Button btnChoice3;
	private Button btnChoice4;
	
	private TextField txtAuthor;
	
	private ComboBox<Round> cbRound;
	
	
	private Label money;
	
	public GameView() {
		this.setPadding(new Insets(10));
		this.getChildren().addAll(/*getTxtAuthor(), getCbRound(),*/ getLblStatement(), getBtnChoice1(), getBtnChoice2(), getBtnChoice3(),
				getBtnChoice4(), getMoney());
		
		AnchorPane.setTopAnchor(getLblStatement(), 500.0);
		AnchorPane.setRightAnchor(getLblStatement(), 450.0);
		AnchorPane.setLeftAnchor(getLblStatement(), 740.0);
		
		AnchorPane.setBottomAnchor(getBtnChoice1(), 200.0);
		AnchorPane.setRightAnchor(getBtnChoice1(), 800.0);
		AnchorPane.setLeftAnchor(getBtnChoice1(), 300.0);
		
		AnchorPane.setBottomAnchor(getBtnChoice2(), 200.0);
		AnchorPane.setRightAnchor(getBtnChoice2(), 300.0);
		AnchorPane.setLeftAnchor(getBtnChoice2(), 800.0);
		
		AnchorPane.setBottomAnchor(getBtnChoice3(), 150.0);
		AnchorPane.setRightAnchor(getBtnChoice3(), 800.0);
		AnchorPane.setLeftAnchor(getBtnChoice3(), 300.0);
		
		AnchorPane.setBottomAnchor(getBtnChoice4(), 150.0);
		AnchorPane.setRightAnchor(getBtnChoice4(), 300.0);
		AnchorPane.setLeftAnchor(getBtnChoice4(), 800.0);
		
		
		AnchorPane.setTopAnchor(getMoney(), 5.0);
		AnchorPane.setRightAnchor(getMoney(), 300.0);
		
		//AnchorPane.setTopAnchor(getTxtAuthor(), 5.0);
		//AnchorPane.setLeftAnchor(getTxtAuthor(), 5.0);
		//AnchorPane.setRightAnchor(getTxtAuthor(), 140.0);
		
		//AnchorPane.setTopAnchor(getCbRound(), 5.0);
		//AnchorPane.setRightAnchor(getCbRound(), 5.0);
		
		Game game = new Game();
		System.out.println(game.showQuestion());
		
	}
	
	public Label getLblStatement() {
		if(lblStatement==null) {
			lblStatement = new Label(/*Game.showQuestion()*/);
		}
		return lblStatement;
	}
	
	public Button getBtnChoice1() {
		if(btnChoice1==null) {
			btnChoice1 = new Button();
		}
		return btnChoice1;
	}
	
	public Button getBtnChoice2() {
		if(btnChoice2==null) {
			btnChoice2 = new Button();
		}
		return btnChoice2;
	}
	
	public Button getBtnChoice3() {
		if(btnChoice3==null) {
			btnChoice3 = new Button();
		}
		return btnChoice3;
	}
	
	public Button getBtnChoice4() {
		if(btnChoice4==null) {
			btnChoice4 = new Button();
		}
		return btnChoice4;
	}
	
	
	public Label getMoney() {
		if(money==null) {
			money = new Label("Money Win");
		}
		return money;
	}
	
	/*public TextField getTxtAuthor() {
		if(txtAuthor==null) {
			txtAuthor = new TextField();
			txtAuthor.setPromptText("Enter author's name");
		}
		return txtAuthor;
	}*/
	
/*	public ComboBox<Round> getCbRound(){
		if(cbRound==null) {
			cbRound = new ComboBox<Round>();
			cbRound.getItems().setAll(Round.values());
			cbRound.setValue(Round.FIRST_ROUND);
		}
		return cbRound;
	}*/
}