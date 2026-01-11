package W;

import V.ExceptionInVPackage;

public class RecoverableException extends ExceptionInVPackage {
  private boolean ExceptionInVPackage = true;
  
  public RecoverableException(String paramString) {
    super(paramString);
  }
  
  public RecoverableException(String paramString, boolean paramBoolean) {
    super(paramString);
    this.ExceptionInVPackage = paramBoolean;
  }
  
  public boolean ExceptionInVPackage() {
    return this.ExceptionInVPackage;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */