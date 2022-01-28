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



public class Debit extends javax.swing.JFrame {


    public Debit() {
        initComponents();
        show_user();
    }
    
    final String Driver = "com.mysql.cj.jdbc.Driver";
    final String URL = "jdbc:mysql://localhost:3306/data_technologies";
    final String dbusername="root";
    final String dbpassword="54257751";
    
    public ArrayList<User_3> userList()
    {
        ArrayList<User_3> usersList = new ArrayList<>();
        try {

            try {
                Class.forName(Driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
            }
    
            Connection con = DriverManager.getConnection(URL, dbusername, dbpassword);            
            String query = "SELECT * FROM Debit";
            Statement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            User_3 user;
            while(rs.next()){
                user = new User_3(rs.getInt("Debit_ID"), rs.getString("Debit_Amount"), rs.getString("Debit_Total"), rs.getString("Debit_Type"), rs.getString("Debit_Info"));
                usersList.add(user);
            }
            }
        catch (SQLException ex)
            {
            Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
            }
            return usersList;
    }    
    
    public void show_user(){
        ArrayList<User_3> list = userList();
        DefaultTableModel model = (DefaultTableModel)Table_2.getModel();
        Object[] row = new Object[5];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getamount();
            row[2]=list.get(i).gettotal();
            row[3]=list.get(i).gettype();
            row[4]=list.get(i).getdate();
            model.addRow(row);
        }
    }
    

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id_text = new javax.swing.JTextField();
        reset_button_1 = new javax.swing.JButton();
        amount_text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        add_button_1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_2 = new javax.swing.JTable();
        type_combo = new javax.swing.JComboBox<>();
        update_button_1 = new javax.swing.JButton();
        delete_button1 = new javax.swing.JButton();
        total_text = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        info_text = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        id_text.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        reset_button_1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        reset_button_1.setText("Clear");
        reset_button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_button_1ActionPerformed(evt);
            }
        });

        amount_text.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Debit Amount");

        add_button_1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add_button_1.setText("Insert");
        add_button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_button_1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Debit Type");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel7.setText("Debit");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Debit Info");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Debit ID");

        Table_2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Table_2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Amount", "Total", "Type", "Date"
            }
        ));
        Table_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_2);
        if (Table_2.getColumnModel().getColumnCount() > 0) {
            Table_2.getColumnModel().getColumn(4).setResizable(false);
        }

        type_combo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        type_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Cheque" }));
        type_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_comboActionPerformed(evt);
            }
        });

        update_button_1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        update_button_1.setText("Update");
        update_button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_button_1ActionPerformed(evt);
            }
        });

        delete_button1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        delete_button1.setText("Delete");
        delete_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_button1ActionPerformed(evt);
            }
        });

        total_text.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Debit Total");

        info_text.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add_button_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(update_button_1)
                                .addGap(65, 65, 65)
                                .addComponent(delete_button1)
                                .addGap(55, 55, 55)
                                .addComponent(reset_button_1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(total_text)
                                    .addComponent(type_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(id_text, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                    .addComponent(amount_text)
                                    .addComponent(info_text))))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(id_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(amount_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(total_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(type_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(info_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_button_1)
                            .addComponent(reset_button_1)
                            .addComponent(update_button_1)
                            .addComponent(delete_button1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Clear Button - Clear all the text fields ==================================================================================================================================================================================== 
    private void reset_button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_button_1ActionPerformed
        id_text.setText("");
        amount_text.setText("");
        total_text.setText("");
        info_text.setText("");
      

    }//GEN-LAST:event_reset_button_1ActionPerformed

    
   //Insert Button - Insert data into database ====================================================================================================================================================================================     
    private void add_button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_button_1ActionPerformed
        String debit_id = id_text.getText();
        String amount = amount_text.getText();
        String total = amount_text.getText();
        String type;
        type=type_combo.getSelectedItem().toString();
        String info = info_text.getText();
        
        

        if(!debit_id.isEmpty()){
            if(!amount.isEmpty()){
                if(!total.isEmpty()){
                    if(!info.isEmpty()){



                                try {
                                    int result;

                                    Class.forName(Driver);
                                    Connection con = DriverManager.getConnection(URL, dbusername, dbpassword);
                                    String sql = "INSERT INTO debit(Debit_ID,Debit_Amount,Debit_Total,Debit_Type,Debit_Info) values(?,?,?,?,?)";
                                    PreparedStatement ps = con.prepareStatement(sql);
                                           
                                    ps.setString(1,debit_id);
                                    ps.setString(2,amount);
                                    ps.setString(3,total);
                                    ps.setString(4,type);
                                    ps.setString(5, info);

                                    


                                    result=ps.executeUpdate();
                                    DefaultTableModel model = (DefaultTableModel)Table_2.getModel();
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
                                    Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                            else
                                {
                                
                                    JOptionPane.showMessageDialog(null, "Enter Debit_Info", "Debit Info", JOptionPane.ERROR_MESSAGE);
                                }
                        }
                        else
                            {
                                JOptionPane.showMessageDialog(null, "Enter Debit Total", "Debit Total", JOptionPane.ERROR_MESSAGE);
                            }
                    }
                    else
                        {
                            JOptionPane.showMessageDialog(null, "Enter Debit Amount", "Debit Amount", JOptionPane.ERROR_MESSAGE);
                        }        
           
                }
                else
                    {
                       JOptionPane.showMessageDialog(null, "Enter Debit ID", "Debit ID", JOptionPane.ERROR_MESSAGE);
                    }

        

    }//GEN-LAST:event_add_button_1ActionPerformed

    
   //Gets row data into text fields if a user clicks on a certain row in the table====================================================================================================================================================================================     
    private void Table_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_2MouseClicked
        
        int i = Table_2.getSelectedRow();
        TableModel model = Table_2.getModel();
        id_text.setText(model.getValueAt(i, 0).toString());
        amount_text.setText(model.getValueAt(i, 1).toString());
        total_text.setText(model.getValueAt(i, 2).toString());
        String type = model.getValueAt(i, 3).toString();
            switch(type){
                case "Cash":
                    type_combo.setSelectedIndex(0);
                    break;
                    
                case "Cheque":
                    type_combo.setSelectedIndex(1);
                    break;
                   
                
            }
        info_text.setText(model.getValueAt(i, 4).toString());
 
    }//GEN-LAST:event_Table_2MouseClicked

    
   //Update Button - Update row data in the database ====================================================================================================================================================================================     
    
   //Delete Button - Delete row data in the database ====================================================================================================================================================================================     
    private void type_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type_comboActionPerformed

    private void update_button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_button_1ActionPerformed
        String debit_id = id_text.getText();
        String amount = amount_text.getText();
        String total = amount_text.getText();
        String info = info_text.getText();
        String type;
        type=type_combo.getSelectedItem().toString();
        
        

        if(!debit_id.isEmpty()){
            if(!amount.isEmpty()){
                if(!total.isEmpty()){
                    if(!info.isEmpty()){


                                try {
                                    int result;
                                    Class.forName("com.mysql.cj.jdbc.Driver");
                                    Connection con = DriverManager.getConnection(URL, dbusername, dbpassword);
                                    
                                    int row = Table_2.getSelectedRow();
                                    String value = Table_2.getModel().getValueAt(row,0).toString();
                                    
                                    String sql = "UPDATE Debit SET Debit_ID = ?, Debit_Amount = ?, Debit_Total = ?, Debit_Type = ?, Debit_Info = ? WHERE Debit_ID =" +value;
                                    PreparedStatement ps = con.prepareStatement(sql);
                                            
                                 
                                    ps.setString(1,debit_id);
                                    ps.setString(2,amount);
                                    ps.setString(3,total);
                                    ps.setString(4,type);
                                    ps.setString(5,info);
                                    


                                    result=ps.executeUpdate();
                                    DefaultTableModel model = (DefaultTableModel)Table_2.getModel();
                                    model.setRowCount(0);
                                    show_user();
                                    if (result==1){
                                        JOptionPane.showMessageDialog(null, "Update Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Update Unsuccessful", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                                catch (SQLException ex) {
                                    JOptionPane.showMessageDialog(null, ex);
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(Debit.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                            else
                            {
                                
                                JOptionPane.showMessageDialog(null, "Enter Debit Info", "Debit Info", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Enter Debit Total", "Debit Total", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else
                        {
                            JOptionPane.showMessageDialog(null, "Enter Debit Amount", "Debit Amount", JOptionPane.ERROR_MESSAGE);
                        }
                }
                else
                    {
                        JOptionPane.showMessageDialog(null, "Enter Debit ID", "Debit ID", JOptionPane.ERROR_MESSAGE);
                    }
        

      
    }//GEN-LAST:event_update_button_1ActionPerformed

    private void delete_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_button1ActionPerformed
    
        try {
           
        
        
            int result;

            try {
                Class.forName(Driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
          
            Connection con = DriverManager.getConnection(URL, dbusername, dbpassword);
            
            int row = Table_2.getSelectedRow();
            String value = Table_2.getModel().getValueAt(row,0).toString();
            String query = "DELETE FROM Debit WHERE Debit_ID =" +value;
            PreparedStatement ps = con.prepareStatement(query);
                                           

            result = ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)Table_2.getModel();
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
        
    }//GEN-LAST:event_delete_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(Debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Debit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Debit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_2;
    private javax.swing.JButton add_button_1;
    private javax.swing.JTextField amount_text;
    private javax.swing.JButton delete_button1;
    private javax.swing.JTextField id_text;
    private javax.swing.JTextField info_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reset_button_1;
    private javax.swing.JTextField total_text;
    private javax.swing.JComboBox<String> type_combo;
    private javax.swing.JButton update_button_1;
    // End of variables declaration//GEN-END:variables
}
