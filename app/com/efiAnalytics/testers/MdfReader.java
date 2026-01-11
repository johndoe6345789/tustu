package com.efiAnalytics.testers;

import V.a;
import al.d;
import am.c;
import am.d;
import am.e;
import am.h;
import am.i;
import am.k;
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
      String str = a(seekableByteChannel);
      if (str.startsWith("4")) {
        i i = i.a(path, seekableByteChannel);
        D.c("IDBlock: " + i);
        D.c("Read MDF IDBlock in " + (System.currentTimeMillis() - l) + "ms");
        l = System.currentTimeMillis();
        h h = i.j();
        D.c("HDBlock: " + h);
        D.c("Read HDBlock " + (System.currentTimeMillis() - l) + "ms");
        l = System.currentTimeMillis();
        List list = d.a(h);
        byte b = 1;
        for (e e : list) {
          D.c("  DGBlock " + b++ + " :" + e);
          byte b1 = 1;
          c c = e.f();
          D.c("      CGBlock " + b1++ + " :" + c);
          D.c("      Read CGBlock in " + (System.currentTimeMillis() - l) + "ms");
          StringBuilder stringBuilder = new StringBuilder();
          byte b2 = 0;
          List list1 = d.a(c);
          for (d d : list1) {
            String str1 = d.o().e();
            stringBuilder.append(str1);
            if (b2)
              stringBuilder.append(", "); 
            if (d.q() instanceof k) {
              k k = (k)d.q();
              String str2 = k.e();
              if (str2 != null && !str2.isEmpty())
                stringBuilder.append("(").append(str2).append(")"); 
            } 
            b2++;
          } 
          D.c("      Read CGBlock in " + (System.currentTimeMillis() - l) + "ms");
          D.c("      " + b2 + " Channel Names: " + stringBuilder.toString());
        } 
        D.c("  Read all DGBlocks in " + (System.currentTimeMillis() - l) + "ms");
        l = System.currentTimeMillis();
      } else {
        throw new a("Not a MDF 4 file");
      } 
    } catch (IOException iOException) {
      Logger.getLogger(MdfReader.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
  }
  
  private static String a(SeekableByteChannel paramSeekableByteChannel) {
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