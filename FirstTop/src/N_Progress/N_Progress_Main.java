package N_Progress;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class N_Progress_Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("N_Progress_FXML.fxml"));
		Scene scene = new Scene(root, 400, 200);
		
		primaryStage.setTitle("ProcessBar and ProcessIndicator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}