package register;
//By: Pedro M. Buryl - All rights reserved
import javax.swing.*;

public class Register {

    //there will be some bugs for sure, but later I will try to fix it. If you want to leave any tips, feel free ;P

    public static void main(String[] args) {
        
        JFrame f = new JFrame("Register");//creates a new frame
        JTextField namef, snamef, adrsf, emailf;//text fields
        JLabel name, sname, adrs, mstts, gen, email, pwd1, pwd2;//indicators
        JButton b1, b2;//buttons
        JComboBox cb1, cb2;//combo box
        JRadioButton rb1, rb2, rb3, rb4;//radio buttons
        JPasswordField pwdf1, pwdf2;//password fields
        String address[] = {"Street","Avenue","Apartment","Block"};//contents of the first combo box
        String mar_stts[] = {"Not married","Commited","Married","Divorced"};//contents of the second combo box
        
        //organization of indicators in the frame
            //setBounds (x, y, x, y) defines the position and size
        name = new JLabel("Name:");
        name.setBounds(98, 50, 200, 30);
        sname = new JLabel("Surname:");
        sname.setBounds(77, 100, 200, 30);
        adrs = new JLabel("Address:");
        adrs.setBounds(80, 150, 200, 30);
        mstts = new JLabel("Marital status:");
        mstts.setBounds(38, 200, 200, 30);
        gen = new JLabel("Gender:");
        gen.setBounds(86, 250, 200, 30);
        email = new JLabel("E-mail:");
        email.setBounds(95, 300, 200, 30);
        pwd1 = new JLabel("Password:");
        pwd1.setBounds(66, 350, 200, 30);
        pwd2 = new JLabel("Confirm password:");
        pwd2.setBounds(10, 400, 200, 30);
        
        //organization of text fields in the frame
        namef = new JTextField("");
        namef.setBounds(145, 50, 504, 30);
        snamef = new JTextField("");
        snamef.setBounds(145, 100, 504, 30);
        adrsf = new JTextField("");
        adrsf.setBounds(250, 150, 400, 30);
        emailf = new JTextField("");
        emailf.setBounds(145, 300, 504, 30);
        
        //organization of password fields in the frame
        pwdf1 = new JPasswordField();
        pwdf1.setBounds(145, 350, 200, 30);
        pwdf2 = new JPasswordField();
        pwdf2.setBounds(145, 400, 200, 30);
        
        //organization of combo boxes in the frame
        cb1 = new JComboBox(address);
        cb1.setBounds(145, 150, 100, 30);
        cb2 = new JComboBox(mar_stts);
        cb2.setBounds(145, 200, 150, 30);
        
        // organization of the buttons in the frame
        b1 = new JButton("CONFIRM");
        b1.setBounds(500, 500, 110, 30);
        b2 = new JButton("CANCEL");
        b2.setBounds(610, 500, 100, 30);
        
        //organization of the radio buttons in the frame
        rb1 = new JRadioButton("Male");
        rb1.setBounds(150, 250, 70, 30);
        rb2 = new JRadioButton("Female");
        rb2.setBounds(220, 250, 80, 30);
        rb3 = new JRadioButton("Other");
        rb3.setBounds(300, 250, 70, 30);
        rb4 = new JRadioButton("I prefer not to declare");
        rb4.setBounds(380, 250, 200, 30);
        
        //creating a button group and adding the radio buttons to the group
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);
        
        //adding the indicators in the frame
        f.add(name);
        f.add(sname);
        f.add(adrs);
        f.add(mstts);
        f.add(gen);
        f.add(email);
        f.add(pwd1);
        f.add(pwd2);
        
        //adding the text fields in the frame
        f.add(namef);
        f.add(snamef);
        f.add(adrsf);
        f.add(emailf);
        
        //adding the password fields in the frame
        f.add(pwdf1);
        f.add(pwdf2);
        
        //adding the combo boxes in the frame
        f.add(cb1);
        f.add(cb2);
        
        //adding the radio buttons in the frame
        f.add(rb1);
        f.add(rb2);
        f.add(rb3);
        f.add(rb4);
        
        //adding the buttons in the frame
        f.add(b1);
        f.add(b2);
        
        f.setSize(800, 600);//frame dimensions
        f.setLocationRelativeTo(null);//with the parameter 'null' makes the frame appear in the middle of the screen
        f.setLayout(null);//I don't know what to do
        f.setVisible(true);//leaves the frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//defines that when clicking on the 'close' button the program ends
    }
}