package view;

import application.MainApp;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import model.Pseudo;
import model.ScoreList;
import serialisation.Serialisation;

public class TableViewHighScore extends BorderPane{
	
	private TableView<Pseudo> tvScores;
	
	private Button btnBack;
	
	private ScoreList scorel = new ScoreList();

	public TableViewHighScore() {
		super();
		this.setCenter(getTvScores());
		this.setBottom(getBtnBack());
		this.scorel = Serialisation.readScore();
		
	}

	public TableView<Pseudo> getTvScores() {
		if(tvScores==null) {
			
			tvScores = new TableView<Pseudo>();
			tvScores.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
			TableColumn<Pseudo, String> colName = new TableColumn<>("Name");
			TableColumn<Pseudo, String> colScore = new TableColumn<>("Score");
			
			colName.setCellValueFactory(new PropertyValueFactory<Pseudo, String>("name"));
			colScore.setCellValueFactory(new PropertyValueFactory<Pseudo, String>("score"));
			
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

	public ScoreList getScorel() {
		return scorel;
	}

	
}
