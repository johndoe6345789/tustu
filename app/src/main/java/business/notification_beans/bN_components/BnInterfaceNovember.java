package business.notification_beans.bN_components;

import bH.c;

public class BnInterfaceNovember {
  public static String a = "Error on Sync";

  public static String b = "Busy";

  public static String c = "DAQ running";

  public static String d = "PGM Running";

  public static String e = "Unknown Command";

  public static String f = "PGM Syntax";

  public static String g = "Out of Range";

  public static String h = "Write Protected Memory";

  public static String i = "Memory location not accessible";

  public static String j = "Access denied";

  public static String k = "Page not available";

  public static String l = "Mode not valid";

  public static String m = "Segment not valid";

  public static String n = "Sequence Error";

  public static String o = "DAQ configuration not valid";

  public static String p = "Memory overflow";

  public static String q = "Generic error";

  public static String r = "Failed verify";

  public static String a(byte paramByte) {
    int i = c.a(paramByte);
    switch (i) {
      case 0:
        return a;
      case 16:
        return b;
      case 17:
        return c;
      case 18:
        return d;
      case 32:
        return e;
      case 33:
        return f;
      case 34:
        return g;
      case 35:
        return h;
      case 36:
        return i;
      case 37:
        return j;
      case 38:
        return k;
      case 39:
        return l;
      case 40:
        return m;
      case 41:
        return n;
      case 42:
        return o;
      case 48:
        return p;
      case 49:
        return q;
      case 50:
        return r;
    }
    return "Unknown Error Code: 0x" + Integer.toHexString(i).toUpperCase();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bN/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
