package view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import modele.Round;

public class AddQuestion extends AnchorPane {

	private TextField txtStatement;
	
	private TextField txtChoice1;
	private TextField txtChoice2;
	private TextField txtChoice3;
	private TextField txtChoice4;
	
	private TextField txtAuthor;
	
	private ComboBox<Round> cbRound;
	
	private RadioButton rbChoice1;
	private RadioButton rbChoice2;
	private RadioButton rbChoice3;
	private RadioButton rbChoice4;
	
	private Label lblRound;
	
	private Button btnOk;
	
	public AddQuestion() {
		this.setPadding(new Insets(10));
		this.getChildren().addAll(getTxtStatement(), getTxtChoice1(), getTxtChoice2(), getTxtChoice3(), getTxtChoice4(), getRbChoice1(), getRbChoice2(), getRbChoice3(), getRbChoice4(), getBtnOk(), getTxtAuthor(), getCbRound(), getLblRound());
		
		AnchorPane.setTopAnchor(getTxtStatement(), 5.0);
		AnchorPane.setRightAnchor(getTxtStatement(), 170.0);
		AnchorPane.setLeftAnchor(getTxtStatement(), 5.0);
		
		AnchorPane.setTopAnchor(getTxtChoice1(), 40.0);
		AnchorPane.setRightAnchor(getTxtChoice1(), 75.0);
		AnchorPane.setLeftAnchor(getTxtChoice1(), 15.0);
		
		AnchorPane.setTopAnchor(getTxtChoice2(), 70.0);
		AnchorPane.setRightAnchor(getTxtChoice2(), 75.0);
		AnchorPane.setLeftAnchor(getTxtChoice2(), 15.0);
		
		AnchorPane.setTopAnchor(getTxtChoice3(), 100.0);
		AnchorPane.setRightAnchor(getTxtChoice3(), 75.0);
		AnchorPane.setLeftAnchor(getTxtChoice3(), 15.0);
		
		AnchorPane.setTopAnchor(getTxtChoice4(), 130.0);
		AnchorPane.setRightAnchor(getTxtChoice4(), 75.0);
		AnchorPane.setLeftAnchor(getTxtChoice4(), 15.0);
		
		ToggleGroup group = new ToggleGroup();
		getRbChoice1().setToggleGroup(group);
		getRbChoice2().setToggleGroup(group);
		getRbChoice3().setToggleGroup(group);
		getRbChoice4().setToggleGroup(group);
		
		AnchorPane.setTopAnchor(getRbChoice1(), 45.0);
		AnchorPane.setRightAnchor(getRbChoice1(), 5.0);
		
		AnchorPane.setTopAnchor(getRbChoice2(), 75.0);
		AnchorPane.setRightAnchor(getRbChoice2(), 5.0);
		
		AnchorPane.setTopAnchor(getRbChoice3(), 105.0);
		AnchorPane.setRightAnchor(getRbChoice3(), 5.0);
		
		AnchorPane.setTopAnchor(getRbChoice4(), 135.0);
		AnchorPane.setRightAnchor(getRbChoice4(), 5.0);
		
		AnchorPane.setBottomAnchor(getBtnOk(), 5.0);
		AnchorPane.setRightAnchor(getBtnOk(), 5.0);
		
		AnchorPane.setTopAnchor(getTxtAuthor(), 5.0);
		AnchorPane.setRightAnchor(getTxtAuthor(), 5.0);
		
		AnchorPane.setTopAnchor(getLblRound(), 175.0);
		AnchorPane.setRightAnchor(getLblRound(), 75.0);
		AnchorPane.setLeftAnchor(getLblRound(), 5.0);
		
		AnchorPane.setTopAnchor(getCbRound(), 170.0);
		AnchorPane.setRightAnchor(getCbRound(), 75.0);
		AnchorPane.setLeftAnchor(getCbRound(), 115.0);
		
	}
	
	public TextField getTxtStatement() {
		if(txtStatement==null) {
			txtStatement = new TextField();
			txtStatement.setPromptText("Enter the statement");
		}
		return txtStatement;
	}
	
	public TextField getTxtChoice1() {
		if(txtChoice1==null) {
			txtChoice1 = new TextField();
			txtChoice1.setPromptText("Choice 1");
		}
		return txtChoice1;
	}
	
	public TextField getTxtChoice2() {
		if(txtChoice2==null) {
			txtChoice2 = new TextField();
			txtChoice2.setPromptText("Choice 2");
		}
		return txtChoice2;
	}
	
	public TextField getTxtChoice3() {
		if(txtChoice3==null) {
			txtChoice3 = new TextField();
			txtChoice3.setPromptText("Choice 3");
		}
		return txtChoice3;
	}
	
	public TextField getTxtChoice4() {
		if(txtChoice4==null) {
			txtChoice4 = new TextField();
			txtChoice4.setPromptText("Choice 4");
		}
		return txtChoice4;
	}
	
	public RadioButton getRbChoice1() {
		if(rbChoice1==null) {
			rbChoice1 = new RadioButton();
			rbChoice1.setText("True");
		}
		return rbChoice1;
	}
	
	public RadioButton getRbChoice2() {
		if(rbChoice2==null) {
			rbChoice2 = new RadioButton();
			rbChoice2.setText("True");
		}
		return rbChoice2;
	}
	
	public RadioButton getRbChoice3() {
		if(rbChoice3==null) {
			rbChoice3 = new RadioButton();
			rbChoice3.setText("True");
		}
		return rbChoice3;
	}
	
	public RadioButton getRbChoice4() {
		if(rbChoice4==null) {
			rbChoice4 = new RadioButton();
			rbChoice4.setText("True");
		}
		return rbChoice4;
	}
	
	public Button getBtnOk() {
		if(btnOk==null) {
			btnOk = new Button();
			btnOk.setText("Ok");
		}
		return btnOk;
	}
	
	public TextField getTxtAuthor() {
		if(txtAuthor==null) {
			txtAuthor = new TextField();
			txtAuthor.setPromptText("Author");
		}
		return txtAuthor;
	}
	
	public ComboBox<Round> getCbRound(){
		if(cbRound==null) {
			cbRound = new ComboBox<Round>();
			cbRound.getItems().setAll(Round.values());
			cbRound.setValue(Round.FIRST_ROUND);
		}
		return cbRound;
	}
	
	public Label getLblRound() {
		if(lblRound==null) {
			lblRound = new Label("Question's Round :");
		}
		return lblRound;
	}
	
}
