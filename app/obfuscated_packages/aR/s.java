package aR;

import G.R;
import G.T;
import G.aA;
import G.bM;
import G.bv;
import aE.a;
import aP.dd;
import aP.f;
import bt.O;
import com.efiAnalytics.ui.cY;
import d.c;
import d.e;
import d.h;
import d.i;
import d.k;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import s.g;

public class s implements cY, c {
  k a = new k();
  
  i b;
  
  public s() {
    i i1 = new i("ecuConfig", "");
    i1.a(0);
    this.b = new i("settingsPanelName", "");
    this.b.a(0);
    this.a.a(this.b);
  }
  
  public String b() {
    return "Show Settings Dialog";
  }
  
  public String c() {
    return "Settings Dialogs";
  }
  
  public boolean d() {
    return (a.A() != null);
  }
  
  public void a(Properties paramProperties) {
    R r;
    String str1 = paramProperties.getProperty("settingsPanelName");
    if (str1 == null || str1.isEmpty())
      throw new e("Settings panel name is a required parameter for Show settings Dialog action."); 
    String str2 = paramProperties.getProperty("ecuConfig");
    if (str2 == null || str2.isEmpty()) {
      r = T.a().c();
    } else {
      r = T.a().c(str2);
    } 
    String str3 = (r != null) ? (r.c() + "." + str1) : str1;
    f.a().a(str3, "0", dd.a().c());
  }
  
  public String a() {
    return "showSettingsDialog";
  }
  
  public void b(Properties paramProperties) {
    R r;
    String str1 = paramProperties.getProperty("settingsPanelName");
    if (str1 == null || str1.isEmpty())
      throw new e("Settings panel name is a required parameter for Show settings Dialog action."); 
    String str2 = paramProperties.getProperty("ecuConfig");
    if (str2 == null || str2.isEmpty()) {
      r = T.a().c();
    } else {
      r = T.a().c(str2);
    } 
    if (r == null)
      throw new e("EcuConfiguration not found with the provided name."); 
    bv bv = r.e().c(str1);
    if (bv == null)
      throw new e("EcuConfiguration not found with the provided name."); 
  }
  
  public k e() {
    ArrayList<h> arrayList = new ArrayList();
    List list = bM.a(T.a().c());
    for (aA aA : list)
      arrayList.add(new h(aA.d(), aA.e())); 
    this.b.a(arrayList);
    this.b.c("Select the Dialog you want to open when this action is triggered.");
    return this.a;
  }
  
  public boolean f() {
    return true;
  }
  
  public List a(ActionListener paramActionListener) {
    ArrayList<O> arrayList = new ArrayList();
    String str = T.a().c().c();
    O o = new O(T.a().c(), -1);
    t t = new t(this, str, paramActionListener);
    o.setText(g.b(b()));
    o.addActionListener(t);
    arrayList.add(o);
    return arrayList;
  }
  
  public boolean g() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */