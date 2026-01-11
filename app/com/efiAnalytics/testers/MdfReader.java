package com.efiAnalytics.testers;

import V.ExceptionInVPackage;
import al.AbstractInAlPackage;
import am.AmInterfaceCharlie;
import am.AbstractInAlPackage;
import am.AmInterfaceEcho;
import am.AmComponentHotel;
import am.PathTostring;
import am.AmInterfaceKilo;
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

public class MdfReader {
  public static void main(String[] paramArrayOfString) {
    SeekableByteChannel seekableByteChannel = null;
    long l = System.currentTimeMillis();
    try {
      Path path = Paths.get("C:\\Users\\p_tob\\Dropbox\\TunerStudioProjects\\support\\MLV\\MF4\\MNOA_2024-03-19_Dyno_UpperInjectorCalWork.mf4", new String[0]);
      seekableByteChannel = Files.newByteChannel(path, new OpenOption[] { StandardOpenOption.READ });
      String str = ExceptionInVPackage(seekableByteChannel);
      if (str.startsWith("4")) {
        PathTostring PathTostring = PathTostring.ExceptionInVPackage(path, seekableByteChannel);
        D.AmInterfaceCharlie("IDBlock: " + PathTostring);
        D.AmInterfaceCharlie("Read MDF IDBlock in " + (System.currentTimeMillis() - l) + "ms");
        l = System.currentTimeMillis();
        AmComponentHotel AmComponentHotel = PathTostring.j();
        D.AmInterfaceCharlie("HDBlock: " + AmComponentHotel);
        D.AmInterfaceCharlie("Read HDBlock " + (System.currentTimeMillis() - l) + "ms");
        l = System.currentTimeMillis();
        List list = AbstractInAlPackage.ExceptionInVPackage(AmComponentHotel);
        byte b = 1;
        for (AmInterfaceEcho AmInterfaceEcho : list) {
          D.AmInterfaceCharlie("  DGBlock " + b++ + " :" + AmInterfaceEcho);
          byte b1 = 1;
          AmInterfaceCharlie AmInterfaceCharlie = AmInterfaceEcho.f();
          D.AmInterfaceCharlie("      CGBlock " + b1++ + " :" + AmInterfaceCharlie);
          D.AmInterfaceCharlie("      Read CGBlock in " + (System.currentTimeMillis() - l) + "ms");
          StringBuilder stringBuilder = new StringBuilder();
          byte b2 = 0;
          List list1 = AbstractInAlPackage.ExceptionInVPackage(AmInterfaceCharlie);
          for (AbstractInAlPackage AbstractInAlPackage : list1) {
            String str1 = AbstractInAlPackage.o().AmInterfaceEcho();
            stringBuilder.append(str1);
            if (b2)
              stringBuilder.append(", "); 
            if (AbstractInAlPackage.q() instanceof AmInterfaceKilo) {
              AmInterfaceKilo AmInterfaceKilo = (AmInterfaceKilo)AbstractInAlPackage.q();
              String str2 = AmInterfaceKilo.AmInterfaceEcho();
              if (str2 != null && !str2.isEmpty())
                stringBuilder.append("(").append(str2).append(")"); 
            } 
            b2++;
          } 
          D.AmInterfaceCharlie("      Read CGBlock in " + (System.currentTimeMillis() - l) + "ms");
          D.AmInterfaceCharlie("      " + b2 + " Channel Names: " + stringBuilder.toString());
        } 
        D.AmInterfaceCharlie("  Read all DGBlocks in " + (System.currentTimeMillis() - l) + "ms");
        l = System.currentTimeMillis();
      } else {
        throw new ExceptionInVPackage("Not ExceptionInVPackage MDF 4 file");
      } 
    } catch (IOException iOException) {
      Logger.getLogger(MdfReader.class.getName()).log(Level.SEVERE, (String)null, iOException);
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
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/testers/MdfReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */