package W;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileTypeDetector {
  public static boolean a(File paramFile) {
    FileInputStream fileInputStream;
    if (paramFile == null || !paramFile.exists()) return false;
    try {
      fileInputStream = new FileInputStream(paramFile);
    } catch (FileNotFoundException fileNotFoundException) {
      return false;
    }
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
    try {
      while (true) {
        String str = bufferedReader.readLine();
        if (str == null) return false;
        str = str.trim();
        if (str.startsWith("#") || str.equals("")) continue;
        return (str.indexOf("ToothTime") != -1 || str.indexOf("TriggerTime") != -1);
      }
    } catch (IOException iOException) {
      return false;
    }
  }

  public static boolean b(File paramFile) {
    String str = paramFile.getName();
    return (str.toLowerCase().endsWith(".msq")
        || str.toLowerCase().endsWith(".tune")
        || str.toLowerCase().endsWith(".bigtune")
        || str.toLowerCase().endsWith(".big"));
  }

  public static boolean c(File paramFile) {
    String str = paramFile.getName();
    return (str.toLowerCase().endsWith(".msl")
        || str.toLowerCase().endsWith(".csv")
        || str.toLowerCase().endsWith(".mlg"));
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/U.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
