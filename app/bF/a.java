package bF;

import G.R;
import G.aM;
import V.g;
import java.util.logging.Level;
import java.util.logging.Logger;

public class a implements x {
  R a;
  
  aM b;
  
  public a(R paramR, String paramString) {
    this.a = paramR;
    this.b = paramR.c(paramString);
  }
  
  public String a(int paramInt) {
    try {
      String[] arrayOfString = this.b.c(this.a.h());
      return arrayOfString[paramInt];
    } catch (g g) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, "Invalid parameter", (Throwable)g);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, "Invalid index for parameter " + this.b.aL(), indexOutOfBoundsException);
    } 
    return "" + paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */