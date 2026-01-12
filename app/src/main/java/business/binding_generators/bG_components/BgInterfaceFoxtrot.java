package business.binding_generators.bG_components;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BgInterfaceFoxtrot {
  public void a(File paramFile, List<k> paramList) {
    if (paramFile.exists()) paramFile.delete();
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(paramFile));
    try {
      bufferedWriter.append("teeth=");
      for (byte b = 0; b < paramList.size(); b++) {
        k k = paramList.get(b);
        bufferedWriter.append(Double.toString(k.a())).append(":").append(Double.toString(k.b()));
        if (b < paramList.size() - 1) bufferedWriter.append(",");
      }
      bufferedWriter.flush();
    } finally {
      bufferedWriter.close();
    }
  }

  public List a(File paramFile) {
    BufferedReader bufferedReader = new BufferedReader(new FileReader(paramFile));
    try {
      do {
        str = bufferedReader.readLine();
      } while (str != null && !str.startsWith("teeth="));
      if (str == null) throw new IOException("Invalid Wheel File.");
      String str = str.trim().substring("teeth=".length());
      ArrayList<k> arrayList = new ArrayList();
      StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
      while (stringTokenizer.hasMoreTokens()) {
        String str1 = stringTokenizer.nextToken();
        String[] arrayOfString = str1.split(":");
        k k = new k();
        k.a(Double.parseDouble(arrayOfString[0]));
        k.b(Double.parseDouble(arrayOfString[1]));
        arrayList.add(k);
      }
      return arrayList;
    } catch (Exception exception) {
      throw new IOException("Invalid Wheel File Format.");
    } finally {
      bufferedReader.close();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bG/F.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
