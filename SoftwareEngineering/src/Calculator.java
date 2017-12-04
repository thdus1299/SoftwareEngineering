import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

class Calculator extends JFrame implements ActionListener {
	
	//결과창
	public double resultNum=0;
	JPanel resultPanel;
	JTextField resultText;
	
	//사칙연산
	JPanel calcPanel;
	JPanel calcFunctionPanel;
	JTextField calcNum1;
	JTextField calcNum2;
	JButton addButton;
	JButton subButton;
	JButton mulButton;
	JButton divButton;

	//단위변환 
	JPanel tranPanel;
	JPanel tranFunctionPanel;
	JTextField tranNum;	
	JButton poundToKgButton;
	JButton kgToPoundButton;
	JButton inchToCmButton;
	JButton cmToInchButton;
	JButton fahToCelButton;
	JButton celToFahButton;
	
	Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		drawCalcLayout();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton pressBtn = (JButton)e.getSource();
		if(pressBtn.equals(addButton)){
			addCalc(Double.parseDouble(calcNum1.getText()),Double.parseDouble(calcNum2.getText()));
			resultText.setText(Double.toString(resultNum));
		}
		
		if(pressBtn.equals(subButton)){
			subCalc(Double.parseDouble(calcNum1.getText()),Double.parseDouble(calcNum2.getText()));
			resultText.setText(Double.toString(resultNum));
		}

		if(pressBtn.equals(poundToKgButton)) {
			poundToKgCalc(Double.parseDouble(tranNum.getText()));
			resultText.setText(Double.toString(resultNum)+"kg");
		}
   
		if(pressBtn.equals(kgToPoundButton)) {
			kgToPoundCalc(Double.parseDouble(tranNum.getText()));
			resultText.setText(Double.toString(resultNum)+"pound");
		}
		
		if(pressBtn.equals(inchToCmButton)) {
			inchToCmCalc(Double.parseDouble(tranNum.getText()));
			resultText.setText(Double.toString(resultNum)+"cm");
		}
		
		if(pressBtn.equals(cmToInchButton)) {
			cmToInchCalc(Double.parseDouble(tranNum.getText()));
			resultText.setText(Double.toString(resultNum)+"inch");
		}
		
		if(pressBtn.equals(fahToCelButton)) {
			fahToCelCalc(Double.parseDouble(tranNum.getText()));
			resultText.setText(Double.toString(resultNum)+"C");
		}
		
		if(pressBtn.equals(celToFahButton)) {
			celToFahCalc(Double.parseDouble(tranNum.getText()));
			resultText.setText(Double.toString(resultNum)+"F");
		}
		
	}
	
	public void addCalc(double num1, double num2) {
		
		resultNum=(num1+num2);
	}
	
	public void subCalc(double num1, double num2) {
		
		resultNum=(num1-num2);
	}
	
	public void poundToKgCalc(double num) {
		resultNum=(num*0.453592);
	}
	
	public void kgToPoundCalc(double num) {
		resultNum=(num*2.20462);
	}
	
	public void inchToCmCalc(double num) {
		resultNum=(num*2.54);
	}
	
	public void cmToInchCalc(double num) {
		resultNum=(num*0.393701);
	}
	
	public  void fahToCelCalc(double num) {
		resultNum=((num-32)/1.8);
	}
	
	public void celToFahCalc(double num) {
		resultNum=(num*1.8+32);
	}
	
	
	public void drawCalcLayout() {
		
		resultPanel = new JPanel();
		resultPanel.setLayout(new BorderLayout());
		resultPanel.setBorder(new TitledBorder("계산 결과 창"));			
		resultText = new JTextField(20);
		resultPanel.add(resultText);
		resultText.setEditable(false);
		add(resultPanel, BorderLayout.NORTH);
		
		
		calcPanel = new JPanel();
		calcPanel.setLayout(new BorderLayout());
		calcPanel.setBorder(new TitledBorder("사칙연산"));	
		calcNum1 = new JTextField(20);
		calcNum2 = new JTextField(20);
		calcPanel.add(calcNum1,BorderLayout.WEST);
		calcPanel.add(calcNum2,BorderLayout.EAST);	
		
		add(calcPanel,BorderLayout.CENTER);
		
		calcFunctionPanel = new JPanel();
		
		calcPanel.add(calcFunctionPanel,BorderLayout.SOUTH);
		calcFunctionPanel.setLayout(new GridLayout(4,1));
		
		addButton= new JButton("add");
		calcFunctionPanel.add(addButton);
		addButton.addActionListener(this);

		subButton= new JButton("sub");
		calcFunctionPanel.add(subButton);
		subButton.addActionListener(this);
		
		mulButton= new JButton("multi");
		calcFunctionPanel.add(mulButton);
		mulButton.addActionListener(this);
		
		divButton= new JButton("divide");
		calcFunctionPanel.add(divButton);
		divButton.addActionListener(this);
		
		
		tranPanel = new JPanel();
		tranPanel.setLayout(new BorderLayout());
		tranPanel.setBorder(new TitledBorder("단위변환"));		
		add(tranPanel,BorderLayout.SOUTH);	
		
		tranNum = new JTextField(20);
		tranPanel.add(tranNum,BorderLayout.NORTH);
	
		tranFunctionPanel = new JPanel();
		
		tranPanel.add(tranFunctionPanel,BorderLayout.SOUTH);
		tranFunctionPanel.setLayout(new GridLayout(6,1));
		
		poundToKgButton= new JButton("poundToKg");
		tranFunctionPanel.add(poundToKgButton);
		poundToKgButton.addActionListener(this);
	
		
		kgToPoundButton= new JButton("kgToPound");
		tranFunctionPanel.add(kgToPoundButton);
		kgToPoundButton.addActionListener(this);
		
		inchToCmButton= new JButton("inchToCm");
		tranFunctionPanel.add(inchToCmButton);
		inchToCmButton.addActionListener(this);
		
		cmToInchButton= new JButton("cmToInch");
		tranFunctionPanel.add(cmToInchButton);
		cmToInchButton.addActionListener(this);
		
		fahToCelButton= new JButton("fahToCel");
		tranFunctionPanel.add(fahToCelButton);
		fahToCelButton.addActionListener(this);
		
		celToFahButton= new JButton("celToFah");
		tranFunctionPanel.add(celToFahButton);
		celToFahButton.addActionListener(this);
		
		pack();
		setVisible(true);
		
	}
}


