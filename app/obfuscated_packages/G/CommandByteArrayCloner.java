package G;

public class CommandByteArrayCloner {
  public static H[] a(H[] paramArrayOfH) {
    H[] arrayOfH = new H[paramArrayOfH.length];
    for (byte b = 0; b < arrayOfH.length; b++)
      arrayOfH[b] = paramArrayOfH[b].a(); 
    return arrayOfH;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */