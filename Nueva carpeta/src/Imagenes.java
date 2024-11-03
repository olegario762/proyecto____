
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


import com.drew.imaging.ImageMetadataReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.exif.ExifIFD0Directory;
import com.drew.metadata.exif.ExifSubIFDDirectory;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;








/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ixtamer
 */
public class Imagenes extends javax.swing.JFrame {
    
    private int currentIndex = -1; // Índice de la imagen actual
    private File[] imageFiles; // Array para almacenar las imágenes
 private String rutaEspecifica = "C:\\Users\\Ixtamer";

   

    /**
     * Creates new form Imagenes
     */
    public Imagenes() {
        initComponents();
         ImageIcon Labe1 = new ImageIcon(getClass().getResource("/imagnes/ññ.png/"));
         Icon fondo1 = new ImageIcon(Labe1.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));   
        
        
        fondo.setIcon(fondo1);
        
        
        //botnones
        regresar.setIcon(setIcono("/imagnes/atras.png", regresar));
        boton_imagenes.setIcon(setIcono("/imagnes/buscar.png", boton_imagenes));
        Buscador_por_nombre_.setIcon(setIcono("/imagnes/buscar.png", Buscador_por_nombre_));
        //Buscador_por_nombre_
       
        
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton_imagenes = new javax.swing.JButton();
        buscar_imagenes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tamaño_tabla1 = new javax.swing.JButton();
        tamaño_tabla_uno = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        imagen_ver_ = new javax.swing.JButton();
        cantidad = new javax.swing.JButton();
        candidad1 = new javax.swing.JLabel();
        eliminar_ = new javax.swing.JButton();
        mover_tabla1 = new javax.swing.JButton();
        archivos_duplicados = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        duplicado_tabla_ = new javax.swing.JTable();
        tamaño_duplicados = new javax.swing.JButton();
        tamaño_archivo_duplicado2_ = new javax.swing.JLabel();
        cantidad_duplicados = new javax.swing.JButton();
        cantidad_duplicados_ = new javax.swing.JLabel();
        eliminar_archvios_duplicados = new javax.swing.JButton();
        Mover_duplicado_ = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        limpiar_tabal1_ = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Buscador_por_nombre_ = new javax.swing.JButton();
        nombre_buscar = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_imagenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_imagenesActionPerformed(evt);
            }
        });
        jPanel1.add(boton_imagenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 90, 50));
        jPanel1.add(buscar_imagenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 440, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Extencion", "Ruta Archivo", "Fecha Creación", "Fecha Modificación", "Tamaño", "Nombre del aparato con que fue tomada la fotografía", "Modelo del aparato con que fue tomada la fotografía"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1340, 160));

        tamaño_tabla1.setText("tamaño");
        tamaño_tabla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamaño_tabla1ActionPerformed(evt);
            }
        });
        jPanel1.add(tamaño_tabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        tamaño_tabla_uno.setBackground(new java.awt.Color(255, 255, 255));
        tamaño_tabla_uno.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tamaño_tabla_uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 130, 30));
        jPanel1.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 310, 370, 240));

        imagen_ver_.setText("ver");
        imagen_ver_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen_ver_ActionPerformed(evt);
            }
        });
        jPanel1.add(imagen_ver_, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 110, 30));

        cantidad.setText("cantidad");
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        jPanel1.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        candidad1.setBackground(new java.awt.Color(255, 255, 255));
        candidad1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(candidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 140, 30));

        eliminar_.setText("Eliminar");
        eliminar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_ActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar_, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        mover_tabla1.setText("Mover");
        mover_tabla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mover_tabla1ActionPerformed(evt);
            }
        });
        jPanel1.add(mover_tabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        archivos_duplicados.setText("Duplicados");
        archivos_duplicados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivos_duplicadosActionPerformed(evt);
            }
        });
        jPanel1.add(archivos_duplicados, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        duplicado_tabla_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "ruta", "tamaño"
            }
        ));
        jScrollPane2.setViewportView(duplicado_tabla_);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 710, 130));

        tamaño_duplicados.setText("tamaño");
        tamaño_duplicados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamaño_duplicadosActionPerformed(evt);
            }
        });
        jPanel1.add(tamaño_duplicados, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        tamaño_archivo_duplicado2_.setBackground(new java.awt.Color(255, 255, 255));
        tamaño_archivo_duplicado2_.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tamaño_archivo_duplicado2_, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 160, 30));

        cantidad_duplicados.setText("cantidad");
        cantidad_duplicados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad_duplicadosActionPerformed(evt);
            }
        });
        jPanel1.add(cantidad_duplicados, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, -1, -1));

        cantidad_duplicados_.setBackground(new java.awt.Color(255, 255, 255));
        cantidad_duplicados_.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cantidad_duplicados_, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 160, 30));

        eliminar_archvios_duplicados.setText("Eliminar");
        eliminar_archvios_duplicados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_archvios_duplicadosActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar_archvios_duplicados, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, -1, -1));

        Mover_duplicado_.setText("Mover");
        Mover_duplicado_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mover_duplicado_ActionPerformed(evt);
            }
        });
        jPanel1.add(Mover_duplicado_, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, -1, -1));

        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 120, 40));

        limpiar_tabal1_.setText("Limpiar");
        limpiar_tabal1_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_tabal1_ActionPerformed(evt);
            }
        });
        jPanel1.add(limpiar_tabal1_, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, -1, -1));

        jButton1.setText("limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, -1, -1));

        Buscador_por_nombre_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscador_por_nombre_ActionPerformed(evt);
            }
        });
        jPanel1.add(Buscador_por_nombre_, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 90, 50));
        jPanel1.add(nombre_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 650, -1));
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1660, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_imagenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_imagenesActionPerformed
         String folderPath = buscar_imagenes.getText().trim();

        if (folderPath.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una ruta de carpeta."+ "Error");
            return;
        }

        File folder = new File(folderPath);
        if (!folder.isDirectory()) {
            JOptionPane.showMessageDialog(this, "La ruta proporcionada no es una carpeta válida."+"Error");
            return;
        }

        File[] files = folder.listFiles();
        if (files == null || files.length == 0) {
            JOptionPane.showMessageDialog(this, "La carpeta está vacía o no se puede acceder."+"Error");
            return;
        }

      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

for (int i = 0; i < files.length; i++) {
    File file = files[i];
    if (file.isFile() && isImageFile(file)) {
        try {
            Metadata metadata = ImageMetadataReader.readMetadata(file);

            String nombre = file.getName();
            String extension = getFileExtension(file);
            String rutaArchivo = file.getAbsolutePath();
            String fechaCreacion = obtenerFechaCreacion(file, dateFormat);
            String fechaModificacion = dateFormat.format(new Date(file.lastModified()));
            String tamano = String.valueOf(file.length() / 1024);

            String nombreAparato = "Desconocido";
            String modeloAparato = "Desconocido";

            ExifIFD0Directory directory = metadata.getFirstDirectoryOfType(ExifIFD0Directory.class);
            if (directory != null) {
                nombreAparato = directory.getString(ExifIFD0Directory.TAG_MAKE);
                modeloAparato = directory.getString(ExifIFD0Directory.TAG_MODEL);
            }

           
            if (nombreAparato == null || modeloAparato == null) {
                ExifSubIFDDirectory subDirectory = metadata.getFirstDirectoryOfType(ExifSubIFDDirectory.class);
                if (subDirectory != null) {
                    if (nombreAparato == null) {
                        nombreAparato = subDirectory.getString(ExifIFD0Directory.TAG_MAKE);
                    }
                    if (modeloAparato == null) {
                        modeloAparato = subDirectory.getString(ExifIFD0Directory.TAG_MODEL);
                    }
                }
            }

            model.addRow(new Object[]{nombre, extension, rutaArchivo, fechaCreacion, fechaModificacion, tamano, nombreAparato, modeloAparato});
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
    }
    


    private String obtenerFechaCreacion(File file, SimpleDateFormat dateFormat) {
        try {
            Path filePath = file.toPath();
            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
            return dateFormat.format(new Date(attrs.creationTime().toMillis()));
        } catch (Exception e) {
            try {
                Metadata metadata = ImageMetadataReader.readMetadata(file);
                ExifSubIFDDirectory directory = metadata.getFirstDirectoryOfType(ExifSubIFDDirectory.class);
                if (directory != null) {
                    Date exifDate = directory.getDate(ExifSubIFDDirectory.TAG_DATETIME_ORIGINAL);
                    if (exifDate != null) {
                        return dateFormat.format(exifDate);
                    }
                }
            } catch (Exception exifException) {
                System.out.println("No se pudo obtener la fecha de creación: " + exifException.getMessage());
            }
        }
        return "Fecha no disponible";
    }

    private boolean isImageFile(File file) {
        String fileName = file.getName().toLowerCase();
        return fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png") || fileName.endsWith(".gif") || fileName.endsWith(".bmp");
    }

    private String getFileExtension(File file) {
        String fileName = file.getName();
        int lastIndexOfDot = fileName.lastIndexOf('.');
        return (lastIndexOfDot == -1) ? "" : fileName.substring(lastIndexOfDot + 1);
    



    }//GEN-LAST:event_boton_imagenesActionPerformed

    private void tamaño_tabla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamaño_tabla1ActionPerformed
         DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

    long tamañoTotalKB = 0;

    
    for (int i = 0; i < modelo.getRowCount(); i++) {
        String tamañoStr = (String) modelo.getValueAt(i, 5); // Columna "Tamaño"
        tamañoStr = tamañoStr.replace(" KB", ""); 
        long tamañoArchivoKB = Long.parseLong(tamañoStr); 
        tamañoTotalKB += tamañoArchivoKB; 
    }


    double tamañoTotalMB = tamañoTotalKB / 1024.0;

    tamaño_tabla_uno.setText(String.format("Tamaño total: %.2f MB", tamañoTotalMB));
    }//GEN-LAST:event_tamaño_tabla1ActionPerformed

    private void imagen_ver_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen_ver_ActionPerformed
          
        
      
    int filaSeleccionada = jTable1.getSelectedRow();
    int filaSeleccionada2 = duplicado_tabla_.getSelectedRow();

    String imagenPath = null;


    if (filaSeleccionada != -1) {
        imagenPath = (String) jTable1.getValueAt(filaSeleccionada, 2); 
    } else if (filaSeleccionada2 != -1) {
        imagenPath = (String) duplicado_tabla_.getValueAt(filaSeleccionada2, 1); 
    }

    if (imagenPath != null) {
        try {
       
            File imgFile = new File(imagenPath);
            if (imgFile.exists()) {
                ImageIcon iconoOriginal = new ImageIcon(imgFile.getAbsolutePath());
                
                Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH);
               
                imagen.setIcon(new ImageIcon(imagenEscalada));
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo cargar la imagen: Archivo no encontrado" +"Error");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "No se pudo cargar la imagen: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
} else {
    JOptionPane.showMessageDialog(this, "Por favor, selecciona una imagen en una de las tablas."+ "Advertencia");
}


    
    }//GEN-LAST:event_imagen_ver_ActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        int cantidadArchivos = modelo.getRowCount();
        candidad1.setText("Cantidad de archivos: " + cantidadArchivos);
 
    }//GEN-LAST:event_cantidadActionPerformed

    private void eliminar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_ActionPerformed
         int filaSeleccionada = jTable1.getSelectedRow();
            if (filaSeleccionada != -1) {
                String rutaArchivo = (String) jTable1.getValueAt(filaSeleccionada, 2); 
                File archivo = new File(rutaArchivo);
            if (archivo.delete()) {
                System.out.println("Archivo eliminado correctamente.");
            } else {
                 System.out.println("No se pudo eliminar el archivo.");
        }
    }
    }//GEN-LAST:event_eliminar_ActionPerformed

    private void mover_tabla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mover_tabla1ActionPerformed
           int filaSeleccionada = jTable1.getSelectedRow(); 
              if (filaSeleccionada != -1) { 
                  String rutaArchivo = (String) jTable1.getValueAt(filaSeleccionada, 2); 
                  File archivo = new File(rutaArchivo); 

       
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Seleccionar carpeta de destino");
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
       
        int seleccion = fileChooser.showOpenDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File carpetaDestino = fileChooser.getSelectedFile(); 
                Path destino = Paths.get(carpetaDestino.getAbsolutePath(), archivo.getName());

            try {
                Files.move(archivo.toPath(), destino, StandardCopyOption.REPLACE_EXISTING); 
                System.out.println("Archivo movido a: " + destino.toString()); 
            } catch (IOException e) {
                e.printStackTrace(); 
            }
        } else {
            System.out.println("Operación de movimiento cancelada."); 
        }
    } else {
        System.out.println("No hay archivo seleccionado para mover."); 
    }
    
        
    }//GEN-LAST:event_mover_tabla1ActionPerformed

    private void archivos_duplicadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivos_duplicadosActionPerformed
        DefaultTableModel modeloOriginal = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel modeloDuplicados = (DefaultTableModel) duplicado_tabla_.getModel();
        modeloDuplicados.setRowCount(0); // Limpiar tabla de duplicados

        HashSet<String> archivosEncontrados = new HashSet<>();
        String rutaEspecifica = "C:\\Users\\Ixtamer"; // Ruta principal para comparación


        explorarCarpeta(new File(rutaEspecifica), archivosEncontrados, modeloDuplicados, modeloOriginal);


        JOptionPane.showMessageDialog(this, "Archivos duplicados detectados y listados.");
}


