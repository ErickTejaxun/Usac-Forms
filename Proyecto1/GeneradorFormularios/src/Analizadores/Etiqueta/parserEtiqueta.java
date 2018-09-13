/* parserEtiqueta.java */
/* Generated By:JavaCC: Do not edit this line. parserEtiqueta.java */
package Analizadores.Etiqueta;
import AST.Nodo;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class parserEtiqueta implements parserEtiquetaConstants {
        public int row;
    public int column;
    public static Nodo main(String args[], int row, int column) throws ParseException
    {
        if(args.length>0)      
        {

            InputStream data = new ByteArrayInputStream(args[0].getBytes());
            parserEtiqueta analizador = new parserEtiqueta(data);
            return analizador.Etiqueta();
        }
        else
        {
            try
            {
                parserEtiqueta analizador = new parserEtiqueta(System.in);
                analizador.Etiqueta();
            }
            catch (ParseException e)
            {
                System.out.println(e.getMessage());
                System.out.println("Errores------------------");
            }
        }
        return null;
    }

    void errorPanico(int tokenSinc)
    {
        ParseException e = generateParseException();
        Token t;
        do
        {
            t = getNextToken();
        }
        while (t.kind != tokenSinc);
    }

    public void imprimir(String mensaje)
    {
        System.out.println(mensaje);
    }

  final public Nodo Etiqueta() throws ParseException {Nodo Cad;
    Nodo nuevo;
    Token t= null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case numeral:
    case Cadena:
    case dospuntos:
    case punto:{
      label_1:
      while (true) {
        Cad = ETQ();
nuevo = Cad;
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case numeral:
        case Cadena:
        case dospuntos:
        case punto:{
          ;
          break;
          }
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
      }
      jj_consume_token(0);
ArrayList<Nodo> hijos = new ArrayList();
        nuevo = Cad;
        //nuevo.getHijos().clear();
        Nodo auxiliar = new Nodo("cadena","",0,0);
        for(Nodo nodo : Cad.getHijos())
        {
            if(nodo.getTipo().equals("cadena"))
            {
                if(nodo.getValue().equals("."))
                {
                    auxiliar.setValue(auxiliar.getValue()+nodo.getValue());
                }
                else
                {
                    auxiliar.setValue(auxiliar.getValue()+" "+nodo.getValue());
                }

            }
            else
            {
                if(!auxiliar.getValue().equals(""))
                {
                    hijos.add(auxiliar);
                    hijos.add(nodo);
                    auxiliar = new Nodo("cadena","",0,0);
                }
                else
                {
                    hijos.add(nodo);
                }
            }
        }
        if(!auxiliar.getValue().equals(""))
        {
            hijos.add(auxiliar);
        }
        nuevo.getHijos().clear();
        nuevo.setListaHijos(hijos);
        {if ("" != null) return nuevo;}
      break;
      }
    default:
      jj_la1[1] = jj_gen;
{if ("" != null) return new Nodo("etiqueta","etiqueta",0,0);}
    }
    throw new Error("Missing return statement in function");
  }

  final public Nodo ETQ() throws ParseException {String Cad;
    String aux;
    Nodo nuevo = null;
    Nodo derecha = null;
    Nodo izquierda = null;
    izquierda = T();
    derecha = ETQ2();
nuevo = new Nodo("etiqueta","etiqueta",0,0);
        if(izquierda.getHijos().isEmpty())
        {
            nuevo.add(izquierda);
        }
        else
        {
            for(Nodo ni: izquierda.getHijos())
            {
                if(!ni.getTipo().equals("vacio"))
                {
                    nuevo.add(ni);
                }
            }
        }
        if(derecha.getHijos().isEmpty())
        {
            nuevo.add(derecha);
        }
        else
        {
            for(Nodo nd: derecha.getHijos())
            {
                if(!nd.getTipo().equals("vacio"))
                {
                    nuevo.add(nd);
                }
            }
        }
        {if ("" != null) return nuevo;}
    throw new Error("Missing return statement in function");
  }

  final public Nodo ETQ2() throws ParseException {String Cad;
    String aux;
    Nodo izquierdo = null;
    Nodo derecho = null;
    Nodo nuevo  = null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case numeral:
    case Cadena:
    case dospuntos:
    case punto:{
      izquierdo = T();
      derecho = ETQ2();
nuevo = new Nodo("ET2","ET2",0,0);
            if(izquierdo.getHijos().isEmpty())
            {
                nuevo.add(izquierdo);
            }
            else
            {
                for(Nodo ni: izquierdo.getHijos())
                {
                    if(!ni.getTipo().equals("vacio"))
                    {
                        nuevo.add(ni);
                    }
                }
            }
            for(Nodo nd: derecho.getHijos())
            {
                nuevo.add(nd);
            }
            {if ("" != null) return nuevo;}
      break;
      }
    case 0:{
      jj_consume_token(0);
nuevo = new Nodo("vacio","vacio",0,0);
        {if ("" != null) return nuevo;}
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public Nodo T() throws ParseException {String auxiliar;
    Nodo nuevo = null;
    Nodo aux = null;
    Token t = null;
    Token t2= null;
    Token t1=null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Cadena:{
      t = jj_consume_token(Cadena);
nuevo = new Nodo("cadena",t.image, t.beginColumn, t.beginLine);
        {if ("" != null) return nuevo;}
      break;
      }
    case punto:{
      t = jj_consume_token(punto);
{if ("" != null) return new Nodo("cadena",t.image, t.beginColumn, t.beginLine);}
      break;
      }
    case dospuntos:{
      t = jj_consume_token(dospuntos);
{if ("" != null) return new Nodo("var","padre",t.beginColumn, t.beginLine);}
      break;
      }
    case numeral:{
      t = jj_consume_token(numeral);
      aux = ET3();
{if ("" != null) return aux;}
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public Nodo ET3() throws ParseException {Nodo nuevo = null;
    Token t = null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case corchA:{
      jj_consume_token(corchA);
      t = jj_consume_token(ID);
      jj_consume_token(corchC);
nuevo = new Nodo("varP",t.image, t.beginColumn, t.beginLine);
        System.out.println("Invocando variable: "+t.image);
        {if ("" != null) return nuevo;}
      break;
      }
    case Cadena:{
      t = jj_consume_token(Cadena);
nuevo = new Nodo("cadena","#"+t.image, t.beginColumn, t.beginLine);
        {if ("" != null) return nuevo;}
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public parserEtiquetaTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[5];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x1c4,0x1c4,0x1c5,0x1c4,0x48,};
   }

  /** Constructor with InputStream. */
  public parserEtiqueta(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public parserEtiqueta(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new parserEtiquetaTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public parserEtiqueta(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new parserEtiquetaTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public parserEtiqueta(parserEtiquetaTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(parserEtiquetaTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[9];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 5; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 9; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
