
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vladi
 */
public class inform extends javax.swing.JFrame {

    /**
     * Creates new form inform
     */
    public inform() {
        initComponents();
        show_userT();
        show_userT2();
        show_userT3();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation (size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }
  public ArrayList<Info> userTList(){
        ArrayList<Info> usersList=new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=TestLogin;user=Vova;password=vova12";
            Connection con = DriverManager.getConnection(url);
            String query1="Select client.Fio,package_info.* From package_info INNER JOIN client on package_id=client_id Where package_info.Package_status='Отправлено'";
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Info info;
            while(rs.next()){
                info=new Info(rs.getString("Fio"),rs.getInt("package_n"),rs.getInt("Weight"),rs.getString("Package_type"),rs.getString("Package_status"),rs.getString("Country_out"),rs.getString("Country_in"),rs.getString("Fio_out"),rs.getString("Fio_in"),rs.getString("Post_num"),rs.getString("Post_index"),rs.getString("adres_in"),rs.getString("Date_out"));
                usersList.add(info);
            }
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }// TODO add your handling code here:
        return usersList;
    } 
    public void show_userT(){
        ArrayList<Info> list = userTList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object [13];
        for (int i = 0; i<list.size();i++){
            
            row[0]=list.get(i).getFio();
            row[1]=list.get(i).getpackage_n();
            row[2]=list.get(i).getWeight();
            row[3]=list.get(i).getPackage_type();
            row[4]=list.get(i).getPackage_status();
            row[5]=list.get(i).getCountry_out();
            row[6]=list.get(i).getCountry_in();
            row[7]=list.get(i).getFio_out();
            row[8]=list.get(i).getFio_in();
            row[9]=list.get(i).getPost_num();
            row[10]=list.get(i).getPost_index();
            row[11]=list.get(i).getadres_in();
            row[12]=list.get(i).getDate_out();
           
            model.addRow(row);
         }
        }
    
      public ArrayList<Info2> userT2List(){
        ArrayList<Info2> usersList=new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=TestLogin;user=Vova;password=vova12";
            Connection con = DriverManager.getConnection(url);
            String query1="Select client.Fio,package_info.* From package_info INNER JOIN client on package_id=client_id Where package_info.Package_status='Вручено получателю'";
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Info2 info2;
            while(rs.next()){
                info2=new Info2(rs.getString("Fio"),rs.getInt("package_n"),rs.getInt("Weight"),rs.getString("Package_type"),rs.getString("Package_status"),rs.getString("Country_out"),rs.getString("Country_in"),rs.getString("Fio_out"),rs.getString("Fio_in"),rs.getString("Post_num"),rs.getString("Post_index"),rs.getString("adres_in"));
                usersList.add(info2);
            }
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }// TODO add your handling code here:
        return usersList;
    } 
    public void show_userT2(){
        ArrayList<Info2> list = userT2List();
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        Object[] row = new Object [12];
        for (int i = 0; i<list.size();i++){
            
            row[0]=list.get(i).getFio();
            row[1]=list.get(i).getpackage_n();
            row[2]=list.get(i).getWeight();
            row[3]=list.get(i).getPackage_type();
            row[4]=list.get(i).getPackage_status();
            row[5]=list.get(i).getCountry_out();
            row[6]=list.get(i).getCountry_in();
            row[7]=list.get(i).getFio_out();
            row[8]=list.get(i).getFio_in();
            row[9]=list.get(i).getPost_num();
            row[10]=list.get(i).getPost_index();
            row[11]=list.get(i).getadres_in();
           
            model.addRow(row);
         }
        
        }
    
    
     public ArrayList<Info3> userT3List(){
        ArrayList<Info3> usersList=new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=TestLogin;user=Vova;password=vova12";
            Connection con = DriverManager.getConnection(url);
            String query1="Select package_info.* From package_info FULL Outer JOIN client on package_id=client_id Where package_info.Package_status='Ожидает в отделении' and client_id IS NULL";
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Info3 info3;
            while(rs.next()){
                info3=new Info3(rs.getInt("package_n"),rs.getInt("Weight"),rs.getString("Package_type"),rs.getString("Package_status"),rs.getString("Country_out"),rs.getString("Country_in"),rs.getString("Fio_out"),rs.getString("Fio_in"),rs.getString("Post_num"),rs.getString("Post_index"),rs.getString("adres_in"),rs.getString("date_in"));
                usersList.add(info3);
            }
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }// TODO add your handling code here:
        return usersList;
    } 
    public void show_userT3(){
        ArrayList<Info3> list = userT3List();
        DefaultTableModel model = (DefaultTableModel)jTable3.getModel();
        Object[] row = new Object [12];
        for (int i = 0; i<list.size();i++){
            
         
            row[0]=list.get(i).getpackage_n();
            row[1]=list.get(i).getWeight();
            row[2]=list.get(i).getPackage_type();
            row[3]=list.get(i).getPackage_status();
            row[4]=list.get(i).getCountry_out();
            row[5]=list.get(i).getCountry_in();
            row[6]=list.get(i).getFio_out();
            row[7]=list.get(i).getFio_in();
            row[8]=list.get(i).getPost_num();
            row[9]=list.get(i).getPost_index();
            row[10]=list.get(i).getadres_in();
            row[11]=list.get(i).getdate_in();
            model.addRow(row);
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(189, 195, 199));
        kGradientPanel1.setkStartColor(new java.awt.Color(44, 62, 80));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ФИО клиента", "Номер посылки", "Вес", "Тип посылки", "Статус посылки", "С.отправитель", "С.получатель", "ФИО отправителя", "ФИО получателя", "Номер отделения", "Индекс отделения", "Адрес получателя"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Фио клиента", "Номер посылки", "Вес", "Тип посылки", "Статус посылки", "С.отправителя", "С.получателя", "ФИО отправителя", "ФИО получателя", "Номер отделения", "Индекс отделения", "Адрес получателя", "Дата отправки"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Вручено получателю");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ожидает в отделении");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Номер посылки", "Вес", "Тип посылки", "Статус", "С.отправителя", "С.получателя", "ФИО отправителя", "ФИО получателя", "Номер отделения", "Индекс отделения", "Адрес получателя", "Дата принятия"
            }
        ));
        jScrollPane1.setViewportView(jTable3);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Отправлено");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1460, Short.MAX_VALUE))
                        .addGap(21, 21, 21))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1239, Short.MAX_VALUE)))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(526, Short.MAX_VALUE)))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vladi\\Desktop\\images\\icons8-left-arrow-24.png")); // NOI18N
        jMenu1.setText("back");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
                Menu field=new Menu();
                field.setVisible(true);
                setVisible(false);/// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(inform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
