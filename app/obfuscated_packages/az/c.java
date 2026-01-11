package az;

import bH.ab;

public class c {
  public static String a = "Your Registration Successfully Activated. Thank You!";
  
  public static String b = "Valid Activation.";
  
  public static String c = "Invalid Activation.";
  
  public static String d = "Invalid Server Activation Code.";
  
  public static String e = "No identifiers available.";
  
  public static String f = "Unable to access hardware identifiers for this computer. Can not perform Activation.";
  
  public static String g = "OS X and Linux require a network interface to be installed even if the Internet is unavailable.";
  
  public static String h = "Unable to activate registration, failed to retrieve computer identification.";
  
  public static String i = "Unable to activate registration, failed to retrieve computer identification.";
  
  public static String j = "The Hardware Identifiers have changed since the registration was activated.\nInternet is needed to refresh Activation";
  
  public static String k = "Current Activation Count";
  
  public static String l = "An Offline Activation May be required, check help menu.";
  
  public static String a(ab paramab) {
    return paramab.a("Registration activation Failed, Network unavailable.") + "\n" + paramab.a("Unable to connect to the Internet.");
  }
  
  public static String b(ab paramab) {
    return paramab.a("Registration activation Failed, Activation Server is unavailable.") + "\n" + paramab.a("Try again later or perform an offline activation from the help menu.");
  }
  
  public static String c(ab paramab) {
    return paramab.a("You have reached the maximum number of activations for this registration.") + "\n" + paramab.a("To activate more computers, you must purchase an additional registration or different class licensing.");
  }
  
  public static String d(ab paramab) {
    return paramab.a("Error: Either this computer is not connected to the Internet or there is a Firewall blocking Internet access.") + "\n\n" + paramab.a("To activate your registration either") + ":\n\n- " + paramab.a("Click Yes to connect to the Internet for seamless activation") + "\n" + paramab.a("  Or") + "\n- " + paramab.a("Click No to perform an offline activation.") + "\n  " + paramab.a("This will require a USB drive or similar medium to save the activation file and a computer with Internet access.");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/az/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */