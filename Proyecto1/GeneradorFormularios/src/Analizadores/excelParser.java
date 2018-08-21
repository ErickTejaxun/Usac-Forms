/* excelParser.java */
/* Generated By:JavaCC: Do not edit this line. excelParser.java */
package Analizadores;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class excelParser implements excelParserConstants {

    public static Nodo main(String args[]) throws ParseException
    {
        if(args.length>0)
        {

            InputStream data = new ByteArrayInputStream(args[0].getBytes());
            excelParser analizador = new excelParser(data);
            return analizador.Inicio();
        }
        else
        {
            try
            {
                excelParser analizador = new excelParser(System.in);
                analizador.Inicio();
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

/*Area de analis sintactico. */
  final public Nodo Inicio() throws ParseException {Nodo u = null;
    Nodo nodo;
    Token t = null;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case tipo:{
        t = jj_consume_token(tipo);
        nodo = Tipo();
        jj_consume_token(0);
u = new Nodo(t.image,t.beginColumn,t.beginLine);
        u.add(nodo);
        {if ("" != null) return u;}
        break;
        }
      case idpregunta:{
        t = jj_consume_token(idpregunta);
        nodo = idPregunta();
        jj_consume_token(0);
u = new Nodo(t.image,t.beginColumn,t.beginLine);
        u.add(nodo);
        {if ("" != null) return u;}
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case tipo:
      case idpregunta:{
        ;
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        break label_1;
      }
    }
    throw new Error("Missing return statement in function");
  }

  final public Nodo idPregunta() throws ParseException {Nodo u = null;
    Nodo nodo;
    Token t = null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case id:{
      t = jj_consume_token(id);
u = new Nodo(t.image,t.beginColumn,t.beginLine);
        {if ("" != null) return u;}
      break;
      }
    default:
      jj_la1[2] = jj_gen;
u = new Nodo("Vacio perro",0,0);  {if ("" != null) return u;}
    }
    throw new Error("Missing return statement in function");
  }

  final public Nodo Tipo() throws ParseException {Nodo u = null;
    Nodo nodo;
    Token t = null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case texto:{
      t = jj_consume_token(texto);
u = new Nodo(t.image,t.beginColumn,t.beginLine);
        {if ("" != null) return u;}
      break;
      }
    case entero:{
      t = jj_consume_token(entero);
u = new Nodo(t.image,t.beginColumn,t.beginLine);
        {if ("" != null) return u;}
      break;
      }
    case decimal:{
      t = jj_consume_token(decimal);
u = new Nodo(t.image,t.beginColumn,t.beginLine);
        {if ("" != null) return u;}
      break;
      }
    case rango:{
      t = jj_consume_token(rango);
u = new Nodo(t.image,t.beginColumn,t.beginLine);
        {if ("" != null) return u;}
      break;
      }
    case condicion:{
      t = jj_consume_token(condicion);
u = new Nodo(t.image,t.beginColumn,t.beginLine);
        {if ("" != null) return u;}
      break;
      }
    case fecha:{
      t = jj_consume_token(fecha);
u = new Nodo(t.image,t.beginColumn,t.beginLine);
        {if ("" != null) return u;}
      break;
      }
    case hora:{
      t = jj_consume_token(hora);
u = new Nodo(t.image,t.beginColumn,t.beginLine);
        {if ("" != null) return u;}
      break;
      }
    case fechahora:{
      t = jj_consume_token(fechahora);
u = new Nodo(t.image,t.beginColumn,t.beginLine);
        {if ("" != null) return u;}
      break;
      }
    case seleccionaUno:{
      jj_consume_token(seleccionaUno);
      t = jj_consume_token(id);
u = new Nodo("seleccionaUno",t.beginColumn,t.beginLine);
        u.add(new Nodo(t.image,t.beginColumn,t.beginLine));
        {if ("" != null) return u;}
      break;
      }
    case seleccionaMultiple:{
      jj_consume_token(seleccionaMultiple);
      t = jj_consume_token(id);
u = new Nodo("seleccionaUno",t.beginColumn,t.beginLine);
        u.add(new Nodo(t.image,t.beginColumn,t.beginLine));
        {if ("" != null) return u;}
      break;
      }
    case nota:{
      t = jj_consume_token(nota);
u = new Nodo(t.image,t.beginColumn,t.beginLine);
        {if ("" != null) return u;}
      break;
      }
    case fichero:{
      t = jj_consume_token(fichero);
      u = listaFormatos();
nodo = new Nodo(t.image,t.beginColumn,t.beginLine);
        nodo.add(u);
        {if ("" != null) return nodo;}
      break;
      }
    case calcular:{
      t = jj_consume_token(calcular);
u = new Nodo(t.image,t.beginColumn,t.beginLine);
        {if ("" != null) return u;}
      break;
      }
    case iniciar:{
      t = jj_consume_token(iniciar);
      nodo = agci();
u = new Nodo(t.image,t.beginColumn,t.beginLine);
        u.add(nodo);
        {if ("" != null) return u;}
      break;
      }
    case finalizar:{
      t = jj_consume_token(finalizar);
      nodo = agci();
u = new Nodo(t.image,t.beginColumn,t.beginLine);
        u.add(nodo);
        {if ("" != null) return u;}
      break;
      }
    default:
      jj_la1[3] = jj_gen;
u = new Nodo("Vacio perro",0,0);  {if ("" != null) return u;}
    }
    throw new Error("Missing return statement in function");
  }

  final public Nodo agci() throws ParseException {Nodo u = null;
    Nodo nodo;
    Token t = null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case ciclo:{
      t = jj_consume_token(ciclo);
u = new Nodo("ciclo",t.beginColumn,t.beginLine);
        {if ("" != null) return u;}
      break;
      }
    case agrupacion:{
      t = jj_consume_token(agrupacion);
u = new Nodo("agrupacion",t.beginColumn,t.beginLine);
        {if ("" != null) return u;}
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public Nodo listaFormatos() throws ParseException {Nodo u = null;
    Nodo nodo;
    Token t = null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 28:{
      jj_consume_token(28);
      jj_consume_token(punto);
      t = jj_consume_token(id);
      u = listaFormatos1();
      jj_consume_token(28);
Nodo aux = u;
            u.add( new Nodo(t.image,t.beginColumn,t.beginLine ));
            {if ("" != null) return u;}
      break;
      }
    default:
      jj_la1[5] = jj_gen;
Nodo aux = new Nodo("LISTAF",t.beginColumn,t.beginLine);
        {if ("" != null) return aux;}
    }
    throw new Error("Missing return statement in function");
  }

  final public Nodo listaFormatos1() throws ParseException {Nodo u = null;
    Nodo nodo;
    Token t = null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case coma:{
      jj_consume_token(coma);
      jj_consume_token(punto);
      t = jj_consume_token(id);
      u = listaFormatos1();
Nodo aux = u;
        u.add( new Nodo(t.image,t.beginColumn,t.beginLine));
        {if ("" != null) return u;}
      break;
      }
    default:
      jj_la1[6] = jj_gen;
Nodo aux = new Nodo("LISTAF",t.beginColumn,t.beginLine);
        {if ("" != null) return aux;}
    }
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public excelParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[7];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x6,0x6,0x80000,0x7fff0,0xc000000,0x10000000,0x400000,};
   }

  /** Constructor with InputStream. */
  public excelParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public excelParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new excelParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
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
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public excelParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new excelParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public excelParser(excelParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(excelParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
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
    boolean[] la1tokens = new boolean[29];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 7; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 29; i++) {
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
