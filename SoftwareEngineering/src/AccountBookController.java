import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AccountBookController implements Initializable{ //���� ȭ���� �����ϴ� Ŭ���� 
	@FXML private BorderPane accountBook; 
	@FXML private Button btnMain;  
	//fxml���� ���̾ƿ� �߰��Ѱ� �߰� ���� 
	
	@Override 
	public void initialize(URL location, ResourceBundle resources) {
		btnMain.setOnAction(e->handleBtnMain(e));
	}
	
	public void handleBtnMain(ActionEvent event) {
		try { //main ȭ������ ���ư�  
			Parent main = FXMLLoader.load(getClass().getResource("root.fxml")); //����ȭ������ ���ư��� 
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) btnMain.getScene().getWindow();
			primaryStage.setScene(scene);
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
}