private void explorarCarpeta(File carpeta, HashSet<String> archivosEncontrados, DefaultTableModel modeloDuplicados, DefaultTableModel modeloOriginal) {
   
    File[] archivos = carpeta.listFiles();

    
    if (archivos != null) {
    for (int j = 0; j < archivos.length; j++) {
        File archivo = archivos[j];
        if (archivo.isDirectory()) {
            explorarCarpeta(archivo, archivosEncontrados, modeloDuplicados, modeloOriginal);
        } else if (archivo.isFile()) {
            if (!archivo.getAbsolutePath().equals(rutaEspecifica)) {
                String claveArchivo = archivo.getName() + archivo.length();

                for (int i = 0; i < modeloOriginal.getRowCount(); i++) {
                    String rutaArchivoTabla = (String) modeloOriginal.getValueAt(i, 2);
                    File archivoTabla = new File(rutaArchivoTabla);

                    
                    if (!rutaArchivoTabla.equals(archivo.getAbsolutePath()) && archivoTabla.length() == archivo.length()) {
                        System.out.println("Comparando: " + archivo.getAbsolutePath() + " con " + rutaArchivoTabla);

                       
                        modeloDuplicados.addRow(new Object[]{
                            archivo.getName(),
                            archivo.getAbsolutePath(),
                            archivo.length()
                        });
                    }
                }

                archivosEncontrados.add(claveArchivo);
            }
        }
    }
} else {
    System.out.println("No se pudo listar archivos en la carpeta: " + carpeta.getAbsolutePath());
}

                            

    }//GEN-LAST:event_archivos_duplicadosActionPerformed

    private void tamaño_duplicadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamaño_duplicadosActionPerformed
       DefaultTableModel modelo = (DefaultTableModel) duplicado_tabla_.getModel();

        long tamañoTotalBytes = 0; 


    for (int i = 0; i < modelo.getRowCount(); i++) {
        Long tamañoArchivoBytes = (Long) modelo.getValueAt(i, 2); 
    
    if (tamañoArchivoBytes != null) { 
        tamañoTotalBytes += tamañoArchivoBytes; 
    }
}


    double tamañoTotalMB = tamañoTotalBytes / (1024.0 * 1024.0);


    tamaño_archivo_duplicado2_.setText(String.format("Tamaño total: %.2f MB", tamañoTotalMB));


    }//GEN-LAST:event_tamaño_duplicadosActionPerformed

    private void cantidad_duplicadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad_duplicadosActionPerformed
         DefaultTableModel modelo = (DefaultTableModel) duplicado_tabla_.getModel();
         int cantidadArchivos = modelo.getRowCount();
          cantidad_duplicados_.setText("Cantidad de archivos: " + cantidadArchivos);
          
    }//GEN-LAST:event_cantidad_duplicadosActionPerformed

    private void eliminar_archvios_duplicadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_archvios_duplicadosActionPerformed
                 int filaSeleccionada = duplicado_tabla_.getSelectedRow();
    if (filaSeleccionada != -1) {
        String rutaArchivo = (String) duplicado_tabla_.getValueAt(filaSeleccionada, 1); 
        File archivo = new File(rutaArchivo);
        if (archivo.delete()) {
            System.out.println("Archivo eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el archivo.");
        }
    }

    }//GEN-LAST:event_eliminar_archvios_duplicadosActionPerformed

    private void Mover_duplicado_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mover_duplicado_ActionPerformed
            int filaSeleccionada = duplicado_tabla_.getSelectedRow(); 
    if (filaSeleccionada != -1) { 
        String rutaArchivo = (String) duplicado_tabla_.getValueAt(filaSeleccionada, 1); 
        File archivo = new File(rutaArchivo); 

       
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar carpeta de destino");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        

        int seleccion = fileChooser.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File carpetaDestino = fileChooser.getSelectedFile(); 
            Path destino = Paths.get(carpetaDestino.getAbsolutePath(), archivo.getName());

            try {
                Files.move(archivo.toPath(), destino, StandardCopyOption.REPLACE_EXISTING); 
                System.out.println("Archivo movido a: " + destino.toString()); 
            } catch (IOException e) {
                e.printStackTrace(); 
            }
        } else {
            System.out.println("Operación de movimiento cancelada."); 
        }
    } else {
        System.out.println("No hay archivo seleccionado para mover."); 
    }
    
    }//GEN-LAST:event_Mover_duplicado_ActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        inicio regresar = new inicio();
        regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void limpiar_tabal1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_tabal1_ActionPerformed
        DefaultTableModel modeloDuplicados = (DefaultTableModel) jTable1.getModel();
         modeloDuplicados.setRowCount(0); // Limpiar tabla de duplicados
    }//GEN-LAST:event_limpiar_tabal1_ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        DefaultTableModel modeloDuplicados = (DefaultTableModel) duplicado_tabla_.getModel();
         modeloDuplicados.setRowCount(0); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Buscador_por_nombre_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscador_por_nombre_ActionPerformed
            String nombreBuscado = nombre_buscar.getText().trim().toLowerCase();
        
        if (nombreBuscado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un texto para buscar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel modeloOriginal = (DefaultTableModel) jTable1.getModel();
        boolean encontrado = false;
        jTable1.clearSelection();

        for (int i = 0; i < modeloOriginal.getRowCount(); i++) {
            String nombreArchivo = (String) modeloOriginal.getValueAt(i, 0);
            if (nombreArchivo != null && nombreArchivo.toLowerCase().contains(nombreBuscado)) {
                jTable1.addRowSelectionInterval(i, i);
                jTable1.scrollRectToVisible(jTable1.getCellRect(i, 0, true));
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "No se encontraron resultados para: " + nombreBuscado);
        }
    }//GEN-LAST:event_Buscador_por_nombre_ActionPerformed

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
            java.util.logging.Logger.getLogger(Imagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Imagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Imagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Imagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Imagenes().setVisible(true);
            }
        });
    }
     private Icon setIcono(String url, JButton boton) {
        
    ImageIcon ico = new ImageIcon(getClass().getResource(url));
    int ancho = boton.getWidth();
    int alto = boton.getHeight();
    ImageIcon icono = new ImageIcon(ico.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
    return icono;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscador_por_nombre_;
    private javax.swing.JButton Mover_duplicado_;
    private javax.swing.JButton archivos_duplicados;
    private javax.swing.JButton boton_imagenes;
    private javax.swing.JTextField buscar_imagenes;
    private javax.swing.JLabel candidad1;
    private javax.swing.JButton cantidad;
    private javax.swing.JButton cantidad_duplicados;
    private javax.swing.JLabel cantidad_duplicados_;
    private javax.swing.JTable duplicado_tabla_;
    private javax.swing.JButton eliminar_;
    private javax.swing.JButton eliminar_archvios_duplicados;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton imagen_ver_;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton limpiar_tabal1_;
    private javax.swing.JButton mover_tabla1;
    private javax.swing.JTextField nombre_buscar;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel tamaño_archivo_duplicado2_;
    private javax.swing.JButton tamaño_duplicados;
    private javax.swing.JButton tamaño_tabla1;
    private javax.swing.JLabel tamaño_tabla_uno;
    // End of variables declaration//GEN-END:variables
}
