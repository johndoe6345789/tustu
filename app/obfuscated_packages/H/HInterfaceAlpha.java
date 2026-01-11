package H;

import G.aB;
import G.ai;
import G.cq;
import G.v;
import bH.D;

public class HInterfaceAlpha implements ai, cq {
  private static long a = 0L;
  
  public static long a() {
    return a;
  }
  
  public boolean a(v paramv) {
    byte[] arrayOfByte = new byte[5];
    arrayOfByte[0] = -1;
    arrayOfByte[1] = -4;
    arrayOfByte[2] = 20;
    arrayOfByte[3] = -4;
    arrayOfByte[4] = 20;
    int[] arrayOfInt = paramv.a(arrayOfByte, 10, 1);
    if (arrayOfInt.length == 1) {
      double d = arrayOfInt[0] * 0.109D;
      D.d("Vbatt=" + d);
      boolean bool = (d > 4.0D) ? true : false;
      if (!bool) {
        aB.a().a("BigStuff3 found, Key On to connect");
        a = System.currentTimeMillis();
      } 
      return bool;
    } 
    D.d("Could not get value for Vbatt");
    return false;
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/H/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */