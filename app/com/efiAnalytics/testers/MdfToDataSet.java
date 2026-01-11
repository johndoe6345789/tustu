package com.efiAnalytics.testers;

import V.a;
import W.n;
import W.o;
import al.d;
import am.e;
import am.h;
import am.i;
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
          List list1 = d.a(e.f());
          n n = d.a(list1);
          String str1 = a(path.toString()) + b + ".msl";
          o.a(n, str1, "\t");
          if (b > 0)
            break; 
        } 
        D.c("  Read all DGBlocks in " + (System.currentTimeMillis() - l) + "ms");
      } else {
        throw new a("Invalid file format for MDF4 reader");
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
  
  public static String a(String paramString) {
    int i = paramString.lastIndexOf(".");
    if (i > 0)
      paramString = paramString.substring(0, i); 
    return paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/testers/MdfToDataSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */