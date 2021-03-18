package R_FileChooser;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class R_FileChooser_Controller {
	
	@FXML
	private ImageView imageView;
	@FXML
	private AnchorPane ap;
	
	public void ChooseImage (ActionEvent event) {
		
		Stage stage = (Stage) ap.getScene().getWindow();
		
		FileChooser fc = new FileChooser();
		fc.setTitle("Choose a image");
		
		// Chỉ cho phép chọn Image File
		FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png");
		fc.getExtensionFilters().add(imageFilter);
		
		File file = fc.showOpenDialog(stage);
		
		if (file != null) {
			Image image = new Image(file.toURI().toString(), 162, 198, false, true);
			imageView.setImage(image);
		}
	}
}