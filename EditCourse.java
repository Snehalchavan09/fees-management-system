/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fees_management_system1;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Omkarnath Panage
 */
public class EditCourse extends javax.swing.JFrame {

    /**
     * Creates new form EditCourse
     */
    DefaultTableModel model;
    public EditCourse() {
        initComponents();
        setRecordsToTable();
    }
        public void setRecordsToTable(){
        try{
          Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fees_management","root","rootpassword");
             PreparedStatement pst = con.prepareStatement("select * from course");
             ResultSet rs = pst.executeQuery();
             while(rs.next()){
                 String courseId = rs.getString("Id");
                 String cname= rs.getString("CNAME");
                 String cost = rs.getString("COST");
                 
                 
                 Object []obj ={courseId,cname,cost};
                model = (DefaultTableModel)tbl_course.getModel();
                model.addRow(obj);
             }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
        public void addCourse(int id, String cname, double cost){
            try{
                 Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fees_management","root","rootpassword");
                PreparedStatement pst = con.prepareStatement("insert into course values(?,?,?)");
                pst.setInt(1,id);
                pst.setString(2, cname);
                pst.setDouble(3, cost);
                
                int rowCount = pst.executeUpdate();
                if(rowCount == 1){
                    JOptionPane.showMessageDialog(this,"course added succesfully");
                    clearTable();
                    setRecordsToTable();
                  
                }
                else{
                    JOptionPane.showMessageDialog(this,"course insertion failed");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"course insertion failed");
                e.printStackTrace();
            }
        }
        
        public void clearTable(){
            DefaultTableModel model = (DefaultTableModel)tbl_course.getModel();
            model.setRowCount(0);
        }
        public void update(int id,String cname, double cost){
             try{
                 Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fees_management","root","rootpassword");
                PreparedStatement pst = con.prepareStatement("update course set CNAME=?, COST=? where Id=?");
               
                pst.setString(1, cname);
                pst.setDouble(2, cost);
                 pst.setInt(3,id);
                
                int rowCount = pst.executeUpdate();
                if(rowCount == 1){
                    JOptionPane.showMessageDialog(this,"course updated succesfully");
                    clearTable();
                    setRecordsToTable();
                  
                }
                else{
                    JOptionPane.showMessageDialog(this,"course updation failed");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"course updation failed");
                e.printStackTrace();
            }
        }
        
         public void delete(int id){
             try{
                 Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fees_management","root","rootpassword");
                PreparedStatement pst = con.prepareStatement("delete from course where Id=?");
               
               
                 pst.setInt(1,id);
                
                int rowCount = pst.executeUpdate();
                if(rowCount == 1){
                    JOptionPane.showMessageDialog(this,"course deleted succesfully");
                    clearTable();
                    setRecordsToTable();
                  
                }
                else{
                    JOptionPane.showMessageDialog(this,"course deletion failed");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"course deletion failed");
                e.printStackTrace();
            }
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelsidebar = new javax.swing.JPanel();
        panelLogout = new javax.swing.JPanel();
        btnLogout = new javax.swing.JLabel();
        panelHome2 = new javax.swing.JPanel();
        btnHome2 = new javax.swing.JLabel();
        panelHome3 = new javax.swing.JPanel();
        btnHome3 = new javax.swing.JLabel();
        panelHome4 = new javax.swing.JPanel();
        btnHome4 = new javax.swing.JLabel();
        panelHome13 = new javax.swing.JPanel();
        btnHome13 = new javax.swing.JLabel();
        panelHome14 = new javax.swing.JPanel();
        btnHome14 = new javax.swing.JLabel();
        panelHome15 = new javax.swing.JPanel();
        btnHome15 = new javax.swing.JLabel();
        panelHome16 = new javax.swing.JPanel();
        btnHome16 = new javax.swing.JLabel();
        panelHome = new javax.swing.JPanel();
        btnHome = new javax.swing.JLabel();
        panelSearchRecord = new javax.swing.JPanel();
        btnSearchRecord = new javax.swing.JLabel();
        panelHome6 = new javax.swing.JPanel();
        btnHome6 = new javax.swing.JLabel();
        panelHome7 = new javax.swing.JPanel();
        btnHome7 = new javax.swing.JLabel();
        panelHome8 = new javax.swing.JPanel();
        btnHome8 = new javax.swing.JLabel();
        panelEditCourse = new javax.swing.JPanel();
        btnEditCourse = new javax.swing.JLabel();
        panelHome10 = new javax.swing.JPanel();
        btnHome10 = new javax.swing.JLabel();
        panelHome11 = new javax.swing.JPanel();
        btnHome11 = new javax.swing.JLabel();
        panelHome12 = new javax.swing.JPanel();
        btnHome12 = new javax.swing.JLabel();
        panelCourseList = new javax.swing.JPanel();
        btnCourseList = new javax.swing.JLabel();
        panelHome18 = new javax.swing.JPanel();
        btnHome18 = new javax.swing.JLabel();
        panelHome19 = new javax.swing.JPanel();
        btnHome19 = new javax.swing.JLabel();
        panelHome20 = new javax.swing.JPanel();
        btnHome20 = new javax.swing.JLabel();
        panelHome21 = new javax.swing.JPanel();
        btnHome21 = new javax.swing.JLabel();
        panelHome22 = new javax.swing.JPanel();
        btnHome22 = new javax.swing.JLabel();
        panelHome23 = new javax.swing.JPanel();
        btnHome23 = new javax.swing.JLabel();
        panelHome24 = new javax.swing.JPanel();
        btnHome24 = new javax.swing.JLabel();
        panelViewAllRecords = new javax.swing.JPanel();
        btnViewAllRecords = new javax.swing.JLabel();
        panelHome26 = new javax.swing.JPanel();
        btnHome26 = new javax.swing.JLabel();
        panelHome27 = new javax.swing.JPanel();
        btnHome27 = new javax.swing.JLabel();
        panelHome28 = new javax.swing.JPanel();
        btnHome28 = new javax.swing.JLabel();
        panelHome29 = new javax.swing.JPanel();
        btnHome29 = new javax.swing.JLabel();
        panelHome30 = new javax.swing.JPanel();
        btnHome30 = new javax.swing.JLabel();
        panelHome31 = new javax.swing.JPanel();
        btnHome31 = new javax.swing.JLabel();
        panelHome32 = new javax.swing.JPanel();
        btnHome32 = new javax.swing.JLabel();
        panelBack = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        panelHome34 = new javax.swing.JPanel();
        btnHome34 = new javax.swing.JLabel();
        panelHome35 = new javax.swing.JPanel();
        btnHome35 = new javax.swing.JLabel();
        panelHome36 = new javax.swing.JPanel();
        btnHome36 = new javax.swing.JLabel();
        panelHome37 = new javax.swing.JPanel();
        btnHome37 = new javax.swing.JLabel();
        panelHome38 = new javax.swing.JPanel();
        btnHome38 = new javax.swing.JLabel();
        panelHome39 = new javax.swing.JPanel();
        btnHome39 = new javax.swing.JLabel();
        panelHome40 = new javax.swing.JPanel();
        btnHome40 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_course = new javax.swing.JTable();
        txtcourseprice = new javax.swing.JTextField();
        txt_courseId = new javax.swing.JTextField();
        txtcoursename = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelsidebar.setBackground(new java.awt.Color(0, 102, 102));
        panelsidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogout.setBackground(new java.awt.Color(0, 102, 102));
        panelLogout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelLogout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\logout.png")); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutMouseExited(evt);
            }
        });
        panelLogout.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome2.setBackground(new java.awt.Color(0, 102, 102));
        panelHome2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome2.setForeground(new java.awt.Color(255, 255, 255));
        btnHome2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome2.setText("HOME");
        btnHome2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome2MouseExited(evt);
            }
        });
        panelHome2.add(btnHome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelLogout.add(panelHome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelHome3.setBackground(new java.awt.Color(0, 102, 102));
        panelHome3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome3.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome3.setForeground(new java.awt.Color(255, 255, 255));
        btnHome3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome3.setText("HOME");
        btnHome3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome3MouseExited(evt);
            }
        });
        panelHome3.add(btnHome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome4.setBackground(new java.awt.Color(0, 102, 102));
        panelHome4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome4.setForeground(new java.awt.Color(255, 255, 255));
        btnHome4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome4.setText("HOME");
        btnHome4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome4MouseExited(evt);
            }
        });
        panelHome4.add(btnHome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome3.add(panelHome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelLogout.add(panelHome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelHome13.setBackground(new java.awt.Color(0, 102, 102));
        panelHome13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome13.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome13.setForeground(new java.awt.Color(255, 255, 255));
        btnHome13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome13.setText("HOME");
        btnHome13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome13MouseExited(evt);
            }
        });
        panelHome13.add(btnHome13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome14.setBackground(new java.awt.Color(0, 102, 102));
        panelHome14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome14.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome14.setForeground(new java.awt.Color(255, 255, 255));
        btnHome14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome14.setText("HOME");
        btnHome14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome14MouseExited(evt);
            }
        });
        panelHome14.add(btnHome14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome13.add(panelHome14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelHome15.setBackground(new java.awt.Color(0, 102, 102));
        panelHome15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome15.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome15.setForeground(new java.awt.Color(255, 255, 255));
        btnHome15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome15.setText("HOME");
        btnHome15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome15MouseExited(evt);
            }
        });
        panelHome15.add(btnHome15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome16.setBackground(new java.awt.Color(0, 102, 102));
        panelHome16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome16.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome16.setForeground(new java.awt.Color(255, 255, 255));
        btnHome16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome16.setText("HOME");
        btnHome16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome16MouseExited(evt);
            }
        });
        panelHome16.add(btnHome16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome15.add(panelHome16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelHome13.add(panelHome15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelLogout.add(panelHome13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 330, 70));

        panelsidebar.add(panelLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 710, 330, 70));

        panelHome.setBackground(new java.awt.Color(0, 102, 102));
        panelHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome.setText("HOME");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });
        panelHome.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        panelsidebar.add(panelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 330, 70));

        panelSearchRecord.setBackground(new java.awt.Color(0, 102, 102));
        panelSearchRecord.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelSearchRecord.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearchRecord.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnSearchRecord.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchRecord.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\search2.png")); // NOI18N
        btnSearchRecord.setText("Search Record");
        btnSearchRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchRecordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchRecordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchRecordMouseExited(evt);
            }
        });
        panelSearchRecord.add(btnSearchRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        panelHome6.setBackground(new java.awt.Color(0, 102, 102));
        panelHome6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome6.setForeground(new java.awt.Color(255, 255, 255));
        btnHome6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome6.setText("HOME");
        btnHome6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome6MouseExited(evt);
            }
        });
        panelHome6.add(btnHome6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelSearchRecord.add(panelHome6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelHome7.setBackground(new java.awt.Color(0, 102, 102));
        panelHome7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome7.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome7.setForeground(new java.awt.Color(255, 255, 255));
        btnHome7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome7.setText("HOME");
        btnHome7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome7MouseExited(evt);
            }
        });
        panelHome7.add(btnHome7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome8.setBackground(new java.awt.Color(0, 102, 102));
        panelHome8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome8.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome8.setForeground(new java.awt.Color(255, 255, 255));
        btnHome8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome8.setText("HOME");
        btnHome8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome8MouseExited(evt);
            }
        });
        panelHome8.add(btnHome8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome7.add(panelHome8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelSearchRecord.add(panelHome7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelsidebar.add(panelSearchRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 330, 70));

        panelEditCourse.setBackground(new java.awt.Color(0, 102, 102));
        panelEditCourse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelEditCourse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditCourse.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnEditCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnEditCourse.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\edit2.png")); // NOI18N
        btnEditCourse.setText("Edit Courses");
        btnEditCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditCourseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditCourseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditCourseMouseExited(evt);
            }
        });
        panelEditCourse.add(btnEditCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        panelHome10.setBackground(new java.awt.Color(0, 102, 102));
        panelHome10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome10.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome10.setForeground(new java.awt.Color(255, 255, 255));
        btnHome10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome10.setText("HOME");
        btnHome10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome10MouseExited(evt);
            }
        });
        panelHome10.add(btnHome10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelEditCourse.add(panelHome10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelHome11.setBackground(new java.awt.Color(0, 102, 102));
        panelHome11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome11.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome11.setForeground(new java.awt.Color(255, 255, 255));
        btnHome11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome11.setText("HOME");
        btnHome11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome11MouseExited(evt);
            }
        });
        panelHome11.add(btnHome11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome12.setBackground(new java.awt.Color(0, 102, 102));
        panelHome12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome12.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome12.setForeground(new java.awt.Color(255, 255, 255));
        btnHome12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome12.setText("HOME");
        btnHome12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome12MouseExited(evt);
            }
        });
        panelHome12.add(btnHome12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome11.add(panelHome12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelEditCourse.add(panelHome11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelsidebar.add(panelEditCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 330, 70));

        panelCourseList.setBackground(new java.awt.Color(0, 102, 102));
        panelCourseList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelCourseList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCourseList.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnCourseList.setForeground(new java.awt.Color(255, 255, 255));
        btnCourseList.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\list.png")); // NOI18N
        btnCourseList.setText("Update Records");
        btnCourseList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCourseListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCourseListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCourseListMouseExited(evt);
            }
        });
        panelCourseList.add(btnCourseList, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        panelHome18.setBackground(new java.awt.Color(0, 102, 102));
        panelHome18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome18.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome18.setForeground(new java.awt.Color(255, 255, 255));
        btnHome18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome18.setText("HOME");
        btnHome18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome18MouseExited(evt);
            }
        });
        panelHome18.add(btnHome18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelCourseList.add(panelHome18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelHome19.setBackground(new java.awt.Color(0, 102, 102));
        panelHome19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome19.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome19.setForeground(new java.awt.Color(255, 255, 255));
        btnHome19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome19.setText("HOME");
        btnHome19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome19MouseExited(evt);
            }
        });
        panelHome19.add(btnHome19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome20.setBackground(new java.awt.Color(0, 102, 102));
        panelHome20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome20.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome20.setForeground(new java.awt.Color(255, 255, 255));
        btnHome20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome20.setText("HOME");
        btnHome20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome20MouseExited(evt);
            }
        });
        panelHome20.add(btnHome20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome19.add(panelHome20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelCourseList.add(panelHome19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelHome21.setBackground(new java.awt.Color(0, 102, 102));
        panelHome21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome21.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome21.setForeground(new java.awt.Color(255, 255, 255));
        btnHome21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome21.setText("HOME");
        btnHome21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome21MouseExited(evt);
            }
        });
        panelHome21.add(btnHome21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome22.setBackground(new java.awt.Color(0, 102, 102));
        panelHome22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome22.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome22.setForeground(new java.awt.Color(255, 255, 255));
        btnHome22.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome22.setText("HOME");
        btnHome22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome22MouseExited(evt);
            }
        });
        panelHome22.add(btnHome22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome21.add(panelHome22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelHome23.setBackground(new java.awt.Color(0, 102, 102));
        panelHome23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome23.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome23.setForeground(new java.awt.Color(255, 255, 255));
        btnHome23.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome23.setText("HOME");
        btnHome23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome23MouseExited(evt);
            }
        });
        panelHome23.add(btnHome23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome24.setBackground(new java.awt.Color(0, 102, 102));
        panelHome24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome24.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome24.setForeground(new java.awt.Color(255, 255, 255));
        btnHome24.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome24.setText("HOME");
        btnHome24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome24MouseExited(evt);
            }
        });
        panelHome24.add(btnHome24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome23.add(panelHome24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelHome21.add(panelHome23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelCourseList.add(panelHome21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 330, 70));

        panelsidebar.add(panelCourseList, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 330, 70));

        panelViewAllRecords.setBackground(new java.awt.Color(0, 102, 102));
        panelViewAllRecords.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelViewAllRecords.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewAllRecords.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnViewAllRecords.setForeground(new java.awt.Color(255, 255, 255));
        btnViewAllRecords.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\view all record.png")); // NOI18N
        btnViewAllRecords.setText("View All Records");
        btnViewAllRecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewAllRecordsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewAllRecordsMouseExited(evt);
            }
        });
        panelViewAllRecords.add(btnViewAllRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        panelHome26.setBackground(new java.awt.Color(0, 102, 102));
        panelHome26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome26.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome26.setForeground(new java.awt.Color(255, 255, 255));
        btnHome26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome26.setText("HOME");
        btnHome26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome26MouseExited(evt);
            }
        });
        panelHome26.add(btnHome26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelViewAllRecords.add(panelHome26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelHome27.setBackground(new java.awt.Color(0, 102, 102));
        panelHome27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome27.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome27.setForeground(new java.awt.Color(255, 255, 255));
        btnHome27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome27.setText("HOME");
        btnHome27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome27MouseExited(evt);
            }
        });
        panelHome27.add(btnHome27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome28.setBackground(new java.awt.Color(0, 102, 102));
        panelHome28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome28.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome28.setForeground(new java.awt.Color(255, 255, 255));
        btnHome28.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome28.setText("HOME");
        btnHome28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome28MouseExited(evt);
            }
        });
        panelHome28.add(btnHome28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome27.add(panelHome28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelViewAllRecords.add(panelHome27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelHome29.setBackground(new java.awt.Color(0, 102, 102));
        panelHome29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome29.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome29.setForeground(new java.awt.Color(255, 255, 255));
        btnHome29.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome29.setText("HOME");
        btnHome29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome29MouseExited(evt);
            }
        });
        panelHome29.add(btnHome29, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome30.setBackground(new java.awt.Color(0, 102, 102));
        panelHome30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome30.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome30.setForeground(new java.awt.Color(255, 255, 255));
        btnHome30.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome30.setText("HOME");
        btnHome30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome30MouseExited(evt);
            }
        });
        panelHome30.add(btnHome30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome29.add(panelHome30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelHome31.setBackground(new java.awt.Color(0, 102, 102));
        panelHome31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome31.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome31.setForeground(new java.awt.Color(255, 255, 255));
        btnHome31.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome31.setText("HOME");
        btnHome31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome31MouseExited(evt);
            }
        });
        panelHome31.add(btnHome31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome32.setBackground(new java.awt.Color(0, 102, 102));
        panelHome32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome32.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome32.setForeground(new java.awt.Color(255, 255, 255));
        btnHome32.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome32.setText("HOME");
        btnHome32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome32MouseExited(evt);
            }
        });
        panelHome32.add(btnHome32, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome31.add(panelHome32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelHome29.add(panelHome31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelViewAllRecords.add(panelHome29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 330, 70));

        panelsidebar.add(panelViewAllRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 330, 70));

        panelBack.setBackground(new java.awt.Color(0, 102, 102));
        panelBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\left-arrow.png")); // NOI18N
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        panelBack.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome34.setBackground(new java.awt.Color(0, 102, 102));
        panelHome34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome34.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome34.setForeground(new java.awt.Color(255, 255, 255));
        btnHome34.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome34.setText("HOME");
        btnHome34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome34MouseExited(evt);
            }
        });
        panelHome34.add(btnHome34, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelBack.add(panelHome34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelHome35.setBackground(new java.awt.Color(0, 102, 102));
        panelHome35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome35.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome35.setForeground(new java.awt.Color(255, 255, 255));
        btnHome35.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome35.setText("HOME");
        btnHome35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome35MouseExited(evt);
            }
        });
        panelHome35.add(btnHome35, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome36.setBackground(new java.awt.Color(0, 102, 102));
        panelHome36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome36.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome36.setForeground(new java.awt.Color(255, 255, 255));
        btnHome36.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome36.setText("HOME");
        btnHome36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome36MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome36MouseExited(evt);
            }
        });
        panelHome36.add(btnHome36, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome35.add(panelHome36, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelBack.add(panelHome35, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelHome37.setBackground(new java.awt.Color(0, 102, 102));
        panelHome37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome37.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome37.setForeground(new java.awt.Color(255, 255, 255));
        btnHome37.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome37.setText("HOME");
        btnHome37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome37MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome37MouseExited(evt);
            }
        });
        panelHome37.add(btnHome37, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome38.setBackground(new java.awt.Color(0, 102, 102));
        panelHome38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome38.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome38.setForeground(new java.awt.Color(255, 255, 255));
        btnHome38.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome38.setText("HOME");
        btnHome38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome38MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome38MouseExited(evt);
            }
        });
        panelHome38.add(btnHome38, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome37.add(panelHome38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelHome39.setBackground(new java.awt.Color(0, 102, 102));
        panelHome39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome39.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome39.setForeground(new java.awt.Color(255, 255, 255));
        btnHome39.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome39.setText("HOME");
        btnHome39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome39MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome39MouseExited(evt);
            }
        });
        panelHome39.add(btnHome39, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome40.setBackground(new java.awt.Color(0, 102, 102));
        panelHome40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome40.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnHome40.setForeground(new java.awt.Color(255, 255, 255));
        btnHome40.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\home.png")); // NOI18N
        btnHome40.setText("HOME");
        btnHome40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHome40MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHome40MouseExited(evt);
            }
        });
        panelHome40.add(btnHome40, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        panelHome39.add(panelHome40, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelHome37.add(panelHome39, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 330, 70));

        panelBack.add(panelHome37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 330, 70));

        panelsidebar.add(panelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 330, 70));

        getContentPane().add(panelsidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, -30, 540, 1040));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_course.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course Name", "Course Price"
            }
        ));
        tbl_course.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_courseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_course);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 600, 670));
        jPanel1.add(txtcourseprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 270, 40));
        jPanel1.add(txt_courseId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 270, 40));
        jPanel1.add(txtcoursename, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 270, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Course Price :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 130, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Edit Course Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, -10, 310, 110));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Course Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 130, 30));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 690, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 690, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 690, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Course ID :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 130, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 590, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omkarnath Panage\\Desktop\\Fees_Management\\my icons\\back1.png")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 40, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 930));

        setSize(new java.awt.Dimension(1847, 944));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_courseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_courseMouseClicked
        // TODO add your handling code here:
     int rowNo = tbl_course.getSelectedRow();
     TableModel model = tbl_course.getModel();
     
     txt_courseId.setText(model.getValueAt(rowNo,0).toString());
     txtcoursename.setText((String)model.getValueAt(rowNo, 1));
     txtcourseprice.setText(model.getValueAt(rowNo, 2).toString());
    }//GEN-LAST:event_tbl_courseMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(txt_courseId.getText());
        String cname= txtcoursename.getText();
        double cost = Double.parseDouble(txtcourseprice.getText());
        
        addCourse(id,cname,cost);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          int id=Integer.parseInt(txt_courseId.getText());
        String cname= txtcoursename.getText();
        double cost = Double.parseDouble(txtcourseprice.getText());
        
        update(id,cname,cost);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(txt_courseId.getText());
        
        
        delete(id);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        home home1 = new home();
        home1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnHome40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome40MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome40MouseExited

    private void btnHome40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome40MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome40MouseEntered

    private void btnHome39MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome39MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome39MouseExited

    private void btnHome39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome39MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome39MouseEntered

    private void btnHome38MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome38MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome38MouseExited

    private void btnHome38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome38MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome38MouseEntered

    private void btnHome37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome37MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome37MouseExited

    private void btnHome37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome37MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome37MouseEntered

    private void btnHome36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome36MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome36MouseExited

    private void btnHome36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome36MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome36MouseEntered

    private void btnHome35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome35MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome35MouseExited

    private void btnHome35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome35MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome35MouseEntered

    private void btnHome34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome34MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome34MouseExited

    private void btnHome34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome34MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome34MouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        // TODO add your handling code here:
        Color clr = new Color(0,103,103);
        panelBack.setBackground(clr);
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0,153,153);
        panelBack.setBackground(clr);
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
        home home1=new home();
        home1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnHome32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome32MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome32MouseExited

    private void btnHome32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome32MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome32MouseEntered

    private void btnHome31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome31MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome31MouseExited

    private void btnHome31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome31MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome31MouseEntered

    private void btnHome30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome30MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome30MouseExited

    private void btnHome30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome30MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome30MouseEntered

    private void btnHome29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome29MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome29MouseExited

    private void btnHome29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome29MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome29MouseEntered

    private void btnHome28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome28MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome28MouseExited

    private void btnHome28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome28MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome28MouseEntered

    private void btnHome27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome27MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome27MouseExited

    private void btnHome27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome27MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome27MouseEntered

    private void btnHome26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome26MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome26MouseExited

    private void btnHome26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome26MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome26MouseEntered

    private void btnViewAllRecordsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewAllRecordsMouseExited
        // TODO add your handling code here:
        Color clr = new Color(0,103,103);
        panelViewAllRecords.setBackground(clr);
    }//GEN-LAST:event_btnViewAllRecordsMouseExited

    private void btnViewAllRecordsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewAllRecordsMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0,153,153);
        panelViewAllRecords.setBackground(clr);
    }//GEN-LAST:event_btnViewAllRecordsMouseEntered

    private void btnHome24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome24MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome24MouseExited

    private void btnHome24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome24MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome24MouseEntered

    private void btnHome23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome23MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome23MouseExited

    private void btnHome23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome23MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome23MouseEntered

    private void btnHome22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome22MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome22MouseExited

    private void btnHome22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome22MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome22MouseEntered

    private void btnHome21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome21MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome21MouseExited

    private void btnHome21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome21MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome21MouseEntered

    private void btnHome20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome20MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome20MouseExited

    private void btnHome20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome20MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome20MouseEntered

    private void btnHome19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome19MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome19MouseExited

    private void btnHome19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome19MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome19MouseEntered

    private void btnHome18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome18MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome18MouseExited

    private void btnHome18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome18MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome18MouseEntered

    private void btnCourseListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCourseListMouseExited
        // TODO add your handling code here:
        Color clr = new Color(0,103,103);
        panelCourseList.setBackground(clr);
    }//GEN-LAST:event_btnCourseListMouseExited

    private void btnCourseListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCourseListMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0,153,153);
        panelCourseList.setBackground(clr);
    }//GEN-LAST:event_btnCourseListMouseEntered

    private void btnHome12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome12MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome12MouseExited

    private void btnHome12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome12MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome12MouseEntered

    private void btnHome11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome11MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome11MouseExited

    private void btnHome11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome11MouseEntered

    private void btnHome10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome10MouseExited

    private void btnHome10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome10MouseEntered

    private void btnEditCourseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditCourseMouseExited
        // TODO add your handling code here:
        Color clr = new Color(0,103,103);
        panelEditCourse.setBackground(clr);
    }//GEN-LAST:event_btnEditCourseMouseExited

    private void btnEditCourseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditCourseMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0,153,153);
        panelEditCourse.setBackground(clr);
    }//GEN-LAST:event_btnEditCourseMouseEntered

    private void btnEditCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditCourseMouseClicked
        // TODO add your handling code here:
        EditCourse edit = new EditCourse();
        edit.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditCourseMouseClicked

    private void btnHome8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome8MouseExited

    private void btnHome8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome8MouseEntered

    private void btnHome7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome7MouseExited

    private void btnHome7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome7MouseEntered

    private void btnHome6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome6MouseExited

    private void btnHome6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome6MouseEntered

    private void btnSearchRecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchRecordMouseExited
        // TODO add your handling code here:
        Color clr = new Color(0,103,103);
        panelSearchRecord.setBackground(clr);
    }//GEN-LAST:event_btnSearchRecordMouseExited

    private void btnSearchRecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchRecordMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0,153,153);
        panelSearchRecord.setBackground(clr);
    }//GEN-LAST:event_btnSearchRecordMouseEntered

    private void btnSearchRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchRecordMouseClicked
        // TODO add your handling code here:
        SearchRecord search = new SearchRecord();
        search.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSearchRecordMouseClicked

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        // TODO add your handling code here:
        Color clr= new Color(0,103,103);
        panelHome.setBackground(clr);
    }//GEN-LAST:event_btnHomeMouseExited

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        // TODO add your handling code here:
        Color clr = new Color(0,153,153);
        panelHome.setBackground(clr);
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        // TODO add your handling code here:
        home home1=new home();
        home1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnHome16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome16MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome16MouseExited

    private void btnHome16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome16MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome16MouseEntered

    private void btnHome15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome15MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome15MouseExited

    private void btnHome15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome15MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome15MouseEntered

    private void btnHome14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome14MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome14MouseExited

    private void btnHome14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome14MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome14MouseEntered

    private void btnHome13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome13MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome13MouseExited

    private void btnHome13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome13MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome13MouseEntered

    private void btnHome4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome4MouseExited

    private void btnHome4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome4MouseEntered

    private void btnHome3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome3MouseExited

    private void btnHome3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome3MouseEntered

    private void btnHome2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome2MouseExited

    private void btnHome2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHome2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome2MouseEntered

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
        // TODO add your handling code here:
        Color clr= new Color(0,103,103);
        panelLogout.setBackground(clr);
    }//GEN-LAST:event_btnLogoutMouseExited

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        // TODO add your handling code here:
        Color clr= new Color(0,153,153);
        panelLogout.setBackground(clr);
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnCourseListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCourseListMouseClicked
        // TODO add your handling code here:
        UpdateFeesDetails update = new UpdateFeesDetails();
        update.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCourseListMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        login1 login = new login1();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnCourseList;
    private javax.swing.JLabel btnEditCourse;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnHome10;
    private javax.swing.JLabel btnHome11;
    private javax.swing.JLabel btnHome12;
    private javax.swing.JLabel btnHome13;
    private javax.swing.JLabel btnHome14;
    private javax.swing.JLabel btnHome15;
    private javax.swing.JLabel btnHome16;
    private javax.swing.JLabel btnHome18;
    private javax.swing.JLabel btnHome19;
    private javax.swing.JLabel btnHome2;
    private javax.swing.JLabel btnHome20;
    private javax.swing.JLabel btnHome21;
    private javax.swing.JLabel btnHome22;
    private javax.swing.JLabel btnHome23;
    private javax.swing.JLabel btnHome24;
    private javax.swing.JLabel btnHome26;
    private javax.swing.JLabel btnHome27;
    private javax.swing.JLabel btnHome28;
    private javax.swing.JLabel btnHome29;
    private javax.swing.JLabel btnHome3;
    private javax.swing.JLabel btnHome30;
    private javax.swing.JLabel btnHome31;
    private javax.swing.JLabel btnHome32;
    private javax.swing.JLabel btnHome34;
    private javax.swing.JLabel btnHome35;
    private javax.swing.JLabel btnHome36;
    private javax.swing.JLabel btnHome37;
    private javax.swing.JLabel btnHome38;
    private javax.swing.JLabel btnHome39;
    private javax.swing.JLabel btnHome4;
    private javax.swing.JLabel btnHome40;
    private javax.swing.JLabel btnHome6;
    private javax.swing.JLabel btnHome7;
    private javax.swing.JLabel btnHome8;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnSearchRecord;
    private javax.swing.JLabel btnViewAllRecords;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelBack;
    private javax.swing.JPanel panelCourseList;
    private javax.swing.JPanel panelEditCourse;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelHome10;
    private javax.swing.JPanel panelHome11;
    private javax.swing.JPanel panelHome12;
    private javax.swing.JPanel panelHome13;
    private javax.swing.JPanel panelHome14;
    private javax.swing.JPanel panelHome15;
    private javax.swing.JPanel panelHome16;
    private javax.swing.JPanel panelHome18;
    private javax.swing.JPanel panelHome19;
    private javax.swing.JPanel panelHome2;
    private javax.swing.JPanel panelHome20;
    private javax.swing.JPanel panelHome21;
    private javax.swing.JPanel panelHome22;
    private javax.swing.JPanel panelHome23;
    private javax.swing.JPanel panelHome24;
    private javax.swing.JPanel panelHome26;
    private javax.swing.JPanel panelHome27;
    private javax.swing.JPanel panelHome28;
    private javax.swing.JPanel panelHome29;
    private javax.swing.JPanel panelHome3;
    private javax.swing.JPanel panelHome30;
    private javax.swing.JPanel panelHome31;
    private javax.swing.JPanel panelHome32;
    private javax.swing.JPanel panelHome34;
    private javax.swing.JPanel panelHome35;
    private javax.swing.JPanel panelHome36;
    private javax.swing.JPanel panelHome37;
    private javax.swing.JPanel panelHome38;
    private javax.swing.JPanel panelHome39;
    private javax.swing.JPanel panelHome4;
    private javax.swing.JPanel panelHome40;
    private javax.swing.JPanel panelHome6;
    private javax.swing.JPanel panelHome7;
    private javax.swing.JPanel panelHome8;
    private javax.swing.JPanel panelLogout;
    private javax.swing.JPanel panelSearchRecord;
    private javax.swing.JPanel panelViewAllRecords;
    private javax.swing.JPanel panelsidebar;
    private javax.swing.JTable tbl_course;
    private javax.swing.JTextField txt_courseId;
    private javax.swing.JTextField txtcoursename;
    private javax.swing.JTextField txtcourseprice;
    // End of variables declaration//GEN-END:variables
}
