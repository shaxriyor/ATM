
package atm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signupthree extends JFrame implements ActionListener{
    
    JLabel textPage, textAccountType, textCardNum, text1, text2, text3, textPin, textPin2, textPin3, text4, textFormNo,l12;
    JRadioButton savingAcc, fixedDepAcc, currentAcc, recDepAcc;
    JButton buttonSubmit, buttonCancel;
    JCheckBox textAtmCard, textInternetBanking, textMobileBanking, textEmailAlert, textChequeBook, textEstatement, submitText;
    String formno;
    signupthree(String formno){
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm/icons/icon.jpg"));
        Image i2 = i1.getImage().getScaledInstance(130, 100, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(20, 0, 130, 100);
        add(l14);
        
        textPage = new JLabel("Page 3: Account Details");
        textPage.setFont(new Font("Rockwell", Font.BOLD, 22));
        
        textAccountType = new JLabel("Account Type:");
        textAccountType.setFont(new Font("Rockwell", Font.BOLD, 18));
        
        textCardNum = new JLabel("Card Number:");
        textCardNum.setFont(new Font("Rockwell", Font.BOLD, 18));
        
        text1 = new JLabel("XXXX-XXXX-XXXX-4184");
        text1.setFont(new Font("Rockwell", Font.BOLD, 18));
        
        text2 = new JLabel("(Your 16-digit Card number)");
        text2.setFont(new Font("Rockwell", Font.BOLD, 12));
        
        text3 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        text3.setFont(new Font("Rockwell", Font.BOLD, 12));
        
        textPin = new JLabel("PIN:");
        textPin.setFont(new Font("Rockwell", Font.BOLD, 18));
        
        textPin2 = new JLabel("XXXX");
        textPin2.setFont(new Font("Rockwell", Font.BOLD, 18));
    
        textPin3 = new JLabel("(4-digit password)");
        textPin3.setFont(new Font("Rockwell", Font.BOLD, 12));
    
        text4 = new JLabel("Services Required:");
        text4.setFont(new Font("Rockwell", Font.BOLD, 18));
        
        textFormNo = new JLabel("Form No:");
        textFormNo.setFont(new Font("Rockwell", Font.BOLD, 14));
        
        l12 = new JLabel(formno);
        l12.setFont(new Font("Rockwell", Font.BOLD, 14));
        
        buttonSubmit = new JButton("Submit");
        buttonSubmit.setFont(new Font("Rockwell", Font.BOLD, 14));
        buttonSubmit.setBackground(Color.BLACK);
        buttonSubmit.setForeground(Color.WHITE);
        
        buttonCancel = new JButton("Cancel");
        buttonCancel.setFont(new Font("Rockwell", Font.BOLD, 14));
        buttonCancel.setBackground(Color.BLACK);
        buttonCancel.setForeground(Color.WHITE);
        
        
        textAtmCard = new JCheckBox("ATM CARD");
        textAtmCard.setBackground(Color.WHITE);
        textAtmCard.setFont(new Font("Rockwell", Font.BOLD, 16));
        
        textInternetBanking = new JCheckBox("Internet Banking");
        textInternetBanking.setBackground(Color.WHITE);
        textInternetBanking.setFont(new Font("Rockwell", Font.BOLD, 16));
        
        textMobileBanking = new JCheckBox("Mobile Banking");
        textMobileBanking.setBackground(Color.WHITE);
        textMobileBanking.setFont(new Font("Rockwell", Font.BOLD, 16));
        
        textEmailAlert = new JCheckBox("EMAIL Alerts");
        textEmailAlert.setBackground(Color.WHITE);
        textEmailAlert.setFont(new Font("Rockwell", Font.BOLD, 16));
        
        textChequeBook = new JCheckBox("Cheque Book");
        textChequeBook.setBackground(Color.WHITE);
        textChequeBook.setFont(new Font("Rockwell", Font.BOLD, 16));
        
        textEstatement = new JCheckBox("E-Statement");
        textEstatement.setBackground(Color.WHITE);
        textEstatement.setFont(new Font("Rockwell", Font.BOLD, 16));
        
        submitText = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        submitText.setBackground(Color.WHITE);
        submitText.setFont(new Font("Rockwell", Font.BOLD, 14));
         
        
        savingAcc = new JRadioButton("Saving Account");
        savingAcc.setFont(new Font("Rockwell", Font.BOLD, 16));
        savingAcc.setBackground(Color.WHITE);
        
        fixedDepAcc = new JRadioButton("Fixed Deposit Account");
        fixedDepAcc.setFont(new Font("Rockwell", Font.BOLD, 16));
        fixedDepAcc.setBackground(Color.WHITE);
        
        currentAcc = new JRadioButton("Current Account");
        currentAcc.setFont(new Font("Rockwell", Font.BOLD, 16));
        currentAcc.setBackground(Color.WHITE);
        
        recDepAcc = new JRadioButton("Recurring Deposit Account");
        recDepAcc.setFont(new Font("Rockwell", Font.BOLD, 16));
        recDepAcc.setBackground(Color.WHITE);
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(savingAcc);
        groupgender.add(fixedDepAcc);
        groupgender.add(currentAcc);
        groupgender.add(recDepAcc);
        
        setLayout(null);
        
        textFormNo.setBounds(600,20,100,30);
        add(textFormNo);
        
        l12.setBounds(700,20,60,30);
        add(l12);
        
        textPage.setBounds(290,50,600,30);
        add(textPage);
        
        textAccountType.setBounds(100,110,200,30);
        add(textAccountType);
        
        savingAcc.setBounds(100,140,150,30);
        savingAcc.setFocusable(false);
        add(savingAcc);
        
        fixedDepAcc.setBounds(350,140,300,30);
        fixedDepAcc.setFocusable(false);
        add(fixedDepAcc);
        
        currentAcc.setBounds(100,170,250,30);
        currentAcc.setFocusable(false);
        add(currentAcc);
        
        recDepAcc.setBounds(350,170,250,30);
        recDepAcc.setFocusable(false);
        add(recDepAcc);
        
        textCardNum.setBounds(100,210,200,30);
        add(textCardNum);
        
        text1.setBounds(330,210,250,30);
        add(text1);
        
        text2.setBounds(100,235,200,20);
        add(text2);
        
        text3.setBounds(330,235,500,20);
        add(text3);
        
        textPin.setBounds(100,270,200,30);
        add(textPin);
        
        textPin2.setBounds(330,270,200,30);
        add(textPin2);
        
        textPin3.setBounds(100,295,200,20);
        add(textPin3);
        
        text4.setBounds(100,330,200,30);
        add(text4);
        
        textAtmCard.setBounds(100,360,200,30);
        add(textAtmCard);
        
        textInternetBanking.setBounds(350,360,200,30);
        add(textInternetBanking);
        
        textMobileBanking.setBounds(100,390,200,30);
        add(textMobileBanking);
        
        textEmailAlert.setBounds(350,390,200,30);
        add(textEmailAlert);
        
        textChequeBook.setBounds(100,420,200,30);
        add(textChequeBook);
        
        textEstatement.setBounds(350,420,200,30);
        add(textEstatement);
        
        submitText.setBounds(100,460,600,20);
        add(submitText);
        
        buttonSubmit.setBounds(250,500,100,30);
        add(buttonSubmit);
        
        buttonCancel.setBounds(420,500,100,30);
        add(buttonCancel);
        
        
        getContentPane().setBackground(Color.WHITE);

        setSize(850,600);
        setLocation(500,120);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        buttonSubmit.addActionListener(this);
        buttonCancel.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String accountType = null;
        if(savingAcc.isSelected()){
            accountType = "Saving Account";
        }
        else if(fixedDepAcc.isSelected()){
            accountType = "Fixed Deposit Account";
        }
        else if(currentAcc.isSelected()){
            accountType = "Current Account";
        }else if(recDepAcc.isSelected()){
            accountType = "Recurring Deposit Account";
        }
        
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 8600500100000000L;
        String cardnumber = "" + Math.abs(first7);
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        
        String facility = "";
        if(textAtmCard.isSelected()){
            facility = facility + " ATM Card";
        }
        if(textInternetBanking.isSelected()){
            facility = facility + " Internet Banking";
        }
        if(textMobileBanking.isSelected()){
            facility = facility + " Mobile Banking";
        }
        if(textEmailAlert.isSelected()){
            facility = facility + " EMAIL Alerts";
        }
        if(textChequeBook.isSelected()){
            facility = facility + " Cheque Book";
        }
        if(textEstatement.isSelected()){
            facility = facility + " E-Statement";
        }
        
        try{
            if(ae.getSource()== buttonSubmit){
                
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn c1 = new Conn();
                    String q1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pin+"','"+facility+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pin+"')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin:"+ pin);
                    
                    new Deposit(pin).setVisible(true);
                    setVisible(false);
                }
            
            }else if(ae.getSource()== buttonCancel){
                System.exit(0);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args){
        new signupthree ("").setVisible(true);
    }
    
}


