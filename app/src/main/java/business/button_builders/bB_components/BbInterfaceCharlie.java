package business.button_builders.bB_components;

import h.IOProperties;

public class BbInterfaceCharlie implements b {
  public r a(String paramString) {
    String str = IOProperties.a("FIELD_MIN_MAX_" + paramString, null);
    a a = new a();
    a.a(paramString);
    if (str != null && str.indexOf(";") != -1) {
      try {
        String[] arrayOfString = str.split(";");
        String str1 = arrayOfString[0];
        String str2 = (arrayOfString.length > 1) ? arrayOfString[1] : "Auto";
        String str3 = (arrayOfString.length > 2) ? arrayOfString[2] : "Auto";
        if (str1.contains("Auto")) {
          a.a(Double.NaN);
        } else {
          a.a(Double.parseDouble(str1));
        }
        if (str2.contains("Auto")) {
          a.b(Double.NaN);
        } else {
          a.b(Double.parseDouble(str2));
        }
        if (str3.contains("Auto")) {
          a.a(-1);
        } else {
          a.a(Integer.parseInt(str3));
        }
      } catch (Exception exception) {
      }
    } else {
      a.a(Double.NaN);
      a.b(Double.NaN);
      a.a(-1);
    }
    return a;
  }

  public r a(r paramr) {
    a a = null;
    String str = IOProperties.c("FIELD_MIN_MAX_" + paramr.e());
    if (str != null)
      try {
        a = new a();
        a.a(paramr.e());
        String[] arrayOfString = str.split(";");
        String str1 = arrayOfString[0];
        String str2 = (arrayOfString.length > 1) ? arrayOfString[1] : "Auto";
        String str3 = (arrayOfString.length > 2) ? arrayOfString[2] : "Auto";
        if (str1.contains("Auto")) {
          a.a(Double.NaN);
        } else {
          a.a(Double.parseDouble(str1));
        }
        if (str2.contains("Auto")) {
          a.b(Double.NaN);
        } else {
          a.b(Double.parseDouble(str2));
        }
        if (str3.contains("Auto")) {
          a.a(-1);
        } else {
          a.a(Integer.parseInt(str3));
        }
      } catch (Exception exception) {
        return null;
      }
    return a;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bB/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
