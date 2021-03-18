package L_TreeView;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class L_TreeView_Controller implements Initializable{

	@FXML
	TreeView<String> treeView;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		TreeItem<String> root = new TreeItem<>();
		TreeItem<String> designWebsite = new TreeItem<>("Design Website");
		TreeItem<String> programmingLanguage = new TreeItem<>("Programming Language");
		TreeItem<String> html = new TreeItem<>("HTML");
		TreeItem<String> css = new TreeItem<>("CSS");
		TreeItem<String> javaScript = new TreeItem<>("JavaScript");
		TreeItem<String> jQuery = new TreeItem<>("jQuery");
		
		programmingLanguage.getChildren().addAll(html, css, javaScript, jQuery);
		designWebsite.getChildren().add(programmingLanguage);
		root.getChildren().add(designWebsite);
		
		
		TreeItem<String> javaFXTutorials = new TreeItem<>("JavaFX Tutorials");
		TreeItem<String> programmingLanguage1 = new TreeItem<>("Programming Language");
		TreeItem<String> cPlusPlus = new TreeItem<>("C++");
		TreeItem<String> java = new TreeItem<>("Java");
		TreeItem<String> cSharp = new TreeItem<>("C#");
		TreeItem<String> python = new TreeItem<>("Python");
		
		programmingLanguage1.getChildren().addAll(cPlusPlus, java, cSharp, python);
		javaFXTutorials.getChildren().add(programmingLanguage1);
		root.getChildren().add(javaFXTutorials);
		
//		root.setExpanded(true); // Show "Programming Language" right away
//		programmingLanguage1.setExpanded(true);
		
		treeView.setRoot(root);
		treeView.setShowRoot(false); // Turn off Root
		treeView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
			System.out.println(newValue.getValue());
		});
	}

}