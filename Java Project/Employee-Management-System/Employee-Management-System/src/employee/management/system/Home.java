package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    JButton view, add, update, remove;
    
    Home() {
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 550, 630);
        add(image);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(650, 20, 400, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        add(heading);
        
        add = new JButton("Add Employee");
        add.setBounds(700, 200, 250, 40);
        add.setBackground(Color.CYAN);
        add.setForeground(Color.BLACK);
        add.addActionListener(this);
        add(add);
        
        view = new JButton("View Employees");
        view.setBounds(700, 250, 250, 40);
        view.setBackground(Color.CYAN);
        view.setForeground(Color.BLACK);
        view.addActionListener(this);
        add(view);
        
        update = new JButton("Update Employee");
        update.setBounds(700, 300, 250, 40);
        update.setBackground(Color.CYAN);
        update.setForeground(Color.BLACK);
        update.addActionListener(this);
        add(update);
        
        remove = new JButton("Remove Employee");
        remove.setBounds(700, 350, 250, 40);
        remove.setBackground(Color.CYAN);
        remove.setForeground(Color.BLACK);
        remove.addActionListener(this);
        add(remove);
        
        setSize(1120, 630);
        setLocation(250, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        } else {
            setVisible(false);
            new RemoveEmployee();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
