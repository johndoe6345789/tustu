package K;

import G.ArrayListExceptionprintstacktrace;
import G.ArrayListExceptionprintstacktraceInGPackage;
import G.GInterfaceBu;
import G.Manager;
import G.R;
import G.SerializableImpl;
import V.ExceptionExtensionGetmessage;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.ExceptionPrintstacktrace;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KInterfaceEcho implements GInterfaceBu {
  ExceptionPrintstacktrace a = new ExceptionPrintstacktrace();

  R b;

  public KInterfaceEcho(R paramR) {
    this.b = paramR;
  }

  public void a() {}

  public void a(boolean paramBoolean) {
    if (paramBoolean) a(this.b);
  }

  public void a(R paramR) {
    Iterator<ArrayListExceptionprintstacktraceInGPackage> iterator = paramR.e().d();
    while (iterator.hasNext()) {
      ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage =
          iterator.next();
      if (ArrayListExceptionprintstacktraceInGPackage
          instanceof ArrayListExceptionprintstacktrace) {
        ArrayListExceptionprintstacktrace ArrayListExceptionprintstacktrace =
            (ArrayListExceptionprintstacktrace) ArrayListExceptionprintstacktraceInGPackage;
        try {
          a(paramR, ArrayListExceptionprintstacktrace);
        } catch (ExceptionPrintstacktrace g1) {
          Logger.getLogger(e.class.getName())
              .log(
                  Level.WARNING, "Error trying to validate PortEditor addressing.", (Throwable) g1);
        }
      }
    }
  }

  private void a(R paramR, ArrayListExceptionprintstacktrace paramaS) {
    String str = paramaS.r();
    if (str == null || str.isEmpty()) return;
    boolean bool1 = false;
    boolean bool2 = false;
    if (a(paramR, paramaS.m())) bool1 = true;
    if (a(paramR, paramaS.h())) bool1 = true;
    Manager aM1 = paramR.c(str);
    if (aM1 == null) {
      D.b("PortEditor: outputName parameter not found in configuration. " + str);
      return;
    }
    Manager aM2 = paramR.c(paramaS.ExceptionPrintstacktrace());
    if (!aM2.c().equals(aM1.c())) {
      D.b(
          "PortEditor outputOffset and outputName should be the same size! Cannot validate"
              + " offsets.");
      return;
    }
    Manager aM3 = paramR.c(paramaS.t());
    Manager aM4 = paramR.c(paramaS.u());
    Manager aM5 = paramR.c(paramaS.d());
    double[][] arrayOfDouble1 = aM5.i(paramR.h());
    boolean bool = paramR.O().al().equals("XCP");
    double[][] arrayOfDouble2 = aM2.i(paramR.h());
    double[][] arrayOfDouble3 = aM1.i(paramR.h());
    double[][] arrayOfDouble4 = (aM3 != null) ? aM3.i(paramR.h()) : null;
    double[][] arrayOfDouble5 = (aM3 != null) ? aM4.i(paramR.h()) : null;
    for (byte b = 0; b < (arrayOfDouble2[0]).length; b++) {
      if (arrayOfDouble1[b][0] != 0.0D) {
        for (byte b1 = 0; b1 < arrayOfDouble2.length; b1++) {
          double d1 = arrayOfDouble2[b1][b];
          double d2 = arrayOfDouble3[b1][b];
          SerializableImpl SerializableImpl = a(paramR, (int) d1, aM2, bool);
          if (d2 > 0.0D) {
            boolean bool3 = false;
            if (SerializableImpl == null) {
              D.d("PortEditor: No channel at offset/address, updating.");
              bool3 = true;
            } else {
              this.a.a();
              this.a.a(SerializableImpl.aL().getBytes());
              if (this.a.b() != d2) {
                D.d("PortEditor offset/address does not match name crc, updating.");
                bool3 = true;
              }
            }
            if (bool3) {
              SerializableImpl = a(paramR, d2);
              if (SerializableImpl == null) {
                D.b(
                    "No Channel found in configuration for crc: "
                        + d2
                        + ", no way to know this port is using valid conditions!");
                arrayOfDouble3[b1][b] = 0.0D;
                try {
                  aM1.a(paramR.h(), arrayOfDouble3);
                  paramR.I();
                } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
                  D.b(
                      "Attempted to set invalid offset values in PortEditor! Message: "
                          + ExceptionExtensionGetmessage.getLocalizedMessage());
                }
              } else {
                if (bool) {
                  if (aM2.e() >= 4) {
                    arrayOfDouble2[b1][b] = SerializableImpl.x();
                  } else {
                    arrayOfDouble2[b1][b] = (SerializableImpl.x() - paramR.O().af());
                  }
                } else {
                  arrayOfDouble2[b1][b] = SerializableImpl.a();
                }
                D.d(
                    "Updated PortEditor channel based on crc. condition:"
                        + b1
                        + ", offsetIndex:"
                        + b
                        + " Channel assigned: "
                        + SerializableImpl.aL());
                bool1 = true;
              }
            }
          }
        }
      } else {
        if (arrayOfDouble4 != null && arrayOfDouble4[b][0] != 0.0D) {
          arrayOfDouble4[b][0] = 0.0D;
          bool2 = true;
        }
        if (arrayOfDouble5 != null && arrayOfDouble5[b][0] != 0.0D) {
          arrayOfDouble5[b][0] = 0.0D;
          bool2 = true;
        }
      }
    }
    if (bool2) {
      if (aM3 != null)
        try {
          aM3.a(paramR.h(), arrayOfDouble4);
        } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
          D.b(
              "Attempted to set 0.0 on delay, this should be allowed. Message: "
                  + ExceptionExtensionGetmessage.getLocalizedMessage());
        }
      if (aM4 != null)
        try {
          aM4.a(paramR.h(), arrayOfDouble5);
        } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
          D.b(
              "Attempted to set 0.0 on delay, this should be allowed. Message: "
                  + ExceptionExtensionGetmessage.getLocalizedMessage());
        }
    }
    if (bool1)
      try {
        aM2.a(paramR.h(), arrayOfDouble2);
        paramR.I();
        D.d("Updated PortEditor");
      } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
        D.b(
            "Attempted to set invalid offset values in PortEditor! Message: "
                + ExceptionExtensionGetmessage.getLocalizedMessage());
      }
  }

  private boolean a(R paramR, String paramString) {
    Manager Manager = paramR.c(paramString);
    if (Manager == null) {
      D.b("Parameter not found, cannot perform specific check: " + paramString);
      return false;
    }
    boolean bool = false;
    List list = Manager.ExceptionExtensionGetmessage();
    if (list != null && !list.isEmpty()) {
      double[][] arrayOfDouble = Manager.i(paramR.p());
      for (byte b = 0; b < arrayOfDouble.length; b++) {
        for (byte b1 = 0; b1 < (arrayOfDouble[0]).length; b1++) {
          if (!list.contains(Double.valueOf(arrayOfDouble[b][b1]))) {
            arrayOfDouble[b][b1] = ((Double) list.get(0)).doubleValue();
            bool = true;
          }
        }
      }
      if (bool)
        try {
          Manager.a(paramR.h(), arrayOfDouble);
        } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
          D.b(ExceptionExtensionGetmessage.getMessage());
        }
    }
    return bool;
  }

  private SerializableImpl a(R paramR, int paramInt, Manager paramaM, boolean paramBoolean) {
    Iterator<SerializableImpl> iterator = paramR.K().q();
    while (iterator.hasNext()) {
      SerializableImpl SerializableImpl = iterator.next();
      if (paramBoolean) {
        long l;
        if (paramaM == null || paramaM.e() < 4) {
          l = SerializableImpl.x() - paramR.O().af();
        } else {
          l = SerializableImpl.x();
        }
        if (SerializableImpl.b().equals("scalar") && l == paramInt) return SerializableImpl;
        continue;
      }
      if (SerializableImpl.b().equals("scalar") && SerializableImpl.a() == paramInt)
        return SerializableImpl;
    }
    return null;
  }

  private SerializableImpl a(R paramR, double paramDouble) {
    Iterator<SerializableImpl> iterator = paramR.K().q();
    while (iterator.hasNext()) {
      SerializableImpl SerializableImpl = iterator.next();
      if (SerializableImpl.b().equals("scalar")) {
        this.a.a();
        this.a.a(SerializableImpl.aL().getBytes());
        if (this.a.b() == paramDouble) return SerializableImpl;
      }
    }
    return null;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/K/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
