public class Helicopter extends javax.swing.JFrame implements Vehicle{
    public int fuelleveldetails;
    public int soldiercountdetails;
    public int ammocountdetails;
    public Helicopter() {
        initComponents();
        setVisible(true);
        
    }
    @Override
    public String getoxygen(){
        return null;
    }
    @Override
    public void oxygenlevel(int level){}
    @Override
    public void sendmsg(){
        MainController.getInstant().recivemsg("Helicopter : - "+txtmsg.getText()+"\n");  
    }
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
                btnlaser.setEnabled(true);
            }else{
                btnlaser.setEnabled(false);
            }
        }
    }   
    @Override
    public void soldiercount(int count){
         soldiercountdetails=count;
    }
    @Override
    public void ammocount(int count){
        ammocountdetails=count;
    }
    @Override
    public void areacheck(){
        if("Area Cleared".equals(areastatus.getText())){
            areastatus.setText("Area Not Cleared");
        }else{
           areastatus.setText("Area Cleared"); 
        }
    }
    @Override
    public void receivedmsg(String msg){
        msgarea.setText(msgarea.getText()+ msg+"\n");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        areastatus = new javax.swing.JLabel();
        btnshoot = new javax.swing.JButton();
        btnmissile = new javax.swing.JButton();
        btnlaser = new javax.swing.JButton();
        msgarea = new java.awt.TextArea();
        txtmsg = new javax.swing.JTextField();
        lblsoldier = new javax.swing.JLabel();
        lblammo = new javax.swing.JLabel();
        soldiercount = new javax.swing.JSpinner();
        ammocount = new javax.swing.JSpinner();
        positioncheck = new javax.swing.JCheckBox();
        lblfuel = new javax.swing.JLabel();
        sliderfuel = new javax.swing.JSlider();
        btnsend = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Helicopter | Defence System");
        setLocation(new java.awt.Point(650, 50));
        setResizable(false);

        areastatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        areastatus.setText("Area Not Cleared");

        btnshoot.setBackground(new java.awt.Color(0, 153, 51));
        btnshoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnshoot.setForeground(new java.awt.Color(255, 255, 255));
        btnshoot.setText("Shoot");
        btnshoot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnshoot.setEnabled(false);

        btnmissile.setBackground(new java.awt.Color(0, 153, 51));
        btnmissile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnmissile.setForeground(new java.awt.Color(255, 255, 255));
        btnmissile.setText("Missile Operation");
        btnmissile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmissile.setEnabled(false);

        btnlaser.setBackground(new java.awt.Color(0, 153, 51));
        btnlaser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnlaser.setForeground(new java.awt.Color(255, 255, 255));
        btnlaser.setText("Laser Operation");
        btnlaser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlaser.setEnabled(false);

        msgarea.setBackground(new java.awt.Color(204, 204, 204));
        msgarea.setEditable(false);

        lblsoldier.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblsoldier.setText("Soldier Count");

        lblammo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblammo.setText("Ammo Count");

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

        positioncheck.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        positioncheck.setText("Position");
        positioncheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        positioncheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positioncheckActionPerformed(evt);
            }
        });

        lblfuel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblfuel.setText("Fuel");

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

        btnsend.setBackground(new java.awt.Color(0, 102, 255));
        btnsend.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsend.setText("Send");
        btnsend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                    .addComponent(msgarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtmsg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsend))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areastatus)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnlaser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnshoot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnmissile, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(positioncheck, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblammo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                                .addComponent(ammocount, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblsoldier)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(soldiercount, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sliderfuel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblfuel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soldiercount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfuel)
                    .addComponent(areastatus)
                    .addComponent(lblsoldier))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnshoot)
                                    .addComponent(btnmissile))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnlaser)
                                    .addComponent(positioncheck)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblammo)
                                .addComponent(ammocount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(msgarea, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsend)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(sliderfuel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    @Override
    public void fuellevel(int level){
        fuelleveldetails=level;
    }
    @Override
    public String getfuel(){
        return fuelleveldetails+"" ;
    }
    @Override
    public String getsoldier(){
        return soldiercountdetails+"" ;
    }
    @Override
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
            btnlaser.setEnabled(false);
        }else{
            activatebtn(MainController.getInstant().);
        }
    }//GEN-LAST:event_positioncheckActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ammocount;
    private javax.swing.JLabel areastatus;
    private javax.swing.JButton btnlaser;
    private javax.swing.JButton btnmissile;
    private javax.swing.JButton btnsend;
    private javax.swing.JButton btnshoot;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
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
