import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.GridBagLayout;

import javax.swing.JTextField;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Component;

import javax.swing.Box;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;


public class View extends JFrame {

	private JPanel contentPane;
	private JTextField firstNumberTextBox;
	private JTextField secondNumberTextBox;
	private JTextField resultTextBox;
	private JLabel currOpLabel;

	/**
	 * Create the frame.
	 */
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		firstNumberTextBox = new JTextField();
		GridBagConstraints gbc_firstNumberTextBox = new GridBagConstraints();
		gbc_firstNumberTextBox.insets = new Insets(0, 0, 5, 5);
		gbc_firstNumberTextBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_firstNumberTextBox.gridx = 0;
		gbc_firstNumberTextBox.gridy = 0;
		contentPane.add(firstNumberTextBox, gbc_firstNumberTextBox);
		firstNumberTextBox.setColumns(10);
		
		currOpLabel = new JLabel("[   ]");
		GridBagConstraints gbc_currOpLabel = new GridBagConstraints();
		gbc_currOpLabel.insets = new Insets(0, 0, 5, 5);
		gbc_currOpLabel.anchor = GridBagConstraints.EAST;
		gbc_currOpLabel.gridx = 1;
		gbc_currOpLabel.gridy = 0;
		contentPane.add(currOpLabel, gbc_currOpLabel);
		
		secondNumberTextBox = new JTextField();
		GridBagConstraints gbc_secondNumberTextBox = new GridBagConstraints();
		gbc_secondNumberTextBox.insets = new Insets(0, 0, 5, 0);
		gbc_secondNumberTextBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_secondNumberTextBox.gridx = 2;
		gbc_secondNumberTextBox.gridy = 0;
		contentPane.add(secondNumberTextBox, gbc_secondNumberTextBox);
		secondNumberTextBox.setColumns(10);
		
		JButton loadSavedValueBtn1 = new JButton("Load Saved Value");
		loadSavedValueBtn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double lastNum = Controller.getLastAnswer();
					firstNumberTextBox.setText(""+lastNum);
				}catch(Exception e1) {
					
				}
			}
		});
		GridBagConstraints gbc_loadSavedValueBtn1 = new GridBagConstraints();
		gbc_loadSavedValueBtn1.insets = new Insets(0, 0, 5, 5);
		gbc_loadSavedValueBtn1.gridx = 0;
		gbc_loadSavedValueBtn1.gridy = 1;
		contentPane.add(loadSavedValueBtn1, gbc_loadSavedValueBtn1);
		
		JButton loadSavedValueBtn2 = new JButton("Load Saved Value");
		loadSavedValueBtn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double lastNum = Controller.getLastAnswer();
					secondNumberTextBox.setText(""+lastNum);
				}catch(Exception e1) {
					
				}
			}
		});
		GridBagConstraints gbc_loadSavedValueBtn2 = new GridBagConstraints();
		gbc_loadSavedValueBtn2.insets = new Insets(0, 0, 5, 0);
		gbc_loadSavedValueBtn2.gridx = 2;
		gbc_loadSavedValueBtn2.gridy = 1;
		contentPane.add(loadSavedValueBtn2, gbc_loadSavedValueBtn2);
		
		JPanel operationsPanel = new JPanel();
		GridBagConstraints gbc_operationsPanel = new GridBagConstraints();
		gbc_operationsPanel.insets = new Insets(0, 0, 5, 0);
		gbc_operationsPanel.gridwidth = 3;
		gbc_operationsPanel.fill = GridBagConstraints.BOTH;
		gbc_operationsPanel.gridx = 0;
		gbc_operationsPanel.gridy = 2;
		contentPane.add(operationsPanel, gbc_operationsPanel);
		GridBagLayout gbl_operationsPanel = new GridBagLayout();
		gbl_operationsPanel.columnWidths = new int[]{0, 37, 41, 37, 0};
		gbl_operationsPanel.rowHeights = new int[]{25, 0};
		gbl_operationsPanel.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_operationsPanel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		operationsPanel.setLayout(gbl_operationsPanel);
		
		JButton additionButton = new JButton("+");
		additionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.additionClick();
				setOperationLabelText(" + ");
			}
		});
		GridBagConstraints gbc_additionButton = new GridBagConstraints();
		gbc_additionButton.anchor = GridBagConstraints.NORTH;
		gbc_additionButton.insets = new Insets(0, 0, 0, 5);
		gbc_additionButton.gridx = 0;
		gbc_additionButton.gridy = 0;
		operationsPanel.add(additionButton, gbc_additionButton);
		
		JButton subtractionButton = new JButton("-");
		subtractionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.subtractionClick();
				setOperationLabelText(" - ");
			}
		});
		GridBagConstraints gbc_subtractionButton = new GridBagConstraints();
		gbc_subtractionButton.anchor = GridBagConstraints.NORTH;
		gbc_subtractionButton.insets = new Insets(0, 0, 0, 5);
		gbc_subtractionButton.gridx = 1;
		gbc_subtractionButton.gridy = 0;
		operationsPanel.add(subtractionButton, gbc_subtractionButton);
		
		JButton multiplicationButton = new JButton("*");
		multiplicationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.multiplicationClick();
				setOperationLabelText(" * ");
			}
		});
		GridBagConstraints gbc_multiplicationButton = new GridBagConstraints();
		gbc_multiplicationButton.anchor = GridBagConstraints.NORTH;
		gbc_multiplicationButton.insets = new Insets(0, 0, 0, 5);
		gbc_multiplicationButton.gridx = 2;
		gbc_multiplicationButton.gridy = 0;
		operationsPanel.add(multiplicationButton, gbc_multiplicationButton);
		
		JButton divisionButton = new JButton("/");
		divisionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Controller.divisionClick();
				setOperationLabelText(" / ");
			}
		});
		GridBagConstraints gbc_divisionButton = new GridBagConstraints();
		gbc_divisionButton.anchor = GridBagConstraints.NORTH;
		gbc_divisionButton.gridx = 3;
		gbc_divisionButton.gridy = 0;
		operationsPanel.add(divisionButton, gbc_divisionButton);
		
		resultTextBox = new JTextField();
		resultTextBox.setEnabled(false);
		GridBagConstraints gbc_resultTextBox = new GridBagConstraints();
		gbc_resultTextBox.insets = new Insets(0, 0, 0, 5);
		gbc_resultTextBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_resultTextBox.gridx = 0;
		gbc_resultTextBox.gridy = 3;
		contentPane.add(resultTextBox, gbc_resultTextBox);
		resultTextBox.setColumns(10);
		
		JButton calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Controller.calculate(getFirstNumber(), getSecondNumber());
				}catch(Exception e1) {
					//e1.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_calculateButton = new GridBagConstraints();
		gbc_calculateButton.gridx = 2;
		gbc_calculateButton.gridy = 3;
		contentPane.add(calculateButton, gbc_calculateButton);
	}

	public void setOperationLabelText(String text) {
		this.currOpLabel.setText(text);
		this.currOpLabel.repaint();
	}
	
	public double getFirstNumber() throws NumberFormatException {
		return Double.parseDouble(firstNumberTextBox.getText());
	}
	
	public double getSecondNumber() throws NumberFormatException {
		return Double.parseDouble(secondNumberTextBox.getText());
	}

	public void setResultText(String string) {
		this.resultTextBox.setText(string);
	}

	public void setFirstNumberText(String string) {
		this.firstNumberTextBox.setText(string);
	}

	public void setSecondNumberText(String string) {
		this.secondNumberTextBox.setText(string);
	}

}
