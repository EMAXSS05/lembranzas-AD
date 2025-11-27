package model;

import java.util.List;

public class RepoTareas {
    private static RepoTareas instance;
    List<Tarea> listaTareas;

    private RepoTareas(){}


    public List<Tarea> obtenerTodas(){
        return listaTareas;
    }

    public Tarea obtenerPorId(int id){

        for(int i=0; i< listaTareas.size() ;i++){
            if (listaTareas.get(i).equals(id)) {
                return listaTareas.get(i);
            }

        }
        return null;
       
    }

    public void agregar(Tarea t){
        listaTareas.add(t);

    }

   public boolean eliminarTarea(int id) {
        for(int i=0; i< listaTareas.size();i++ ){
             if (listaTareas.get(i).equals(id)) {
                return listaTareas.remove(id);
            }
        }
    }

    public void marcarCompletada(int id){}

    public static RepoTareas getInstance() {
        if (instance== null) {
            synchronized(RepoTareas.class){
                if (instance == null) {
                    instance =new RepoTareas();
                }
            }
        }
        return instance;
    } 


    
    


}
