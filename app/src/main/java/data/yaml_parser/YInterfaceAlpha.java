package Y;

import G.R;
import G.SerializableImpl;
import V.ExceptionPrintstacktrace;
import bH.D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class YInterfaceAlpha {
  String a = "\\s+";

  int b = 0;

  int c = 4;

  int d = 5;

  public void a(R paramR, File paramFile, boolean paramBoolean) {
    List list = a(paramFile);
    for (b b : list) {
      SerializableImpl SerializableImpl = paramR.ExceptionPrintstacktrace(b.c());
      if (paramBoolean && SerializableImpl == null) {
        SerializableImpl = new SerializableImpl(paramR.c());
        SerializableImpl.v(b.c());
        try {
          if (b.b() == 1) {
            SerializableImpl.b("U08");
          } else if (b.b() == 2) {
            SerializableImpl.b("U16");
          } else if (b.b() == 4) {
            SerializableImpl.b("S32");
          } else {
            D.b("Invalid size for " + b.c() + " setting to U08");
            SerializableImpl.b("U08");
          }
          SerializableImpl.b(0);
          SerializableImpl.a("scalar");
          SerializableImpl.a(1.0D);
          SerializableImpl.b(0.0D);
          int i = a(paramR);
          SerializableImpl.a(i);
          paramR.a(SerializableImpl);
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(a.class.getName())
              .log(
                  Level.SEVERE,
                  "Bad Param class, shouldn't happen",
                  (Throwable) ExceptionPrintstacktrace);
        }
        continue;
      }
      if (SerializableImpl != null) SerializableImpl.a(b.a());
    }
  }

  private int a(R paramR) {
    int i = 0;
    Iterator<SerializableImpl> iterator = paramR.q();
    while (iterator.hasNext()) {
      SerializableImpl SerializableImpl = iterator.next();
      if (SerializableImpl.a() + SerializableImpl.l() > i)
        i = SerializableImpl.a() + SerializableImpl.l();
    }
    return i;
  }

  public List a(File paramFile) {
    ArrayList<b> arrayList = new ArrayList();
    BufferedReader bufferedReader = new BufferedReader(new FileReader(paramFile));
    try {
      for (String str = bufferedReader.readLine(); str != null; str = bufferedReader.readLine()) {
        String[] arrayOfString = str.split("\\s+");
        if (a(arrayOfString)) {
          int i = Integer.parseInt(arrayOfString[this.c], 16);
          int j = Integer.parseInt(arrayOfString[this.b], 16);
          b b = new b(this);
          b.a(arrayOfString[this.d]);
          b.a(j);
          b.b(i);
          arrayList.add(b);
        }
      }
    } finally {
      try {
        bufferedReader.close();
      } catch (Exception exception) {
        D.c("failed to close reader");
      }
    }
    return arrayList;
  }

  private boolean a(String[] paramArrayOfString) {
    if (paramArrayOfString.length - 1 < this.d) return false;
    if (!a(paramArrayOfString[this.b])) return false;
    if (!a(paramArrayOfString[this.c])) return false;
    int i = Integer.parseInt(paramArrayOfString[this.c], 16);
    return !(i == 0);
  }

  private boolean a(String paramString) {
    try {
      int i = Integer.parseInt(paramString, 16);
      return true;
    } catch (Exception exception) {
      return false;
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/Y/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
