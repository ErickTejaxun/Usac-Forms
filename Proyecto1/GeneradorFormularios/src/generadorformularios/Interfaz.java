/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorformularios;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author erick
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
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

        jPanel1 = new javax.swing.JPanel();
        botonGuardar = new javax.swing.JButton();
        botonAbrir = new javax.swing.JButton();
        botonErrores = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonGenerar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaEdicion = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setName("frameInterfaz"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        jPanel1.add(botonGuardar);
        botonGuardar.setBounds(85, 12, 40, 40);

        botonAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/abrir.jpg"))); // NOI18N
        botonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbrirActionPerformed(evt);
            }
        });
        jPanel1.add(botonAbrir);
        botonAbrir.setBounds(11, 12, 40, 40);

        botonErrores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/error.png"))); // NOI18N
        jPanel1.add(botonErrores);
        botonErrores.setBounds(154, 12, 40, 40);

        jLabel1.setText("Abrir");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(11, 63, 40, 20);

        jLabel2.setText("Guardar");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(85, 58, 60, 20);

        jLabel3.setText("Errores");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(151, 58, 60, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 10, 690, 100);

        botonGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/run.png"))); // NOI18N
        botonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGenerar);
        botonGenerar.setBounds(810, 20, 82, 83);

        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Archivo", "Linea", "Columna", "Descripción"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Errores", jPanel3);

        jPanel2.add(jTabbedPane2);
        jTabbedPane2.setBounds(10, 310, 890, 130);

        areaEdicion.setColumns(20);
        areaEdicion.setRows(5);
        jScrollPane3.setViewportView(areaEdicion);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Entrada", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 885, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Salida", jPanel5);

        jPanel2.add(jTabbedPane3);
        jTabbedPane3.setBounds(10, 10, 890, 290);

        jTabbedPane1.addTab("Entrada", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(30, 130, 920, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarActionPerformed

    }//GEN-LAST:event_botonGenerarActionPerformed

    private void botonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbrirActionPerformed
        try {
            seleccionarArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonAbrirActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    
    // Todos mis metodos engazados.
    
    //Metodo para leer el archivo .xls :v
    
    public String leerArchivoX(String path) throws FileNotFoundException, IOException
    {
        String cadenaArchivo= "";               
        try(FileInputStream archivo = new FileInputStream(new File(path)))
        {
            //Leer el archivo plano de excel.
            
            
            XSSFWorkbook libro = new XSSFWorkbook(archivo);

            /*Obtenemos la hoja que necesitamos
            - Necesitamos 3:  Encuesta, Opciones, Configuraciones¨
            */

            //Primero la página Encuesta
            XSSFSheet hojaActual = libro.getSheetAt(0);

            //Obtenemos las filas de la hoja.
            Iterator<Row> filaIterator = hojaActual.iterator();

            Row fila; // Auxiliar para cada fila.

            while(filaIterator.hasNext())
            {
                fila = filaIterator.next();

                //Ahora obtenemos las celdas de la fila.
                Iterator<Cell> celdaIterator = fila.cellIterator();
                Cell celda;
                //Obtenemos cada celda
                while(celdaIterator.hasNext())
                {
                    //Obtenemos el contenido de la celda.
                    celda = celdaIterator.next(); 
                    cadenaArchivo +=  celda.toString()+ "~";
                    //System.out.println(cadenaArchivo);
                }
                cadenaArchivo +=  "\n";
            }       
        }
        catch(Exception error)
        {
            Mensaje(error.getMessage(), "Error");
        }
        return cadenaArchivo;
    }
    
    
        public String leerArchivo(String path) throws FileNotFoundException, IOException
    {
        String cadenaArchivo= "";               
        try(FileInputStream archivo = new FileInputStream(new File(path)))
        {
            //Leer el archivo plano de excel.
            
            
            HSSFWorkbook libro = new HSSFWorkbook(archivo);

            /*Obtenemos la hoja que necesitamos
            - Necesitamos 3:  Encuesta, Opciones, Configuraciones¨
            */

            //Primero la página Encuesta
            HSSFSheet hojaActual = libro.getSheetAt(0);

            //Obtenemos las filas de la hoja.
            Iterator<Row> filaIterator = hojaActual.iterator();

            Row fila; // Auxiliar para cada fila.

            while(filaIterator.hasNext())
            {
                fila = filaIterator.next();

                //Ahora obtenemos las celdas de la fila.
                Iterator<Cell> celdaIterator = fila.cellIterator();
                Cell celda;
                //Obtenemos cada celda
                while(celdaIterator.hasNext())
                {
                    //Obtenemos el contenido de la celda.
                    celda = celdaIterator.next(); 
                    cadenaArchivo +=  celda.toString()+ "~";
                    //System.out.println(cadenaArchivo);
                }
                cadenaArchivo +=  "\n";
            }       
        }
        catch(Exception error)
        {
            Mensaje(error.getMessage(), "Error");
        }
        return cadenaArchivo;
    }
    
    public void Mensaje(String mensaje, String titulo)
    {
        JOptionPane.showMessageDialog(this, mensaje, titulo, HEIGHT);
    }    
    
    public void seleccionarArchivo() throws IOException    
    {
        JFileChooser file=new JFileChooser();
        file.showOpenDialog(this);
        /**abrimos el archivo seleccionado*/
        File eleccion=file.getSelectedFile();
        if(eleccion!=null)
        {
            StringTokenizer token = new StringTokenizer(eleccion.getPath(),"\\");
            String formatoArchivo = "";
            while(token.hasMoreTokens())
            {
                formatoArchivo = token.nextToken();
            }
            token = new StringTokenizer(formatoArchivo,".");
            while(token.hasMoreElements()){formatoArchivo= token.nextToken();}
            
            if(formatoArchivo.equals("xlsx"))
            {
                areaEdicion.setText(leerArchivoX(eleccion.getPath()));
            }
            else 
            {
                areaEdicion.setText(leerArchivo(eleccion.getPath()));
            }
            
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaEdicion;
    private javax.swing.JButton botonAbrir;
    private javax.swing.JButton botonErrores;
    private javax.swing.JButton botonGenerar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
