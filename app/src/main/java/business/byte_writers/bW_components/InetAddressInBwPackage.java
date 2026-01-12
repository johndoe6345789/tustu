package business.byte_writers.bW_components;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class InetAddressInBwPackage {
  public static final InetAddress a = a();

  public static final InetAddress b = b();

  static final Map c;

  static final Map d;

  static final Map e;

  static final Map f;

  static final Map g;

  private InetAddressInBwPackage() {
    throw new UnsupportedOperationException();
  }

  private static final InetAddress a() {
    try {
      byte[] arrayOfByte = {0, 0, 0, 0};
      return InetAddress.getByAddress(arrayOfByte);
    } catch (UnknownHostException unknownHostException) {
      throw new IllegalStateException("Unable to generate INADDR_ANY");
    }
  }

  private static final InetAddress b() {
    try {
      byte[] arrayOfByte = {-1, -1, -1, -1};
      return InetAddress.getByAddress(arrayOfByte);
    } catch (UnknownHostException unknownHostException) {
      throw new IllegalStateException("Unable to generate INADDR_BROADCAST");
    }
  }

  static {
    LinkedHashMap<Object, Object> linkedHashMap1 = new LinkedHashMap<>();
    LinkedHashMap<Object, Object> linkedHashMap2 = new LinkedHashMap<>();
    LinkedHashMap<Object, Object> linkedHashMap3 = new LinkedHashMap<>();
    LinkedHashMap<Object, Object> linkedHashMap4 = new LinkedHashMap<>();
    LinkedHashMap<Object, Object> linkedHashMap5 = new LinkedHashMap<>();
    Field[] arrayOfField = b.class.getDeclaredFields();
    try {
      for (Field field : arrayOfField) {
        int i = field.getModifiers();
        String str = field.getName();
        if (Modifier.isFinal(i)
            && Modifier.isPublic(i)
            && Modifier.isStatic(i)
            && field.getType().equals(byte.class)) {
          byte b1 = field.getByte(null);
          if (str.startsWith("BOOT")) {
            linkedHashMap1.put(Byte.valueOf(b1), str);
          } else if (str.startsWith("HTYPE_")) {
            linkedHashMap2.put(Byte.valueOf(b1), str);
          } else if (str.startsWith("DHCP")) {
            linkedHashMap3.put(Byte.valueOf(b1), str);
          } else if (str.startsWith("DHO_")) {
            linkedHashMap4.put(Byte.valueOf(b1), str);
            linkedHashMap5.put(str, Byte.valueOf(b1));
          }
        }
      }
    } catch (IllegalAccessException illegalAccessException) {
      throw new IllegalStateException("Fatal error while parsing internal fields");
    }
    c = Collections.unmodifiableMap(linkedHashMap1);
    d = Collections.unmodifiableMap(linkedHashMap2);
    e = Collections.unmodifiableMap(linkedHashMap3);
    f = Collections.unmodifiableMap(linkedHashMap4);
    g = Collections.unmodifiableMap(linkedHashMap5);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bW/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
