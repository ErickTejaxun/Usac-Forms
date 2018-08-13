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
public class Error
{
    String detalle="";
    int fila;
    int columna;
    
    public Error(String detalle, int fila, int columna)
    {
        this.detalle = detalle;
        this.fila = fila;
        this.columna = columna;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getDetalle() {
        return detalle;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
           
}

















