import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CalculatorController implements Initializable{ //���� ȭ���� �����ϴ� Ŭ���� 
	@FXML private Button addButton;  
	@FXML private Button subButton;
	@FXML private Button mulButton;
	@FXML private Button divButton;
	@FXML private TextField resultText;
    private double resultNum=0;

	@FXML private TextField calcNum1;
	@FXML private TextField calcNum2;
	
	@FXML private Button poundToKgButton;
	@FXML private Button kgToPoundButton;
	@FXML private Button inchToCmButton;
	@FXML private Button cmToInchButton;
	@FXML private Button fahToCelButton;
	@FXML private Button celToFahButton;
	
	@FXML private TextField tranNum;
	
	@FXML private Button btnMain;
	//fxml���� ���̾ƿ� �߰��Ѱ� �߰� ���� 
	
	@Override 
	public void initialize(URL location, ResourceBundle resources) {
		addButton.setOnAction(e->addCalcButton(e));
		subButton.setOnAction(e->subCalcButton(e));
		
		poundToKgButton.setOnAction(e->poundToKgTranButton(e));
		kgToPoundButton.setOnAction(e->kgToPoundTranButton(e));
		inchToCmButton.setOnAction(e->inchToCmTranButton(e));
		cmToInchButton.setOnAction(e->cmToInchTranButton(e));
		fahToCelButton.setOnAction(e->fahToCelTranButton(e));
		celToFahButton.setOnAction(e->celToFahTranButton(e));
		
		btnMain.setOnAction(e->handleBtnMain(e));
	}
	
	//��Ģ����(���ϱ�� ������� �񼱾��� �Ͻñ�� ��)
	
	public void addCalcButton(ActionEvent event) {
		try { 
			addCalc(Double.parseDouble(calcNum1.getText()),Double.parseDouble(calcNum2.getText()));
			resultText.setText(Double.toString(resultNum));
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
	
	public void addCalc(double num1, double num2) {
		
		resultNum=(num1+num2);
	}
	
	public void subCalcButton(ActionEvent event) {
		try { 
			subCalc(Double.parseDouble(calcNum1.getText()),Double.parseDouble(calcNum2.getText()));
			resultText.setText(Double.toString(resultNum));
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
	
	public void subCalc(double num1, double num2) {
		
		resultNum=(num1-num2);
	}
	
	///������ȯ
	
	public void poundToKgTranButton(ActionEvent event) {
		try { 
			poundToKgCalc(Double.parseDouble(tranNum.getText()));
			resultText.setText(Double.toString(resultNum));
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
	
	public void poundToKgCalc(double num) {
		resultNum=(num*0.453592);
	}
	
	public void kgToPoundTranButton(ActionEvent event) {
		try {
			kgToPoundCalc(Double.parseDouble(tranNum.getText()));
			resultText.setText(Double.toString(resultNum));
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
	
	public void kgToPoundCalc(double num) {
		resultNum=(num*2.20462);
	}
	
	public void inchToCmTranButton(ActionEvent event) {
		try {
			inchToCmCalc(Double.parseDouble(tranNum.getText()));
			resultText.setText(Double.toString(resultNum));
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
	
	public void inchToCmCalc(double num) {
		resultNum=(num*2.54);
	}
	
	public void cmToInchTranButton(ActionEvent event) {
		try { 
			cmToInchCalc(Double.parseDouble(tranNum.getText()));
			resultText.setText(Double.toString(resultNum));
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
	
	public void cmToInchCalc(double num) {
		resultNum=(num*0.393701);
	}
	
	public void fahToCelTranButton(ActionEvent event) {
		try { 
			fahToCelCalc(Double.parseDouble(tranNum.getText()));
			resultText.setText(Double.toString(resultNum));
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
	
	public  void fahToCelCalc(double num) {
		resultNum=((num-32)/1.8);
	}
	
	public void celToFahTranButton(ActionEvent event) {
		try { 
			celToFahCalc(Double.parseDouble(tranNum.getText()));
			resultText.setText(Double.toString(resultNum));
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
	
	public void celToFahCalc(double num) {
		resultNum=(num*1.8+32);
	}
	
	//main ȭ������ ���ư�
	
	public void handleBtnMain(ActionEvent event) {
		try { 
			Parent main = FXMLLoader.load(getClass().getResource("root.fxml")); //����ȭ������ ���ư��� 
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) btnMain.getScene().getWindow();
			primaryStage.setScene(scene);
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
	
	
}

