package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConverter implements ActionListener {
      JFrame cu_frame;
      String curr;
      JLabel l1,l2;
      JButton b1,b2,fh,cl;
      JTextField t1, t2;

public	TempConverter()
	{

		// Creating a new frame using JFrame
		 cu_frame = new JFrame("TEMPERATURE CONVERTER");


         l1 =new JLabel("Enter The Temperature");
         l1.setBounds(10, 40, 200, 30);
         l2 = new JLabel("Result");
         l2.setBounds(230, 40, 80, 30);

	t1 = new JTextField("0");
	t1.setBounds(150, 40, 50, 30);
	t2 = new JTextField("0");
	t2.setBounds(270, 40, 100, 30);

        b1 = new JButton("Close");
        b1.addActionListener(this);
	b1.setBounds(150, 150, 80, 30);

        fh = new JButton("Fahrenheit");
        fh.setBounds(90, 100, 100, 30);
        fh.addActionListener(this);

        cl = new JButton("Celsius");
        cl.setBounds(200, 100, 80, 30);
        cl.addActionListener(this);

           cu_frame.add(l1);
           cu_frame.add(l2);
	   cu_frame.add(t1);
           cu_frame.add(fh);
           cu_frame.add(cl);
           cu_frame.add(t2);
	   cu_frame.add(b1);
           
            cu_frame.setIconImage(new ImageIcon(getClass().getResource("../IMAGES/temperature.png")).getImage());
      


		   cu_frame.setLayout(null);
		   cu_frame.setSize(400, 300);
		   cu_frame.setVisible(true);
                   cu_frame.setResizable(false);
                   
	}


	    public void actionPerformed(ActionEvent e){

				if(e.getSource()==fh){

					// Converting to double
					double d = Double.parseDouble(t1.getText());

					double d1 = (( 5 *(d  - 32.0)) / 9.0);

					String str1 = String.valueOf(d1);

					t2.setText(str1+"F");

				}else if(e.getSource()==cl){

					double d = Double.parseDouble(t1.getText());

					double d1 = (d*9/5) + 32;

					String str1 = String.valueOf(d1);
					t2.setText(str1+"C");
					}

					if(e.getSource()==b1){
						cu_frame.dispose();
						}
			}

			
}
