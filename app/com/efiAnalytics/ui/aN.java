package com.efiAnalytics.ui;

import bH.D;
import bH.X;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class aN {
  static dK a = null;
  
  public static void a(String paramString) {
    if (paramString.startsWith("file:") && paramString.toLowerCase().contains(".pdf"))
      try {
        String str1 = X.b(paramString, " ", "%20");
        URL uRL = new URL(str1);
        a(uRL);
        return;
      } catch (MalformedURLException malformedURLException) {} 
    String str = System.getProperty("os.name");
    boolean bool = false;
    if (bool) {
      URI uRI = null;
      try {
        String str1 = X.b(paramString, " ", "%20");
        uRI = (new URL(str1)).toURI();
      } catch (MalformedURLException malformedURLException) {
        Logger.getLogger(aN.class.getName()).log(Level.SEVERE, (String)null, malformedURLException);
        D.d("Invalid URL, will attempt direct opening: " + paramString);
        bool = false;
      } catch (URISyntaxException uRISyntaxException) {
        Logger.getLogger(aN.class.getName()).log(Level.SEVERE, (String)null, uRISyntaxException);
        D.d("Invalid URL, will attempt direct opening: " + paramString);
        bool = false;
      } 
      Desktop desktop = Desktop.getDesktop();
      if (paramString.startsWith("http:")) {
        try {
          desktop.browse(uRI);
        } catch (IOException iOException) {
          Logger.getLogger(aN.class.getName()).log(Level.SEVERE, (String)null, iOException);
          String str1 = "Failed to launch App for URL: " + paramString + "\nError: " + iOException.getLocalizedMessage();
          JOptionPane.showMessageDialog(null, str1);
        } 
      } else {
        String str1 = paramString.substring(7);
        File file = new File(str1);
        try {
          desktop.open(file);
        } catch (IOException iOException) {
          Logger.getLogger(aN.class.getName()).log(Level.SEVERE, (String)null, iOException);
          String str2 = "Failed to launch App for URL: " + paramString + "\nError: " + iOException.getLocalizedMessage();
          JOptionPane.showMessageDialog(null, str2);
        } 
      } 
    } 
    if (!bool)
      try {
        D.d("Opening URL: " + paramString);
        if (str.startsWith("Mac OS")) {
          Class<?> clazz = Class.forName("com.apple.eio.FileManager");
          Method method = clazz.getDeclaredMethod("openURL", new Class[] { String.class });
          method.invoke(null, new Object[] { paramString });
        } else if (str.startsWith("Windows")) {
          Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + paramString);
        } else {
          String[] arrayOfString = { "chrome", "firefox", "chromium-browser", "opera", "konqueror", "epiphany", "mozilla", "netscape" };
          String str1 = null;
          for (byte b = 0; b < arrayOfString.length && str1 == null; b++) {
            if (Runtime.getRuntime().exec(new String[] { "which", arrayOfString[b] }).waitFor() == 0)
              str1 = arrayOfString[b]; 
          } 
          if (str1 == null)
            throw new Exception("Could not find web browser"); 
          Runtime.getRuntime().exec(new String[] { str1, paramString });
        } 
      } catch (Exception exception) {
        JOptionPane.showMessageDialog(null, "Failed to launch App for URL: :\n" + exception.getLocalizedMessage());
      }  
  }
  
  public static void a(URL paramURL) {
    if (a == null)
      a = new dK(bV.c()); 
    a.a(paramURL);
    a.a(true);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/aN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */