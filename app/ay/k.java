package ay;

import bH.H;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class k {
  public static String a(String paramString) {
    URL uRL = new URL(paramString);
    return a(uRL);
  }
  
  public static String a(URL paramURL) {
    InputStream inputStream = null;
    try {
      inputStream = paramURL.openStream();
      String str = (new Scanner(inputStream)).useDelimiter("\\A").next();
      return str;
    } catch (IOException iOException) {
      throw iOException;
    } finally {
      try {
        if (inputStream != null)
          inputStream.close(); 
      } catch (IOException iOException) {
        Logger.getLogger(H.class.getName()).log(Level.SEVERE, (String)null, iOException);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ay/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */