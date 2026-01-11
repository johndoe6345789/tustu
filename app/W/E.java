package W;

import V.a;
import bH.F;
import bH.X;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class E {
  public File a(String paramString, int paramInt1, int paramInt2) {
    F f = new F(this);
    f.b("THROTTLEFACTOR:");
    f.a("EFI Analytics generated Linear Throttle Calibration");
    f.a("Created on " + (new Date()).toString());
    f.a("");
    f.a("\tLow ADC = " + paramInt1 + "  \tHigh ADC = " + paramInt2);
    f.a("");
    G[] arrayOfG = new G[257];
    arrayOfG[0] = new G(this);
    arrayOfG[0].a("ADC");
    for (byte b = 1; b < arrayOfG.length; b++) {
      int i = b - 1;
      int j = -1;
      j = Math.round(100.0F * (i - paramInt1) / (paramInt2 - paramInt1));
      arrayOfG[b] = new G(this, "DB", "" + j, "" + i);
    } 
    File file = new File(paramString, "throttlefactor.inc");
    return a(file, f, arrayOfG);
  }
  
  public File a(File paramFile, F paramF, G[] paramArrayOfG) {
    try {
      if (paramFile.exists() && !paramFile.delete())
        throw new a("Unable to delete existing inc file! Check permissions.\n" + paramFile.getAbsolutePath()); 
      paramFile.createNewFile();
      FileOutputStream fileOutputStream = new FileOutputStream(paramFile);
      PrintStream printStream = new PrintStream(fileOutputStream);
      printStream.print(paramF.a());
      printStream.println(paramF.b());
      for (byte b = 0; b < paramArrayOfG.length; b++) {
        if (paramArrayOfG[b].b() != null && !paramArrayOfG[b].b().equals("")) {
          printStream.println("\t" + paramArrayOfG[b].a() + "\t" + X.a(paramArrayOfG[b].b(), ' ', 3) + "T\t; " + X.a(paramArrayOfG[b].c(), ' ', 3));
        } else {
          printStream.println("\t" + paramArrayOfG[b].a() + "\t" + X.a(paramArrayOfG[b].b(), ' ', 3) + "\t; " + X.a(paramArrayOfG[b].c(), ' ', 3));
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Error writing " + paramFile.getAbsoluteFile() + "\n" + exception.getMessage());
    } 
    F.c();
    return paramFile;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/E.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */