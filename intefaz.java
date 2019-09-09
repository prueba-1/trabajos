
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Junior Saúl
 */
public class intefaz extends JFrame implements  ActionListener{
    JPanel panelgeneral;
    JTextField txtnombre;
    JLabel lblnombre;
    JLabel lblfacultad;
    JTextField txtfacultad;
    JLabel lblopcion;
    JComboBox<String> comboopcion;
    JButton btnprocesar;
    
    
    public intefaz (){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(400,100,600,400);
        
        panelgeneral = new JPanel();
        panelgeneral.setLayout(null);
        setContentPane(panelgeneral);
        
        lblnombre= new JLabel("INGRESE EL NOMBRE DE LA UNIVERSIDAD:");
        lblnombre.setBounds(20,20,240,20);
        panelgeneral.add(lblnombre);
        
        txtnombre = new JTextField();
        txtnombre.setBounds(280,20,220,20);
        panelgeneral.add(txtnombre);
        
        lblfacultad= new JLabel("NOMBRE DE LA FACULTAD:");
        lblfacultad.setBounds(20,60,220,20);
        panelgeneral.add(lblfacultad);
        
        txtfacultad= new JTextField();
        txtfacultad.setBounds(240,60,180,20);
        panelgeneral.add(txtfacultad);
        
        lblopcion = new JLabel("SELECCIONAR LA SIGUIENTE OPCION:");
        lblopcion.setBounds(20,90,220,20);
        panelgeneral.add(lblopcion);
        comboopcion = new JComboBox<>();
        comboopcion.addItem("seleccione una opcion:");
        comboopcion.addItem("DOCENTE");
        comboopcion.addItem("EMPLEADO");
        comboopcion.setBounds(240,90,150,20);
        panelgeneral.add(comboopcion);
        
        btnprocesar = new JButton("PROCESAR");
        btnprocesar.setBounds(300,180,100,40);
        btnprocesar.addActionListener(this);
        panelgeneral.add(btnprocesar);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnprocesar) {
            if (txtfacultad.getText().equals("")|| txtnombre.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "rellene todos los campos porfavor");
            }
            switch (comboopcion.getSelectedIndex()){
                case 0: JOptionPane.showMessageDialog(null, "seleccione una opcion porfavor");
                        break;
                case 1: JOptionPane.showMessageDialog(null, "se a ingresado a docente!!!");
                        break;
                case 2: JOptionPane.showMessageDialog(null, "se a ingresaro a empleado!!");
                        break;
            }
            
        }
        
    }
    public static void main(String[] args) {
        intefaz in = new intefaz();
        in.setVisible(true);
        
    }
}
