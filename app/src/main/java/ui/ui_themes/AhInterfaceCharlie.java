package ah;

import A.IO;
import A.AInterfaceRomeo;
import A.Exception;
import B.l;
import G.l;
import ae.AeInterfaceDelta;
import ae.FileUsingHashMap;
import ae.IOInAePackage;
import ae.Exception;
import ae.AeInterfaceUniform;
import ae.ExceptionExtensionInAePackage;
import bH.D;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AhInterfaceCharlie implements Exception {
  List a = new ArrayList();
  
  private static final byte[] c = new byte[] { 2, 0, 0, 0, -1, 0 };
  
  private static final byte[] AeInterfaceDelta = new byte[] { 1, 0, 1, 0, -2 };
  
  File b = null;
  
  public List a(FileUsingHashMap paramk) {
    return this.a;
  }
  
  public List b(FileUsingHashMap paramk) {
    return this.a;
  }
  
  public void a(String paramString, Object paramObject) {}
  
  public AeInterfaceDelta a(FileUsingHashMap paramk, IOInAePackage paramp, AeInterfaceUniform paramu) {
    AeInterfaceDelta AeInterfaceDelta = new AeInterfaceDelta();
    c(paramp);
    byte b = 0;
    while (!a(paramp)) {
      paramu.b("Power On BigStuff3 Gen4");
      if (b++ > 3) {
        String str = "BigStuff3 Gen4 box not found, firmware load cancelled.";
        paramu.a(str);
        AeInterfaceDelta.a(AeInterfaceDelta.b);
        AeInterfaceDelta.a(str);
        return AeInterfaceDelta;
      } 
    } 
    String str1 = b(paramp);
    if (str1 == null) {
      AeInterfaceDelta.a(AeInterfaceDelta.b);
      AeInterfaceDelta.a("Failed to get IP Address for Controller.");
      return AeInterfaceDelta;
    } 
    a a = new a(str1, 21);
    a.a("sdcard");
    a.b("sdcard");
    paramu.a("Sending Firmware to Controller.");
    this.b = paramk.g();
    AeInterfaceDelta = a.a(this.b, paramu);
    if (AeInterfaceDelta.a() != AeInterfaceDelta.a)
      return AeInterfaceDelta; 
    String str2 = "Power off your BigStuff3 Gen4";
    if (!paramu.b(str2)) {
      AeInterfaceDelta.a(AeInterfaceDelta.b);
      AeInterfaceDelta.a("Cancelled by user.");
      return AeInterfaceDelta;
    } 
    str2 = "Connect 12 volts to Pin Y2 on Hdr2 Connector (on the opposite side of the Engine Connector)";
    if (!paramu.b(str2)) {
      AeInterfaceDelta.a(AeInterfaceDelta.b);
      AeInterfaceDelta.a("Cancelled by user.");
      return AeInterfaceDelta;
    } 
    str2 = "Power On the BigStuff3 Gen4";
    if (!paramu.b(str2)) {
      AeInterfaceDelta.a(AeInterfaceDelta.b);
      AeInterfaceDelta.a("Cancelled by user.");
      return AeInterfaceDelta;
    } 
    AeInterfaceDelta.a(AeInterfaceDelta.a);
    return AeInterfaceDelta;
  }
  
  private String b(IOInAePackage paramp) {
    IO IO = paramp.a();
    return (String)IO.a(l.j);
  }
  
  public AeInterfaceDelta a(IOInAePackage paramp, AeInterfaceUniform paramu) {
    AeInterfaceDelta AeInterfaceDelta = new AeInterfaceDelta();
    byte b = 0;
    String str = "Power Off the BigStuff3 Gen4";
    if (!paramu.b(str)) {
      AeInterfaceDelta.a(AeInterfaceDelta.b);
      AeInterfaceDelta.a("Cancelled by user.");
      return AeInterfaceDelta;
    } 
    str = "Disconnect the 12 volts to Pin Y2 on Hdr2 Connector";
    if (!paramu.b(str)) {
      AeInterfaceDelta.a(AeInterfaceDelta.b);
      AeInterfaceDelta.a("Cancelled by user.");
      return AeInterfaceDelta;
    } 
    while (true) {
      str = "Power On the BigStuff3 Gen4";
      if (!paramu.b(str)) {
        AeInterfaceDelta.a(AeInterfaceDelta.b);
        AeInterfaceDelta.a("Cancelled by user.");
        return AeInterfaceDelta;
      } 
      if (b++ > 2) {
        AeInterfaceDelta.a(AeInterfaceDelta.b);
        AeInterfaceDelta.a("Cannot connect.");
        return AeInterfaceDelta;
      } 
      if (a(paramp)) {
        a a = new a("192.168.4.7", 21);
        a.a("sdcard");
        a.b("sdcard");
        a.a(this.b);
        return AeInterfaceDelta;
      } 
    } 
  }
  
  public boolean a(IOInAePackage paramp) {
    try {
      paramp.a().g();
      paramp.a().IO();
      byte[] arrayOfByte = paramp.a(c, 12);
      if (arrayOfByte != null && arrayOfByte.length == 12 && arrayOfByte[4] == -1) {
        D.c("Connect! " + bH.c.AeInterfaceDelta(arrayOfByte));
        paramp.a(AeInterfaceDelta, 0);
        return true;
      } 
      if (arrayOfByte == null) {
        D.a("null response received on connect");
        return false;
      } 
      if (arrayOfByte.length != 12) {
        D.a("wrong len response received on connect: " + arrayOfByte.length);
        return false;
      } 
      if (arrayOfByte[4] != -1) {
        D.a("Negative response received on connect");
        return false;
      } 
      D.a("Unknown failure on connect");
      return false;
    } catch (IOException iOException) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Unable to send connect", iOException);
      return false;
    } catch (ExceptionExtensionInAePackage ExceptionExtensionInAePackage) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Shouldn't get a protocol exception", (Throwable)ExceptionExtensionInAePackage);
      return false;
    } catch (l l) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Unable to connect", (Throwable)l);
      return false;
    } 
  }
  
  private IOInAePackage c(IOInAePackage paramp) {
    try {
      IO f1 = paramp.a();
      f1.g();
      IO f2 = f1.getClass().newInstance();
      for (AInterfaceRomeo AInterfaceRomeo : f1.l()) {
        try {
          f2.a(AInterfaceRomeo.c(), f1.a(AInterfaceRomeo.c()));
        } catch (Exception s1) {
          Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to set: " + AInterfaceRomeo.c(), (Throwable)s1);
        } 
      } 
      paramp.a(f2);
      f2.IO();
    } catch (InstantiationException instantiationException) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to copy ControllerInterface", instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to copy ControllerInterface 2", illegalAccessException);
    } catch (l l) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to connect.", (Throwable)l);
    } 
    return paramp;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ah/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */