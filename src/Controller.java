import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Controller {
	
	static View view = new View();
	
	public static void run() {
		view.setVisible(true);
	}

	public static void loadButtonClick(JTextField textBox) {
		
	}
	
	public static void additionClick() {
		Model.currentOperation = Model.Operation.ADDITION;
	}
	public static void subtractionClick() {
		Model.currentOperation = Model.Operation.SUBTRACTION;
	}
	public static void multiplicationClick() {
		Model.currentOperation = Model.Operation.MULTIPLICATION;
	}
	public static void divisionClick() {
		Model.currentOperation = Model.Operation.DIVISION;
	}
	
	public static void calculate(double firstNum, double secondNum) {
		try {
			double result = Model.calculate(firstNum, secondNum);
			view.setResultText(""+result);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static double getLastAnswer() throws Exception {
		return Model.getPreviousSolution();
	}
}
