

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class home extends javax.swing.JFrame {
java.sql.Connection conn = null;
ResultSet rs = null;
Statement st;
    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        scaleImage();
        scaleImage1();
        jPanel3.setBackground(new Color(0,0,0,150));
        jPanel1.setBackground(new Color(204,204,255,150));

    }
    public home(String para){
        initComponents();
        scaleImage();
        scaleImage1();
        scaleImage2();
        account.setText(para);
        computername();
        jPanel3.setBackground(new Color(0,0,0,150));
        jPanel4.setBackground(new Color(204,204,255,150));
        totalex.setBackground(new Color(255,255,255,255));
        totalin.setBackground(new Color(255,255,255,255));
        totalprof.setBackground(new Color(255,255,255,255));
        jPanel1.setBackground(new Color(204,255,255,100));
        insert.setBackground(new Color(255,255,255,150));
        compute.setBackground(new Color(255,255,255,150));
    }
    public void total1(){
Font labelFont = totalin.getFont();
String labelText = totalin.getText();
int stringWidth = totalin.getFontMetrics(labelFont).stringWidth(labelText);
int componentWidth = totalin.getWidth();

// Find out how much the font can grow in width.
double widthRatio = (double)componentWidth / (double)stringWidth;

int newFontSize = (int)(labelFont.getSize() * widthRatio);
int componentHeight = totalin.getHeight();

// Pick a new font size so it will not be larger than the height of label.
int fontSizeToUse = Math.min(newFontSize, componentHeight);

// Set the label's font size to the newly determined size.
totalin.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSizeToUse));
    }
    public void total2(){
        Font labelFont = totalex.getFont();
String labelText = totalex.getText();
int stringWidth = totalex.getFontMetrics(labelFont).stringWidth(labelText);
int componentWidth = totalex.getWidth();

// Find out how much the font can grow in width.
double widthRatio = (double)componentWidth / (double)stringWidth;

int newFontSize = (int)(labelFont.getSize() * widthRatio);
int componentHeight = totalex.getHeight();

// Pick a new font size so it will not be larger than the height of label.
int fontSizeToUse = Math.min(newFontSize, componentHeight);

// Set the label's font size to the newly determined size.
totalex.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSizeToUse));
    }
    public void total3(){
        Font labelFont = totalprof.getFont();
String labelText = totalprof.getText();
int stringWidth = totalprof.getFontMetrics(labelFont).stringWidth(labelText);
int componentWidth = totalprof.getWidth();

// Find out how much the font can grow in width.
double widthRatio = (double)componentWidth / (double)stringWidth;

int newFontSize = (int)(labelFont.getSize() * widthRatio);
int componentHeight = totalprof.getHeight();

// Pick a new font size so it will not be larger than the height of label.
int fontSizeToUse = Math.min(newFontSize, componentHeight);

// Set the label's font size to the newly determined size.
totalprof.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSizeToUse));
    }
