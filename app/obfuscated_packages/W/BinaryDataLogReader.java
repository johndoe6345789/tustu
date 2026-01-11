package W;

import V.a;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public abstract class b extends V {
  private BufferedInputStream e = null;
  
  private c f = null;
  
  private byte[] g = null;
  
  private byte[] h = null;
  
  private byte[] i = null;
  
  long a = 0L;
  
  int b = 0;
  
  public boolean a(String paramString) {
    FileInputStream fileInputStream = null;
    try {
      File file = new File(paramString);
      fileInputStream = new FileInputStream(file);
      this.e = new BufferedInputStream(fileInputStream);
      this.e.skip(this.f.b());
      this.a = file.length();
      if (this.f.f() > 0)
        this.g = new byte[this.f.f()]; 
      this.h = new byte[this.f.e()];
      this.i = new byte[this.f.f() + this.f.e()];
      return true;
    } catch (FileNotFoundException fileNotFoundException) {
      fileNotFoundException.printStackTrace();
      throw new a("File not found:\n" + paramString);
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new a("Unable to open file:\n" + paramString);
    } 
  }
  
  public void a() {
    try {
      this.e.close();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
  
  public Iterator b() {
    ArrayList<T> arrayList = new ArrayList();
    Iterator<T> iterator = this.f.d();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return arrayList.iterator();
  }
  
  public float[] c() {
    try {
      int i = -1;
      if (this.g != null) {
        i = this.e.read(this.g);
        if (this.f.g() != null)
          for (int j = (int)this.f.g().a(this.g); j != this.h.length && i > 0; j = (int)this.f.g().a(this.g)) {
            System.out.println("Skipping:" + j);
            this.e.skip(j);
            i = this.e.read(this.g);
          }  
      } 
      this.e.read(this.h);
      if (this.g != null) {
        System.arraycopy(this.g, 0, this.i, 0, this.g.length);
        System.arraycopy(this.h, 0, this.i, this.g.length, this.h.length);
      } else {
        this.i = this.h;
      } 
      float[] arrayOfFloat = new float[this.f.a()];
      for (byte b1 = 0; b1 < this.f.a(); b1++) {
        a a = this.f.a(b1);
        arrayOfFloat[b1] = a.a(this.i);
      } 
      this.b++;
      return arrayOfFloat;
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new a("Error reading from file. Stopping.");
    } 
  }
  
  public long d() {
    return (this.a - this.f.b()) / this.f.c();
  }
  
  public boolean e() {
    return ((this.b * this.f.c() + this.f.b()) < this.a - this.f.c());
  }
  
  public void a(c paramc) {
    this.f = paramc;
  }
  
  public boolean f() {
    return true;
  }
  
  public HashMap g() {
    return null;
  }
  
  public String h() {
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */