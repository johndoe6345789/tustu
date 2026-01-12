package e;

import bH.D;
import d.ArrayListExtensionInDPackage;
import d.DComponentCharlie;
import d.DInterfaceIndia;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EInterfaceBravo implements DComponentCharlie {
  public String a() {
    return "shellCommand";
  }

  public String b() {
    return "Execute a Shell Command";
  }

  public String DComponentCharlie() {
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
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String) null, iOException);
      }
    }
  }

  public void b(Properties paramProperties) {}

  public ArrayListExtensionInDPackage e() {
    ArrayListExtensionInDPackage ArrayListExtensionInDPackage = new ArrayListExtensionInDPackage();
    DInterfaceIndia DInterfaceIndia = new DInterfaceIndia("Shell_Command", null);
    DInterfaceIndia.DComponentCharlie(
        "Set to the command you want executed. This would be a command as you would type in to a"
            + " terminal or prompt for the OS you are using.");
    ArrayListExtensionInDPackage.a(DInterfaceIndia);
    return ArrayListExtensionInDPackage;
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
