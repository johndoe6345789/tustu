package f;

import bH.D;
import bH.J;
import bH.X;
import bH.c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class NetworkInFPackage {
  public static String a() {
    String str = "";
    BufferedReader bufferedReader = null;
    try {
      Process process = Runtime.getRuntime().exec(m() + "\\wmic.exe BASEBOARD get SerialNumber");
      bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
      String str1;
      while ((str1 = bufferedReader.readLine()) != null) {
        if (str1.toLowerCase().contains("serial")) {
          str1 = bufferedReader.readLine();
          if (str1 == null) return null;
          str = str1.trim();
          break;
        }
      }
    } catch (Exception exception) {
      return null;
    } finally {
      try {
        bufferedReader.close();
      } catch (Exception exception) {
      }
    }
    if (str != null) {
      str = str.trim();
      if (str.length() < 8
          || str.contains("123456789")
          || (str.getBytes()).length != str.length()
          || !c.a(str.getBytes())
          || str.indexOf(" ") > 0) str = "";
    }
    if (str.length() > 25) str = str.substring(0, 24);
    return str;
  }

  public static String b() {
    String str;
    try {
      str = a();
      if (str != null && str.trim().length() > 2) return str;
      str = "";
    } catch (Exception exception) {
      str = "";
    }
    try {
      File file = File.createTempFile("mbId", ".vbs");
      file.deleteOnExit();
      FileWriter fileWriter = new FileWriter(file);
      String str1 =
          "Set objWMIService = GetObject(\"winmgmts:\\\\.\\r"
              + "oot\\cimv2\")\n"
              + "Set colItems = objWMIService.ExecQuery _ \n"
              + "   (\"Select * from Win32_BaseBoard\") \n"
              + "For Each objItem in colItems \n"
              + "    Wscript.Echo objItem.SerialNumber \n"
              + "    exit for  ' do the first cpu only! \n"
              + "Next \n";
      fileWriter.write(str1);
      fileWriter.close();
      Process process = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
      BufferedReader bufferedReader =
          new BufferedReader(new InputStreamReader(process.getInputStream()));
      String str2;
      while ((str2 = bufferedReader.readLine()) != null) str = str + str2;
      bufferedReader.close();
    } catch (Exception exception) {
      exception.printStackTrace();
    }
    if (str != null) {
      str = str.trim();
      if (str.length() < 8
          || str.contains("123456789")
          || (str.getBytes()).length != str.length()
          || !c.a(str.getBytes())
          || str.indexOf(" ") > 0) str = "";
    } else {
      str = "";
    }
    if (str.length() > 25) str = str.substring(0, 24);
    return str;
  }

  public static String c() {
    try {
      Process process = Runtime.getRuntime().exec(m() + "\\wmic.exe cpu get ProcessorId");
      InputStream inputStream = process.getInputStream();
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
      String str1 = null;
      String str2;
      while ((str2 = bufferedReader.readLine()) != null) {
        if (str2.toLowerCase().startsWith("processorid")) {
          do {
            str2 = bufferedReader.readLine();
          } while (str2 != null && str2.isEmpty());
          str1 = str2;
          if (str1.endsWith("\n")) {
            str1 = str1.substring(0, str1.length() - 1).trim();
          } else {
            str1 = str1.substring(0, str1.length()).trim();
          }
          process.destroy();
          if (str1 != null && str1.length() > 50)
            str1 = str1.substring(str1.length() - 49, str1.length());
          if (str1 != null && str1.length() > 10) return str1;
        }
      }
    } catch (Exception exception) {
    }
    return null;
  }

  public static String d() {
    return J.d() ? e() : (J.b() ? g() : c());
  }

  public static String e() {
    try {
      String str1;
      if ((new File("/usr/bin/cat")).exists()) {
        str1 = "/usr/bin/cat /proc/cpuinfo";
      } else if ((new File("/sbin/cat")).exists()) {
        str1 = "/sbin/cat /proc/cpuinfo";
      } else {
        str1 = "/bin/cat /proc/cpuinfo";
      }
      Process process = Runtime.getRuntime().exec(str1);
      InputStream inputStream = process.getInputStream();
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
      String str2 = null;
      String str3;
      while ((str3 = bufferedReader.readLine()) != null) {
        if (str3.toLowerCase().startsWith("serial") && str3.indexOf(":") != -1) {
          str2 = str3.substring(str3.indexOf(":") + 1);
          if (str2.endsWith("\n")) {
            str2 = str2.substring(0, str2.length() - 1).trim();
          } else {
            str2 = str2.substring(0, str2.length()).trim();
          }
          process.destroy();
          if (str2 != null && str2.length() > 50)
            str2 = str2.substring(str2.length() - 49, str2.length());
          if (str2 != null && !str2.isEmpty()) return str2;
        }
      }
    } catch (Exception exception) {
    }
    return null;
  }

  public static byte[] f() {
    Process process = null;
    try {
      String str1;
      if ((new File("/usr/bin/ip")).exists()) {
        str1 = "/usr/bin/ip link";
      } else if ((new File("/sbin/ip")).exists()) {
        str1 = "/sbin/ip link";
      } else {
        str1 = "/bin/ip link";
      }
      process = Runtime.getRuntime().exec(str1);
      InputStream inputStream = process.getInputStream();
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
      String str2 = null;
      String str3;
      while ((str3 = bufferedReader.readLine()) != null) {
        str3 = str3.trim();
        if (str3.toLowerCase().indexOf("ether") != -1 && str3.indexOf(":") != -1) {
          str3 = str3.toLowerCase();
          String[] arrayOfString = str3.split(" ");
          for (String str : arrayOfString) {
            if (str.contains(":")) {
              str2 = str;
              break;
            }
          }
          if (str2 == null) str2 = "";
          if (str2.endsWith("\n")) {
            str2 = str2.substring(0, str2.length() - 1).trim();
          } else {
            str2 = str2.trim();
          }
          str2 = str2.toUpperCase();
          if (str2.length() > 50) str2 = str2.substring(str2.length() - 49, str2.length());
          if (str2 != null && !str2.isEmpty()) {
            byte[] arrayOfByte = c(str2);
            if (!a(arrayOfByte)) return arrayOfByte;
          }
        }
      }
    } catch (Exception exception) {

    } finally {
      if (process != null)
        try {
          process.destroy();
        } catch (Exception exception) {
        }
    }
    return null;
  }

  public static String g() {
    try {
      Process process = Runtime.getRuntime().exec("ioreg -l | grep IOPlatformSerialNumber");
      InputStream inputStream = process.getInputStream();
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
      String str1 = null;
      String str2;
      while ((str2 = bufferedReader.readLine()) != null) {
        if (str2.toLowerCase().contains("ioplatformserial") && str2.indexOf("=") != -1) {
          str1 = str2.substring(str2.indexOf("=") + 1);
          if (str1.endsWith("\n")) {
            str1 = str1.substring(0, str1.length() - 1).trim();
          } else {
            str1 = str1.substring(0, str1.length()).trim();
          }
          str1 = X.b(str1, "\"", "");
          process.destroy();
          if (str1 != null && str1.length() > 50)
            str1 = str1.substring(str1.length() - 49, str1.length());
          if (str1 != null && !str1.isEmpty()) return str1;
        }
      }
    } catch (Exception exception) {
    }
    return null;
  }

  public static String h() {
    try {
      byte b1 = 97;
      for (byte b2 = 0; b2 < 4; b2++) {
        Process process;
        File file = new File("/bin/udevadm");
        if (file.exists()) {
          process =
              Runtime.getRuntime()
                  .exec("/bin/udevadm info --query=property --name=sd" + (char) (b1 + b2));
        } else if ((new File("/sbin/udevadm")).exists()) {
          process =
              Runtime.getRuntime()
                  .exec("/usr/bin/udevadm info --query=property --name=sd" + (char) (b1 + b2));
        } else {
          process =
              Runtime.getRuntime()
                  .exec("/sbin/udevadm info --query=property --name=sd" + (char) (b1 + b2));
        }
        InputStream inputStream = process.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String str1 = null;
        String str2;
        while ((str2 = bufferedReader.readLine()) != null) {
          if (str2.startsWith("ID_SERIAL_SHORT") && str2.indexOf("=") != -1) {
            str1 = str2.substring(str2.indexOf("=") + 1);
            if (str1.endsWith("\n")) str1 = str1.substring(0, str1.length() - 1);
            process.destroy();
            if (str1 != null && str1.length() > 50) str1 = str1.substring(0, 49);
            if (str1 != null && !str1.isEmpty()) return str1;
          }
        }
        process.destroy();
      }
      return i();
    } catch (IOException iOException) {
      return null;
    }
  }

  public static String i() {
    Process process = null;
    for (byte b = 0; b < 5; b++) {
      try {
        String str = a(b);
        if (str != null && str.contains("/dev")) {
          if ((new File("/sbin/udevadm")).exists()) {
            process =
                Runtime.getRuntime().exec("/sbin/udevadm info --query=property --name=" + str);
          } else if ((new File("/bin/udevadm")).exists()) {
            process = Runtime.getRuntime().exec("/bin/udevadm info --query=property --name=" + str);
          } else {
            process =
                Runtime.getRuntime().exec("/usr/bin/udevadm info --query=property --name=" + str);
          }
          InputStream inputStream = process.getInputStream();
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
          String str1 = null;
          String str2 = null;
          String str3;
          while ((str3 = bufferedReader.readLine()) != null) {
            if (str3.contains("ID_SERIAL_SHORT") && str3.indexOf("=") != -1) {
              str1 = str3.substring(str3.indexOf("=") + 1);
              if (str1.endsWith("\n")) str1 = str1.substring(0, str1.length() - 1);
              if (str1 != null && str1.length() > 50) str1 = str1.substring(0, 49);
              continue;
            }
            if (str3.contains("ID_SERIAL") && str3.indexOf("=") != -1) {
              str2 = str3.substring(str3.indexOf("=") + 1);
              if (str2.endsWith("\n")) str2 = str2.substring(0, str2.length() - 1);
              if (str2 != null && str2.length() > 50) str2 = str2.substring(0, 49);
              continue;
            }
            if (str3.contains("ID_FS_UUID") && str3.indexOf("=") != -1) {
              str2 = str3.substring(str3.indexOf("=") + 1);
              if (str2.endsWith("\n")) str2 = str2.substring(0, str2.length() - 1);
              if (str2 != null && str2.length() > 50) str2 = str2.substring(0, 49);
            }
          }
          if (str1 != null && !str1.isEmpty()) return str1;
          if (str2 != null && !str2.isEmpty()) return str2;
        }
      } catch (IOException iOException) {

      } finally {
        if (process != null) process.destroy();
      }
    }
    return null;
  }

  public static String a(int paramInt) {
    Process process = null;
    try {
      process = Runtime.getRuntime().exec("df");
      InputStream inputStream = process.getInputStream();
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
      String str1 = null;
      byte b = 0;
      String str2;
      while ((str2 = bufferedReader.readLine()) != null) {
        if (str2.startsWith("/dev") && b++ == paramInt) {
          int i = str2.indexOf(" ");
          int j = str2.indexOf("\t");
          if ((i == -1 && j > 0) || (i > 0 && j > 0 && j < i)) i = j;
          str1 = str2.substring(0, i).trim();
          return str1;
        }
      }
    } catch (IOException iOException) {
      return null;
    } finally {
      if (process != null) process.destroy();
    }
    return null;
  }

  public static String j() {
    try {
      Process process = Runtime.getRuntime().exec("/usr/sbin/diskutil info /");
      InputStream inputStream = process.getInputStream();
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
      String str1 = null;
      String str2;
      while ((str2 = bufferedReader.readLine()) != null) {
        str2 = str2.trim();
        if (str2.startsWith("Volume UUID:")) {
          str1 = X.b(str2, "Volume UUID:", "").trim();
          if (str1.endsWith("\n")) str1 = str1.substring(0, str1.length() - 1);
          process.destroy();
          if (str1 != null && str1.length() > 50) str1 = str1.substring(0, 49);
          return str1;
        }
      }
      process.destroy();
      return null;
    } catch (IOException iOException) {
      return null;
    }
  }

  public static String a(String paramString) {
    String str = "";
    try {
      str = b(paramString);
    } catch (Exception exception) {
    }
    if (str != null && str.length() > 2) return str;
    try {
      File file = File.createTempFile("hdSerial", ".vbs");
      file.deleteOnExit();
      FileWriter fileWriter = new FileWriter(file);
      String str1 =
          "Set objFSO = CreateObject(\"Scripting.FileSystemObject\")\n"
              + "Set colDrives = objFSO.Drives\n"
              + "Set objDrive = colDrives.item(\""
              + paramString
              + "\")\nWscript.Echo objDrive.SerialNumber";
      fileWriter.write(str1);
      fileWriter.close();
      Process process = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
      BufferedReader bufferedReader =
          new BufferedReader(new InputStreamReader(process.getInputStream()));
      String str2;
      while ((str2 = bufferedReader.readLine()) != null) str = str + str2;
      bufferedReader.close();
    } catch (Exception exception) {
      exception.printStackTrace();
    }
    if (str != null) {
      str = str.trim();
      if (str.length() < 8 || str.indexOf(" ") > 0) str = "";
    } else {
      str = "";
    }
    if (str.length() > 40) str = str.substring(0, 39);
    return str.trim();
  }

  public static String b(String paramString) {
    String str = "";
    try {
      if (!paramString.endsWith(":")) paramString = paramString + ":";
      Process process = Runtime.getRuntime().exec("cmd /c vol " + paramString);
      BufferedReader bufferedReader =
          new BufferedReader(new InputStreamReader(process.getInputStream()));
      String str1;
      while ((str1 = bufferedReader.readLine()) != null) {
        if (str1.contains("Serial")) {
          str1 = str1.trim();
          str = str1.substring(str1.lastIndexOf(" ") + 1);
        }
      }
      bufferedReader.close();
    } catch (Exception exception) {
      exception.printStackTrace();
    }
    if (str == null) str = "";
    if (str.length() > 40) str = str.substring(0, 39);
    return str.trim();
  }

  public static String k() {
    byte[] arrayOfByte = l();
    if (arrayOfByte != null) {
      int[] arrayOfInt = c.b(arrayOfByte);
      StringBuilder stringBuilder = new StringBuilder();
      for (byte b = 0; b < arrayOfInt.length; b++) {
        stringBuilder.append(X.a(Integer.toHexString(arrayOfInt[b]).toUpperCase(), '0', 2));
        if (b < arrayOfInt.length - 1) stringBuilder.append(":");
      }
      return stringBuilder.toString();
    }
    return null;
  }

  private static byte[] c(String paramString) {
    if (paramString == null || paramString.indexOf(":") == -1) return new byte[0];
    String[] arrayOfString = paramString.split(":");
    byte[] arrayOfByte = new byte[arrayOfString.length];
    for (byte b = 0; b < arrayOfByte.length; b++)
      arrayOfByte[b] = (byte) Integer.parseInt(arrayOfString[b], 16);
    return arrayOfByte;
  }

  private static boolean a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null && paramArrayOfbyte.length > 0) {
      if ((paramArrayOfbyte[0] & 0x2) != 0) return true;
      if (paramArrayOfbyte.length < 6) return true;
      byte b1 = 0;
      for (byte b2 = 0; b2 < paramArrayOfbyte.length && b2 < 6; b2++) {
        if (paramArrayOfbyte[b2] == 0 && paramArrayOfbyte[b2] == 255) b1++;
        if (b1 > paramArrayOfbyte.length - 3) return true;
      }
      return false;
    }
    return true;
  }

  public static byte[] l() {
    if (J.d())
      try {
        byte[] arrayOfByte = f();
        if (arrayOfByte != null && arrayOfByte.length > 5) return arrayOfByte;
      } catch (Exception exception) {
      }
    try {
      Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
      while (enumeration.hasMoreElements()) {
        NetworkInterface networkInterface = enumeration.nextElement();
        byte[] arrayOfByte = networkInterface.getHardwareAddress();
        if (!a(arrayOfByte)) return arrayOfByte;
      }
    } catch (SocketException socketException) {
      D.c("Not found, try alternative.");
    }
    try {
      Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
      while (enumeration.hasMoreElements()) {
        NetworkInterface networkInterface = enumeration.nextElement();
        try {
          byte[] arrayOfByte = networkInterface.getHardwareAddress();
          if (!a(arrayOfByte)) return arrayOfByte;
        } catch (SocketException socketException) {
        }
      }
      try {
        InetAddress inetAddress = InetAddress.getLocalHost();
        NetworkInterface networkInterface = NetworkInterface.getByInetAddress(inetAddress);
        return (networkInterface == null) ? null : networkInterface.getHardwareAddress();
      } catch (SocketException socketException) {
      }
    } catch (SocketException socketException) {

    } catch (UnknownHostException unknownHostException) {
    }
    throw new UnknownHostException("no mac found");
  }

  private static File m() {
    String str = System.getenv("SystemRoot");
    File file = new File(str, "System32" + File.separatorChar + "wbem");
    if (!file.exists() || !file.isDirectory())
      throw new IOException(
          '"' + file.getAbsolutePath() + "\" does not exist or is not a directory!");
    return file;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/f/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
