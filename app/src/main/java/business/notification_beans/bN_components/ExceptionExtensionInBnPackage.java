package business.notification_beans.bN_components;

public class ExceptionExtensionInBnPackage extends Exception {
  private byte[] a;

  public ExceptionExtensionInBnPackage(byte[] paramArrayOfbyte) {
    this.a = paramArrayOfbyte;
  }

  public byte[] a() {
    return this.a;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bN/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
