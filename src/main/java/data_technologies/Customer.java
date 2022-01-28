package data_technologies;

/**
 *
 * @author Avishka
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



public class Customer extends javax.swing.JFrame {


    public Customer() {
        initComponents();
        show_user();
    }
    final String Driver = "com.mysql.cj.jdbc.Driver";
    final String URL = "jdbc:mysql://localhost:3306/data_technologies";
    final String dbusername="root";
    final String dbpassword="54257751";
   
    
    public ArrayList<User> userList()
    {
        ArrayList<User> usersList = new ArrayList<>();
        try {
            try {
                Class.forName(Driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con = DriverManager.getConnection(URL, dbusername, dbpassword);
            String query = "SELECT * FROM Customer";
            Statement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            User user;
            while(rs.next()){
                user = new User(rs.getInt("Customer_ID"), rs.getString("Customer_Name"), rs.getString("Customer_Address"), rs.getString("Customer_Mobile"), rs.getString("Customer_Email"), rs.getString("Username"), rs.getString("Password"));
                usersList.add(user);
            }
            }
        catch (SQLException ex)
            {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
            return usersList;
    }    
    
    public void show_user(){
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel)Table_1.getModel();
        Object[] row = new Object[7];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getname();
            row[2]=list.get(i).getaddress();
            row[3]=list.get(i).getmobile();
            row[4]=list.get(i).getemail();
            row[5]=list.get(i).getusername();
            row[6]=list.get(i).getpassword();
            model.addRow(row);
        }
    }
    

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id_text = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        reset_button = new javax.swing.JButton();
        name_text = new javax.swing.JTextField();
        address_text = new javax.swing.JTextField();
        mobile_text = new javax.swing.JTextField();
        email_text = new javax.swing.JTextField();
        username_text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        add_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_1 = new javax.swing.JTable();
        password_text = new javax.swing.JTextField();
        update_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        id_text.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Password");

        reset_button.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        reset_button.setText("Clear");
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });

        name_text.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        address_text.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        mobile_text.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        email_text.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        username_text.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Customer Name");

        add_button.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add_button.setText("Insert");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Customer Address");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel7.setText("Customer");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Customer Mobile");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Customer ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Customer Email");

        Table_1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Table_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Mobile", "Email", "Username", "Password"
            }
        ));
        Table_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_1);

        password_text.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        update_button.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        update_button.setText("Update");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        delete_button.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        delete_button.setText("Delete");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add_button)
                                .addGap(66, 66, 66)
                                .addComponent(update_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete_button)
                                .addGap(70, 70, 70)
                                .addComponent(reset_button))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(id_text)
                                    .addComponent(username_text)
                                    .addComponent(email_text)
                                    .addComponent(mobile_text)
                                    .addComponent(address_text)
                                    .addComponent(name_text)
                                    .addComponent(password_text, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(id_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(address_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(mobile_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(username_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(password_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_button)
                            .addComponent(reset_button)
                            .addComponent(update_button)
                            .addComponent(delete_button)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Clear Button - Clear all the text fields ==================================================================================================================================================================================== 
    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
        id_text.setText("");
        name_text.setText("");
        address_text.setText("");
        mobile_text.setText("");
        email_text.setText("");
        username_text.setText("");
        password_text.setText("");
    }//GEN-LAST:event_reset_buttonActionPerformed

    
   //Insert Button - Insert data into database ====================================================================================================================================================================================     
    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        String customer_id = id_text.getText();
        String customer_name = name_text.getText();
        String customer_address = address_text.getText();
        String customer_mobile = mobile_text.getText();
        String customer_email = email_text.getText();
        String username = username_text.getText();
        String password = password_text.getText();

        if(!customer_id.isEmpty())
        if(!customer_name.isEmpty()){
            if(!customer_address.isEmpty()){
                if(!customer_mobile.isEmpty()){
                    if(!customer_email.isEmpty()){
                        if(!username.isEmpty()){
                            if(!password.isEmpty()){

                                try {
                                    int result;
                                    Class.forName(Driver);
                                    Connection con = DriverManager.getConnection(URL, dbusername, dbpassword);
                                    String sql = "INSERT INTO Customer(Customer_ID,Customer_Name,Customer_Address,Customer_Mobile,Customer_Email,Username,Password) values(?,?,?,?,?,?,?)";
                                    PreparedStatement ps = con.prepareStatement(sql);
                                            
                                    ps.setString(1,customer_id);
                                    ps.setString(2,customer_name);
                                    ps.setString(3,customer_address);
                                    ps.setString(4,customer_mobile);
                                    ps.setString(5,customer_email);
                                    ps.setString(6,username);
                                    ps.setString(7,password);

                                    result=ps.executeUpdate();
                                    DefaultTableModel model = (DefaultTableModel)Table_1.getModel();
                                    model.setRowCount(0);
                                    show_user();
                                    if (result==1){
                                        JOptionPane.showMessageDialog(null, "Insert Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Insert Unsuccessful", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                                catch (SQLException ex) {
                                    JOptionPane.showMessageDialog(null, ex);
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Enter Password", "Password", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Enter Username", "Username", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Enter Email", "Email", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Enter Mobile", "Mobile", JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Enter Address", "Address", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Enter Name", "Name", JOptionPane.ERROR_MESSAGE);
        }

        else
        {
            JOptionPane.showMessageDialog(null, "Enter ID", "ID", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_add_buttonActionPerformed

    
   //Gets row data into text fields if a user clicks on a certain row in the table====================================================================================================================================================================================     
    private void Table_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_1MouseClicked
        
        int i = Table_1.getSelectedRow();
        TableModel model = Table_1.getModel();
        id_text.setText(model.getValueAt(i, 0).toString());
        name_text.setText(model.getValueAt(i, 1).toString());
        address_text.setText(model.getValueAt(i, 2).toString());
        mobile_text.setText(model.getValueAt(i, 3).toString());
        email_text.setText(model.getValueAt(i, 4).toString());
        username_text.setText(model.getValueAt(i, 5).toString());
        password_text.setText(model.getValueAt(i, 6).toString());
        
    }//GEN-LAST:event_Table_1MouseClicked

    
   //Update Button - Update row data in the database ====================================================================================================================================================================================     
    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
    try {
            String customer_id = id_text.getText();
            String customer_name = name_text.getText();
            String customer_address = address_text.getText();
            String customer_mobile = mobile_text.getText();
            String customer_email = email_text.getText();
            String username = username_text.getText();
            String password = password_text.getText();
        
        
            int result;
            try {
                Class.forName(Driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }

            Connection con = DriverManager.getConnection(URL, dbusername, dbpassword);
            int row = Table_1.getSelectedRow();
            String value = Table_1.getModel().getValueAt(row,0).toString();
            String query = "UPDATE Customer SET Customer_ID = ?, Customer_Name = ?, Customer_Address = ?, Customer_Mobile = ?, Customer_Email = ?, Username = ?, Password = ? WHERE Customer_ID =" +value;
            PreparedStatement ps = con.prepareStatement(query);
                                            

            ps.setString(1,customer_id);
            ps.setString(2,customer_name);
            ps.setString(3,customer_address);
            ps.setString(4,customer_mobile);
            ps.setString(5,customer_email);
            ps.setString(6,username);
            ps.setString(7,password);

            result = ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)Table_1.getModel();
            model.setRowCount(0);
            show_user();
            
            if (result==1){
                JOptionPane.showMessageDialog(null, "Update Successful", "Update Success", JOptionPane.INFORMATION_MESSAGE);
                          }
            else{
                JOptionPane.showMessageDialog(null, "Update Unsuccessful", "Update Unsuccessful", JOptionPane.ERROR_MESSAGE);
            }
        }
    catch (SQLException ex)
        {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
            
    }//GEN-LAST:event_update_buttonActionPerformed

    
   //Delete Button - Delete row data in the database ====================================================================================================================================================================================     
    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
    try {
            int result;

            try {
                Class.forName(Driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con = DriverManager.getConnection(URL, dbusername, dbpassword);
            int row = Table_1.getSelectedRow();
            String value = Table_1.getModel().getValueAt(row,0).toString();
            String query = "DELETE FROM Customer WHERE Customer_ID =" +value;
            PreparedStatement ps = con.prepareStatement(query);
                                           

            result = ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)Table_1.getModel();
            model.setRowCount(0);
            show_user();
            
            if (result==1){
                JOptionPane.showMessageDialog(null, "Delete Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                          }
            else{
                JOptionPane.showMessageDialog(null, "Delete Unsuccessful", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    catch (SQLException ex)
        {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_delete_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_1;
    private javax.swing.JButton add_button;
    private javax.swing.JTextField address_text;
    private javax.swing.JButton delete_button;
    private javax.swing.JTextField email_text;
    private javax.swing.JTextField id_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mobile_text;
    private javax.swing.JTextField name_text;
    private javax.swing.JTextField password_text;
    private javax.swing.JButton reset_button;
    private javax.swing.JButton update_button;
    private javax.swing.JTextField username_text;
    // End of variables declaration//GEN-END:variables
}
