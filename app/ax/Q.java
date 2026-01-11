package ax;

import bH.I;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q {
  static Logger d = Logger.getLogger("com.efiAnalytics.mathparser");
  
  private static List a = new ArrayList();
  
  private Map b = new HashMap<>();
  
  private String c;
  
  private String f;
  
  private ArrayList g = new ArrayList();
  
  x e = null;
  
  private static S h = new S();
  
  private S i = null;
  
  private static final Pattern j = Pattern.compile("0[xX][0-9a-fA-F]*");
  
  private Matcher k = j.matcher("");
  
  private static final Pattern l = Pattern.compile("0[0-9]*");
  
  private Matcher m = l.matcher("");
  
  private static final Pattern n = Pattern.compile("0[bB][0-1]*");
  
  private Matcher o = n.matcher("");
  
  private static final Pattern p = Pattern.compile("[0-9]*[.]{0,1}[0-9]*");
  
  private Matcher q = p.matcher("");
  
  private String[] r = null;
  
  private static q s = new r("PI", Math.PI);
  
  private static q t = new r("E", Math.E);
  
  private static E u = new E(s);
  
  private static E v = new E(t);
  
  public static am b(String paramString) {
    return new s(paramString);
  }
  
  public String[] a() {
    if (this.r == null) {
      ArrayList<String> arrayList = new ArrayList();
      for (String str : this.b.keySet()) {
        E e = (E)this.b.get(str);
        if (e.a() instanceof am)
          arrayList.add(str); 
      } 
      String[] arrayOfString = new String[arrayList.size()];
      this.r = arrayList.<String>toArray(arrayOfString);
    } 
    return this.r;
  }
  
  static ab a(String paramString, ArrayList paramArrayList) {
    ac ac = null;
    Iterator<e> iterator = a.iterator();
    while (iterator.hasNext() && ac == null) {
      e e = iterator.next();
      ac ac1 = e.a(paramString, paramArrayList);
      if (ac1 != null)
        ac = ac1; 
    } 
    if (ac == null)
      throw new z(paramString); 
    return ac;
  }
  
  public static void a(e parame) {
    a.add(0, parame);
  }
  
  public Q() {
    this.i = (S)h.clone();
    this.i.a(new R(this));
  }
  
  public void a(String paramString) {
    this.c = paramString;
    this.f = paramString;
    this.e = null;
    this.r = null;
    h();
    e();
    f();
    g();
  }
  
  public double d() {
    if (this.e == null)
      b(); 
    return this.e.b(this.i);
  }
  
  private synchronized void b() {
    this.e = new x(this.g);
  }
  
  private void e() {
    StringBuffer stringBuffer;
    char[] arrayOfChar = this.c.toCharArray();
    int i = arrayOfChar.length;
    boolean bool1 = true;
    boolean bool2 = false;
    String str = null;
    for (byte b = 0; b < i; b++) {
      if (arrayOfChar[b] == '-' && bool1) {
        ad ad = new ad('Ä');
        this.g.add(ad);
      } else if (arrayOfChar[b] != '+' || !bool1) {
        if (arrayOfChar[b] == '~') {
          if (bool2) {
            d.severe("A Bitwise Not was found following an Operand: " + str);
            throw new I("A Bitwise Not was found following an Operand: " + str);
          } 
          ad ad = new ad('~');
          this.g.add(ad);
        } else if (arrayOfChar[b] == '!') {
          if (bool2) {
            c(str.toString());
            str = null;
            bool2 = false;
          } 
          ad ad = new ad(arrayOfChar[b]);
          this.g.add(ad);
          bool1 = true;
        } else if (arrayOfChar[b] == '(' || arrayOfChar[b] == ')') {
          if (bool2) {
            c(str.toString());
            str = null;
            bool2 = false;
          } 
          if (arrayOfChar[b] == ')') {
            bool1 = false;
          } else {
            bool1 = true;
            if (this.g.size() >= 1) {
              G g = (G)this.g.get(this.g.size() - 1);
              if (g instanceof G)
                ((G)g).a(); 
            } 
          } 
          ad ad = new ad(arrayOfChar[b]);
          this.g.add(ad);
        } else if (arrayOfChar[b] == '+' || arrayOfChar[b] == '-' || arrayOfChar[b] == '*' || arrayOfChar[b] == '/' || arrayOfChar[b] == '?' || arrayOfChar[b] == ':' || arrayOfChar[b] == '=' || arrayOfChar[b] == 'ñ' || arrayOfChar[b] == 'ò' || arrayOfChar[b] == 'ó' || arrayOfChar[b] == '>' || arrayOfChar[b] == '<' || arrayOfChar[b] == 'º' || arrayOfChar[b] == '»' || arrayOfChar[b] == ',' || arrayOfChar[b] == '&' || arrayOfChar[b] == '|' || arrayOfChar[b] == '^' || arrayOfChar[b] == '³' || arrayOfChar[b] == '´' || arrayOfChar[b] == 'µ' || arrayOfChar[b] == '%') {
          if (bool1) {
            d.severe("Invalid expression - Expected Opperand");
            throw new I("Invalid expression - Expected Opperand");
          } 
          if (bool2) {
            c(str.toString());
            bool1 = true;
            str = null;
            bool2 = false;
          } 
          ad ad = new ad(arrayOfChar[b]);
          this.g.add(ad);
        } else {
          if (arrayOfChar[b] == '!')
            throw new RuntimeException("Unsupported Operator - '!'"); 
          if (arrayOfChar[b] != ' ') {
            if (str == null)
              stringBuffer = new StringBuffer(); 
            stringBuffer.append(arrayOfChar[b]);
            bool1 = false;
            bool2 = true;
          } 
        } 
      } 
    } 
    if (bool2)
      c(stringBuffer.toString()); 
  }
  
  private void c(String paramString) {
    G g;
    L l = null;
    if (f(paramString)) {
      l = new L(Long.parseLong(paramString.substring(2), 16));
    } else if (h(paramString)) {
      l = new L(Long.parseLong(paramString, 8));
    } else if (g(paramString)) {
      l = new L(Long.parseLong(paramString.substring(2), 2));
    } else if (i(paramString)) {
      l = new L(Double.parseDouble(paramString));
    } else if (d(paramString)) {
      double d = e(paramString);
      l = new L(d);
    } else {
      g = new G(paramString);
    } 
    this.g.add(g);
  }
  
  private boolean d(String paramString) {
    String str = paramString.toLowerCase();
    if (str.contains("e")) {
      String[] arrayOfString = str.split("e");
      if (arrayOfString.length == 2 && I.a(arrayOfString[0]) && I.a(arrayOfString[1]))
        return true; 
    } 
    return false;
  }
  
  private double e(String paramString) {
    String str = paramString.toLowerCase();
    String[] arrayOfString = str.split("e");
    if (arrayOfString.length == 2) {
      double d1 = Double.parseDouble(arrayOfString[0]);
      double d2 = Double.parseDouble(arrayOfString[1]);
      return d1 * Math.pow(10.0D, d2);
    } 
    System.out.print("Invalid Scientific Notation: " + paramString);
    return Double.NaN;
  }
  
  private boolean f(String paramString) {
    this.k.reset(paramString);
    return this.k.matches();
  }
  
  private boolean g(String paramString) {
    this.o.reset(paramString);
    return this.o.matches();
  }
  
  private boolean h(String paramString) {
    this.m.reset(paramString);
    return this.m.matches();
  }
  
  private boolean i(String paramString) {
    this.q.reset(paramString);
    return this.q.matches();
  }
  
  private void f() {
    this.b.put(s.a(), u);
    this.b.put(t.a(), v);
  }
  
  private void g() {
    for (byte b = 0; b < this.g.size(); b++) {
      G g = (G)this.g.get(b);
      if (g instanceof G) {
        G g1 = g;
        if (!g1.b())
          if (this.b.containsKey(g1.c())) {
            E e = (E)this.b.get(g1.c());
            this.g.set(b, e);
          } else {
            am am = b(g1.c());
            E e = new E(am);
            this.b.put(g1.c(), e);
            this.g.set(b, e);
          }  
      } 
    } 
  }
  
  public void a(String paramString, double paramDouble) {
    E e = (E)this.b.get(paramString);
    if (e != null) {
      if (e.a() instanceof am) {
        am am = (am)e.a();
        am.a(paramDouble);
      } else {
        throw new H(paramString);
      } 
    } else {
      throw new F(paramString);
    } 
  }
  
  private void h() {
    this.c = a(this.c, "==", "=");
    this.c = a(this.c, "!=", "ñ");
    this.c = a(this.c, ">=", "ò");
    this.c = a(this.c, "<=", "ó");
    this.c = a(this.c, "||", "º");
    this.c = a(this.c, "&&", "»");
    this.c = a(this.c, "<<", "³");
    this.c = a(this.c, ">>>", "µ");
    this.c = a(this.c, ">>", "´");
  }
  
  private static String a(String paramString1, String paramString2, String paramString3) {
    for (int i = paramString1.indexOf(paramString2); i >= 0; i = paramString1.indexOf(paramString2, i + paramString3.length()))
      paramString1 = paramString1.substring(0, i) + paramString3 + paramString1.substring(i + paramString2.length()); 
    return paramString1;
  }
  
  public String c() {
    return this.f;
  }
  
  static {
    a.add(new g());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ax/Q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */