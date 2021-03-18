package O_Slider;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;

public class O_Slider_Controller implements Initializable {
	
	@FXML
	Slider slider;
	@FXML
	TextField textField;
	
	static final double INIT_VALUE = 50;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		slider.setValue(INIT_VALUE);
		textField.setText(String.valueOf(INIT_VALUE));
		slider.setMax(200);
		textField.textProperty().bindBidirectional(slider.valueProperty(), new NumberStringConverter());
	}
}
