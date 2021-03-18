package L_TreeView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class L_TreeView_Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("L_TreeView_FXML.fxml"));
		Scene scene = new Scene(root, 498, 364);
		
		primaryStage.setTitle("TreeView");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}