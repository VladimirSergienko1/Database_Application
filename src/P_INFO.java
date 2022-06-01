
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vladi
 */
public class P_INFO extends javax.swing.JFrame {

    /**
     * Creates new form P_INFO
     */
    public P_INFO() {
        initComponents();
        show_userT();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation (size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }
    public ArrayList<PInfo> userTList(){
        ArrayList<PInfo> usersList=new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=TestLogin;user=Vova;password=vova12";
            Connection con = DriverManager.getConnection(url);
            String query1="Select *FROM package_info ";
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            PInfo pinfo;
            while(rs.next()){
                pinfo=new PInfo(rs.getInt("package_id"),rs.getInt("package_n"),rs.getInt("Weight"),rs.getString("Package_type"),rs.getString("Package_status"),rs.getString("Country_out"),rs.getString("Country_in"),rs.getString("Fio_out"),rs.getString("Fio_in"),rs.getString("Post_num"),rs.getString("Post_index"),rs.getString("adres_in"),rs.getString("Date_in"),rs.getString("Date_out"));
                usersList.add(pinfo);
            }
        }
         catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }// TODO add your handling code here:
        return usersList;
    } 
    public void show_userT(){
        ArrayList<PInfo> list = userTList();
        DefaultTableModel model = (DefaultTableModel)TableI.getModel();
        Object[] row = new Object [14];
        for (int i = 0; i<list.size();i++){
            
            row[0]=list.get(i).getpackage_id();
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
            row[12]=list.get(i).getDate_in();
            row[13]=list.get(i).getDate_out();
           
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        weig = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        c_out = new javax.swing.JTextField();
        c_in = new javax.swing.JTextField();
        m_out = new javax.swing.JTextField();
        m_in = new javax.swing.JTextField();
        n_serv = new javax.swing.JTextField();
        i_serv = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        adres = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableI = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(189, 195, 199));
        kGradientPanel1.setkStartColor(new java.awt.Color(44, 62, 80));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Номер посылки");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel2.setText("Вес");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 40, -1));

        jLabel3.setText("Тип посылки");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setText("Статсус посылки");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel5.setText("Страна отправитель");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel6.setText("Страна получатель");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel7.setText("Отправитель");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel8.setText("Получатель");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel9.setText("Номер отделения");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel10.setText("Индекс отделения");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numKeyTyped(evt);
            }
        });
        jPanel1.add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 158, -1));

        weig.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                weigKeyTyped(evt);
            }
        });
        jPanel1.add(weig, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 158, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Мелкий пакет", "Бандероль", "Закрытое письмо" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ожидает в отделении", "Вручено получателю", "Отправлено" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        c_out.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c_outKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_outKeyTyped(evt);
            }
        });
        jPanel1.add(c_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 170, -1));

        c_in.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c_inKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_inKeyTyped(evt);
            }
        });
        jPanel1.add(c_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 170, -1));

        m_out.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                m_outKeyPressed(evt);
            }
        });
        jPanel1.add(m_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 170, -1));

        m_in.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                m_inKeyPressed(evt);
            }
        });
        jPanel1.add(m_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 170, -1));
        jPanel1.add(n_serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 170, -1));
        jPanel1.add(i_serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 170, -1));

        jLabel11.setText("Адрес получателя");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));
        jPanel1.add(adres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 170, -1));

        jButton1.setText("Сохранить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        jButton2.setText("Обновить");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        jButton3.setText("Удалить");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        jButton4.setText("Сбросить");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));

        jLabel12.setText("Услуга");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 95, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Принятие");
        jRadioButton3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton3StateChanged(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Отправка");
        jRadioButton4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton4StateChanged(evt);
            }
        });
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 170, -1));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 170, -1));

        jLabel13.setText("Дата отправки");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\vladi\\Desktop\\images\\icons8-print-24.png")); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jLabel17.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jLabel18.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        jLabel19.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        jLabel20.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        TableI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Номер посылки", "Вес", "Тип", "Статус", "Страна отпр.", "Страна получ.", "Отправитель", "Получатель", "Номер отделения", "Индес отделенияll", "Адрес получателя", "Дата принятия", "Дата отправки"
            }
        ));
        TableI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableIMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableI);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addGap(76, 76, 76))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vladi\\Desktop\\images\\icons8-left-arrow-24.png")); // NOI18N
        jMenu1.setText("Back");
        jMenu1.setToolTipText("");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Menu field=new Menu();
                field.setVisible(true);
                setVisible(false);// TODO// TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseClicked

    private void TableIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableIMouseClicked
        int i = TableI.getSelectedRow();
        TableModel model =TableI.getModel();// TODO add your handling code here:
        num.setText(model.getValueAt(i,1).toString());
        weig.setText(model.getValueAt(i,2).toString());
        String TP = model.getValueAt(i,3).toString();
        switch (TP){
            case "Мелкий пакет":
                jComboBox1.setSelectedIndex(0);
                break;
                case "Бандероль":
                jComboBox1.setSelectedIndex(1);
                break;
                case "Закрытое письмо":
                jComboBox1.setSelectedIndex(2);
                break;
        }
        String TP1 =model.getValueAt(i,4).toString();
        switch (TP1){
            case "Ожидает в отделении":
                jComboBox2.setSelectedIndex(0);
                break;
                case "Вручено получателю":
                jComboBox2.setSelectedIndex(1);
                break;
                case "Отправлено":
                jComboBox2.setSelectedIndex(2);
                break;
        }
       
        c_out.setText(model.getValueAt(i,5).toString());
        c_in.setText(model.getValueAt(i,6).toString());
        m_out.setText(model.getValueAt(i,7).toString());
        m_in.setText(model.getValueAt(i,8).toString());
        n_serv.setText(model.getValueAt(i,9).toString());
        i_serv.setText(model.getValueAt(i,10).toString());
        adres.setText(model.getValueAt(i,11).toString());
        
         try{
               if (jRadioButton3.isSelected()==true){
            int srow = TableI.getSelectedRow();
            Date date = new SimpleDateFormat("dd-MM-yyy").parse((String)model.getValueAt(srow, 12));
             jDateChooser1.setDate(date);
            }
             else{
                jDateChooser1.setDate(null);
             }    
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e);         
            }
         try{
               if (jRadioButton4.isSelected()==true){
            int srow = TableI.getSelectedRow();
            Date date = new SimpleDateFormat("yyy-MM-dd").parse((String)model.getValueAt(srow, 13));
             jDateChooser2.setDate(date);
            }
             else{
                jDateChooser2.setDate(null);
             }
         }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);         
            }   
        
    }//GEN-LAST:event_TableIMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int opt=JOptionPane.showConfirmDialog(null,"Вы уверены?", "Удалить",JOptionPane.YES_NO_OPTION );
        if (opt==0){
            try{

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url="jdbc:sqlserver://localhost:1433;databaseName=TestLogin;user=Vova;password=vova12";
                Connection con = DriverManager.getConnection(url);
                int row=TableI.getSelectedRow();
                String value=(TableI.getModel().getValueAt(row, 0).toString());
                String query="Delete from package_info where package_id="+value;
                PreparedStatement pst=con.prepareStatement(query);
                pst.executeUpdate();
                DefaultTableModel model= (DefaultTableModel)TableI.getModel();
                model.setRowCount(0);
                show_userT();
                JOptionPane.showMessageDialog(null,"Данные успешно удалены");
            }// TODO add your handling code here:
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }// TODO add your handling code here:// TODO add your handling code here:
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=TestLogin;user=Vova;password=vova12";
            Connection con = DriverManager.getConnection(url);
            int row=TableI.getSelectedRow();
            String value=(TableI.getModel().getValueAt(row, 0).toString());
            String query = "Update package_info SET package_n=?,Weight=?,Package_type=?,Package_status=?,Country_out=?,Country_in=?,Fio_out=?,Fio_in=?,Post_num=?,Post_index=?,adres_in=?,Date_in=?,Date_out=? WHERE package_id="+value;
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, num.getText());
            pst.setString(2, weig.getText());
            String Tu;
            Tu=jComboBox1.getSelectedItem().toString();
            pst.setString(3, Tu);
            String Tu2;
            Tu2=jComboBox2.getSelectedItem().toString();
            pst.setString(4, Tu2);
            pst.setString(5, c_out.getText());
            pst.setString(6, c_in.getText());
            pst.setString(7, m_out.getText());
            pst.setString(8, m_in.getText());
            pst.setString(9, n_serv.getText());
            pst.setString(10, i_serv.getText());
            pst.setString(11, adres.getText());
            SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyy");
            if (jRadioButton3.isSelected()==true){
            String Date_in=sdf.format(jDateChooser1.getDate());
            pst.setString(12,Date_in);
            }
            else{
                 pst.setString(12,null);
            }
             if (jRadioButton4.isSelected()==true){
            String Date_out=sdf.format(jDateChooser2.getDate());
            pst.setString(13, Date_out);
            }
             else{
                 pst.setString(13,null);
             }
            pst.executeUpdate();
            DefaultTableModel model= (DefaultTableModel)TableI.getModel();
            model.setRowCount(0);
            show_userT();

            JOptionPane.showMessageDialog(null,"Данные успешно обновлены");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }// TODO add your handling code here:// TODO add your handling code here: // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=TestLogin;user=Vova;password=vova12";
            Connection con = DriverManager.getConnection(url);// TODO add your handling code here:
            String query="insert into package_info (package_n,Weight,Package_type,Package_status,Country_out,Country_in,Fio_out,Fio_in,Post_num,Post_index,adres_in,Date_in,Date_out) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, num.getText());
            pst.setString(2, weig.getText());
            String Tu;
            Tu=jComboBox1.getSelectedItem().toString();
            pst.setString(3, Tu);
            String Tu2;
            Tu2=jComboBox2.getSelectedItem().toString();
            pst.setString(4, Tu2);
            pst.setString(5, c_out.getText());
            pst.setString(6, c_in.getText());
            pst.setString(7, m_out.getText());
            pst.setString(8, m_in.getText());
            pst.setString(9, n_serv.getText());
            pst.setString(10, i_serv.getText());
            pst.setString(11, adres.getText());
            SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyy");
            if (jRadioButton3.isSelected()==true){
            String Date_in=sdf.format(jDateChooser1.getDate());
            pst.setString(12,Date_in);
            }
            else{
                 pst.setString(12,null);
            }
             if (jRadioButton4.isSelected()==true){
            String Date_out=sdf.format(jDateChooser2.getDate());
            pst.setString(13, Date_out);
            }
             else{
                 pst.setString(13,null);
             }
            
            pst.executeUpdate();
            DefaultTableModel model= (DefaultTableModel)TableI.getModel();
            model.setRowCount(0);
            show_userT();
            JOptionPane.showMessageDialog(null,"Данные успешно внесены");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jRadioButton3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton3StateChanged
         if (jRadioButton3.isSelected()==true){
            jDateChooser1.setVisible(true);
            jDateChooser2.setVisible(false);
            jLabel13.setText("Дата принятия");
            
        }  // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3StateChanged

    private void jRadioButton4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton4StateChanged
        if (jRadioButton4.isSelected()==true){
            jDateChooser2.setVisible(true);
            jDateChooser1.setVisible(false);// TODO add your handling code here:
            jLabel13.setText("Дата отправки");
            
        }
    }//GEN-LAST:event_jRadioButton4StateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        num.setText("");
        weig.setText("");
        buttonGroup1.clearSelection();
        c_out.setText("");
        c_in.setText("");
        m_out.setText("");
        m_in.setText("");
        m_out.setText("");
        n_serv.setText("");
        i_serv.setText("");
        adres.setText("");
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        
        
        try {
            boolean print = TableI.print();
            if (!print ){
                JOptionPane.showMessageDialog(null, "Невозможно распечатать");
            }// TODO add your handling code here:
        } catch (PrinterException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyTyped
         boolean max = num.getText().length() > 2;
            if ( max ){
        evt.consume();
    }        
            else{
                char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();// TODO add your handling code here:
            jLabel16.setVisible(true);
            jLabel16.setText("Введите число");
            }
        else{
            jLabel16.setText("");
        }// TODO add your handling code here:
            }
    }//GEN-LAST:event_numKeyTyped

    private void weigKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weigKeyTyped
         boolean max = weig.getText().length() > 2;
            if ( max ){
        evt.consume();
    }        
            else{
                char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();// TODO add your handling code here:
            jLabel15.setVisible(true);
            jLabel15.setText("Введите число");
            }
        else{
            jLabel15.setText("");
        }// TODO add your handling code here:
            }// TODO add your handling code here:
    }//GEN-LAST:event_weigKeyTyped

    private void c_outKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_outKeyPressed
           char c = evt.getKeyChar();
       if (Character.isLetter(c)|Character.isWhitespace(c)|Character.isISOControl(c)){
        c_out.setEditable(true);
        jLabel17.setText("");
       }
        else{
            c_out.setEditable(false);
            jLabel17.setVisible(true);
            jLabel17.setText("Введите букву");
                }// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_c_outKeyPressed

    private void c_outKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_outKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_c_outKeyTyped

    private void c_inKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_inKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_c_inKeyTyped

    private void c_inKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_inKeyPressed
         char c = evt.getKeyChar();
       if (Character.isLetter(c)|Character.isWhitespace(c)|Character.isISOControl(c)){
        c_in.setEditable(true);
        jLabel18.setText("");
       }
        else{
            c_in.setEditable(false);
            jLabel18.setVisible(true);
            jLabel18.setText("Введите букву");
                }// TODO add your handling code here:// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_c_inKeyPressed

    private void m_outKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m_outKeyPressed
         char c = evt.getKeyChar();
       if (Character.isLetter(c)|Character.isWhitespace(c)|Character.isISOControl(c)){
        m_out.setEditable(true);
        jLabel19.setText("");
       }
        else{
            m_out.setEditable(false);
            jLabel19.setVisible(true);
            jLabel19.setText("Введите букву");
                }// TODO add your handling code here:// TODO add your handling code here:// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_m_outKeyPressed

    private void m_inKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m_inKeyPressed
        char c = evt.getKeyChar();
       if (Character.isLetter(c)|Character.isWhitespace(c)|Character.isISOControl(c)){
        m_in.setEditable(true);
        jLabel20.setText("");
       }
        else{
            m_in.setEditable(false);
            jLabel20.setVisible(true);
            jLabel20.setText("Введите букву");
                } // TODO add your handling code here:
    }//GEN-LAST:event_m_inKeyPressed

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
            java.util.logging.Logger.getLogger(P_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P_INFO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableI;
    private javax.swing.JTextField adres;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField c_in;
    private javax.swing.JTextField c_out;
    private javax.swing.JTextField i_serv;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField m_in;
    private javax.swing.JTextField m_out;
    private javax.swing.JTextField n_serv;
    private javax.swing.JTextField num;
    private javax.swing.JTextField weig;
    // End of variables declaration//GEN-END:variables
}