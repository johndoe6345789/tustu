package aR;

import G.T;
import V.a;
import aE.a;
import aP.dd;
import br.f;
import d.c;
import d.e;
import d.i;
import d.k;
import java.util.ArrayList;
import java.util.Properties;
import s.g;

public class y implements c {
  public static String a = "stopAutoTune";
  
  public static String b = "tableIndex";
  
  k c = new k();
  
  public String a() {
    return a;
  }
  
  public String b() {
    return g.b("Stop Auto Tune");
  }
  
  public String c() {
    return "Project";
  }
  
  public boolean d() {
    return (T.a().c() != null && a.A() != null);
  }
  
  public void a(Properties paramProperties) {
    int i;
    String str = paramProperties.getProperty(b);
    if (str == null)
      throw new e("Table Index is required."); 
    try {
      i = Integer.parseInt(str);
    } catch (Exception exception) {
      throw new e("Invalid Table Index: " + str);
    } 
    try {
      f.a().b(i);
    } catch (a a) {
      throw new e(a.getLocalizedMessage());
    } 
  }
  
  public void b(Properties paramProperties) {
    int i;
    String str = paramProperties.getProperty(b);
    if (str == null)
      throw new e("Table Index is required."); 
    try {
      i = Integer.parseInt(str);
    } catch (Exception exception) {
      throw new e("Invalid Table Index: " + str);
    } 
    if (dd.a().o() != null && (i < 0 || i > dd.a().o().c()))
      throw new e("Invalid Table Index: " + str); 
  }
  
  public k e() {
    this.c.clear();
    i i = new i(b, "");
    i.a(0);
    if (dd.a().o() != null) {
      int j = dd.a().o().c();
      ArrayList<String> arrayList = new ArrayList();
      for (byte b = 0; b <= j; b++)
        arrayList.add(Integer.toString(b)); 
      i.a(arrayList);
    } 
    i.c("This is the index of the Tab in which you wish to start Auto Tune on. It starts with tab 0 and increase as you move to the right.");
    this.c.a(i);
    return this.c;
  }
  
  public boolean f() {
    return true;
  }
  
  public boolean g() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */