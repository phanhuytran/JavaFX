package I_Event;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class I_Event_Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("I_Event_FXML.fxml"));
		primaryStage.setTitle("Event");
		primaryStage.setScene(new Scene(root, 477, 194));
		primaryStage.show();
	}
}