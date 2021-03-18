package M_ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class M_ComboBox_Controller implements Initializable {

	@FXML
	public ComboBox<String> comboBox;
	
	@FXML
	public Label label;
	
	ObservableList<String> list = FXCollections.observableArrayList("JAVA", "C#", "PYTHON");
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		comboBox.setItems(list);
	}
	
	public void comboBoxChanged (ActionEvent event) {
		label.setText(comboBox.getValue());
	}
}
