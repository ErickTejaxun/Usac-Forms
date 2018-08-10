/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorformularios;

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
        data+="<opcion>\n";
        data+="\t<nombre_lista>"+this.getNombre_lista()+"</nombre_lista>\n";  
        data+="\t<nombre>"+this.getNombre()+"</nombre>\n";  
        data+="\t<etiqueta>"+this.getEtiqueta()+"</etiqueta>\n";  
        data+="\t<multimedia>"+this.getMultimedia()+"</multimedia>\n";  
        data+="</opcion>\n";  
        return data;
    }    
}
































