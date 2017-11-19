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

public class Main extends Application{ //ctrl+shift5 //Application은 추상메소드임
	@Override //application은 추상메소드니까 얘가 갖고 있는 stage재정의 
	public void start(Stage primaryStage) throws Exception {
		
	//패딩설정
	HBox hbox = new HBox();
	hbox.setPrefSize(1200, 100);
	hbox.setAlignment(Pos.CENTER);
	hbox.setSpacing(10); 
	//hbox.setPadding(new Insets(10, 10, 10, 10));
	
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
	end.setText("End");  //세로로 배치하는게 낫다. - 목요일에 수정예정 
	
	button1.setOnAction(new EventHandler<ActionEvent>(){
		@Override 
		public void handle(ActionEvent event){
			System.out.println("버튼1 클릭 "); //삭제 예정
			//MemoManager memoManager = new MemoManager();   //MemoManager클래스 만들어야 함 - 각자 
			//memoManager.start(); //start() 자리에 각자 클래스에서 처음 시작하는 메소드를 적어야 함 
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
	
	end.setOnAction(new EventHandler<ActionEvent>(){
		@Override 
		public void handle(ActionEvent event){
			Platform.exit(); //or System.exit(0); //삭제 예정 
		}
	});
	
	//마진 설둥
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
	primaryStage.show();//윈도우 보여주기	
	}
	
	public static void main(String[] args) { //jvm에서 실행해야되니 메인도 
		launch(args); //또는 Application.launch(args);
					//launch는 내부적으로 javafx application스레드를 만듬
					//start 호출할 거임
	}
}

//AppMain 객체 생성 및 메인 윈도우 생성(요기까지 해야 윈도우 창 뜸)
//launch는 application이 갖고 있는 정적 메소드임 
//main은 메인이고, ui를 위한 스레드는 별도임 그거는 launch안에서 만들어짐
//거기서 start호출됨
//stage == 윈도우 창
//dd
