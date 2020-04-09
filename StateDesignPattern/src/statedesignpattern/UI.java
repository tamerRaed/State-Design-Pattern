package statedesignpattern;

import javax.swing.ButtonGroup;

public class UI extends javax.swing.JFrame {

    IEnemyAI gamePlayer;

    int enemy = 0;
    int ammo = 0;
    int health = 0;

    ButtonGroup enemyGroup = new ButtonGroup();
    ButtonGroup healthGroup = new ButtonGroup();
    ButtonGroup ammoGroup = new ButtonGroup();

    public UI() {
        initComponents();
      
        gamePlayer = new StateEnemyAI();

        enemyGroup.add(rbtn_player_approaches);
        enemyGroup.add(rbtn_player_runs);

        healthGroup.add(rbtn_health_full);
        healthGroup.add(rbtn_health_low);
        healthGroup.add(rbtn_health_no);

        ammoGroup.add(rbtn_ammo_low);
        ammoGroup.add(rbtn_ammo_full);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rbtn_player_approaches = new javax.swing.JRadioButton();
        rbtn_player_runs = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        rbtn_health_full = new javax.swing.JRadioButton();
        rbtn_health_low = new javax.swing.JRadioButton();
        rbtn_health_no = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rbtn_ammo_full = new javax.swing.JRadioButton();
        rbtn_ammo_low = new javax.swing.JRadioButton();
        btn_action = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enemy AI");

        jLabel1.setText("Enemy?");

        rbtn_player_approaches.setText("Player Approaches");

        rbtn_player_runs.setText("Player Runs");

        jLabel2.setText("Health?");

        rbtn_health_full.setText("Full");

        rbtn_health_low.setText("Low");

        rbtn_health_no.setText("No");

        jLabel3.setText("Ammo?");

        rbtn_ammo_full.setText("Full");

        rbtn_ammo_low.setText("Low");

        btn_action.setText("Action");
        btn_action.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(rbtn_player_approaches))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(rbtn_health_full)
                                .addGap(41, 41, 41)
                                .addComponent(rbtn_health_low)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtn_health_no)
                            .addComponent(rbtn_player_runs)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(rbtn_ammo_full)
                        .addGap(41, 41, 41)
                        .addComponent(rbtn_ammo_low))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btn_action)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_player_approaches)
                    .addComponent(rbtn_player_runs))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_health_full)
                    .addComponent(rbtn_health_low)
                    .addComponent(rbtn_health_no))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_ammo_full)
                    .addComponent(rbtn_ammo_low))
                .addGap(28, 28, 28)
                .addComponent(btn_action)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actionActionPerformed

        if (rbtn_player_approaches.isSelected()) 
            gamePlayer.player_approaches();
        
        if (rbtn_player_runs.isSelected()) 
            gamePlayer.player_run();
        
        if (rbtn_health_no.isSelected()) {
            gamePlayer.health_no();
            enemyGroup.clearSelection();
            ammoGroup.clearSelection();
            healthGroup.clearSelection();
        }
        if (rbtn_health_full.isSelected()) 
            gamePlayer.health_full();
        
        if (rbtn_health_low.isSelected()) 
            gamePlayer.health_low();
        
        if (rbtn_ammo_full.isSelected()) 
            gamePlayer.ammo_full();
        
        if (rbtn_ammo_low.isSelected()) 
            gamePlayer.ammo_low();
        
    }//GEN-LAST:event_btn_actionActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_action;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton rbtn_ammo_full;
    private javax.swing.JRadioButton rbtn_ammo_low;
    private javax.swing.JRadioButton rbtn_health_full;
    private javax.swing.JRadioButton rbtn_health_low;
    private javax.swing.JRadioButton rbtn_health_no;
    private javax.swing.JRadioButton rbtn_player_approaches;
    private javax.swing.JRadioButton rbtn_player_runs;
    // End of variables declaration//GEN-END:variables
}
