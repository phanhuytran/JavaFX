package application;

import javafx.beans.property.*;

public class F_Property_MyNumber {
	
	private DoubleProperty number = new SimpleDoubleProperty();
	
	public double getNumber() {
		return number.get();
	}
	
	public DoubleProperty numberProperty() {
		return number;
	}
	
	public void setNumber(double number) {
		this.number.set(number);
	}
}
