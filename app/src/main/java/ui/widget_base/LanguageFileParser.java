package W;

import bH.D;
import bH.X;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.model.FileHeader;

public class LanguageFileParser {
  private String a = "efiaLangFile!";
  
  public Map a(File paramFile) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    return a(hashMap, paramFile);
  }
  
  public Map a(Map<String, String> paramMap, File paramFile) {
    BufferedReader bufferedReader = null;
    try {
      String str = null;
      InputStream inputStream = b(paramFile);
      bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
      while ((str = bufferedReader.readLine()) != null) {
        str = str.trim();
        if (str.length() > 3 && str.indexOf("=") != -1) {
          h h = new h();
          try {
            h.a(str);
            String str1 = X.b(h.a(), "\\n", "\n");
            String str2 = X.b(h.b(), "\\n", "\n");
            paramMap.put(str1, str2);
          } catch (S s) {
            D.b("Error parsing Content row:\n:" + str + "\n" + s.getMessage());
          } catch (Exception exception) {
            D.b("Error parsing Content row:\n:" + str + "\n" + exception.getMessage());
          } 
          continue;
        } 
        if (str.length() == 0)
          continue; 
        D.d("Invalid row:" + str);
      } 
      return paramMap;
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      Logger.getLogger(g.class.getName()).log(Level.SEVERE, (String)null, unsupportedEncodingException);
      return null;
    } finally {
      if (bufferedReader != null)
        bufferedReader.close(); 
    } 
  }
  
  private InputStream b(File paramFile) {
    try {
      ZipFile zipFile = new ZipFile(paramFile);
      if (zipFile.isEncrypted())
        zipFile.setPassword(this.a); 
      List<FileHeader> list = zipFile.getFileHeaders();
      FileHeader fileHeader = list.get(0);
      return (InputStream)zipFile.getInputStream(fileHeader);
    } catch (Exception exception) {
      String str = exception.getMessage();
      str = X.b(str, "zip", "fast binary");
      D.c("Reading translation file as plain text");
      return new FileInputStream(paramFile);
    } 
  }
  
  public void b(Map paramMap, File paramFile) {
    if (!paramFile.exists()) {
      paramFile.getParentFile().mkdirs();
      paramFile.createNewFile();
    } 
    PrintWriter printWriter = new PrintWriter(paramFile, "UTF-8");
    try {
      for (String str1 : paramMap.keySet()) {
        String str2 = (String)paramMap.get(str1);
        String str3 = "\"" + str1 + "\" = \"" + str2 + "\"";
        str3 = new String(str3.getBytes("UTF-8"));
        printWriter.println(str3);
      } 
    } finally {
      printWriter.flush();
      printWriter.close();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */