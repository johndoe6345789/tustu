package G;

public class GInterfaceAu {
  private static aU a = null;

  public static aU a() {
    if (a == null) a = new aU();
    return a;
  }

  public byte[] a(bT parambT) {
    if (parambT.b().equals("20")) return null;
    if (parambT.b().startsWith("MSnS-extra")
        || parambT.b().startsWith("MS1/Extra")
        || parambT.b().startsWith("MS/Extra")) {
      byte[] arrayOfByte = new byte[1];
      arrayOfByte[0] = 84;
      return arrayOfByte;
    }
    if (parambT.b().startsWith("MSII")
        || parambT.b().startsWith("MS4")
        || parambT.b().startsWith("MShift")
        || parambT.b().startsWith("Trans ")
        || parambT.b().startsWith("IOExt")
        || parambT.b().startsWith("MS Ext")
        || parambT.b().toLowerCase().startsWith("monsterfirm")) {
      byte[] arrayOfByte = new byte[1];
      arrayOfByte[0] = 83;
      return arrayOfByte;
    }
    if (parambT.b().startsWith("MS3") || parambT.b().startsWith("MS2Extra")) {
      byte[] arrayOfByte = new byte[1];
      arrayOfByte[0] = 83;
      return arrayOfByte;
    }
    if (parambT.b().startsWith("Ditron")) {
      byte[] arrayOfByte = new byte[1];
      arrayOfByte[0] = 113;
      return arrayOfByte;
    }
    return null;
  }

  public byte[] b(bT parambT) {
    if (parambT.b().startsWith("MS3")
        || parambT.b().startsWith("Trans ")
        || parambT.b().startsWith("IOExt")
        || parambT.b().startsWith("MS2Extra")) {
      byte[] arrayOfByte = new byte[1];
      arrayOfByte[0] = 77;
      return arrayOfByte;
    }
    return null;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/aU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
