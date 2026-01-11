package com.efiAnalytics.tuningwidgets.portEditor;

import G.R;
import G.aH;
import G.aM;
import G.aN;
import G.aR;
import V.a;
import V.g;
import V.j;
import bH.D;
import bH.X;
import bH.g;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class C extends JComboBox implements F, bc {
  R a = null;
  
  private R l = null;
  
  aM b = null;
  
  aN c = null;
  
  private aM m = null;
  
  private aM n = null;
  
  ArrayList d = new ArrayList();
  
  g e = new g();
  
  int f = -1;
  
  int g = -1;
  
  boolean h = false;
  
  boolean i = false;
  
  boolean j = false;
  
  boolean k = false;
  
  public C(R paramR, String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2) {
    this.a = paramR;
    this.i = paramBoolean1;
    this.j = paramBoolean2;
    this.b = this.a.c(paramString1);
    this.m = this.a.c(paramString2);
    if (paramString3 != null && !paramString3.isEmpty())
      this.n = this.a.c(paramString3); 
    a(this.a);
    addActionListener(new D(this));
    this.c = new E(this);
    aR aR = aR.a();
    try {
      aR.a(this.a.c(), this.b.aL(), this.c);
    } catch (a a) {
      D.a("Failed to subscribe " + this.b.aL() + " for update notification.", (Exception)a, this);
    } 
  }
  
  protected void a(String paramString) {
    if (paramString != null && this.l != null && paramString.length() > 0 && !this.h) {
      aH aH = this.l.g(paramString);
      try {
        double[][] arrayOfDouble1 = this.b.i(this.a.h());
        if (this.k) {
          if (this.b.e() >= 4) {
            arrayOfDouble1[this.g][this.f] = aH.x();
          } else {
            arrayOfDouble1[this.g][this.f] = (aH.x() - this.l.O().af());
          } 
        } else {
          arrayOfDouble1[this.g][this.f] = aH.a();
        } 
        this.b.a(this.a.h(), arrayOfDouble1);
        if (this.n != null) {
          this.e.a();
          this.e.a(aH.aL().getBytes());
          double[][] arrayOfDouble = this.n.i(this.a.h());
          arrayOfDouble[this.g][this.f] = this.e.b();
          this.n.a(this.a.h(), arrayOfDouble);
        } 
        double[][] arrayOfDouble2 = this.m.i(this.a.h());
        arrayOfDouble2[this.g][this.f] = aH.l();
        if (this.i) {
          if (aH.t())
            arrayOfDouble2[this.g][this.f] = ((int)arrayOfDouble2[this.g][this.f] | 0x40); 
          if (!aH.p())
            arrayOfDouble2[this.g][this.f] = ((int)arrayOfDouble2[this.g][this.f] | 0x80); 
        } 
        try {
          this.m.a(this.a.h(), arrayOfDouble2);
        } catch (j j) {
          bV.d("There is an error in your ini not allowing size to be set properly.", this);
        } 
        a(aH);
      } catch (j j) {
        D.a("Value Out of Bounds updating:" + aH.aL() + " offset to " + this.b.aL());
        Logger.getLogger(C.class.getName()).log(Level.SEVERE, (String)null, (Throwable)j);
      } catch (g g1) {
        D.a("Error updating:" + aH.aL() + " offset to " + this.b.aL());
      } catch (Exception exception) {
        String str1 = (aH == null) ? "null" : aH.aL();
        String str2 = (this.b == null) ? "null" : this.b.aL();
        D.a("Unkown Error updating:" + str1 + " offset to " + str2);
        exception.printStackTrace();
      } 
    } 
  }
  
  public String a() {
    return (String)getSelectedItem();
  }
  
  public void a(int paramInt) {
    this.g = paramInt;
  }
  
  public void b(int paramInt) {
    this.f = paramInt;
    b();
  }
  
  public void b() {
    if (this.g >= 0 && this.f >= 0)
      try {
        double d = this.b.i(this.a.h())[this.g][this.f];
        boolean bool = false;
        for (byte b = 0; b < getItemCount(); b++) {
          aH aH = this.l.g((String)getItemAt(b));
          if (this.k) {
            if (aH != null) {
              long l;
              if (this.b.e() >= 4) {
                l = aH.x();
              } else {
                l = aH.x() - this.l.O().af();
              } 
              if (l == d) {
                setSelectedItem(getItemAt(b));
                bool = true;
                break;
              } 
            } 
          } else if (aH != null && aH.a() == d) {
            setSelectedItem(getItemAt(b));
            bool = true;
            break;
          } 
        } 
        if (!bool && getItemCount() > 0)
          setSelectedItem(getItemAt(0)); 
      } catch (g g1) {
        g1.printStackTrace();
      }  
  }
  
  public void close() {
    aR aR = aR.a();
    aR.a(this.c);
  }
  
  public void a(p paramp) {
    this.d.add(paramp);
  }
  
  private void a(aH paramaH) {
    Iterator<p> iterator = this.d.iterator();
    while (iterator.hasNext())
      ((p)iterator.next()).a(paramaH); 
  }
  
  public void a(R paramR) {
    this.l = paramR;
    this.h = true;
    removeAllItems();
    if (paramR.O().al().equals("XCP"))
      this.k = true; 
    String[] arrayOfString = paramR.s();
    ArrayList<String> arrayList = new ArrayList();
    byte b;
    for (b = 0; b < arrayOfString.length; b++) {
      aH aH = paramR.g(arrayOfString[b]);
      if (aH.b() != null && !aH.b().equals("formula") && !aH.b().equals("bits") && (!this.j || aH.l() != 4))
        arrayList.add(arrayOfString[b]); 
    } 
    arrayOfString = arrayList.<String>toArray(new String[arrayList.size()]);
    arrayOfString = X.a(arrayOfString);
    for (b = 0; b < arrayOfString.length; b++)
      addItem((E)arrayOfString[b]); 
    this.h = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/C.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */