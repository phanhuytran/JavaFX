package I_Event;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class I_Event_Controller {

	@FXML
	public TextField txtHeight;
	
	@FXML
	public Label lbResult;
	
	public void Submit(ActionEvent event) {
		
		lbResult.setText("Your height: " + txtHeight.getText() + " cm");
		
		String height = txtHeight.getText();
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setContentText("Your height: " + height + " cm");
		alert.show();
	}
}