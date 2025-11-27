package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

import model.RepoTareas;

public class Interfaz extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu menu, submenu;
    JMenuItem menuItem1, menuItem2, menuItem3;
    
JRadioButtonMenuItem rbMenuItem;
JCheckBoxMenuItem cbMenuItem;

    public Interfaz() {
        JPanel ta = new JPanel();
        
        this.menuBar = new JMenuBar();
     


       

        // Build the first menu.
        menu = new JMenu("A Menu");
        menuBar.add(menu);


        menuItem1= new JMenuItem();
        menuItem1.setText("Listar todas las tareas");

        

    


        menuItem2= new JMenuItem();
        menuItem2.setText("Crear nueva tarea");

        menuItem3= new JMenuItem();
        menuItem3.setText("Marcar tarea como completada");

        
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 600);
        this.setLocationRelativeTo(ta);


        
        this.add(ta);
        this.add(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()== menuItem1) {
            RepoTareas rp= RepoTareas.getInstance();
            rp.agregar(null);   
        }
        
    }

    /*
     * public static void main(String[] args) {
     * //Schedule a job for the event-dispatching thread:
     * //creating and showing this application's GUI.
     * javax.swing.SwingUtilities.invokeLater(new Runnable() {
     * public void run() {
     * Interfaz gui = new Interfaz();
     * }
     * });
     * }
     */

}
