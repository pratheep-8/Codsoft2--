import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class student extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    JButton b;
    char g;
    student(){
        
        l1 = new JLabel("Grade Calculation");
        l1.setBounds(300, 30, 700, 30);
        l1.setFont(new Font("Railway",Font.BOLD,30));
        add(l1);
        
        
        l2 = new JLabel("Mark 1 : ");
        l2.setBounds(50, 100, 200, 20);
        l2.setFont(new Font("Railway",Font.BOLD,20));
        add(l2);
        
        
        t1 = new JTextField();
        t1.setBounds(150,100,150,20);
        t1.setFont(new Font("Railway",Font.BOLD,20));
        add(t1);
        
        
        
        
        l3 = new JLabel("Mark 2 : ");
        l3.setBounds(50, 150, 200, 20);
        l3.setFont(new Font("Railway",Font.BOLD,20));
        add(l3);
        
        t2 = new JTextField();
        t2.setBounds(150,150,150,20);
        t2.setFont(new Font("Railway",Font.BOLD,20));
        add(t2);
        
        l4 = new JLabel("Mark 3 : ");
        l4.setBounds(50, 200, 200, 20);
        l4.setFont(new Font("Railway",Font.BOLD,20));
        add(l4);
        
        t3 = new JTextField();
        t3.setBounds(150,200,150,20);
        t3.setFont(new Font("Railway",Font.BOLD,20));
        add(t3);
        
        l5 = new JLabel("Mark 4 : ");
        l5.setBounds(50, 250, 200, 20);
        l5.setFont(new Font("Railway",Font.BOLD,20));
        add(l5);
        
        t4 = new JTextField();
        t4.setBounds(150,250,150,20);
        t4.setFont(new Font("Railway",Font.BOLD,20));
        add(t4);
        
        l6 = new JLabel("Mark 5 : ");
        l6.setBounds(50, 300, 200, 20);
        l6.setFont(new Font("Railway",Font.BOLD,20));
        add(l6);
        
        
        t5 = new JTextField();
        t5.setBounds(150,300,150,20);
        t5.setFont(new Font("Railway",Font.BOLD,20));
        add(t5);
        
        b = new JButton("Calculate");
        b.setBounds(250, 350, 150, 25);
        b.setBackground(Color.white);
        b.setForeground(Color.black);
        b.setFont(new Font("Railway",Font.BOLD,20));
        add(b);
        b.addActionListener(this);
        
        l7 = new JLabel("Total Marks :");
        l7.setBounds(50,500,200,20);
        l7.setFont(new Font("Railway",Font.BOLD,20));
        add(l7);
        
        
        
        l8 = new JLabel("Average :");
        l8.setBounds(50,550,250,20);
        l8.setFont(new Font("Railway",Font.BOLD,20));
        add(l8);
        
        
        
        l9 = new JLabel("Grade :");
        l9.setBounds(450,550,250,20);
        l9.setFont(new Font("Railway",Font.BOLD,20));
        add(l9);
        
        
        
        
        setLayout(null);
        setSize(900,900);
        setTitle("Student Details");
        setVisible(true);
        
        getContentPane().setBackground(Color.gray);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==b){
            try
            {
                int m1,m2,m3,m4,m5;
                m1 = Integer.parseInt(t1.getText());
                m2 = Integer.parseInt(t2.getText());
                m3 = Integer.parseInt(t3.getText());
                m4 = Integer.parseInt(t4.getText());
                m5 = Integer.parseInt(t5.getText());
                int tot_marks = m1+m2+m3+m4+m5;
                int  avg = tot_marks/5;
                
                
                System.out.println(tot_marks);
                System.out.println(avg);
                
                
                
                
                
                t6 = new JTextField();
                t6.setBounds(200,500,150,20);
                t6.setFont(new Font("Railway",Font.BOLD,20));
                t6.setText(""+tot_marks);
                add(t6);
                
                
                t7 = new JTextField();
                
                t7.setBounds(200,550,150,25);
                t7.setFont(new Font("Railway",Font.BOLD,20));
                t7.setText(""+avg);
                add(t7);
                
                t8 = new JTextField();
                t8.setBounds(600,550,150,25);
                t8.setFont(new Font("Railway",Font.BOLD,20));
                t8.setText(""+avg);
                add(t8);
                
                if(avg<=100 && avg>90){
                   g ='S';
                  t8.setText(""+g);
                  
                }
                else if(avg<=90 && avg>80){
                    g ='A';
                  t8.setText(""+g);
                  
                }
                
                
                else if(avg<=80 && avg>70){
                    g ='B';
                  t8.setText(""+g);
                  
                }
                
                else if(avg<=70 && avg>60){
                    g ='C';
                  t8.setText(""+g);
                  
                }
                
                else if(avg<=60 && avg>50){
                    g ='D';
                  t8.setText(""+g);
                  
                }
                else {
                    g ='F';
                  t8.setText(""+g);
                }
                
                
            
            
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
    }

   
    public static void main(String args[]) {
       new student();
    }

   
}
