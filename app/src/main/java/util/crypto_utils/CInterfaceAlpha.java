package c;

import bH.D;

public class CInterfaceAlpha {
  public static String a(String paramString1, String paramString2) {
    D.d("Getting ECU name for signature: '" + paramString1 + "'");
    String str = paramString1.toLowerCase();
    if (str.startsWith("rusefi")) {
      D.d("Looks like rusEFI");
      return "rusEFI";
    }
    if (str.startsWith("speeduino")) {
      D.d("Looks like Speeduino");
      return "Speeduino";
    }
    if (str.startsWith("mslabs")) {
      D.d("Looks like MSLabs");
      return "MSLabs";
    }
    if (str.startsWith("trans")) {
      D.d("Looks like MegaSquirt Trans Controller");
      return "MegaSquirt Trans Controller";
    }
    if (str.startsWith("amp")) {
      if (str.contains("dbw")) {
        D.d("Looks like AMP EFI DBW");
        return "AMP DBW";
      }
      if (str.contains("io")) {
        D.d("Looks like AMP EFI IO");
        return "AMP IO Box";
      }
      if (str.contains("dash")) {
        D.d("Looks like AMP EFI DASH");
        return "AMP Dash";
      }
      D.d("Looks like AMP EFI Controller");
      return "AMP EFI Controller";
    }
    return paramString2;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/c/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
