/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.woroud;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import oracle.jdbc.datasource.OracleDataSource;

/**
 *
 * @author Woroud Fouleh
 */
public class Admin1 extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Categoriesemp = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        Categoriese = new javax.swing.JLabel();
        Profilee = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchemp = new javax.swing.JButton();
        ADDEMP1 = new javax.swing.JButton();
        deleteemp = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        updateemp = new javax.swing.JButton();
        reportmaxsal = new javax.swing.JButton();
        searchattr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(9, 72, 146));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\pic\\pic\\icon1 (1).png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employees");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Categoriesemp.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\pic\\pic\\cat (1).jpg")); // NOI18N
        Categoriesemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoriesempMouseClicked(evt);
            }
        });
        jPanel2.add(Categoriesemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 70, 60));

        Logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\pic\\pic\\exit.jpg")); // NOI18N
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        jPanel2.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 50, 50));

        Categoriese.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\pic\\pic\\product (1).jpg")); // NOI18N
        Categoriese.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategorieseMouseClicked(evt);
            }
        });
        jPanel2.add(Categoriese, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 246, 70, 50));

        Profilee.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\pic\\pic\\Employee (2).png")); // NOI18N
        jPanel2.add(Profilee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 70, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 70, 570));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Gender:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 80, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "ID", "Phone number", "Email", "SSN", "Age" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 150, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 110, 30));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Street:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 60, -1));

        jTextField2.setToolTipText("");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 80, -1));

        jTextField3.setToolTipText("");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 80, -1));

        jLabel9.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Role:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 80, 30));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("Salary:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 70, 20));

        jLabel11.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("City:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 40, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 222, 140, 30));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 140, 30));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("Attributes:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 110, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Manager", "Secretary", "Accountant", "Vendor" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 170, 30));

        jLabel13.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Name:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 110, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Female", "Male" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 170, 30));

        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setText("Address:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 110, 30));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 80, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("-");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 20, 20));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 182, 80, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FName", "LName", "ID", "Password", "Gender", "Email", "Role", "Age", "Salary", "Street", "City", "Phone  Number"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 1130, 270));

        searchemp.setBackground(new java.awt.Color(0, 51, 153));
        searchemp.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        searchemp.setForeground(new java.awt.Color(255, 255, 255));
        searchemp.setText("Show All Employees");
        searchemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchempActionPerformed(evt);
            }
        });
        getContentPane().add(searchemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, 30));

        ADDEMP1.setBackground(new java.awt.Color(0, 51, 153));
        ADDEMP1.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        ADDEMP1.setForeground(new java.awt.Color(255, 255, 255));
        ADDEMP1.setText("Add new Employee");
        ADDEMP1.setToolTipText("");
        ADDEMP1.setActionCommand("");
        ADDEMP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDEMP1MouseClicked(evt);
            }
        });
        ADDEMP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDEMP1ActionPerformed(evt);
            }
        });
        getContentPane().add(ADDEMP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 230, 30));

        deleteemp.setBackground(new java.awt.Color(0, 51, 153));
        deleteemp.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        deleteemp.setForeground(new java.awt.Color(255, 255, 255));
        deleteemp.setText("Delete an Employee");
        deleteemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteempActionPerformed(evt);
            }
        });
        getContentPane().add(deleteemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 590, 230, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\pic\\pic\\employee2 (1).png")); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 80, 250, 200));

        updateemp.setBackground(new java.awt.Color(0, 0, 153));
        updateemp.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        updateemp.setForeground(new java.awt.Color(255, 255, 255));
        updateemp.setText("Update");
        updateemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateempActionPerformed(evt);
            }
        });
        getContentPane().add(updateemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, 210, 30));

        reportmaxsal.setBackground(new java.awt.Color(0, 51, 153));
        reportmaxsal.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        reportmaxsal.setForeground(new java.awt.Color(255, 255, 255));
        reportmaxsal.setText("Generate report Max \nsalary\n");
        reportmaxsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportmaxsalActionPerformed(evt);
            }
        });
        getContentPane().add(reportmaxsal, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 230, 30));

        searchattr.setBackground(new java.awt.Color(0, 51, 153));
        searchattr.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        searchattr.setForeground(new java.awt.Color(255, 255, 255));
        searchattr.setText("Search by attribute");
        searchattr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchattrActionPerformed(evt);
            }
        });
        getContentPane().add(searchattr, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 590, 210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void CategoriesempMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriesempMouseClicked
this.setVisible(false);
new CATEGORIES().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_CategoriesempMouseClicked

    private void CategorieseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategorieseMouseClicked
this.setVisible(false);
new CATEGORIES().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_CategorieseMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
this.setVisible(false);
new First_page().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutMouseClicked

    private void ADDEMP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDEMP1MouseClicked
this.setVisible(false);
new Addemp1().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_ADDEMP1MouseClicked

    private void searchempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchempActionPerformed
           try{
                     DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
             
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con =DriverManager.getConnection(url,"c##woroud","123456") ;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM EMPLOYEE");
            DefaultTableModel tblmodel=(DefaultTableModel)jTable1.getModel();
            tblmodel.setRowCount(0);
            while(rs.next())
            {
                String EID= rs.getString("EID");
                String FName= rs.getString("FNAME");
                String LNAME= rs.getString("LNAME");
                String STREET= rs.getString("STREET");
                String AGE= rs.getString("AGE");
                String PHONUM= rs.getString("PHONUM");
                String SALARY= rs.getString("SALARY");
                String ROLE= rs.getString("ROLE");
                String GENDER= rs.getString("GENDER");
                String EMAIL= rs.getString("EMAIL");
                String PASSWORD= rs.getString("PASSWORD");
                String CITY= rs.getString("CITY");
                
                
                String empdata []={FName,LNAME,EID,PASSWORD,GENDER,EMAIL,ROLE,AGE,SALARY,STREET,CITY,PHONUM};
                //DefaultTableModel tblmodel=(DefaultTableModel)jTable1.getModel();
                tblmodel.addRow(empdata);
                
            }
            con.commit();
            con.close();
                   
           }
           catch(Exception e)
           {
               System.out.println(e.getMessage());
           }
        // TODO add your handling code here:
    }//GEN-LAST:event_searchempActionPerformed

    private void ADDEMP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDEMP1ActionPerformed
//new Addemp1().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_ADDEMP1ActionPerformed

    private void deleteempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteempActionPerformed
       
         try{
                     DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
             
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con2 =DriverManager.getConnection(url,"c##woroud","123456") ;
            
            DefaultTableModel tblmodel=(DefaultTableModel)jTable1.getModel();
            Statement st = con2.createStatement();
            int x=jTable1.getSelectedRow();
            String idd=jTable1.getModel().getValueAt(x, 2).toString();
            String del="delete from EMPLOYEE where EID= "+idd;
            st.executeQuery(del);
            ResultSet rs = st.executeQuery("SELECT * FROM EMPLOYEE");
            tblmodel.removeRow(jTable1.getSelectedRow());
             //DefaultTableModel tblmodel=(DefaultTableModel)jTable1.getModel();
            // tblmodel.removeRow(jTable1.getSelectedRow());
            tblmodel.setRowCount(0);
            while(rs.next())
            {
                String EID= rs.getString("EID");
                String FName= rs.getString("FNAME");
                String LNAME= rs.getString("LNAME");
                String STREET= rs.getString("STREET");
                String AGE= rs.getString("AGE");
                String PHONUM= rs.getString("PHONUM");
                String SALARY= rs.getString("SALARY");
                String ROLE= rs.getString("ROLE");
                String GENDER= rs.getString("GENDER");
                String EMAIL= rs.getString("EMAIL");
                String PASSWORD= rs.getString("PASSWORD");
                String CITY= rs.getString("CITY");
                
                
                String empdata []={EID,FName,LNAME,STREET,AGE,PHONUM,SALARY,ROLE,GENDER,EMAIL,PASSWORD,CITY};
                //DefaultTableModel tblmodel=(DefaultTableModel)jTable1.getModel();
                tblmodel.addRow(empdata);
                
            }
            //tblmodel.removeRow(jTable1.getSelectedRow());
            con2.commit();
            con2.close();
                   
           }
           catch(Exception e)
           {
               System.out.println(e.getMessage());
           }




