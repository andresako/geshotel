package Vistas;

import Controlador.HabitacionTools;
import Controlador.HuespedTools;
import Modelo.Habitacion;
import Modelo.Huesped;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

/**
 * @author Andres
 */
public class Ventana_Habitacion extends javax.swing.JDialog {

    private Habitacion habitacion;
    private final JFrame padre;
    private Huesped[] listaSinTecho;
    private HuespedTools HT;
    private Huesped[] listaConTecho;

    public Ventana_Habitacion(JFrame parent, boolean modal) {
        super(parent, modal);
        this.padre = parent;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHabId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHabCamas = new com.toedter.components.JSpinField();
        btnActCama = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cmbCli1 = new javax.swing.JComboBox();
        cmbCli2 = new javax.swing.JComboBox();
        cmbCli3 = new javax.swing.JComboBox();
        cmbCli4 = new javax.swing.JComboBox();
        cmbCli5 = new javax.swing.JComboBox();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Habitacion id: ");

        txtHabId.setText("jLabel2");

        jLabel2.setText("Numero de camas: ");

        txtHabCamas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtHabCamasPropertyChange(evt);
            }
        });

        btnActCama.setText("✓");
        btnActCama.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActCama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActCamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtHabId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtHabCamas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActCama)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHabId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtHabCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActCama))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cmbCli1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbCli2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbCli3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbCli4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbCli5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbCli1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCli2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCli3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCli4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCli5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbCli1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbCli2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbCli3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbCli4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbCli5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnActCamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActCamaActionPerformed
        mostrarCamas();
    }//GEN-LAST:event_btnActCamaActionPerformed

    private void txtHabCamasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtHabCamasPropertyChange
        btnActCama.setEnabled(true);
    }//GEN-LAST:event_txtHabCamasPropertyChange

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        padre.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
        habitacion.setNumcamas(txtHabCamas.getValue());
        new HabitacionTools(habitacion.getHotel()).editHabitacion(habitacion);
        
        HT.limpiarHabitacion(listaConTecho, habitacion.getIdhabitacion());
        
        if(cmbCli1.getSelectedIndex() != -1){
            Huesped hues = (Huesped)cmbCli1.getSelectedItem();
            if(hues.getHabitacion() == null) hues.setHabitacion(habitacion);
            HT.modHuesped(hues);
        }
        if(cmbCli2.getSelectedIndex() != -1){
            Huesped hues = (Huesped)cmbCli2.getSelectedItem();
            if(hues.getHabitacion() == null) hues.setHabitacion(habitacion);
           HT.modHuesped(hues);
        }
        if(cmbCli3.getSelectedIndex() != -1){
            Huesped hues = (Huesped)cmbCli3.getSelectedItem();
            if(hues.getHabitacion() == null) hues.setHabitacion(habitacion);
            HT.modHuesped(hues);
        }
        if(cmbCli4.getSelectedIndex() != -1){
            Huesped hues = (Huesped)cmbCli4.getSelectedItem();
            if(hues.getHabitacion() == null) hues.setHabitacion(habitacion);
            HT.modHuesped(hues);
        }
        if(cmbCli5.getSelectedIndex() != -1){
            Huesped hues = (Huesped)cmbCli5.getSelectedItem();
            if(hues.getHabitacion() == null) hues.setHabitacion(habitacion);
            HT.modHuesped(hues);
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnActCama;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox cmbCli1;
    private javax.swing.JComboBox cmbCli2;
    private javax.swing.JComboBox cmbCli3;
    private javax.swing.JComboBox cmbCli4;
    private javax.swing.JComboBox cmbCli5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.components.JSpinField txtHabCamas;
    private javax.swing.JLabel txtHabId;
    // End of variables declaration//GEN-END:variables

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
        HT = new HuespedTools();
    }

    public void SetUi() {
        txtHabCamas.setMinimum(1);
        txtHabCamas.setMaximum(5);
        listaSinTecho = new HuespedTools().sinTecho();
        cmbCli1.setModel(new DefaultComboBoxModel(listaSinTecho));
        cmbCli1.addItem(null);
        cmbCli2.setModel(new DefaultComboBoxModel(listaSinTecho));
        cmbCli2.addItem(null);
        cmbCli3.setModel(new DefaultComboBoxModel(listaSinTecho));
        cmbCli3.addItem(null);
        cmbCli4.setModel(new DefaultComboBoxModel(listaSinTecho));
        cmbCli4.addItem(null);
        cmbCli5.setModel(new DefaultComboBoxModel(listaSinTecho));
        cmbCli5.addItem(null);

        txtHabId.setText("" + habitacion.getIdhabitacion());
        txtHabCamas.setValue(habitacion.getNumcamas());
        mostrarCamas();
        rellenarCamas();

    }

    private void mostrarCamas() {
        cmbCli1.setVisible(false);
        cmbCli2.setVisible(false);
        cmbCli3.setVisible(false);
        cmbCli4.setVisible(false);
        cmbCli5.setVisible(false);
        int camas = txtHabCamas.getValue();
        switch (camas) {
            case 5:
                cmbCli5.setVisible(true);
                cmbCli5.setSelectedIndex(-1);
            case 4:
                cmbCli4.setVisible(true);
                cmbCli4.setSelectedIndex(-1);
            case 3:
                cmbCli3.setVisible(true);
                cmbCli3.setSelectedIndex(-1);
            case 2:
                cmbCli2.setVisible(true);
                cmbCli2.setSelectedIndex(-1);
            case 1:
                cmbCli1.setVisible(true);
                cmbCli1.setSelectedIndex(-1);
        }
        btnActCama.setEnabled(false);
        this.pack();
    }

    private void rellenarCamas() {
        listaConTecho = new HuespedTools().conTecho(habitacion);
        if (listaConTecho.length <= 0) {
            switch(listaConTecho.length){
                case 5:
                    cmbCli5.setSelectedItem(listaConTecho[4]);
                case 4:
                    cmbCli4.setSelectedItem(listaConTecho[3]);
                case 3:
                    cmbCli3.setSelectedItem(listaConTecho[2]);
                case 2:
                    cmbCli2.setSelectedItem(listaConTecho[1]);
                case 1:
                    cmbCli1.setSelectedItem(listaConTecho[0]);
            }

        }
    }
}
