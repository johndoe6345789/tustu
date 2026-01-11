package aP;

import ay.a;
import ay.c;
import bH.D;
import java.awt.Component;
import javax.swing.JMenuItem;
import x.a;

public class ju extends a {
  jw c = new jw(this);
  
  public ju() {
    setText("Dash Configuration Server");
    a(this.c);
    b(this.c);
    a.c().a(new jx(this));
    if (!a.c().e())
      a.c().g(); 
  }
  
  private void a(c paramc) {
    String str = paramc.a("url");
    if (str == null) {
      D.b("Dash Config Service spotted, but does not contain valid url in attributes.");
      return;
    } 
    jy jy = new jy(this, c(paramc), paramc);
    jv jv = new jv(this, str);
    jy.addActionListener(jv);
    add((JMenuItem)jy);
  }
  
  private void b(c paramc) {
    for (Component component : getMenuComponents()) {
      if (component instanceof jy) {
        jy jy = (jy)component;
        if (jy.a().a().equals(paramc.a()) && jy.a().c().equals(paramc.c())) {
          a(jy);
          break;
        } 
      } 
    } 
  }
  
  private String c(c paramc) {
    String str1 = paramc.a("name");
    String str2 = paramc.a("appName");
    if (str2 == null)
      str2 = "TS Dash"; 
    return (str1 == null) ? (str2 + " - IP:" + paramc.c()) : (str2 + " - " + str1 + ", IP:" + paramc.c());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ju.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */