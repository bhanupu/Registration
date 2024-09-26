import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
public class Registration {
    String dates[] =
            { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    String months[] =
            { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };

    String years[] =
            { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019", "2020", "2021", "2022",
            "2023", "2024"};
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,dob;
    JTextField t1,t2,t3,t4,t5;
    JPasswordField p1;
    JRadioButton r1,r2;
    ButtonGroup bg;
    JComboBox date,month,year;
    JCheckBox term;
    JButton b1;
    Color c = new Color(153-102- 0);
    Registration() {
        f = new JFrame("Registration Form");
        f.setLayout(null);
        l8 = new JLabel("Registration Form");
        l8.setFont(new Font("Arial", Font.PLAIN,30));
        l8.setBounds(125,10,300,50);
        l1 = new JLabel("Enter First Name");
        l1.setBounds(50,50+30,100,50);
        t1 = new JTextField();
        t1.setBounds(250,60+30,170,30);
        l2 = new JLabel("Enter Last Name");
        l2.setBounds(50,100+30,100,50);
        t2 = new JTextField();
        t2.setBounds(250,110+30,170,30);
        l3 = new JLabel("Enter Email");
        l3.setBounds(50,150+30,100,50);
        t3 = new JTextField();
        t3.setBounds(250,160+30,170,30);
        l4 = new JLabel("Enter Password");
        l4.setBounds(50,200+30,100,50);
        p1 = new JPasswordField();
        p1.setBounds(250,210+30,170,30);
        l5 = new JLabel("Enter Country");
        l5.setBounds(50,250+30,100,50);
        t4 = new JTextField();
        t4.setBounds(250,260+30,170,30);
        l6 = new JLabel("Enter State");
        l6.setBounds(50,300+30,100,50);
        t5 = new JTextField();
        t5.setBounds(250,310+30,170,30);
        l7 = new JLabel("Select Gender");
        l7.setBounds(50,350+30,100,50);
        r1 = new JRadioButton("Male");
        r1.setBounds(250,360+30,80,30);
        r2 = new JRadioButton("Female");
        r2.setBounds(330,360+30,80,30);
        bg = new ButtonGroup();
        dob = new JLabel("Enter DOB");
        dob.setBounds(50,410+30,100,50);
        date = new JComboBox(dates);
        date.setBounds(250,420+30,50,30);
        month = new JComboBox(months);
        month.setBounds(300,420+30,50,30);
        year = new JComboBox(years);
        year.setBounds(350,420+30,70,30);
        term = new JCheckBox("Accept Terms And Conditions.");
        term.setBounds(150,500+30,220,40);
        b1 = new JButton("Submit");
        b1.setBounds(200,570+30,100,30);

        b1.setBackground(Color.orange);
        t1.setBorder(new BevelBorder(BevelBorder.LOWERED));
        t2.setBorder(new BevelBorder(BevelBorder.LOWERED));
        t3.setBorder(new BevelBorder(BevelBorder.LOWERED));
        t4.setBorder(new BevelBorder(BevelBorder.LOWERED));
        t5.setBorder(new BevelBorder(BevelBorder.LOWERED));
        date.setBorder(new BevelBorder(BevelBorder.LOWERED));
        month.setBorder(new BevelBorder(BevelBorder.LOWERED));
        year.setBorder(new BevelBorder(BevelBorder.LOWERED));
        term.setBorder(new BevelBorder(BevelBorder.LOWERED));
        b1.setBorder(new BevelBorder(BevelBorder.LOWERED));

        f.add(l8);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(p1);
        f.add(l5);
        f.add(t4);
        f.add(l6);
        f.add(t5);
        f.add(l7);
        f.add(r1);
        f.add(r2);
        bg.add(r1);
        bg.add(r2);
        f.add(dob);
        f.add(date);
        f.add(month);
        f.add(year);
        f.add(term);
        f.add(b1);
        f.setSize(500,730);
        f.setVisible(true);


    }

    public static void main(String[] args) {

        Registration r = new Registration();
    }
}
