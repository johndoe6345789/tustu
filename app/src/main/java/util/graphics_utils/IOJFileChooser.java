package g;

import V.VInterfaceHotel;
import VInterfaceHotel.i;
import W.n;
import bH.X;
import com.efiAnalytics.ui.bV;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class IOJFileChooser {
  public static JFileChooser a = null;

  public static Object[] a(Object[] paramArrayOfObject) {
    for (byte b = 0; b < paramArrayOfObject.length; b++) {
      for (int i = b + 1; i < paramArrayOfObject.length; i++) {
        double d1 = Double.parseDouble(paramArrayOfObject[b].toString());
        double d2 = Double.parseDouble(paramArrayOfObject[i].toString());
        if (d1 > d2) {
          Object object = paramArrayOfObject[b];
          paramArrayOfObject[b] = paramArrayOfObject[i];
          paramArrayOfObject[i] = object;
        }
      }
    }
    return paramArrayOfObject;
  }

  public static Object[] b(Object[] paramArrayOfObject) {
    for (byte b = 0; b < paramArrayOfObject.length; b++) {
      for (int i = b + 1; i < paramArrayOfObject.length; i++) {
        String str1 = (String) paramArrayOfObject[b];
        String str2 = (String) paramArrayOfObject[i];
        if (str1.compareTo(str2) > 0) {
          paramArrayOfObject[b] = str2;
          paramArrayOfObject[i] = str1;
        }
      }
    }
    return paramArrayOfObject;
  }

  public static String[] a(String[] paramArrayOfString) {
    Arrays.sort(paramArrayOfString, new l());
    return paramArrayOfString;
  }

  public static String[] b(String[] paramArrayOfString) {
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      for (int i = b + 1; i < paramArrayOfString.length; i++) {
        String str1 = paramArrayOfString[b];
        String str2 = paramArrayOfString[i];
        if (str1.compareTo(str2) > 0) {
          paramArrayOfString[b] = str2;
          paramArrayOfString[i] = str1;
        }
      }
    }
    return paramArrayOfString;
  }

  public static String a(String paramString1, String paramString2, String paramString3) {
    return X.b(paramString1, paramString2, paramString3);
  }

  public static void b(String paramString1, String paramString2, String paramString3) {
    String str = "";
    File file = new File(paramString1);
    try {
      FileInputStream fileInputStream = new FileInputStream(file);
      BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
      StringBuffer stringBuffer = new StringBuffer();
      int i = -1;
      while ((i = bufferedInputStream.read()) != -1) stringBuffer.append((char) i);
      bufferedInputStream.close();
      str = stringBuffer.toString();
      str = a(str, paramString2, paramString3);
      byte[] arrayOfByte = str.getBytes();
      File file1 = new File(paramString1);
      FileOutputStream fileOutputStream = new FileOutputStream(file1);
      for (byte b = 0; b < arrayOfByte.length; b++) fileOutputStream.write(arrayOfByte[b]);
      fileOutputStream.close();
    } catch (Exception exception) {
      System.out.println("Error writing replacement file");
      exception.printStackTrace();
      throw new VInterfaceHotel("Error Saving File, check " + i.b + "logFile.txt for more detail.");
    }
  }

  public static String[] a(String paramString1, String paramString2) {
    StringTokenizer stringTokenizer = new StringTokenizer(paramString1, paramString2);
    String[] arrayOfString = new String[stringTokenizer.countTokens()];
    boolean bool = false;
    for (byte b = 0; b < arrayOfString.length && stringTokenizer.hasMoreTokens(); b++)
      arrayOfString[b] = stringTokenizer.nextToken();
    return arrayOfString;
  }

  public static Frame a(Component paramComponent) {
    while (paramComponent != null && !(paramComponent instanceof Frame))
      paramComponent = paramComponent.getParent();
    return (Frame) paramComponent;
  }

  public static void b(Component paramComponent) {
    while (paramComponent != null && !(paramComponent instanceof Frame)) {
      paramComponent.invalidate();
      paramComponent = paramComponent.getParent();
    }
  }

  public static String a(
      Component paramComponent,
      String paramString1,
      String[] paramArrayOfString,
      String paramString2) {
    return a(paramComponent, paramString1, paramArrayOfString, paramString2, true);
  }

  public static boolean a() {
    String str = System.getProperty("os.name", "Windows");
    return str.startsWith("Win");
  }

  public static String a(
      Component paramComponent,
      String paramString1,
      String[] paramArrayOfString,
      String paramString2,
      boolean paramBoolean) {
    String[] arrayOfString =
        a(paramComponent, paramString1, paramArrayOfString, paramString2, paramBoolean, false);
    return (arrayOfString == null || arrayOfString.length < 1) ? null : arrayOfString[0];
  }

  public static String[] a(
      Component paramComponent,
      String paramString1,
      String[] paramArrayOfString,
      String paramString2,
      boolean paramBoolean1,
      boolean paramBoolean2) {
    String str1 = System.getProperty("os.name", "Windows");
    boolean bool = i.a("useSwingFileDialog", true);
    String str2 = "";
    if (paramArrayOfString[0].indexOf(File.separator) != -1)
      paramArrayOfString[0] =
          paramArrayOfString[0].substring(paramArrayOfString[0].lastIndexOf(File.separator) + 1);
    for (byte b = 0; b < paramArrayOfString.length; b++)
      str2 = str2 + "*." + paramArrayOfString[b] + ";";
    if (str2.charAt(str2.length() - 1) == ';') str2 = str2.substring(0, str2.length() - 1);
    if (bool) {
      if (a == null) {
        a = new JFileChooser();
        a.setFileView(new c());
      }
      a.setDialogTitle(paramString1);
      a.setMultiSelectionEnabled(paramBoolean2);
      File file1 = FileSystemView.getFileSystemView().getDefaultDirectory();
      File file2 = new File(file1, "TunerStudioProjects");
      File file3 = file2.exists() ? file2 : file1;
      a.setCurrentDirectory(new File(i.e("lastFileDir" + str2, file3.getAbsolutePath())));
      if (paramString2 != null && !paramString2.equals("")) {
        a.setSelectedFile(new File(paramString2));
      } else if (!paramBoolean1) {
        paramString2 = b() + "." + paramArrayOfString[0];
        a.setSelectedFile(new File(paramString2));
      }
      if (paramArrayOfString != null && paramArrayOfString.length > 0) {
        f f = new f(i.b + " Files(" + str2 + ")");
        a.resetChoosableFileFilters();
        for (byte b1 = 0; b1 < paramArrayOfString.length; b1++) f.b(paramArrayOfString[b1]);
        a.addChoosableFileFilter(f);
      }
      int i = paramBoolean1 ? a.showOpenDialog(paramComponent) : a.showSaveDialog(paramComponent);
      if (i == 0) {
        i.c("lastFileDir" + str2, a.getCurrentDirectory().getAbsolutePath());
        if (paramBoolean2) {
          File[] arrayOfFile = a.getSelectedFiles();
          String[] arrayOfString1 = new String[arrayOfFile.length];
          for (byte b1 = 0; b1 < arrayOfFile.length; b1++)
            arrayOfString1[b1] =
                a.getCurrentDirectory().getAbsolutePath()
                    + File.separator
                    + arrayOfFile[b1].getName();
          return arrayOfString1;
        }
        String[] arrayOfString = new String[1];
        arrayOfString[0] =
            a.getCurrentDirectory().getAbsolutePath()
                + File.separator
                + a.getSelectedFile().getName();
        return arrayOfString;
      }
      return null;
    }
    FileDialog fileDialog = null;
    if (paramBoolean1) {
      fileDialog = new FileDialog(a(paramComponent), paramString1, 0);
    } else {
      fileDialog = new FileDialog(a(paramComponent), paramString1, 1);
    }
    fileDialog.setTitle(paramString1);
    fileDialog.setFile(str2);
    fileDialog.setDirectory(i.e("lastFileDir" + str2, "."));
    fileDialog.setVisible(true);
    if (fileDialog.getFile() != null) {
      i.c("lastFileDir" + str2, fileDialog.getDirectory());
      String[] arrayOfString = new String[1];
      arrayOfString[0] = fileDialog.getDirectory() + fileDialog.getFile();
      return arrayOfString;
    }
    return null;
  }

  public static void a(String paramString, Component paramComponent) {
    a(paramString, paramComponent, false);
  }

  public static boolean a(String paramString, Component paramComponent, boolean paramBoolean) {
    return bV.a(paramString, paramComponent, paramBoolean);
  }

  public static String a(String paramString, boolean paramBoolean, Component paramComponent) {
    return a(
        null,
        paramString,
        paramBoolean,
        "                                   User defined values required for this formula.",
        false,
        paramComponent,
        null);
  }

  public static String a(
      String paramString1,
      boolean paramBoolean1,
      String paramString2,
      boolean paramBoolean2,
      Component paramComponent) {
    return a(
        null, paramString1, paramBoolean1, paramString2, paramBoolean2, paramComponent, null, null);
  }

  public static String a(
      String paramString1,
      String paramString2,
      boolean paramBoolean1,
      String paramString3,
      boolean paramBoolean2,
      Component paramComponent,
      n paramn) {
    return a(
        paramString1,
        paramString2,
        paramBoolean1,
        paramString3,
        paramBoolean2,
        paramComponent,
        null,
        paramn);
  }

  public static String a(
      String paramString1,
      String paramString2,
      boolean paramBoolean1,
      String paramString3,
      boolean paramBoolean2,
      Component paramComponent,
      m paramm,
      n paramn) {
    g g =
        new g(
            bV.a(paramComponent),
            paramString1,
            paramString2,
            paramBoolean1,
            paramString3,
            paramBoolean2,
            paramm,
            paramn);
    paramComponent.requestFocus();
    g.dispose();
    return g.a();
  }

  public static String a(double paramDouble) {
    return a(paramDouble, 1);
  }

  public static String a(double paramDouble, int paramInt) {
    String str = paramDouble + "";
    if (str.indexOf(".0") != -1) {
      str = str.substring(0, str.indexOf(".0"));
    } else if (str.indexOf(".") != -1 && str.length() > str.indexOf(".") + paramInt) {
      str = str.substring(0, str.indexOf(".") + paramInt + 1);
    }
    return str;
  }

  public static Color a(double paramDouble1, double paramDouble2, double paramDouble3) {
    char c = '¯';
    int i = 255 - c;
    int j = (int) (c * (paramDouble1 - paramDouble2) / (paramDouble3 - paramDouble2));
    int m = (int) (c * (paramDouble1 - paramDouble2) / (paramDouble3 - paramDouble2));
    int n = c - m;
    int i1 = Math.abs(m - c / 2);
    return new Color(m + i, n + i, i1);
  }

  public static void a(Frame paramFrame, Dialog paramDialog) {
    Dimension dimension1 = paramFrame.getSize();
    Dimension dimension2 = paramDialog.getSize();
    Point point = paramFrame.getLocation();
    if (point.getX() <= 0.0D || point.getY() <= 0.0D) {
      dimension1 = Toolkit.getDefaultToolkit().getScreenSize();
      paramDialog.setLocation(
          (int) (point.getX() + (dimension1.getWidth() - dimension2.getWidth()) / 2.0D),
          (int) (point.getY() + (dimension1.getHeight() - dimension2.getHeight()) / 2.0D));
    } else {
      paramDialog.setLocation(
          (int) (point.getX() + (dimension1.getWidth() - dimension2.getWidth()) / 2.0D),
          (int) (point.getY() + (dimension1.getHeight() - dimension2.getHeight()) / 2.0D));
    }
  }

  public static String b() {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date());
    return calendar.get(1)
        + "-"
        + a((calendar.get(2) + 1) + "", '0', 2)
        + "-"
        + a(calendar.get(5) + "", '0', 2)
        + "_"
        + a(calendar.get(11) + "", '0', 2)
        + "."
        + a(calendar.get(12) + "", '0', 2)
        + "."
        + a(calendar.get(13) + "", '0', 2);
  }

  public static String a(String paramString, char paramChar, int paramInt) {
    while (paramString.length() < paramInt) paramString = paramChar + paramString;
    return paramString;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/g/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
