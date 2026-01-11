package aP;

import ay.AyInterfaceAlpha;
import ay.AyInterfaceCharlie;
import bH.D;
import java.awt.Component;
import javax.swing.JMenuItem;
import x.AyInterfaceAlpha;

public class ju extends AyInterfaceAlpha {
  jw AyInterfaceCharlie = new jw(this);
  
  public ju() {
    setText("Dash Configuration Server");
    AyInterfaceAlpha(this.AyInterfaceCharlie);
    b(this.AyInterfaceCharlie);
    AyInterfaceAlpha.AyInterfaceCharlie().AyInterfaceAlpha(new jx(this));
    if (!AyInterfaceAlpha.AyInterfaceCharlie().e())
      AyInterfaceAlpha.AyInterfaceCharlie().g(); 
  }
  
  private void AyInterfaceAlpha(AyInterfaceCharlie paramc) {
    String str = paramc.AyInterfaceAlpha("url");
    if (str == null) {
      D.b("Dash Config Service spotted, but does not contain valid url in attributes.");
      return;
    } 
    jy jy = new jy(this, AyInterfaceCharlie(paramc), paramc);
    jv jv = new jv(this, str);
    jy.addActionListener(jv);
    add((JMenuItem)jy);
  }
  
  private void b(AyInterfaceCharlie paramc) {
    for (Component component : getMenuComponents()) {
      if (component instanceof jy) {
        jy jy = (jy)component;
        if (jy.AyInterfaceAlpha().AyInterfaceAlpha().equals(paramc.AyInterfaceAlpha()) && jy.AyInterfaceAlpha().AyInterfaceCharlie().equals(paramc.AyInterfaceCharlie())) {
          AyInterfaceAlpha(jy);
          break;
        } 
      } 
    } 
  }
  
  private String AyInterfaceCharlie(AyInterfaceCharlie paramc) {
    String str1 = paramc.AyInterfaceAlpha("name");
    String str2 = paramc.AyInterfaceAlpha("appName");
    if (str2 == null)
      str2 = "TS Dash"; 
    return (str1 == null) ? (str2 + " - IP:" + paramc.AyInterfaceCharlie()) : (str2 + " - " + str1 + ", IP:" + paramc.AyInterfaceCharlie());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ju.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */