package app;

import gui.IniciarSesion;
import gui.Registrarse;
import java.awt.CardLayout;
import java.util.ArrayList;
import model.CodigoDePromocion;
import model.Producto;
import model.Usuario;

public class Fallapop extends javax.swing.JFrame {

    private Usuario usuarioLogeado = null;
    private ArrayList<Usuario> usuariosRegistrados = new ArrayList<>();
    private ArrayList<Producto> catalogo;
    private ArrayList<CodigoDePromocion> codigosDePromocion;
    
    public Fallapop(
        ArrayList<CodigoDePromocion> codigosDePromocion,
        ArrayList<Producto> catalogo
    ) {
        initComponents();

        this.codigosDePromocion = codigosDePromocion;
        this.catalogo = catalogo;
        
        iniciarInterfaz();
    }
    
    CardLayout disposicion;
    
    private void iniciarInterfaz(){
        disposicion = new CardLayout();
        panelPrincipal.setLayout(disposicion);
        
        IniciarSesion iniciarSesion = new IniciarSesion(e -> {
            System.out.println("Se pulso ir a registrar");
            disposicion.show(panelPrincipal, "registrar");
        });
        Registrarse registrarse = new Registrarse(this);
        
        panelPrincipal.add(iniciarSesion, "iniciarSesion");
        panelPrincipal.add(registrarse, "registrarse");
        
        disposicion.show(panelPrincipal, "iniciarSesion");
    }

    public void irRegistrar(){
        disposicion.show(panelPrincipal, "registrar");
        System.out.println("Desde fallapop");
    }

    public void irIniciarSesion(){
        disposicion.show(panelPrincipal, "iniciarSesion");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
