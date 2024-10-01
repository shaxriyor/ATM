package atm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener{
    JLabel text1, textCard, textPin, text2;
    JTextField cardNo;
    JPasswordField pin;
    JButton login, clear, register;
  
    Login(){
        setTitle("ATM {NBU}");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm/icons/icon.jpg"));
        Image i2 = i1.getImage ().getScaledInstance (130, 100, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds (70, 35, 130, 100);
        add(l11);
        
        text1 = new JLabel("WELCOME TO");
        text1.setFont(new Font("Rockwell", Font.BOLD, 40));
        text1.setBounds(220, 40, 400, 40);
        add(text1);

        text2 = new JLabel("ATM!");
        text2.setFont(new Font("Rockwell", Font.BOLD, 45));
        text2.setBounds(300, 90, 600, 40);
        add(text2);
        
        textCard = new JLabel("Card No:");
        textCard.setFont(new Font ("Rockwell", Font.BOLD, 25));
        textCard.setBounds(100, 200, 200, 20);
        add(textCard);
        
        cardNo = new JTextField(15);
        cardNo.setBounds(250, 195, 230, 30);
        cardNo.setFont(new Font ("Rockwell", Font.PLAIN, 25));
        add(cardNo);
        
        textPin = new JLabel("PIN:");
        textPin.setFont(new Font ("Rockwell", Font.BOLD, 30));
        textPin.setBounds(100, 270, 400, 20);
        add(textPin);
        
        pin = new JPasswordField(15);
        pin.setFont(new Font ("Rockwell", Font.PLAIN, 25));
        pin.setBounds(250, 265, 230, 30);
        add(pin);
                
        login = new JButton("SIGN IN");
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        
        clear = new JButton("CLEAR");
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        
        register = new JButton("SIGN UP");
        register.setBackground(Color.BLACK);
        register.setForeground(Color.WHITE);
        
        setLayout(null);
        
        login.setFont(new Font("Rockwell", Font.BOLD, 14));
        login.setBounds(250, 330, 100, 50);
        login.setFocusable(false);
        add(login);
        
        clear.setFont(new Font("Rockwell", Font.BOLD, 14));
        clear.setBounds(510, 195, 100, 30);
        clear.setFocusable(false);
        add(clear);
        
        register.setFont(new Font("Rockwell", Font.BOLD, 14));
        register.setBounds(380, 330, 100, 50);
        register.setFocusable(false);
        add(register);
        
        login.addActionListener(this);
        clear.addActionListener(this);
        register.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(700, 500);;
        setLocation(350,200);
        setVisible(true);
        setResizable(false);
        
    }
    public void actionPerformed(ActionEvent ae){
        try{        
            if(ae.getSource()== login){
                Conn c1 = new Conn();
                String cardno  = cardNo.getText();
                String pin  = this.pin.getText();
                String q  = "select * from login where cardnumber = '"+cardno+"' and pin = '"+pin+"'";

                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            }else if(ae.getSource()== clear){
                cardNo.setText("");
                pin.setText("");
            }else if(ae.getSource()== register){
                setVisible(false);
                new signup ().setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Login().setVisible(true);
    }

    
}



