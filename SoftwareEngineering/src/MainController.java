import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

//fxml ( 장점 : 레이아웃 과 작동코드 분리가능, 혼동, 오류 우려 적음) 과 java scene builder( 장점 : 코드 입력 안해도 이미지 끌어넣으면 레이아웃 완성가능) 로 했음 
//지금 한거는 레이아웃에 관한거니까 과제로 냈던 인터페이스와는 무관합니다. 인터페이스는 다른 클래스에서 호출하는 것을 명시하는 것입니다. 레이아웃과는 무관합니다. 
//인터페이스도 사소한 변화는 괜찮다고 하셨습니다. 화면 전환만 했고, 버튼이나 기능을 채워야 합니다. 
//Main -- root.fxml -- MainController(사용자의 행동에 대한 조절 담당)
//Calculator -- calculator.fxml -- CalculatorController
//MemoManager -- memoManager.fxml -- MemoManagerController 이런 식으로 대응

//StackPane 을 쓰면 : 화면 전환 + 애니매이션 효과 가능 ( 삭제 ) 
//애니메이션의미 : 앞화면과 뒤화면이 일시적으로 공존하는 것. 화면 넘어갈때 스르륵 넘어가는 것 
//여기서는 애니메이션이 필요없으므로 StackPane 안씀 

public class MainController implements Initializable { //메인 화면을 컨트롤
	@FXML private Button btnMemoManager;
	@FXML private Button btnCalculator;
	@FXML private Button btnAccountBook;
	@FXML private Button end;
	
	@Override 
	public void initialize(URL location, ResourceBundle resources) {  //컨트롤러는 Initializable 인터페이스를 구현한 클래스로 작성하면 된다.
																		//initializable() 메소드는 컨트롤러 객체가 생성되고 나서 호출된다.
		btnMemoManager.setOnAction(e->handleBtnMemoManager(e));
		btnCalculator.setOnAction(e->handleBtnCalculator(e));
		btnAccountBook.setOnAction(e->handleBtnAccountBook(e));
		end.setOnAction(e->handleEnd(e));
	} 
	
	public void handleBtnMemoManager(ActionEvent event) {
		try { //memoManager 화면으로 이동
			Parent memoManager = FXMLLoader.load(getClass().getResource("memoManager.fxml"));
			Scene scene = new Scene(memoManager);
			Stage primaryStage = (Stage) btnMemoManager.getScene().getWindow();
			primaryStage.setScene(scene);
			
		
			//StackPane root = (StackPane) btnMemoManager.getScene().getRoot();  //StackPane 을 쓰면 : 화면 전환 + 애니매이션 효과 가능
			//root.getChildren().add(memoManager);  //화면이 넘어가는게 아니라 메인화면에 겹쳐서 나타나서 안했음 
		} catch(Exception e) {
			e.printStackTrace();
		}			
	}
	
	private void handleBtnCalculator(ActionEvent e) {
		try { //Calculator 화면으로 이동
			Parent calculator = FXMLLoader.load(getClass().getResource("calculator.fxml"));
			Scene scene = new Scene(calculator);
			Stage primaryStage = (Stage) btnCalculator.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch(Exception e2) {
			e2.printStackTrace();
		}			
	}
	
	private void handleBtnAccountBook(ActionEvent e) {
		try { 
			Parent accountBook = FXMLLoader.load(getClass().getResource("accountBook.fxml"));
			Scene scene = new Scene(accountBook);
			Stage primaryStage = (Stage) btnAccountBook.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch(Exception e3) {
			e3.printStackTrace();
		}			
	}
	
	private void handleEnd(ActionEvent e) {
		try { 
			Platform.exit(); //or System.exit(0); 
		} catch(Exception e4) {
			e4.printStackTrace();
		}			
	}
}

