package ah;

import G.AeInterfaceMikeTostring;
import G.GInterfaceCr;
import G.GInterfaceCv;
import ae.AeInterfaceDelta;
import ae.FileUsingHashMap;
import ae.AeInterfaceMike;
import ae.IOInAePackage;
import ae.AeInterfaceQuebec;
import ae.AeInterfaceUniform;
import bH.D;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadedInAhPackage implements AeInterfaceQuebec {
  List a = new ArrayList();
  
  List b = new ArrayList();
  
  c c = new c();
  
  public ThreadedInAhPackage() {
    this.b.add(this.c);
  }
  
  public String a() {
    return "BigStuff3 Gen4 Firmware Loader";
  }
  
  public String b() {
    return "BigStuff3 Gen4 Type 1 Firmware Loader.";
  }
  
  public List c() {
    return this.b;
  }
  
  public List AeInterfaceDelta() {
    return this.b;
  }
  
  public GInterfaceCr a(AeInterfaceMikeTostring parambT) {
    return null;
  }
  
  public GInterfaceCv b(AeInterfaceMikeTostring parambT) {
    return null;
  }
  
  public boolean a(AeInterfaceMike paramm) {
    return true;
  }
  
  public boolean a(FileUsingHashMap paramk) {
    return true;
  }
  
  public AeInterfaceDelta a(FileUsingHashMap paramk, IOInAePackage paramp, AeInterfaceUniform paramu) {
    AeInterfaceDelta AeInterfaceDelta = new AeInterfaceDelta();
    int i = 120000;
    paramu.a("Installing Firmware. Do not power off!");
    paramu.a(0.0D);
    long l = System.currentTimeMillis();
    boolean bool = false;
    while (!bool) {
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      bool = this.c.a(paramp);
      D.c("boxIsBack = " + bool);
      if (bool) {
        paramu.a(1.0D);
        continue;
      } 
      if ((System.currentTimeMillis() - l) > i * 1.5D) {
        AeInterfaceDelta.a(AeInterfaceDelta.c);
        paramu.a("Controller should have responded by now. Disconnect Boot jump and power cycle.");
        return AeInterfaceDelta;
      } 
      paramu.a(((float)(System.currentTimeMillis() - l) / i));
    } 
    if (System.currentTimeMillis() - l < (i / 3)) {
      AeInterfaceDelta.a(AeInterfaceDelta.b);
      String str = "Controller not Boot Strapped.\nMake sure Pin Y2 is to 12 Volts. Then Power Cycle.";
      paramu.a(str);
      AeInterfaceDelta.a(str);
      return AeInterfaceDelta;
    } 
    AeInterfaceDelta.a(AeInterfaceDelta.a);
    return AeInterfaceDelta;
  }
  
  public boolean a(AeInterfaceMike paramm, File paramFile) {
    return true;
  }
  
  public boolean b(AeInterfaceMike paramm, File paramFile) {
    return true;
  }
  
  public String a(File paramFile) {
    return "Unverified BigStuff Gen4 firmware";
  }
  
  public String e() {
    return "https://bigstuff3efi.com/";
  }
  
  public AeInterfaceMikeTostring a(IOInAePackage paramp) {
    return new AeInterfaceMikeTostring();
  }
  
  public void f() {}
  
  public void a(String paramString) {}
  
  public boolean g() {
    return false;
  }
  
  public List b(AeInterfaceMike paramm) {
    return new ArrayList();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ah/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */