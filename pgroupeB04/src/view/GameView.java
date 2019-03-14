package view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import model.Game;

public class GameView extends AnchorPane {

	private static Label lblStatement;

	private static Button btnChoice1;
	private static Button btnChoice2;
	private static Button btnChoice3;
	private static Button btnChoice4;

	private Label money;

	private static Game game;

	public GameView() {
		this.setPadding(new Insets(10));
		this.getChildren().addAll(getLblStatement(), getBtnChoice1(), getBtnChoice2(), getBtnChoice3(), getBtnChoice4(),
				getMoney());

		AnchorPane.setTopAnchor(getLblStatement(), 100.0);
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

		// getBtnChoice2().setText("Test11");

	}

	public static Label getLblStatement() {
		if (lblStatement == null) {
			lblStatement = new Label();
		}
		return lblStatement;
	}

	public static Button getBtnChoice1() {
		if (btnChoice1 == null) {
			btnChoice1 = new Button();
		}
		return btnChoice1;
	}

	public static Button getBtnChoice2() {
		if (btnChoice2 == null) {
			btnChoice2 = new Button();
		}
		return btnChoice2;
	}

	public static Button getBtnChoice3() {
		if (btnChoice3 == null) {
			btnChoice3 = new Button();
		}
		return btnChoice3;
	}

	public static Button getBtnChoice4() {
		if (btnChoice4 == null) {
			btnChoice4 = new Button();
		}
		return btnChoice4;
	}

	public Label getMoney() {
		if (money == null) {
			money = new Label("Money Win");
		}
		return money;
	}

	public static void newGame() {
		game = new Game();
		GameView.getGame().newQuestion();
	}

	public static Game getGame() {
		return game;
	}

}