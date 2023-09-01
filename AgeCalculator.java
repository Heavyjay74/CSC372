package module2;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.time.*;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class AgeCalculator extends JFrame implements ActionListener {
   private JButton calcButton;            
   private JLabel yearLabel;
   private JLabel monthLabel;
   private JLabel dayLabel;
   private JLabel ageLabel;                     
   private JSpinner yearSpinner;
   private JSpinner monthSpinner;
   private JSpinner daySpinner;
   private JTextField ageField; 

   AgeCalculator() {
	   
	   int initYear = 2000;
	   int minYear = 1900;
	   int maxYear = 2099;
	   int initMonth = 1;
	   int minMonth = 1;
	   int maxMonth = 12;
	   int initDay = 1;
	   int minDay = 1;
	   int maxDay = 31;
	   int stepVal = 1;
	   
	   JPanel myPanel=new JPanel();  
       myPanel.setBounds(40,80,200,200);    
       myPanel.setBackground(Color.gray);  
	      
      GridBagConstraints layoutConst = null;
      
      SpinnerNumberModel spinnerModel = null;

      setTitle("Age Calculator");
      
      spinnerModel = new SpinnerNumberModel(initYear, minYear, maxYear, stepVal);
      yearSpinner = new JSpinner(spinnerModel);
      
      spinnerModel = new SpinnerNumberModel(initMonth, minMonth, maxMonth, stepVal);
      monthSpinner = new JSpinner(spinnerModel);
      
      spinnerModel = new SpinnerNumberModel(initDay, minDay, maxDay, stepVal);
      daySpinner = new JSpinner(spinnerModel);

      yearLabel = new JLabel("Year of Birth:");
      monthLabel = new JLabel("Month of Birth:");
      dayLabel = new JLabel("Day of Birth:");
      ageLabel = new JLabel("Age (years):");

      calcButton = new JButton("Calculate");
      calcButton.addActionListener(this);

      ageField = new JTextField(15);
      ageField.setEditable(false);

      setLayout(new GridBagLayout());

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 10);
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;
      add(yearLabel, layoutConst);

      layoutConst.gridx = 1;
      layoutConst.gridy = 0;
      add(yearSpinner, layoutConst);

      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      add(monthLabel, layoutConst);
      
      layoutConst.gridx = 1;
      layoutConst.gridy = 1;
      add(monthSpinner, layoutConst);

      layoutConst.gridx = 0;
      layoutConst.gridy = 2;
      add(dayLabel, layoutConst);
      
      layoutConst.gridx = 1;
      layoutConst.gridy = 2;
      add(daySpinner, layoutConst);
      
      layoutConst.gridx = 1;
      layoutConst.gridy = 3;
      add(calcButton, layoutConst);

      layoutConst.gridx = 0;
      layoutConst.gridy = 4;
      add(ageLabel, layoutConst);

      layoutConst.gridx = 1;
      layoutConst.gridy = 4;
      add(ageField, layoutConst);

   }
   @Override
   public void actionPerformed(ActionEvent event) {
	  int year;
	  int month;
	  int day;
      LocalDate dob;
      LocalDate currDate;
      int age;
      
      year = (Integer) yearSpinner.getValue();
      month = (Integer) monthSpinner.getValue();
      day = (Integer) daySpinner.getValue();
      
      dob = LocalDate.of(year, month, day);

      currDate = LocalDate.now();
     
      age = Period.between(dob, currDate).getYears();
      
      ageField.setText(Integer.toString(age));
      
   }

   public static void main(String[] args) {
      AgeCalculator myFrame = new AgeCalculator();

      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
   }

}
