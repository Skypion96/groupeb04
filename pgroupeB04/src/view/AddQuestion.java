package view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import model.Round;

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

	private Button btnOk;

	public AddQuestion() {
		this.setPadding(new Insets(10));
		this.getChildren().addAll(getTxtAuthor(), getCbRound(), getTxtStatement(), getTxtChoice1(), getTxtChoice2(),
				getTxtChoice3(), getTxtChoice4(), getRbChoice1(), getRbChoice2(), getRbChoice3(), getRbChoice4(),
				getBtnOk());

		AnchorPane.setTopAnchor(getTxtStatement(), 35.0);
		AnchorPane.setRightAnchor(getTxtStatement(), 5.0);
		AnchorPane.setLeftAnchor(getTxtStatement(), 5.0);

		AnchorPane.setTopAnchor(getTxtChoice1(), 70.0);
		AnchorPane.setRightAnchor(getTxtChoice1(), 75.0);
		AnchorPane.setLeftAnchor(getTxtChoice1(), 15.0);

		AnchorPane.setTopAnchor(getTxtChoice2(), 100.0);
		AnchorPane.setRightAnchor(getTxtChoice2(), 75.0);
		AnchorPane.setLeftAnchor(getTxtChoice2(), 15.0);

		AnchorPane.setTopAnchor(getTxtChoice3(), 130.0);
		AnchorPane.setRightAnchor(getTxtChoice3(), 75.0);
		AnchorPane.setLeftAnchor(getTxtChoice3(), 15.0);

		AnchorPane.setTopAnchor(getTxtChoice4(), 160.0);
		AnchorPane.setRightAnchor(getTxtChoice4(), 75.0);
		AnchorPane.setLeftAnchor(getTxtChoice4(), 15.0);

		ToggleGroup group = new ToggleGroup();
		getRbChoice1().setToggleGroup(group);
		getRbChoice2().setToggleGroup(group);
		getRbChoice3().setToggleGroup(group);
		getRbChoice4().setToggleGroup(group);

		AnchorPane.setTopAnchor(getRbChoice1(), 75.0);
		AnchorPane.setRightAnchor(getRbChoice1(), 5.0);

		AnchorPane.setTopAnchor(getRbChoice2(), 105.0);
		AnchorPane.setRightAnchor(getRbChoice2(), 5.0);

		AnchorPane.setTopAnchor(getRbChoice3(), 135.0);
		AnchorPane.setRightAnchor(getRbChoice3(), 5.0);

		AnchorPane.setTopAnchor(getRbChoice4(), 165.0);
		AnchorPane.setRightAnchor(getRbChoice4(), 5.0);

		AnchorPane.setBottomAnchor(getBtnOk(), 5.0);
		AnchorPane.setRightAnchor(getBtnOk(), 5.0);

		AnchorPane.setTopAnchor(getTxtAuthor(), 5.0);
		AnchorPane.setLeftAnchor(getTxtAuthor(), 5.0);
		AnchorPane.setRightAnchor(getTxtAuthor(), 140.0);

		AnchorPane.setTopAnchor(getCbRound(), 5.0);
		AnchorPane.setRightAnchor(getCbRound(), 5.0);

	}

	public TextField getTxtStatement() {
		if (txtStatement == null) {
			txtStatement = new TextField();
			txtStatement.setPromptText("Enter the statement");
		}
		return txtStatement;
	}

	public TextField getTxtChoice1() {
		if (txtChoice1 == null) {
			txtChoice1 = new TextField();
			txtChoice1.setPromptText("Enter choice 1");
		}
		return txtChoice1;
	}

	public TextField getTxtChoice2() {
		if (txtChoice2 == null) {
			txtChoice2 = new TextField();
			txtChoice2.setPromptText("Enter choice 2");
		}
		return txtChoice2;
	}

	public TextField getTxtChoice3() {
		if (txtChoice3 == null) {
			txtChoice3 = new TextField();
			txtChoice3.setPromptText("Enter choice 3");
		}
		return txtChoice3;
	}

	public TextField getTxtChoice4() {
		if (txtChoice4 == null) {
			txtChoice4 = new TextField();
			txtChoice4.setPromptText("Enter choice 4");
		}
		return txtChoice4;
	}

	public RadioButton getRbChoice1() {
		if (rbChoice1 == null) {
			rbChoice1 = new RadioButton();
			rbChoice1.setText("True");
		}
		return rbChoice1;
	}

	public RadioButton getRbChoice2() {
		if (rbChoice2 == null) {
			rbChoice2 = new RadioButton();
			rbChoice2.setText("True");
		}
		return rbChoice2;
	}

	public RadioButton getRbChoice3() {
		if (rbChoice3 == null) {
			rbChoice3 = new RadioButton();
			rbChoice3.setText("True");
		}
		return rbChoice3;
	}

	public RadioButton getRbChoice4() {
		if (rbChoice4 == null) {
			rbChoice4 = new RadioButton();
			rbChoice4.setText("True");
		}
		return rbChoice4;
	}

	public Button getBtnOk() {
		if (btnOk == null) {
			btnOk = new Button();
			btnOk.setText("Ok");
		}
		return btnOk;
	}

	public TextField getTxtAuthor() {
		if (txtAuthor == null) {
			txtAuthor = new TextField();
			txtAuthor.setPromptText("Enter author's name");
		}
		return txtAuthor;
	}

	public ComboBox<Round> getCbRound() {
		if (cbRound == null) {
			cbRound = new ComboBox<Round>();
			cbRound.getItems().setAll(Round.values());
			cbRound.setValue(Round.FIRST_ROUND);
		}
		return cbRound;
	}

}
