package d;

import bH.D;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class b extends Properties {
  static String a = "=";
  
  static String b = "&";
  
  public String a() {
    StringBuilder stringBuilder = new StringBuilder();
    for (String str : stringPropertyNames()) {
      try {
        stringBuilder.append(str).append(a);
        String str1 = URLEncoder.encode(getProperty(str), "UTF-8");
        stringBuilder.append(str1).append(b);
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, unsupportedEncodingException);
      } 
    } 
    return stringBuilder.toString();
  }
  
  public static b a(String paramString) {
    b b1 = new b();
    if (paramString == null || paramString.indexOf(a) == -1)
      return b1; 
    if (paramString.indexOf(b) == -1)
      paramString = paramString + b; 
    try {
      StringTokenizer stringTokenizer = new StringTokenizer(paramString, b);
      while (stringTokenizer.hasMoreElements()) {
        String str1 = stringTokenizer.nextToken();
        String str2 = str1.substring(0, str1.indexOf(a));
        String str3 = URLDecoder.decode(str1.substring(str1.indexOf(a) + 1), "UTF-8");
        b1.setProperty(str2, str3);
      } 
      return b1;
    } catch (Exception exception) {
      throw new e("Unable to parse parameter String:\n" + paramString);
    } 
  }
  
  public static String a(Properties paramProperties) {
    StringBuilder stringBuilder = new StringBuilder();
    try {
      Iterator<String> iterator = paramProperties.stringPropertyNames().iterator();
      while (iterator.hasNext()) {
        String str1 = iterator.next();
        String str2 = URLEncoder.encode(paramProperties.getProperty(str1), "UTF-8");
        stringBuilder.append(str1).append(a).append(str2);
        if (iterator.hasNext())
          stringBuilder.append(b); 
      } 
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      D.c("Failed to create AppAction Parameter String.");
      unsupportedEncodingException.printStackTrace();
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/d/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */