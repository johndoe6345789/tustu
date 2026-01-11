package f;

public class FInterfaceEcho {
  private static String[] a = new String[] { 
      "ht", "tp", "s", ":", "/", "/w", "w", "w", ".", "e", 
      "f", "ia", "n", "al", "y", "ti", "c", "s.", "co", "m/", 
      "r", "e", "gi", "s", "te", "r/", "So", "ft", "wa", "r", 
      "e", "A", "ct", "i", "va", "ti", "on", "?p", "ay", "l", 
      "oa", "d", "=" };
  
  public static String a() {
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < a.length; b++)
      stringBuilder.append(a[b]); 
    return stringBuilder.toString();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/f/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */