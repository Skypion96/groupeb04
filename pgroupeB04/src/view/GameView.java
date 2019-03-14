package view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
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

		AnchorPane.setTopAnchor(getLblStatement(), 500.0);
		AnchorPane.setLeftAnchor(getLblStatement(), 610.0);

		AnchorPane.setBottomAnchor(getBtnChoice1(), 300.0);
		AnchorPane.setLeftAnchor(getBtnChoice1(), 350.0);

		AnchorPane.setBottomAnchor(getBtnChoice2(), 300.0);
		AnchorPane.setRightAnchor(getBtnChoice2(), 350.0);

		AnchorPane.setBottomAnchor(getBtnChoice3(), 150.0);
		AnchorPane.setLeftAnchor(getBtnChoice3(), 350.0);

		AnchorPane.setBottomAnchor(getBtnChoice4(), 150.0);
		AnchorPane.setRightAnchor(getBtnChoice4(), 350.0);

		AnchorPane.setTopAnchor(getMoney(), 5.0);
		AnchorPane.setRightAnchor(getMoney(), 300.0);

		// getBtnChoice2().setText("Test11");

	}

	public static Label getLblStatement() {
		if (lblStatement == null) {
			lblStatement = new Label();
			lblStatement.setId("lblStatement");
			lblStatement.setMinWidth(700);
			lblStatement.setMinHeight(120);
		}
		return lblStatement;
	}

	public static Button getBtnChoice1() {
		if (btnChoice1 == null) {
			btnChoice1 = new Button();
			btnChoice1.setId("btnChoice1");
			btnChoice1.setMinWidth(350);
			btnChoice1.setMinHeight(100);
			btnChoice1.setMaxWidth(350);
			btnChoice1.setMaxHeight(100);
		}
		return btnChoice1;
	}

	public static Button getBtnChoice2() {
		if (btnChoice2 == null) {
			btnChoice2 = new Button();
			btnChoice2.setId("btnChoice2");
			btnChoice2.setMinWidth(350);
			btnChoice2.setMinHeight(100);
			btnChoice2.setMaxWidth(350);
			btnChoice2.setMaxHeight(100);
		}
		return btnChoice2;
	}

	public static Button getBtnChoice3() {
		if (btnChoice3 == null) {
			btnChoice3 = new Button();
			btnChoice3.setId("btnChoice3");
			btnChoice3.setMinWidth(350);
			btnChoice3.setMinHeight(100);
			btnChoice3.setMaxWidth(350);
			btnChoice3.setMaxHeight(100);
		}
		return btnChoice3;
	}

	public static Button getBtnChoice4() {
		if (btnChoice4 == null) {
			btnChoice4 = new Button();
			btnChoice4.setId("btnChoice4");
			btnChoice4.setMinWidth(350);
			btnChoice4.setMinHeight(100);
			btnChoice4.setMaxWidth(350);
			btnChoice4.setMaxHeight(100);
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