public void computername(){

    String user = account.getText();
        try{
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/bactong","bactong","bactong");
            st = (Statement)conn.createStatement();
            rs = st.executeQuery("SELECT * FROM BACTONG.LOGIN WHERE USERNAME = '"+user+"'");
            while(rs.next()){
                shopname.setText(rs.getString(3));
Font labelFont = shopname.getFont();
String labelText = shopname.getText();
int stringWidth = shopname.getFontMetrics(labelFont).stringWidth(labelText);
int componentWidth = shopname.getWidth();

// Find out how much the font can grow in width.
double widthRatio = (double)componentWidth / (double)stringWidth;

int newFontSize = (int)(labelFont.getSize() * widthRatio);
int componentHeight = shopname.getHeight();

// Pick a new font size so it will not be larger than the height of label.
int fontSizeToUse = Math.min(newFontSize, componentHeight);

// Set the label's font size to the newly determined size.
shopname.setFont(new Font(labelFont.getName(), Font.PLAIN, fontSizeToUse));
                    break;
                }
            }
            catch (Exception ex){
                    Logger.getLogger(loginbactong.class.getName()).log(Level.SEVERE,null,ex);
                    final JPanel panel = new JPanel();
                    shopname.setText("Computer Shop Profit Database");
                    }
}
public void scaleImage(){
        ImageIcon icon = new ImageIcon("C:\\Users\\lenov_000\\Desktop\\Project Management 5th year Final\\BACTONG COMP SHOP\\BACTONG COMP SHOP\\3.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel7.getWidth(),jLabel7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel7.setIcon(scaledIcon);
   
    }
public void scaleImage1(){
        ImageIcon icon = new ImageIcon("C:\\Users\\lenov_000\\Desktop\\Project Management 5th year Final\\BACTONG COMP SHOP\\BACTONG COMP SHOP\\222026_preview.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(setup.getWidth(),setup.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        insert.setIcon(scaledIcon);
        compute.setIcon(scaledIcon);
    }
    public void scaleImage2(){
        ImageIcon icon = new ImageIcon("C:\\Users\\lenov_000\\Desktop\\Project Management 5th year Final\\BACTONG COMP SHOP\\BACTONG COMP SHOP\\logo1.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel2.setIcon(scaledIcon);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        time = new javax.swing.JComboBox<>();
        compute = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        setup = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        account = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        totalprof = new javax.swing.JLabel();
        totalin = new javax.swing.JLabel();
        totalex = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        shopname = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel2.setLayout(null);

        jPanel1.setLayout(null);

        time.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "per Day", "per Week", "per Month", "per Year", "Overall" }));
        jPanel1.add(time);
        time.setBounds(20, 230, 90, 30);

        compute.setBackground(new java.awt.Color(204, 204, 204));
        compute.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        compute.setText("Compute");
        compute.setContentAreaFilled(false);
        compute.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        compute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeActionPerformed(evt);
            }
        });
        jPanel1.add(compute);
        compute.setBounds(20, 190, 90, 30);

        insert.setBackground(new java.awt.Color(204, 204, 204));
        insert.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        insert.setText("Insert");
        insert.setContentAreaFilled(false);
        insert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel1.add(insert);
        insert.setBounds(20, 150, 90, 30);

        setup.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        setup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Setup", "Shop Info", "Expenses", "Account" }));
        setup.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setupActionPerformed(evt);
            }
        });
        jPanel1.add(setup);
        setup.setBounds(20, 110, 90, 30);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 10, 130, 90);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(20, 40, 130, 290);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Username:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 330, 60, 20);

        account.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        account.setForeground(new java.awt.Color(204, 255, 255));
        jPanel2.add(account);
        account.setBounds(70, 330, 160, 20);

        jPanel3.setLayout(null);

        totalprof.setBackground(new java.awt.Color(255, 255, 255));
        totalprof.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        totalprof.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalprof.setText("₱ 0.00");
        totalprof.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        totalprof.setOpaque(true);
        jPanel3.add(totalprof);
        totalprof.setBounds(360, 170, 140, 60);

        totalin.setBackground(new java.awt.Color(255, 255, 255));
        totalin.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        totalin.setForeground(new java.awt.Color(0, 204, 0));
        totalin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalin.setText("₱ 0.00");
        totalin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        totalin.setOpaque(true);
        jPanel3.add(totalin);
        totalin.setBounds(190, 170, 140, 60);

        totalex.setBackground(new java.awt.Color(255, 255, 255));
        totalex.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        totalex.setForeground(new java.awt.Color(204, 0, 51));
        totalex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalex.setText("₱ 0.00");
        totalex.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        totalex.setOpaque(true);
        jPanel3.add(totalex);
        totalex.setBounds(20, 170, 140, 60);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Total Expenses:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 130, 130, 20);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText(" Total Profit:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(380, 130, 110, 20);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total Income:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(210, 130, 110, 22);

        shopname.setBackground(new java.awt.Color(255, 255, 255));
        shopname.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        shopname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shopname.setText("KINGS");
        shopname.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        shopname.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(shopname, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shopname, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 20, 510, 80);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(150, 40, 510, 290);

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(570, 10, 90, 30);
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 0, 680, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed

        String msg = account.getText();
        dispose();
        Insertdata info = new Insertdata(msg);
        info.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_insertActionPerformed

    private void setupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setupActionPerformed
        // TODO add your handling code here:
        String test = setup.getItemAt(setup.getSelectedIndex());
        if (test.equals("Account")){
            dispose();
        String msg = account.getText();
        dispose();
        update info = new update(msg);
        info.setVisible(true);
        }
        else if (test.equals("Shop Info")){
        String msg = account.getText();
        dispose();
        setupdata2 info = new setupdata2(msg);
        info.setVisible(true);
        }
        else if (test.equals("Expenses")){
        String msg = account.getText();
        dispose();
        setupdata info = new setupdata(msg);
        info.setVisible(true);
        }
    }//GEN-LAST:event_setupActionPerformed

    private void computeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeActionPerformed
        // TODO add your handling code here:
        String user = account.getText();
        float auto1 = 0, nuse1 = 0, thour1 = 0, open1 = 0, rentex1 = 0, profit1 = 0, bun1 = 0, sleepex1 = 0;
        float auto2 = 0, nuse2 = 0, thour2 = 0, open2 = 0, rentex2 = 0, profit2 = 0, bun2 = 0;
        float auto3 = 0, nuse3 = 0, thour3 = 0, open3 = 0, rentex3 = 0, profit3 = 0, bun3 = 0;
        float auto4 = 0;
        float loop = 0, shot = 0, server = 0, busi = 0,staf = 0,room = 0, tprofit = 0, trentex = 0, tbun = 0, inte = 0,comp = 0, tax = 0, staff = 0, tota = 0,pric = 0,aver = 0,elec = 0, slee = 0, clue = 0,net = 0, tauto = 0, rent = 0;
        int years = 1, months = 1;
        try{
            st = (Statement)conn.createStatement();
            rs = st.executeQuery("SELECT * FROM BACTONG.EXP WHERE USERNAME = '"+user+"'");
            while(rs.next()){
                elec = rs.getInt(2);
                inte = rs.getInt(3);
                busi = rs.getInt(4);
                staf = rs.getInt(5);
                room = rs.getInt(6);
                    break;
                }
            rs = st.executeQuery("SELECT * FROM BACTONG.SETUP WHERE USERNAME = '"+user+"'");
            while(rs.next()){
                comp = rs.getInt(2);
                pric = rs.getInt(3);
                tota = rs.getInt(4);
                aver = rs.getInt(5);
                slee = rs.getInt(6);
                    break;
                }
            rs = st.executeQuery("SELECT SUM(NUMBERUSED) FROM BACTONG.DATAS"+user+" WHERE SWITCH = 1");
            while(rs.next()){
                int c = rs.getInt(1);
                        nuse1 = nuse1 + c;
                    break;
                }
            rs = st.executeQuery("SELECT SUM(OPENHOURS) FROM BACTONG.DATAS"+user+" WHERE SWITCH = 1");
            while(rs.next()){
                int c = rs.getInt(1);
                        open1 = open1 + c;
                    break;
                }
            rs = st.executeQuery("SELECT SUM(TOTALHOURS) FROM BACTONG.DATAS"+user+" WHERE SWITCH = 1");
            while(rs.next()){
                int c = rs.getInt(1);
                        thour1 = thour1 + c;
                    break;
                }
            rs = st.executeQuery("SELECT SUM(SWITCH) FROM BACTONG.DATAS"+user+" WHERE SWITCH = 1");
            while(rs.next()){
                int c = rs.getInt(1);
                        auto1 = (auto1 + c)-1;
                    break;
                }
            
            rs = st.executeQuery("SELECT SUM(NUMBERUSED) FROM BACTONG.DATAS"+user+" WHERE SWITCH = 2");
            while(rs.next()){
                int c = rs.getInt(1);
                        nuse2 = nuse2 + c;
                    break;
                }
            rs = st.executeQuery("SELECT SUM(OPENHOURS) FROM BACTONG.DATAS"+user+" WHERE SWITCH = 2");
            while(rs.next()){
                int c = rs.getInt(1);
                        open2 = open2 + c;
                    break;
                }
            rs = st.executeQuery("SELECT SUM(TOTALHOURS) FROM BACTONG.DATAS"+user+" WHERE SWITCH = 2");
            while(rs.next()){
                int c = rs.getInt(1);
                        thour2 = thour2 + c;
                    break;
                }
            rs = st.executeQuery("SELECT SUM(SWITCH) FROM BACTONG.DATAS"+user+" WHERE SWITCH = 2");
            while(rs.next()){
                int c = rs.getInt(1);
                        auto2 = ((auto2 + c)/2)-1;
                    break;
                }
            rs = st.executeQuery("SELECT SUM(NUMBERUSED) FROM BACTONG.DATAS"+user+" WHERE SWITCH = 3");
            while(rs.next()){
                int c = rs.getInt(1);
                        nuse3 = nuse3 + c;
                    break;
                }
            rs = st.executeQuery("SELECT SUM(OPENHOURS) FROM BACTONG.DATAS"+user+" WHERE SWITCH = 3");
            while(rs.next()){
                int c = rs.getInt(1);
                        open3 = open3 + c;
                    break;
                }
            rs = st.executeQuery("SELECT SUM(TOTALHOURS) FROM BACTONG.DATAS"+user+" WHERE SWITCH = 3");
            while(rs.next()){
                int c = rs.getInt(1);
                        thour3 = thour3 + c;
                    break;
                }
            rs = st.executeQuery("SELECT SUM(SWITCH) FROM BACTONG.DATAS"+user+" WHERE SWITCH = 3");
            while(rs.next()){
                int c = rs.getInt(1);
                        auto3 = ((auto3 + c)/3)-1;
                    break;
                }
            rs = st.executeQuery("SELECT SUM(SWITCH) FROM BACTONG.DATAS"+user+" WHERE SWITCH = 3");
            while(rs.next()){
                int c = rs.getInt(1);
                        auto4 = ((auto4 + c)/4)-1;
                    break;
                }
            }
            catch (Exception ex){
                    Logger.getLogger(loginbactong.class.getName()).log(Level.SEVERE,null,ex);
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel,"No Data to be Previewed!!","Database Notice", JOptionPane.ERROR_MESSAGE);
                    }
        String test = time.getItemAt(time.getSelectedIndex());
        tauto = auto1+auto2+auto3;
            years = (int) (tauto / 365);
            loop = (tauto/30);
            if (tauto % 30 != 0){
                months =(1 + ((int) loop));
            }
            else {
                months =(int) loop;
            }
        if (test.equals("per Day")){
            clue = 1;
            net = (float)(inte / 30); //internet and room rent
            tax = (float)(busi / 365);
            staff = staf;
            rent = (float) (room/30);
        }
        else if (test.equals("per Week")){
            clue = 7;
            net = (float) (inte/4.3452);
            tax = (float) (busi / 52.1429);
            staff = (float) staf*(tauto/7);
            rent = (float) (room/4.3452);
        }
        else if (test.equals("per Month")){
            clue = 30;
            net = (float)inte;
            tax =(float) (busi / 12);
            staff =(float) staf * (tauto/30);
            rent = (float)room;
        }
        else if (test.equals("per Year")){
            clue = 365;
            net = inte*(months);
            tax = busi;
            staff = staf * (tauto/365);
            rent = room*(months);
        }
        else if (test.equals("Overall")){
            clue = 1;
            net = inte*months;
            tax = busi*years;
            staff = staf * (tauto);
            rent = room * months;
            tauto = 1;
        }
        if(auto3 == 0){
            bun3 = 0;
            profit3 = 0;
            rentex3 = 0;
        }
        else{
        rentex3 = (float) ((((((open3*comp)/auto3)*aver)/1000)*elec)/clue); //totalex
        profit3 = ((thour3/auto3)/clue - rentex3); //totalprof
        bun3 = ((thour3)/clue); //totalin
        }
        if(auto2 == 0){
            bun2 = 0;
            profit2 = 0;
            rentex2 = 0;
        }
        else{
        rentex2 = (float) ((((((thour2/pric)/auto2)*aver)/1000)*elec)/clue); //totalex
        profit2 = ((thour2/auto2)/clue - rentex2); //totalprof
        bun2 = ((thour2)/clue); //totalin
        }
        if(auto1 == 0){
            bun1 = 0;
            profit1 = 0;
            rentex1 = 0;
        }
        else{
        sleepex1 = (((((open1 - ((thour1/pric)/comp))/auto1) * slee)/1000)*elec)/clue;
        rentex1 = (float) (((((((thour1/pric)/auto1)*aver)/1000)*elec)/clue)+sleepex1); //totalex
        profit1 = ((thour1/auto1)/clue - rentex1); //totalprof
        bun1 = ((thour1)/clue); //totalin
        }
        if (bun1 != 0){
            shot = shot + 1;
        }
        if (bun2 != 0){
            shot = shot + 1;
        }
        if (bun3 != 0){
            shot = shot + 1;
        }
        if ((bun1+bun2+bun3) == 0){
            shot = 1;
        }
        server = (float) (((((((open3+open2+open1)*comp)/(auto3+auto2+auto1))*aver)/1000)*elec)/clue); //totalex
        if (clue == 1){
            tbun = (int)((bun1+bun2+bun3)/tauto);
        }
        else{
        tbun = (int)((bun1+bun2+bun3));//final income
        }
        trentex = (int)(((rentex1+rentex2+rentex3)/tauto)+(tax+net+rent+staff+(server*tota)));//final expenses
        totalin.setText("₱ "+tbun);//bun1+bun2+bun3
        total1();
        totalex.setText("₱ "+trentex);
        total2();
        tprofit = (int)(tbun - trentex);
        if ((tprofit) > 0){
            totalprof.setForeground(Color.green);
        }
        else{
            totalprof.setForeground(Color.red);
        }
        totalprof.setText("₱ "+tprofit);
        total3();
    }//GEN-LAST:event_computeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        loginbactong info = new loginbactong();
        info.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel account;
    private javax.swing.JButton compute;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> setup;
    private javax.swing.JLabel shopname;
    private javax.swing.JComboBox<String> time;
    private javax.swing.JLabel totalex;
    private javax.swing.JLabel totalin;
    private javax.swing.JLabel totalprof;
    // End of variables declaration//GEN-END:variables
}
