package W;

import java.io.IOException;
import java.io.Reader;

public class ah extends Reader {
  private Reader a;
  
  private char[] b;
  
  private int c;
  
  private int d;
  
  private int e = -1;
  
  private int f = 0;
  
  private boolean g = false;
  
  private boolean h = false;
  
  private static int i = 8192;
  
  private static int j = 80;
  
  public ah(Reader paramReader, int paramInt) {
    super(paramReader);
    if (paramInt <= 0)
      throw new IllegalArgumentException("Buffer size <= 0"); 
    this.a = paramReader;
    this.b = new char[paramInt];
    this.d = this.c = 0;
  }
  
  public ah(Reader paramReader) {
    this(paramReader, i);
  }
  
  private void b() {
    if (this.a == null)
      throw new IOException("Stream closed"); 
  }
  
  private void c() {
    int i;
    if (this.e <= -1) {
      i = 0;
    } else {
      int j = this.d - this.e;
      if (j >= this.f) {
        this.e = -2;
        this.f = 0;
        i = 0;
      } else {
        if (this.f <= this.b.length) {
          System.arraycopy(this.b, this.e, this.b, 0, j);
          this.e = 0;
          i = j;
        } else {
          char[] arrayOfChar = new char[this.f];
          System.arraycopy(this.b, this.e, arrayOfChar, 0, j);
          this.b = arrayOfChar;
          this.e = 0;
          i = j;
        } 
        this.d = this.c = j;
      } 
    } 
    while (true) {
      int j = this.a.read(this.b, i, this.b.length - i);
      if (j != 0) {
        if (j > 0) {
          this.c = i + j;
          this.d = i;
        } 
        return;
      } 
    } 
  }
  
  public int read() {
    synchronized (this.lock) {
      b();
      while (true) {
        if (this.d >= this.c) {
          c();
          if (this.d >= this.c)
            return -1; 
        } 
        if (this.g) {
          this.g = false;
          if (this.b[this.d] == '\n') {
            this.d++;
            continue;
          } 
        } 
        break;
      } 
      return this.b[this.d++];
    } 
  }
  
  private int a(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    if (this.d >= this.c) {
      if (paramInt2 >= this.b.length && this.e <= -1 && !this.g)
        return this.a.read(paramArrayOfchar, paramInt1, paramInt2); 
      c();
    } 
    if (this.d >= this.c)
      return -1; 
    if (this.g) {
      this.g = false;
      if (this.b[this.d] == '\n') {
        this.d++;
        if (this.d >= this.c)
          c(); 
        if (this.d >= this.c)
          return -1; 
      } 
    } 
    int i = Math.min(paramInt2, this.c - this.d);
    System.arraycopy(this.b, this.d, paramArrayOfchar, paramInt1, i);
    this.d += i;
    return i;
  }
  
  public int read(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    synchronized (this.lock) {
      b();
      if (paramInt1 < 0 || paramInt1 > paramArrayOfchar.length || paramInt2 < 0 || paramInt1 + paramInt2 > paramArrayOfchar.length || paramInt1 + paramInt2 < 0)
        throw new IndexOutOfBoundsException(); 
      if (paramInt2 == 0)
        return 0; 
      int i = a(paramArrayOfchar, paramInt1, paramInt2);
      if (i <= 0)
        return i; 
      while (i < paramInt2 && this.a.ready()) {
        int j = a(paramArrayOfchar, paramInt1 + i, paramInt2 - i);
        if (j <= 0)
          break; 
        i += j;
      } 
      return i;
    } 
  }
  
  String a(boolean paramBoolean) {
    StringBuffer stringBuffer = null;
    synchronized (this.lock) {
      b();
      boolean bool = (paramBoolean || this.g) ? true : false;
      while (true) {
        if (this.d >= this.c)
          c(); 
        if (this.d >= this.c) {
          if (stringBuffer != null && stringBuffer.length() > 0)
            return stringBuffer.toString(); 
          return null;
        } 
        boolean bool1 = false;
        char c = Character.MIN_VALUE;
        if (bool && this.b[this.d] == '\n')
          this.d++; 
        this.g = false;
        bool = false;
        byte b = 0;
        int j;
        for (j = this.d; j < this.c; j++) {
          c = this.b[j];
          if (c == '\r') {
            b++;
            if (j + 1 < this.c && this.b[j + 1] != '\n') {
              j++;
              bool1 = true;
              break;
            } 
          } 
          if (c == '\n') {
            bool1 = true;
            break;
          } 
        } 
        int i = this.d;
        this.d = j;
        if (bool1) {
          String str;
          if (stringBuffer == null) {
            str = new String(this.b, i, j - i - b);
          } else {
            stringBuffer.append(this.b, i, j - i - b);
            str = stringBuffer.toString();
          } 
          this.d++;
          if (c == '\r')
            this.g = true; 
          return str;
        } 
        if (stringBuffer == null)
          stringBuffer = new StringBuffer(j); 
        stringBuffer.append(this.b, i, j - i);
      } 
    } 
  }
  
  public String a() {
    return a(false);
  }
  
  public long skip(long paramLong) {
    if (paramLong < 0L)
      throw new IllegalArgumentException("skip value is negative"); 
    synchronized (this.lock) {
      b();
      long l = paramLong;
      while (l > 0L) {
        if (this.d >= this.c)
          c(); 
        if (this.d >= this.c)
          break; 
        if (this.g) {
          this.g = false;
          if (this.b[this.d] == '\n')
            this.d++; 
        } 
        long l1 = (this.c - this.d);
        if (l <= l1) {
          this.d = (int)(this.d + l);
          l = 0L;
          break;
        } 
        l -= l1;
        this.d = this.c;
      } 
      return paramLong - l;
    } 
  }
  
  public boolean ready() {
    synchronized (this.lock) {
      b();
      if (this.g) {
        if (this.d >= this.c && this.a.ready())
          c(); 
        if (this.d < this.c) {
          if (this.b[this.d] == '\n')
            this.d++; 
          this.g = false;
        } 
      } 
      return (this.d < this.c || this.a.ready());
    } 
  }
  
  public boolean markSupported() {
    return true;
  }
  
  public void mark(int paramInt) {
    if (paramInt < 0)
      throw new IllegalArgumentException("Read-ahead limit < 0"); 
    synchronized (this.lock) {
      b();
      this.f = paramInt;
      this.e = this.d;
      this.h = this.g;
    } 
  }
  
  public void reset() {
    synchronized (this.lock) {
      b();
      if (this.e < 0)
        throw new IOException((this.e == -2) ? "Mark invalid" : "Stream not marked"); 
      this.d = this.e;
      this.g = this.h;
    } 
  }
  
  public void close() {
    synchronized (this.lock) {
      if (this.a == null)
        return; 
      this.a.close();
      this.a = null;
      this.b = null;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/ah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */