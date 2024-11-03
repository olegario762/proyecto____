import java.awt.Image;
import java.io.File;
import java.util.HashSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;

import javax.swing.table.DefaultTableModel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;












public class Musica extends javax.swing.JFrame {
    
   
   
    
   
    private FileInputStream fileInputStream;
    
    private Player player; // Instancia del reproductor de música
    private boolean isPaused = false; // Estado de la música
    private int indiceActual=0; 
    private String rutaArchivoActual;
    
   
    
    
    
  
   
     

    /**
     * Creates new form Musica
     */
    public Musica() {
        
        initComponents();
        ImageIcon Labe1 = new ImageIcon(getClass().getResource("/imagnes/ññ.png/"));
      
        
        
        Icon fondo1 = new ImageIcon(Labe1.getImage().getScaledInstance(ordenar.getWidth(), ordenar.getHeight(), Image.SCALE_DEFAULT));
        
        
        ordenar.setIcon(fondo1);
       
        
        //botones
        jButton1.setIcon(setIcono("/imagnes/buscar.png", jButton1));
        jButton4.setIcon(setIcono("/imagnes/atras.png", jButton1));
        Buscar_por_nombre.setIcon(setIcono("/imagnes/buscar.png", Buscar_por_nombre));
        play_stop.setIcon(setIcono("/imagnes/reproducir.png", play_stop));
        musica_atras.setIcon(setIcono("/imagnes/atras_1.png", musica_atras));
        adelante.setIcon(setIcono("/imagnes/adelante.png", adelante));
        musica_atras1.setIcon(setIcono("/imagnes/dos.png", musica_atras1));
        
        
         
        
        
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextRuta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Cantidad_Archivos = new javax.swing.JButton();
        Tamaño_archivos = new javax.swing.JButton();
        tamaño = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        duplicados = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Buscar_por_nombre = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        agregar_lista = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        play_stop = new javax.swing.JButton();
        adelante = new javax.swing.JButton();
        musica_atras = new javax.swing.JButton();
        musica_atras1 = new javax.swing.JButton();
        eliminar_tabla1 = new javax.swing.JButton();
        eliminar_tabla_dos = new javax.swing.JButton();
        archivos_mas_pesados = new javax.swing.JButton();
        mover_tablauno = new javax.swing.JButton();
        mover_tabla_2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ordenar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, 50));
        jPanel1.add(jTextRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 620, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Del Archivo", "Extension", "Artista", "Albúm", "Género ", "Duracion", "Año", "Ruta ", "Tamaño"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(24);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(590);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(190);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(190);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(230);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(260);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(200);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1320, 230));

        Cantidad_Archivos.setText("Cantidad de los archivos");
        Cantidad_Archivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cantidad_ArchivosActionPerformed(evt);
            }
        });
        jPanel1.add(Cantidad_Archivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 170, 40));

        Tamaño_archivos.setText("Tamaño de los Archivos");
        Tamaño_archivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tamaño_archivosActionPerformed(evt);
            }
        });
        jPanel1.add(Tamaño_archivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 170, 40));

        tamaño.setBackground(new java.awt.Color(255, 255, 255));
        tamaño.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        tamaño.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 300, 80));

        c.setBackground(new java.awt.Color(255, 255, 255));
        c.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        c.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 350, 110));

        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 190, 70));

        duplicados.setText("Archivos Duplicados");
        duplicados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duplicadosActionPerformed(evt);
            }
        });
        jPanel1.add(duplicados, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 340, 150, 50));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nombre archivo", "Ruta"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 700, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IINGRESAR UN URL PARA INGRESAR TU MUSICA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 440, 40));

        Buscar_por_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_por_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(Buscar_por_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 80, 50));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 530, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSCADOR DE MUSICA POR NOMBRE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 360, 50));

        jButton6.setText("Limpiar ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 620, 130, 40));

        agregar_lista.setText("Agregar a la lista");
        agregar_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_listaActionPerformed(evt);
            }
        });
        jPanel1.add(agregar_lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 170, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Play List Y Archivos Duplicados");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 310, 30));

        play_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_stopActionPerformed(evt);
            }
        });
        jPanel1.add(play_stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 600, 80, 50));

        adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adelanteActionPerformed(evt);
            }
        });
        jPanel1.add(adelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 600, 80, 50));

        musica_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musica_atrasActionPerformed(evt);
            }
        });
        jPanel1.add(musica_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 600, 80, 50));

        musica_atras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musica_atras1ActionPerformed(evt);
            }
        });
        jPanel1.add(musica_atras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 600, 80, 50));

        eliminar_tabla1.setText("Eliminar");
        eliminar_tabla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_tabla1ActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar_tabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 140, 40));

        eliminar_tabla_dos.setText("Eliminar");
        eliminar_tabla_dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_tabla_dosActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar_tabla_dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 130, 40));

        archivos_mas_pesados.setText("Ordenar por mas pesados");
        archivos_mas_pesados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivos_mas_pesadosActionPerformed(evt);
            }
        });
        jPanel1.add(archivos_mas_pesados, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 340, 180, 40));

        mover_tablauno.setText("Mover");
        mover_tablauno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mover_tablaunoActionPerformed(evt);
            }
        });
        jPanel1.add(mover_tablauno, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 100, 40));

        mover_tabla_2.setText("Mover");
        mover_tabla_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mover_tabla_2ActionPerformed(evt);
            }
        });
        jPanel1.add(mover_tabla_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, 100, 40));

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 340, -1, 50));
        jPanel1.add(ordenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 1670, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String ruta = jTextRuta.getText();


    if (ruta.isEmpty()) {
        JOptionPane.showMessageDialog(this, "La ruta no puede estar vacía", "Error", JOptionPane.ERROR_MESSAGE);
    return;
    }

    File carpeta = new File(ruta);

    if (carpeta.exists() && carpeta.isDirectory()) {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);

    buscarArchivosEnCarpeta(carpeta, modelo);

    } else {
    JOptionPane.showMessageDialog(this, "Ruta inválida o no es un directorio", "Error", JOptionPane.ERROR_MESSAGE);
    }
        }

    private void buscarArchivosEnCarpeta(File carpeta, DefaultTableModel modelo) {
    File[] archivos = carpeta.listFiles();
    if (archivos != null) {
        for (int i = 0; i < archivos.length; i++) {
            File archivo = archivos[i];
            if (archivo.isDirectory()) {
                buscarArchivosEnCarpeta(archivo, modelo);  // Llamada recursiva para subcarpetas
            } else {
                if (archivo.getName().endsWith(".mp3") || archivo.getName().endsWith(".wma")) {
                    agregarArchivoAModelo(archivo, modelo);
                }
            }
        }
    }
}


    private void agregarArchivoAModelo(File archivo, DefaultTableModel modelo) {
        try {
            AudioFile audioFile = AudioFileIO.read(archivo);
            Tag tag = audioFile.getTag();
            String nombre = tag.getFirst(FieldKey.TITLE);
            String artista = tag.getFirst(FieldKey.ARTIST);
            String album = tag.getFirst(FieldKey.ALBUM);
            String genero = tag.getFirst(FieldKey.GENRE);
            String duracion = String.valueOf(audioFile.getAudioHeader().getTrackLength());
            String año = tag.getFirst(FieldKey.YEAR);
            String ruta = archivo.getAbsolutePath();
            String tamaño = String.valueOf(archivo.length());
            
            if (artista.isEmpty()) artista = "Desconocido";
        if (album.isEmpty()) album = "Desconocido";
        if (genero.isEmpty()) genero = "Desconocido";
        if (año.isEmpty()) año = "Desconocido";

           
            modelo.addRow(new Object[]{nombre, archivo.getName().substring(archivo.getName().lastIndexOf('.') + 1), artista, album, genero, duracion, año, ruta, tamaño});
        } catch (CannotReadException | IOException | TagException | ReadOnlyFileException | InvalidAudioFrameException e) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + archivo.getName(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    
}
   private void reproducirMusica(String rutaArchivo) {
    try {
        if (player != null) {
            player.close(); // Detener el reproductor si ya esta en uso
        }
        player = new Player(new FileInputStream(rutaArchivo));
        rutaArchivoActual = rutaArchivo;

       
        new Thread(() -> {
            try {
                player.play(); // Reproducir la musica
                
                while (!player.isComplete()) {
                    Thread.sleep(100); // Espera el tiempo
                }
            } catch (JavaLayerException | InterruptedException e) {
            } finally {
                player.close(); // cerramos el reproducor
              
                siguienteMusica();
            }
        }).start();

    } catch (FileNotFoundException | JavaLayerException e) {
        e.printStackTrace();
    }
}



   
    private void pausarOReanudarMusica() {
        if (player != null) {
            if (isPaused) {
                
                reproducirMusica(rutaArchivoActual); 
                isPaused = false;
            } else {
                // Pausar
                player.close(); 
                isPaused = true;
            }
        }
    }

   
    private void reproducirCancionSeleccionada() {
        int filaSeleccionada = jTable2.getSelectedRow();
        if (filaSeleccionada != -1) { 
            String rutaArchivo = (String) jTable2.getValueAt(filaSeleccionada, 1);
            reproducirMusica(rutaArchivo);
            indiceActual = filaSeleccionada; 
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecciona una canción de la lista.");
        }
    }

   
    public void siguienteMusica() {
    if (jTable2.getRowCount() > 0) {
        if (indiceActual < jTable2.getRowCount() - 1) {
            indiceActual++; // Avanzar 
        } else {
            indiceActual = 0; // Volver al inicio 
        }

       
        jTable2.setRowSelectionInterval(indiceActual, indiceActual);

        
        String ruta = (String) jTable2.getValueAt(indiceActual, 1);
        reproducirMusica(ruta); 
    }
}

    
    public void anteriorMusica() {
        if (jTable2.getRowCount() > 0) {
            if (indiceActual > 0) {
                indiceActual--; // Retroceder 
            } else {
                indiceActual = jTable2.getRowCount() - 1; // Volver al final 
            }

            
            jTable2.setRowSelectionInterval(indiceActual, indiceActual);

           
            String ruta = (String) jTable2.getValueAt(indiceActual, 1);
            reproducirMusica(ruta); 
        }
    }

        private void eliminarArchivo() {
    int filaSeleccionada = jTable1.getSelectedRow();
    if (filaSeleccionada != -1) {
        String rutaArchivo = (String) jTable1.getValueAt(filaSeleccionada, 7); 
        File archivo = new File(rutaArchivo);
        if (archivo.delete()) {
            System.out.println("Archivo eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el archivo.");
        }
    }
        

        


    





       
            
        
      



    }//GEN-LAST:event_jButton1ActionPerformed

    private void Cantidad_ArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cantidad_ArchivosActionPerformed
       
         
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        int cantidadArchivos = modelo.getRowCount();
        c.setText("Cantidad de archivos: " + cantidadArchivos);

        
    
    }//GEN-LAST:event_Cantidad_ArchivosActionPerformed

    private void Tamaño_archivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tamaño_archivosActionPerformed
          DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    long tamañoTotal = 0;


    for (int i = 0; i < modelo.getRowCount(); i++) {
        
        tamañoTotal += Long.parseLong((String) modelo.getValueAt(i, 8)); 
    }

   
    double tamañoTotalMB = tamañoTotal / 1048576.0; //Se divide tamañoTotal por 1048576.0 que es el número de bytes en un megabyte


    tamaño.setText(String.format("Tamaño total: %.2f MB", tamañoTotalMB)); // Formatea el texto, mostrando el tamaño total con dos decimales. 
    //%.2f es un especificador de formato que indica que se deben mostrar dos cifras decimales.
   
    
    }//GEN-LAST:event_Tamaño_archivosActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        inicio regresar = new inicio();
        regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void duplicadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duplicadosActionPerformed
        
    
        DefaultTableModel modeloOriginal = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel modeloDuplicados = (DefaultTableModel) jTable2.getModel();
        modeloDuplicados.setRowCount(0); 

        HashSet<String> archivosEncontrados = new HashSet<>();
        String rutaEspecifica = "C:\\Users\\Ixtamer"; 


        explorarCarpeta(new File(rutaEspecifica), archivosEncontrados, modeloDuplicados, modeloOriginal, rutaEspecifica);

        JOptionPane.showMessageDialog(this, "Archivos duplicados detectados y listados.");
}

private void explorarCarpeta(File carpeta, HashSet<String> archivosEncontrados, DefaultTableModel modeloDuplicados, DefaultTableModel modeloOriginal, String rutaEspecifica) {
    
    File[] archivos = carpeta.listFiles();
    
    if (archivos != null) {
        
        for (int j = 0; j < archivos.length; j++) {
            File archivo = archivos[j];
            if (archivo.isDirectory()) {
                explorarCarpeta(archivo, archivosEncontrados, modeloDuplicados, modeloOriginal, rutaEspecifica);
            } else if (archivo.isFile()) {
                if (!archivo.getAbsolutePath().equals(rutaEspecifica)) {
                   
                    String claveArchivo = archivo.getName() + archivo.length(); // Clave de comparación: nombre y tamaño

                    for (int i = 0; i < modeloOriginal.getRowCount(); i++) {
                        String rutaArchivoTabla = (String) modeloOriginal.getValueAt(i, 7); // Ruta del archivo en la tabla
                        File archivoTabla = new File(rutaArchivoTabla);
                        
                       
                        if (!rutaArchivoTabla.equals(archivo.getAbsolutePath()) && archivoTabla.length() == archivo.length()) {
                            System.out.println("Comparando: " + archivo.getAbsolutePath() + " con " + rutaArchivoTabla);

                         
                            modeloDuplicados.addRow(new Object[]{
                                archivo.getName(), 
                                archivo.getAbsolutePath() 
                            });
                        }
                    }

                    archivosEncontrados.add(claveArchivo); // Guardar archivo para futuras comparaciones
                }
            }
        }
    }

 
        
        
    }//GEN-LAST:event_duplicadosActionPerformed

    private void Buscar_por_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_por_nombreActionPerformed
          String nombreBuscado = jTextField1.getText().trim().toLowerCase();
        
        if (nombreBuscado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un texto para buscar."+ "Error");
            return;
        }

        DefaultTableModel modeloOriginal = (DefaultTableModel) jTable1.getModel();
        boolean encontrado = false;//para ver si se encuentra un archivo
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
         
    }//GEN-LAST:event_Buscar_por_nombreActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DefaultTableModel modeloDuplicados = (DefaultTableModel) jTable2.getModel();
        modeloDuplicados.setRowCount(0); // Limpiar tabla de duplicados
    }//GEN-LAST:event_jButton6ActionPerformed

    private void agregar_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_listaActionPerformed
            DefaultTableModel modeloOriginal = (DefaultTableModel) jTable1.getModel();
    
            DefaultTableModel modeloPlaylist = (DefaultTableModel) jTable2.getModel();

  
            int filaSeleccionada = jTable1.getSelectedRow();

  
            if (filaSeleccionada != -1) {
            String nombreCancion = (String) modeloOriginal.getValueAt(filaSeleccionada, 0);
            String direccion = (String) modeloOriginal.getValueAt(filaSeleccionada, 7);

     
            modeloPlaylist.addRow(new Object[]{nombreCancion,  direccion});
    } else {
        // Mostrar un mensaje si no se ha seleccionado ninguna fila
        JOptionPane.showMessageDialog(this, "Por favor, seleccione una canción para agregar a la playlist."+ "Error");
    }
    
    

    }//GEN-LAST:event_agregar_listaActionPerformed

    private void play_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_stopActionPerformed
          reproducirCancionSeleccionada();
    
   
    }//GEN-LAST:event_play_stopActionPerformed

    private void adelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adelanteActionPerformed
       siguienteMusica();
    }//GEN-LAST:event_adelanteActionPerformed

    private void musica_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musica_atrasActionPerformed
       anteriorMusica();
    }//GEN-LAST:event_musica_atrasActionPerformed

    private void musica_atras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musica_atras1ActionPerformed
        pausarOReanudarMusica();
    }//GEN-LAST:event_musica_atras1ActionPerformed

    private void eliminar_tabla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_tabla1ActionPerformed
        
    int filaSeleccionada = jTable1.getSelectedRow();
    if (filaSeleccionada != -1) {
        String rutaArchivo = (String) jTable1.getValueAt(filaSeleccionada, 7); 
        File archivo = new File(rutaArchivo);
        if (archivo.delete()) {
            System.out.println("Archivo eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el archivo.");
        
    }
}
    }//GEN-LAST:event_eliminar_tabla1ActionPerformed

    private void eliminar_tabla_dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_tabla_dosActionPerformed
         
            int filaSeleccionada = jTable2.getSelectedRow();
    if (filaSeleccionada != -1) {
        String rutaArchivo = (String) jTable2.getValueAt(filaSeleccionada, 1); 
        File archivo = new File(rutaArchivo);
        if (archivo.delete()) {
            System.out.println("Archivo eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el archivo.");
        }
    }

    }//GEN-LAST:event_eliminar_tabla_dosActionPerformed

    private void archivos_mas_pesadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivos_mas_pesadosActionPerformed
       
    }//GEN-LAST:event_archivos_mas_pesadosActionPerformed

    private void mover_tablaunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mover_tablaunoActionPerformed
        
    int filaSeleccionada = jTable1.getSelectedRow(); 
    if (filaSeleccionada != -1) { 
        String rutaArchivo = (String) jTable1.getValueAt(filaSeleccionada, 7);
        File archivo = new File(rutaArchivo);

    
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar carpeta de destino");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);//solo carpeta 
        

        int seleccion = fileChooser.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File carpetaDestino = fileChooser.getSelectedFile();
            Path destino = Paths.get(carpetaDestino.getAbsolutePath(), archivo.getName());

            try {
                Files.move(archivo.toPath(), destino, StandardCopyOption.REPLACE_EXISTING); 
                System.out.println("Archivo movido a: " + destino.toString());
            } catch (IOException e) {
                e.printStackTrace(); //error 
            }
        } else {
            System.out.println("Operación de movimiento cancelada."); 
        }
    } else {
        System.out.println("No hay archivo seleccionado para mover."); 
    }

    



    }//GEN-LAST:event_mover_tablaunoActionPerformed

    private void mover_tabla_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mover_tabla_2ActionPerformed
        
    int filaSeleccionada = jTable2.getSelectedRow(); 
    if (filaSeleccionada != -1) { 
        String rutaArchivo = (String) jTable2.getValueAt(filaSeleccionada, 1); 
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
                e.printStackTrace(); // eror
            }
        } else {
            System.out.println("Operación de movimiento cancelada."); 
        }
    } else {
        System.out.println("No hay archivo seleccionado para mover."); 
    }
    

    }//GEN-LAST:event_mover_tabla_2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         DefaultTableModel modeloDuplicados = (DefaultTableModel) jTable1.getModel();
    modeloDuplicados.setRowCount(0); // Limpiar tabla de duplicados
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
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
            java.util.logging.Logger.getLogger(Musica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Musica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Musica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Musica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
         new Musica().setVisible(true);
        });
    }
    private Icon setIcono(String url, JButton boton) {
        
    ImageIcon ico = new ImageIcon(getClass().getResource(url));
    int ancho = boton.getWidth();
    int alto = boton.getHeight();
    return new ImageIcon(ico.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar_por_nombre;
    private javax.swing.JButton Cantidad_Archivos;
    private javax.swing.JButton Tamaño_archivos;
    private javax.swing.JButton adelante;
    private javax.swing.JButton agregar_lista;
    private javax.swing.JButton archivos_mas_pesados;
    private javax.swing.JLabel c;
    private javax.swing.JButton duplicados;
    private javax.swing.JButton eliminar_tabla1;
    private javax.swing.JButton eliminar_tabla_dos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextRuta;
    private javax.swing.JButton mover_tabla_2;
    private javax.swing.JButton mover_tablauno;
    private javax.swing.JButton musica_atras;
    private javax.swing.JButton musica_atras1;
    private javax.swing.JLabel ordenar;
    private javax.swing.JButton play_stop;
    private javax.swing.JLabel tamaño;
    // End of variables declaration//GEN-END:variables

   

    

    


    
}
