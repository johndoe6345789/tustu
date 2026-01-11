package ah;

import ae.d;
import ae.u;
import bH.D;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public class a {
  private final FTPClient a = new FTPClient();
  
  private String b;
  
  private int c;
  
  private String d = "anonymous";
  
  private String e = "fwLoader@efianalytics.com";
  
  public a(String paramString, int paramInt) {
    this.b = paramString;
    this.c = paramInt;
  }
  
  public d a(File paramFile) {
    d d = new d();
    try {
      a().deleteFile("./" + paramFile.getName());
      d.a(d.a);
      return d;
    } catch (RemoteAccessException remoteAccessException) {
      Logger.getLogger(a.class.getName()).log(Level.WARNING, "Failed to delete file from box", (Throwable)remoteAccessException);
      d.a(d.b);
      return d;
    } catch (IOException iOException) {
      Logger.getLogger(a.class.getName()).log(Level.WARNING, "Failed to delete file from box", iOException);
      d.a(d.b);
      return d;
    } 
  }
  
  public d a(File paramFile, u paramu) {
    d d = new d();
    OutputStream outputStream = null;
    FileInputStream fileInputStream = null;
    try {
      paramu.a(0.0D);
      outputStream = a().storeFileStream(paramFile.getName());
      fileInputStream = new FileInputStream(paramFile);
      byte[] arrayOfByte = new byte[4096];
      int i = -1;
      long l1 = 0L;
      int j = 0;
      long l2 = paramFile.length();
      if (outputStream == null) {
        D.b("Failed to get FTP Stream, using alternative method.");
        a().storeFile(paramFile.getName(), fileInputStream);
      } else {
        while ((i = fileInputStream.read(arrayOfByte)) != -1) {
          outputStream.write(arrayOfByte, 0, i);
          l1 += i;
          j = (int)(l1 * 100L / l2);
          paramu.a(j);
        } 
      } 
      a().completePendingCommand();
      d.a(d.a);
    } catch (RemoteAccessException remoteAccessException) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, "Upload File Failed.", (Throwable)remoteAccessException);
      d.a(d.b);
      d.a(remoteAccessException.getLocalizedMessage());
      return d;
    } catch (IOException iOException) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, "Upload File Failed.", iOException);
      d.a(d.b);
      d.a(iOException.getLocalizedMessage());
      return d;
    } finally {
      if (fileInputStream != null)
        try {
          fileInputStream.close();
        } catch (Exception exception) {} 
      if (outputStream != null)
        try {
          outputStream.close();
        } catch (Exception exception) {} 
      b();
    } 
    return d;
  }
  
  private FTPClient a() {
    if (!this.a.isConnected()) {
      try {
        this.a.connect(this.b, this.c);
        a(this.a);
        if (!FTPReply.isPositiveCompletion(this.a.getReplyCode())) {
          this.a.disconnect();
          throw new RemoteAccessException("Connection Refused");
        } 
      } catch (IOException iOException) {
        throw new RemoteAccessException(iOException.getMessage());
      } 
      try {
        if (!this.a.login(this.d, this.e) || !FTPReply.isPositiveCompletion(this.a.getReplyCode())) {
          a(this.a);
          b();
          throw new RemoteAccessException("Invalid User and/or password");
        } 
        a(this.a);
      } catch (IOException iOException) {
        b();
        throw new RemoteAccessException("Login failed: " + iOException.getLocalizedMessage());
      } 
      try {
        this.a.setFileType(2);
        a(this.a);
      } catch (IOException iOException) {
        b();
        throw new RemoteAccessException("Unable to set Transfertype to binary: " + iOException.getLocalizedMessage());
      } 
    } 
    return this.a;
  }
  
  private void b() {
    try {
      if (this.a != null && this.a.isConnected()) {
        this.a.logout();
        D.c("Logged out FTP Session.");
        this.a.disconnect();
        D.c("Disconnected FTP Session.");
        Thread.sleep(10L);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void a(FTPClient paramFTPClient) {
    String[] arrayOfString = paramFTPClient.getReplyStrings();
    if (arrayOfString != null && arrayOfString.length > 0)
      for (String str : arrayOfString)
        D.d("SERVER: " + str);  
  }
  
  public void a(String paramString) {
    this.d = paramString;
  }
  
  public void b(String paramString) {
    this.e = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ah/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */