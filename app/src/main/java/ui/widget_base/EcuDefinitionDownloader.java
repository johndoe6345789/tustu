package W;

import bH.D;
import bH.X;
import bH.n;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class EcuDefinitionDownloader {
  public static DownloadResult a(String paramString) {
    if (paramString.toLowerCase().startsWith("speeduino"))
      return b(paramString); 
    if (paramString.toLowerCase().startsWith("rusefi"))
      return c(paramString); 
    if (paramString.toLowerCase().startsWith("mslabs"))
      return d(paramString); 
    R r = new R();
    String str = paramString;
    paramString = X.b(paramString, " ", "%20").trim();
    try {
      String str1 = (System.currentTimeMillis() - 1000000L ^ 0xFFFFFFFFFFFFFFFFL) + "";
      String str2 = n.a("https://www.shadowtuner.com/ShadowTuner/FindEcuDefinitionBySignature?action=checkAvailability&signature=" + paramString + "&key=" + str1);
      if (str2 != null && str2.startsWith("available=true")) {
        String str3 = str2.substring(str2.lastIndexOf('=') + 1);
        r.a(Long.parseLong(str3));
        r.a(true);
        r.a("File Available for signature " + str);
      } else {
        r.a(false);
        r.a("File not currently available on EFI Analytics servers.");
      } 
      return r;
    } catch (IOException iOException) {
      r.a("Unable to get ECU Definition for signature: " + str + ", service unavailable.");
      return r;
    } 
  }
  
  public static R a(String paramString, double paramDouble) {
    R r = new R();
    if (paramString.toLowerCase().startsWith("speeduino")) {
      r.a(false);
      r.a("Newer iniVersion not currently supported by speeduino server.");
      return r;
    } 
    if (paramString.toLowerCase().startsWith("rusefi")) {
      r.a(false);
      r.a("Newer iniVersion not currently supported by rusEFI server.");
      return r;
    } 
    if (paramString.toLowerCase().startsWith("mslabs")) {
      r.a(false);
      r.a("Newer iniVersion not currently supported by MSLabs server.");
      return r;
    } 
    String str = paramString;
    paramString = X.b(paramString, " ", "%20").trim();
    try {
      String str1 = (System.currentTimeMillis() - 1000000L ^ 0xFFFFFFFFFFFFFFFFL) + "";
      String str2 = n.a("https://www.shadowtuner.com/ShadowTuner/FindEcuDefinitionBySignature?action=checkForNewer&signature=" + paramString + "&iniVersion=" + paramDouble + "&key=" + str1);
      if (str2 != null && str2.startsWith("available=true")) {
        String str3 = str2.substring(str2.indexOf("size=") + 5, str2.indexOf("|", str2.indexOf("size=")));
        r.a(Long.parseLong(str3));
        String str4 = str2.substring(str2.indexOf("iniVersion=") + 11);
        if (str4.indexOf("|") != -1)
          str4 = str4.substring(0, str4.indexOf("|")); 
        try {
          double d = Double.parseDouble(str4);
          r.a(d);
        } catch (Exception exception) {
          D.c("Malformed iniVersion: " + str4);
        } 
        r.a(true);
        r.a("Newer File Available for signature " + str);
      } else {
        r.a(false);
        r.a("Newer File not currently available on EFI Analytics servers.");
      } 
      return r;
    } catch (IOException iOException) {
      r.a("Unable to get ECU Definition for signature: " + str + ", service unavailable.");
      return r;
    } 
  }
  
  private static R b(String paramString) {
    String str1 = paramString;
    paramString = paramString.toLowerCase().replace("speeduino", "").trim();
    String str2 = "https://speeduino.com/fw/" + paramString + ".ini";
    R r = new R();
    HttpURLConnection httpURLConnection = null;
    try {
      HttpURLConnection.setFollowRedirects(false);
      httpURLConnection = (HttpURLConnection)(new URL(str2)).openConnection();
      httpURLConnection.setRequestMethod("HEAD");
      if (httpURLConnection.getResponseCode() == 200) {
        long l = httpURLConnection.getContentLength();
        r.a(l);
        r.a(true);
        r.a("File Available for signature " + str1);
      } else {
        r.a("File not currently available on Speeduino servers.");
      } 
      return r;
    } catch (Exception exception) {
      D.c("Failed to get ini: " + exception.getMessage());
      r.a("Unable to get ECU Definition for signature: " + str1 + ", service unavailable.");
      return r;
    } finally {
      if (httpURLConnection != null)
        try {
          httpURLConnection.disconnect();
        } catch (Exception exception) {} 
    } 
  }
  
  private static R c(String paramString) {
    String str1 = paramString;
    paramString = X.b(paramString.toLowerCase(), " ", "/").trim();
    paramString = paramString.replace(".", "/").trim();
    String str2 = "https://rusefi.com/online/ini/" + paramString + ".ini";
    R r = new R();
    D.c("Checking for ini at:\n" + str2);
    HttpURLConnection httpURLConnection = null;
    try {
      HttpURLConnection.setFollowRedirects(false);
      httpURLConnection = (HttpURLConnection)(new URL(str2)).openConnection();
      httpURLConnection.setRequestMethod("HEAD");
      if (httpURLConnection.getResponseCode() == 200) {
        long l = httpURLConnection.getContentLength();
        r.a(l);
        r.a(true);
        r.a("File Available for signature " + str1);
      } else {
        r.a("File not currently available on rusEFI servers.");
      } 
      return r;
    } catch (Exception exception) {
      D.c("Failed to get ini: " + exception.getMessage());
      r.a("Unable to get ECU Definition for signature: " + str1 + ", service unavailable.");
      return r;
    } finally {
      if (httpURLConnection != null)
        try {
          httpURLConnection.disconnect();
        } catch (Exception exception) {} 
    } 
  }
  
  private static R d(String paramString) {
    String str1 = paramString;
    paramString = paramString.replace("MSLabs", "").trim();
    String str2 = "https://www.mslabs.gr/downloads/ini_files/" + paramString + ".ini";
    R r = new R();
    HttpURLConnection httpURLConnection = null;
    try {
      HttpURLConnection.setFollowRedirects(false);
      httpURLConnection = (HttpURLConnection)(new URL(str2)).openConnection();
      httpURLConnection.setRequestMethod("HEAD");
      if (httpURLConnection.getResponseCode() == 200) {
        long l = httpURLConnection.getContentLength();
        r.a(l);
        r.a(true);
        r.a("File Available for signature " + str1);
      } else {
        r.a("File not currently available on MSLabs servers.");
      } 
      return r;
    } catch (Exception exception) {
      D.c("Failed to get ini: " + exception.getMessage());
      r.a("Unable to get ECU Definition for signature: " + str1 + ", service unavailable.");
      return r;
    } finally {
      if (httpURLConnection != null)
        try {
          httpURLConnection.disconnect();
        } catch (Exception exception) {} 
    } 
  }
  
  public static R a(String paramString, File paramFile) {
    if (paramString.toLowerCase().startsWith("speeduino"))
      return b(paramString, paramFile); 
    if (paramString.toLowerCase().startsWith("rusefi"))
      return c(paramString, paramFile); 
    if (paramString.toLowerCase().startsWith("mslabs"))
      return d(paramString, paramFile); 
    R r = new R();
    String str = paramString;
    try {
      String str1 = z.b(paramString);
      paramString = X.b(paramString, " ", "%20").trim();
      String str2 = n.a("https://www.shadowtuner.com/ShadowTuner/FindEcuDefinitionBySignature?action=checkAvailability&signature=" + paramString);
      if (str2 != null && str2.startsWith("available=true")) {
        String str3 = str2.substring(str2.lastIndexOf('=') + 1);
        r.a(Long.parseLong(str3));
        File file = new File(paramFile, str1);
        n.a("https://www.shadowtuner.com/ShadowTuner/FindEcuDefinitionBySignature?signature=" + paramString, file.getAbsolutePath());
        if (file.length() >= r.b() - 20L) {
          r.a(true);
          r.a(file);
        } else {
          r.a("File Available, but download failed.");
        } 
        return r;
      } 
      if (str2 != null && str2.startsWith("available=false")) {
        paramString = X.b(paramString, "%20", " ");
        r.a("File for signature " + paramString + " not available on server, contact your Firmware provider.");
        return r;
      } 
      return r;
    } catch (IOException iOException) {
      D.d("Unable to get ECU Definition for signature: " + str + ", service unavailable.");
      r.a("Unable to get ECU Definition for signature: " + str + ", service unavailable.");
      return r;
    } catch (Exception exception) {
      D.d("Unexpected error downloading file for signature: " + str + ", service unavailable.");
      r.a("Unexpected error downloading file.");
      return r;
    } 
  }
  
  private static R b(String paramString, File paramFile) {
    String str1 = paramString;
    paramString = paramString.toLowerCase().replace("speeduino", "").trim();
    String str2 = "https://speeduino.com/fw/" + paramString + ".ini";
    R r = new R();
    HttpURLConnection httpURLConnection = null;
    try {
      HttpURLConnection.setFollowRedirects(false);
      httpURLConnection = (HttpURLConnection)(new URL(str2)).openConnection();
      httpURLConnection.setRequestMethod("HEAD");
      if (httpURLConnection.getResponseCode() == 200) {
        long l = httpURLConnection.getContentLength();
        r.a(l);
        r.a(true);
        r.a((String)null);
        String str = z.b(str1);
        File file = new File(paramFile, str);
        n.a(str2, file.getAbsolutePath());
        r.a(file);
      } else {
        r.a("File not currently available on Speeduino servers.");
      } 
      return r;
    } catch (Exception exception) {
      D.c("Failed to get ini: " + exception.getMessage());
      r.a("Unable to get ECU Definition for signature: " + str1 + ", service unavailable.");
      return r;
    } finally {
      if (httpURLConnection != null)
        try {
          httpURLConnection.disconnect();
        } catch (Exception exception) {} 
    } 
  }
  
  private static R c(String paramString, File paramFile) {
    String str1 = paramString;
    paramString = X.b(paramString.toLowerCase(), " ", "/").trim();
    paramString = paramString.replace(".", "/").trim();
    String str2 = "https://rusefi.com/online/ini/" + paramString + ".ini";
    R r = new R();
    HttpURLConnection httpURLConnection = null;
    try {
      HttpURLConnection.setFollowRedirects(false);
      httpURLConnection = (HttpURLConnection)(new URL(str2)).openConnection();
      httpURLConnection.setRequestMethod("HEAD");
      if (httpURLConnection.getResponseCode() == 200) {
        long l = httpURLConnection.getContentLength();
        r.a(l);
        r.a(true);
        r.a((String)null);
        String str = z.b(str1);
        File file = new File(paramFile, str);
        n.a(str2, file.getAbsolutePath());
        r.a(file);
      } else {
        r.a("File not currently available on rusEFI servers.");
      } 
      return r;
    } catch (Exception exception) {
      D.c("Failed to get ini: " + exception.getMessage());
      r.a("Unable to get ECU Definition for signature: " + str1 + ", service unavailable.");
      return r;
    } finally {
      if (httpURLConnection != null)
        try {
          httpURLConnection.disconnect();
        } catch (Exception exception) {} 
    } 
  }
  
  private static R d(String paramString, File paramFile) {
    String str1 = paramString;
    paramString = paramString.replace("MSLabs", "").trim();
    String str2 = "https://www.mslabs.gr/downloads/ini_files/" + paramString + ".ini";
    R r = new R();
    HttpURLConnection httpURLConnection = null;
    try {
      HttpURLConnection.setFollowRedirects(false);
      httpURLConnection = (HttpURLConnection)(new URL(str2)).openConnection();
      httpURLConnection.setRequestMethod("HEAD");
      if (httpURLConnection.getResponseCode() == 200) {
        long l = httpURLConnection.getContentLength();
        r.a(l);
        r.a(true);
        r.a((String)null);
        String str = z.b(str1);
        File file = new File(paramFile, str);
        n.a(str2, file.getAbsolutePath());
        r.a(file);
      } else {
        r.a("File not currently available on rusEFI servers.");
      } 
      return r;
    } catch (Exception exception) {
      D.c("Failed to get ini: " + exception.getMessage());
      r.a("Unable to get ECU Definition for signature: " + str1 + ", service unavailable.");
      return r;
    } finally {
      if (httpURLConnection != null)
        try {
          httpURLConnection.disconnect();
        } catch (Exception exception) {} 
    } 
  }
  
  public static void a(String paramString, double paramDouble, File paramFile) {
    x x = new x(paramString, paramDouble, paramFile);
    x.start();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */