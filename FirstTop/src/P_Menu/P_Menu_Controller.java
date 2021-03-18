package P_Menu;

import javafx.application.Platform;
import javafx.event.ActionEvent;

public class P_Menu_Controller {
	public void Action (ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}
}
