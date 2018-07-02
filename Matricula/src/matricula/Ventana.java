
package matricula;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class Ventana extends javax.swing.JFrame {


    String materias [][];
    DefaultTableModel tablaMaterias;
    
    String estudiantes [][];
    DefaultTableModel tablaEstudiantes;
    
    String items [][];
    DefaultTableModel tablaItems;
    
        List<Materias> listaMaterias = new ArrayList<Materias>();
    DefaultComboBoxModel listaMateriasModel = 
            new DefaultComboBoxModel(listaMaterias.toArray());
    
    List<Estudiantes> listaEstudiantes = new ArrayList<Estudiantes>();
    DefaultComboBoxModel listaEstudiantesModel = 
            new DefaultComboBoxModel(listaEstudiantes.toArray());
    
    
    public Ventana() {
        initComponents();
        
        String tituloMate [] = new String []{
        
            "Materias"
        };
        
        tablaMaterias = new DefaultTableModel (materias, tituloMate);
        tblMaterias.setModel(tablaMaterias);
        
        String tituloEstu [] = new String []{
        
        "Nombre","Apellido","Edad"
            
        };
        
        tablaEstudiantes = new DefaultTableModel (estudiantes, tituloEstu);
        tblEstudiantes.setModel(tablaEstudiantes);
        
        String tituloItem [] = new String []{
        
            "Estudiantes","Materias"
        
        };
        
        tablaItems = new DefaultTableModel (items,tituloItem);
        tblMatricula.setModel(tablaItems);
        
        boxMaterias.setModel(listaMateriasModel);
        boxEstudiantes.setModel(listaEstudiantesModel);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIngresarMateria = new javax.swing.JTextField();
        btnIngresarMateria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMaterias = new javax.swing.JTable();
        Fondo1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIngresarNombre = new javax.swing.JTextField();
        btnIngresarEstudiante = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstudiantes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtIngresarApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIngresarEdad = new javax.swing.JTextField();
        Fondo2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        boxEstudiantes = new javax.swing.JComboBox<>();
        boxMaterias = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMatricula = new javax.swing.JTable();
        btnMatricular = new javax.swing.JButton();
        Fondo3 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Materia:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));
        jPanel1.add(txtIngresarMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 280, -1));

        btnIngresarMateria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIngresarMateria.setText("Ingresar");
        btnIngresarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarMateriaActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresarMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        tblMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(tblMaterias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 630, 280));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fr.jpg"))); // NOI18N
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 706, 394));

        jTabbedPane1.addTab("Materias", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));
        jPanel2.add(txtIngresarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 250, -1));

        btnIngresarEstudiante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIngresarEstudiante.setText("Ingresar");
        btnIngresarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarEstudianteActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        tblEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tblEstudiantes);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 630, 260));

        jLabel3.setText("Apellido:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        txtIngresarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresarApellidoActionPerformed(evt);
            }
        });
        jPanel2.add(txtIngresarApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 250, -1));

        jLabel4.setText("Edad:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));
        jPanel2.add(txtIngresarEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 250, -1));

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ddr.jpg"))); // NOI18N
        jPanel2.add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 708, 393));

        jTabbedPane1.addTab("Estudiantes", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.add(boxEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel3.add(boxMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        tblMatricula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane3.setViewportView(tblMatricula);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 60, 390, 310));

        btnMatricular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMatricular.setText("Matricular");
        btnMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularActionPerformed(evt);
            }
        });
        jPanel3.add(btnMatricular, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        Fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ddfr.jpg"))); // NOI18N
        jPanel3.add(Fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 706, 395));

        jTabbedPane1.addTab("Matriculas", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 710, 420));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f11.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIngresarApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresarApellidoActionPerformed
        
    }//GEN-LAST:event_txtIngresarApellidoActionPerformed

    private void btnIngresarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarMateriaActionPerformed
        Materias newMateria = new Materias (txtIngresarMateria.getText()); 
        tablaMaterias.addRow(new String []{newMateria.getNombremateria()});
        listaMateriasModel.addElement(newMateria);
    }//GEN-LAST:event_btnIngresarMateriaActionPerformed

    private void btnIngresarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarEstudianteActionPerformed
        
        String nombre = txtIngresarNombre.getText();
        String apellido = txtIngresarApellido.getText();
        int edad = Integer.parseInt(txtIngresarEdad.getText());
        
        
        Estudiantes newEstudiante = new Estudiantes (nombre,apellido,edad);
        
        tablaEstudiantes.addRow(new String []{nombre,apellido,""+edad});
        listaEstudiantesModel.addElement(newEstudiante);
    }//GEN-LAST:event_btnIngresarEstudianteActionPerformed

    private void btnMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularActionPerformed
        
        String estudiante = ""+boxEstudiantes.getSelectedItem();
        String materia = ""+boxMaterias.getSelectedItem();
        
        tablaItems.addRow(new String []{estudiante,materia});
        
    }//GEN-LAST:event_btnMatricularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JLabel Fondo3;
    private javax.swing.JComboBox<String> boxEstudiantes;
    private javax.swing.JComboBox<String> boxMaterias;
    private javax.swing.JButton btnIngresarEstudiante;
    private javax.swing.JButton btnIngresarMateria;
    private javax.swing.JButton btnMatricular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblEstudiantes;
    private javax.swing.JTable tblMaterias;
    private javax.swing.JTable tblMatricula;
    private javax.swing.JTextField txtIngresarApellido;
    private javax.swing.JTextField txtIngresarEdad;
    private javax.swing.JTextField txtIngresarMateria;
    private javax.swing.JTextField txtIngresarNombre;
    // End of variables declaration//GEN-END:variables
}
