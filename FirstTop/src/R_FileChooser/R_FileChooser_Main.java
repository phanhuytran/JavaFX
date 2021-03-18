package R_FileChooser;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class R_FileChooser_Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("R_FileChooser_FXML.fxml"));
		Scene scene = new Scene(root, 600, 400);
		
		primaryStage.setTitle("File Chooser");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}