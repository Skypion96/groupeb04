package view;

import application.MainApp;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

public class TableViewHighScore extends BorderPane{
	
	private TableView<String> tvScores;
	
	private Button btnBack;

	public TableViewHighScore() {
		super();
		this.setCenter(getTvScores());
		this.setBottom(getBtnBack());
	}

	public TableView<String> getTvScores() {
		if(tvScores==null) {
			tvScores = new TableView<String>();
			tvScores.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
			TableColumn<String, Integer> colName = new TableColumn<>("Name");
			TableColumn<String, Integer> colScore = new TableColumn<>("Score");
			
			colName.setCellValueFactory(new PropertyValueFactory<String, Integer>("Name"));
			colScore.setCellValueFactory(new PropertyValueFactory<String, Integer>("Score"));
			
			tvScores.getColumns().addAll(colName, colScore);
		}
		return tvScores;
	}

	public Button getBtnBack() {
		if(btnBack==null) {
			btnBack = new Button("Back");
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
