package application;

public class F_Property {
	
	public static void main(String[] args) {
		F_Property_MyNumber example = new F_Property_MyNumber();
		example.numberProperty().addListener((observable, oldValue, newValue) -> {
			System.out.println(observable);
			System.out.println(oldValue);
			System.out.println(newValue);
		});
		example.setNumber(10);
		example.setNumber(11);
	}
}