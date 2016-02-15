package Vistas;

import Controlador.HabitacionTools;
import Controlador.HuespedTools;
import Modelo.Habitacion;
import Modelo.Huesped;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 * @author Andres
 */
public class Ventana_Habitacion extends javax.swing.JDialog {

    private Habitacion habitacion;
    private final JFrame padre;
    private Huesped[] listaSinTecho;
    private Huesped[] listaConTecho;
    private Huesped[] listaSolosHab;
    private Huesped[] listaSolosTotales;
    private HuespedTools HT;
    private ArrayList<Huesped> actuales;

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
        cmbSolitario = new javax.swing.JComboBox();
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

        btnActCama.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnActCama.setText("✓");
        btnActCama.setToolTipText("ATENCION! Limpiará la habitación.");
        btnActCama.setBorder(null);
        btnActCama.setBorderPainted(false);
        btnActCama.setContentAreaFilled(false);
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
                    .addComponent(txtHabId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtHabCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActCama, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
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
                    .addComponent(btnActCama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cmbCli1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbCli2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbCli3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbCli4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbCli5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbSolitario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbCli1, 0, 193, Short.MAX_VALUE)
                    .addComponent(cmbCli2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCli3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCli4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCli5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbSolitario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbSolitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        btnActCama.setForeground(new java.awt.Color(255, 0, 0));
    }//GEN-LAST:event_txtHabCamasPropertyChange

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        padre.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (noRepetidos()) {
            if (!btnActCama.isEnabled()) {
                habitacion.setNumcamas(txtHabCamas.getValue());
                new HabitacionTools(habitacion.getHotel()).editHabitacion(habitacion);
            }
            HT.limpiarHabitacion(listaConTecho, habitacion.getIdhabitacion());

            if (cmbCli1.getSelectedIndex() != -1) {
                Huesped hues = (Huesped) cmbCli1.getSelectedItem();
                if (hues.getHabitacion() == null) {
                    hues.setHabitacion(habitacion);
                }
                HT.modHuesped(hues);
            }
            if (cmbCli2.getSelectedIndex() != -1) {
                Huesped hues = (Huesped) cmbCli2.getSelectedItem();
                if (hues.getHabitacion() == null) {
                    hues.setHabitacion(habitacion);
                }
                HT.modHuesped(hues);
            }
            if (cmbCli3.getSelectedIndex() != -1) {
                Huesped hues = (Huesped) cmbCli3.getSelectedItem();
                if (hues.getHabitacion() == null) {
                    hues.setHabitacion(habitacion);
                }
                HT.modHuesped(hues);
            }
            if (cmbCli4.getSelectedIndex() != -1) {
                Huesped hues = (Huesped) cmbCli4.getSelectedItem();
                if (hues.getHabitacion() == null) {
                    hues.setHabitacion(habitacion);
                }
                HT.modHuesped(hues);
            }
            if (cmbCli5.getSelectedIndex() != -1) {
                Huesped hues = (Huesped) cmbCli5.getSelectedItem();
                if (hues.getHabitacion() == null) {
                    hues.setHabitacion(habitacion);
                }
                HT.modHuesped(hues);
            }
            if (cmbSolitario.getSelectedIndex() != -1) {
                Huesped hues = (Huesped) cmbSolitario.getSelectedItem();
                if (hues.getHabitacion() == null) {
                    hues.setHabitacion(habitacion);
                }
                HT.modHuesped(hues);
            }

            dispose();
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
    private javax.swing.JComboBox cmbSolitario;
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
        listaSinTecho = HT.sinTecho();
        listaConTecho = HT.conTecho(habitacion);
        listaSolosTotales = HT.listaSolosTotal(habitacion);
        listaSolosHab = HT.listaSolos(habitacion);

        cmbCli1.removeAllItems();
        cmbCli2.removeAllItems();
        cmbCli3.removeAllItems();
        cmbCli4.removeAllItems();
        cmbCli5.removeAllItems();
        cmbSolitario.removeAllItems();

        cmbCli1.addItem(null);
        cmbCli2.addItem(null);
        cmbCli3.addItem(null);
        cmbCli4.addItem(null);
        cmbCli5.addItem(null);
        cmbSolitario.addItem(null);

        for (Huesped listaSinTecho1 : listaSinTecho) {
            cmbCli1.addItem(listaSinTecho1);
            cmbCli2.addItem(listaSinTecho1);
            cmbCli3.addItem(listaSinTecho1);
            cmbCli4.addItem(listaSinTecho1);
            cmbCli5.addItem(listaSinTecho1);
        }

        for (Huesped listaConTecho1 : listaConTecho) {
            cmbCli1.addItem(listaConTecho1);
            cmbCli2.addItem(listaConTecho1);
            cmbCli3.addItem(listaConTecho1);
            cmbCli4.addItem(listaConTecho1);
            cmbCli5.addItem(listaConTecho1);
        }

        for (Huesped listaSolo : listaSolosTotales) {
            cmbSolitario.addItem(listaSolo);
        }

        //listenerCombos();
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
        cmbSolitario.setVisible(false);
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
                cmbCli1.setVisible(true);
                cmbCli1.setSelectedIndex(-1);
                break;
            case 1:
                cmbSolitario.setVisible(true);
                cmbSolitario.setSelectedIndex(-1);
        }
        btnActCama.setEnabled(false);
        btnActCama.setForeground(new java.awt.Color(214, 217, 223));
        this.pack();
    }

    private void rellenarCamas() {
        actuales = new ArrayList<>();
        //System.out.println(listaConTecho.length);

        if (listaSolosHab.length > 0) {
                        cmbSolitario.setSelectedItem((Huesped) listaSolosHab[0]);
                        actuales.add((Huesped) listaSolosHab[0]);
        }
        if (listaConTecho.length > 0) {
                switch (listaConTecho.length) {
                    case 5:
                        cmbCli5.setSelectedItem((Huesped) listaConTecho[4]);
                        actuales.add((Huesped) listaConTecho[4]);
                    case 4:
                        cmbCli4.setSelectedItem((Huesped) listaConTecho[3]);
                        actuales.add((Huesped) listaConTecho[3]);
                    case 3:
                        cmbCli3.setSelectedItem((Huesped) listaConTecho[2]);
                        actuales.add((Huesped) listaConTecho[2]);
                    case 2:
                        cmbCli2.setSelectedItem((Huesped) listaConTecho[1]);
                        actuales.add((Huesped) listaConTecho[1]);
                    case 1:
                        cmbCli1.setSelectedItem((Huesped) listaConTecho[0]);
                        actuales.add((Huesped) listaConTecho[0]);       
                }
            }
    }

    private boolean noRepetidos() {

        return true;
    }

    private void listenerCombos() {

        ItemListener IL = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (actuales.contains((Huesped) e.getItem())) {
                    //((JComboBox)e.getSource()).setSelectedIndex(-1);
                    System.out.println("mec" + ((JComboBox) e.getSource()).getSelectedIndex());
                } else {
                    actuales.add((Huesped) e.getItem());
                }
            }

        };

        cmbCli1.addItemListener(IL);
        cmbCli2.addItemListener(IL);
        cmbCli3.addItemListener(IL);
        cmbCli4.addItemListener(IL);
        cmbCli5.addItemListener(IL);
    }
}
