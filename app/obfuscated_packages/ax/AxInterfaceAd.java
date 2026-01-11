package ax;

public class AxInterfaceAd {
  public static double a = 1.0D;
  
  public static double b = 0.0D;
  
  private char c;
  
  public AxInterfaceAd(char paramChar) {
    this.c = paramChar;
  }
  
  public char a() {
    return this.c;
  }
  
  public String toString() {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(this.c);
    return stringBuffer.toString();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ax/ad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */