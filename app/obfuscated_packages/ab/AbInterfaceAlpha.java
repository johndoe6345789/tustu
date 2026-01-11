package ab;

import com.google.gson.Gson;
import java.util.Arrays;
import java.util.List;

public class AbInterfaceAlpha {
  public static List a(Class paramClass, String paramString) {
    Gson gson = new Gson();
    Object[] arrayOfObject = (Object[])gson.fromJson(paramString, paramClass);
    return Arrays.asList(arrayOfObject);
  }
  
  public static Object b(Class paramClass, String paramString) {
    Gson gson = new Gson();
    return gson.fromJson(paramString, paramClass);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ab/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */