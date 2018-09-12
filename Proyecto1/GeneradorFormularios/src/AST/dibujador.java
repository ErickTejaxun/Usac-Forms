/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.Nodo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author erick
 */
public class dibujador 
{
    public dibujador()
    {
    }
    
    public void grafo(Nodo raiz, String nombre) throws IOException
    {
        if(raiz!=null){generarGrafica(raiz, nombre);}
    }
    public void generarGrafica(Nodo raiz, String nombre) throws IOException 
    {
        

        String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";        
        String direccionSalida = PathActual()+"\\ast\\"+nombre+".jpg";
        String direccionEntrada = PathActual()+"\\ast\\"+nombre+".txt";
        
        String cadena = "digraph G\n" +
                        "{\n" +
                        //"rankdir=LR;"+
                        dibujarArbol(raiz)+
                        "}";
        //cadena = cadena.replace("]\"","]");        
        //cadena = cadena.replace("]\"","]");
        //cadena = cadena.replace("\"\"","\"");
        //cadena = cadena.replace("]]","]\"]");
        /*---------------------------------------------------------------------------------*/
        try (  PrintWriter writer = new PrintWriter(direccionEntrada)) {
            writer.print(cadena);            
        } 
        /*---------------------------------------------------------------------------------*/
        
        
        String tParam = "-Tpng";
        String tOParam = "-o";
        
        //dot -Tpng ast.txt -o ast.jpg

        String[] cmd = new String[5];
              cmd[0] = dotPath;
              cmd[1] = tParam;
              cmd[2] = direccionEntrada;
              cmd[3] = tOParam;
              cmd[4] = direccionSalida;

              Runtime rt = Runtime.getRuntime();
              rt.exec(cmd[0]+" "+cmd[1]+" "+cmd[2]+" "+cmd[3]+" "+cmd[4]);
              //rt.exec( cmd );
              
    }
    public String dibujarArbol2(Nodo raiz)
    {
        String comillas = "\"";
        String cadi = raiz.getValue().substring(0, 1);
        String cadf = raiz.getValue().substring(1, 2);
        if(cadi.equals(comillas) && cadf.equals(comillas))
        {
            raiz.setValue(raiz.getValue().substring(1,raiz.getValue().length()));
        }
        
        String cadena = "N"+raiz.hashCode()+"[label=\""+raiz.getValue()+"\"]; \n";
        
        if(!raiz.getHijos().isEmpty())
        {
            for(int cont = 0; cont<raiz.getHijos().size();cont++)
            {
                cadena = cadena +"N"+raiz.getHijos().get(cont).hashCode()+"[label=\""+raiz.getHijos().get(cont).getValue()+"\"]; \n";
                //a -> b[label="0.2",weight="0.2"];
            }
            for(int cont = 0; cont<raiz.getHijos().size();cont++)
            {
                cadena = cadena +"N"+raiz.hashCode()+"->"  +"N"+raiz.getHijos().get(cont).hashCode()+" ; \n";
                //a -> b[label="0.2",weight="0.2"];
            }
            
            for(int cont = 0; cont<raiz.getHijos().size();cont++)
            {
                cadena = cadena + dibujarArbol(raiz.getHijos().get(cont));                
            }            
        }               
        return cadena;
    }
    public String dibujarArbol(Nodo raiz)
    {        
        //raiz.setValue(raiz.getValue().replace("\"", "\\\""));
        for(Nodo r: raiz.getHijos()){r.setValue(r.getValue().replace("\"", "\\\""));}
        String cadena = "N"+raiz.hashCode()+"[label=\"["+raiz.getTipo()+"]"+raiz.getValue()+"\"]; \n";
        
        if(!raiz.getHijos().isEmpty())
        {
            for(int cont = 0; cont<raiz.getHijos().size();cont++)
            {
                cadena = cadena +"N"+raiz.getHijos().get(cont).hashCode()+"[label=\""+"["+raiz.getHijos().get(cont).getTipo()+"]"+raiz.getHijos().get(cont).getValue()+"\"]; \n";
                //a -> b[label="0.2",weight="0.2"];
            }
            for(int cont = 0; cont<raiz.getHijos().size();cont++)
            {
                cadena = cadena +"N"+raiz.hashCode()+"->"  +"N"+raiz.getHijos().get(cont).hashCode()+" ; \n";
                //a -> b[label="0.2",weight="0.2"];
            }
            
            for(int cont = 0; cont<raiz.getHijos().size();cont++)
            {
                cadena = cadena + dibujarArbol(raiz.getHijos().get(cont));                
            }            
        } 
        //raiz.setValue(raiz.getValue().replace("\\\"","\""));
        for(Nodo r: raiz.getHijos()){r.setValue(r.getValue().replace("\\\"","\""));}
        return cadena;
    }    
    
    public String PathActual(){
        String path="";
         File miDir = new File (".");
         try {
           //System.out.println (miDir.getCanonicalPath());
           path=miDir.getCanonicalPath();
         }
         catch(Exception e) {
           e.printStackTrace();
           }
         return path;
    }  
    
    
    
    
    
    
    public String dibujarInterfaz(Nodo raiz, int numero)
    {
        String retorno="";
        if(raiz!=null)
        {
            System.out.println(raiz.getValue());
            switch(raiz.getValue())
            {
                case "DOCUMENTO":
                    retorno = "package Principal;\n" +
                                    "\n" +
                                    "import java.util.ArrayList;\n" +
                                    "import javax.swing.JPanel;\n" +
                                    "\n" +
                                    "/**\n" +
                                    " *\n" +
                                    " * @author erick\n" +
                                    " */\n" +
                                    "public class Pagina"+numero+" extends JPanel\n" +
                                    "{\n" +
                                    "    public String path;\n" +
                                    "    public String titulo;\n" +
                                    "    public ArrayList<String> listaCcss = new ArrayList();\n" +
                                    "    public ArrayList<String> listaCjs = new ArrayList();\n" +
                            
                                    "    \n" +
                                    "    public Pagina"+numero+"()\n" +
                                    "    {\n";
                    for(Nodo aux: raiz.getHijos())
                    {
                        retorno = retorno + dibujarInterfaz(aux, numero);
                    }

                    retorno = retorno + "\t}\n"
                                    + "}" ;
                    break;
                    
                case "ENCABEZADO":                                
                    for(int cont = 0; cont<raiz.getHijos().size();cont++)
                    {
                        retorno = retorno + dibujarInterfaz(raiz.getHijos().get(cont), numero);
                    }
                    break;
                case "LISTAARCHIVOS":
                    for(Nodo aux: raiz.getHijos())
                    {
                        String[] partes = aux.getValue().split(".cjs");                       
                        if(partes.length>1)
                        {
                            aux.setValue(aux.getValue().replace("\"\"","\""));                             
                            retorno = retorno +"\tthis.listaCcss.add(\""+aux.getValue()+"\");\n";
                        }
                        else
                        {
                            retorno = retorno+ "\tthis.listaCjs.add(\""+aux.getValue()+"\");\n";
                        }
                    }
                    break;
                case "TITULO": 
                    for(int cont = 0; cont<raiz.getHijos().size();cont++)
                    {                        
                        
                        retorno =   "\t this.titulo= \""+raiz.getHijos().get(cont).getValue().replace("\n", "\"\\n\" +")+"\"\n"; 
                    }                                       
                    break;
            }
        }        
        return retorno;
    }
    
    public void imprimirtodo(Nodo raiz, int numero) throws FileNotFoundException
    {        
        String direccionEntrada = PathActual()+"\\clase.java";
        
        String cadena = dibujarInterfaz(raiz, numero);
                       
        cadena = cadena.replace("\"\"","\"");
        cadena = cadena.replace("\\","\\\\");
        /*---------------------------------------------------------------------------------*/
        try (  PrintWriter writer = new PrintWriter(direccionEntrada)) {
            writer.print(cadena);            
        } 
        /*---------------------------------------------------------------------------------*/        
    }
    
    public String todo(Nodo raiz)
    {
        String cadena = "";
        cadena = cadena + raiz.getValue()+ "\n";
        for(Nodo aux: raiz.getHijos())
        {
            cadena = cadena + todo(aux);
        }
        return cadena;
    }
}
