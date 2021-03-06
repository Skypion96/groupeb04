package view;

import application.MainApp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
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
		this.setPadding(new Insets(20));
		this.scorel = Serialisation.readScore();
		this.setCenter(getTvScores());
		this.setBottom(getBtnBack());	
	}

	@SuppressWarnings("unchecked")
	public TableView<Pseudo> getTvScores() {
		if(tvScores==null) {
			
			ObservableList<Pseudo> data = FXCollections.observableArrayList();
			data.addAll(scorel.getScoreList());
			
			tvScores = new TableView<Pseudo>();
			tvScores.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
			TableColumn<Pseudo, String> colName = new TableColumn<>("Name");
			colName.setSortable(false);
			TableColumn<Pseudo, String> colScore = new TableColumn<>("Score");
			colScore.setComparator(colScore.getComparator().reversed());
			colScore.setSortNode(new Group());
			
			colName.setCellValueFactory(new PropertyValueFactory<Pseudo, String>("name"));
			colScore.setCellValueFactory(new PropertyValueFactory<Pseudo, String>("score"));
			
			tvScores.getColumns().addAll(colName, colScore);
			
			tvScores.setItems(data);	
			
			tvScores.getSortOrder().add(colScore);
		}
		return tvScores;
	}

	public Button getBtnBack() {
		if(btnBack==null) {
			btnBack = new Button("Back");
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

	public ScoreList getScorel() {
		return scorel;
	}

	
}
