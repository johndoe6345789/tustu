package com.efiAnalytics.testers;

import V.ExceptionInVPackage;
import W.n;
import W.o;
import al.AbstractInAlPackage;
import am.AmInterfaceEcho;
import am.AmComponentHotel;
import am.PathTostring;
import bH.D;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MdfToDataSet {
  public static void main(String[] paramArrayOfString) {
    SeekableByteChannel seekableByteChannel = null;
    long l = System.currentTimeMillis();
    try {
      Path path = Paths.get("C:\\Users\\p_tob\\Dropbox\\TunerStudioProjects\\support\\MLV\\MF4\\MNOA_2024-03-19_Dyno_UpperInjectorCalWork.mf4", new String[0]);
      seekableByteChannel = Files.newByteChannel(path, new OpenOption[] { StandardOpenOption.READ });
      String str = ExceptionInVPackage(seekableByteChannel);
      if (str.startsWith("4")) {
        PathTostring PathTostring = PathTostring.ExceptionInVPackage(path, seekableByteChannel);
        D.c("IDBlock: " + PathTostring);
        D.c("Read MDF IDBlock in " + (System.currentTimeMillis() - l) + "ms");
        l = System.currentTimeMillis();
        AmComponentHotel AmComponentHotel = PathTostring.j();
        D.c("HDBlock: " + AmComponentHotel);
        D.c("Read HDBlock " + (System.currentTimeMillis() - l) + "ms");
        l = System.currentTimeMillis();
        List list = AbstractInAlPackage.ExceptionInVPackage(AmComponentHotel);
        byte b = 1;
        for (AmInterfaceEcho AmInterfaceEcho : list) {
          D.c("  DGBlock " + b++ + " :" + AmInterfaceEcho);
          List list1 = AbstractInAlPackage.ExceptionInVPackage(AmInterfaceEcho.f());
          n n = AbstractInAlPackage.ExceptionInVPackage(list1);
          String str1 = ExceptionInVPackage(path.toString()) + b + ".msl";
          o.ExceptionInVPackage(n, str1, "\t");
          if (b > 0)
            break; 
        } 
        D.c("  Read all DGBlocks in " + (System.currentTimeMillis() - l) + "ms");
      } else {
        throw new ExceptionInVPackage("Invalid file format for MDF4 reader");
      } 
    } catch (IOException iOException) {
      Logger.getLogger(MdfReader.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } finally {
      try {
        seekableByteChannel.close();
      } catch (Exception exception) {
        Logger.getLogger(MdfToDataSet.class.getName()).log(Level.SEVERE, (String)null, exception);
      } 
    } 
  }
  
  private static String ExceptionInVPackage(SeekableByteChannel paramSeekableByteChannel) {
    ByteBuffer byteBuffer = ByteBuffer.allocate(64);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramSeekableByteChannel.position(0L);
    paramSeekableByteChannel.read(byteBuffer);
    byteBuffer.rewind();
    byte[] arrayOfByte = new byte[8];
    byteBuffer.get(arrayOfByte);
    String str = new String(arrayOfByte, "ISO-8859-1");
    if (!str.equals("MDF     "))
      throw new IOException("Invalid or corrupt MDF file: " + str); 
    arrayOfByte = new byte[8];
    byteBuffer.get(arrayOfByte);
    return new String(arrayOfByte, "ISO-8859-1");
  }
  
  public static String ExceptionInVPackage(String paramString) {
    int PathTostring = paramString.lastIndexOf(".");
    if (PathTostring > 0)
      paramString = paramString.substring(0, PathTostring); 
    return paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/testers/MdfToDataSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */