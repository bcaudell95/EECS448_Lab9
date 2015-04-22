import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;


public class Controller {

	//Action listeners invoked by the GUI buttons
	
	public static final ActionListener firstLoadAction(JTextField textBox) {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		};
	}

	public static final ActionListener additionAction = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
		}
	};
	public static final ActionListener subtractionAction = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
		}
	};
	public static final ActionListener multiplicationAction = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
		}
	};
	public static final ActionListener divisionAction = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
		}
	};
	
	public static final ActionListener calculateAction = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
		}
	};
}
