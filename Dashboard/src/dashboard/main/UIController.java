package dashboard.main;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;

public class UIController implements Initializable {
	
	@FXML
	Label lbResult1;
	@FXML
	ProgressIndicator progressIndicator, progressIndicator1, progressIndicator2;
	@FXML
	LineChart<String, Number> lineChart;
	
	doWork task;
	public void start(ActionEvent event) {
		task = new doWork();
		progressIndicator.progressProperty().bind(task.progressProperty());
		new Thread(task).start();
		
		//lbResult1.setText(progressIndicator.getUserAgentStylesheet());
	}
	
	public void start2(ActionEvent event) {
		task = new doWork();
		progressIndicator1.progressProperty().bind(task.progressProperty());
		new Thread(task).start();
		
		//lbResult1.setText(progressIndicator1.getUserAgentStylesheet());
	}
	
	public void start3(ActionEvent event) {
		task = new doWork();
		progressIndicator2.progressProperty().bind(task.progressProperty());
		new Thread(task).start();
		
		//lbResult1.setText(progressIndicator2.getUserAgentStylesheet());
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		XYChart.Series<String, Number> series = new XYChart.Series<>();
		XYChart.Data<String, Number> jan = new XYChart.Data<>("January", 2256);
		XYChart.Data<String, Number> feb = new XYChart.Data<>("February", 2751);
		XYChart.Data<String, Number> mar = new XYChart.Data<>("March", 2350);
		XYChart.Data<String, Number> apr = new XYChart.Data<>("April", 3957);
		XYChart.Data<String, Number> may = new XYChart.Data<>("May", 4252);
		XYChart.Data<String, Number> jun = new XYChart.Data<>("June", 3151);
		XYChart.Data<String, Number> jul = new XYChart.Data<>("July", 3354);
		XYChart.Data<String, Number> aug = new XYChart.Data<>("August", 4504);
		XYChart.Data<String, Number> sep = new XYChart.Data<>("September", 3853);
		XYChart.Data<String, Number> oct = new XYChart.Data<>("October", 3755);
		XYChart.Data<String, Number> nov = new XYChart.Data<>("November", 4150);
		XYChart.Data<String, Number> dec = new XYChart.Data<>("December", 3650);
		series.getData().addAll(jan, feb, mar, apr, may,jun, jul, aug, sep, oct, nov, dec);
		series.setName("Salary per month of Huy");
		lineChart.getData().add(series);
	}
}

class doWork extends Task<Void> {

	@Override
	protected Void call() throws Exception {
		
		Random rand = new Random();
		
		for (int i = 0; i < 100; i = i + rand.nextInt(10)) {
			updateProgress(i + 1, 100);
			Thread.sleep(1000);
		}
		return null;
	}
}