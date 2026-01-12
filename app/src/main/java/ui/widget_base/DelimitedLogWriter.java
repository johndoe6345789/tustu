package W;

import bH.X;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Scanner;

public class DelimitedLogWriter {
  private File g = null;

  Writer a = null;

  int b = 0;

  private String h = "\t";

  ArrayList c = new ArrayList();

  static String d = "[FooterData]";

  boolean e = false;

  String f = "";

  private DelimitedLogWriter(String paramString) {
    this.g = new File(paramString);
    this.a = new BufferedWriter(new FileWriter(this.g));
  }

  public static o a(n paramn, String paramString1, String paramString2) {
    o o1 = new o(paramString1);
    o1.a(paramString2);
    o1.c(paramn);
    return o1;
  }

  public static void b(n paramn, String paramString1, String paramString2) {
    o o1 = null;
    BufferedReader bufferedReader = null;
    if (paramString1.toLowerCase().endsWith(".mlg"))
      throw new IOException(
          "Attempting to update LogFooter of a binary log as a delimited ASCII log");
    try {
      File file1 = new File(paramString1 + ".tmp");
      File file2 = new File(paramString1);
      bufferedReader = new BufferedReader(new FileReader(file2));
      o1 = new o(file1.getAbsolutePath());
      o1.a(paramString2);
      String str;
      while ((str = bufferedReader.readLine()) != null && !str.startsWith(d)) {
        o1.a.write(str);
        o1.a.write(10);
      }
      o1.b(paramn);
      try {
        bufferedReader.close();
      } catch (Exception exception) {
        exception.printStackTrace();
      }
      try {
        o1.a();
      } catch (Exception exception) {
        exception.printStackTrace();
      }
      if (!file2.delete())
        throw new IOException("Unable to update file:\n" + file2.getAbsolutePath());
      file1.renameTo(file2);
    } catch (IOException iOException) {
      throw iOException;
    } finally {
      try {
        o1.a();
      } catch (Exception exception) {
      }
      try {
        bufferedReader.close();
      } catch (Exception exception) {
      }
    }
  }

  private void c(n paramn) {
    String str = paramn.g();
    boolean bool = false;
    Scanner scanner = new Scanner(str);
    while (scanner.hasNextLine()) {
      String str1 = scanner.nextLine();
      if (bool) {
        if (str1.startsWith("NEW_INFO_PROVIDER") && str1.contains("[FooterData]"))
          while (scanner.hasNextLine()) {
            str1 = scanner.nextLine();
            this.f += str1 + "\n";
          }
        continue;
      }
      if (str1.startsWith("NEW_INFO_PROVIDER") && !str1.contains("[FooterData]")) {
        bool = true;
        continue;
      }
      if (str1.startsWith("\"") || str1.startsWith("#")) {
        this.a.write(str1 + "\n");
        continue;
      }
      this.a.write("#" + str1 + "\n");
    }
    boolean bool1 = paramn.e();
    byte b;
    for (b = 0; b < paramn.size(); b++) {
      j j = (j) paramn.get(b);
      this.a.write(j.a());
      if (b < paramn.size() - 1) this.a.write(this.h);
    }
    this.a.write("\n");
    if (bool1) {
      for (b = 0; b < paramn.size(); b++) {
        j j = (j) paramn.get(b);
        if (j.n() != null) this.a.write(j.n());
        if (b < paramn.size() - 1) this.a.write(this.h);
      }
      this.a.write("\n");
    }
  }

  public void a(aq paramaq) {
    this.c.add(paramaq);
  }

  private void b() {
    for (aq aq : this.c) aq.a();
  }

  private void a(double paramDouble) {
    for (aq aq : this.c) aq.a(paramDouble);
  }

  public void a(n paramn) {
    a(paramn, 0, paramn.d());
  }

  public void a(n paramn, int paramInt1, int paramInt2) {
    int i = paramn.d();
    for (byte b = 0; b < i; b++) {
      for (byte b1 = 0; b1 < paramn.size(); b1++) {
        j j = (j) paramn.get(b1);
        this.a.write(j.b(b) + "");
        if (b1 < paramn.size() - 1) this.a.write(this.h);
      }
      this.a.write("\n");
      if (b % 200 == 0 || b == i - 1) a(b / i);
    }
    this.a.write("MARK " + X.a("" + this.b++, '0', 3) + "\n");
    this.a.flush();
  }

  public void b(n paramn) {
    if (paramn.h()) {
      this.a.append(d).append("\n");
      for (String str1 : paramn.i()) {
        String str2 = paramn.f(str1);
        str2 = URLEncoder.encode(str2, "UTF-8");
        this.a.append(str1).append('=').append(str2).append('\n');
      }
      this.a.flush();
    }
  }

  public void a() {
    try {
      this.a.flush();
      this.a.close();
    } finally {
      b();
    }
  }

  public void a(String paramString) {
    this.h = paramString;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
