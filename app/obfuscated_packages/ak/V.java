package ak;

import V.a;
import V.f;
import W.T;
import W.V;
import W.X;
import W.k;
import W.l;
import al.a;
import al.b;
import al.d;
import al.e;
import am.e;
import am.h;
import am.i;
import bH.D;
import bH.X;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class V extends V {
  public static final byte[] a = new byte[] { 77, 68, 70, 32, 32, 32, 32, 32, 52 };
  
  ArrayList b = new ArrayList();
  
  List e = new ArrayList();
  
  int f = 0;
  
  boolean g = false;
  
  List h = new ArrayList();
  
  b i = null;
  
  SeekableByteChannel j = null;
  
  int k = -1;
  
  int l = 0;
  
  float[] m = null;
  
  int[] n = null;
  
  String o = null;
  
  i p = null;
  
  h q = null;
  
  public static W r = null;
  
  HashMap s = new HashMap<>();
  
  public String i() {
    return X.M;
  }
  
  public boolean a(String paramString) {
    Path path = FileSystems.getDefault().getPath(paramString, new String[0]);
    try {
      this.j = Files.newByteChannel(path, new OpenOption[] { StandardOpenOption.READ });
      String str = a(this.j);
      if (!str.startsWith("4"))
        throw new a("This reader is for valid MDF 4 files only!"); 
      this.p = i.a(path, this.j);
      this.q = this.p.j();
      e e = new e();
      Properties properties = e.a(this.q);
      StringBuilder stringBuilder = new StringBuilder();
      for (String str1 : properties.stringPropertyNames())
        stringBuilder.append(str1).append(": ").append(properties.getProperty(str1)).append("\n"); 
      List list = d.a(this.q);
      if (r != null)
        list = r.a(list); 
      for (e e1 : list) {
        try {
          b b1 = new b(this.j, e1);
          b1.a("Data Group " + e1.h());
          if (b1.c() && b1.b() > 2L)
            this.e.add(b1); 
        } catch (BufferUnderflowException|IOException bufferUnderflowException) {
          D.b("Failed to add DataGroup: " + bufferUnderflowException.getLocalizedMessage());
        } 
      } 
      if (this.e.isEmpty())
        return false; 
      for (b b1 : this.e)
        this.l += b1.f(); 
      this.l -= this.e.size() - 1;
      this.i = l();
      D.d("Core Data Group selected: " + this.i.h() + ", with cycle count of: " + this.i.b());
      this.e.remove(this.i);
      stringBuilder.append("------------------ Data Groups Info ------------------\n");
      stringBuilder.append("Total Channels for all groups: ").append(this.l).append("\n");
      stringBuilder.append("Data Rate driven by ").append(this.i.h()).append(" Avg Records/Sec: ").append(X.c(this.i.a(), 3)).append("\n");
      stringBuilder.append(this.i.h()).append(" ").append(this.i.f()).append(" Channels:\n");
      for (a a : this.i.e()) {
        stringBuilder.append("\t").append(a.e());
        if (a.f() != null && !a.f().isEmpty()) {
          stringBuilder.append(" (").append(a.f()).append(")\n");
          continue;
        } 
        stringBuilder.append("\n");
      } 
      for (b b1 : this.e) {
        b1.a(false);
        stringBuilder.append("\n").append(b1.h()).append(" - ").append(b1.f()).append(" channels ").append(" at ").append(X.c(b1.a(), 3)).append(" rec/s ").append(" rec/s, Channels:\n");
        for (a a : b1.e()) {
          stringBuilder.append("\t").append(a.e());
          if (a.f() != null && !a.f().isEmpty()) {
            stringBuilder.append(" (").append(a.f()).append(")\n");
            continue;
          } 
          stringBuilder.append("\n");
        } 
      } 
      this.o = stringBuilder.toString();
      return true;
    } catch (IOException iOException) {
      Logger.getLogger(V.class.getName()).log(Level.SEVERE, (String)null, iOException);
      throw new a("Unable to open file!\nError: " + iOException.getLocalizedMessage());
    } 
  }
  
  private b l() {
    boolean bool = true;
    if (bool) {
      b b1 = null;
      for (b b2 : this.e) {
        if (b2.c() && b2.b() * this.l < 1200000000L && (b1 == null || b2.f() > 2) && (b1 == null || b2.b() > b1.b()))
          b1 = b2; 
      } 
      if (b1 == null) {
        D.b("Very large MDF4 dataset, looking for lower record core data group");
        for (b b2 : this.e) {
          if (b1 == null) {
            b1 = b2;
            continue;
          } 
          if (b2.b() > 10000L && b2.b() < b1.b())
            b1 = b2; 
        } 
      } 
      return b1;
    } 
    return null;
  }
  
  public void a() {
    try {
      this.j.close();
    } catch (Exception exception) {}
  }
  
  public Iterator b() {
    this.k = 0;
    for (a a : this.i.e()) {
      T t = a(a);
      this.b.add(t);
    } 
    for (b b1 : this.e) {
      for (a a : b1.e()) {
        T t = a(a);
        this.b.add(t);
      } 
    } 
    this.k = this.b.size();
    this.m = new float[this.k];
    return this.b.iterator();
  }
  
  private T a(a parama) {
    d d = new d();
    if (parama.e().equals("time")) {
      d.a("Time");
      d.a(3);
    } else {
      d.a(parama.e());
      d.a(parama.g());
    } 
    if (parama.f() != null)
      d.b(parama.f()); 
    List list = parama.b();
    if (list != null && !list.isEmpty()) {
      l l = new l(list);
      d.a((k)l);
      d.b(255);
    } 
    if (parama.c() != 0.0D)
      d.c((float)parama.c()); 
    if (parama.d() != 0.0D)
      d.d((float)parama.d()); 
    return d;
  }
  
  public float[] c() {
    if (this.f >= this.i.b())
      throw new f(); 
    if (this.f >= 500 && k())
      throw new a("This Edition is limited to loading 500 rows of data. \nPlease Register to load large log files."); 
    double d = this.i.d();
    byte b1 = 0;
    int j = 0;
    try {
      this.i.a(d, j, this.m);
      j += this.i.f();
      b1++;
      for (b b2 : this.e) {
        try {
          b2.a(d, j, this.m);
        } catch (Exception exception) {
          D.b("Error updating " + b2.h() + " on record " + (this.f + 1) + ". Error Message: " + exception.getLocalizedMessage());
          int k = ((Integer)this.s.getOrDefault(Integer.valueOf(b1), Integer.valueOf(0))).intValue();
          this.s.put(Integer.valueOf(b1), Integer.valueOf(++k));
          if (k > 4) {
            b2.b(true);
            D.b("5 Errors updating " + b2.h() + ", disabling updates.");
          } 
          exception.printStackTrace();
        } 
        j += b2.f();
        b1++;
      } 
    } catch (IOException iOException) {
      Logger.getLogger(V.class.getName()).log(Level.SEVERE, "Error updating data group values, record: " + this.f + " Group " + b1, iOException);
      throw new f();
    } 
    this.f++;
    return this.m;
  }
  
  public long d() {
    return (this.i != null) ? this.i.g().e() : 200L;
  }
  
  public boolean e() {
    return (this.i != null) ? ((this.f < this.i.g().e())) : false;
  }
  
  public boolean f() {
    return false;
  }
  
  public HashMap g() {
    return new HashMap<>();
  }
  
  public String h() {
    return this.o;
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/V.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */