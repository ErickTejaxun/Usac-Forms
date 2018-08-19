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
public class Pregunta 
{
    String	tipo	=	""	;
   String	IdPregunta	=	""	;
   String	etiqueta	=	""	;
   String	parametro	=	""	;
   String	calculo	=	""	;
   String	aplicable	=	""	;
   String	sugerir	=	""	;
   String	restringir	=	""	;
   String	restringirmsn	=	""	;
   String	requeridoMsn	=	""	;
   String	requerido	=	""	;
   String	predeterminado	=	""	;
   String	lectura	=	""	;
   String	repeticion	=	""	;
   String	apariencia	=	""	;
   String	codigo_pre	=	""	;
   String	codigo_post	=	""	;
   String	multimedia	=	""	;
   
   
   private Hashtable<String, Integer> posiciones= new Hashtable<String, Integer>();
  
   
   
   int fila = 0;
   boolean error = true;


    public Pregunta()
    {
    }

    public String getTipo() {
        return tipo;
    }

    public String getIdPregunta() {
        return IdPregunta;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public String getParametro() {
        return parametro;
    }

    public String getCalcular() {
        return calculo;
    }

    public String getAplicable() {
        return aplicable;
    }

    public String getSugerencia() {
        return sugerir;
    }

    public String getRestringir() {
        return restringir;
    }

    public String getRestringirmsn() {
        return restringirmsn;
    }

    public String getRequeridoMsn() {
        return requeridoMsn;
    }

    public String getRequerido() {
        return requerido;
    }

    public String getPredeterminado() {
        return predeterminado;
    }

    public String getLectura() {
        return lectura;
    }

    public String getRepeticion() {
        return repeticion;
    }

    public String getApariencia() {
        return apariencia;
    }

    public String getCodigo_pre() {
        return codigo_pre;
    }

    public String getCodigo_post() {
        return codigo_post;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIdPregunta(String IdPregunta) {
        this.IdPregunta = IdPregunta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public void setCalcular(String calcular) {
        this.calculo = calcular;
    }

    public void setAplicable(String aplicable) {
        this.aplicable = aplicable;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerir = sugerencia;
    }

    public void setRestringir(String restringir) {
        this.restringir = restringir;
    }

    public void setRestringirmsn(String restringirmsn) {
        this.restringirmsn = restringirmsn;
    }

    public void setRequeridoMsn(String requeridoMsn) {
        this.requeridoMsn = requeridoMsn;
    }

    public void setRequerido(String requerido) {
        this.requerido = requerido;
    }

    public void setPredeterminado(String PorDefecto) {
        this.predeterminado = PorDefecto;
    }

    public void setLectura(String lectura) {
        this.lectura = lectura;
    }

    public void setRepeticion(String repeticion) {
        this.repeticion = repeticion;
    }

    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }

    public void setCodigo_pre(String codigo_pre) {
        this.codigo_pre = codigo_pre;
    }

    public void setCodigo_post(String codigo_post) {
        this.codigo_post = codigo_post;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }
    
    public int getFila()
    {
        return this.fila;
    }
    
    public void setError()
    {
        this.error = true;
    }
    
    public boolean getError()
    {
        return this.error;
    }
    
    public void insertarAtributo(String tipo, String valor)
    {
        valor = valor.trim();
        switch(tipo.toLowerCase())
        {
            case "tipo":
                this.setTipo(valor);
                break;
            case "idpregunta":
                this.setIdPregunta(valor);
                break;               
            case "etiqueta":
                this.setEtiqueta(valor);
                break;
            case "parametro":
                this.setParametro(valor);
                break;
            case "calculo":
                this.setCalcular(valor);
                break;
            case "aplicable":
                this.setAplicable(valor);
                break;
            case "sugerir":
                this.setSugerencia(valor);
                break;
            case "restringir":
                this.setRestringir(valor);
                break;
            case "restriccion":
                this.setRestringir(valor);
                break;                
            case "restringirmsn":
                this.setRestringirmsn(valor);
                break;
            case "requeridomsn":
                this.setRequeridoMsn(valor);
                break;
            case "requerido":
                this.setRequerido(valor);
                break;
            case "predeterminado":
                this.setPredeterminado(valor);
                break;
            case "lectura":
                this.setLectura(valor);
                break;
            case "repeticion":
                this.setRepeticion(valor);
                break;
            case "apariencia":
                this.setApariencia(valor);
                break;
            case "codigo_pre":
                this.setCodigo_pre(valor);
                break;
            case "codigo_post":
                this.setCodigo_post(valor);
                break;
            case "multimedia":
                this.setMultimedia(valor);
                break;
        }
    }

    public String getMultimedia() {
        return multimedia;
    }
    
    public void setMultimedia(String multimedia)
    {
        this.multimedia = multimedia;
    }
    
    
    public String getData()
    {
        String data= ""; 
        data+="\t<pregunta>\n";
        data+="\t\t<tipo>"+this.getTipo()+"</tipo>\n"; 
        data+="\t\t<idpregunta>"+this.getIdPregunta()+"</idpregunta>\n"; 
        data+="\t\t<etiqueta>"+this.getEtiqueta()+"</etiqueta>\n"; 
        data+="\t\t<parametro>"+this.getParametro()+"</parametro>\n"; 
        data+="\t\t<calculo>"+this.getCalcular()+"</calculo>\n"; 
        data+="\t\t<aplicable>"+this.getAplicable()+"</aplicable>\n"; 
        data+="\t\t<sugerir>"+this.getSugerencia()+"</sugerir>\n"; 
        data+="\t\t<restringir>"+this.getRestringir()+"</restringir>\n"; 
        data+="\t\t<restringirmsn>"+this.getRestringirmsn()+"</restringirmsn>\n"; 
        data+="\t\t<requeridomsn>"+this.getRequeridoMsn()+"</requeridomsn>\n"; 
        data+="\t\t<requerido>"+this.getRequerido()+"</requerido>\n"; 
        data+="\t\t<predeterminado>"+this.getPredeterminado()+"</predeterminado>\n"; 
        data+="\t\t<lectura>"+this.getLectura()+"</lectura>\n"; 
        data+="\t\t<repeticion>"+this.getRepeticion()+"</repeticion>\n"; 
        data+="\t\t<apariencia>"+this.getApariencia()+"</apariencia>\n"; 
        data+="\t\t<codigo_pre>"+this.getCodigo_pre()+"</codigo_pre>\n"; 
        data+="\t\t<codigo_post>"+this.getCodigo_post()+"</codigo_post>\n"; 
        data+="\t\t<multimedia>"+this.getMultimedia()+"</multimedia>\n";  
        data+="\t</pregunta>\n";  
        return data;
    }     
    
    
    public void setColumna(String clave, int valor)
    {
        this.posiciones.put(clave.toLowerCase(), valor);
    }
    
    public String getColumna(String clave)
    {
        return this.posiciones.get(clave).toString();
    }
}
