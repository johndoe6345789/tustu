package z;

import bH.J;
import bH.S;
import java.io.File;
import java.util.regex.Pattern;
import jssc.SerialPortList;

public class i {
  public String[] a() {
    return b();
  }
  
  public String[] b() {
    if (J.b()) {
      j j = new j(this);
      File file = new File("/", "dev");
      String[] arrayOfString = file.list(j);
      if (arrayOfString != null && arrayOfString.length > 0) {
        for (byte b = 0; b < arrayOfString.length; b++)
          arrayOfString[b] = "/dev/" + arrayOfString[b]; 
        return S.a(arrayOfString);
      } 
      return SerialPortList.getPortNames("/dev/", Pattern.compile("tty\\.*"));
    } 
    return SerialPortList.getPortNames();
  }
  
  public String[] c() {
    return new String[] { 
        "2400", "4800", "9600", "14400", "19200", "28800", "38400", "57600", "115200", "150000", 
        "230400", "250000", "300000", "460800", "500000", "1000000" };
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/z/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */