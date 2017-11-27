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

public class MemoManagerController implements Initializable{ //���� ȭ���� �����ϴ� Ŭ���� 
	@FXML private BorderPane memoManager; 
	@FXML private Button btnMain;
	//fxml���� ���̾ƿ� �߰��Ѱ� �߰� ���� 
	
	@Override 
	public void initialize(URL location, ResourceBundle resources) {
		btnMain.setOnAction(e->handleBtnMain(e));
		//btnCalculator.setOnAction(e->handleBtnCalculator(e));
		//btnAccountBook.setOnAction(e->handleBtnAccountBook(e));
		
	}
	
	public void handleBtnMain(ActionEvent event) {
		try { //memo managerȭ���� ���ְ� main ȭ������ ���ư�  
			Parent main = FXMLLoader.load(getClass().getResource("root.fxml")); //����ȭ������ ���ư��� 
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) btnMain.getScene().getWindow();
			primaryStage.setScene(scene);
			
			//StackPane root = (StackPane) btnMain.getScene().getRoot(); //mainController ���� stackPane�� ���� �ʾ� ������,borderPane���� �ٲٸ� �ƹ� �ϵ� ���Ͼ 
			//root.getChildren().remove(memoManager); //�׷��� ����
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
}

