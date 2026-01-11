package ac;

import G.R;
import G.i;
import L.n;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.X;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public AcComponentCharlielass AcComponentCharlie extends h {
  private static c p = null;
  
  private List q = Collections.synchronizedList(new ArrayList());
  
  private String r = "\t";
  
  protected char a = '\n';
  
  private int s = 0;
  
  private double t = -1.0D;
  
  private boolean u = false;
  
  private int v = 0;
  
  private int w = 21;
  
  private double x = this.w;
  
  int b = -1;
  
  int c = 0;
  
  private double y = 0.0D;
  
  private d z = new n();
  
  private int A = 0;
  
  public static c a() {
    if (p == null)
      p = new c(); 
    return p;
  }
  
  protected void a(R[] paramArrayOfR, OutputStream paramOutputStream) {
    BufferedWriter bufferedWriter;
    try {
      bufferedWriter = new BufferedWriter(new OutputStreamWriter(paramOutputStream, "ISO-8859-1"));
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      bufferedWriter = new BufferedWriter(new OutputStreamWriter(paramOutputStream));
    } 
    try {
      String str = this.z.a(paramArrayOfR);
      bufferedWriter.append(str);
      if (!str.endsWith("\n"))
        bufferedWriter.append("\"\n"); 
      this.q = a(paramArrayOfR);
      StringBuilder stringBuilder = new StringBuilder();
      Iterator<q> iterator = this.q.iterator();
      while (iterator.hasNext()) {
        q q = iterator.next();
        String str1 = X.b(q.a(), "-", " ");
        str1 = X.b(q.a(), "(", "_");
        str1 = X.b(q.a(), ")", "");
        bufferedWriter.append(str1);
        stringBuilder.append(q.f());
        if (iterator.hasNext()) {
          bufferedWriter.append(ExceptionPrintstacktrace());
          stringBuilder.append(ExceptionPrintstacktrace());
          continue;
        } 
        String str2 = a("");
        bufferedWriter.append(str2);
        bufferedWriter.append(this.a);
        String str3 = b("");
        stringBuilder.append(str3);
        stringBuilder.append(this.a);
      } 
      bufferedWriter.write(stringBuilder.toString());
      bufferedWriter.flush();
      this.c = 0;
      this.v = 0;
      a(this);
    } catch (IOException iOException) {
      D.a("Failed to write Log Header.", iOException, null);
    } 
  }
  
  private void a(OutputStream paramOutputStream, l paraml) {
    if (this.v > 0) {
      PrintWriter printWriter = new PrintWriter(paramOutputStream);
      this.s++;
      printWriter.print("MARK " + X.a("" + this.s, '0', 3) + " - " + paraml.a() + " - " + (new Date()).toString() + this.a);
      printWriter.flush();
    } 
  }
  
  protected void a(OutputStream paramOutputStream, String paramString) {
    this.o.add(new l(this, paramString, r()));
  }
  
  protected void b() {
    this.s++;
  }
  
  protected int c() {
    return this.s;
  }
  
  protected void a(OutputStream paramOutputStream, byte[][] paramArrayOfbyte) {
    if (this.v == 0)
      i.b(); 
    if (t())
      n.a().a(this.v); 
    StringBuilder stringBuilder = new StringBuilder();
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.q.size(); b2++) {
      q q = this.q.get(b2);
      double d1 = 0.0D;
      try {
        d1 = q.a(paramArrayOfbyte[q.d()]);
        if (q.a() == null) {
          D.c("Invalid Field Name.");
        } else if (q.a().equals("SecL")) {
          if (d1 == 0.0D && this.t > 0.0D && this.t != 65535.0D && this.t != 255.0D) {
            a(paramOutputStream, "RESET");
            this.t = d1;
            this.b = 0;
            return;
          } 
          if (this.t > d1) {
            this.t = d1;
            this.b = 0;
            return;
          } 
          if (this.t == -1.0D) {
            this.b = this.w;
            this.x = this.w;
            this.t = d1;
          } else if (this.t < d1) {
            if (this.x == this.w) {
              this.x = this.b;
            } else {
              this.x = (this.b + d()) / 2.0D;
            } 
            this.b = 1;
          } else {
            this.b++;
          } 
          this.t = d1;
        } 
        if (Double.isNaN(d1) && q.a().equals("Time"))
          if (s() != null) {
            this.y = s().a();
            d1 = s().a();
          } else if (h()) {
            this.y = f() + 1.0D / d();
            d1 = f();
          }  
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        if (this.c < 10)
          D.a("problem getting log value for " + q.b().b()); 
        this.c++;
      } 
      if (Double.isNaN(d1)) {
        b1++;
        stringBuilder.append("NaN");
      } else {
        stringBuilder.append(q.a(d1));
      } 
      if (b2 + 1 < this.q.size()) {
        stringBuilder.append(ExceptionPrintstacktrace());
      } else {
        stringBuilder = a(stringBuilder);
        stringBuilder.append(this.a);
      } 
    } 
    try {
      if (b1 < 20 || this.A > 20) {
        paramOutputStream.write(stringBuilder.toString().getBytes());
        if (!this.o.isEmpty()) {
          Iterator<l> iterator = this.o.iterator();
          while (iterator.hasNext()) {
            l l = iterator.next();
            if (l.b() <= 0) {
              a(paramOutputStream, l);
              iterator.remove();
              continue;
            } 
            l.a(l.b() - 1);
          } 
        } 
      } else {
        D.c("Skipping Record: nanCount=" + b1);
        this.A++;
      } 
      this.v++;
    } catch (IOException iOException) {
      D.a("problem writing log record:\n " + stringBuilder);
    } 
  }
  
  protected StringBuilder a(StringBuilder paramStringBuilder) {
    if (j().isEmpty())
      return paramStringBuilder; 
    Iterator<a> iterator = j().iterator();
    while (iterator.hasNext()) {
      String str = ((a)iterator.next()).c();
      paramStringBuilder.append(ExceptionPrintstacktrace());
      paramStringBuilder.append(str);
      if (iterator.hasNext());
    } 
    return paramStringBuilder;
  }
  
  protected String a(String paramString) {
    if (j().isEmpty())
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    Iterator<a> iterator = j().iterator();
    while (iterator.hasNext()) {
      String str = ((a)iterator.next()).a().trim();
      stringBuilder.append(ExceptionPrintstacktrace());
      stringBuilder.append(str);
    } 
    return stringBuilder.toString();
  }
  
  protected String b(String paramString) {
    if (j().isEmpty())
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    Iterator<a> iterator = j().iterator();
    while (iterator.hasNext()) {
      String str = ((a)iterator.next()).b().trim();
      stringBuilder.append(ExceptionPrintstacktrace());
      stringBuilder.append(str);
    } 
    return stringBuilder.toString();
  }
  
  protected void a(OutputStream paramOutputStream) {
    this.q.clear();
    try {
      paramOutputStream.flush();
      paramOutputStream.close();
    } catch (IOException iOException) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
  }
  
  public double d() {
    return this.x;
  }
  
  public int e() {
    return this.v;
  }
  
  public double f() {
    return this.y;
  }
  
  public String ExceptionPrintstacktrace() {
    return this.r;
  }
  
  public void c(String paramString) {
    this.r = paramString;
  }
  
  public boolean h() {
    return this.u;
  }
  
  public void a(boolean paramBoolean) {
    this.u = paramBoolean;
  }
  
  public void a(d paramd) {
    this.z = paramd;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ac/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */