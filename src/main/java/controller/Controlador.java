package controller;

import java.util.ArrayList;
import java.util.List;

import model.RepoTareas;
import model.Tarea;
import view.Interfaz;

public class Controlador {
    public static void main(String[] args) {
        Tarea t1= new Tarea(1, "tarea1", null, false);
        Tarea t2= new Tarea(2, "tarea2", null, false);
        Tarea t3= new Tarea(3, "Tarea3", null, false);

        ArrayList<Tarea> lista= new ArrayList<>();
        lista.add(t1);
        lista.add(t2);
        lista.add(t3);

        System.out.println(lista);

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                Interfaz gui = new Interfaz();
                }
            });
    
        
        
        



    }

}
