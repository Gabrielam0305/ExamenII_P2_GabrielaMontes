package examenii_p2_gabrielamontes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Gabriela Montes
 */
public class Deportes extends javax.swing.JFrame {

    /**
     * Creates new form Deportes
     */
    public Deportes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lt_equipostorneo = new javax.swing.JList<>();
        jb_verpartidos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jf_tablatorneos = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_partidos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jf_posicionestabla = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_posicion = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        pp_deporte = new javax.swing.JPopupMenu();
        jmi_creartorneo = new javax.swing.JMenuItem();
        jmi_guardar = new javax.swing.JMenuItem();
        jf_creardeporte = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tf_creardeportenombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pp_torneo = new javax.swing.JPopupMenu();
        jmi_crearequipo = new javax.swing.JMenuItem();
        jmi_listarequipos = new javax.swing.JMenuItem();
        jmi_simulacion = new javax.swing.JMenuItem();
        jmi_tabladeposiciones = new javax.swing.JMenuItem();
        jf_crearpartido = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jcb_equipo2 = new javax.swing.JComboBox<>();
        jcb_equipo1 = new javax.swing.JComboBox<>();
        jsp_puntosequipo2 = new javax.swing.JSpinner();
        js_puntosequipo1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jpb_descargadeporte = new javax.swing.JProgressBar();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtree_periodos = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lt_equipostorneo.setModel(new DefaultListModel()
        );
        jScrollPane4.setViewportView(lt_equipostorneo);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 330, 370));

        jb_verpartidos.setText("Partido");
        jb_verpartidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_verpartidosMouseClicked(evt);
            }
        });
        jPanel2.add(jb_verpartidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/6c9ccabdb3d6a4210cdf8ef5540723fa.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 480));

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_partidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Equipo", "Puntos", "Equipo", "Puntos"
            }
        ));
        jScrollPane3.setViewportView(tbl_partidos);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 690, 490));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/95db03af3c8baa71a968074a1756d5c5.jpg"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jf_tablatorneosLayout = new javax.swing.GroupLayout(jf_tablatorneos.getContentPane());
        jf_tablatorneos.getContentPane().setLayout(jf_tablatorneosLayout);
        jf_tablatorneosLayout.setHorizontalGroup(
            jf_tablatorneosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jf_tablatorneosLayout.setVerticalGroup(
            jf_tablatorneosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_posicion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Puntaje"
            }
        ));
        jScrollPane2.setViewportView(tbl_posicion);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 80, 690, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/bdb9d3d01a871d8f88b0030e172e56a0.jpg"))); // NOI18N
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jf_posicionestablaLayout = new javax.swing.GroupLayout(jf_posicionestabla.getContentPane());
        jf_posicionestabla.getContentPane().setLayout(jf_posicionestablaLayout);
        jf_posicionestablaLayout.setHorizontalGroup(
            jf_posicionestablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jf_posicionestablaLayout.setVerticalGroup(
            jf_posicionestablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jmi_creartorneo.setText("Crear torneo");
        jmi_creartorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_creartorneoActionPerformed(evt);
            }
        });
        pp_deporte.add(jmi_creartorneo);

        jmi_guardar.setText("Guardar");
        jmi_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_guardarActionPerformed(evt);
            }
        });
        pp_deporte.add(jmi_guardar);

        jPanel3.setBackground(new java.awt.Color(236, 232, 224));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        jPanel3.add(tf_creardeportenombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 350, -1));

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        javax.swing.GroupLayout jf_creardeporteLayout = new javax.swing.GroupLayout(jf_creardeporte.getContentPane());
        jf_creardeporte.getContentPane().setLayout(jf_creardeporteLayout);
        jf_creardeporteLayout.setHorizontalGroup(
            jf_creardeporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jf_creardeporteLayout.setVerticalGroup(
            jf_creardeporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jmi_crearequipo.setText("Crear equipo");
        jmi_crearequipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_crearequipoActionPerformed(evt);
            }
        });
        pp_torneo.add(jmi_crearequipo);

        jmi_listarequipos.setText("Listar");
        jmi_listarequipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_listarequiposActionPerformed(evt);
            }
        });
        pp_torneo.add(jmi_listarequipos);

        jmi_simulacion.setText("Simulación");
        jmi_simulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_simulacionActionPerformed(evt);
            }
        });
        pp_torneo.add(jmi_simulacion);

        jmi_tabladeposiciones.setText("Tabla de Posiciones");
        jmi_tabladeposiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_tabladeposicionesActionPerformed(evt);
            }
        });
        pp_torneo.add(jmi_tabladeposiciones);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Registrar Partido");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        jcb_equipo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcb_equipo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_equipo2ActionPerformed(evt);
            }
        });
        jPanel5.add(jcb_equipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 240, -1));

        jcb_equipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcb_equipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_equipo1ActionPerformed(evt);
            }
        });
        jPanel5.add(jcb_equipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, -1));
        jPanel5.add(jsp_puntosequipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 130, -1));
        jPanel5.add(js_puntosequipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 130, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/363c5d4af5fded755ce3b707269db98d.jpg"))); // NOI18N
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 490));

        javax.swing.GroupLayout jf_crearpartidoLayout = new javax.swing.GroupLayout(jf_crearpartido.getContentPane());
        jf_crearpartido.getContentPane().setLayout(jf_crearpartidoLayout);
        jf_crearpartidoLayout.setHorizontalGroup(
            jf_crearpartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jf_crearpartidoLayout.setVerticalGroup(
            jf_crearpartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpb_descargadeporte.setBackground(new java.awt.Color(204, 204, 255));
        jpb_descargadeporte.setForeground(new java.awt.Color(153, 0, 255));
        jPanel1.add(jpb_descargadeporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 700, 20));

        jButton2.setText("Agregar Deporte");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 720, 180, 30));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Torneos");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q1");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q2");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q4");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Q5");
        treeNode1.add(treeNode2);
        jtree_periodos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jtree_periodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtree_periodosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtree_periodos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 640, 630));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/main.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_creartorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_creartorneoActionPerformed
        DefaultTreeModel modelo = (DefaultTreeModel) jtree_periodos.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();

        String nombretorneo = JOptionPane.showInputDialog("Ingrese el nombre del torneo ");
        Torneo t = new Torneo(nombretorneo, nodo_seleccionado.getParent().toString());
        deporteselect.getTorneos().add(t);
        for (Torneo torneo : deporteselect.getTorneos()) {
            System.out.println("torneo: " + torneo);
        }
        DefaultMutableTreeNode t_obj = new DefaultMutableTreeNode(t);
        nodo_seleccionado.add(t_obj);
        modelo.reload();
    }//GEN-LAST:event_jmi_creartorneoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        DefaultTreeModel modelo = (DefaultTreeModel) jtree_periodos.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
        for (int i = 0; i < raiz.getChildCount(); i++) {
            Deporte p = new Deporte(tf_creardeportenombre.getText());
            DefaultMutableTreeNode lc_obj = new DefaultMutableTreeNode(p);
            DefaultMutableTreeNode nodo_seleccionado = (DefaultMutableTreeNode) raiz.getChildAt(i);
            nodo_seleccionado.add(lc_obj);
            modelo.reload();
        }
        tf_creardeportenombre.setText("");

        jf_creardeporte.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        jf_creardeporte.pack();
        jf_creardeporte.setLocationRelativeTo(this);
        jf_creardeporte.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jtree_periodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtree_periodosMouseClicked
        if (evt.isMetaDown()) {
            int row = jtree_periodos.getClosestRowForLocation(evt.getX(), evt.getY());
            jtree_periodos.setSelectionRow(row);
            Object v1
                    = jtree_periodos.getSelectionPath().
                            getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;

            if (nodo_seleccionado.getUserObject() instanceof Deporte) {
                deporteselect = (Deporte) nodo_seleccionado.
                        getUserObject();
                pp_deporte.show(evt.getComponent(),
                        evt.getX(), evt.getY());
            } else if (nodo_seleccionado.getUserObject() instanceof Torneo) {
                torneoselect = (Torneo) nodo_seleccionado.
                        getUserObject();
                pp_torneo.show(evt.getComponent(),
                        evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jtree_periodosMouseClicked

    private void jmi_crearequipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_crearequipoActionPerformed
        String nombreequipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo ");
        int puntos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puntos "));
        Equipo e = new Equipo(nombreequipo, puntos);
        torneoselect.getEquiposparticipantes().add(e);
    }//GEN-LAST:event_jmi_crearequipoActionPerformed

    private void jmi_listarequiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_listarequiposActionPerformed
        DefaultListModel modelolistar = (DefaultListModel) lt_equipostorneo.getModel();
        modelolistar.removeAllElements();
        for (Equipo eq : torneoselect.getEquiposparticipantes()) {
            modelolistar.addElement(eq);
        }
        lt_equipostorneo.setModel(modelolistar);
        jDialog1.setModal(true);
        jDialog1.pack();
        jDialog1.setLocationRelativeTo(this);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jmi_listarequiposActionPerformed

    private void jb_verpartidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_verpartidosMouseClicked
        DefaultTableModel modelocompleto = (DefaultTableModel) tbl_partidos.getModel();
        DefaultListModel m = (DefaultListModel) lt_equipostorneo.getModel();
        while (modelocompleto.getRowCount() > 0) {
            modelocompleto.removeRow(0);
        }

        for (Equipo equiposparticipante : torneoselect.getEquiposparticipantes()) {
            Equipo value = (Equipo) m.get(lt_equipostorneo.getSelectedIndex());
            String vstring = value.toString();
            String estring = equiposparticipante.toString();
            if (vstring.equals(estring)) {
                for (Partido lp : equiposparticipante.getListapartidos()) {
                    Object[] row = {lp.getEquipo1(), lp.getPuntos1(), lp.getEquipo2(), lp.getPuntos2()};
                    modelocompleto.addRow(row);
                }
            }
        }
        tbl_partidos.setModel(modelocompleto);
        jDialog1.setVisible(false);
        jf_tablatorneos.pack();
        jf_tablatorneos.setLocationRelativeTo(this);
        jf_tablatorneos.setVisible(true);

    }//GEN-LAST:event_jb_verpartidosMouseClicked

    private void jcb_equipo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_equipo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_equipo2ActionPerformed

    private void jcb_equipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_equipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_equipo1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        String nombreequipo1 = jcb_equipo1.getSelectedItem().toString();
        String nombreequipo2 = jcb_equipo2.getSelectedItem().toString();
        if (nombreequipo1.equals(nombreequipo2)) {
            JOptionPane.showConfirmDialog(jf_crearpartido, "Selccione dos grupos");
        } else {
            int puntos1 = Integer.parseInt(js_puntosequipo1.getValue().toString());
            int puntos2 = Integer.parseInt(jsp_puntosequipo2.getValue().toString());
            Partido p = new Partido(nombreequipo1, nombreequipo2, puntos1, puntos2);
            torneoselect.getListapartidos().add(p);
            for (Equipo e : torneoselect.getEquiposparticipantes()) {
                if (e.getNombre().equals(nombreequipo1)) {
                    e.getListapartidos().add(p);
                }
                if (e.getNombre().equals(nombreequipo2)) {
                    e.getListapartidos().add(p);
                }
            }
            jf_crearpartido.setVisible(false);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jmi_simulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_simulacionActionPerformed

        if (torneoselect.getEquiposparticipantes().size() > 0) {
            jcb_equipo1.removeAllItems();
            jcb_equipo2.removeAllItems();
            for (Equipo ep : torneoselect.getEquiposparticipantes()) {
                jcb_equipo1.addItem(ep.getNombre());
                jcb_equipo2.addItem(ep.getNombre());
            }
            jf_crearpartido.pack();
            jf_crearpartido.setLocationRelativeTo(this);
            jf_crearpartido.setVisible(true);
        } else {
            JOptionPane.showConfirmDialog(this, "No hay equipos todavia en el torneo");
        }

    }//GEN-LAST:event_jmi_simulacionActionPerformed

    private void jmi_tabladeposicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_tabladeposicionesActionPerformed
        ArrayList<Integer> puntos = new ArrayList();
        ArrayList<Equipo> temp = new ArrayList();
        for (Equipo equiposparticipante : torneoselect.getEquiposparticipantes()) {
            puntos.add(equiposparticipante.getPuntos());
        }
        Collections.sort(puntos, Collections.reverseOrder());
        for (Integer p : puntos) {
            for (Equipo e : torneoselect.getEquiposparticipantes()) {
                if (e.getPuntos() == p) {
                    temp.add(e);
                }
            }
        }
        DefaultTableModel modelocompleto = (DefaultTableModel) tbl_posicion.getModel();
        while (modelocompleto.getRowCount() > 0) {
            modelocompleto.removeRow(0);
        }
        for (Equipo equipo : temp) {
            Object[] row = {equipo.getNombre(), equipo.getPuntos()};
            modelocompleto.addRow(row);
        }

        tbl_posicion.setModel(modelocompleto);
        jf_posicionestabla.pack();
        jf_posicionestabla.setLocationRelativeTo(this);
        jf_posicionestabla.setVisible(true);

    }//GEN-LAST:event_jmi_tabladeposicionesActionPerformed

    private void jmi_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_guardarActionPerformed

        
        
        
     double largo = deporteselect.getTorneos().size();
        System.out.println(largo);

        if (largo == 0) {
            JOptionPane.showConfirmDialog(this, "Descarga realizada, no hay torneos");
        } else {
            jpb_descargadeporte.setStringPainted(true);
            jpb_descargadeporte.setForeground(Color.black);
            jpb_descargadeporte.setString(deporteselect.getNombre() + " Descarga");
            AdminHilo ah = new AdminHilo(jpb_descargadeporte, largo);
            ah.start();
        }

    }//GEN-LAST:event_jmi_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(Deportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jb_verpartidos;
    private javax.swing.JComboBox<String> jcb_equipo1;
    private javax.swing.JComboBox<String> jcb_equipo2;
    private javax.swing.JFrame jf_creardeporte;
    private javax.swing.JFrame jf_crearpartido;
    private javax.swing.JFrame jf_posicionestabla;
    private javax.swing.JFrame jf_tablatorneos;
    private javax.swing.JMenuItem jmi_crearequipo;
    private javax.swing.JMenuItem jmi_creartorneo;
    private javax.swing.JMenuItem jmi_guardar;
    private javax.swing.JMenuItem jmi_listarequipos;
    private javax.swing.JMenuItem jmi_simulacion;
    private javax.swing.JMenuItem jmi_tabladeposiciones;
    private javax.swing.JProgressBar jpb_descargadeporte;
    private javax.swing.JSpinner js_puntosequipo1;
    private javax.swing.JSpinner jsp_puntosequipo2;
    private javax.swing.JTree jtree_periodos;
    private javax.swing.JList<String> lt_equipostorneo;
    private javax.swing.JPopupMenu pp_deporte;
    private javax.swing.JPopupMenu pp_torneo;
    private javax.swing.JTable tbl_partidos;
    private javax.swing.JTable tbl_posicion;
    private javax.swing.JTextField tf_creardeportenombre;
    // End of variables declaration//GEN-END:variables
 DefaultMutableTreeNode nodo_seleccionado;
    Deporte deporteselect;
    Torneo torneoselect;
    Equipo equiposelect;

}
