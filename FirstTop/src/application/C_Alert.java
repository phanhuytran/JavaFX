package application;

import java.util.Optional;

import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.event.EventHandler;
import javafx.stage.Stage;
//import javafx.stage.WindowEvent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;

public class C_Alert extends Application {
	
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Alert Example");
		
		button = new Button();
		button.setText("Close");
		button.setOnAction(e -> {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Confirmation");
			alert.setHeaderText("Alert Information");
			alert.setContentText("Choose your option");
			
			ButtonType buttonTypeYes = new ButtonType("Yes", ButtonBar.ButtonData.YES);
			ButtonType buttonTypeNo = new ButtonType("No", ButtonBar.ButtonData.NO);
			ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
			
			alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNo, buttonTypeCancel);
			
			Optional<ButtonType> result = alert.showAndWait();
			
			if (result.get().getButtonData() == ButtonBar.ButtonData.YES) {
				System.out.println("Code for Yes");
//				primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
//				    @Override
//				    public void handle(WindowEvent event) {
//				        Platform.exit();
//				        System.exit(0);
//				    }
//				});
			}
			else if (result.get().getButtonData() == ButtonBar.ButtonData.NO)
				System.out.println("Code for No");
			else
				System.out.println("Code for Cancel");
			
			String message = result.get().getText();
			Alert alert1 = new Alert(AlertType.INFORMATION);
			alert1.setTitle("Information");
			alert1.setHeaderText("Notification");
			alert1.setContentText("You've chosen " + '"' + message + '"');
			alert1.show();
		});
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}