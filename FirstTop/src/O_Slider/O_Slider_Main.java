package O_Slider;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class O_Slider_Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("O_Slider_FXML.fxml"));
		Scene scene = new Scene(root, 400, 200);
		
		primaryStage.setTitle("Slider");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}