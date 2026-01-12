package business.bit_array_utils;

import W.q;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class n {
  static boolean a = false;

  static long b = 0L;

  public static String a(String paramString) {
    String str = "";
    try {
      URL uRL = new URL(paramString);
      URLConnection uRLConnection = uRL.openConnection();
      uRLConnection.setReadTimeout(12000);
      BufferedReader bufferedReader =
          new BufferedReader(new InputStreamReader(uRLConnection.getInputStream()));
      String str1 = null;
      while ((str1 = bufferedReader.readLine()) != null) str = str + str1;
      bufferedReader.close();
    } catch (MalformedURLException malformedURLException) {
      System.out.println("Invalid URL: " + paramString);
      throw new IOException("Invalid URL");
    } catch (IOException iOException) {
      throw new IOException("Unable to communicate with server.");
    }
    return str;
  }

  public static void a(String paramString1, String paramString2) {
    a(paramString1, paramString2, null);
  }

  public static void a(String paramString1, String paramString2, q paramq) {
    String str = null;
    if (paramString2.lastIndexOf(".") != -1) {
      str = paramString2.substring(0, paramString2.lastIndexOf(".") + 1) + "temp";
    } else {
      str = paramString2 + ".temp";
    }
    try {
      paramString1 = X.b(paramString1, " ", "%20");
      URL uRL = new URL(paramString1);
      URLConnection uRLConnection = uRL.openConnection();
      BufferedInputStream bufferedInputStream =
          new BufferedInputStream(uRLConnection.getInputStream());
      long l = uRLConnection.getContentLength();
      File file1 = new File(str);
      if (file1.exists()) file1.delete();
      file1 = new File(str);
      BufferedOutputStream bufferedOutputStream =
          new BufferedOutputStream(new FileOutputStream(file1));
      try {
        if (paramq != null) paramq.started(l);
        int i = 0;
        byte b = 0;
        while ((i = bufferedInputStream.read()) != -1) {
          bufferedOutputStream.write(i);
          if (paramq != null && b++ % 512 == 0) {
            double d = b / l;
            paramq.updateProgress(b, d);
          }
        }
        if (paramq != null) paramq.completed();
      } finally {
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        bufferedInputStream.close();
      }
      File file2 = new File(paramString2);
      if (file2.exists() && !file2.delete())
        System.out.println("Delete " + paramString2 + " FAILED");
      if (!file1.renameTo(file2))
        System.out.println(
            "Rename " + str + " to " + paramString2 + " FAILED, will finish on restart");
    } catch (MalformedURLException malformedURLException) {
      System.out.println("Bad URL:\n" + paramString1);
    }
  }

  public static boolean a() {
    W w = new W();
    w.start();
    long l = System.currentTimeMillis() + 10000L;
    while (!w.a() && l > System.currentTimeMillis()) {
      try {
        Thread.sleep(30L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
      }
    }
    b = System.currentTimeMillis();
    a = w.a();
    return a;
  }

  public static boolean b() {
    W w = new W();
    w.start();
    w.a(3000);
    if (System.currentTimeMillis() - b > 70000L) {
      long l = System.currentTimeMillis() + 3000L;
      while (!w.c() && l > System.currentTimeMillis()) {
        try {
          Thread.sleep(50L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(n.class.getName())
              .log(Level.SEVERE, (String) null, interruptedException);
        }
      }
      b = System.currentTimeMillis();
      a = w.a();
    } else {
      o o = new o(w);
      o.start();
    }
    return a;
  }

  public static boolean b(String paramString) {
    HttpURLConnection httpURLConnection = null;
    try {
      HttpURLConnection.setFollowRedirects(false);
      paramString = X.b(paramString, " ", "%20");
      httpURLConnection = (HttpURLConnection) (new URL(paramString)).openConnection();
      httpURLConnection.setRequestMethod("HEAD");
      return (httpURLConnection.getResponseCode() == 200);
    } catch (Exception exception) {
      exception.printStackTrace();
      return false;
    } finally {
      if (httpURLConnection != null)
        try {
          httpURLConnection.disconnect();
        } catch (Exception exception) {
        }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
