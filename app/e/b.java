package e;

import bH.D;
import d.c;
import d.i;
import d.k;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class b implements c {
  public String a() {
    return "shellCommand";
  }
  
  public String b() {
    return "Execute a Shell Command";
  }
  
  public String c() {
    return "Other Actions";
  }
  
  public boolean d() {
    return true;
  }
  
  public void a(Properties paramProperties) {
    String str = paramProperties.getProperty("Shell_Command");
    if (str == null) {
      D.b("Execute a Shell Command: Command not defined! Cannont execute process.");
    } else {
      try {
        Runtime.getRuntime().exec(str);
      } catch (IOException iOException) {
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, iOException);
      } 
    } 
  }
  
  public void b(Properties paramProperties) {}
  
  public k e() {
    k k = new k();
    i i = new i("Shell_Command", null);
    i.c("Set to the command you want executed. This would be a command as you would type in to a terminal or prompt for the OS you are using.");
    k.a(i);
    return k;
  }
  
  public boolean f() {
    return true;
  }
  
  public boolean g() {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/e/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */