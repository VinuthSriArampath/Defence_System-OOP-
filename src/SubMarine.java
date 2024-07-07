public class SubMarine extends javax.swing.JFrame implements Vehicle{
    public int fuelleveldetails;
    public int soldiercountdetails;
    public int ammocountdetails;
    public int oxygenleveldetails;
    public SubMarine() {
        initComponents();
        setVisible(true);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areastatus = new javax.swing.JLabel();
        btnshoot = new javax.swing.JButton();
        btnsonar = new javax.swing.JButton();
        btntamhawk = new javax.swing.JButton();
        btntriddent = new javax.swing.JButton();
        msgarea = new java.awt.TextArea();
        txtmsg = new javax.swing.JTextField();
        btnsend = new javax.swing.JButton();
        lblSoldiercount = new javax.swing.JLabel();
        lblAmmoCount = new javax.swing.JLabel();
        slideroxygen = new javax.swing.JSlider();
        lbloxygen = new javax.swing.JLabel();
        lblfuel = new javax.swing.JLabel();
        sliderfuel = new javax.swing.JSlider();
        positioncheck = new javax.swing.JCheckBox();
        soldiercount = new javax.swing.JSpinner();
        ammocount = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SubMarine | Defence System");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocation(new java.awt.Point(650, 450));
        setResizable(false);

        areastatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        areastatus.setText("Area Not Cleared");

        btnshoot.setBackground(new java.awt.Color(0, 153, 51));
        btnshoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnshoot.setForeground(new java.awt.Color(255, 255, 255));
        btnshoot.setText("Shoot");
        btnshoot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnshoot.setEnabled(false);

        btnsonar.setBackground(new java.awt.Color(0, 153, 51));
        btnsonar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsonar.setForeground(new java.awt.Color(255, 255, 255));
        btnsonar.setText("Sonar Operation");
        btnsonar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsonar.setEnabled(false);

        btntamhawk.setBackground(new java.awt.Color(0, 153, 51));
        btntamhawk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btntamhawk.setForeground(new java.awt.Color(255, 255, 255));
        btntamhawk.setText("Tamhawk Missile");
        btntamhawk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btntamhawk.setEnabled(false);

        btntriddent.setBackground(new java.awt.Color(0, 153, 51));
        btntriddent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btntriddent.setForeground(new java.awt.Color(255, 255, 255));
        btntriddent.setText("Triddent-2 missile");
        btntriddent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btntriddent.setEnabled(false);

        msgarea.setBackground(new java.awt.Color(204, 204, 204));
        msgarea.setEditable(false);

        txtmsg.setBackground(new java.awt.Color(204, 204, 204));

        btnsend.setBackground(new java.awt.Color(0, 102, 255));
        btnsend.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsend.setForeground(new java.awt.Color(255, 255, 255));
        btnsend.setText("send");
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });

        lblSoldiercount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSoldiercount.setText("Soldier Count");

        lblAmmoCount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAmmoCount.setText("Ammo Count");

        slideroxygen.setMajorTickSpacing(20);
        slideroxygen.setMinorTickSpacing(10);
        slideroxygen.setOrientation(javax.swing.JSlider.VERTICAL);
        slideroxygen.setPaintLabels(true);
        slideroxygen.setPaintTicks(true);
        slideroxygen.setValue(0);
        slideroxygen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slideroxygen.addChangeListener(new javax.swing.event.ChangeListener(){
            public void stateChanged(javax.swing.event.ChangeEvent evt){
                oxygenlevel(slideroxygen.getValue());
            }
        });

        lbloxygen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbloxygen.setText("Oxigen");

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

        positioncheck.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        positioncheck.setText("Posission");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btntamhawk, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(areastatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnshoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnsonar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btntriddent, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSoldiercount, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(lblAmmoCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(soldiercount, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(ammocount))
                                .addGap(9, 9, 9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(positioncheck, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsend))
                            .addComponent(msgarea, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblfuel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(sliderfuel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbloxygen, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slideroxygen, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(areastatus)
                            .addComponent(lblSoldiercount)
                            .addComponent(soldiercount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnshoot)
                                    .addComponent(btnsonar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btntamhawk)
                                    .addComponent(btntriddent)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAmmoCount)
                                    .addComponent(ammocount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addComponent(positioncheck)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(msgarea, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsend)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbloxygen)
                            .addComponent(lblfuel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sliderfuel, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(slideroxygen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    @Override
    public String getoxygen(){
        return oxygenleveldetails+"";
    }
    @Override
    public void oxygenlevel(int level){
        oxygenleveldetails= level;
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
    @Override
    public void sendmsg(){
        MainController.getInstant().recivemsg("SubMarine : - "+txtmsg.getText()+"\n");
        
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
               btnsonar.setEnabled(true);
            }else{
                btnsonar.setEnabled(false);
            }
            if(value>=75){
                btntamhawk.setEnabled(true);
            }else{
                btntamhawk.setEnabled(false);
            }
            if(value==100){
                btntriddent.setEnabled(true);
            }else{
                btntriddent.setEnabled(false);
            }
        }
    }
    @Override
    public void areacheck(){
        if("Area Cleared".equals(areastatus.getText())){
            areastatus.setText("Area Not Cleared");
        }else{
           areastatus.setText("Area Cleared"); 
        }
    }
    public boolean posisionstatus(){
        return positioncheck.isSelected();
    }
    @Override
    public void receivedmsg(String msg){
        msgarea.setText(msgarea.getText()+ msg+"\n");
    }
    private void positioncheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positioncheckActionPerformed
        if(!positioncheck.isSelected()){
            btnshoot.setEnabled(false);
            btnsonar.setEnabled(false);
            btntamhawk.setEnabled(false);
            btntriddent.setEnabled(false);
        }
    }//GEN-LAST:event_positioncheckActionPerformed

    private void btnsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendActionPerformed
        sendmsg();
    }//GEN-LAST:event_btnsendActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ammocount;
    private javax.swing.JLabel areastatus;
    private javax.swing.JButton btnsend;
    private javax.swing.JButton btnshoot;
    private javax.swing.JButton btnsonar;
    private javax.swing.JButton btntamhawk;
    private javax.swing.JButton btntriddent;
    private javax.swing.JLabel lblAmmoCount;
    private javax.swing.JLabel lblSoldiercount;
    private javax.swing.JLabel lblfuel;
    private javax.swing.JLabel lbloxygen;
    private java.awt.TextArea msgarea;
    private javax.swing.JCheckBox positioncheck;
    private javax.swing.JSlider sliderfuel;
    private javax.swing.JSlider slideroxygen;
    private javax.swing.JSpinner soldiercount;
    private javax.swing.JTextField txtmsg;
    // End of variables declaration//GEN-END:variables

}
