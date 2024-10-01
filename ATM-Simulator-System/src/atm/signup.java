package atm;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup extends JFrame implements ActionListener{
    JLabel formNo, pageOne, name, dateOfBirth, gender, maritalStatus, city, date, month, year;
    JTextField getName, getCity, getPinCode;
    JRadioButton male, female, married, unmarried, other;
    JButton nextButton;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);
    
    signup(){
        setTitle("NEW ACCOUNT APPLICATION FORM");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm/icons/icon.jpg"));
        Image i2 = i1.getImage().getScaledInstance(130, 100, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imageLabel = new JLabel(i3);
        imageLabel.setBounds(20, 0, 130, 100);
        add(imageLabel);
        
        formNo = new JLabel("APPLICATION FORM NO. "+first);
        formNo.setFont(new Font("Rockwell", Font.BOLD, 38));
        
        pageOne = new JLabel("Page 1: Personal Details");
        pageOne.setFont(new Font("Rockwell", Font.BOLD, 22));
        
        name = new JLabel("Name:");
        name.setFont(new Font("Rockwell", Font.BOLD, 20));
        
        dateOfBirth = new JLabel("Date of Birth:");
        dateOfBirth.setFont(new Font("Rockwell", Font.BOLD, 20));
        
        gender = new JLabel("Gender:");
        gender.setFont(new Font("Rockwell", Font.BOLD, 20));
        
        maritalStatus = new JLabel("Marital Status:");
        maritalStatus.setFont(new Font("Rockwell", Font.BOLD, 20));
        
        city = new JLabel("City:");
        city.setFont(new Font("Rockwell", Font.BOLD, 20));

        date = new JLabel("Date");
        date.setFont(new Font("Rockwell", Font.BOLD, 18));
        
        month = new JLabel("Month");
        month.setFont(new Font("Rockwell", Font.BOLD, 18));
        
        year = new JLabel("Year");
        year.setFont(new Font("Rockwell", Font.BOLD, 18));
        
        
        getName = new JTextField();
        getName.setFont(new Font("Rockwell", Font.BOLD, 18));
        
        getCity = new JTextField();
        getCity.setFont(new Font("Rockwell", Font.BOLD, 18));

        nextButton = new JButton("Next");
        nextButton.setFont(new Font("Rockwell", Font.BOLD, 14));
        nextButton.setBackground(Color.BLACK);
        nextButton.setForeground(Color.WHITE);
        
        male = new JRadioButton("Male");
        male.setFont(new Font("Rockwell", Font.BOLD, 14));
        male.setBackground(Color.WHITE);
        
        female = new JRadioButton("Female");
        female.setFont(new Font("Rockwell", Font.BOLD, 14));
        female.setBackground(Color.WHITE);
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(male);
        groupgender.add(female);
        
        married = new JRadioButton("Married");
        married.setFont(new Font("Rockwell", Font.BOLD, 14));
        married.setBackground(Color.WHITE);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setFont(new Font("Rockwell", Font.BOLD, 14));
        unmarried.setBackground(Color.WHITE);
        
        other = new JRadioButton("Other");
        other.setFont(new Font("Rockwell", Font.BOLD, 14));
        other.setBackground(Color.WHITE);
        
        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(married);
        groupstatus.add(unmarried);
        groupstatus.add(other);
        
        dateChooser = new JDateChooser();
	//dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	dateChooser.setForeground(new Color(105, 105, 105));
	dateChooser.setBounds(137, 337, 200, 29);
	add(dateChooser);
        
        setLayout(null);
        formNo.setBounds(170,20,600,40);
        add(formNo);
        pageOne.setBounds(290,100,600,30);
        add(pageOne);

        name.setBounds(100,160,100,30);
        add(name);
        dateOfBirth.setBounds(100,210,200,30);
        add(dateOfBirth);
        dateChooser.setBounds(300, 210, 400, 30);
        gender.setBounds(100,260,200,30);
        add(gender);

        male.setBounds(300,260,80,30);
        male.setFocusable (false);
        add(male);
        female.setBounds(400,260,80,30);
        female.setFocusable (false);
        add(female);

        maritalStatus.setBounds(100,310,200,30);
        add(maritalStatus);
        married.setBounds(300,310,100,30);
        married.setFocusable (false);
        add(married);
        unmarried.setBounds(400,310,120,30);
        unmarried.setFocusable (false);
        add(unmarried);
        other.setBounds(520,310,100,30);
        other.setFocusable (false);
        add(other);
        city.setBounds(100,360,200,30);
        add(city);

        getName.setBounds(300,160,400,30);
        add(getName);
        getCity.setBounds(300,360,400,30);
        add(getCity);
        
        nextButton.setBounds(600,480,100,30);
        nextButton.setFont(new Font("Rockwell", Font.BOLD, 14));
        add(nextButton);
        
        nextButton.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);

        setSize(850,600);
        setLocation(500,120);
        setVisible(true);
        setResizable(false);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = first;
        String name = getName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(female.isSelected()){
            gender = "Female";
        }

        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }else if(unmarried.isSelected()){
            marital = "Unmarried";
        }else if(other.isSelected()){
            marital = "Other";
        }

        String city = getCity.getText();

        try{

            if(getCity.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signup values('"+formno+"','"+name+"','"+dob+"','"+gender+"','"+marital+"','"+city+"')";
                c1.s.executeUpdate(q1);
                new signuptwo(first).setVisible(true);
                setVisible(false);
            }
            
        }catch(Exception e){
             e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args){
        new signup ().setVisible(true);
    }
}
