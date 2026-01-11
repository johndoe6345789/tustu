package aR;

import aP.dd;
import aP.f;
import aP.id;
import com.efiAnalytics.ui.bV;
import d.c;
import d.e;
import d.k;
import java.util.Properties;
import javax.swing.filechooser.FileView;

public class a implements c {
  public String b() {
    return "Browse Projects";
  }
  
  public String c() {
    return "Project";
  }
  
  public boolean d() {
    return true;
  }
  
  public void a(Properties paramProperties) {
    try {
      if (!bV.f())
        bV.a((FileView)new id()); 
      f.a().c(dd.a().c());
    } catch (Exception exception) {
      throw new e(exception.getLocalizedMessage());
    } 
  }
  
  public String a() {
    return "browseProjects";
  }
  
  public void b(Properties paramProperties) {}
  
  public k e() {
    return null;
  }
  
  public boolean f() {
    return false;
  }
  
  public boolean g() {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */