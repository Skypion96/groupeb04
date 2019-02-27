package view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import modele.Round;

public class GameView extends AnchorPane{
	
private Label lblStatement;
	
	private Button btnChoice1;
	private Button btnChoice2;
	private Button btnChoice3;
	private Button btnChoice4;
	
	private TextField txtAuthor;
	
	private ComboBox<Round> cbRound;
	
	
	private Button btnOk;
	
	public GameView() {
		this.setPadding(new Insets(10));
		this.getChildren().addAll(/*getTxtAuthor(), getCbRound(),*/ getLblStatement(), getBtnChoice1(), getBtnChoice2(), getBtnChoice3(),
				getBtnChoice4(), getBtnOk());
		
		AnchorPane.setTopAnchor(getLblStatement(), 65.0);
		AnchorPane.setRightAnchor(getLblStatement(), 100.0);
		AnchorPane.setLeftAnchor(getLblStatement(), 270.0);
		
		AnchorPane.setTopAnchor(getBtnChoice1(), 100.0);
		AnchorPane.setRightAnchor(getBtnChoice1(), 75.0);
		AnchorPane.setLeftAnchor(getBtnChoice1(), 300.0);
		
		AnchorPane.setTopAnchor(getBtnChoice2(), 100.0);
		AnchorPane.setRightAnchor(getBtnChoice2(), 300.0);
		AnchorPane.setLeftAnchor(getBtnChoice2(), 75.0);
		
		AnchorPane.setTopAnchor(getBtnChoice3(), 130.0);
		AnchorPane.setRightAnchor(getBtnChoice3(), 75.0);
		AnchorPane.setLeftAnchor(getBtnChoice3(), 300.0);
		
		AnchorPane.setTopAnchor(getBtnChoice4(), 130.0);
		AnchorPane.setRightAnchor(getBtnChoice4(), 300.0);
		AnchorPane.setLeftAnchor(getBtnChoice4(), 75.0);
		
		
		AnchorPane.setBottomAnchor(getBtnOk(), 5.0);
		AnchorPane.setRightAnchor(getBtnOk(), 5.0);
		
		//AnchorPane.setTopAnchor(getTxtAuthor(), 5.0);
		//AnchorPane.setLeftAnchor(getTxtAuthor(), 5.0);
		//AnchorPane.setRightAnchor(getTxtAuthor(), 140.0);
		
		//AnchorPane.setTopAnchor(getCbRound(), 5.0);
		//AnchorPane.setRightAnchor(getCbRound(), 5.0);
		
	}
	
	public Label getLblStatement() {
		if(lblStatement==null) {
			lblStatement = new Label("Question");
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
	
	
	public Button getBtnOk() {
		if(btnOk==null) {
			btnOk = new Button();
			btnOk.setText("Ok");
		}
		return btnOk;
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