package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter implements ActionListener {
     public JFrame cu_frame;
     public JLabel l1,l2;
     public JButton b1,b2,db,rb,eb,yb;
     public JTextField t1, t2;

public	CurrencyConverter()
	{

		// Creating a new frame using JFrame
		 cu_frame = new JFrame("CURRENCY CONVERTER");


         l1 =new JLabel("Enter The amount in rupees");
         l1.setBounds(10, 40, 200, 30);
         l2 = new JLabel("Result");
         l2.setBounds(240, 40, 80, 30);

	t1 = new JTextField("0");
	t1.setBounds(170, 40, 50, 30);
	t2 = new JTextField("0");
	t2.setBounds(280, 40, 100, 30);


        b1 = new JButton("Close");
        b1.addActionListener(this);
	b1.setBounds(150, 150, 80, 30);

        db = new JButton("Dollar");
        db.setBounds(20, 100, 80, 30);
        db.addActionListener(this);
        rb = new JButton("Riyal");
        rb.setBounds(100, 100, 80, 30);
        rb.addActionListener(this);
        eb = new JButton("Euro");
        eb.setBounds(180, 100, 80, 30);
        eb.addActionListener(this);
        yb = new JButton("Yen");
        yb.setBounds(260, 100, 80, 30);
        yb.addActionListener(this);

           cu_frame.add(l1);
           cu_frame.add(l2);
	   cu_frame.add(t1);
           cu_frame.add(db);
           cu_frame.add(eb);
           cu_frame.add(rb);
           cu_frame.add(yb);
	   cu_frame.add(t2);
	   cu_frame.add(b1);
                   
           cu_frame.setIconImage(new ImageIcon(getClass().getResource("../IMAGES/dollar.png")).getImage());


	   cu_frame.setLayout(null);
	   cu_frame.setSize(400, 300);
	   cu_frame.setVisible(true);
           cu_frame.setResizable(false);
	}


	    public void actionPerformed(ActionEvent e){

				if(e.getSource()==db){

					// Converting to double
					double d = Double.parseDouble(t1.getText());

					// Converting rupees to dollars
					double d1 = (d / 173.58);

					// Getting the string value of the
					// calculated value
					String str1 = String.valueOf(d1);

					// Placing it in the text box
					t2.setText(str1);
				}else if(e.getSource()==rb){
					// Converting to double
					double d = Double.parseDouble(t1.getText());

					// Converting rupees to riyal
					double d1 = (d / 46.28);

					// Getting the string value of the
					// calculated value
					String str1 = String.valueOf(d1);

					// Placing it in the text box
					t2.setText(str1);
					}else if(e.getSource()==eb){
						// Converting to double
					double d = Double.parseDouble(t1.getText());

					// Converting rupees to euro
					double d1 = (d / 202.12);

					// Getting the string value of the
					// calculated value
				    String str1 = String.valueOf(d1);

				     // Placing it in the text box
					t2.setText(str1);

						}else if(e.getSource()==yb){
						// Converting to double
					double d = Double.parseDouble(t1.getText());

					// Converting rupees to yen
					double d1 = (d / 1.53);

					// Getting the string value of the
					// calculated value
				    String str1 = String.valueOf(d1);

				     // Placing it in the text box
					t2.setText(str1);

						}

					if(e.getSource()==b1){
						cu_frame.dispose();
						}
			}

			
}
