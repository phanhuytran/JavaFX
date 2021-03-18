package S_WebView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class S_WebView_Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
//		WebView web = new WebView();		
//		BorderPane bp = new BorderPane();
//		bp.setCenter(web);
//		bp.getChildren().addAll(web);
		
		Parent root = FXMLLoader.load(getClass().getResource("S_WebView_FXML.fxml"));
		Scene scene = new Scene(root, 600, 400);
		
		primaryStage.setTitle("Web View");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}