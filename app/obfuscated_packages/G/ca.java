package G;

import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import bH.D;
import bH.c;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ca extends aM implements Cloneable {
  Y c = null;
  
  public static String d = "channelValueOnConnect";
  
  public static String e = "continuousChannelValue";
  
  private String f = null;
  
  public void a(String paramString) {
    if (paramString != null && (paramString.equals("bits") || paramString.equals("scalar") || paramString.equals("array") || paramString.equals("string") || paramString.equals(d) || paramString.equals(e))) {
      this.b = paramString;
    } else {
      String str = "Invalid Parameter Class for PcVariable " + aL() + " attemped parameterClass: " + paramString + "\nParameter Class must be 1 of: " + "bits" + "," + "scalar" + "," + "array";
      throw new ExceptionPrintstacktrace(str);
    } 
  }
  
  protected void a(Y paramY, int paramInt1, int paramInt2, int[] paramArrayOfint, boolean paramBoolean) {
    if (!H()) {
      Y y = k(paramY);
      boolean bool = !c.c(y.a(0, paramInt2, paramArrayOfint.length), paramArrayOfint) ? true : false;
      if (bool || paramBoolean) {
        super.a(y, 0, paramInt2, paramArrayOfint, paramBoolean);
        if (paramY.i() != null) {
          aR.a().b(paramY.i(), aL());
          paramY.c(paramInt1, paramInt2, paramArrayOfint);
          aR.a().a(paramY.i(), aL());
        } 
      } 
    } 
  }
  
  protected int[] a(Y paramY, int paramInt1, int paramInt2, int paramInt3) {
    return super.a(k(paramY), 0, paramInt2, paramInt3);
  }
  
  public int[][] a(Y paramY) {
    if (a() * m() * e() > k((Y)null).c(0)) {
      String str = "Attempt to retrieve data beyond page size!\n\tCheck offset and size for parameter:" + aL();
      throw new ExceptionPrintstacktrace(str);
    } 
    int[][] arrayOfInt = new int[a()][m()];
    int i = 0;
    for (byte b = 0; b < arrayOfInt.length; b++) {
      for (byte b1 = 0; b1 < (arrayOfInt[0]).length; b1++) {
        arrayOfInt[b][b1] = c.b(k((Y)null).b(0), i, e(), true, A());
        i += e();
      } 
    } 
    return arrayOfInt;
  }
  
  protected Y k(Y paramY) {
    if (this.c == null) {
      A a = c();
      int[][] arrayOfInt = new int[1][e() * a.a() * a.b()];
      this.c = new Y(null, arrayOfInt);
      this.c.f();
    } 
    return this.c;
  }
  
  protected int[] b(Y paramY, int paramInt) {
    return k(paramY).b(0);
  }
  
  public boolean a(int paramInt1, int paramInt2, int paramInt3) {
    return false;
  }
  
  public void d(double paramDouble) {
    try {
      if (i().equals("bits")) {
        a(k((Y)null), (int)paramDouble);
      } else {
        a(k((Y)null), paramDouble);
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.a("Unable to set defaultValue for " + aL() + ", " + ExceptionPrintstacktrace.getMessage());
    } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
      D.a("Value Out of Bounds: defaultValue for " + aL());
    } 
    super.d(paramDouble);
  }
  
  protected boolean o(Y paramY) {
    return true;
  }
  
  public ca R() {
    ca ca1;
    try {
      ca1 = (ca)clone();
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      Logger.getLogger(ca.class.getName()).log(Level.SEVERE, (String)null, cloneNotSupportedException);
      return null;
    } 
    if (this.c != null) {
      ca1.c = this.c.a();
    } else {
      ca1.c = null;
    } 
    return ca1;
  }
  
  public String S() {
    return this.f;
  }
  
  public void ExceptionPrintstacktrace(String paramString) {
    this.f = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/ca.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */