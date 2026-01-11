package business.bit_array_utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class W extends Thread {
  private static String c = "https://www.efianalytics.com/activate/checkCon.txt";
  
  static String a = "ALIVE";
  
  public static int b = 10000;
  
  private boolean d = false;
  
  private boolean e = false;
  
  public void run() {
    a(false);
    try {
      URL uRL = new URL(c);
      URLConnection uRLConnection = uRL.openConnection();
      uRLConnection.setConnectTimeout(b());
      byte[] arrayOfByte = new byte[5];
      uRLConnection.getInputStream().read(arrayOfByte);
      this.d = (new String(arrayOfByte)).equals(a);
      uRLConnection.getInputStream().close();
    } catch (MalformedURLException malformedURLException) {
      System.out.println("Bad URL:\n" + c);
      this.d = false;
    } catch (UnknownHostException unknownHostException) {
      D.c("Ukh: No Internet?");
      this.d = false;
    } catch (Exception exception) {
      this.d = false;
    } 
    a(true);
  }
  
  public boolean a() {
    return this.d;
  }
  
  protected int b() {
    return b;
  }
  
  protected void a(int paramInt) {
    this;
    b = paramInt;
  }
  
  protected boolean c() {
    return this.e;
  }
  
  protected void a(boolean paramBoolean) {
    this.e = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/W.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */