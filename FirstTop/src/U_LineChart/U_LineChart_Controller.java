package U_LineChart;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class U_LineChart_Controller implements Initializable{

	@FXML
	LineChart<String, Number> lineChart;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		XYChart.Series<String, Number> series = new XYChart.Series<>();
		XYChart.Data<String, Number> jan = new XYChart.Data<>("January", 200);
		XYChart.Data<String, Number> feb = new XYChart.Data<>("February", 300);
		XYChart.Data<String, Number> mar = new XYChart.Data<>("March", 500);
		XYChart.Data<String, Number> apr = new XYChart.Data<>("April", 450);
		series.getData().addAll(jan, feb, mar, apr);
		series.setName("Salary per month of Huy");
		lineChart.getData().add(series);
		
		XYChart.Series<String, Number> series1 = new XYChart.Series<>();
		XYChart.Data<String, Number> jan1 = new XYChart.Data<>("January", 400);
		XYChart.Data<String, Number> feb1 = new XYChart.Data<>("February", 500);
		XYChart.Data<String, Number> mar1 = new XYChart.Data<>("March", 650);
		XYChart.Data<String, Number> apr1 = new XYChart.Data<>("April", 1000);
		series1.getData().addAll(jan1, feb1, mar1, apr1);
		series1.setName("Salary per month of Huy'");
		lineChart.getData().add(series1);
	}

}
