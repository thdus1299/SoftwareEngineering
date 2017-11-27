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

public class AccountBookController implements Initializable{ //메인 화면을 조종하는 클래스 
	@FXML private BorderPane accountBook; 
	@FXML private Button btnMain;  
	//fxml에서 레이아웃 추가한것 추가 가능 
	
	@Override 
	public void initialize(URL location, ResourceBundle resources) {
		btnMain.setOnAction(e->handleBtnMain(e));
	}
	
	public void handleBtnMain(ActionEvent event) {
		try { //main 화면으로 돌아감  
			Parent main = FXMLLoader.load(getClass().getResource("root.fxml")); //메인화면으로 돌아가기 
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) btnMain.getScene().getWindow();
			primaryStage.setScene(scene);
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
}