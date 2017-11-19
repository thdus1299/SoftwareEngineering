import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Main extends Application{ //ctrl+shift5 //Application�� �߻�޼ҵ���
	@Override //application�� �߻�޼ҵ�ϱ� �갡 ���� �ִ� stage������ 
	public void start(Stage primaryStage) throws Exception {
		
	//�е�����
	HBox hbox = new HBox();
	hbox.setPrefSize(1200, 100);
	hbox.setAlignment(Pos.CENTER);
	hbox.setSpacing(10); 
	//hbox.setPadding(new Insets(10, 10, 10, 10));
	
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
	end.setText("End");  //���η� ��ġ�ϴ°� ����. - ����Ͽ� �������� 
	
	button1.setOnAction(new EventHandler<ActionEvent>(){
		@Override 
		public void handle(ActionEvent event){
			System.out.println("��ư1 Ŭ�� "); //���� ����
			//MemoManager memoManager = new MemoManager();   //MemoManagerŬ���� ������ �� - ���� 
			//memoManager.start(); //start() �ڸ��� ���� Ŭ�������� ó�� �����ϴ� �޼ҵ带 ����� �� 
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
	
	end.setOnAction(new EventHandler<ActionEvent>(){
		@Override 
		public void handle(ActionEvent event){
			Platform.exit(); //or System.exit(0); //���� ���� 
		}
	});
	
	//���� ����
	HBox.setMargin(button1, new Insets(10, 10, 10, 50));
	HBox.setMargin(button2, new Insets(10, 10, 10, 50));
	HBox.setMargin(button3, new Insets(10, 10, 10, 50));
	HBox.setMargin(end, new Insets(10, 50, 10, 50));
	hbox.getChildren().add(button1);
	hbox.getChildren().add(button2);
	hbox.getChildren().add(button3);
	hbox.getChildren().add(end);
	
	Scene scene = new Scene(hbox);
	primaryStage.setTitle("Main");
	primaryStage.setScene(scene);
	primaryStage.show();//������ �����ֱ�	
	}
	
	public static void main(String[] args) { //jvm���� �����ؾߵǴ� ���ε� 
		launch(args); //�Ǵ� Application.launch(args);
					//launch�� ���������� javafx application�����带 ����
					//start ȣ���� ����
	}
}

//AppMain ��ü ���� �� ���� ������ ����(������ �ؾ� ������ â ��)
//launch�� application�� ���� �ִ� ���� �޼ҵ��� 
//main�� �����̰�, ui�� ���� ������� ������ �װŴ� launch�ȿ��� �������
//�ű⼭ startȣ���
//stage == ������ â
//dd
