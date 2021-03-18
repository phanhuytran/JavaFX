package V_TableView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class V_TableView_Controller implements Initializable {

	@FXML
	private TableView<V_TableView_Student> table;
	
	@FXML
	private TableColumn<V_TableView_Student, Integer> idColumn;
	@FXML
	private TableColumn<V_TableView_Student, String> nameColumn;
	@FXML
	private TableColumn<V_TableView_Student, String> emailColumn;
	@FXML
	private TableColumn<V_TableView_Student, Integer> ageColumn;
	
	@FXML
	private TextField idTextField;
	@FXML
	private TextField nameTextField;
	@FXML
	private TextField emailTextField;
	@FXML
	private TextField ageTextField;
	
	public ObservableList<V_TableView_Student> studentList;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		studentList = FXCollections.observableArrayList (
			new V_TableView_Student(1, "Đặng Hoàng Bửu", "1851050010buu@ou.edu.vn", 21),
			new V_TableView_Student(2, "Vũ Tấn Đạt", "1851050032dat@ou.edu.vn", 21),
			new V_TableView_Student(3, "Trần Phấn Huy", "1851050056huy@ou.edu.vn", 21),
			new V_TableView_Student(4, "Huỳnh Thị Tuyết Ngọc", "1851050096ngoc@ou.edu.vn", 21),
			new V_TableView_Student(5, "Nguyễn Thiên Phúc", "1851050115phuc@ou.edu.vn", 21),
			new V_TableView_Student(6, "Lê Hữu Phước", "1851050120phuoc@ou.edu.vn", 21),
			new V_TableView_Student(7, "Phan Thị Như Quỳnh", "1851050124quynh@ou.edu.vn", 21),
			new V_TableView_Student(8, "Nguyễn Đỗ Trọng", "1851050159trong@ou.edu.vn", 21)
		);
		idColumn.setCellValueFactory(new PropertyValueFactory<V_TableView_Student, Integer>("Id"));
		nameColumn.setCellValueFactory(new PropertyValueFactory<V_TableView_Student, String>("Name"));
		emailColumn.setCellValueFactory(new PropertyValueFactory<V_TableView_Student, String>("Email"));
		ageColumn.setCellValueFactory(new PropertyValueFactory<V_TableView_Student, Integer>("Age"));
		table.setItems(studentList);
	}
	
	public void addStudent(ActionEvent event) {
		try {
			V_TableView_Student newStudent = new V_TableView_Student();
			newStudent.setId(Integer.parseInt(idTextField.getText()));
			newStudent.setName(nameTextField.getText());
			newStudent.setEmail(emailTextField.getText());
			newStudent.setAge(Integer.parseInt(ageTextField.getText()));
			
			boolean checkIDExist = false, checkEmailExist = false;
			for (V_TableView_Student student : studentList) {
				if (student.getId() == newStudent.getId()) {
					checkIDExist = true;
					Alert alert = new Alert(Alert.AlertType.INFORMATION);
					alert.setContentText("This id already exists");
					alert.show();
					break;
				}
				if (student.getEmail().equals(newStudent.getEmail())) {
					checkEmailExist = true;
					Alert alert = new Alert(Alert.AlertType.INFORMATION);
					alert.setContentText("This email already exists");
					alert.show();
					break;
				}
			}
			if (!checkIDExist && !checkEmailExist) {
				studentList.add(newStudent);
			}
		} catch (Exception ex) {
			
		}
	}
	
	public void removeStudent(ActionEvent event) {
		V_TableView_Student selected = table.getSelectionModel().getSelectedItem();
		studentList.remove(selected);
	}
	
	public void changeSceneStudentDetail(ActionEvent event) throws IOException {
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("W_TransmitDataScene_StudentDetail.fxml"));
		Parent studentViewParent = loader.load();
		Scene scene = new Scene(studentViewParent);
		W_TransmitDataScene_StudentDetailController controller = loader.getController();
		V_TableView_Student selected = table.getSelectionModel().getSelectedItem();
		controller.setStudent(selected);
		stage.setScene(scene);
	}
}