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

//fxml ( ���� : ���̾ƿ� �� �۵��ڵ� �и�����, ȥ��, ���� ��� ����) �� java scene builder( ���� : �ڵ� �Է� ���ص� �̹��� ��������� ���̾ƿ� �ϼ�����) �� ���� 
//���� �ѰŴ� ���̾ƿ��� ���ѰŴϱ� ������ �´� �������̽��ʹ� �����մϴ�. �������̽��� �ٸ� Ŭ�������� ȣ���ϴ� ���� ����ϴ� ���Դϴ�. ���̾ƿ����� �����մϴ�. 
//�������̽��� ����� ��ȭ�� �����ٰ� �ϼ̽��ϴ�. ȭ�� ��ȯ�� �߰�, ��ư�̳� ����� ä���� �մϴ�. 
//Main -- root.fxml -- MainController(������� �ൿ�� ���� ���� ���)
//Calculator -- calculator.fxml -- CalculatorController
//MemoManager -- memoManager.fxml -- MemoManagerController �̷� ������ ����

//StackPane �� ���� : ȭ�� ��ȯ + �ִϸ��̼� ȿ�� ���� ( ���� ) 
//�ִϸ��̼��ǹ� : ��ȭ��� ��ȭ���� �Ͻ������� �����ϴ� ��. ȭ�� �Ѿ�� ������ �Ѿ�� �� 
//���⼭�� �ִϸ��̼��� �ʿ�����Ƿ� StackPane �Ⱦ� 

public class MainController implements Initializable { //���� ȭ���� ��Ʈ��
	@FXML private Button btnMemoManager;
	@FXML private Button btnCalculator;
	@FXML private Button btnAccountBook;
	@FXML private Button end;
	
	@Override 
	public void initialize(URL location, ResourceBundle resources) {  //��Ʈ�ѷ��� Initializable �������̽��� ������ Ŭ������ �ۼ��ϸ� �ȴ�.
																		//initializable() �޼ҵ�� ��Ʈ�ѷ� ��ü�� �����ǰ� ���� ȣ��ȴ�.
		btnMemoManager.setOnAction(e->handleBtnMemoManager(e));
		btnCalculator.setOnAction(e->handleBtnCalculator(e));
		btnAccountBook.setOnAction(e->handleBtnAccountBook(e));
		end.setOnAction(e->handleEnd(e));
	} 
	
	public void handleBtnMemoManager(ActionEvent event) {
		try { //memoManager ȭ������ �̵�
			Parent memoManager = FXMLLoader.load(getClass().getResource("memoManager.fxml"));
			Scene scene = new Scene(memoManager);
			Stage primaryStage = (Stage) btnMemoManager.getScene().getWindow();
			primaryStage.setScene(scene);
			
		
			//StackPane root = (StackPane) btnMemoManager.getScene().getRoot();  //StackPane �� ���� : ȭ�� ��ȯ + �ִϸ��̼� ȿ�� ����
			//root.getChildren().add(memoManager);  //ȭ���� �Ѿ�°� �ƴ϶� ����ȭ�鿡 ���ļ� ��Ÿ���� ������ 
		} catch(Exception e) {
			e.printStackTrace();
		}			
	}
	
	private void handleBtnCalculator(ActionEvent e) {
		try { //Calculator ȭ������ �̵�
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