// TODO add your handling code here:
    }//GEN-LAST:event_deleteempActionPerformed

    private void updateempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateempActionPerformed
        try{
                     DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
             
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con2 =DriverManager.getConnection(url,"c##woroud","123456") ;
            
            DefaultTableModel tblmodel=(DefaultTableModel)jTable1.getModel();
            Statement st = con2.createStatement();
            int x=jTable1.getSelectedRow();
            String fname=jTable1.getModel().getValueAt(x, 0).toString();
            String lname=jTable1.getModel().getValueAt(x, 1).toString();
            String idd=jTable1.getModel().getValueAt(x, 2).toString();
            String pass=jTable1.getModel().getValueAt(x, 3).toString();
            String sex=jTable1.getModel().getValueAt(x, 4).toString();
            String email=jTable1.getModel().getValueAt(x, 5).toString();
            String role=jTable1.getModel().getValueAt(x, 6).toString();
            String age=jTable1.getModel().getValueAt(x, 7).toString();
            String salary=jTable1.getModel().getValueAt(x, 8).toString();
            String street=jTable1.getModel().getValueAt(x, 9).toString();
            String city=jTable1.getModel().getValueAt(x, 10).toString();
            String phone=jTable1.getModel().getValueAt(x, 11).toString();
            String del="update EMPLOYEE set FNAME='"+fname+"',LNAME='"+lname+"',EID='"+idd+"',PASSWORD='"+pass+"',STREET='"+street+"',AGE='"+age+"',PHONUM='"+phone+"',SALARY='"+salary+"',ROLE='"+role+"',GENDER='"+sex+"',EMAIL='"+email+"',CITY='"+city+"'where EID='"+idd+"'";
            st.executeQuery(del);
            ResultSet rs = st.executeQuery("SELECT * FROM EMPLOYEE");
            //tblmodel.removeRow(jTable1.getSelectedRow());
             //DefaultTableModel tblmodel=(DefaultTableModel)jTable1.getModel();
            // tblmodel.removeRow(jTable1.getSelectedRow());
            tblmodel.setRowCount(0);
            while(rs.next())
            {
                String EID= rs.getString("EID");
                String FName= rs.getString("FNAME");
                String LNAME= rs.getString("LNAME");
                String STREET= rs.getString("STREET");
                String AGE= rs.getString("AGE");
                String PHONUM= rs.getString("PHONUM");
                String SALARY= rs.getString("SALARY");
                String ROLE= rs.getString("ROLE");
                String GENDER= rs.getString("GENDER");
                String EMAIL= rs.getString("EMAIL");
                String PASSWORD= rs.getString("PASSWORD");
                String CITY= rs.getString("CITY");
                
                
                String empdata []={EID,FName,LNAME,STREET,AGE,PHONUM,SALARY,ROLE,GENDER,EMAIL,PASSWORD,CITY};
                //DefaultTableModel tblmodel=(DefaultTableModel)jTable1.getModel();
                tblmodel.addRow(empdata);
                
            }
            //tblmodel.removeRow(jTable1.getSelectedRow());
            con2.commit();
            con2.close();
                   
           }
           catch(Exception e)
           {
               System.out.println(e.getMessage());
           }
// TODO add your handling code here:
    }//GEN-LAST:event_updateempActionPerformed

    private void reportmaxsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportmaxsalActionPerformed
           //OracleDataSource oda=new OracleDataSource();
           //oda.setUser("c##woroud");
           //oda.setPassword("123456");
           //oda.setURL("jdbc:oracle:thin@localhost:1521:orcl");
           //Connection con=oda.getConnection();
           try{
           DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
             //OracleDataSource ode=new OracleDataSource();
             //ode.setUser("c##woroud");
             //ode.setPassword("123456");
             //ode.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con =DriverManager.getConnection(url,"c##woroud","123456") ;
            InputStream input=new FileInputStream(new File("Max_salary.jrxml"));
            JasperDesign gd=JRXmlLoader.load(input);
            JasperReport jr=JasperCompileManager.compileReport(gd);
            JasperPrint jp=JasperFillManager.fillReport(jr,null,con);
            JFrame frame=new JFrame("Report");
            frame.getContentPane().add(new JRViewer(jp));
            frame.pack();
            frame.setVisible(true);
           }
           catch(Exception e)
           {
               
           }
        // TODO add your handling code here:
    }//GEN-LAST:event_reportmaxsalActionPerformed

    private void searchattrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchattrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchattrActionPerformed

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
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDEMP1;
    private javax.swing.JLabel Categoriese;
    private javax.swing.JLabel Categoriesemp;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Profilee;
    private javax.swing.JButton deleteemp;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton reportmaxsal;
    private javax.swing.JButton searchattr;
    private javax.swing.JButton searchemp;
    private javax.swing.JButton updateemp;
    // End of variables declaration//GEN-END:variables
}
