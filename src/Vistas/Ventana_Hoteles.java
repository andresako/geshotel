package Vistas;

import Controlador.HabitacionTools;
import Controlador.HotelTools;
import Controlador.MyTools;
import Modelo.Categoria;
import Modelo.Habitacion;
import Modelo.Hotel;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.ListModel;

/**
 * @author andres
 */
public class Ventana_Hoteles extends javax.swing.JFrame {

    private Hotel hotel;
    private MyTools MT;
    private HabitacionTools HT;
    private HotelTools HoT;
    private ArrayList<Habitacion> ListaHabitaciones;
    private JFrame padre;
    private boolean nuevoHotel;

    public Ventana_Hoteles() {
    }

    public Ventana_Hoteles(JFrame padre) {
        initComponents();
        this.padre = padre;
        SetUi();
        nuevoHotel();
    }

    public Ventana_Hoteles(Hotel hotel, JFrame padre) {
        initComponents();
        this.hotel = hotel;
        this.padre = padre;
        HT = new HabitacionTools(hotel);

        SetUi();
        MostrarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnLista = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        panelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaHab = new javax.swing.JList();
        panelDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cmbEstrellas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        panelEdicionLista = new javax.swing.JPanel();
        btnAddHab = new javax.swing.JButton();
        btnEdiHab = new javax.swing.JButton();
        btnBorHab = new javax.swing.JButton();
        panelEdicion = new javax.swing.JPanel();
        btnOk = new javax.swing.JButton();
        btnKo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion de Hoteles");

        panelBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnLista.setText("Cambiar");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLista)
                    .addComponent(btnModificar)
                    .addComponent(btnBorrar)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelLista.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        listaHab.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaHab);

        javax.swing.GroupLayout panelListaLayout = new javax.swing.GroupLayout(panelLista);
        panelLista.setLayout(panelListaLayout);
        panelListaLayout.setHorizontalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelListaLayout.setVerticalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("ID");

        txtId.setText("jTextField1");
        txtId.setEnabled(false);

        jLabel3.setText("(*) Estrellas");

        jLabel4.setText("(*) Nombre");

        txtNombre.setText("jTextField1");

        cmbEstrellas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("(*) Ciudad");

        txtCiudad.setText("jTextField1");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbEstrellas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtCiudad))
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEstrellas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEdicionLista.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAddHab.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnAddHab.setText("+");
        btnAddHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHabActionPerformed(evt);
            }
        });

        btnEdiHab.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnEdiHab.setText("E");
        btnEdiHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdiHabActionPerformed(evt);
            }
        });

        btnBorHab.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnBorHab.setText("X");
        btnBorHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorHabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEdicionListaLayout = new javax.swing.GroupLayout(panelEdicionLista);
        panelEdicionLista.setLayout(panelEdicionListaLayout);
        panelEdicionListaLayout.setHorizontalGroup(
            panelEdicionListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEdicionListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddHab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdiHab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorHab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEdicionListaLayout.setVerticalGroup(
            panelEdicionListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEdicionListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEdicionListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddHab, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnEdiHab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorHab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelEdicion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnKo.setText("NO");
        btnKo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEdicionLayout = new javax.swing.GroupLayout(panelEdicion);
        panelEdicion.setLayout(panelEdicionLayout);
        panelEdicionLayout.setHorizontalGroup(
            panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEdicionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        panelEdicionLayout.setVerticalGroup(
            panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEdicionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOk, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnKo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelEdicionLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel1))
                    .addComponent(panelEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelEdicionLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if (nuevoHotel) {
            if (minimos()) {
                hotel = new Hotel((Categoria) cmbEstrellas.getSelectedItem(), txtNombre.getText(), txtCiudad.getText(), null);
                HoT.addHotel(hotel);
                btnListaActionPerformed(evt);
            } else {
                MT.mostrarError("Rellena todos los campos");
            }
        } else {
            hotel.setNombre(txtNombre.getText());
            hotel.setCiudad(txtCiudad.getText());
            hotel.setCategoria((Categoria) cmbEstrellas.getSelectedItem());
            HoT.editHotel(hotel);

            MostrarDatos();
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnKoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKoActionPerformed
        if (nuevoHotel) {
            dispose();
        } else {
            MostrarDatos();
        }
    }//GEN-LAST:event_btnKoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        padre.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        this.setVisible(false);
        new Lista_Hoteles(padre, true).setVisible(true);
    }//GEN-LAST:event_btnListaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        HabilitarEdicion(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int resp = MT.mostrarPreguntaSiNo("Borrar el hotel " + hotel.getNombre());
        if (resp == 0) {
            HoT.delHotel(hotel);
            btnListaActionPerformed(evt);
        } else {

        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAddHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHabActionPerformed
//        ListModel contador = listaHab.getModel();
//        if (contador.getSize() < 5) {
        int resp = MT.mostrarPreguntaSiNo("Añadir habitacion?");
        if (resp == 0) {
            HT.addHabitacion(new Habitacion(hotel, 1, null));
            MostrarDatos();
        }
//        }else{
//            MT.mostrarError("Máximo 5 habitaciones por hotel");
//        }
    }//GEN-LAST:event_btnAddHabActionPerformed

    private void btnEdiHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdiHabActionPerformed
        if (listaHab.getSelectedIndex() < 0) {
            MT.mostrarPlain("Selecciona la habitacion a editar");
        } else {
            Habitacion cnt = (Habitacion) listaHab.getSelectedValue();
            System.out.println("Editando la habitacion: " + cnt.getIdhabitacion());
            Ventana_Habitacion VH = new Ventana_Habitacion(this, true);
            VH.setHabitacion((Habitacion) listaHab.getSelectedValue());
            VH.SetUi();
            this.setVisible(false);
            VH.setVisible(true);
        }
    }//GEN-LAST:event_btnEdiHabActionPerformed

    private void btnBorHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorHabActionPerformed
        if (listaHab.getSelectedIndex() < 0) {
            MT.mostrarPlain("Selecciona la habitacion a borrar");
        } else {
            int resp = MT.mostrarPreguntaSiNo("Eliminar habitacion?");
            if (resp == 0) {
                HT.delHabitacion((Habitacion) listaHab.getSelectedValue());
                MostrarDatos();
            }
        }
    }//GEN-LAST:event_btnBorHabActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddHab;
    private javax.swing.JButton btnBorHab;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEdiHab;
    private javax.swing.JButton btnKo;
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbEstrellas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaHab;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelEdicion;
    private javax.swing.JPanel panelEdicionLista;
    private javax.swing.JPanel panelLista;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void SetUi() {
        MT = new MyTools();
        HoT = new HotelTools();
        HoT.rellenarRating(cmbEstrellas);
    }

    private void MostrarDatos() {
        txtId.setText("" + hotel.getIdhotel());
        cmbEstrellas.setSelectedIndex(hotel.getCategoria().getIdcategoria() - 1);
        txtNombre.setText(hotel.getNombre());
        txtCiudad.setText(hotel.getCiudad());
        listaHab.setModel(HT.getListaHab());

        HabilitarEdicion(false);
        HT.setHabitaciones();

    }

    private void nuevoHotel() {
        nuevoHotel = true;
        jLabel1.setText("Nuevo Hotel");

        txtId.setText("");
        txtNombre.setText("");
        txtCiudad.setText("");
        cmbEstrellas.setSelectedIndex(-1);

        HabilitarEdicion(true);

    }

    private void HabilitarEdicion(boolean b) {
        txtNombre.setEnabled(b);
        txtCiudad.setEnabled(b);
        cmbEstrellas.setEnabled(b);
        panelEdicion.setVisible(b);

        panelLista.setVisible(!b);
        panelEdicionLista.setVisible(!b);
        panelBotones.setVisible(!b);

        this.pack();
    }

    private boolean minimos() {
        if (txtNombre.getText().equals("")) {
            return false;
        }
        if (txtNombre.getText().equals("")) {
            return false;
        }
        if (cmbEstrellas.getSelectedIndex() == -1) {
            return false;
        }

        return true;
    }

}
