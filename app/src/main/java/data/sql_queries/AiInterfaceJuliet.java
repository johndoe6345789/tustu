package aI;

import G.R;
import G.m;
import G.o;
import W.IOExceptioninvpackage;
import bH.D;
import bH.c;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;
import com.efiAnalytics.remotefileaccess.RemoteFileDescriptor;
import java.util.ArrayList;
import java.util.List;

public class AiInterfaceJuliet {
  R a = null;

  int[] b = null;

  public AiInterfaceJuliet(R paramR) {
    this.a = paramR;
  }

  public void a() {
    this.b = null;
  }

  public List a(int paramInt) {
    ArrayList arrayList = new ArrayList();
    boolean bool = true;
    char c = 'ú';
    byte b = 0;
    do {
      bool = a(arrayList, b++);
    } while (bool && b < c && (paramInt < 0 || paramInt >= arrayList.size()));
    return arrayList;
  }

  private boolean a(List paramList, int paramInt) {
    ArrayList<m> arrayList = new ArrayList();
    m m1 = d.b(this.a.O(), paramInt);
    m1.i(30);
    arrayList.add(m1);
    m m2 = d.c(this.a.O());
    arrayList.add(m2);
    m m3 = m.a(this.a.O(), arrayList);
    m3.v("Dir List Chunk: " + paramInt);
    o o = o.d(this.a);
    o o1 = o.a(m3, false, 1500);
    if (o1 == null)
      throw new RemoteAccessException("Unable to read MS3 SD Directory Listing. No Response");
    if (o1.a() == 3)
      throw new RemoteAccessException(
          "Unable to read MS3 SD Directory Listing. \nMessage:\n" + o1.c());
    if (this.b != null && c.b(this.b, o1.e())) {
      D.b("SD Dir read, Firmware has began returning redundant data. Aborting further reads.");
      return false;
    }
    this.b = o1.e();
    return a(paramList, o1.e());
  }

  private boolean a(List<RemoteFileDescriptor> paramList, int[] paramArrayOfint) {
    if (paramArrayOfint == null || b(paramArrayOfint)) return false;
    int[] arrayOfInt = new int[32];
    int i;
    for (i = 0; i + arrayOfInt.length < paramArrayOfint.length; i += arrayOfInt.length) {
      try {
        System.arraycopy(paramArrayOfint, i, arrayOfInt, 0, arrayOfInt.length);
        RemoteFileDescriptor remoteFileDescriptor = a(arrayOfInt);
        if (remoteFileDescriptor != null
            && remoteFileDescriptor.getName() != null
            && !remoteFileDescriptor.getName().equals(".")) paramList.add(remoteFileDescriptor);
      } catch (k k) {
      }
    }
    return true;
  }

  private RemoteFileDescriptor a(int[] paramArrayOfint) {
    RemoteFileDescriptor remoteFileDescriptor = null;
    if (paramArrayOfint != null
        && paramArrayOfint.length == 32
        && (paramArrayOfint[11] & 0x8) == 0
        && (paramArrayOfint[11] & 0x10) == 0
        && (paramArrayOfint[11] & 0x40) == 0
        && (paramArrayOfint[11] & 0x4) == 0
        && paramArrayOfint[11] > 0
        && paramArrayOfint[0] != 229
        && paramArrayOfint[0] != 0
        && paramArrayOfint[0] != 46
        && paramArrayOfint[0] != 255
        && paramArrayOfint[0] >= 32
        && paramArrayOfint[0] < 128) {
      remoteFileDescriptor = new RemoteFileDescriptor();
      int[] arrayOfInt1 = new int[8];
      int[] arrayOfInt2 = new int[3];
      System.arraycopy(paramArrayOfint, 0, arrayOfInt1, 0, arrayOfInt1.length);
      System.arraycopy(paramArrayOfint, arrayOfInt1.length, arrayOfInt2, 0, arrayOfInt2.length);
      String str1 = new String(c.a(arrayOfInt1));
      str1 = str1.trim();
      String str2 = new String(c.a(arrayOfInt2));
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str1);
      stringBuilder.append('.');
      stringBuilder.append(str2);
      remoteFileDescriptor.setName(stringBuilder.toString());
      int[] arrayOfInt3 = new int[4];
      System.arraycopy(paramArrayOfint, 14, arrayOfInt3, 0, 4);
      int i = c.b(arrayOfInt3, 0, 4, false, true);
      remoteFileDescriptor.setLastModified(IOExceptioninvpackage.a(i).getTime());
      long l1 = c.c(paramArrayOfint, 18, 4, true, true);
      D.c("Sector Number: " + l1);
      v v = new v();
      v.a(l1);
      remoteFileDescriptor.setDirectory(v);
      long l2 = c.c(paramArrayOfint, 28, 4, false, true);
      remoteFileDescriptor.setSize(l2);
      if (remoteFileDescriptor.getSize() < 0L
          || remoteFileDescriptor.getDirectory().getNumericId() < 0L) {
        String str = c.a(remoteFileDescriptor.getName());
        D.c(
            "File: "
                + str
                + " read from SD, but the size or sector can not be valid. Size:="
                + remoteFileDescriptor.getSize()
                + ", sector="
                + remoteFileDescriptor.getDirectory().getNumericId());
        remoteFileDescriptor = null;
      }
    } else if (paramArrayOfint == null
        || paramArrayOfint.length < 32
        || paramArrayOfint[0] == 0
        || paramArrayOfint[0] == 255) {
      throw new k(this);
    }
    return remoteFileDescriptor;
  }

  private boolean b(int[] paramArrayOfint) {
    for (int i = 0; i < paramArrayOfint.length; i += 32) {
      if (paramArrayOfint[i] != 0) return false;
    }
    return true;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aI/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
