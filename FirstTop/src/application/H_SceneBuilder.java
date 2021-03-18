package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;

public class H_SceneBuilder extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("MyScene.fxml"));
		primaryStage.setTitle("Scene Builder");
		primaryStage.setScene(new Scene(root, 722, 517));
		primaryStage.show();
	}
	
//	@Override
//	public void start(Stage primaryStage) {
//		try {
//			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("MyScene.fxml"));
//			Scene scene = new Scene(root, 722, 517);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	
//			primaryStage.setTitle("Tran Phan Huy");
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
}