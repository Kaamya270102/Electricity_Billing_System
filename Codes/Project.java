package electricitybillingsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener{
    String meter;
    Project(String meter, String person){
        super("Electricity Billing System");
        this.meter = meter;
        
        setSize(1000,800);
        
        /* Adding background image */
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("icon/elect1.jpg"));
        Image i3 = ic.getImage().getScaledInstance(950, 750,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);
       
        /* First Column */
        JMenuBar mb  = new JMenuBar();
        JMenu master = new JMenu("Master");
        JMenuItem m1 = new JMenuItem("New Customer");
        JMenuItem m2 = new JMenuItem("Customer Details");
        JMenuItem m3 = new JMenuItem("Deposit Details");
        JMenuItem m4 = new JMenuItem("Calculate Bill");
        master.setForeground(Color.BLACK);
        
        
        /* ---- Customer Details ---- */
        m1.setFont(new Font("monospaced",Font.PLAIN,15));
        m1.setBackground(Color.WHITE);
        
        /* ---- Meter Details ---- */
        m2.setFont(new Font("monospaced",Font.PLAIN,15));
        m2.setBackground(Color.WHITE);
        
         /* ---- Deposit Details  ----- */
        m3.setFont(new Font("monospaced",Font.PLAIN,15));
        m3.setBackground(Color.WHITE);
        
        m4.setFont(new Font("monospaced",Font.PLAIN,15));
        m4.setBackground(Color.WHITE);
        
        
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);
        
        
        
        //-----------------------------
        
      
        
        // --------------------------------------------------------------------------------------------
        
        
      
        JMenu user = new JMenu("User");
        JMenuItem u1 = new JMenuItem("Pay Bill");
        
        JMenuItem u2 = new JMenuItem("Bill Details");
        user.setForeground(Color.BLACK);
        
        /* ---- Pay Bill ---- */
        u1.setFont(new Font("monospaced",Font.PLAIN,15));
        u1.setBackground(Color.WHITE);
        
        /* ---- Last Bill ----*/
        u2.setFont(new Font("monospaced",Font.PLAIN,15));
        u2.setBackground(Color.WHITE);
        
        u1.addActionListener(this);
        u2.addActionListener(this);
        
        
        // --------------------------------------------------------------------------------------------- 
        
      
        JMenu report = new JMenu("Report");
        JMenuItem r1 = new JMenuItem("Generate Bill");
        report.setForeground(Color.BLACK);
        
        /* ---- Report ---- */
        r1.setFont(new Font("monospaced",Font.PLAIN,15));
        r1.setBackground(Color.WHITE);
        
        r1.addActionListener(this);
       
        
        // ---------------------------------------------------------------------------------------
        
       
        JMenu exit = new JMenu("Logout");
        JMenuItem ex = new JMenuItem("Logout");
        exit.setForeground(Color.BLACK);
        
        /* ---- Exit ---- */
        ex.setFont(new Font("monospaced",Font.PLAIN,15));
        ex.setBackground(Color.WHITE);
        
        ex.addActionListener(this);
        
        
        // ---------------------------------------------------------------------------------------------
               
        
        master.add(m1);
        master.add(m2);
        master.add(m3);
        master.add(m4);
        
       
        user.add(u1);
        user.add(u2);
        
        report.add(r1);
     
        exit.add(ex);
         
        if(person.equals("Admin")){
            mb.add(master);
        }else{             
            
            mb.add(user);
            mb.add(report);
        }
        mb.add(exit);
        setJMenuBar(mb);    
        
        setFont(new Font("Senserif",Font.BOLD,30));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("Customer Details")){
            new CustomerDetails().setVisible(true);
            
        }else if(msg.equals("New Customer")){
            new NewCustomer().setVisible(true);
            
        }else if(msg.equals("Calculate Bill")){
            new CalculateBill().setVisible(true);
            
        }else if(msg.equals("Pay Bill")){
            new PayBill(meter).setVisible(true);
           
        }else if(msg.equals("Logout")){
            this.setVisible(false);
            new Login().setVisible(true);
            
        }else if(msg.equals("Generate Bill")){
            new GenerateBill(meter).setVisible(true);
            
        }else if(msg.equals("Deposit Details")){
            new DepositDetails().setVisible(true);
            
        }else if(msg.equals("Bill Details")){
            new BillDetails(meter).setVisible(true);
        }   
    }
    
    
    public static void main(String[] args){
        new Project("", "").setVisible(true);
    }
    
}