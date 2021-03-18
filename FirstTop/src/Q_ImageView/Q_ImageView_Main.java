package Q_ImageView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Q_ImageView_Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("Q_ImageView_FXML.fxml"));
		Scene scene = new Scene(root, 600, 400);
		
		primaryStage.setTitle("Image View");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}