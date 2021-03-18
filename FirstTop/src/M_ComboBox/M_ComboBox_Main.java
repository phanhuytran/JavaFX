package M_ComboBox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class M_ComboBox_Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("M_ComboBox_FXML.fxml"));
		Scene scene = new Scene(root, 338, 234);
		
		primaryStage.setTitle("ComboBox");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}