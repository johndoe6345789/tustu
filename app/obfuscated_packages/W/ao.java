package W;

import aE.a;
import bH.D;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ao implements am {
  private Properties b = null;
  
  ar a;
  
  private File c;
  
  private File d;
  
  public ao(a parama) {
    this.a = new ar((Properties)parama, "PersistedAccumulatedValue");
    this.c = parama.g();
    this.d = new File(this.c.getParentFile(), this.c.getName() + ".bak");
    this.b = new Properties();
    if (this.c.exists())
      try {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.c));
        this.b.load(bufferedInputStream);
      } catch (IOException iOException) {
        D.a("Failed to load Persisted Channel Properties: " + this.c.getAbsolutePath());
        iOException.printStackTrace();
      }  
  }
  
  private boolean a(int paramInt) {
    try {
      Thread.sleep(paramInt);
      return true;
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(ao.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      return false;
    } 
  }
  
  public void a() {
    if (this.c.exists() && this.c.length() > 0L)
      try {
        if (this.d.exists() && !this.d.delete()) {
          D.b("Failed to delete PersistedChannel Back up File: " + this.d.getAbsolutePath());
        } else if (!a(50) || !this.c.renameTo(this.d)) {
          D.b("Failed to rename PersistedChannel File: " + this.c.getAbsolutePath() + " to: " + this.d.getAbsolutePath());
        } 
      } catch (Exception exception) {
        Logger.getLogger(ao.class.getName()).log(Level.WARNING, "Failed to create PersistedChannel Backup file", exception);
      }  
    if (!this.c.exists()) {
      BufferedOutputStream bufferedOutputStream = null;
      try {
        if (this.c.createNewFile()) {
          bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.c));
          this.b.store(bufferedOutputStream, "Persisted Channels storage file  by EFI Analytics, Inc\n#Last Saved on: " + (new Date()).toString());
        } else {
          D.b("Failed to create PersistedChannel File: " + this.c.getAbsolutePath());
        } 
      } catch (FileNotFoundException fileNotFoundException) {
        Logger.getLogger(ao.class.getName()).log(Level.SEVERE, "Failed to save PersistedChannel File, File not Found", fileNotFoundException);
      } catch (IOException iOException) {
        Logger.getLogger(ao.class.getName()).log(Level.SEVERE, "Failed to save PersistedChannel File", iOException);
      } finally {
        try {
          bufferedOutputStream.close();
        } catch (IOException iOException) {
          Logger.getLogger(ao.class.getName()).log(Level.SEVERE, "Failed to close file: " + this.c.getAbsolutePath(), iOException);
        } 
      } 
    } 
  }
  
  public void a(String paramString1, String paramString2) {
    if (paramString2 == null || paramString2.isEmpty()) {
      this.b.remove(paramString1);
    } else {
      this.b.setProperty(paramString1, paramString2);
    } 
  }
  
  public String b(String paramString1, String paramString2) {
    String str = this.b.getProperty(paramString1);
    if (str == null) {
      str = this.a.b(paramString1, null);
      if (str != null)
        a(paramString1, str); 
    } 
    if (str == null)
      str = paramString2; 
    return str;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/ao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */