/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java.util.ArrayList;



/**
 *
 * @author erick
 */
public class Nodo 
{
    private String tipo;
    private String value;
    private int columna;
    private int linea;    
    private ArrayList<Nodo> hijos = new ArrayList();

    public Nodo() 
    {
        this.value="";
    }

    public Nodo(String tipo, String value, int columna, int linea) {
        this.tipo = tipo;
        this.value = value;
        this.columna = columna;
        this.linea = linea;
    }
     
    
    public void setListaHijos(ArrayList<Nodo> hijos)
    {
        this.hijos = hijos;
    }
    
    
    public Nodo(String value) 
    {
        this.value=value;
        this.tipo = value;
    }
    public Nodo(String value, int id) 
    {
        this.value=value;
        this.linea = id;
        this.tipo=value;
    }
    public Nodo(String value, int id, int x) 
    {
        this.value=value;
        this.linea = id;
        this.tipo=value;
    }    
    public Nodo(String value, Nodo hijo) 
    {
        this.value=value;
        this.tipo=value;        
        this.hijos.add(hijo);
    }    
    
    public Nodo(String tipo, int id, String value) 
    {
        this.tipo=tipo;
        this.value=value;
        this.linea = id;
    }    

    public String getTipo() {
        return tipo;
    }

    public String getValue() {
        return value;
    }

    public int getColumna() {
        return columna;
    }

    public int getLinea() {
        return linea;
    }

    public ArrayList<Nodo> getHijos() {
        return hijos;
    }
    
    public boolean tieneHijos()
    {
        return !this.hijos.isEmpty();
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public void setHijos(ArrayList<Nodo> hijos) {
        this.hijos = hijos;
    }

    
    public void add(Nodo nuevo)
    {
        if(nuevo!=null)
        {
            this.hijos.add(nuevo);
        }
    }
    
    public void addI(Nodo nuevo)
    {
        if(nuevo!=null)
        {
            this.hijos.add(0, nuevo);
        }
    }
    
    public void addLista(Nodo nuevo)
    {
        if(nuevo!=null)
        {
            for(Nodo aux: nuevo.getHijos())
            {
                this.hijos.add(aux);
            }
        }
    }          
}
