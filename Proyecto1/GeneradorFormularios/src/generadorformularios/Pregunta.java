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
    
    public static Hashtable<String, Integer> posicionesColumnas= new Hashtable<String, Integer>();
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
   String	fichero	=	""	;
   boolean vacio = false;
   boolean iniciar = false;
   boolean finalizar = false;
   
   
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

    public String getCalculo() {
        return calculo;
    }

    public String getAplicable() {
        return aplicable;
    }

    public String getSugerir() {
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

    public void setCalculo(String calcular) {
        this.calculo = calcular;
    }

    public void setAplicable(String aplicable) {
        this.aplicable = aplicable;
    }

    public void setSugerir(String sugerencia) {
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
    
    public void setVacio()
    {
        this.vacio=true;
    }
    public void setNoVacio()
    {
        this.vacio = false;
    }

    public boolean getVacio()
    {
        return  getApariencia().equals("") &&
                getEtiqueta().equals("")&&
                getParametro().equals("")&&
                getCalculo().equals("")&&
                getAplicable().equals("")&&
                getSugerir().equals("")&&
                getRestringir().equals("")&&
                getRestringirmsn().equals("")&&
                getRequerido().equals("")&&
                getRequeridoMsn().equals("")&&
                getPredeterminado().equals("")&&
                getLectura().equals("")&&
                getRepeticion().equals("")&&
                getApariencia().equals("")&&
                getCodigo_post().equals("")&&
                getCodigo_pre().equals("")&&
                getFichero().equals("")&&
                getEtiqueta().equals("")&&
                getTipo().equals("");
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
    
    public void setIniciar()
    {
        this.iniciar = true;
    }
    
    public void setNoIniciar()
    {
        this.iniciar = false;
    }    
    
    
    public boolean esIniciar()
    {
        return this.iniciar;
    }
    
    public void insertarAtributo(String tipo, String valor)
    {
        String valorN = valor.trim();
        System.out.print("+"+valor+"+");
        System.out.print("+"+valorN+"+");
        switch(tipo.toLowerCase())
        {
            case "tipo":
                this.setTipo(valorN);
                break;
            case "idpregunta":
                this.setIdPregunta(valorN);
                break;               
            case "etiqueta":
                this.setEtiqueta(valorN);
                break;
            case "parametro":
                this.setParametro(valorN);
                break;
            case "calculo":
                this.setCalculo(valorN);
                break;
            case "aplicable":
                this.setAplicable(valorN);
                break;
            case "sugerir":
                this.setSugerir(valorN);
                break;
            case "restringir":
                this.setRestringir(valorN);
                break;
            case "restriccion":
                this.setRestringir(valorN);
                break;                
            case "restringirmsn":
                this.setRestringirmsn(valorN);
                break;
            case "requeridomsn":
                this.setRequeridoMsn(valorN);
                break;
            case "requerido":
                this.setRequerido(valorN);
                break;
            case "predeterminado":
                this.setPredeterminado(valorN);
                break;
            case "lectura":
                this.setLectura(valorN);
                break;
            case "repeticion":
                this.setRepeticion(valorN);
                break;
            case "apariencia":
                this.setApariencia(valorN);
                break;
            case "codigo_pre":
                this.setCodigo_pre(valorN);
                break;
            case "codigo_post":
                this.setCodigo_post(valorN);
                break;
            case "fichero":
                this.setFichero(valorN);
                break;
        }
    }

    public String getFichero() {
        return fichero;
    }
    
    public void setFichero(String multimedia)
    {
        this.fichero = multimedia;
    }
    
    
    public String getData()
    {
        String data= ""; 
        data+="\t<pregunta>\n";
        data+="\t\t<tipo>"+this.getTipo()+"</tipo>\n"; 
        data+="\t\t<idpregunta>"+this.getIdPregunta()+"</idpregunta>\n"; 
        data+="\t\t<etiqueta>"+this.getEtiqueta()+"</etiqueta>\n"; 
        data+="\t\t<parametro>"+this.getParametro()+"</parametro>\n"; 
        data+="\t\t<calculo>"+this.getCalculo()+"</calculo>\n"; 
        data+="\t\t<aplicable>"+this.getAplicable()+"</aplicable>\n"; 
        data+="\t\t<sugerir>"+this.getSugerir()+"</sugerir>\n"; 
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
        data+="\t\t<fichero>"+this.getFichero()+"</fichero>\n";  
        data+="\t</pregunta>\n";  
        return data;
    }     
    
    
   /* public void setColumna(String clave, int valor)
    {
        this.posiciones.put(clave.toLowerCase(), valor);
    }*/
    
    
    public static void setColumna(String clave, int valor)
    {
        posicionesColumnas.put(clave.toLowerCase(), valor);
    }    
    
    /*public int getColumna(String clave)
    {
        System.out.println("Buscando clave ----------"+clave);
        return this.posiciones.get(clave.toLowerCase());        
    }*/
    
    
    public static int getColumna(String clave)
    {
        System.out.println("Buscando clave ----------"+clave.toLowerCase());
        return posicionesColumnas.get(clave.toLowerCase());
    }
        
    
    public boolean pruebaInicio()
    {
        return 
                getApariencia().equals("") &&
                !getEtiqueta().equals("")&&
                getParametro().equals("")&&
                getCalculo().equals("")&&
                getAplicable().equals("")&&
                getSugerir().equals("")&&
                getRestringir().equals("")&&
                getRestringirmsn().equals("")&&
                getRequerido().equals("")&&
                getRequeridoMsn().equals("")&&
                getPredeterminado().equals("")&&
                getLectura().equals("")&&
                getRepeticion().equals("")&&
                getApariencia().equals("")&&
                getCodigo_post().equals("")&&
                getCodigo_pre().equals("")&&
                getFichero().equals("")&&
                !getIdPregunta().equals("")&&
                (getTipo().trim().toLowerCase().equals("iniciar agrupacion") || getTipo().trim().toLowerCase().equals("iniciar ciclo"))
                ;
    }   
    public boolean esFinal()
    {
        return 
                getApariencia().equals("") &&
                getEtiqueta().equals("")&&
                getParametro().equals("")&&
                getCalculo().equals("")&&
                getAplicable().equals("")&&
                getSugerir().equals("")&&
                getRestringir().equals("")&&
                getRestringirmsn().equals("")&&
                getRequerido().equals("")&&
                getRequeridoMsn().equals("")&&
                getPredeterminado().equals("")&&
                getLectura().equals("")&&
                getRepeticion().equals("")&&
                getApariencia().equals("")&&
                getCodigo_post().equals("")&&
                getCodigo_pre().equals("")&&
                getFichero().equals("")&&
                getEtiqueta().equals("")&&
                getIdPregunta().equals("")&&
                (getTipo().trim().toLowerCase().equals("finalizar agrupacion") || getTipo().trim().toLowerCase().equals("finalizar ciclo"))
                ;
    }    
    
    public ArrayList<Error> verificarErrores(int fila)
    {
       ArrayList<Error> errores  = new ArrayList();
        setTipo(getTipo().trim());
       if(getTipo().toLowerCase().equals("iniciar agrupacion"))//Verificamos si es inicio
       {
            setIniciar();
            if(!getApariencia().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("apariencia")), "Sintactico"));}
            if(getEtiqueta().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("etiqueta")), "Sintactico"));}            
            if(!getParametro().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("parametro")), "Sintactico"));}
            if(!getCalculo().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("calculo")), "Sintactico"));}
            if(!getAplicable().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("aplicable")), "Sintactico"));}
            if(!getSugerir().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("sugerir")), "Sintactico"));}
            if(!getRestringir().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("restringir")), "Sintactico"));}
            if(!getRestringirmsn().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("restringirmsn")), "Sintactico"));}
            if(!getRequerido().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("requerido")), "Sintactico"));}
            if(!getRequeridoMsn().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("requeridomsn")), "Sintactico"));}
            if(!getPredeterminado().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("predeterminado")), "Sintactico"));}            
            if(!getLectura().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("lectura")), "Sintactico"));}
            if(!getRepeticion().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("repeticion")), "Sintactico"));}            
            if(!getCodigo_post().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("codigo_post")), "Sintactico"));}
            if(!getCodigo_pre().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("codigo_pre")), "Sintactico"));}
            if(!getFichero().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("fichero")), "Sintactico"));}
            if(getIdPregunta().equals("")){errores.add(new Error("Falta idpregunta", 1, 1, fila, Integer.valueOf(getColumna("idpregunta")), "Sintactico"));}
       }
       if(getTipo().toLowerCase().equals("iniciar ciclo"))//Verificamos si es inicio
       {
            setIniciar();
            if(!getApariencia().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("apariencia")), "Sintactico"));}
            //if(!getEtiqueta().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("etiqueta")), "Sintactico"));}            
            if(!getParametro().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("parametro")), "Sintactico"));}
            if(!getCalculo().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("calculo")), "Sintactico"));}
            if(!getAplicable().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("aplicable")), "Sintactico"));}
            if(!getSugerir().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("sugerir")), "Sintactico"));}
            if(!getRestringir().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("restringir")), "Sintactico"));}
            if(!getRestringirmsn().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("restringirmsn")), "Sintactico"));}
            if(!getRequerido().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("requerido")), "Sintactico"));}
            if(!getRequeridoMsn().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("requeridomsn")), "Sintactico"));}
            if(!getPredeterminado().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("predeterminado")), "Sintactico"));}            
            if(!getLectura().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("lectura")), "Sintactico"));}
            if(!getRepeticion().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("repeticion")), "Sintactico"));}            
            if(!getCodigo_post().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("codigo_post")), "Sintactico"));}
            if(!getCodigo_pre().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("codigo_pre")), "Sintactico"));}
            if(!getFichero().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("fichero")), "Sintactico"));}
            if(getIdPregunta().equals("")){errores.add(new Error("Falta idpregunta", 1, 1, fila, Integer.valueOf(getColumna("idpregunta")), "Sintactico"));}
       }       
       if(getTipo().toLowerCase().equals("finalizar agrupacion") || getTipo().toLowerCase().equals("finalizar ciclo"))//Verificamos si es inicio
       {
            //setFinalizar();
            if(!getApariencia().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("apariencia")), "Sintactico"));}
            if(!getEtiqueta().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("etiqueta")), "Sintactico"));}            
            if(!getParametro().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("parametro")), "Sintactico"));}
            if(!getCalculo().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("calculo")), "Sintactico"));}
            if(!getAplicable().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("aplicable")), "Sintactico"));}
            if(!getSugerir().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("sugerir")), "Sintactico"));}
            if(!getRestringir().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("restringir")), "Sintactico"));}
            if(!getRestringirmsn().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("restringirmsn")), "Sintactico"));}
            if(!getRequerido().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("requerido")), "Sintactico"));}
            if(!getRequeridoMsn().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("requeridomsn")), "Sintactico"));}
            if(!getPredeterminado().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("predeterminado")), "Sintactico"));}            
            if(!getLectura().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("lectura")), "Sintactico"));}
            if(!getRepeticion().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("repeticion")), "Sintactico"));}            
            if(!getCodigo_post().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("codigo_post")), "Sintactico"));}
            if(!getCodigo_pre().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("codigo_pre")), "Sintactico"));}
            if(!getFichero().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("fichero")), "Sintactico"));}
            if(getIdPregunta().equals("")){errores.add(new Error("Esta celda debe estar vacía.", 1, 1, fila, Integer.valueOf(getColumna("idpregunta")), "Sintactico"));}                      
       }      
       if(
                getApariencia().equals("") &&
                getEtiqueta().equals("")&&
                getParametro().equals("")&&
                getCalculo().equals("")&&
                getAplicable().equals("")&&
                getSugerir().equals("")&&
                getRestringir().equals("")&&
                getRestringirmsn().equals("")&&
                getRequerido().equals("")&&
                getRequeridoMsn().equals("")&&
                getPredeterminado().equals("")&&
                getLectura().equals("")&&
                getRepeticion().equals("")&&
                getApariencia().equals("")&&
                getCodigo_post().equals("")&&
                getCodigo_pre().equals("")&&
                getFichero().equals("")&&
                getEtiqueta().equals("")&&
                getTipo().equals("")
              
               
         )//Decimos que es una celda  y ya 
        {
               System.out.println("Fila "+fila+" vacía.");      
               setVacio();
        }         
       return errores;
    }
    
    
    
    public String getAtributo(String atrib)
    {        
        switch(atrib.toLowerCase())
        {
            case "tipo":
                return getTipo();                
            case "idpregunta":
                return getIdPregunta();
            case "etiqueta":
                return getEtiqueta();
            case "parametro":
                return getParametro();
            case "calculo":
                return getCalculo();
            case "aplicable":
                return getAplicable();
            case "sugerir":
                return getSugerir();
            case "restringir":
                return getRestringir();
            case "restringirmsn":
                return getRestringirmsn();
            case "requerido":
                return getRequerido();
            case "requeridomsn":
                return getRequeridoMsn();
            case "predeterminado":
                return getPredeterminado();
            case "lectura":
                return getLectura();
            case "repeticion":
                return getRepeticion();
            case "apariencia":
                return getApariencia();
            case "codigo_pre":
                return getCodigo_pre();
            case "codigo_post":
                return getCodigo_post();
            case "fichero":
                return getFichero();
        }
        return "";
    }
    
}
