package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class SampleController {
	
	@FXML
	private TextField loginField;
	@FXML
	private PasswordField passwordField;
	@FXML
	private Button loginBtn;
	
	
	public void login(ActionEvent e) {
		String login = loginField.getText();
		String paswd = passwordField.getText();
		
		System.out.println(login);
		System.out.println(paswd);
		
		Alert alert = new Alert(AlertType.INFORMATION);
		
		if (login.equals("Aminjoni") && paswd.equals("amin")) {
			alert.setTitle("Success");
			alert.setContentText("Welcome :" + login);
			
		} else {
			alert.setTitle("Error");
		}
		
		
		alert.showAndWait();
		
	}
	
}
