import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CountLines {
  private static int a = 1;

  private static int b = 0;

  public int a(String paramString1, String paramString2, char paramChar) {
    int i = 0;
    File file = new File(paramString1);
    String[] arrayOfString = file.list();
    for (byte b = 0; b < arrayOfString.length; b++) {
      File file1 = new File(String.valueOf(paramString1) + "/" + arrayOfString[b]);
      if (file1.exists())
        if (file1.isFile() && arrayOfString[b].indexOf(paramString2) != -1) {
          b++;
          try {
            BufferedInputStream bufferedInputStream =
                new BufferedInputStream(new FileInputStream(file1));
            byte b1 = 0;
            while ((b1 = (byte) bufferedInputStream.read()) != -1) {
              if (b1 == paramChar) i++;
            }
          } catch (IOException iOException) {
            System.out.println("Unable to open " + file1 + " for reading.");
          }
        } else if (file1.isDirectory()) {
          a++;
          i += (new CountLines()).a(file1.getAbsolutePath(), paramString2, paramChar);
        }
    }
    return i;
  }

  public static void main(String[] paramArrayOfString) {
    String str = null;
    int i = 0;
    if (paramArrayOfString != null && paramArrayOfString.length > 0) str = paramArrayOfString[0];
    if (str == null) {
      System.out.println("must supply file type to check. ie. *.java");
      return;
    }
    str = str.trim();
    if (str.startsWith("*")) str = str.substring(1);
    byte b = 10;
    i = (new CountLines()).a(".", str, b);
    System.out.println(
        "Counted " + i + " lines of code in " + b + " files and " + a + " directories.");
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/CountLines.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
