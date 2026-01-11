package ak;

import W.X;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class O extends g {
  public O() {
    super(",", false);
  }
  
  public String i() {
    return X.y;
  }
  
  protected int b(String paramString) {
    byte b = 0;
    BufferedReader bufferedReader = null;
    try {
      this.h = new File(paramString);
      FileInputStream fileInputStream = new FileInputStream(this.h);
      bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
      String str = bufferedReader.readLine();
      if (str == null)
        return b - 1; 
      while (b < 'Ϩ' && !str.startsWith("[Channel Information]")) {
        b++;
        str = bufferedReader.readLine();
      } 
      return b + 2;
    } catch (Exception exception) {
      return 0;
    } finally {
      try {
        bufferedReader.close();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/O.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */