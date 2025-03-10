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
    int row;
    String column;
    String tipo;
    
    public Error(String detalle, int fila, int columna)
    {
        this.detalle = detalle;
        this.fila = fila;
        this.columna = columna;
    }
    
    public Error(String detalle, int fila, int columna, int row, int column, String tipo)
    {
        this.detalle = detalle;
        this.fila = fila;
        this.columna = columna;
        this.row = row;
        this.column = getCelda(column);
        this.tipo = tipo;
    }    
    
    public String getTipo()
    {
        return this.tipo;
    }
    public void setLexico()
    {
        this.tipo = "Léxico";
    }

    public void setSintactico()
    {
        this.tipo = "Sintactico";
    }
    
    public void setSemantico()
    {
        this.tipo = "Semantico";
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

    public int getRow() {
        return row;
    }

    public String getColumn() {
        return column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(String column) {
        this.column = column;
    }
           
    
    public String getCelda(int valor)
    {
        
        int primera = valor / 28;
        int segunda = valor % 28;        
        if(primera!=0)
        {
            return String.valueOf((char)(primera+65) + (char)(segunda+65));            
        }
        else
        {
             return  String.valueOf((char)(segunda+65)); 
        }                
    }    
}

















