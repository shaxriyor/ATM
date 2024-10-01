
package atm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signuptwo extends JFrame implements ActionListener{
    
    JLabel textPage, textIncome, textEdu, textOccupation, citizen, textExistinAcc, textQualification, textFormNo, formNo;
    JButton buttonNext;
    JRadioButton selectYes, selectNo, yes, no;
    JComboBox incomeOpt, eduOpt, occupationOpt;
    String formno;
    signuptwo(String formno){
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm/icons/icon.jpg"));
        Image i2 = i1.getImage().getScaledInstance(130, 100, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(20, 0, 130, 100);
        add(l14);
        
        this.formno = formno;
        
        textPage = new JLabel("Page 2: Additonal Details");
        textPage.setFont(new Font("Rockwell", Font.BOLD, 22));
        
        textIncome = new JLabel("Income:");
        textIncome.setFont(new Font("Rockwell", Font.BOLD, 18));
        
        textEdu = new JLabel("Educational");
        textEdu.setFont(new Font("Rockwell", Font.BOLD, 18));

        textQualification = new JLabel("Qualification:");
        textQualification.setFont(new Font("Rockwell", Font.BOLD, 18));
        
        textOccupation = new JLabel("Occupation:");
        textOccupation.setFont(new Font("Rockwell", Font.BOLD, 18));

        citizen = new JLabel("Are you citizen?");
        citizen.setFont(new Font("Rockwell", Font.BOLD, 18));
        
        textExistinAcc = new JLabel("Existing Account:");
        textExistinAcc.setFont(new Font("Rockwell", Font.BOLD, 18));
        
        textFormNo = new JLabel("Form No:");
        textFormNo.setFont(new Font("Rockwell", Font.BOLD, 13));

        formNo = new JLabel(formno);
        formNo.setFont(new Font("Rockwell", Font.BOLD, 13));
        
        buttonNext = new JButton("Next");
        buttonNext.setFont(new Font("Rockwell", Font.BOLD, 14));
        buttonNext.setBackground(Color.BLACK);
        buttonNext.setForeground(Color.WHITE);
        
        selectYes = new JRadioButton("Yes");
        selectYes.setFont(new Font("Rockwell", Font.BOLD, 14));
        selectYes.setBackground(Color.WHITE);
        
        selectNo = new JRadioButton("No");
        selectNo.setFont(new Font("Rockwell", Font.BOLD, 14));
        selectNo.setBackground(Color.WHITE);
        
        yes = new JRadioButton("Yes");
        yes.setFont(new Font("Rockwell", Font.BOLD, 14));
        yes.setBackground(Color.WHITE);
        
        no = new JRadioButton("No");
        no.setFont(new Font("Rockwell", Font.BOLD, 14));
        no.setBackground(Color.WHITE);

        String income[] = {"Zero Income",">$500",">$1,000",">$5,000","Upto $10,000","Above $10,000"};
        incomeOpt = new JComboBox(income);
        incomeOpt.setBackground(Color.WHITE);
        incomeOpt.setFocusable(false);
        incomeOpt.setFont(new Font("Rockwell", Font.BOLD, 14));
        
        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        eduOpt = new JComboBox(education);
        eduOpt.setBackground(Color.WHITE);
        eduOpt.setFocusable(false);
        eduOpt.setFont(new Font("Rockwell", Font.BOLD, 14));
        
        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        occupationOpt = new JComboBox(occupation);
        occupationOpt.setBackground(Color.WHITE);
        occupationOpt.setFocusable(false);
        occupationOpt.setFont(new Font("Rockwell", Font.BOLD, 14));
        
        setLayout(null);

        textFormNo.setBounds(650,20,60,30);
        add(textFormNo);
        
        formNo.setBounds(750,20,60,30);
        add(formNo);
        
        textPage.setBounds(290,75,600,30);
        add(textPage);
        
        textIncome.setBounds(100,150,100,30);
        add(textIncome);
        
        incomeOpt.setBounds(350,150,320,30);
        add(incomeOpt);
        
        textEdu.setBounds(100,200,150,30);
        add(textEdu);
        textQualification.setBounds(100,220,150,30);
        add(textQualification);

        eduOpt.setBounds(350,210,320,30);
        add(eduOpt);
        
        textOccupation.setBounds(100,270,150,30);
        add(textOccupation);
        occupationOpt.setBounds(350,270,320,30);
        add(occupationOpt);

        citizen.setBounds(100,330,150,30);
        add(citizen);
        selectYes.setBounds(350,330,100,30);
        selectYes.setFocusable (false);
        add(selectYes);
        selectNo.setBounds(460,330,100,30);
        selectNo.setFocusable (false);
        add(selectNo);
        
        textExistinAcc.setBounds(100,380,180,30);
        add(textExistinAcc);
        yes.setBounds(350,380,100,30);
        yes.setFocusable (false);
        add(yes);
        no.setBounds(460,380,100,30);
        no.setFocusable (false);
        add(no);
        
        buttonNext.setBounds(570,450,100,30);
        buttonNext.setFont(new Font("Rockwell", Font.BOLD, 14));
        buttonNext.setFocusable (false);
        add(buttonNext);
        
        buttonNext.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);

        setSize(850,600);
        setLocation(500,120);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent ae){
        String income = (String) incomeOpt.getSelectedItem();
        String education = (String) eduOpt.getSelectedItem();
        String occupation = (String) occupationOpt.getSelectedItem();

        String scitizen = "";
        if(selectYes.isSelected()){
            scitizen = "Yes";
        }
        else if(selectNo.isSelected()){
            scitizen = "No";
        }
           
        String eaccount = "";
        if(yes.isSelected()){
            eaccount = "Yes";
        }else if(no.isSelected()){
            eaccount = "No";
        }
        
        try{
            if(eaccount.equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signuptwo values('"+formno+"','"+income+"','"+education+"','"+occupation+"','"+scitizen+"','"+eaccount+"')";
                c1.s.executeUpdate(q1);
                new signupthree(formno).setVisible(true);
                setVisible(false);
            }
            
        }catch(Exception ex){
             ex.printStackTrace();
        }
    }
    
    
    public static void main(String[] args){
        new signuptwo ("").setVisible(true);
    }
}
