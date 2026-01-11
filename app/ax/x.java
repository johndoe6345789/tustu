package ax;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class x implements ab {
  ArrayList a = null;
  
  public x(ArrayList paramArrayList) {
    this.a = paramArrayList;
    ArrayList<Character> arrayList = new ArrayList();
    f();
    a();
    b();
    e();
    arrayList.clear();
    arrayList.add(Character.valueOf('*'));
    arrayList.add(Character.valueOf('/'));
    arrayList.add(Character.valueOf('%'));
    a(arrayList);
    arrayList.clear();
    arrayList.add(Character.valueOf('+'));
    arrayList.add(Character.valueOf('-'));
    a(arrayList);
    arrayList.clear();
    arrayList.add(Character.valueOf('³'));
    arrayList.add(Character.valueOf('´'));
    arrayList.add(Character.valueOf('µ'));
    a(arrayList);
    arrayList.clear();
    arrayList.add(Character.valueOf('&'));
    a(arrayList);
    arrayList.clear();
    arrayList.add(Character.valueOf('^'));
    a(arrayList);
    arrayList.clear();
    arrayList.add(Character.valueOf('|'));
    a(arrayList);
    c();
    d();
    if (paramArrayList.size() != 1)
      throw new I("Unknown error: Possibly caused by adjacent operators/operands"); 
  }
  
  private void a() {
    for (boolean bool = true; bool; bool = false) {
      boolean bool1 = false;
      byte b1 = 0;
      byte b2;
      for (b2 = 0; b2 < this.a.size() && !bool1; b2++) {
        ad ad = (ad)this.a.get(b2);
        if (ad instanceof ad) {
          ad ad1 = ad;
          if (ad1.a() == '(') {
            bool1 = true;
            b1 = b2;
          } 
        } 
      } 
      byte b3 = 0;
      boolean bool2 = false;
      byte b4 = 0;
      while (b2 < this.a.size() && !bool2) {
        ad ad = (ad)this.a.get(b2);
        if (ad instanceof ad) {
          ad ad1 = ad;
          if (ad1.a() == '(') {
            b3++;
          } else if (ad1.a() == ')') {
            if (b3 == 0) {
              bool2 = true;
              b4 = b2;
            } else {
              b3--;
            } 
          } 
        } 
        b2++;
      } 
      if (bool1) {
        x x1 = a(b1 + 1, b4);
        this.a.set(b1, x1);
        this.a.subList(b1 + 1, b4 + 1).clear();
        continue;
      } 
    } 
  }
  
  private void b() {
    byte b1 = 0;
    byte b2 = 0;
    boolean bool1 = false;
    byte b3;
    for (b3 = 0; b3 < this.a.size() && !bool1; b3++) {
      ad ad = (ad)this.a.get(b3);
      if (ad instanceof ad && ((ad)ad).a() == '?') {
        b1 = b3;
        bool1 = true;
      } 
    } 
    boolean bool2 = true;
    byte b4 = 0;
    while (b3 < this.a.size() && bool2) {
      ad ad = (ad)this.a.get(b3);
      if (ad instanceof ad) {
        ad ad1 = ad;
        if (ad1.a() == ':') {
          if (!b4) {
            b2 = b3;
            bool2 = false;
          } else {
            b4--;
          } 
        } else if (ad1.a() == '?') {
          b4++;
        } 
      } 
      b3++;
    } 
    if (bool1) {
      if (b1 == 0 || b2 == this.a.size() - 1)
        throw new I("Invalid Ternary Expression"); 
      x x1 = a(0, b1);
      x x2 = a(b1 + 1, b2);
      x x3 = a(b2 + 1, this.a.size());
      al al = new al(x1, x2, x3);
      this.a.set(0, al);
      this.a.subList(1, this.a.size()).clear();
    } 
  }
  
  private void c() {
    for (int i = this.a.size() - 1; i >= 0; i--) {
      ad ad = (ad)this.a.get(i);
      if (ad instanceof ad) {
        ad ad1 = ad;
        if (ad1.a() == '=' || ad1.a() == 'ñ' || ad1.a() == 'ò' || ad1.a() == 'ó' || ad1.a() == '>' || ad1.a() == '<') {
          K k;
          if (i == 0 || i == this.a.size() - 1 || !(this.a.get(i - 1) instanceof ab) || !(this.a.get(i + 1) instanceof ab))
            throw new I("Evaluation Expression missing left or right Operand"); 
          w w = null;
          if (ad1.a() == '=') {
            w = new w(this.a.get(i - 1), this.a.get(i + 1));
          } else if (ad1.a() == 'ñ') {
            aa aa = new aa(this.a.get(i - 1), this.a.get(i + 1));
          } else if (ad1.a() == 'ò') {
            B b = new B(this.a.get(i - 1), this.a.get(i + 1));
          } else if (ad1.a() == 'ó') {
            J j = new J(this.a.get(i - 1), this.a.get(i + 1));
          } else if (ad1.a() == '>') {
            C c = new C(this.a.get(i - 1), this.a.get(i + 1));
          } else if (ad1.a() == '<') {
            k = new K(this.a.get(i - 1), this.a.get(i + 1));
          } 
          this.a.set(i - 1, k);
          this.a.subList(i, i + 2).clear();
        } 
      } 
    } 
  }
  
  private void a(List paramList) {
    for (byte b = 0; b < this.a.size(); b++) {
      ad ad = (ad)this.a.get(b);
      if (ad instanceof ad) {
        ad ad1 = ad;
        if (paramList.contains(Character.valueOf(ad1.a()))) {
          m m;
          if (b == 0 || b == this.a.size() - 1 || !(this.a.get(b - 1) instanceof ab) || !(this.a.get(b + 1) instanceof ab))
            throw new I("Operation missing left or right Operand"); 
          W w = null;
          if (ad1.a() == '*') {
            w = new W(this.a.get(b - 1), this.a.get(b + 1));
          } else if (ad1.a() == '/') {
            t t = new t(this.a.get(b - 1), this.a.get(b + 1));
          } else if (ad1.a() == '%') {
            V v = new V(this.a.get(b - 1), this.a.get(b + 1));
          } else if (ad1.a() == '+') {
            f f = new f(this.a.get(b - 1), this.a.get(b + 1));
          } else if (ad1.a() == '-') {
            aj aj = new aj(this.a.get(b - 1), this.a.get(b + 1));
          } else if (ad1.a() == '&') {
            h h = new h(this.a.get(b - 1), this.a.get(b + 1));
          } else if (ad1.a() == '^') {
            n n = new n(this.a.get(b - 1), this.a.get(b + 1));
          } else if (ad1.a() == '|') {
            k k = new k(this.a.get(b - 1), this.a.get(b + 1));
          } else if (ad1.a() == '³') {
            i i = new i(this.a.get(b - 1), this.a.get(b + 1));
          } else if (ad1.a() == '´') {
            l l = new l(this.a.get(b - 1), this.a.get(b + 1));
          } else if (ad1.a() == 'µ') {
            m = new m(this.a.get(b - 1), this.a.get(b + 1));
          } 
          this.a.set(b - 1, m);
          this.a.subList(b, b + 2).clear();
          b--;
        } 
      } 
    } 
  }
  
  private void d() {
    for (int i = this.a.size() - 1; i >= 0; i--) {
      ad ad = (ad)this.a.get(i);
      if (ad instanceof ad) {
        ad ad1 = ad;
        if (ad1.a() == 'º' || ad1.a() == '»') {
          O o;
          if (i == 0 || i == this.a.size() - 1 || !(this.a.get(i - 1) instanceof ab) || !(this.a.get(i + 1) instanceof ab))
            throw new I("Logical Expression missing left or right Operand"); 
          P p = null;
          if (ad1.a() == 'º') {
            p = new P(this.a.get(i - 1), this.a.get(i + 1));
          } else if (ad1.a() == '»') {
            o = new O(this.a.get(i - 1), this.a.get(i + 1));
          } 
          this.a.set(i - 1, o);
          this.a.subList(i, i + 2).clear();
        } 
      } 
    } 
  }
  
  private void e() {
    for (int i = this.a.size() - 1; i >= 0; i--) {
      ad ad = (ad)this.a.get(i);
      if (ad instanceof ad) {
        ad ad1 = ad;
        if (ad1.a() == 'Ä' || ad1.a() == '!' || ad1.a() == 'Å' || ad1.a() == '~') {
          j j;
          if (i == this.a.size() - 1 || !(this.a.get(i + 1) instanceof ab))
            throw new I("Unary operator is missing an operand."); 
          X x1 = null;
          if (ad1.a() == 'Ä') {
            x1 = new X(this.a.get(i + 1));
          } else if (ad1.a() == '!') {
            Y y = new Y(this.a.get(i + 1));
          } else if (ad1.a() == '~') {
            j = new j(this.a.get(i + 1));
          } else if (ad1.a() == 'Å') {
          
          } 
          this.a.set(i, j);
          this.a.subList(i + 1, i + 2).clear();
        } 
      } 
    } 
  }
  
  public String toString() {
    StringBuffer stringBuffer = new StringBuffer();
    for (Object object : this.a) {
      if (object instanceof x) {
        stringBuffer.append("( ").append(object.toString()).append(" )");
        continue;
      } 
      stringBuffer.append(object.toString());
    } 
    return stringBuffer.toString();
  }
  
  public double b(S paramS) {
    ab ab1 = (ab)this.a.get(0);
    if (!(ab1 instanceof ab))
      throw new I("Reason Unknown."); 
    ab ab2 = ab1;
    return ab2.b(paramS);
  }
  
  private void f() {
    for (int i = 0; i < this.a.size(); i++) {
      G g = (G)this.a.get(i);
      if (g instanceof G && ((G)g).b()) {
        G g1 = g;
        int j = i;
        i += 2;
        ArrayList<x> arrayList = new ArrayList();
        byte b = 0;
        boolean bool1 = true;
        int k = i;
        int m = 0;
        boolean bool2 = false;
        while (bool1) {
          ad ad = (ad)this.a.get(i);
          if (ad instanceof ad && ((ad)ad).a() == ')') {
            if (!b) {
              if (bool2)
                arrayList.add(a(k, i)); 
              m = i;
              bool1 = false;
            } else {
              b--;
            } 
          } else if (ad instanceof ad && ad.a() == '(') {
            b++;
          } else if (ad instanceof ad && ad.a() == ',') {
            if (b == 0) {
              if (!bool2)
                throw new I("Invalid Expression. Comma found without a preceding expression."); 
              arrayList.add(a(k, i));
              bool2 = false;
              k = i + 1;
            } 
          } else {
            bool2 = true;
          } 
          i++;
        } 
        ab ab1 = Q.a(g1.c(), arrayList);
        this.a.set(j, ab1);
        this.a.subList(j + 1, m + 1).clear();
        i = j + 1;
        continue;
      } 
    } 
  }
  
  private x a(int paramInt1, int paramInt2) {
    ArrayList arrayList = new ArrayList();
    Iterator iterator = this.a.subList(paramInt1, paramInt2).iterator();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return new x(arrayList);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ax/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */