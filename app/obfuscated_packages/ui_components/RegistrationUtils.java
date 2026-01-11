package ao;

import bH.X;
import h.IOProperties;
import java.util.Properties;

public class hU {
  private static String d = "*$";
  
  public static String a = d + "email";
  
  public static String b = "<html><body>Free Upgrade.<br>" + IOProperties.b + " " + IOProperties.c + " version 3.0 requires a new registration key.<br><br>As an existing registered user, this is a free upgrade. <br>If you are connected to the Internet, <br>Click 'Yes' to have your new Registration Key sent to " + a + ". <br><br>If you are not currently connected to the internet, to get your new registration key go to:<br><br>https://www.efianalytics.com/MegaLogViewer/upgrade/<br><br>You will need your current registered email address:<br>Registered Email: " + a + " <br><br></body></html>";
  
  static String c = "Your Registration information is not valid and will be removed.";
  
  public static String a(Properties paramProperties, String paramString) {
    for (String str : paramProperties.keySet())
      paramString = X.b(paramString, str, paramProperties.getProperty(str)); 
    return paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */