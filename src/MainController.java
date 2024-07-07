
import java.util.ArrayList;

interface Vehicle {

    public void areacheck();
    public void receivedmsg(String msg);
    public void activatebtn(int value);
    public void sendmsg();
    public void fuellevel(int level);
    public void soldiercount(int count);
    public void ammocount(int count);
    public void oxygenlevel(int level);
    public String getfuel();
    public String getsoldier();
    public String getammo();
    public String getoxygen();
}

public class MainController extends javax.swing.JFrame {

    private final ArrayList<Vehicle> vehiclelist = new ArrayList<>();
    private static MainController main;
    
    private MainController() {
        initComponents();
        setVisible(true);
    }
    public static MainController getInstant(){
        if(main==null){
            main=new MainController();
        }
        return main;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        selectdefecnce = new javax.swing.JComboBox<>();
        btngetdetails = new javax.swing.JButton();
        areacheck = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        positionslider = new javax.swing.JSlider();
        receivemsg = new java.awt.TextArea();
        sendmsg = new java.awt.TextArea();
        lblreceived = new javax.swing.JLabel();
        lblsend = new javax.swing.JLabel();
        btnsend = new javax.swing.JButton();
        txtmsg = new javax.swing.JTextField();
        ammoCount = new javax.swing.JLabel();
        soldierCount = new javax.swing.JLabel();
        fuellevelcount = new javax.swing.JLabel();
        lbloxigenlevel = new javax.swing.JLabel();
        oxigenlevel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Controller | Defence System");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        setLocation(new java.awt.Point(10, 10));
        setResizable(false);

        selectdefecnce.setBackground(new java.awt.Color(153, 255, 153));
        selectdefecnce.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectdefecnce.setForeground(new java.awt.Color(0, 0, 0));
        selectdefecnce.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tank", "Helicopter", "Submarine" }));
        selectdefecnce.setToolTipText("");

        btngetdetails.setBackground(new java.awt.Color(0, 153, 51));
        btngetdetails.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btngetdetails.setForeground(new java.awt.Color(255, 255, 255));
        btngetdetails.setText("Get Details");
        btngetdetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btngetdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngetdetailsActionPerformed(evt);
            }
        });

        areacheck.setText("Area Cleared");
        areacheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areacheckActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Ammo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Soldier Count");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Fuel Level");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Position");

        positionslider.setMajorTickSpacing(20);
        positionslider.setMinorTickSpacing(10);
        positionslider.setPaintLabels(true);
        positionslider.setPaintTicks(true);
        positionslider.setValue(0);
        positionslider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        positionslider.addChangeListener(new javax.swing.event.ChangeListener(){
            public void stateChanged(javax.swing.event.ChangeEvent evt){
                position(positionslider.getValue());
            }
        });

        receivemsg.setBackground(new java.awt.Color(204, 204, 204));
        receivemsg.setEditable(false);
        receivemsg.setSelectionStart(0);

        sendmsg.setBackground(new java.awt.Color(204, 204, 204));
        sendmsg.setEditable(false);

        lblreceived.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblreceived.setText("Received");

        lblsend.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblsend.setText("Sended");

        btnsend.setBackground(new java.awt.Color(0, 102, 255));
        btnsend.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsend.setForeground(new java.awt.Color(255, 255, 255));
        btnsend.setText("Send");
        btnsend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });

        txtmsg.setBackground(new java.awt.Color(204, 204, 204));
        txtmsg.setForeground(new java.awt.Color(0, 0, 0));

        ammoCount.setText("-");

        soldierCount.setText("-");

        fuellevelcount.setText("-");

        lbloxigenlevel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbloxigenlevel.setText("Oxigen Level");

        oxigenlevel.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19)
                            .addComponent(btnsend))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(receivemsg, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblreceived, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(174, 174, 174)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sendmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblsend, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectdefecnce, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(positionslider, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btngetdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(areacheck))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fuellevelcount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(soldierCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ammoCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(68, 68, 68)
                                .addComponent(lbloxigenlevel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oxigenlevel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectdefecnce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btngetdetails)
                    .addComponent(areacheck))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(soldierCount)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ammoCount)
                            .addComponent(lbloxigenlevel)
                            .addComponent(oxigenlevel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fuellevelcount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(positionslider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblreceived)
                    .addComponent(lblsend))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(receivemsg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsend))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void position(int value){
        for(Vehicle obj: vehiclelist){
            obj.activatebtn(value);
        }
    }
    
    
    public void addcomponent(Vehicle v1) {
        vehiclelist.add(v1);
    }
    public void recivemsg(String msg){
        receivemsg.setText(receivemsg.getText()+msg);
    }
    
    private void areacheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areacheckActionPerformed
        for (Vehicle obj : vehiclelist) {
            obj.areacheck();
        }
    }//GEN-LAST:event_areacheckActionPerformed
    private void btnsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendActionPerformed
        for (Vehicle obj : vehiclelist) {
            obj.receivedmsg("Controller Room :- " + txtmsg.getText());
        }
        sendmsg.setText(sendmsg.getText() + "\n" + txtmsg.getText());
    }//GEN-LAST:event_btnsendActionPerformed

    private void btngetdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngetdetailsActionPerformed
        if("Tank".equals((String)selectdefecnce.getSelectedItem())){
            fuellevelcount.setText(vehiclelist.get(selectdefecnce.getSelectedIndex()).getfuel());
            soldierCount.setText(vehiclelist.get(selectdefecnce.getSelectedIndex()).getsoldier());
            ammoCount.setText(vehiclelist.get(selectdefecnce.getSelectedIndex()).getammo());
            oxigenlevel.setText("-");
        }else if("Helicopter".equals((String)selectdefecnce.getSelectedItem())){
            fuellevelcount.setText(vehiclelist.get(selectdefecnce.getSelectedIndex()).getfuel());
            soldierCount.setText(vehiclelist.get(selectdefecnce.getSelectedIndex()).getsoldier());
            ammoCount.setText(vehiclelist.get(selectdefecnce.getSelectedIndex()).getammo());
            oxigenlevel.setText("-");
        }else if("Submarine".equals((String)selectdefecnce.getSelectedItem())){
            fuellevelcount.setText(vehiclelist.get(selectdefecnce.getSelectedIndex()).getfuel());
            soldierCount.setText(vehiclelist.get(selectdefecnce.getSelectedIndex()).getsoldier());
            ammoCount.setText(vehiclelist.get(selectdefecnce.getSelectedIndex()).getammo());
            oxigenlevel.setText(vehiclelist.get(selectdefecnce.getSelectedIndex()).getoxygen());
        }
    }//GEN-LAST:event_btngetdetailsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ammoCount;
    private javax.swing.JCheckBox areacheck;
    private javax.swing.JButton btngetdetails;
    private javax.swing.JButton btnsend;
    private javax.swing.JLabel fuellevelcount;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbloxigenlevel;
    private javax.swing.JLabel lblreceived;
    private javax.swing.JLabel lblsend;
    private javax.swing.JLabel oxigenlevel;
    private javax.swing.JSlider positionslider;
    private java.awt.TextArea receivemsg;
    private javax.swing.JComboBox<String> selectdefecnce;
    private java.awt.TextArea sendmsg;
    private javax.swing.JLabel soldierCount;
    private javax.swing.JTextField txtmsg;
    // End of variables declaration//GEN-END:variables
}
