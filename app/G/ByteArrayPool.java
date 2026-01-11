package G;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ByteArrayPool implements Serializable {
  private final HashMap a = new HashMap<>();
  
  private final HashMap b = new HashMap<>();
  
  public byte[] a(int paramInt) {
    synchronized (this.a) {
      byte[] arrayOfByte = (byte[])this.a.get(Integer.valueOf(paramInt));
      if (arrayOfByte == null) {
        arrayOfByte = new byte[paramInt];
        this.a.put(Integer.valueOf(paramInt), arrayOfByte);
      } 
      return arrayOfByte;
    } 
  }
  
  public byte[] b(int paramInt) {
    synchronized (this.b) {
      List<byte[]> list = c(paramInt);
      if (list.isEmpty())
        return new byte[paramInt]; 
      return list.remove(0);
    } 
  }
  
  public synchronized void a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null) {
      List<byte[]> list = c(paramArrayOfbyte.length);
      if (!list.contains(paramArrayOfbyte))
        list.add(paramArrayOfbyte); 
    } 
  }
  
  private List c(int paramInt) {
    synchronized (this.b) {
      List list = (List)this.b.get(Integer.valueOf(paramInt));
      if (list == null) {
        list = new ArrayList();
        this.b.put(Integer.valueOf(paramInt), list);
      } 
      return list;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */