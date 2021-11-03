package controllers;

import java.util.ArrayList;

abstract class BaseController<T>{
    ArrayList<T> lista;

    public BaseController(){
        lista = new ArrayList<T>();
    }

    /* CRUD */ 
    public void create(T obj){
        lista.add(obj);
    }

    public ArrayList<T> read(){
        return this.lista;
    }

    public void update(T obj){
        if(this.lista.contains(obj)){
            lista.remove(obj);
            lista.add(obj);
        }
    }

    public void delete(T obj){
        lista.remove(obj);
    }
}
