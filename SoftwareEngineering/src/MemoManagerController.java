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

public class MemoManagerController implements Initializable{ //메인 화면을 조종하는 클래스 
	@FXML private BorderPane memoManager; 
	@FXML private Button btnMain;
	//fxml에서 레이아웃 추가한것 추가 가능 
	
	@Override 
	public void initialize(URL location, ResourceBundle resources) {
		btnMain.setOnAction(e->handleBtnMain(e));
		//btnCalculator.setOnAction(e->handleBtnCalculator(e));
		//btnAccountBook.setOnAction(e->handleBtnAccountBook(e));
		
	}
	
	public void handleBtnMain(ActionEvent event) {
		try { //memo manager화면을 없애고 main 화면으로 돌아감  
			Parent main = FXMLLoader.load(getClass().getResource("root.fxml")); //메인화면으로 돌아가기 
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) btnMain.getScene().getWindow();
			primaryStage.setScene(scene);
			
			//StackPane root = (StackPane) btnMain.getScene().getRoot(); //mainController 에서 stackPane을 쓰지 않아 오류남,borderPane으로 바꾸면 아무 일도 안일어남 
			//root.getChildren().remove(memoManager); //그래서 보류
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
}

