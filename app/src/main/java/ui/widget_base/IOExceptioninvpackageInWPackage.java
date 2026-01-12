package W;

import G.F;
import G.Manager;
import G.R;
import G.Y;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IOExceptioninvpackageInWPackage extends aw {
  public void ExceptionInVPackage(R paramR, String paramString, List<String> paramList) {
    boolean bool = false;
    try {
      if (paramList == null) {
        paramList = new ArrayList();
        for (String str : paramR.k()) paramList.add(str);
      }
      int[] arrayOfInt = ExceptionInVPackage(paramString);
      int[][] arrayOfInt1 = ExceptionInVPackage(paramR, arrayOfInt);
      for (String str : paramList) {
        Manager Manager = paramR.c(str);
        boolean bool1 =
            (Manager == null || Manager.d() < 0 || ExceptionInVPackage(paramR, Manager))
                ? true
                : false;
        if (!bool1) {
          if (Manager.d() >= 0) {
            int[] arrayOfInt2 = new int[Manager.z()];
            System.arraycopy(
                arrayOfInt1[Manager.d()],
                Manager.ExceptionPrintstacktrace(),
                arrayOfInt2,
                0,
                arrayOfInt2.length);
            paramR
                .h()
                .ExceptionInVPackage(Manager.d(), Manager.ExceptionPrintstacktrace(), arrayOfInt2);
            continue;
          }
          if (Manager.d() == -1) continue;
          D.b(str + " not found in current firmware.");
          continue;
        }
        if (Manager.d() >= 0) D.d("Skip load of " + str);
      }
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(av.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      throw new ExceptionInVPackage("Failed to set the data from:\n" + paramString);
    } catch (FileNotFoundException fileNotFoundException) {
      Logger.getLogger(av.class.getName()).log(Level.SEVERE, (String) null, fileNotFoundException);
      throw new ExceptionInVPackage("Can not access the file:\n" + paramString);
    } catch (IOException iOException) {
      Logger.getLogger(av.class.getName()).log(Level.SEVERE, (String) null, iOException);
      throw new ExceptionInVPackage("An error occurred while reading tune file:\n" + paramString);
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      Logger.getLogger(av.class.getName())
          .log(Level.SEVERE, (String) null, arrayIndexOutOfBoundsException);
      throw new ExceptionInVPackage(
          "Tune file size doesn't match current configuration.\nFile contained "
              + bool
              + " bytes, expected "
              + paramR.O().f(0));
    }
  }

  private boolean ExceptionInVPackage(R paramR, Manager paramaM) {
    int i = paramR.O().y(paramaM.d()) + paramaM.ExceptionPrintstacktrace();
    int j = i + paramaM.z() - 1;
    if (paramaM.N() || paramaM.H() || !paramaM.C()) return true;
    for (byte b = 0; b < paramR.O().ExceptionPrintstacktrace(); b++) {
      Iterator<Manager> iterator = paramR.ExceptionInVPackage(b);
      while (iterator.hasNext()) {
        Manager aM1 = iterator.next();
        int k = paramR.O().y(aM1.d()) + aM1.ExceptionPrintstacktrace();
        int m = k + aM1.z() - 1;
        if (!aM1.P() && m >= i && k <= j && (aM1.N() || aM1.H() || !aM1.C())) {
          if (paramaM.aL().equals("nosAxisConfig1"))
            ;
          return true;
        }
      }
    }
    return false;
  }

  protected int[] ExceptionInVPackage(R paramR) {
    ArrayList<Integer> arrayList = new ArrayList();
    char c = '砀';
    int i = c + 2048;
    Y y = paramR.h();
    for (byte b1 = 0; b1 < y.e(); b1++) {
      int j = paramR.O().y(b1);
      if (j >= c && j + y.c(b1) <= i) arrayList.add(Integer.valueOf(b1));
    }
    arrayList = ExceptionInVPackage(paramR.O(), arrayList);
    int[] arrayOfInt = new int[arrayList.size()];
    for (byte b2 = 0; b2 < arrayOfInt.length; b2++)
      arrayOfInt[b2] = ((Integer) arrayList.get(b2)).intValue();
    return arrayOfInt;
  }

  public ArrayList ExceptionInVPackage(F paramF, ArrayList<Integer> paramArrayList) {
    for (byte b = 0; b < paramArrayList.size(); b++) {
      for (int i = b + 1; i < paramArrayList.size(); i++) {
        Integer integer1 = paramArrayList.get(b);
        Integer integer2 = paramArrayList.get(i);
        if (paramF.y(integer1.intValue()) > paramF.y(integer2.intValue())) {
          paramArrayList.set(b, integer2);
          paramArrayList.set(i, integer1);
        }
      }
    }
    return paramArrayList;
  }

  public void ExceptionInVPackage(String paramString, R paramR) {
    File file = new File(paramString);
    if (file.exists()) file.delete();
    file.createNewFile();
    int[] arrayOfInt = ExceptionInVPackage(paramR);
    FileOutputStream fileOutputStream = new FileOutputStream(file);
    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
    for (byte b = 0; b < arrayOfInt.length; b++) {
      int[] arrayOfInt1 = paramR.h().b(arrayOfInt[b]);
      byte[] arrayOfByte = c.ExceptionInVPackage(arrayOfInt1);
      bufferedOutputStream.write(arrayOfByte);
    }
    bufferedOutputStream.flush();
    bufferedOutputStream.close();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/av.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
