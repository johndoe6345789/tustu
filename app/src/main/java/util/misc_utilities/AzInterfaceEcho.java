package aZ;

import G.R;
import ac.AbstractUsingArrayList;
import bH.D;
import bH.c;
import java.io.IOException;
import java.io.OutputStream;

public class AzInterfaceEcho extends AbstractUsingArrayList {
  private static e b = null;

  byte a = 0;

  public static e a() {
    if (b == null) b = new e();
    return b;
  }

  protected void a(R[] paramArrayOfR, OutputStream paramOutputStream) {
    try {
      byte[] arrayOfByte1 = {70, 82, 68, 0, 0, 0, 0, 1};
      paramOutputStream.write(arrayOfByte1);
      paramOutputStream.write(b());
      String str = paramArrayOfR[0].i();
      byte[] arrayOfByte2 = new byte[63];
      for (byte b = 0; b < arrayOfByte2.length; b++)
        arrayOfByte2[b] = (b < str.length()) ? str.getBytes()[b] : 0;
      paramOutputStream.write(arrayOfByte2);
      paramOutputStream.write(0);
      paramOutputStream.write(0);
      paramOutputStream.write(0);
      paramOutputStream.write(81);
      paramOutputStream.write(0);
      paramOutputStream.write(paramArrayOfR[0].O().n());
      paramOutputStream.flush();
    } catch (IOException iOException) {
      D.a("Unable to write to Logfile.", iOException, null);
    }
  }

  private byte[] b() {
    int i = (int) (System.currentTimeMillis() / 1000L);
    return c.a(i, new byte[4], true);
  }

  protected void a(OutputStream paramOutputStream, String paramString) {
    try {
      paramOutputStream.write(2);
      paramOutputStream.write(b());
    } catch (IOException iOException) {
      D.a("Unable to write MARK to Logfile.", iOException, null);
    }
  }

  protected void a(OutputStream paramOutputStream, byte[][] paramArrayOfbyte) {
    try {
      paramOutputStream.write(1);
      this.a = (byte) (this.a + 1);
      paramOutputStream.write(this.a);
      for (byte b = 0; b < (paramArrayOfbyte[0]).length; b++)
        paramOutputStream.write(paramArrayOfbyte[0][b]);
      paramOutputStream.flush();
    } catch (IOException iOException) {
      D.a("Unable to write MARK to Logfile.", iOException, null);
    }
  }

  protected void a(OutputStream paramOutputStream) {}
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aZ/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
