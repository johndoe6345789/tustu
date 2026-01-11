package g;

import java.util.Comparator;

class l implements Comparator {
  public int a(String paramString1, String paramString2) {
    return paramString1.replaceAll("\\d", "").equalsIgnoreCase(paramString2.replaceAll("\\d", "")) ? (a(paramString1) - a(paramString2)) : paramString1.compareTo(paramString2);
  }
  
  int a(String paramString) {
    String str = paramString.replaceAll("\\D", "");
    return str.isEmpty() ? 0 : Integer.parseInt(str);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/g/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */