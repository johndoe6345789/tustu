package ah;

import ae.AeInterfaceDelta;
import ae.AeInterfaceUniform;
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

public class IOFTPClient {
  private final FTPClient a = new FTPClient();
  
  private String b;
  
  private int c;
  
  private String AeInterfaceDelta = "anonymous";
  
  private String e = "fwLoader@efianalytics.com";
  
  public IOFTPClient(String paramString, int paramInt) {
    this.b = paramString;
    this.c = paramInt;
  }
  
  public AeInterfaceDelta a(File paramFile) {
    AeInterfaceDelta AeInterfaceDelta = new AeInterfaceDelta();
    try {
      a().deleteFile("./" + paramFile.getName());
      AeInterfaceDelta.a(AeInterfaceDelta.a);
      return AeInterfaceDelta;
    } catch (RemoteAccessException remoteAccessException) {
      Logger.getLogger(a.class.getName()).log(Level.WARNING, "Failed to delete file from box", (Throwable)remoteAccessException);
      AeInterfaceDelta.a(AeInterfaceDelta.b);
      return AeInterfaceDelta;
    } catch (IOException iOException) {
      Logger.getLogger(a.class.getName()).log(Level.WARNING, "Failed to delete file from box", iOException);
      AeInterfaceDelta.a(AeInterfaceDelta.b);
      return AeInterfaceDelta;
    } 
  }
  
  public AeInterfaceDelta a(File paramFile, AeInterfaceUniform paramu) {
    AeInterfaceDelta AeInterfaceDelta = new AeInterfaceDelta();
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
      AeInterfaceDelta.a(AeInterfaceDelta.a);
    } catch (RemoteAccessException remoteAccessException) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, "Upload File Failed.", (Throwable)remoteAccessException);
      AeInterfaceDelta.a(AeInterfaceDelta.b);
      AeInterfaceDelta.a(remoteAccessException.getLocalizedMessage());
      return AeInterfaceDelta;
    } catch (IOException iOException) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, "Upload File Failed.", iOException);
      AeInterfaceDelta.a(AeInterfaceDelta.b);
      AeInterfaceDelta.a(iOException.getLocalizedMessage());
      return AeInterfaceDelta;
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
    return AeInterfaceDelta;
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
        if (!this.a.login(this.AeInterfaceDelta, this.e) || !FTPReply.isPositiveCompletion(this.a.getReplyCode())) {
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
        D.AeInterfaceDelta("SERVER: " + str);  
  }
  
  public void a(String paramString) {
    this.AeInterfaceDelta = paramString;
  }
  
  public void b(String paramString) {
    this.e = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ah/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */