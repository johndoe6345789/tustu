package Y;

import bH.D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class YInterfaceCharlie {
  String a = "\\s+";
  
  int b = 0;
  
  int c = 4;
  
  int d = 5;
  
  public List a(File paramFile) {
    ArrayList<d> arrayList = new ArrayList();
    BufferedReader bufferedReader = new BufferedReader(new FileReader(paramFile));
    try {
      for (String str = bufferedReader.readLine(); str != null; str = bufferedReader.readLine()) {
        String[] arrayOfString = str.split("\\s+");
        if (a(arrayOfString)) {
          int i = Integer.parseInt(arrayOfString[this.c], 16);
          int j = Integer.parseInt(arrayOfString[this.b], 16);
          d d = new d();
          d.a(arrayOfString[this.d]);
          d.a(j);
          d.b(i);
          arrayList.add(d);
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
    return (paramArrayOfString.length - 1 < this.d) ? false : (!a(paramArrayOfString[this.b]) ? false : (!a(paramArrayOfString[this.c]) ? false : (paramArrayOfString[this.d].startsWith("_") ? false : (!paramArrayOfString[this.d].contains(".")))));
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/Y/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */