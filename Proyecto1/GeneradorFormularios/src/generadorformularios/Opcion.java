/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorformularios;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author erick
 */
public class Opcion 
{
    public String nombre_lista = "";
    public String nombre = "";
    public String etiqueta = "";
    public String multimedia = "";
    public int columna = 0;
    public int fila = 0;
    public static Hashtable<String, Integer> posicionesColumnas= new Hashtable<String, Integer>();
    public Opcion()
    {
        
    }

    public String getNombre_lista() {
        return nombre_lista;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public String getMultimedia() {
        return multimedia;
    }

    public void setNombre_lista(String nombre_lista) {
        this.nombre_lista = nombre_lista;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setMultimedia(String multimedia) {
        this.multimedia = multimedia;
    }

    public int getColumna() {
        return columna;
    }

    public int getFila() {
        return fila;
    }

    public static Hashtable<String, Integer> getPosicionesColumnas() {
        return posicionesColumnas;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public static void setPosicionesColumnas(Hashtable<String, Integer> posicionesColumnas) {
        Opcion.posicionesColumnas = posicionesColumnas;
    }
    
    
    
    public ArrayList<Error> verificarErrores(int fila)
    {
       ArrayList<Error> errores  = new ArrayList();        
        if(getNombre_lista().equals("")){errores.add(new Error("Esta celda no debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("nombre_lista")), "Sintactico"));}
        if(getEtiqueta().equals("")){errores.add(new Error("Esta celda no debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("etiqueta")), "Sintactico"));}            
        if(getNombre().equals("")){errores.add(new Error("Esta celda no debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("nombre")), "Sintactico"));}         
       return errores;
    }    
    
                            
    public void insertarAtributo(String tipo, String valor)
    {
        switch(tipo.toLowerCase())
        {
            case "nombre_lista":
                this.setNombre_lista(valor);
                break;
            case "nombre":
                this.setNombre(valor);
                break;
            case "etiqueta":
                this.setEtiqueta(valor);
                break;
            case "multimedia":
                this.setMultimedia(valor);
                break;                
        }    
    }
    
    public String getData()
    {
        String data= ""; 
        data+="\t<opcion>\n";
        data+="\t\t<nombre_lista>"+this.getNombre_lista()+"</nombre_lista>\n";  
        data+="\t\t<nombre>"+this.getNombre()+"</nombre>\n";  
        data+="\t\t<etiqueta>"+this.getEtiqueta()+"</etiqueta>\n";  
        data+="\t\t<multimedia>"+this.getMultimedia()+"</multimedia>\n";  
        data+="\t</opcion>\n";  
        return data;
    }   
    
    public static void setColumna(String clave, int valor)
    {
        posicionesColumnas.put(clave.toLowerCase(), valor);
    }  
    
    public static int getColumna(String clave)
    {
        System.out.println("Buscando clave ----------"+clave.toLowerCase());
        return posicionesColumnas.get(clave.toLowerCase());
    }    

    public String getAtributo(String atrib)
    {        
        switch(atrib.toLowerCase())
        {
            case "nombre_lista":
                return getNombre_lista();                
            case "nombre":
                return getNombre();
            case "etiqueta":
                return getEtiqueta();
            case "multimedia":
                return getMultimedia();
        }
        return "";
    }   
    
    
    
    public boolean getVacio()
    {
        return  getNombre_lista().equals("") &&
                getNombre().equals("")&&
                getMultimedia().equals("")&&
                getEtiqueta().equals("");                
    }    
}
































