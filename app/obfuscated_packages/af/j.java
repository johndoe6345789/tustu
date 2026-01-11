package af;

import G.J;
import G.bT;
import G.f;
import ad.a;
import ad.b;
import ad.c;
import ad.d;
import ae.d;
import ae.p;
import ae.q;
import ae.u;
import ae.v;
import bH.D;
import bH.X;
import bH.c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class j implements a {
  static f d = new f();
  
  private static byte e = 0;
  
  public static d a(p paramp) {
    d d = new d();
    byte[] arrayOfByte = { 13 };
    for (byte b = 0; b < 10; b++) {
      byte[] arrayOfByte1 = null;
      try {
        arrayOfByte1 = paramp.a(arrayOfByte, 3);
      } catch (v v) {
        Logger.getLogger(j.class.getName()).log(Level.SEVERE, "Unexpected Protocol Error", (Throwable)v);
        d.a(d.b);
        d.a("Unexpected Protocol Error");
      } 
      if (arrayOfByte1 == null || arrayOfByte1.length < 3) {
        D.c("wakeup s12 failed.");
        d.a(d.b);
      } else {
        int i = c.a(arrayOfByte1[0]);
        int k = c.a(arrayOfByte1[1]);
        int m = c.a(arrayOfByte1[2]);
        switch (i) {
          case 224:
          case 225:
            break;
          default:
            D.c("Error code 0x" + Integer.toHexString(i));
            break;
        } 
        switch (k) {
          case 0:
            break;
          default:
            D.c("Status code 0x" + Integer.toHexString(k));
            break;
        } 
        if (m != 62) {
          D.c("Prompt was 0x" + Integer.toHexString(m));
        } else {
          D.c("Got Prompt, continuing...");
          d.a(d.a);
          return d;
        } 
        if (i == 0 && k == 1 && (m & 0x80) == 128) {
          D.c("Looks like this was really new serial... Try again.  Aborting.");
          d.a(d.b);
          d.a("Attempt to wake up using old serial, but looks like controller is running new serial");
          d.a(false);
          return d;
        } 
      } 
      a(250);
    } 
    d.a(d.b);
    d.a("Could not wake up processor.");
    return d;
  }
  
  protected static void a(int paramInt) {
    try {
      Thread.sleep(paramInt);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(j.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
  }
  
  protected static int a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null || paramArrayOfbyte.length < 3)
      return 255; 
    byte b1 = 0;
    int i = c.a(paramArrayOfbyte[b1++]);
    if (i == 236 && J.I()) {
      D.c("\nAdditional bytes FSTAT=0x" + Integer.toHexString(c.a(paramArrayOfbyte[b1++])));
      D.c("FERSTAT=0x" + Integer.toHexString(c.a(paramArrayOfbyte[b1++])) + "\nRX ");
    } 
    int k = c.a(paramArrayOfbyte[b1++]);
    if (J.I())
      D.c("Response status code: " + Integer.toHexString(k)); 
    switch (k) {
      case 0:
        break;
      case 1:
        D.a("Program running, download failed, statusCode=0x" + Integer.toHexString(k));
        break;
      case 2:
        D.a("Program halted, download failed, statusCode=0x" + Integer.toHexString(k));
        break;
      case 4:
        D.a("Program trace detected, download failed, statusCode=0x" + Integer.toHexString(k));
        break;
      case 8:
        D.d("Cold reset detected, statusCode=0x" + Integer.toHexString(k));
        break;
      case 12:
        D.d("Warm reset detected, statusCode=0x" + Integer.toHexString(k));
        break;
      default:
        D.a("Unknown status received, statusCode=0x" + Integer.toHexString(k));
        break;
    } 
    byte b = paramArrayOfbyte[b1++];
    if (i != 224) {
      if (J.I())
        D.c(b(i)); 
      if (i == 0)
        i = 255; 
      return i;
    } 
    if (k != 0 && J.I())
      D.c("Status code 0x" + Integer.toHexString(k)); 
    if (b != 62 && J.I())
      D.c("Prompt was " + (char)b); 
    return 0;
  }
  
  private static String b(int paramInt) {
    switch (paramInt) {
      case 224:
        return "Successful";
      case 225:
        return "Command not recognized, e=0x" + Integer.toHexString(paramInt);
      case 226:
        return "Command not allowed in run mode, e=0x" + Integer.toHexString(paramInt);
      case 227:
        return "Stack pointer out of range, e=0x" + Integer.toHexString(paramInt);
      case 228:
        return "Stack pointer invalid, e=0x" + Integer.toHexString(paramInt);
      case 229:
        return "Attempt to write read-only memory, e=0x" + Integer.toHexString(paramInt);
      case 230:
        return "Access error when writing FLASH/EEPROM memory, e=0x" + Integer.toHexString(paramInt);
      case 233:
        return "Memory protection violation writing EEPROM memory, e=0x" + Integer.toHexString(paramInt);
    } 
    return "Error code 0x" + Integer.toHexString(paramInt);
  }
  
  public static d a(p paramp, boolean paramBoolean) {
    byte[] arrayOfByte1;
    d d = new d();
    if (J.I())
      D.c("Sending jumperless flash command"); 
    if (J.I())
      D.c("TX: !!!SafetyFirst"); 
    if (paramBoolean) {
      arrayOfByte1 = a;
    } else {
      arrayOfByte1 = c;
    } 
    byte[] arrayOfByte2 = paramp.a(arrayOfByte1, 1, 250);
    if (arrayOfByte2 == null || arrayOfByte2.length < 1 || arrayOfByte2[0] < 0) {
      D.c("Error: enter_boot_mode(): Error sending SafetyFirst command");
      d.a(d.b);
      d.a("Failed to enter bootload mode.");
      return d;
    } 
    a(250);
    return d;
  }
  
  protected static boolean a(p paramp, q paramq) {
    byte[] arrayOfByte = { 70 };
    byte b = 0;
    while (true) {
      try {
        byte[] arrayOfByte1 = paramp.b(arrayOfByte, 3);
        if (arrayOfByte1 == null || arrayOfByte1.length == 0) {
          D.c("No reply, assuming old style serial.\n");
          return false;
        } 
        if (arrayOfByte1[0] == 48 && arrayOfByte1[1] == 48 && arrayOfByte1[2] >= 49) {
          D.c("New serial format >= 001 detected\n");
          return true;
        } 
        if (arrayOfByte1[0] == 48 && arrayOfByte1[1] == 48 && arrayOfByte1[2] == 48) {
          D.c("Old style serial detected\n");
          return false;
        } 
        if (arrayOfByte1[0] == 0 && arrayOfByte1[1] == 0 && arrayOfByte1[2] == 0) {
          D.c("No reply, assuming old style serial.\n");
          return false;
        } 
        D.c("Garbled reply, " + c.d(arrayOfByte1));
      } catch (IOException iOException) {}
      if (b++ >= 3)
        throw new IOException("Unable to detect Serial Protocol."); 
    } 
  }
  
  public static boolean b(p paramp) {
    byte[] arrayOfByte = { 13 };
    byte b = 0;
    while (true) {
      try {
        byte[] arrayOfByte1 = paramp.b(arrayOfByte, 3);
        if (arrayOfByte1 == null || arrayOfByte1.length == 0) {
          D.c("No reply, assuming old style serial, not in bootload mode");
          return false;
        } 
        if (arrayOfByte1[2] == Byte.MIN_VALUE) {
          D.c("Looks like new serial, not in bootload mode.");
          return false;
        } 
        if (arrayOfByte1[2] == 62) {
          D.c("Got a prompt, seems to be bootload");
          return true;
        } 
        D.c("Garbled reply, " + c.d(arrayOfByte1));
      } catch (IOException iOException) {
        Logger.getLogger(j.class.getName()).log(Level.SEVERE, "Can not communicate with controller", iOException);
      } catch (v v) {
        Logger.getLogger(j.class.getName()).log(Level.SEVERE, "Protocol Error??? Should not happen here.", (Throwable)v);
      } 
      if (b++ >= 3)
        throw new IOException("Unable to detect if in bootload."); 
    } 
  }
  
  public static d c(p paramp) {
    d d = new d();
    byte[] arrayOfByte1 = { -74 };
    byte[] arrayOfByte2 = null;
    if (J.I())
      D.c("Erasing main flash!"); 
    a(250);
    try {
      arrayOfByte2 = paramp.a(arrayOfByte1, 3, 1500);
    } catch (v v) {
      Logger.getLogger(j.class.getName()).log(Level.SEVERE, (String)null, (Throwable)v);
      d.a(d.b);
      d.a("Unexpected Protocol Error");
      return d;
    } 
    if (a(arrayOfByte2) != 0) {
      D.c("Erase_s12 got an error code!\n\nReflashing failed - please try again.\n");
      d.a(d.b);
      d.a("Erase_s12 got an error code! Reflashing failed - please try again.");
      return d;
    } 
    D.c("Erased s12.");
    d.a(d.a);
    d.a("Erase Successful");
    return d;
  }
  
  public static d a(p paramp, List paramList, u paramu, e parame) {
    byte[] arrayOfByte2;
    d d = new d();
    byte[] arrayOfByte1 = { -62 };
    d = d(paramp);
    if (d.a() == d.b)
      return d; 
    arrayOfByte1[0] = -74;
    if (J.I())
      D.c("Erasing main flash!"); 
    try {
      paramu.a(0.15D);
      arrayOfByte2 = paramp.a(arrayOfByte1, 3, 10000);
    } catch (v v) {
      Logger.getLogger(j.class.getName()).log(Level.SEVERE, (String)null, (Throwable)v);
      d.a(d.b);
      d.a("Unexpected Protocol Error");
      return d;
    } 
    if (a(arrayOfByte2) != 0) {
      D.c("Erase_s12x got an error code!\n\nReflashing failed - please try again.\n");
      d.a(d.b);
      d.a("Erase_s12x got an error code! Reflashing failed - please try again.");
      return d;
    } 
    if (paramList.isEmpty()) {
      paramu.a(0.95D);
    } else {
      paramu.a(0.7D);
    } 
    float f1 = paramList.size();
    float f2 = 0.0F;
    for (l l : paramList) {
      d = a(paramp, l);
      if (d.a() != d.a) {
        paramu.a("Erase 1K failed, Eraser Required");
        D.d("Erase 1K Failed, assuming not supported by monitor. Loading Eraser.");
        paramu.b("Your MS3 requires a full erase.\n Please remove boot-jumper if fitted.");
        return a(paramp, parame, paramu);
      } 
      D.d("Erased page 1k at a time: 0x" + Integer.toHexString(l.a()));
      f2++;
      paramu.a(0.699999988079071D + 0.3D * f2 / f1);
    } 
    d.a(d.a);
    d.a("Erase Successful");
    return d;
  }
  
  public static d a(p paramp, l paraml) {
    d d = null;
    d = d(paramp);
    if (d.a() == d.b)
      return d; 
    for (int i = paraml.b(); i < paraml.c(); i += 1024) {
      int k = (paraml.a() << 16) + i;
      d = a(paramp, k);
      if (d.a() == d.b)
        return d; 
      if (J.I())
        D.d("Erased Sector: 0x00" + Integer.toHexString(k).toUpperCase()); 
    } 
    return d;
  }
  
  public static d a(p paramp, int paramInt) {
    byte[] arrayOfByte2;
    a(250);
    d d = new d();
    byte[] arrayOfByte1 = new byte[4];
    arrayOfByte1[0] = -60;
    arrayOfByte1[1] = (byte)(0xFF & paramInt >>> 16);
    arrayOfByte1[2] = (byte)(0xFF & paramInt >>> 8);
    arrayOfByte1[3] = (byte)(0xFF & paramInt);
    try {
      arrayOfByte2 = paramp.a(arrayOfByte1, 3, 1500);
    } catch (v v) {
      Logger.getLogger(j.class.getName()).log(Level.SEVERE, "Protocol Exception?? doesn't appear to be in bootload mode.", (Throwable)v);
      d.a(d.b);
      d.a("Unexpected Protocol Error");
      return d;
    } 
    if (a(arrayOfByte2) != 0) {
      D.a("erase1K12x(): Error with C_ERASE_1K command.\n");
      d.a(d.b);
      d.a("Erase 1k failed, assumed monitor doesn't support.");
      return d;
    } 
    return d;
  }
  
  public static d a(p paramp, e parame, u paramu) {
    d d = new d();
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("S00D00006572617365722E73313965\nS2147FC000CF3FFF16C1B9CEC31ECD2800CC00002778\nS2147FC01007180A30700434F9CC000A2708CE2800A7\nS2147FC02069300434FB16C0A916C31820FBC006C0AF\nS2147FC030187B00CF180B0800CBCE00CCE6002AFC7E\nS2147FC0403D1B9F6B8054545454C1092204CB30202F\nS2147FC05002CB3707DCE680C40FC1092204CB302031\nS2147FC06002CB3707CC1B813D1801AE28067C2806FD\nS2147FC07087F6280607CBF6280707C61805B12806D1\nS2147FC0803D1B9F6B807900C8180B1B00C9C63A07FB\nS2147FC090A0C630079CC6780798E68007A4C6200708\nS2147FC0A090F60106079B1B813D1C000CFC180BC0FD\nS2147FC0B0001C1D001E401D000810CE003A0D0040DB\nS2147FC0C0180BD80034180B0300357900360C004067\nS2147FC0D0CE0037E60087C40827F9180B800039871B\nS2147FC0E0C7C300018C00772FF8180B1F0017FCFEC4\nS2147FC0F0FE8C0304220C180C080F0272180C081012\nS2147FC100027379000679000779000D180B300264F8\nS2147FC110790265180B80026C79025C180BFF024C63\nS2147FC120CE0100E6002B0418080007CE010618088B\nS2147FC130003079004879004979004A79004B7900C8\nS2147FC14040180BFF006C790102180B14010A790165\nS2147FC1500B1808008016C20C878C00012F0316C0B0\nS2147FC16081180B523FF0180B753FF1180B6E3FF29C\nS2147FC170180B4D3FF3180B6F3FF4180B6E3FF518F7\nS2147FC1800B693FF6180B743FF7180B6F3FF8180BC9\nS2147FC190723FF9180B41003C20FE1801AE280018AC\nS2147FC1A001AE28021801AE28041805B12804180528\nS2147FC1B0B128021805B128000B3D4D533320466F3A\nS2147FC1C0726D617420303030302E303020004D5309\nS2147FC1D033206669726D77617265206572617365FB\nS2147FC1E07220202032303136303231372031363AA5\nS2147FC1F03031474D5420286329204A534D2F4B43D7\nS2147FC200202A2A2A2A2A2A2A2A00A7A7180B300198\nS2147FC21006180B780010188718ED0002263A0808D3\nS2147FC22026F6180B790010188718ED0002262908C5\nS2147FC2300826F6180B7A0010188718ED00022618C5\nS2147FC240080826F6180B7B0010188718ED000226C4\nS2147FC25007080826F606C2EB1887E6E2C3086BE2F5\nS2147FC2603000088E000D26F2B60106858026071858\nS2147FC270C7A7A70226FB180B300106B60106853036\nS2147FC280267585802779180B000102180B09010A8D\nS2147FC290180B78010B180B01010218030000010A26\nS2147FC2A0163000B6010685302645180B3001061875\nS2147FC2B00B300106B6010685302640858027441858\nS2147FC2C00B000102180B09010A180B7A010B180BD9\nS2147FC2D001010218030000010A163000B601068528\nS2147FC2E0302610180B300106C7201CC6012018C642\nS2147FC2F0022014C6032010C604200CC6052008C6DC\nS2147FC300062004C60720003D180B800106A71F01E4\nS2127FC3100680FB3DA700000010EF3E20FBA737\nS2147FEF10C19AC19AC19AC19AC19AC19AC19AC19A95\nS2147FEF20C19AC19AC19AC19AC19AC19AC19AC19A85\nS2147FEF30C19AC19AC19AC19AC19AC19AC19AC19A75\nS2147FEF40C19AC19AC19AC19AC19AC19AC19AC19A65\nS2147FEF50C19AC19AC19AC19AC19AC19AC19AC19A55\nS2147FEF60C19AC19AC19AC19AC19AC19AC19AC19A45\nS2147FEF70C19AC19AC19AC19AC19AC19AC19AC19A35\nS2147FEF80C19AC19AC19AC19AC19AC19AC19AC19A25\nS2147FEF90C19AC19AC19AC19AC19AC19AC19AC19A15\nS2147FEFA0C19AC19AC19AC19AC19AC19AC19AC19A05\nS2147FEFB0C19AC19AC19AC19AC19AC19AC19AC19AF5\nS2147FEFC0C19AC19AC19AC19AC19AC19AC19AC19AE5\nS2147FEFD0C19AC19AC19AC19AC19AC19AC19AC19AD5\nS2147FEFE0C19AC19AC19AC19AC19AC19AC19AC19AC5\nS2147FEFF0C19AC19AC19AC19AC19AC19AC19AC00050\nS80400C0003B".getBytes());
    b b = new b();
    a a1 = null;
    try {
      a1 = b.a(byteArrayInputStream);
    } catch (c c) {
      Logger.getLogger(j.class.getName()).log(Level.SEVERE, "Failed to parse eraser", (Throwable)c);
      d.a(d.b);
      d.a("Failed to parse bootstrap");
      return d;
    } 
    d = a(paramp);
    if (d.a() == d.b)
      return d; 
    try {
      if (paramu != null)
        paramu.a("Loading Eraser for older monitors."); 
      d = b(a1, paramp, paramu, (o)null);
      if (paramu != null)
        paramu.a("Eraser Loaded and running, Please wait.."); 
    } catch (v v) {
      Logger.getLogger(j.class.getName()).log(Level.SEVERE, (String)null, (Throwable)v);
      d = new d();
      d.a(d.b);
      d.a("Failed to load Eraser!");
    } 
    if (d.a() == d.a) {
      if (parame != null && parame.b()) {
        d = parame.b(paramp, null);
        if (d.a() != d.a)
          D.b("Could not set Port states after Eraser."); 
      } 
      e(paramp);
      a(2000);
      byte[] arrayOfByte = new byte[50];
      InputStream inputStream = paramp.a().i();
      try {
        int i;
        for (i = inputStream.read(arrayOfByte); i > 0; i = inputStream.read(arrayOfByte)) {
          D.c("Cleared random Eraser 0's: " + i);
          a(5);
        } 
      } catch (Exception exception) {
        D.c("Handled read exception: " + exception.getMessage());
      } 
      a(paramp);
      return a(paramp, new ArrayList(), paramu, parame);
    } 
    return d;
  }
  
  public static d d(p paramp) {
    byte[] arrayOfByte2;
    d d = null;
    byte[] arrayOfByte1 = { -62 };
    if (J.I())
      D.c("Checking flash status."); 
    try {
      arrayOfByte2 = paramp.a(arrayOfByte1, 3, 1500);
    } catch (v v) {
      Logger.getLogger(j.class.getName()).log(Level.SEVERE, "Protocol Exception?? doesn't appear to be in bootload mode.", (Throwable)v);
      d.a(d.b);
      d.a("Unexpected Protocol Error");
      return d;
    } 
    if (a(arrayOfByte2) != 0) {
      D.a("erase_s12x(): error with command C_QUERY.\n");
      d.a(d.b);
      d.a("Aborting - bad status erase_S12() 1.");
      return d;
    } 
    D.c("Status ok.");
    return new d();
  }
  
  public static d a(a parama, p paramp, u paramu, o paramo) {
    d d = new d();
    paramu.a(0.0D);
    List list = parama.b();
    double d1 = list.size();
    byte b = 0;
    for (d d2 : list) {
      if (paramo == null || paramo.a(d2)) {
        int[] arrayOfInt1 = d2.c();
        int[] arrayOfInt2 = d2.e();
        int i = -1;
        for (byte b1 = 0; b1 < 3 && i != 0; b1++) {
          i = a(paramp, arrayOfInt1, arrayOfInt2);
          if (i != 0 && b1 == 2) {
            d.a(d.b);
            d.a("Error reported.\n" + b(i));
            D.a("Error reported on record " + b + " of " + d1);
            paramu.a(1.0D);
            paramu.a("Error reported, try again with boot jumper.");
            return d;
          } 
          if (i != 0) {
            D.a("Error reported on record " + b + " of " + d1 + "\n" + b(c.a((byte)i)) + "\nRetrying....");
            a(250);
          } 
        } 
      } 
      double d3 = b++ / d1;
      paramu.a(d3);
    } 
    return d;
  }
  
  public static d b(a parama, p paramp, u paramu, o paramo) {
    d d = new d();
    paramu.a(0.0D);
    List list = parama.b();
    double d1 = list.size();
    byte b = 0;
    for (d d2 : list) {
      if (paramo == null || paramo.a(d2)) {
        int[] arrayOfInt1 = d2.c();
        int[] arrayOfInt2 = d2.e();
        int i = -1;
        for (byte b1 = 0; b1 < 3 && i != 0; b1++) {
          i = b(paramp, arrayOfInt1, arrayOfInt2);
          if (i != 0 && b1 == 2) {
            d.a(d.b);
            d.a("Error reported.\n" + b(i));
            D.a("Error reported on record " + b + " of " + d1);
            paramu.a(1.0D);
            paramu.a("Error reported, try again with boot jumper.");
            return d;
          } 
          if (i != 0) {
            D.a("Error reported on record " + b + " of " + d1 + "\n" + b(c.a((byte)i)) + "\nRetrying....");
            a(250);
          } 
        } 
        double d3 = b++ / d1;
        paramu.a(d3);
        continue;
      } 
      if (J.I())
        D.d("Skipping record: " + b); 
    } 
    return d;
  }
  
  public static int a(p paramp, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return a(paramp, c.b(paramArrayOfbyte1), c.b(paramArrayOfbyte2));
  }
  
  public static int a(p paramp, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    d d = a(paramp, c.b(paramArrayOfint1, 0, paramArrayOfint1.length, true, false), true);
    if (d.a() == d.b)
      return 1; 
    if (paramArrayOfint1.length > 2) {
      int[] arrayOfInt = new int[2];
      arrayOfInt[0] = paramArrayOfint1[paramArrayOfint1.length - 2];
      arrayOfInt[1] = paramArrayOfint1[paramArrayOfint1.length - 1];
      paramArrayOfint1 = arrayOfInt;
    } 
    byte[] arrayOfByte1 = d.b(1 + paramArrayOfint1.length + 1);
    byte b = 0;
    arrayOfByte1[b++] = -88;
    for (null = 0; null < paramArrayOfint1.length; null++)
      arrayOfByte1[b++] = (byte)paramArrayOfint1[null]; 
    arrayOfByte1[b++] = (byte)(paramArrayOfint2.length - 1);
    null = -1;
    paramp.b(arrayOfByte1, 0);
    byte[] arrayOfByte2 = c.a(paramArrayOfint2);
    byte[] arrayOfByte3 = paramp.b(arrayOfByte2, 3);
    d.a(arrayOfByte1);
    return a(arrayOfByte3);
  }
  
  public static int b(p paramp, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    byte[] arrayOfByte1 = d.b(1 + paramArrayOfint1.length + 1);
    byte b = 0;
    arrayOfByte1[b++] = -63;
    for (null = 0; null < paramArrayOfint1.length; null++)
      arrayOfByte1[b++] = (byte)paramArrayOfint1[null]; 
    arrayOfByte1[b++] = (byte)(paramArrayOfint2.length - 1);
    null = -1;
    paramp.b(arrayOfByte1, 0);
    byte[] arrayOfByte2 = c.a(paramArrayOfint2);
    byte[] arrayOfByte3 = paramp.b(arrayOfByte2, 3);
    d.a(arrayOfByte1);
    return a(arrayOfByte3);
  }
  
  public static void a() {
    e = 0;
  }
  
  public static d a(p paramp, int paramInt, boolean paramBoolean) {
    d d = new d();
    byte[] arrayOfByte = new byte[4];
    int i = 0xFFFF & paramInt >> 16;
    if (i != e) {
      try {
        e = (byte)(i & 0xFF);
        if (J.I())
          D.c("Setting page to " + Integer.toHexString(e)); 
        arrayOfByte[0] = -94;
        arrayOfByte[1] = 0;
        arrayOfByte[2] = 48;
        arrayOfByte[3] = e;
        byte[] arrayOfByte1 = paramp.a(arrayOfByte, 3);
        if (arrayOfByte1 == null || arrayOfByte1.length < 3) {
          D.a("sendPPAGE() failed on command C_WRITE_BYTE");
          d.a(d.b);
          d.a("sendPPAGE() failed on command C_WRITE_BYTE: Page:" + Integer.toHexString(e));
          return d;
        } 
        if (a(arrayOfByte1) != 0) {
          D.a("sendPPAGE Got an error code!\nLikely the wrong monitor was running.\nReflashing failed - please try again. page=" + Integer.toHexString(e) + ", response:" + c.d(arrayOfByte1));
          d.a(d.b);
          d.a("sendPPage failed, bad status. Try again.");
          return d;
        } 
        byte[] arrayOfByte2 = { -72 };
        if (paramBoolean) {
          D.c("erasing page 0x:" + Integer.toHexString(e));
          arrayOfByte1 = paramp.a(arrayOfByte2, 3, 1500);
          if (arrayOfByte1 == null || arrayOfByte1.length < 3) {
            D.a("sendPPAGE() failed on command C_ERASE_PAGE, no response");
            d.a(d.b);
            d.a("sendPPAGE() failed on command C_ERASE_PAGE, No response from controller. Try again.");
            return d;
          } 
          if (a(arrayOfByte1) != 0) {
            d.a(d.b);
            d.a("Erase page got an error code!\n\nReflashing failed - please try again.");
            return d;
          } 
          D.c("Erased 0x" + Integer.toHexString(e));
        } 
      } catch (v v) {
        Logger.getLogger(j.class.getName()).log(Level.SEVERE, "Unexpected Protocol Error", (Throwable)v);
        d.a(d.b);
        d.a("Unexpected Protocol Error");
        return d;
      } 
      d.a("page change successful 0x" + Integer.toHexString(e));
      d.a(d.a);
      return d;
    } 
    d.a("page change not required");
    d.a(d.a);
    return d;
  }
  
  public static void e(p paramp) {
    try {
      try {
        Thread.sleep(20L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(j.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      byte[] arrayOfByte = { -76 };
      paramp.a(arrayOfByte, 0);
    } catch (v v) {
      v.printStackTrace();
    } 
  }
  
  public static bT f(p paramp) {
    byte[] arrayOfByte1 = { 81 };
    byte[] arrayOfByte2 = null;
    try {
      arrayOfByte2 = paramp.a(arrayOfByte1, 20, 600);
    } catch (v v) {
      Logger.getLogger(k.class.getName()).log(Level.SEVERE, "Protocol Error querying signature", (Throwable)v);
    } 
    if (arrayOfByte2 == null || arrayOfByte2.length == 0)
      return null; 
    bT bT = new bT();
    bT.a(arrayOfByte2);
    byte[] arrayOfByte3 = { 83 };
    try {
      arrayOfByte2 = paramp.a(arrayOfByte3, 20, 600);
      bT.b(X.k(new String(arrayOfByte2)));
    } catch (Exception exception) {
      Logger.getLogger(k.class.getName()).log(Level.SEVERE, "Protocol Error querying signature", exception);
    } 
    return bT;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/af/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */