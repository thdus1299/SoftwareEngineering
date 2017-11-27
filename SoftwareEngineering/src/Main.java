import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Main extends Application { //Application�� �߻�޼ҵ�
	@Override
	public void start(Stage primaryStage) throws Exception {
		
	//�е�����
	HBox hbox = new HBox();
	hbox.setPrefSize(700, 100);
	hbox.setAlignment(Pos.CENTER);
	hbox.setSpacing(10);
	
	Button button1 = new Button();
	button1.setPrefSize(200, 50);
	button1.setText("�޸���");
	
	Button button2 = new Button();
	button2.setPrefSize(200, 50);
	button2.setText("����");
	
	Button button3 = new Button();
	button3.setPrefSize(200, 50);
	button3.setText("�����");
	
	Button end = new Button();
	end.setPrefSize(200, 50);
	end.setText("End");   
	
	//���� 
	HBox.setMargin(button1, new Insets(10, 10, 10, 50));
	HBox.setMargin(button2, new Insets(10, 10, 10, 50));
	HBox.setMargin(button3, new Insets(10, 10, 10, 50));
	HBox.setMargin(end, new Insets(10, 50, 10, 50));
	hbox.getChildren().add(button1);
	hbox.getChildren().add(button2);
	hbox.getChildren().add(button3);
	hbox.getChildren().add(end);
	
	Scene scene = new Scene(hbox); //����ȭ�� scene
	primaryStage.setTitle("Main");
	primaryStage.setScene(scene); //�� ���� 
	primaryStage.show();//������ �����ֱ�	
	
	/*//�ؾ� �ϴ� �� ������ ��ư�� ���� ȭ�� �̵��ϱ� 
	button1.setOnAction(new EventHandler<ActionEvent>(){ //��� 1 : ���� �θ��� (�̿�) 
		@Override 
		public void handle(ActionEvent event){
			HBox hbox2 = new HBox();
			hbox2.setPrefSize(700, 100);
			hbox2.setAlignment(Pos.CENTER);
			hbox2.setSpacing(10);
			Scene scene2 = new Scene(hbox2); //����ȭ�� scene
			primaryStage.setTitle("MemoManager");
			primaryStage.setScene(scene2); //�� ���� 
			primaryStage.show();//������ �����ֱ�
			
			//Ʋ�� ��� 
			//MemoManager memoManager = new MemoManager();   //MemoManagerŬ���� ������ �� - ���� 
			//memoManager.main(); //start() �ڸ��� ���� Ŭ�������� ó�� �����ϴ� �޼ҵ带 ����� �� 
		}
	});
	
	button2.setOnAction(new EventHandler<ActionEvent>(){
		@Override 
		public void handle(ActionEvent event){
			System.out.println("��ư2 Ŭ�� "); //���� ����
			//Calculator calculator = new Calculator();   //CalculatorŬ���� ������ �� - ���� 
			//calculator.start(); //start() �ڸ��� ���� Ŭ�������� ó�� �����ϴ� �޼ҵ带 ����� �� 
		}
	});
	
	button3.setOnAction(new EventHandler<ActionEvent>(){
		@Override 
		public void handle(ActionEvent event){
			System.out.println("��ư3 Ŭ�� "); //���� ���� 
			//AccountBook accountBook = new AccountBook();   //AccountBookŬ���� ������ �� - ���� 
			//accountBook.start(); //start() �ڸ��� ���� Ŭ�������� ó�� �����ϴ� �޼ҵ带 ����� �� 
		}
	});
	*/
	end.setOnAction(new EventHandler<ActionEvent>(){
		@Override 
		public void handle(ActionEvent event){
			Platform.exit(); //or System.exit(0); //���� ���� 
		}
	});
	
	}
	
	
	public static void main(String[] args) { 
		launch(args); 
	}
}
	
/*
class MainController implements Initializable { //(�̿�) ��� 2 : ��ư�� ��Ʈ�ѷ� �� ���� + stackPane���� 
												//�ٸ� ȭ�鿡�� �Դ� ���� �� �� �ִ�. 
	//Button button1 = new Button();
	HBox hbox1 = new HBox();
	hbox1.setPrefSize(700, 100);
	hbox1.setAlignment(Pos.CENTER);
	hbox1.setSpacing(10);
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		button1.setOnAction(e->handleBtnLogin(e));
	}
	
	public void handleBtnLogin(ActionEvent event) {
		try { 
			System.out.println("��");
			
			hbox1 = new HBox();
			hbox1.setPrefSize(700, 100);
			hbox1.setAlignment(Pos.CENTER);
			hbox1.setSpacing(10);
			
			StackPane main = (StackPane)button1.getScene().getRoot();
			main.getChildren().add(button1);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
}
*///hellohi//
