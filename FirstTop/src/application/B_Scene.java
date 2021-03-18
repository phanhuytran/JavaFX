package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class B_Scene extends Application {
	
	Stage window;
	Scene scene1, scene2;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Scene - The Universe");
		
		window = primaryStage;
		//Scence1
		Label label = new Label("Welcome to the universe");
		Button button1 = new Button("Go to the universe");
		button1.setOnAction(event -> {
			window.setScene(scene2);
		});
		VBox layout1 = new VBox();
		layout1.getChildren().addAll(label, button1);
		scene1 = new Scene(layout1, 300, 200);
		
		//Scence2
		Button button2 = new Button("Go back");
		button2.setOnAction(event -> {
			window.setScene(scene1); 
		});
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		scene2 = new Scene(layout2, 300, 200);
		
		window.setScene(scene1);
		window.show();
	}
}