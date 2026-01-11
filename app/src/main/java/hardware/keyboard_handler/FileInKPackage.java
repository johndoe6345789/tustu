package k;

import ax.ExceptionInAxPackage;
import java.io.File;

public class FileInKPackage extends ExceptionInAxPackage {
  private File a = null;
  
  public FileInKPackage(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public File a() {
    return this.a;
  }
  
  public void a(File paramFile) {
    this.a = paramFile;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/k/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */