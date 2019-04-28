package view;



import application.MainApp;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.scene.layout.AnchorPane;


public class LoginAP extends AnchorPane{
	
	private Label lblLogin;
	private Label lblPassword;
	
	private TextField txtLogin;
	
	private Button btnOK;
	private Button btnBack;
	
	private PasswordField pwdPassword;
	
	
	public LoginAP() {

		this.setPadding(new Insets(10));
	//	this.setSpacing(5);
	//	this.setVgap(5);
	//	this.setHgap(5);
		this.getChildren().addAll(getLblLogin(),getTxtLogin(),getLblPassword()/*,getTxtPassword()*/,getPwdPassword(),getBtnOK(),getBtnBack());
	
		AnchorPane.setTopAnchor(lblLogin, MainApp.getScreenHeight() * 0.28);
		AnchorPane.setLeftAnchor(lblLogin, MainApp.getScreenWidth() * 0.45);

		AnchorPane.setTopAnchor(txtLogin, MainApp.getScreenHeight() * 0.30);
		AnchorPane.setLeftAnchor(txtLogin, MainApp.getScreenWidth() * 0.52);

		AnchorPane.setTopAnchor(lblPassword, MainApp.getScreenHeight() * 0.34 );
		AnchorPane.setLeftAnchor(lblPassword, MainApp.getScreenWidth() * 0.41);

		AnchorPane.setTopAnchor(pwdPassword, MainApp.getScreenHeight() * 0.36);
		AnchorPane.setLeftAnchor(pwdPassword, MainApp.getScreenWidth() * 0.52);

		AnchorPane.setBottomAnchor(btnOK, MainApp.getScreenHeight() * 0.4);
		AnchorPane.setRightAnchor(btnOK, MainApp.getScreenWidth() * 0.4);

		AnchorPane.setBottomAnchor(getBtnBack(), MainApp.getScreenHeight()*0.02);
		AnchorPane.setRightAnchor(getBtnBack(), MainApp.getScreenWidth()*0.02);
	
	}


	public Label getLblLogin() {
		if(lblLogin == null) {
			lblLogin = new Label("Login");
			lblLogin.setId("lbl");
		}
		return lblLogin;
	}


	public Label getLblPassword() {
		if(lblPassword == null) {
			lblPassword = new Label("Password");
			lblPassword.setId("lbl");
		}
		return lblPassword;
	}


	public TextField getTxtLogin() {
		if(txtLogin == null) {
			txtLogin = new TextField();
		}
		return txtLogin;
	}



	public Button getBtnOK() {
		if(btnOK == null) {
			btnOK = new Button("OK");
			btnOK.setId("btnLogin");
			btnOK.setMinHeight(75.);
			btnOK.setMaxHeight(75.);
			btnOK.setMinWidth(200.);
			btnOK.setMaxWidth(200.);
			btnOK.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					System.out.println(txtLogin.getText());
					System.out.println(pwdPassword.getText());
					
					
				}
			});;
		}
		return btnOK;
	}

	
	public PasswordField getPwdPassword() {
		if(pwdPassword == null) {
			pwdPassword = new PasswordField();
		}
		return pwdPassword;
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
