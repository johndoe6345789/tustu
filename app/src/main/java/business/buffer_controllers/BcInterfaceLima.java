package business.buffer_controllers;

import ae.AeInterfaceSierra;
import ae.ExceptionInAePackage;
import java.util.logging.Level;
import java.util.logging.Logger;

class BcInterfaceLima implements m {
  AeInterfaceSierra a;

  BcInterfaceLima(k paramk, AeInterfaceSierra params) {
    this.a = params;
  }

  public void a(String paramString, Object paramObject) {
    try {
      this.a.a(paramString, paramObject);
    } catch (ExceptionInAePackage ExceptionInAePackage) {
      Logger.getLogger(k.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) ExceptionInAePackage);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bc/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
