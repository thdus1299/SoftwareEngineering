import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application { //Application�� �߻�޼ҵ�
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Main"); 
		Parent root = FXMLLoader.load(Main.class.getResource("root.fxml")); //fxml ���� �ε� 
		Scene scene = new Scene(root); //�� ���� 
		primaryStage.setScene(scene); //�� ���� 
		//primaryStage.setWidth(350); //�������� ���� ���� ���� - ���� 
		//primaryStage.setHeight(500); //�������� ���� ���� ���� 
		//primaryStage.setResizable(false); // �������� ũ�⸦ ������ �� ������ �� 
		primaryStage.show();//������ �����ֱ�	
	}
	
	public static void main(String[] args){
		launch(args);
	}
}