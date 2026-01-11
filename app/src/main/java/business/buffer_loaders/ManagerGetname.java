package bl;

import G.CloneableImplInGPackage;
import com.efiAnalytics.plugin.ecu.UiCurve;
import java.util.ArrayList;
import java.util.List;

public class ManagerGetname implements UiCurve {
  private String a = null;
  
  private List b = new ArrayList();
  
  private String c = null;
  
  private List d = new ArrayList();
  
  private String e = null;
  
  public String getName() {
    return this.a;
  }
  
  public void a(String paramString) {
    this.a = paramString;
  }
  
  public String getYAxisOutputChannelName() {
    return this.c;
  }
  
  public void b(String paramString) {
    this.c = paramString;
  }
  
  public String getXAxisOutputChannelName() {
    return this.e;
  }
  
  public void c(String paramString) {
    this.e = paramString;
  }
  
  public int getYAxisParameterCount() {
    return (this.b == null) ? 0 : this.b.size();
  }
  
  public String getYAxisParameterName(int paramInt) {
    return this.b.get(paramInt);
  }
  
  public int getXAxisParameterCount() {
    return (this.d == null) ? 0 : this.d.size();
  }
  
  public String getXAxisParameterName(int paramInt) {
    return this.d.get(paramInt);
  }
  
  public static g a(CloneableImplInGPackage parambm) {
    g g1 = new g();
    g1.a(parambm.aL());
    g1.c(parambm.l());
    byte b;
    for (b = 0; b < parambm.j(); b++)
      g1.d.add(parambm.d(b)); 
    g1.b(parambm.f());
    for (b = 0; b < parambm.d(); b++)
      g1.b.add(parambm.b(b)); 
    return g1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bl/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */