import javax.swing.*;
public class Tank extends javax.swing.JFrame implements Vehicle{
    public int fuelleveldetails;
    public int soldiercountdetails;
    public int ammocountdetails;
    public Tank() {
        initComponents();
        setVisible(true);
    }
    @Override
    public void oxygenlevel(int level){}
    @Override
    public void sendmsg(){
        MainController.getInstant().recivemsg("Tank : - "+txtmsg.getText()+"\n");       
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        areastatus = new javax.swing.JLabel();
        btnshoot = new javax.swing.JButton();
        btnmissile = new javax.swing.JButton();
        btnredar = new javax.swing.JButton();
        btnrotate = new javax.swing.JButton();
        msgarea = new java.awt.TextArea();
        sliderfuel = new javax.swing.JSlider();
        lblfuel = new javax.swing.JLabel();
        lblsoldier = new javax.swing.JLabel();
        lblammo = new javax.swing.JLabel();
        positioncheck = new javax.swing.JCheckBox();
        soldiercount = new javax.swing.JSpinner();
        ammocount = new javax.swing.JSpinner();
        txtmsg = new javax.swing.JTextField();
        btnsend = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tank | Defence System");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocation(new java.awt.Point(10, 450));
        setResizable(false);

        areastatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        areastatus.setText("Area Not Cleared");

        btnshoot.setBackground(new java.awt.Color(0, 153, 51));
        btnshoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnshoot.setForeground(new java.awt.Color(255, 255, 255));
        btnshoot.setText("Shoot");
        btnshoot.setEnabled(false);

        btnmissile.setBackground(new java.awt.Color(0, 153, 51));
        btnmissile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnmissile.setForeground(new java.awt.Color(255, 255, 255));
        btnmissile.setText("Missile Operation");
        btnmissile.setEnabled(false);

        btnredar.setBackground(new java.awt.Color(0, 153, 51));
        btnredar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnredar.setForeground(new java.awt.Color(255, 255, 255));
        btnredar.setText("Redar Operation");
        btnredar.setEnabled(false);

        btnrotate.setBackground(new java.awt.Color(0, 153, 51));
        btnrotate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnrotate.setForeground(new java.awt.Color(255, 255, 255));
        btnrotate.setText("Rotate Shooting");
        btnrotate.setEnabled(false);

        msgarea.setBackground(new java.awt.Color(204, 204, 204));
        msgarea.setEditable(false);

        sliderfuel.setMajorTickSpacing(20);
        sliderfuel.setMinorTickSpacing(10);
        sliderfuel.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderfuel.setPaintLabels(true);
        sliderfuel.setPaintTicks(true);
        sliderfuel.setValue(0);
        sliderfuel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sliderfuel.addChangeListener(new javax.swing.event.ChangeListener(){
            public void stateChanged(javax.swing.event.ChangeEvent evt){
                fuellevel(sliderfuel.getValue());
            }
        });

        lblfuel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblfuel.setText("Fuel");

        lblsoldier.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblsoldier.setText("Soldier Count");

        lblammo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblammo.setText("Ammo Count");

        positioncheck.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        positioncheck.setText("Position");
        positioncheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positioncheckActionPerformed(evt);
            }
        });

        soldiercount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                soldiercount((int)soldiercount.getValue()) ;
            }
        });

        ammocount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ammocount((int)ammocount.getValue()) ;
            }
        });

        txtmsg.setBackground(new java.awt.Color(204, 204, 204));
        txtmsg.setForeground(new java.awt.Color(0, 0, 0));

        btnsend.setBackground(new java.awt.Color(0, 102, 255));
        btnsend.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsend.setForeground(new java.awt.Color(255, 255, 255));
        btnsend.setText("Send");
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnredar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(btnshoot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnrotate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmissile, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(positioncheck, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblammo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblsoldier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(soldiercount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ammocount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsend, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msgarea, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(areastatus, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sliderfuel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblfuel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(areastatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblsoldier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblfuel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(soldiercount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnshoot)
                            .addComponent(btnmissile)
                            .addComponent(lblammo)
                            .addComponent(ammocount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnredar)
                            .addComponent(btnrotate)
                            .addComponent(positioncheck))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(msgarea, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsend)))
                    .addComponent(sliderfuel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    @Override
    public String getoxygen(){
        return null;
    }
    @Override
    public void soldiercount(int count){
        soldiercountdetails= count;
    }
    public void ammocount(int count){
        ammocountdetails= count;
    }
    @Override
    public void fuellevel(int level){
        fuelleveldetails= level;
    }
    public String getfuel(){
        return fuelleveldetails+"" ;
    }
    public String getsoldier(){
        return soldiercountdetails+"" ;
    }
    public String getammo(){
        return ammocountdetails+"" ;
    }
    private void btnsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendActionPerformed
        sendmsg();
    }//GEN-LAST:event_btnsendActionPerformed

    private void positioncheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positioncheckActionPerformed
        if(!positioncheck.isSelected()){
            btnshoot.setEnabled(false);
            btnmissile.setEnabled(false);
            btnredar.setEnabled(false);
            btnrotate.setEnabled(false);
        }
    }//GEN-LAST:event_positioncheckActionPerformed
    @Override
    public void activatebtn(int value) {
        if(positioncheck.isSelected()){
            if(value>=25){
               btnshoot.setEnabled(true);
            }else{
                btnshoot.setEnabled(false);
            }
            if(value>=50){
               btnmissile.setEnabled(true);
            }else{
                btnmissile.setEnabled(false);
            }
            if(value>=75){
                btnredar.setEnabled(true);
            }else{
                btnredar.setEnabled(false);
            }
            if(value==100){
                btnrotate.setEnabled(true);
            }else{
                btnrotate.setEnabled(false);
            }
        }
    }
    @Override
    public void areacheck(){
        if(areastatus.getText() =="Area Cleared"){
            areastatus.setText("Area Not Cleared");
        }else{
           areastatus.setText("Area Cleared"); 
        }
        
    }
    @Override
    public void receivedmsg(String msg){
        msgarea.setText(msgarea.getText()+ msg+"\n");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ammocount;
    private javax.swing.JLabel areastatus;
    private javax.swing.JButton btnmissile;
    private javax.swing.JButton btnredar;
    private javax.swing.JButton btnrotate;
    private javax.swing.JButton btnsend;
    private javax.swing.JButton btnshoot;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblammo;
    private javax.swing.JLabel lblfuel;
    private javax.swing.JLabel lblsoldier;
    private java.awt.TextArea msgarea;
    private javax.swing.JCheckBox positioncheck;
    private javax.swing.JSlider sliderfuel;
    private javax.swing.JSpinner soldiercount;
    private javax.swing.JTextField txtmsg;
    // End of variables declaration//GEN-END:variables

}
