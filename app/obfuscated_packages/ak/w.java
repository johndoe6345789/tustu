package ak;

import V.a;
import W.V;
import W.X;
import W.k;
import W.l;
import bH.c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class w extends V {
  byte[] a = null;
  
  String b;
  
  StringBuilder e = new StringBuilder();
  
  float[] f = null;
  
  int g = 0;
  
  int h;
  
  int i;
  
  float j = 0.0F;
  
  float k;
  
  HashMap l = new HashMap<>();
  
  List m = new ArrayList();
  
  List n = new ArrayList();
  
  public String i() {
    return X.Q;
  }
  
  public boolean a(String paramString) {
    this.b = paramString;
    GZIPInputStream gZIPInputStream = null;
    try {
      gZIPInputStream = new GZIPInputStream(new FileInputStream(this.b));
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte[1024];
      int i;
      while ((i = gZIPInputStream.read(arrayOfByte)) != -1)
        byteArrayOutputStream.write(arrayOfByte, 0, i); 
      byteArrayOutputStream.flush();
      this.a = byteArrayOutputStream.toByteArray();
      int j = c.a(this.a, 0, 4, false, false);
      int k = c.a(this.a, 4, 4, false, false);
      this.h = c.a(this.a, 8, 4, false, false);
      this.e.append("FileName: ").append(paramString).append("\nVersion: ").append(k).append("\nNumRecords: ").append(this.h);
      String str = null;
      switch (j) {
        case 541089920:
          str = "./inc/emu_v1_208.xml";
          this.i = 256;
          this.k = 0.05F;
          break;
        case 574906498:
          str = "./inc/emu_v2_076.xml";
          this.i = 276;
          this.k = 0.04F;
          break;
        default:
          throw new a("Invalid file header");
      } 
      if (this.a.length < 12 + this.h * this.i)
        throw new a("Failed to open " + paramString + " - Log file is incomplete"); 
      b(str);
      return true;
    } catch (IOException iOException) {
      throw new a("Failed to open " + paramString, iOException);
    } finally {
      if (gZIPInputStream != null)
        try {
          gZIPInputStream.close();
        } catch (IOException iOException) {
          Logger.getLogger(w.class.getName()).log(Level.SEVERE, (String)null, iOException);
        }  
    } 
  }
  
  private void b(String paramString) {
    this.m.add(new A(this));
    File file = new File(paramString);
    if (file.isFile() && file.exists())
      try {
        JAXBContext jAXBContext = JAXBContext.newInstance(new Class[] { z.class });
        Unmarshaller unmarshaller = jAXBContext.createUnmarshaller();
        z z = (z)unmarshaller.unmarshal(file);
        int i = 0;
        this.e.append("\nLogging fields: ");
        for (D d : z.a.a.a) {
          if (!"Debug".equals(d.b)) {
            d d1 = new d(d.a, d.c);
            if (d.e.startsWith("paramList:")) {
              String str = d.e.substring("paramList:".length());
              ArrayList<String> arrayList = new ArrayList();
              for (C c : z.a.a.b) {
                if (c.a.equals(str)) {
                  byte b = 0;
                  for (B b1 : c.b) {
                    int j = Integer.parseInt(b1.b);
                    while (b < j) {
                      arrayList.add("UNDEFINED");
                      b++;
                    } 
                    arrayList.add(b1.a);
                    b++;
                  } 
                  break;
                } 
              } 
              d1.b(255);
              d1.a((k)new l(arrayList));
            } 
            this.m.add(d1);
            this.n.add(new x(d, i));
            this.e.append("\n").append(d.a).append("[").append(d.c).append("]");
          } 
          i += d.d.endsWith("byte") ? 1 : 2;
        } 
      } catch (JAXBException jAXBException) {
        Logger.getLogger(w.class.getName()).log(Level.SEVERE, (String)null, (Throwable)jAXBException);
      }  
    this.f = new float[this.n.size() + 1];
  }
  
  public void a() {
    this.a = null;
  }
  
  public Iterator b() {
    return this.m.iterator();
  }
  
  public float[] c() {
    this.f[0] = this.j;
    byte b = 1;
    for (x x : this.n) {
      this.f[b] = x.d * c.a(this.a, 12 + this.g * this.i + x.b, x.c, false, false);
      b++;
    } 
    this.j += this.k;
    this.g++;
    return this.f;
  }
  
  public long d() {
    return this.h;
  }
  
  public boolean e() {
    return (this.g < this.h);
  }
  
  public boolean f() {
    return false;
  }
  
  public HashMap g() {
    return this.l;
  }
  
  public String h() {
    return this.e.toString();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */