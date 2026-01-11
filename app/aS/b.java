package aS;

import G.R;
import G.T;
import G.aG;
import G.bT;
import G.cN;
import G.cq;
import G.dc;
import G.m;
import G.o;
import aP.dd;
import bH.X;
import c.a;
import com.efiAnalytics.apps.ts.dashboard.x;
import r.a;
import s.g;

class b implements aG, cN, cq {
  String a = "";
  
  boolean b = false;
  
  String c = null;
  
  String d = "";
  
  int e = 0;
  
  x f = null;
  
  public b(a parama, String paramString) {
    this.a = paramString;
  }
  
  private String a() {
    R r = T.a().c(this.a);
    if (this.d != null && this.d.length() > 0) {
      String str1 = (r != null) ? r.i() : "";
      return a(this.d, str1);
    } 
    if (r != null && r.O().O() != null) {
      dc dc = new dc();
      m m = m.f(r.O());
      o o = dc.a(r, m, r.O().i() * 2);
      if (o.a() == 1) {
        this.d = o.c();
        return a(this.d, r.i());
      } 
      return c(r.i());
    } 
    String str = (r != null) ? r.i() : "";
    return c(str);
  }
  
  private String c(String paramString) {
    String str = a.a(paramString, a.f);
    return "<html><b>You have a settings error!</b> on " + this.a + "<br>This means there are conflicting settings and the " + str + " does not know how to handle them <br> <br>To resolve this you need to correct your settings then powercycle the " + str + " <br>You do not need to reload firmware to fix this problem.<br><br>To see the " + str + " reported error, briefly power cycle the " + str + " now.<br> <br>If you still receive no " + str + " reported error;<br>You can get the error message by performing the following steps:<br> - Open the Mini-Terminal under the menu:<br>     &nbsp;&nbsp;&nbsp;&nbsp;" + g.b("Communications") + "-->" + g.b("Mini Terminal") + "<br> - Power Cycle the " + str + ".<br><br>The condition causing the conflict will be reported in the lower text box.</html>";
  }
  
  private String a(String paramString1, String paramString2) {
    paramString1 = X.b(paramString1, "\n", "<br>");
    if (a.a(this.g) == a.a())
      return "<html><b>Protocol Error Reported</b> for " + this.a + "<br> <br>The following error was reported during communication attempts:<br><b>" + paramString1 + "</b><br><br></html>"; 
    String str = a.a(paramString2, a.f);
    return this.g.d ? ("<html>The following message was reported by the " + str + ":<br><br><b>" + paramString1 + "</b><br></html>") : ("<html><b>You have a settings error!</b> on " + this.a + "<br>This means there are conflicting settings and the " + str + " does not know how to handle them <br> <br>The following error was reported by the " + str + ":<br><b>" + paramString1 + "</b><br><br>Unless directed in the above message, you do not need to reload firmware to fix this problem.<br><br>To resolve this you need to correct this error in your settings then powercycle the " + str + " <br></html>");
  }
  
  private void b() {
    this.b = true;
    c c = new c(this);
    c.start();
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (paramDouble != 0.0D && this.g.c.R()) {
      this.e++;
      if (this.e > 2 && !this.b && System.currentTimeMillis() - this.g.b > 5000L)
        b(); 
    } else if (this.b) {
      this.b = false;
      if (this.f != null) {
        this.f.ab();
        this.f = null;
      } 
      this.d = null;
      dd.a().b().ac();
    } else {
      this.e = 0;
      this.d = null;
    } 
  }
  
  public void a(boolean paramBoolean, int paramInt, String paramString, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    this.d = paramString;
    if (paramBoolean && !this.b) {
      a.a(this.g, a.a());
      b();
    } 
  }
  
  public void b(String paramString) {
    this.d = paramString;
    if (!this.b) {
      a.a(this.g, a.b());
      b();
    } 
  }
  
  public boolean a(String paramString, bT parambT) {
    return true;
  }
  
  public void a(String paramString) {
    dd.a().b().ac();
    this.b = false;
    this.d = null;
    this.e = 0;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aS/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */