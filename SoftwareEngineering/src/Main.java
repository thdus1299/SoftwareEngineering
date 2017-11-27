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

public class Main extends Application { //Application은 추상메소드
	@Override
	public void start(Stage primaryStage) throws Exception {
		
	//패딩설정
	HBox hbox = new HBox();
	hbox.setPrefSize(700, 100);
	hbox.setAlignment(Pos.CENTER);
	hbox.setSpacing(10);
	
	Button button1 = new Button();
	button1.setPrefSize(200, 50);
	button1.setText("메모장");
	
	Button button2 = new Button();
	button2.setPrefSize(200, 50);
	button2.setText("계산기");
	
	Button button3 = new Button();
	button3.setPrefSize(200, 50);
	button3.setText("가계부");
	
	Button end = new Button();
	end.setPrefSize(200, 50);
	end.setText("End");   
	
	//마진 
	HBox.setMargin(button1, new Insets(10, 10, 10, 50));
	HBox.setMargin(button2, new Insets(10, 10, 10, 50));
	HBox.setMargin(button3, new Insets(10, 10, 10, 50));
	HBox.setMargin(end, new Insets(10, 50, 10, 50));
	hbox.getChildren().add(button1);
	hbox.getChildren().add(button2);
	hbox.getChildren().add(button3);
	hbox.getChildren().add(end);
	
	Scene scene = new Scene(hbox); //메인화면 scene
	primaryStage.setTitle("Main");
	primaryStage.setScene(scene); //씬 설정 
	primaryStage.show();//윈도우 보여주기	
	
	/*//해야 하는 것 세가지 버튼에 대해 화면 이동하기 
	button1.setOnAction(new EventHandler<ActionEvent>(){ //방법 1 : 직접 부르기 (미완) 
		@Override 
		public void handle(ActionEvent event){
			HBox hbox2 = new HBox();
			hbox2.setPrefSize(700, 100);
			hbox2.setAlignment(Pos.CENTER);
			hbox2.setSpacing(10);
			Scene scene2 = new Scene(hbox2); //메인화면 scene
			primaryStage.setTitle("MemoManager");
			primaryStage.setScene(scene2); //씬 설정 
			primaryStage.show();//윈도우 보여주기
			
			//틀린 방법 
			//MemoManager memoManager = new MemoManager();   //MemoManager클래스 만들어야 함 - 각자 
			//memoManager.main(); //start() 자리에 각자 클래스에서 처음 시작하는 메소드를 적어야 함 
		}
	});
	
	button2.setOnAction(new EventHandler<ActionEvent>(){
		@Override 
		public void handle(ActionEvent event){
			System.out.println("버튼2 클릭 "); //삭제 예정
			//Calculator calculator = new Calculator();   //Calculator클래스 만들어야 함 - 각자 
			//calculator.start(); //start() 자리에 각자 클래스에서 처음 시작하는 메소드를 적어야 함 
		}
	});
	
	button3.setOnAction(new EventHandler<ActionEvent>(){
		@Override 
		public void handle(ActionEvent event){
			System.out.println("버튼3 클릭 "); //삭제 예정 
			//AccountBook accountBook = new AccountBook();   //AccountBook클래스 만들어야 함 - 각자 
			//accountBook.start(); //start() 자리에 각자 클래스에서 처음 시작하는 메소드를 적어야 함 
		}
	});
	*/
	end.setOnAction(new EventHandler<ActionEvent>(){
		@Override 
		public void handle(ActionEvent event){
			Platform.exit(); //or System.exit(0); //삭제 예정 
		}
	});
	
	}
	
	
	public static void main(String[] args) { 
		launch(args); 
	}
}
	
/*
class MainController implements Initializable { //(미완) 방법 2 : 버튼당 컨트롤러 롤 관리 + stackPane쓰면 
												//다른 화면에서 왔다 갔다 할 수 있다. 
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
			System.out.println("올");
			
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
