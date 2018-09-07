/* parseParametro.java */
/* Generated By:JavaCC: Do not edit this line. parseParametro.java */
package Analizadores.Parametro;
import AST.Nodo;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class parseParametro implements parseParametroConstants {
    public static Nodo main(String args[]) throws ParseException
    {
        if(args.length>0)
        {

            InputStream data = new ByteArrayInputStream(args[0].getBytes());
            parseParametro analizador = new parseParametro(data);
            return analizador.Inicio();
        }
        else
        {
            try
            {
                parseParametro analizador = new parseParametro(System.in);
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

    public void imprimir(String mensaje)
    {
        System.out.println(mensaje);
    }

  final public Nodo Inicio() throws ParseException {Nodo aux = new Nodo("parametros","parametros",0,0);
    Nodo nuevo = null;
    Token t= null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case cad_max:
    case cad_fila:
    case cad_min:{
      nuevo = Limites();
      jj_consume_token(0);
aux.add(nuevo); {if ("" != null) return aux;}
      break;
      }
    case iniciar:
    case finalizar:{
      nuevo = Rango();
      jj_consume_token(0);
aux.add(nuevo); {if ("" != null) return aux;}
      break;
      }
    case opcion:{
      nuevo = Opcion();
      jj_consume_token(0);
aux.add(nuevo); {if ("" != null) return aux;}
      break;
      }
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public Nodo Opcion() throws ParseException {Nodo izquierdo = new Nodo("opcion","opcion",0,0);
    Nodo derecho = null;
    Token t = null;
    jj_consume_token(opcion);
    jj_consume_token(igual);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case sino:{
      t = jj_consume_token(sino);
      break;
      }
    case verdaderofalso:{
      t = jj_consume_token(verdaderofalso);
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
izquierdo.add(new Nodo(t.image,t.image,t.beginColumn,t.beginLine));
        {if ("" != null) return izquierdo;}
    throw new Error("Missing return statement in function");
  }

  final public Nodo Rango() throws ParseException {Nodo izquierdo = null;
    Nodo derecho = null;
    Nodo nuevo = new Nodo("rango","rango",0,0);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case iniciar:{
      izquierdo = Iniciar();
      derecho = Finalizar();
nuevo.add(izquierdo); nuevo.add(derecho); {if ("" != null) return nuevo;}
      break;
      }
    case finalizar:{
      izquierdo = Finalizar();
      derecho = Iniciar();
nuevo.add(izquierdo); nuevo.add(derecho); {if ("" != null) return nuevo;}
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public Nodo Iniciar() throws ParseException {Nodo nuevo = new Nodo("iniciar","iniciar",0,0);
    Nodo aux = null;
    Token t = null;
    t = jj_consume_token(iniciar);
    jj_consume_token(igual);
    aux = logica();
nuevo.setColumna(t.beginColumn); nuevo.setLinea(t.beginLine); nuevo.add(aux); {if ("" != null) return nuevo;}
    throw new Error("Missing return statement in function");
  }

  final public Nodo Finalizar() throws ParseException {Nodo nuevo = new Nodo("finalizar","finalizar",0,0);
    Nodo aux = null;
    Token t = null;
    t = jj_consume_token(finalizar);
    jj_consume_token(igual);
    aux = logica();
nuevo.setColumna(t.beginColumn); nuevo.setLinea(t.beginLine); nuevo.add(aux); {if ("" != null) return nuevo;}
    throw new Error("Missing return statement in function");
  }

  final public Nodo Limites() throws ParseException {Nodo nuevo = new Nodo("limites","limites",0,0);
    Nodo izquierdo = null;
    Nodo derecho = null;
    Token t ;
    label_1:
    while (true) {
      izquierdo = Limite();
nuevo.add(izquierdo);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case cad_max:
      case cad_fila:
      case cad_min:{
        ;
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        break label_1;
      }
    }
{if ("" != null) return nuevo;}
    throw new Error("Missing return statement in function");
  }

  final public Nodo Limite() throws ParseException {Nodo nuevo= null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case cad_min:{
      nuevo = limiteMinimo();
{if ("" != null) return nuevo;}
      break;
      }
    case cad_max:{
      nuevo = limiteMaximo();
{if ("" != null) return nuevo;}
      break;
      }
    case cad_fila:{
      nuevo = minimoFilas();
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

  final public Nodo limiteMinimo() throws ParseException {Nodo izquierdo = null ;
    Nodo derecho = null ;
    Token t = null;
    t = jj_consume_token(cad_min);
    jj_consume_token(igual);
    derecho = logica();
izquierdo = new Nodo("cad_min","cad_min",0,0);
        izquierdo.add(derecho);
        {if ("" != null) return izquierdo;}
    throw new Error("Missing return statement in function");
  }

  final public Nodo limiteMaximo() throws ParseException {Nodo izquierdo = null ;
    Nodo derecho = null ;
    Token t = null;
    t = jj_consume_token(cad_max);
    jj_consume_token(igual);
    derecho = logica();
izquierdo = new Nodo("cad_max","cad_max",0,0);
        izquierdo.add(derecho);
        {if ("" != null) return izquierdo;}
    throw new Error("Missing return statement in function");
  }

  final public Nodo minimoFilas() throws ParseException {Nodo izquierdo = null ;
    Nodo derecho = null ;
    Token t = null;
    t = jj_consume_token(cad_fila);
    jj_consume_token(igual);
    derecho = logica();
izquierdo = new Nodo("cad_fila","cad_fila",0,0);
        izquierdo.add(derecho);
        {if ("" != null) return izquierdo;}
    throw new Error("Missing return statement in function");
  }

  final public Nodo logica() throws ParseException {Nodo izquierdo;
    Nodo derecho;
    Token t = null;
    izquierdo = exprAnd();
    label_2:
    while (true) {
      if (jj_2_1(2)) {
        ;
      } else {
        break label_2;
      }
      t = jj_consume_token(or);
      derecho = exprAnd();
Nodo aux = izquierdo;
            izquierdo = new Nodo(t.image,t.image,t.beginColumn, t.beginLine);
            izquierdo.add(aux);
            izquierdo.add(derecho);
    }
{if ("" != null) return izquierdo;}
    throw new Error("Missing return statement in function");
  }

  final public Nodo exprAnd() throws ParseException {Nodo izquierdo = null;
    Nodo derecho = null;
    Token t = null;
    Nodo nuevo =null;
    izquierdo = Relacional();
    label_3:
    while (true) {
      if (jj_2_2(2)) {
        ;
      } else {
        break label_3;
      }
      t = jj_consume_token(and);
      derecho = Relacional();
Nodo aux = izquierdo;
            izquierdo = new Nodo(t.image,t.image,t.beginColumn, t.beginLine);
            izquierdo.add(aux);
            izquierdo.add(derecho);
    }
{if ("" != null) return izquierdo;}
    throw new Error("Missing return statement in function");
  }

  final public Nodo Relacional() throws ParseException {Nodo izquierdo = null;
    Nodo derecho = null;
    Nodo operador = null;
    izquierdo = Comparacion();
    label_4:
    while (true) {
      if (jj_2_3(2)) {
        ;
      } else {
        break label_4;
      }
      operador = opRelacional2();
      derecho = Comparacion();
Nodo aux = izquierdo;
            izquierdo = new Nodo(operador.getTipo(),operador.getValue(),operador.getColumna(),operador.getLinea());
            izquierdo.add(aux);
            izquierdo.add(derecho);
    }
{if ("" != null) return izquierdo;}
    throw new Error("Missing return statement in function");
  }

  final public Nodo Comparacion() throws ParseException {Nodo izquierdo = null;
    Nodo derecho = null;
    Nodo operador = null;
    izquierdo = Expr();
    label_5:
    while (true) {
      if (jj_2_4(2)) {
        ;
      } else {
        break label_5;
      }
      operador = opRelacional();
      derecho = Expr();
Nodo aux = izquierdo;
            izquierdo = new Nodo(operador.getTipo(),operador.getValue(),operador.getColumna(),operador.getLinea());
            izquierdo.add(aux);
            izquierdo.add(derecho);
    }
{if ("" != null) return izquierdo;}
    throw new Error("Missing return statement in function");
  }

  final public Nodo opRelacional2() throws ParseException {Token t = null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case igual:{
      t = jj_consume_token(igual);
{if ("" != null) return new Nodo("igual",t.image,t.beginColumn, t.beginLine);}
      break;
      }
    case desigual:{
      t = jj_consume_token(desigual);
{if ("" != null) return new Nodo("desigual",t.image,t.beginColumn, t.beginLine);}
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public Nodo opRelacional() throws ParseException {Token t = null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case mayorque:{
      t = jj_consume_token(mayorque);
{if ("" != null) return new Nodo("maryoque",t.image,t.beginColumn, t.beginLine);}
      break;
      }
    case menorque:{
      t = jj_consume_token(menorque);
{if ("" != null) return new Nodo("menorque",t.image,t.beginColumn, t.beginLine);}
      break;
      }
    case mayorigualque:{
      t = jj_consume_token(mayorigualque);
{if ("" != null) return new Nodo("mayorigualque",t.image,t.beginColumn, t.beginLine);}
      break;
      }
    case menorigualque:{
      t = jj_consume_token(menorigualque);
{if ("" != null) return new Nodo("menorigualque",t.image,t.beginColumn, t.beginLine);}
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public Nodo Expr() throws ParseException {Nodo izquierdo = null;
    Nodo derecho = null;
    Token t = null;
    izquierdo = ExprMulti();
    label_6:
    while (true) {
      if (jj_2_5(2)) {
        ;
      } else {
        break label_6;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case suma:{
        t = jj_consume_token(suma);
        break;
        }
      case menos:{
        t = jj_consume_token(menos);
        break;
        }
      default:
        jj_la1[7] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      derecho = ExprMulti();
Nodo aux = izquierdo;
            izquierdo = new Nodo(t.image,t.image,t.beginColumn, t.beginLine);
            izquierdo.add(aux);
            izquierdo.add(derecho);
    }
{if ("" != null) return izquierdo;}
    throw new Error("Missing return statement in function");
  }

  final public Nodo ExprMulti() throws ParseException {Nodo izquierdo = null;
    Nodo derecho = null;
    Token t = null;
    izquierdo = ExprPotencia();
    label_7:
    while (true) {
      if (jj_2_6(2)) {
        ;
      } else {
        break label_7;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case multi:{
        t = jj_consume_token(multi);
        break;
        }
      case div:{
        t = jj_consume_token(div);
        break;
        }
      case mod:{
        t = jj_consume_token(mod);
        break;
        }
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      derecho = ExprPotencia();
Nodo aux = izquierdo;
            izquierdo = new Nodo(t.image,t.image,t.beginColumn, t.beginLine);
            izquierdo.add(aux);
            izquierdo.add(derecho);
    }
{if ("" != null) return izquierdo;}
    throw new Error("Missing return statement in function");
  }

  final public Nodo ExprPotencia() throws ParseException {Nodo izquierdo = null;
    Nodo nuevo =  new Nodo("ExpPotencia","ExpPotencia",0,0);
    Nodo derecho = null;
    Token t = null;
    izquierdo = Elemental();
    label_8:
    while (true) {
      if (jj_2_7(2)) {
        ;
      } else {
        break label_8;
      }
      t = jj_consume_token(potencia);
      derecho = Elemental();
Nodo aux = izquierdo;
            izquierdo = new Nodo(t.image,t.image,t.beginColumn, t.beginLine);
            izquierdo.add(aux);
            izquierdo.add(derecho);
    }
{if ("" != null) return izquierdo;}
    throw new Error("Missing return statement in function");
  }

  final public Nodo Elemental() throws ParseException {Nodo nuevo = null;
    Nodo auxiliar = null;
    Token t = null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case dospuntos:{
      t = jj_consume_token(dospuntos);
{if ("" != null) return new Nodo("var","padre",t.beginColumn, t.beginLine);}
      break;
      }
    case punto:{
      t = jj_consume_token(punto);
{if ("" != null) return new Nodo("var","this",t.beginColumn, t.beginLine);}
      break;
      }
    case entero:{
      t = jj_consume_token(entero);
{if ("" != null) return new Nodo("entero",t.image,t.beginColumn, t.beginLine);}
      break;
      }
    case doble:{
      t = jj_consume_token(doble);
{if ("" != null) return new Nodo("doble",t.image,t.beginColumn, t.beginLine);}
      break;
      }
    case caracter:{
      t = jj_consume_token(caracter);
{if ("" != null) return new Nodo("caracter",t.image,t.beginColumn, t.beginLine);}
      break;
      }
    case identificador:{
      t = jj_consume_token(identificador);
{if ("" != null) return new Nodo("var",t.image,t.beginColumn, t.beginLine);}
      break;
      }
    case varP:{
      t = jj_consume_token(varP);
String sub = t.image.substring(2,t.image.length()-1); {if ("" != null) return new Nodo("varP",sub,t.beginColumn, t.beginLine);}
      break;
      }
    case cadena:{
      t = jj_consume_token(cadena);
{if ("" != null) return new Nodo("cadena",t.image,t.beginColumn, t.beginLine);}
      break;
      }
    case fechahora:{
      t = jj_consume_token(fechahora);
{if ("" != null) return new Nodo("fechahora",t.image,t.beginColumn, t.beginLine);}
      break;
      }
    case hora:{
      t = jj_consume_token(hora);
{if ("" != null) return new Nodo("hora",t.image,t.beginColumn, t.beginLine);}
      break;
      }
    case fecha:{
      t = jj_consume_token(fecha);
{if ("" != null) return new Nodo("fecha",t.image,t.beginColumn, t.beginLine);}
      break;
      }
    case verdadero:{
      t = jj_consume_token(verdadero);
{if ("" != null) return new Nodo("verdadero",t.image,t.beginColumn, t.beginLine);}
      break;
      }
    case falso:{
      t = jj_consume_token(falso);
{if ("" != null) return new Nodo("falso",t.image,t.beginColumn, t.beginLine);}
      break;
      }
    case parA:{
      t = jj_consume_token(parA);
      auxiliar = logica();
      jj_consume_token(parC);
nuevo = new Nodo("Expr","()",t.beginColumn, t.beginLine);
        nuevo.add(auxiliar);
        {if ("" != null) return nuevo;}
      break;
      }
    case menos:{
      t = jj_consume_token(menos);
      auxiliar = logica();
nuevo = new Nodo("expr","expr",t.beginColumn, t.beginLine);
        nuevo.add(new Nodo("menos","menos",t.beginColumn,t.beginLine));
        nuevo.add(auxiliar);
        {if ("" != null) return nuevo;}
      break;
      }
    case not:{
      t = jj_consume_token(not);
      auxiliar = logica();
nuevo = new Nodo("expr","expr",t.beginColumn, t.beginLine);
        nuevo.add(new Nodo("not","not",t.beginColumn,t.beginLine));
        nuevo.add(auxiliar);
        {if ("" != null) return nuevo;}
      break;
      }
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_2_4(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  private boolean jj_2_5(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  private boolean jj_2_6(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_6(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(5, xla); }
  }

  private boolean jj_2_7(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_7(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(6, xla); }
  }

  private boolean jj_3_1()
 {
    if (jj_scan_token(or)) return true;
    if (jj_3R_9()) return true;
    return false;
  }

  private boolean jj_3R_38()
 {
    if (jj_scan_token(menos)) return true;
    return false;
  }

  private boolean jj_3R_23()
 {
    if (jj_scan_token(menorigualque)) return true;
    return false;
  }

  private boolean jj_3R_22()
 {
    if (jj_scan_token(mayorigualque)) return true;
    return false;
  }

  private boolean jj_3R_21()
 {
    if (jj_scan_token(menorque)) return true;
    return false;
  }

  private boolean jj_3R_13()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_20()) {
    jj_scanpos = xsp;
    if (jj_3R_21()) {
    jj_scanpos = xsp;
    if (jj_3R_22()) {
    jj_scanpos = xsp;
    if (jj_3R_23()) return true;
    }
    }
    }
    return false;
  }

  private boolean jj_3R_20()
 {
    if (jj_scan_token(mayorque)) return true;
    return false;
  }

  private boolean jj_3R_37()
 {
    if (jj_scan_token(parA)) return true;
    return false;
  }

  private boolean jj_3R_36()
 {
    if (jj_scan_token(falso)) return true;
    return false;
  }

  private boolean jj_3R_35()
 {
    if (jj_scan_token(verdadero)) return true;
    return false;
  }

  private boolean jj_3R_34()
 {
    if (jj_scan_token(fecha)) return true;
    return false;
  }

  private boolean jj_3R_33()
 {
    if (jj_scan_token(hora)) return true;
    return false;
  }

  private boolean jj_3R_32()
 {
    if (jj_scan_token(fechahora)) return true;
    return false;
  }

  private boolean jj_3R_31()
 {
    if (jj_scan_token(cadena)) return true;
    return false;
  }

  private boolean jj_3R_19()
 {
    if (jj_scan_token(desigual)) return true;
    return false;
  }

  private boolean jj_3R_30()
 {
    if (jj_scan_token(varP)) return true;
    return false;
  }

  private boolean jj_3R_18()
 {
    if (jj_scan_token(igual)) return true;
    return false;
  }

  private boolean jj_3R_11()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_18()) {
    jj_scanpos = xsp;
    if (jj_3R_19()) return true;
    }
    return false;
  }

  private boolean jj_3R_29()
 {
    if (jj_scan_token(identificador)) return true;
    return false;
  }

  private boolean jj_3R_28()
 {
    if (jj_scan_token(caracter)) return true;
    return false;
  }

  private boolean jj_3R_27()
 {
    if (jj_scan_token(doble)) return true;
    return false;
  }

  private boolean jj_3R_26()
 {
    if (jj_scan_token(entero)) return true;
    return false;
  }

  private boolean jj_3R_25()
 {
    if (jj_scan_token(punto)) return true;
    return false;
  }

  private boolean jj_3R_17()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_24()) {
    jj_scanpos = xsp;
    if (jj_3R_25()) {
    jj_scanpos = xsp;
    if (jj_3R_26()) {
    jj_scanpos = xsp;
    if (jj_3R_27()) {
    jj_scanpos = xsp;
    if (jj_3R_28()) {
    jj_scanpos = xsp;
    if (jj_3R_29()) {
    jj_scanpos = xsp;
    if (jj_3R_30()) {
    jj_scanpos = xsp;
    if (jj_3R_31()) {
    jj_scanpos = xsp;
    if (jj_3R_32()) {
    jj_scanpos = xsp;
    if (jj_3R_33()) {
    jj_scanpos = xsp;
    if (jj_3R_34()) {
    jj_scanpos = xsp;
    if (jj_3R_35()) {
    jj_scanpos = xsp;
    if (jj_3R_36()) {
    jj_scanpos = xsp;
    if (jj_3R_37()) {
    jj_scanpos = xsp;
    if (jj_3R_38()) {
    jj_scanpos = xsp;
    if (jj_3R_39()) return true;
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_24()
 {
    if (jj_scan_token(dospuntos)) return true;
    return false;
  }

  private boolean jj_3_4()
 {
    if (jj_3R_13()) return true;
    if (jj_3R_14()) return true;
    return false;
  }

  private boolean jj_3R_12()
 {
    if (jj_3R_14()) return true;
    return false;
  }

  private boolean jj_3_7()
 {
    if (jj_scan_token(potencia)) return true;
    if (jj_3R_17()) return true;
    return false;
  }

  private boolean jj_3_6()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(35)) {
    jj_scanpos = xsp;
    if (jj_scan_token(36)) {
    jj_scanpos = xsp;
    if (jj_scan_token(37)) return true;
    }
    }
    if (jj_3R_16()) return true;
    return false;
  }

  private boolean jj_3R_16()
 {
    if (jj_3R_17()) return true;
    return false;
  }

  private boolean jj_3_3()
 {
    if (jj_3R_11()) return true;
    if (jj_3R_12()) return true;
    return false;
  }

  private boolean jj_3_2()
 {
    if (jj_scan_token(and)) return true;
    if (jj_3R_10()) return true;
    return false;
  }

  private boolean jj_3R_10()
 {
    if (jj_3R_12()) return true;
    return false;
  }

  private boolean jj_3_5()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(32)) {
    jj_scanpos = xsp;
    if (jj_scan_token(34)) return true;
    }
    if (jj_3R_15()) return true;
    return false;
  }

  private boolean jj_3R_15()
 {
    if (jj_3R_16()) return true;
    return false;
  }

  private boolean jj_3R_9()
 {
    if (jj_3R_10()) return true;
    return false;
  }

  private boolean jj_3R_14()
 {
    if (jj_3R_15()) return true;
    return false;
  }

  private boolean jj_3R_39()
 {
    if (jj_scan_token(not)) return true;
    return false;
  }

  /** Generated Token Manager. */
  public parseParametroTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[10];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x3e000,0xc0000,0x30000,0xe000,0xe000,0x8000000,0x30000000,0x0,0x0,0x6f0119c,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x4000,0x0,0x0,0x0,0x0,0x40,0x180,0x5,0x38,0x9804,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[7];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public parseParametro(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public parseParametro(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new parseParametroTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
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
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public parseParametro(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new parseParametroTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public parseParametro(parseParametroTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(parseParametroTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
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
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[48];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 10; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 48; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
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

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 7; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
            case 5: jj_3_6(); break;
            case 6: jj_3_7(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
