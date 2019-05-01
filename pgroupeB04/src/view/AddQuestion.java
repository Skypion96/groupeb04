package view;

import application.MainApp;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
	private Button btnBack;

	public AddQuestion() {
		this.setPadding(new Insets(10));
		this.getChildren().addAll(getTxtAuthor(), getCbRound(), getTxtStatement(), getTxtChoice1(), getTxtChoice2(),
				getTxtChoice3(), getTxtChoice4(), getRbChoice1(), getRbChoice2(), getRbChoice3(), getRbChoice4(),
				getBtnOk(),getBtnBack());

		AnchorPane.setTopAnchor(getTxtStatement(), MainApp.getScreenHeight()*0.25);
		AnchorPane.setRightAnchor(getTxtStatement(),  MainApp.getScreenWidth()*0.40);
		AnchorPane.setLeftAnchor(getTxtStatement(),  MainApp.getScreenWidth()*0.30);

		AnchorPane.setTopAnchor(getTxtChoice1(), MainApp.getScreenHeight()*0.30);
		AnchorPane.setRightAnchor(getTxtChoice1(), MainApp.getScreenWidth()*0.35);
		AnchorPane.setLeftAnchor(getTxtChoice1(), MainApp.getScreenWidth()*0.30);

		AnchorPane.setTopAnchor(getTxtChoice2(), MainApp.getScreenHeight()*0.35);
		AnchorPane.setRightAnchor(getTxtChoice2(), MainApp.getScreenWidth()*0.35);
		AnchorPane.setLeftAnchor(getTxtChoice2(), MainApp.getScreenWidth()*0.30);

		AnchorPane.setTopAnchor(getTxtChoice3(), MainApp.getScreenHeight()*0.40);
		AnchorPane.setRightAnchor(getTxtChoice3(), MainApp.getScreenWidth()*0.35);
		AnchorPane.setLeftAnchor(getTxtChoice3(), MainApp.getScreenWidth()*0.30);

		AnchorPane.setTopAnchor(getTxtChoice4(), MainApp.getScreenHeight()*0.45);
		AnchorPane.setRightAnchor(getTxtChoice4(), MainApp.getScreenWidth()*0.35);
		AnchorPane.setLeftAnchor(getTxtChoice4(), MainApp.getScreenWidth()*0.30);

		ToggleGroup group = new ToggleGroup();
		getRbChoice1().setToggleGroup(group);
		getRbChoice2().setToggleGroup(group);
		getRbChoice3().setToggleGroup(group);
		getRbChoice4().setToggleGroup(group);

		AnchorPane.setTopAnchor(getRbChoice1(), MainApp.getScreenHeight()*0.30);
		AnchorPane.setRightAnchor(getRbChoice1(), MainApp.getScreenWidth()*0.30);

		AnchorPane.setTopAnchor(getRbChoice2(), MainApp.getScreenHeight()*0.35);
		AnchorPane.setRightAnchor(getRbChoice2(), MainApp.getScreenWidth()*0.30);

		AnchorPane.setTopAnchor(getRbChoice3(), MainApp.getScreenHeight()*0.40);
		AnchorPane.setRightAnchor(getRbChoice3(), MainApp.getScreenWidth()*0.30);

		AnchorPane.setTopAnchor(getRbChoice4(), MainApp.getScreenHeight()*0.45);
		AnchorPane.setRightAnchor(getRbChoice4(), MainApp.getScreenWidth()*0.30);

		AnchorPane.setBottomAnchor(getBtnOk(), MainApp.getScreenHeight()*0.35);
		AnchorPane.setRightAnchor(getBtnOk(), MainApp.getScreenWidth()*0.35);

		AnchorPane.setTopAnchor(getTxtAuthor(),MainApp.getScreenHeight()*0.20);
		AnchorPane.setLeftAnchor(getTxtAuthor(), MainApp.getScreenWidth()*0.30);
		AnchorPane.setRightAnchor(getTxtAuthor(), MainApp.getScreenWidth()*0.40);

		AnchorPane.setTopAnchor(getCbRound(), MainApp.getScreenHeight()*0.20);
		AnchorPane.setRightAnchor(getCbRound(), MainApp.getScreenWidth()*0.30);
		
		AnchorPane.setBottomAnchor(getBtnBack(), MainApp.getScreenHeight()*0.02);
		AnchorPane.setRightAnchor(getBtnBack(), MainApp.getScreenWidth()*0.02);

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
			rbChoice1.setStyle("-fx-text-fill: white;");
		}
		return rbChoice1;
	}

	public RadioButton getRbChoice2() {
		if (rbChoice2 == null) {
			rbChoice2 = new RadioButton();
			rbChoice2.setText("True");
			rbChoice2.setStyle("-fx-text-fill: white;");
		}
		return rbChoice2;
	}

	public RadioButton getRbChoice3() {
		if (rbChoice3 == null) {
			rbChoice3 = new RadioButton();
			rbChoice3.setText("True");
			rbChoice3.setStyle("-fx-text-fill: white;");
		}
		return rbChoice3;
	}

	public RadioButton getRbChoice4() {
		if (rbChoice4 == null) {
			rbChoice4 = new RadioButton();
			rbChoice4.setText("True");
			rbChoice4.setStyle("-fx-text-fill: white;");
		}
		return rbChoice4;
	}

	public Button getBtnOk() {
		if (btnOk == null) {
			btnOk = new Button();
			btnOk.setText("Ok");
			btnOk.setId("btnLogin");
			btnOk.setMinHeight(80.);
			btnOk.setMaxHeight(80.);
			btnOk.setMinWidth(200.);
			btnOk.setMaxWidth(200.);
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
				}
			});
		}
		return btnBack;
	}
}
