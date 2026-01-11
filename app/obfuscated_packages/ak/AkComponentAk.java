package ak;

import bH.c;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

class AkComponentAk {
  protected int t;
  
  protected int u;
  
  Map v = new HashMap<>();
  
  public AkComponentAk(aa paramaa, int paramInt) {
    this.t = paramInt;
    l();
  }
  
  public AkComponentAk(aa paramaa) {
    this(paramaa, 0);
  }
  
  protected final void l() {
    this.u = this.t;
    if (this.t > 0)
      for (Field field : getClass().getDeclaredFields()) {
        field.setAccessible(true);
        Y y = field.<Y>getAnnotation(Y.class);
        if (y != null && this.w.j >= y.c())
          try {
            boolean bool;
            int i = y.a().a() * y.b();
            switch (ab.a[y.a().ordinal()]) {
              case 1:
              case 2:
              case 3:
              case 4:
              case 5:
                field.setInt(this, c.a(this.w.e, this.u, i, this.w.k, false));
                break;
              case 6:
                field.setInt(this, c.a(this.w.e, this.u, i, this.w.k, true));
                break;
              case 7:
                field.set(this, aa.a(this.w, this.u, i).trim());
                break;
              case 8:
                field.set(this, Double.valueOf(ByteBuffer.wrap(this.w.e, this.u, i).order(this.w.k ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN).getDouble()));
                break;
              case 9:
                bool = (c.a(this.w.e, this.u, i, true, false) != 0) ? true : false;
                field.setBoolean(this, bool);
                if (y.d())
                  this.w.k = bool; 
                break;
            } 
            this.u += i;
          } catch (IllegalArgumentException|IllegalAccessException illegalArgumentException) {
            Logger.getLogger(ak.class.getName()).log(Level.SEVERE, (String)null, illegalArgumentException);
          }  
      }  
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(getClass() + "{\n");
    for (Field field : getClass().getDeclaredFields()) {
      field.setAccessible(true);
      Y y = field.<Y>getAnnotation(Y.class);
      if (y == null || this.w.j >= y.c())
        try {
          Object object = field.get(this);
          if (object == null)
            object = "null"; 
          if (y != null) {
            stringBuilder.append("\t").append(field.getName());
            stringBuilder.append("(").append(y.a().name()).append("[").append(y.b()).append("])=");
            stringBuilder.append((y.a() == Z.i) ? String.format("0x%08X", new Object[] { Integer.valueOf(Integer.parseInt(object.toString())) }) : object);
            stringBuilder.append(",\n");
          } else {
            stringBuilder.append("\t").append(field.getName()).append("=").append(object.toString()).append("\n");
          } 
        } catch (IllegalArgumentException|IllegalAccessException illegalArgumentException) {
          Logger.getLogger(ak.class.getName()).log(Level.SEVERE, (String)null, illegalArgumentException);
        }  
    } 
    return stringBuilder.append("}").toString();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/ak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */