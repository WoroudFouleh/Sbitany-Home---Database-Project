/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.woroud;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.util.logging.Level;
import java.util.logging.Logger;
import static com.mycompany.woroud.User.*;
import static com.mycompany.woroud.User.*; 
import javax.swing.JOptionPane;
/**
 *
 * @author Woroud Fouleh
 */
public class NewJFrame extends javax.swing.JFrame {
         public static int idmain=0;
         public static User current=new User();
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        Log_in.setVisible(true);
        Forget_Password.setVisible(false);
        create_account.setVisible(false);
        Welcome.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Forget_Password = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fotgetusername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        changepass = new javax.swing.JButton();
        oldpass = new javax.swing.JPasswordField();
        newpass = new javax.swing.JPasswordField();
        create_account = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        usernamecreate = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        famale = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        phonenum = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        passwordcreate = new javax.swing.JPasswordField();
        jLabel22 = new javax.swing.JLabel();
        createb = new javax.swing.JButton();
        Log_in = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logusername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        createnewaccountb = new javax.swing.JButton();
        login = new javax.swing.JButton();
        forgettenpb = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        logpassword = new javax.swing.JPasswordField();
        Welcome = new javax.swing.JLabel();
        basepic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Forget_Password.setBackground(new java.awt.Color(255, 255, 255,80));
        Forget_Password.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Are you forgetten your password?");
        Forget_Password.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, 20));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("User ID:");
        Forget_Password.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 97, 39));

        fotgetusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotgetusernameActionPerformed(evt);
            }
        });
        Forget_Password.add(fotgetusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 211, -1));

        jLabel9.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("New password:");
        Forget_Password.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, -1));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Confirm New password:");
        Forget_Password.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 200, -1));

        changepass.setBackground(new java.awt.Color(51, 51, 255));
        changepass.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        changepass.setForeground(new java.awt.Color(255, 255, 255));
        changepass.setText("Change password");
        changepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepassActionPerformed(evt);
            }
        });
        Forget_Password.add(changepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 170, 30));
        Forget_Password.add(oldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));
        Forget_Password.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        getContentPane().add(Forget_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, 340));

        create_account.setBackground(new java.awt.Color(255, 255, 255));
        create_account.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Create Account");
        create_account.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 306, 40));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("First name:");
        create_account.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 83, 27));

        jLabel13.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setText("Last name:");
        create_account.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 28));

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        create_account.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 168, -1));

        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("User ID:");
        create_account.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 83, 27));

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        create_account.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 168, -1));

        jLabel15.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 255));
        jLabel15.setText("Password:");
        create_account.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 83, 27));

        usernamecreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamecreateActionPerformed(evt);
            }
        });
        create_account.add(usernamecreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 168, -1));

        male.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        create_account.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 98, -1));

        jLabel16.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 255));
        jLabel16.setText("Sex:");
        create_account.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 27));

        famale.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        famale.setText("Female");
        famale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                famaleActionPerformed(evt);
            }
        });
        create_account.add(famale, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 98, -1));

        jLabel17.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 255));
        jLabel17.setText("Phone number:");
        create_account.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 27));

        phonenum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumActionPerformed(evt);
            }
        });
        create_account.add(phonenum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 168, -1));

        jLabel18.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 255));
        jLabel18.setText("Address:");
        create_account.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 27));

        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        create_account.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 168, -1));

        jLabel19.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 255));
        jLabel19.setText("City:");
        create_account.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 50, 30));

        passwordcreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordcreateActionPerformed(evt);
            }
        });
        create_account.add(passwordcreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 170, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\pic\\pic\\800px_COLOURBOX11712091.jpg")); // NOI18N
        jLabel22.setText("jLabel22");
        create_account.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 200, 410));

        createb.setBackground(new java.awt.Color(51, 51, 255));
        createb.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        createb.setForeground(new java.awt.Color(255, 255, 255));
        createb.setText("Create ");
        createb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbActionPerformed(evt);
            }
        });
        create_account.add(createb, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 130, 40));

        getContentPane().add(create_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 540, 430));

        Log_in.setBackground(new java.awt.Color(255, 255, 255,80));
        Log_in.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(51, 51, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Log in");
        Log_in.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 70, 30));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Password:");
        Log_in.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, 20));

        logusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logusernameActionPerformed(evt);
            }
        });
        Log_in.add(logusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 211, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("User ID:");
        Log_in.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 97, 39));

        createnewaccountb.setBackground(new java.awt.Color(51, 51, 255));
        createnewaccountb.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        createnewaccountb.setForeground(new java.awt.Color(255, 255, 255));
        createnewaccountb.setText("Create new account");
        createnewaccountb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createnewaccountbActionPerformed(evt);
            }
        });
        Log_in.add(createnewaccountb, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 239, -1, -1));

        login.setBackground(new java.awt.Color(51, 51, 255));
        login.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Log in");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        Log_in.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 202, -1, -1));

        forgettenpb.setFont(new java.awt.Font("Sitka Text", 2, 12)); // NOI18N
        forgettenpb.setForeground(new java.awt.Color(51, 51, 255));
        forgettenpb.setText("Forgetten password?");
        forgettenpb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                forgettenpbMousePressed(evt);
            }
        });
        Log_in.add(forgettenpb, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 306, 162, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\pic\\pic\\png-transparent-computer-icons-u.png")); // NOI18N
        Log_in.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 80, 40));

        logpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logpasswordActionPerformed(evt);
            }
        });
        Log_in.add(logpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 210, -1));

        getContentPane().add(Log_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 260, 340));

        Welcome.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        Welcome.setForeground(new java.awt.Color(0, 0, 102));
        Welcome.setText("Welcome to Sbitany Home!");
        getContentPane().add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 520, 40));

        basepic.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\woroud (2)\\woroud\\src\\main\\java\\com\\mycompany\\woroud\\WhatsApp Image 2022-11-27 at 1.0.jpg")); // NOI18N
        getContentPane().add(basepic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 831, 486));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logusernameActionPerformed

    private void fotgetusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotgetusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fotgetusernameActionPerformed

    private void changepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepassActionPerformed
        try {

            boolean F=false;

            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con=DriverManager.getConnection(url, "c##woroud","123456");
            Statement stmt=con.createStatement();
            ResultSet set=stmt.executeQuery("Select * from CUSTOMER");

            while(set.next())
            {
                String UserName=set.getString(1);
                //String Password=set.getString(4);
                       String Password=oldpass.getText();
                if(UserName.equals(fotgetusername.getText()) && Password.equals(newpass.getText()))
                {
                    //stmt.executeUpdate("UPDATE CUSTOMER SET PASSWORD = "+"'"+newpass.getText()+"'"+"WHERE PASSWORD = "+"'"+oldpass.getText()+"'");
                    stmt.executeUpdate("UPDATE CUSTOMER SET PASSWORD = "+"'"+newpass.getText()+"'"+"WHERE CID = "+"'"+fotgetusername.getText()+"'");
                      JOptionPane.showMessageDialog(rootPane, "Password Changed");
                       Forget_Password.setVisible(false);
           Log_in.setVisible(true);
                Welcome.setVisible(true);
                    F=true;
                    
                }

            }
            if(!F)
            {
                JOptionPane.showMessageDialog(null, "Wrong Credentials");
                Forget_Password.setVisible(true);
           //Log_in.setVisible(true);
                Welcome.setVisible(true);
            }
            //set.close();
           // Forget_Password.setVisible(false);
           //Log_in.setVisible(true);
                //Welcome.setVisible(true);
                
            con.commit();
            con.close();
            //Forget_Password.setVisible(false);
           //Log_in.setVisible(true);
               // Welcome.setVisible(true);
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, ex.toString() );

        }
        

// TODO add your handling code here:
    }//GEN-LAST:event_changepassActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void phonenumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumActionPerformed

    private void famaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_famaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_famaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void usernamecreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamecreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamecreateActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void createbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbActionPerformed
     
     try
        {   String sex="";
           if(male.isSelected()) sex="M";
           else if(famale.isSelected()) sex="F";
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con=DriverManager.getConnection(url, "c##woroud","123456");
            Statement stmt=con.createStatement();
            String stmtStat="insert into CUSTOMER values("+"'"+this.usernamecreate.getText()+"','"+this.firstname.getText()+"','"+this.lastname.getText()+"','"+this.passwordcreate.getText()+"','"+sex+"','"+this.city.getText()+"','"+this.phonenum.getText()+"')";
            stmt.executeUpdate(stmtStat);
            
            
            Log_in.setVisible(true);
             create_account.setVisible(false);        // TODO add your handling code here:
              Welcome.setVisible(true);JOptionPane.showMessageDialog(rootPane, "Account Created!");
            con.commit();
            con.close();
              //Log_in.setVisible(true);
             //create_account.setVisible(false);        // TODO add your handling code here:
              //Welcome.setVisible(true);
        }
        catch (Exception ex)
        {

            //JOptionPane.showMessageDialog(null, ex.toString());

        }

    }//GEN-LAST:event_createbActionPerformed

    private void passwordcreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordcreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordcreateActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
       //this.setVisible(false);
                    //new menue().setVisible(true);
        
         try {

            boolean F=false;

            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection con=DriverManager.getConnection(url, "c##woroud","123456");
            Statement stmt=con.createStatement();
            ResultSet set=stmt.executeQuery("Select * from CUSTOMER");

            while(set.next())
            {
                String UserId=set.getString(1);
                String Password=set.getString(4);
                String Phone=set.getString(7);
                String gender=set.getString(5);
                String fname=set.getString(2);
                String lname=set.getString(3);
                String cityy=set.getString(6);



                if(UserId.equals(logusername.getText()) && Password.equals(logpassword.getText()))
                {
                    
                    F=true;
                    //current.setCurrentUser(logusername.getText());
                    //Woroud users=new Woroud();
                    //CurrentUser=logusername.getText();
                    User.setCurrentUser(logusername.getText());
                    User.setCurrentUserPassword(logpassword.getText());
                    User.setCurrentgender(gender);
                    User.setCurrentFname(fname);
                    User.setCurrentLname(lname);
                    User.setCurrentCity(cityy);
                    User.setCurrentPhine(Phone);
                    
                    this.setVisible(false);
                    new menue().setVisible(true);
            

                }

            }
            
            if(!F)
            {
                JOptionPane.showMessageDialog(null, "Wrong Login Credentials");
            }
            con.close();

        } catch (Exception ex) {
            Logger.getLogger(menue.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        
        
        
        
        
        
        
        
        
                             // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void createnewaccountbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createnewaccountbActionPerformed
  
        Log_in.setVisible(false);
        create_account.setVisible(true);
                Welcome.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_createnewaccountbActionPerformed

    private void forgettenpbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgettenpbMousePressed
Log_in.setVisible(false);
        Forget_Password.setVisible(true);   
                Welcome.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_forgettenpbMousePressed

    private void logpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logpasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Forget_Password;
    private javax.swing.JPanel Log_in;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel basepic;
    private javax.swing.JButton changepass;
    private javax.swing.JTextField city;
    private javax.swing.JPanel create_account;
    private javax.swing.JButton createb;
    private javax.swing.JButton createnewaccountb;
    private javax.swing.JRadioButton famale;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel forgettenpb;
    private javax.swing.JTextField fotgetusername;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastname;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField logpassword;
    private javax.swing.JTextField logusername;
    private javax.swing.JRadioButton male;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JPasswordField oldpass;
    private javax.swing.JPasswordField passwordcreate;
    private javax.swing.JTextField phonenum;
    private javax.swing.JTextField usernamecreate;
    // End of variables declaration//GEN-END:variables

    
}
