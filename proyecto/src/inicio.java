
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ixtamer
 */
public class inicio extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public inicio() {
        initComponents();
        
        
        
        ///fondo label
        ImageIcon labe = new ImageIcon(getClass().getResource("/imagnes/ññ.png"));
        ImageIcon labe1 = new ImageIcon(getClass().getResource("/imagnes/logtipo.png"));
        ImageIcon labe2 = new ImageIcon(getClass().getResource("/imagnes/123.png"));
        ImageIcon labe3 = new ImageIcon(getClass().getResource("/imagnes/barra.png"));
        ImageIcon labe4 = new ImageIcon(getClass().getResource("/imagnes/vino.png"));
        ImageIcon labe5 = new ImageIcon(getClass().getResource("/imagnes/re.png"));
        ImageIcon labe6 = new ImageIcon(getClass().getResource("/imagnes/saje.png"));
        ImageIcon labe7 = new ImageIcon(getClass().getResource("/imagnes/KK.png"));
        ImageIcon labe8 = new ImageIcon(getClass().getResource("/imagnes/KK.png"));
        ImageIcon labe9 = new ImageIcon(getClass().getResource("/imagnes/KK.png"));
        ImageIcon labe10 = new ImageIcon(getClass().getResource("/imagnes/KK.png"));
        ImageIcon labe11 = new ImageIcon(getClass().getResource("/imagnes/KK.png"));
        ImageIcon labe12 = new ImageIcon(getClass().getResource("/imagnes/KK.png"));
        ImageIcon labe13 = new ImageIcon(getClass().getResource("/imagnes/KK.png"));
        
       
       
        
        
        Icon fondo1 = new  ImageIcon(labe.getImage().getScaledInstance(la.getWidth(), la.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo2 = new  ImageIcon(labe1.getImage().getScaledInstance(a.getWidth(), a.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo3 = new  ImageIcon(labe2.getImage().getScaledInstance(label3.getWidth(), label3.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo4 = new  ImageIcon(labe3.getImage().getScaledInstance(lavel.getWidth(), lavel.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo5 = new  ImageIcon(labe4.getImage().getScaledInstance(uno.getWidth(), uno.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo6 = new  ImageIcon(labe5.getImage().getScaledInstance(dos.getWidth(), dos.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo7 = new  ImageIcon(labe6.getImage().getScaledInstance(tres.getWidth(), tres.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo8 = new  ImageIcon(labe7.getImage().getScaledInstance(LAB4.getWidth(), LAB4.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo9= new  ImageIcon(labe8.getImage().getScaledInstance(oo2.getWidth(), oo2.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo10= new  ImageIcon(labe9.getImage().getScaledInstance(wwwww.getWidth(), wwwww.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo11= new  ImageIcon(labe10.getImage().getScaledInstance(aa1.getWidth(), aa1.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo12= new  ImageIcon(labe11.getImage().getScaledInstance(wwwww1.getWidth(), wwwww1.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo13= new  ImageIcon(labe12.getImage().getScaledInstance(wwwww2.getWidth(), wwwww2.getHeight(), Image.SCALE_DEFAULT));
        Icon fondo14= new  ImageIcon(labe13.getImage().getScaledInstance(wwwww3.getWidth(), wwwww3.getHeight(), Image.SCALE_DEFAULT));
        
        
         la.setIcon(fondo1);
         a.setIcon(fondo2);
         label3.setIcon(fondo3);
         lavel.setIcon(fondo4);
         uno.setIcon(fondo5);
         dos.setIcon(fondo6);
         tres.setIcon(fondo7);
         LAB4.setIcon(fondo8);
         oo2.setIcon(fondo9);
         wwwww.setIcon(fondo10);
         aa1.setIcon(fondo11);
         wwwww1.setIcon(fondo12);
         wwwww2.setIcon(fondo13);
         wwwww3.setIcon(fondo14);
        
         this.repaint();
         //wwwww1
       
         
         //botonoes con imagenes
         
         btn1.setIcon(setIcono("/imagnes/musica.png", btn1));
         boton2.setIcon(setIcono("/imagnes/ima.png", boton2));
         boton3.setIcon(setIcono("/imagnes/video.png", boton3));
       
        

        
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
        a = new javax.swing.JLabel();
        Musica = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        label3 = new javax.swing.JLabel();
        lavel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        uno = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        dos = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tres = new javax.swing.JLabel();
        LAB4 = new javax.swing.JLabel();
        oo2 = new javax.swing.JLabel();
        wwwww = new javax.swing.JLabel();
        aa1 = new javax.swing.JLabel();
        wwwww1 = new javax.swing.JLabel();
        wwwww2 = new javax.swing.JLabel();
        wwwww3 = new javax.swing.JLabel();
        la = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 180));

        Musica.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        Musica.setText("MUSICA");
        Musica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicaActionPerformed(evt);
            }
        });
        jPanel1.add(Musica, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 230, 90));

        jButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jButton3.setText("IMAGENES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 230, 90));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jButton1.setText("VIDEO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 100, 230, 90));

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.controlLtHighlight);
        jLabel1.setText("MediaFusion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 380, 70));

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 220, 110));

        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        jPanel1.add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 220, 110));

        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        jPanel1.add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 220, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 80));
        jPanel2.add(lavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 100, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 240, 100));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 90));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 110, 130));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 110));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 110, 130));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 530, 180));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 530, 260));
        jPanel1.add(LAB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 550, 290, 150));
        jPanel1.add(oo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 550, 290, 150));
        jPanel1.add(wwwww, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 570, 280, 130));
        jPanel1.add(aa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 570, 280, 130));
        jPanel1.add(wwwww1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, 280, 130));
        jPanel1.add(wwwww2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 280, 130));
        jPanel1.add(wwwww3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 280, 130));
        jPanel1.add(la, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -140, 1670, 910));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        Musica cambio= new Musica();
        cambio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        Imagenes cambio = new Imagenes();
        cambio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton2ActionPerformed

    private void MusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicaActionPerformed
        Musica cambio= new Musica();
        cambio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MusicaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Video cambio = new Video();
         cambio.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
       Video cambio = new Video();
       cambio.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_boton3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Imagenes cambio = new Imagenes();
        cambio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new inicio().setVisible(true);
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
    private javax.swing.JLabel LAB4;
    private javax.swing.JButton Musica;
    private javax.swing.JLabel a;
    private javax.swing.JLabel aa1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton btn1;
    private javax.swing.JLabel dos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel la;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel lavel;
    private javax.swing.JLabel oo2;
    private javax.swing.JLabel tres;
    private javax.swing.JLabel uno;
    private javax.swing.JLabel wwwww;
    private javax.swing.JLabel wwwww1;
    private javax.swing.JLabel wwwww2;
    private javax.swing.JLabel wwwww3;
    // End of variables declaration//GEN-END:variables

   
}
