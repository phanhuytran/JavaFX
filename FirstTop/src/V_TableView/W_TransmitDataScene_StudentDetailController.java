package V_TableView;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class W_TransmitDataScene_StudentDetailController {

	@FXML
	private Label idLabel;
	@FXML
	private Label nameLabel;
	@FXML
	private Label emailLabel;
	@FXML
	private Label ageLabel;
	
	public void setStudent(V_TableView_Student student) {
		idLabel.setText(String.valueOf(student.getId()));
		nameLabel.setText(student.getName());
		emailLabel.setText(student.getEmail());
		ageLabel.setText(String.valueOf(student.getAge()));
	}
	
	public void goBack(ActionEvent event) throws IOException {
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("V_TableView_FXML.fxml"));
		Parent tableViewParent = loader.load();
		Scene scene = new Scene(tableViewParent);
		stage.setScene(scene);
	}
}
