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
public class Configuracion 
{
    public String titulo_formulario = "";
    public String idform = "";
    public String estilo = "";
    public String importar = "";
    public String codigo_principal = "";
    public String codigo_global = "";
    
    public Configuracion()
    {
    }

    public String getTitulo_formulario() {
        return titulo_formulario;
    }

    public String getIdform() {
        return idform;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getImportar() {
        return importar;
    }

    public String getCodigo_principal() {
        return codigo_principal;
    }

    public String getCodigo_global() {
        return codigo_global;
    }

    public void setTitulo_formulario(String titulo_formulario) {
        this.titulo_formulario = titulo_formulario;
    }

    public void setIdform(String idform) {
        this.idform = idform;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void setImportar(String importar) {
        this.importar = importar;
    }

    public void setCodigo_principal(String codigo_principal) {
        this.codigo_principal = codigo_principal;
    }

    public void setCodigo_global(String codigo_global) {
        this.codigo_global = codigo_global;
    }
    
    
    
    public void insertarAtributo(String tipo, String data)
    {
        System.out.println(tipo+"-"+data);
        switch(tipo.toLowerCase())
        {
            case "titulo_formulario":
                this.setTitulo_formulario(data);
                break;
            case "idform":
                this.setIdform(data);
                break;
            case "estilo":
                this.setEstilo(data);
                break;
            case "importar":
                this.setImportar(data);
                break;
            case "codigo_principal":
                this.setCodigo_principal(data);
                break;
            case "codigo_global":
                this.setCodigo_global(data);
                break;                
        }
    }
    
    public String getData()
    {
        String data = "";
        data+="<configuracion>\n";
        data+="\t<titulo_formulario>"+this.getTitulo_formulario()+"</titulo_formulario>\n";  
        data+="\t<idform>"+this.getIdform()+"</idform>\n";  
        data+="\t<estilo>"+this.getEstilo()+"</estilo>\n";  
        data+="\t<importar>"+this.getImportar()+"</importar>\n";  
        data+="\t<codigo_principal>"+this.getCodigo_principal()+"</codigo_principal>\n";
        data+="\t<codigo_global>"+this.getCodigo_global()+"</codigo_global>\n";
        data+="</configuracion>\n";                
        return data;        
    }
    
    

}











