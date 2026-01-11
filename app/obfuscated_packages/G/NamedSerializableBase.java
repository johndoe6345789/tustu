package G;

import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public class NamedSerializableBase implements Serializable {
  private String a = "";
  
  private String b = "";
  
  private String c = null;
  
  private boolean d = false;
  
  private boolean e = false;
  
  private String f = null;
  
  public String aJ() {
    return this.f;
  }
  
  public void u(String paramString) {
    this.f = paramString;
  }
  
  public String toString() {
    Field[] arrayOfField = getClass().getDeclaredFields();
    AccessibleObject.setAccessible((AccessibleObject[])arrayOfField, true);
    null = getClass().getName();
    for (byte b = 0; b < arrayOfField.length; b++) {
      Field field = arrayOfField[b];
      try {
        null = null + "\n\t" + field.getName() + "=" + field.get(this) + ", ";
      } catch (Exception exception) {}
    } 
    return null + "\n";
  }
  
  public String aK() {
    return this.c;
  }
  
  public String aL() {
    return this.b;
  }
  
  public void v(String paramString) {
    this.b = paramString;
  }
  
  public String aM() {
    return this.a;
  }
  
  public void w(String paramString) {
    this.a = paramString;
  }
  
  public boolean aN() {
    return this.d;
  }
  
  public void s(boolean paramBoolean) {
    this.d = paramBoolean;
  }
  
  public boolean aO() {
    return this.e;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/Q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */