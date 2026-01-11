package business.binary_validators.bV_components;

import bH.D;
import bH.t;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NetworkInBvPackage {
  String[] a = new String[] { "https://updates.efianalytics.com/register/CheckForUpdates?", "https://updates2.efianalytics.com/register/CheckForUpdates?", "https://updates3.efianalytics.com/register/CheckForUpdates?" };
  
  String[] b = new String[] { "http://updates.efianalytics.com/register/CheckForUpdates?", "http://updates2.efianalytics.com/register/CheckForUpdates?", "http://updates3.efianalytics.com/register/CheckForUpdates?" };
  
  long c = 0L;
  
  long d = 0L;
  
  ArrayList e = new ArrayList();
  
  List f = new ArrayList();
  
  public d a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8) {
    e e = new e();
    e.a(paramString1);
    e.b(paramString2);
    e.c(paramString3);
    e.d(paramString4);
    e.e(paramString5);
    e.f(paramString6);
    e.g(paramString7);
    e.h(paramString8);
    return a(e);
  }
  
  public d a(e parame) {
    String str1 = "";
    String str2 = a();
    String str3 = str2 + "uid=" + parame.a() + "&version=" + parame.c() + "&appName=" + URLEncoder.encode(parame.b(), "UTF-8") + "&appEdition=" + URLEncoder.encode(parame.g(), "UTF-8") + "&installDate=" + parame.d() + "&javaVersion=" + System.getProperty("java.version") + "&os=" + URLEncoder.encode(System.getProperty("os.name"), "UTF-8") + "&arch=" + System.getProperty("os.arch") + "&loopCount=" + parame.e() + "&regKey=" + URLEncoder.encode(parame.f(), "UTF-8") + "&firmwareSignature=" + URLEncoder.encode(parame.h(), "UTF-8") + "&langCode=" + parame.i();
    try {
      URL uRL = new URL(str3);
      URLConnection uRLConnection = uRL.openConnection();
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream()));
      String str = null;
      while ((str = bufferedReader.readLine()) != null)
        str1 = str1 + str; 
      bufferedReader.close();
    } catch (MalformedURLException malformedURLException) {
      System.out.println("Invalid URL: " + str2);
    } 
    return (new d()).a(str1);
  }
  
  public String a() {
    int i = (int)Math.floor(this.b.length * Math.random());
    return this.b[i];
  }
  
  public void a(d paramd) {
    try {
      File file = new File(".", "updateStage");
      if (!file.exists()) {
        File file1 = new File(file, "aaaaaa");
        file1.mkdirs();
        file1.delete();
      } 
      a(file, paramd);
      File[] arrayOfFile = file.listFiles();
      for (File file1 : arrayOfFile) {
        File file2 = new File(".", file1.getName());
        if (!file2.exists() || file2.delete()) {
          try {
            t.a(file1, file2);
            file1.delete();
          } catch (V.a a1) {
            D.b("Failed to copy file: " + a1.getLocalizedMessage());
            File file3 = new File(".", file1.getName() + ".temp");
            try {
              t.a(file1, file3);
              file1.delete();
            } catch (V.a a2) {
              D.a("Update failed.");
              throw new IOException(a2.getLocalizedMessage());
            } 
          } 
        } else {
          D.d("Lock on file: " + file2.getName() + " will leave a temp version to be renamed on restart.");
          File file3 = new File(".", file1.getName() + ".temp");
          try {
            t.a(file1, file3);
            file1.delete();
          } catch (V.a a1) {
            D.a("Update failed.");
            throw new IOException(a1.getLocalizedMessage());
          } 
        } 
      } 
      file.delete();
    } catch (IOException iOException) {
      D.d("Failed on update, cleaning up.. Err: " + iOException.getLocalizedMessage());
      for (File file : this.f) {
        D.d("Deleteing: " + file.getName());
        file.delete();
      } 
    } 
  }
  
  public void a(File paramFile, d paramd) {
    this.c = b(paramd);
    this.d = 0L;
    Iterator<c> iterator = paramd.c();
    while (iterator.hasNext()) {
      c c = iterator.next();
      if (c.a().equals("fileUpdate")) {
        String[] arrayOfString = c.b();
        String str = null;
        if (arrayOfString.length > 2)
          str = arrayOfString[2]; 
        a(paramFile, arrayOfString[0], arrayOfString[1], str);
      } 
    } 
    c();
  }
  
  public long b(d paramd) {
    long l = 0L;
    Iterator<c> iterator = paramd.c();
    while (iterator.hasNext()) {
      c c = iterator.next();
      if (c.a().equals("fileUpdate")) {
        String[] arrayOfString = c.b();
        try {
          URL uRL = new URL(arrayOfString[1]);
          URLConnection uRLConnection = uRL.openConnection();
          l += uRLConnection.getContentLength();
        } catch (MalformedURLException malformedURLException) {
          System.out.println("Error getting file size");
        } 
      } 
    } 
    return l;
  }
  
  public long a(String paramString) {
    try {
      URL uRL = new URL(paramString);
      URLConnection uRLConnection = uRL.openConnection();
      return uRLConnection.getContentLength();
    } catch (MalformedURLException malformedURLException) {
      System.out.println("Error getting file size");
      return -1L;
    } 
  }
  
  public void a(File paramFile, String paramString1, String paramString2, String paramString3) {
    boolean bool;
    String str1 = paramString1 + ".temp.partial";
    String str2 = paramString1 + ".temp";
    long l = a(paramString2);
    File file1 = null;
    byte b1 = 5;
    byte b2 = 0;
    BufferedInputStream bufferedInputStream = null;
    BufferedOutputStream bufferedOutputStream = null;
    do {
      bool = false;
      try {
        boolean bool1;
        URL uRL = new URL(paramString2);
        URLConnection uRLConnection = uRL.openConnection();
        file1 = new File(paramFile, str1);
        uRLConnection.setReadTimeout(10000);
        if (paramString3 != null && !paramString3.isEmpty() && file1.exists() && file1.length() > 1000000L && file1.length() < l && b2 < 3) {
          uRLConnection.setRequestProperty("Range", "bytes=" + file1.length() + "-" + l);
          this.d = file1.length();
          bool1 = true;
        } else {
          file1.delete();
          file1 = new File(paramFile, str1);
          bool1 = false;
        } 
        bufferedInputStream = new BufferedInputStream(uRLConnection.getInputStream());
        if (!this.f.contains(file1))
          this.f.add(file1); 
        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file1, bool1));
        int i = 0;
        while ((i = bufferedInputStream.read()) != -1) {
          bufferedOutputStream.write(i);
          this.d++;
          if (this.d % 4096L == 0L) {
            Thread.currentThread();
            Thread.yield();
            b();
          } 
        } 
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        bufferedInputStream.close();
        b2++;
        if (paramString3 != null && !paramString3.isEmpty()) {
          String str = t.c(file1);
          if (!paramString3.toLowerCase().equals(str.toLowerCase())) {
            if (b2 > b1) {
              D.b("Download of: " + paramString1 + ", file size failed md5 checksum! server reported: " + paramString3.toLowerCase() + ", calculated: " + str.toLowerCase() + ", retrying");
              throw new IOException("Download file " + paramString1 + " after " + b1 + " attempts!");
            } 
            this.d -= file1.length();
            D.b("Download of: " + paramString1 + ", file size failed md5 checksum! retrying");
            if (file1.length() >= l)
              file1.delete(); 
          } else {
            bool = true;
          } 
        } else if (l != file1.length()) {
          D.b("Download of: " + paramString1 + ", file size not as expected! Expected: " + l + " bytes, got: " + file1.length() + ", retrying");
          this.d -= file1.length();
          if (b2 > b1)
            throw new IOException("Download file " + paramString1 + " after " + b1 + " attempts!"); 
        } 
      } catch (MalformedURLException malformedURLException) {
        System.out.println("Bad URL:\n" + paramString2);
        throw new IOException("Bad URL");
      } catch (IOException iOException) {
        if (file1 != null && file1.exists()) {
          D.b("Download of " + paramString1 + " interupted after " + file1.length() + " of expected " + l + " bytes.");
          try {
            if (bufferedOutputStream != null)
              bufferedOutputStream.close(); 
            if (bufferedInputStream != null)
              bufferedInputStream.close(); 
          } catch (Exception exception) {}
          if (b2 > b1) {
            file1.delete();
            throw iOException;
          } 
        } else {
          D.c("partialFile is null. Error message: " + iOException.getLocalizedMessage());
        } 
      } 
      if (file1 != null && l == file1.length())
        continue; 
      D.c("Download of " + paramString1 + " failed. Trying again.");
      try {
        Thread.sleep(100L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } while (file1 == null || (!bool && l != file1.length()));
    D.d("Download of: " + paramString1 + ", succeeded! File size: " + l + " bytes");
    File file2 = new File(paramFile, paramString1);
    if (file2.getName().toLowerCase().endsWith(".zip"))
      this.f.add(file2); 
    if (file2.exists() && !file2.delete())
      System.out.println("Delete " + paramString1 + " FAILED, will finish on restart"); 
    if (file2.exists() && !file2.delete()) {
      System.out.println("Delete " + paramString1 + " FAILED, update incomplete.");
      throw new IOException("Delete " + paramString1 + " FAILED, update incomplete.");
    } 
    if (!file1.renameTo(file2))
      System.out.println("Rename " + file1.getName() + " to " + file2.getName() + " FAILED, will finish on restart"); 
  }
  
  public void a(b paramb) {
    this.e.add(paramb);
  }
  
  private void b() {
    for (b b : this.e) {
      try {
        b.a(this.d, this.c);
      } catch (Exception exception) {}
    } 
  }
  
  private void c() {
    for (b b : this.e) {
      try {
        b.a();
      } catch (Exception exception) {}
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bV/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */