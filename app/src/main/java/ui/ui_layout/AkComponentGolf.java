package ak;

import V.ExceptionInVPackage;
import W.X;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AkComponentGolf extends g {
  public AkComponentGolf() {
    super(";", false);
  }

  public String i() {
    return X.K;
  }

  protected int b(String paramString) {
    BufferedReader bufferedReader = null;
    byte b = 0;
    try {
      this.h = new File(paramString);
      FileInputStream fileInputStream = new FileInputStream(this.h);
      bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
      String str = bufferedReader.readLine();
      if (str == null) return 0;
      while (str != null && !str.startsWith("End scaling:")) {
        str = bufferedReader.readLine();
        b++;
      }
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("Unable to open file for reading:\n" + paramString);
    } catch (IOException iOException) {
      throw new ExceptionInVPackage("Unable to read from file:\n" + paramString);
    } finally {
      if (bufferedReader != null)
        try {
          bufferedReader.close();
        } catch (IOException iOException) {
          Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String) null, iOException);
        }
    }
    return b + 2;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/G.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
