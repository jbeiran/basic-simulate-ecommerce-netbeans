package gui;

import java.awt.CardLayout;

import app.Fallapop;
import model.Monedero;
public class MenuPrincipal extends javax.swing.JPanel {

    private static final String NAVEGADOR = "navegador";
    private static final String CATALOGO = "catalogo";

    private Fallapop fallapop;

    public MenuPrincipal(Fallapop fallapop) {
        initComponents();

        this.fallapop = fallapop;

        iniciarInterfaz();
    }

    private CardLayout disposicion;

    public void iniciarInterfaz(){
        botonCerrarSesion.addActionListener(e -> {
            fallapop.cerrarSesion();
        });

        disposicion = new CardLayout();
        subPanel.setLayout(disposicion);

        Catalogo catalogo = new Catalogo(fallapop);

        subPanel.add(catalogo, CATALOGO);

        disposicion.show(subPanel, CATALOGO);
    }

    public void configurar(){
        Monedero monedero = fallapop.getUsuarioLogeado().getMonedero();
        etiquetaSaldo.setText("Saldo: " + monedero.getSaldo() + " €");
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
        etiquetaSaldo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();
        subPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
        jPanel1.add(etiquetaSaldo);

        jButton1.setText("Menú principal");
        jPanel1.add(jButton1);

        botonCerrarSesion.setText("Cerrar sesión");
        jPanel1.add(botonCerrarSesion);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout subPanelLayout = new javax.swing.GroupLayout(subPanel);
        subPanel.setLayout(subPanelLayout);
        subPanelLayout.setHorizontalGroup(
            subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        subPanelLayout.setVerticalGroup(
            subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(subPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JLabel etiquetaSaldo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel subPanel;
    // End of variables declaration//GEN-END:variables
}