import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application { //Application은 추상메소드
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Main"); 
		Parent root = FXMLLoader.load(Main.class.getResource("root.fxml")); //fxml 파일 로드 
		Scene scene = new Scene(root); //씬 생성 
		primaryStage.setScene(scene); //씬 설정 
		//primaryStage.setWidth(350); //윈도우의 고정 높이 설정 - 생략 
		//primaryStage.setHeight(500); //윈도우의 고정 높이 설정 
		//primaryStage.setResizable(false); // 윈도우의 크기를 조정할 수 없도록 함 
		primaryStage.show();//윈도우 보여주기	
	}
	
	public static void main(String[] args){
		launch(args);
	}
}