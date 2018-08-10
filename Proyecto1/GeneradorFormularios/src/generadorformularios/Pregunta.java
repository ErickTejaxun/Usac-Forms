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
public class Pregunta 
{
    String	tipo	=	""	;
   String	IdPregunta	=	""	;
   String	etiqueta	=	""	;
   String	parametro	=	""	;
   String	calcular	=	""	;
   String	aplicable	=	""	;
   String	sugerencia	=	""	;
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
        return calcular;
    }

    public String getAplicable() {
        return aplicable;
    }

    public String getSugerencia() {
        return sugerencia;
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
        this.calcular = calcular;
    }

    public void setAplicable(String aplicable) {
        this.aplicable = aplicable;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
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
    
    
    public void insertarAtributo(String tipo, String valor)
    {
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
            case "calcular":
                this.setCalcular(valor);
                break;
            case "aplicable":
                this.setAplicable(valor);
                break;
            case "sugerencia":
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
        this.multimedia = this.multimedia;
    }
    
    
    public String getData()
    {
        String data= ""; 
        data+="<pregunta>\n";
        data+="\t<tipo>"+this.getTipo()+"</tipo>\n"; 
        data+="\t<idpregunta>"+this.getIdPregunta()+"</idpregunta>\n"; 
        data+="\t<etiqueta>"+this.getEtiqueta()+"</etiqueta>\n"; 
        data+="\t<parametro>"+this.getParametro()+"</parametro>\n"; 
        data+="\t<calcular>"+this.getCalcular()+"</calcular>\n"; 
        data+="\t<aplicable>"+this.getAplicable()+"</aplicable>\n"; 
        data+="\t<sugerencia>"+this.getSugerencia()+"</sugerencia>\n"; 
        data+="\t<restringir>"+this.getRestringir()+"</restringir>\n"; 
        data+="\t<restringirmsn>"+this.getRestringirmsn()+"</restringirmsn>\n"; 
        data+="\t<requeridomsn>"+this.getRequeridoMsn()+"</requeridomsn>\n"; 
        data+="\t<requerido>"+this.getRequerido()+"</requerido>\n"; 
        data+="\t<pordefecto>"+this.getPredeterminado()+"</pordefecto>\n"; 
        data+="\t<lectura>"+this.getLectura()+"</lectura>\n"; 
        data+="\t<repeticion>"+this.getRepeticion()+"</repeticion>\n"; 
        data+="\t<apariencia>"+this.getApariencia()+"</apariencia>\n"; 
        data+="\t<codigo_pre>"+this.getCodigo_post()+"</codigo_pre>\n"; 
        data+="\t<codigo_post>"+this.getCodigo_post()+"</codigo_post>\n"; 
        data+="\t<multimedia>"+this.getMultimedia()+"</multimedia>\n";  
        data+="</pregunta>\n";  
        return data;
    }
}
