package C;

import bH.X;
import java.util.Properties;

public class RegistrationMessages {
  public static String a = "*$email";
  
  public static String b = "*$appName";
  
  public static String c = "*$appEdition";
  
  public static String d = "*$daysToExpire";
  
  public static String e = "Your Registration information is not valid and will be removed.";
  
  public static String f = "This version has expired, " + b + " will attempt to update.\nA connection to the internet is required for this to be successful.\nThe latest version can be downloaded from:\nhttps://www.efiAnalytics.com/" + b + "/ ";
  
  public static String g = "Your system clock appears to be wrong.\nThis version of " + b + " requires your clock to be correct to operate.\nPlease correct your system clock.\nhttps://www.efiAnalytics.com/" + b + "/ \nfor a current version";
  
  public static String h = "The registration you are using appears to have been used extensively!\nIt will now be disabled!\n\nIf you are the rightful owner of this registration, contact EFI Analytics to get a new registration.\nOtherwise please obtain a valid registration key.";
  
  public static String i = "Your registration appears to be invalid!\nPlease obtain a valid registration key to run the registered version of " + b;
  
  public static String j = "This version of " + b + " " + c + " will expire in " + d + " days.\nPlease select \"Check For Updates\" from the help menu or \nvisit www.EFIAnalytics.com/" + b + "/ to upgrade to the latest version\nbefore this copy is disabled.";
  
  public static String k = "Malformed command line! Expected parameters:\nencryptFile [password] [inputFileName] [outputFileName]";
  
  public static String a(Properties paramProperties, String paramString) {
    for (String str : paramProperties.keySet())
      paramString = X.b(paramString, str, paramProperties.getProperty(str)); 
    return paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/C/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */