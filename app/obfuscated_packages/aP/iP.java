package aP;

import C.a;
import V.a;
import aE.a;
import bH.D;
import bH.I;
import bH.X;
import bH.ae;
import bH.t;
import com.efiAnalytics.apps.ts.dashboard.HtmlDisplay;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.apps.ts.dashboard.x;
import com.efiAnalytics.tunerStudio.search.ContinuousIpSearchPanel;
import com.efiAnalytics.ui.eJ;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.a;
import r.i;
import r.j;
import r.n;
import s.g;

public class iP {
  private static iP f = null;
  
  HtmlDisplay a = new HtmlDisplay();
  
  HtmlDisplay b = new HtmlDisplay();
  
  HtmlDisplay c = new HtmlDisplay();
  
  ContinuousIpSearchPanel d = null;
  
  private File g = null;
  
  private static String h = "help/register.zip";
  
  private static String i = "help/ad.zip";
  
  private static String j = "help/main.zip";
  
  iS e = new iS();
  
  private HashMap k = new HashMap<>();
  
  private static String l = "font-size:";
  
  private static String m = "width=";
  
  private static String n = "height=";
  
  private iP() {
    this.g = j.d();
    this.a.setFont(new Font("SansSerif", 0, 25));
  }
  
  public static iP a() {
    if (f == null)
      f = new iP(); 
    return f;
  }
  
  public void a(x paramx) {
    c();
    b(paramx);
    paramx.e(true);
    paramx.validate();
  }
  
  private void c() {
    d();
    e();
    f();
  }
  
  private void d() {
    File file1 = b("main");
    File file2 = new File(file1, "startScreen.html");
    if (!file2.exists()) {
      File file = new File(".", j);
      try {
        ae.a(file, file1, null);
      } catch (Exception exception) {
        throw new a("Problem extracting Main Start Screen files. It appears your installation is corrupt or file permissions incorrect.");
      } 
    } 
    if (!file2.exists())
      throw new a("Start Screen files missing. It appears your instalation is corrupt or file permissions incorrect."); 
    File file3 = new File(file1, "startScreen_" + g.c().getLanguage() + ".html");
    if (!file3.exists())
      file3 = new File(file1, "startScreen.html"); 
    File file4 = a(file3.getAbsolutePath());
    this.a.setDocumentUrl(file4.getAbsolutePath());
    this.a.validate();
    iQ iQ = new iQ(this);
    this.e.b(file1, "main", iQ);
  }
  
  private void e() {
    File file1 = b("register");
    File file2 = new File(file1, "registeredMain.html");
    if (!file2.exists()) {
      File file = new File(".", h);
      try {
        ae.a(file, file1, null);
      } catch (Exception exception) {
        throw new a("Problem extracting Start Screen files. It appears your installation is corrupt or file permissions incorrect.");
      } 
    } 
    if (!file2.exists())
      throw new a("Start Screen files missing. It appears your instalation is corrupt or file permissions incorrect."); 
    if (i.a().a("-0ofdspok54sg")) {
      File file3 = new File(file1, "registeredMain_" + g.c().getLanguage() + ".html");
      if (!file3.exists())
        file3 = new File(file1, "registeredMain.html"); 
      File file4 = a(file3.getAbsolutePath());
      this.b.setDocumentUrl(file4.getAbsolutePath());
    } else {
      File file3 = new File(file1, "registerMain_" + g.c().getLanguage() + ".html");
      if (!file3.exists())
        file3 = new File(file1, "registerMain.html"); 
      File file4 = a(file3.getAbsolutePath());
      this.b.setDocumentUrl(file4.getAbsolutePath());
    } 
  }
  
  private File b(String paramString) {
    File file = new File(this.g, paramString);
    if (!file.exists()) {
      File file1 = new File(file, "tmp");
      if (!file1.mkdirs())
        throw new a("Unable to create Start Screen Root dir:\n" + file.getAbsolutePath()); 
      file1.delete();
    } else if (file.isFile()) {
      file.delete();
      file.mkdir();
    } 
    if (!g.c().equals(a.a().c())) {
      File file1 = new File(file, g.c().getLanguage());
      if (file1.exists() && file1.isDirectory())
        file = file1; 
    } 
    return file;
  }
  
  private void f() {
    File file1 = b("ad");
    File file2 = new File(file1, "index.html");
    if (!file2.exists()) {
      file3 = new File(".", i);
      try {
        ae.a(file3, file1, null);
      } catch (Exception exception) {
        throw new a("Problem extracting Main Start Screen files. It appears your installation is corrupt or file permissions incorrect.");
      } 
    } 
    if (!file2.exists())
      throw new a("Start Screen files missing. It appears your instalation is corrupt or file permissions incorrect."); 
    int i = a.a().a(a.x, -1);
    if (++i == 0) {
      file3 = new File(file1, "index_" + g.c().getLanguage() + ".html");
      if (!file3.exists())
        file3 = new File(file1, "index.html"); 
    } else {
      file3 = new File(file1, "index" + i + "_" + g.c().getLanguage() + ".html");
      if (!file3.exists())
        file3 = new File(file1, "index" + i + ".html"); 
      if (!file3.exists()) {
        i = 0;
        file3 = new File(file1, "index.html");
      } 
    } 
    File file3 = a(file3.getAbsolutePath());
    a.a().b(a.x, "" + i);
    this.c.setDocumentUrl(file3.getAbsolutePath());
    iR iR = new iR(this);
    this.e.b(file1, "ad", iR);
  }
  
  private void b(x paramx) {
    paramx.c();
    this.b.setRelativeX(0.75D);
    this.b.setRelativeY(0.0D);
    this.b.setRelativeWidth(0.25D);
    this.b.setRelativeHeight(0.28D);
    paramx.b((s)this.b);
    this.c.setRelativeX(0.75D);
    this.c.setRelativeY(0.28D);
    this.c.setRelativeWidth(0.25D);
    this.c.setRelativeHeight(0.72D);
    paramx.b((s)this.c);
    this.a.setRelativeX(0.0D);
    this.a.setRelativeY(0.0D);
    this.a.setRelativeWidth(0.75D);
    this.a.setRelativeHeight(1.0D);
    paramx.b((s)this.a);
  }
  
  public File a(String paramString) {
    File file1 = new File(paramString);
    File file2 = new File(file1.getParentFile(), "prepped_" + file1.getName());
    file2.deleteOnExit();
    return a(file1, file2);
  }
  
  public File a(File paramFile1, File paramFile2) {
    BufferedWriter bufferedWriter = null;
    BufferedReader bufferedReader = null;
    try {
      Charset charset = Charset.forName("UTF-8");
      InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(paramFile1), charset);
      bufferedReader = new BufferedReader(inputStreamReader);
      FileOutputStream fileOutputStream = new FileOutputStream(paramFile2);
      OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, charset);
      bufferedWriter = new BufferedWriter(outputStreamWriter);
      for (String str = bufferedReader.readLine(); str != null; str = bufferedReader.readLine()) {
        str = c(str);
        bufferedWriter.append(str);
        bufferedWriter.newLine();
      } 
    } catch (Exception exception) {
      Logger.getLogger(iP.class.getName()).log(Level.SEVERE, (String)null, exception);
    } finally {
      try {
        if (bufferedWriter != null)
          bufferedWriter.close(); 
      } catch (Exception exception) {
        Logger.getLogger(iP.class.getName()).log(Level.SEVERE, (String)null, exception);
      } 
      try {
        if (bufferedReader != null)
          bufferedReader.close(); 
      } catch (Exception exception) {
        Logger.getLogger(iP.class.getName()).log(Level.SEVERE, (String)null, exception);
      } 
    } 
    return paramFile2;
  }
  
  private String c(String paramString) {
    String str = "$scaleToDpi(";
    if (paramString.contains("$RecentProjectLinkList"))
      if (i.a().a("h-0ewkfd[pfd[pew")) {
        String str1 = "<br><a href=\"appAction:browseProjects\">" + g.b("Open Project") + "</a>";
        paramString = X.b(paramString, "$RecentProjectLinkList", str1);
      } else {
        String str1 = g();
        paramString = X.b(paramString, "$RecentProjectLinkList", str1);
      }  
    if (paramString.contains("$lastProjectName")) {
      String str1 = h();
      paramString = X.b(paramString, "$lastProjectName", str1);
    } 
    if (paramString.contains("$lastProjectName")) {
      String str1 = h();
      paramString = X.b(paramString, "$lastProjectName", str1);
    } 
    if (paramString.contains("$firstName")) {
      String str1 = a.a().a(a.cC, "Unknown");
      paramString = X.b(paramString, "$firstName", str1);
    } 
    if (paramString.contains("$lastName")) {
      String str1 = a.a().a(a.cD, "Unknown");
      paramString = X.b(paramString, "$lastName", str1);
    } 
    if (paramString.contains("$upgradeLink")) {
      String str1 = i.a().c();
      if (str1 == null)
        str1 = ""; 
      paramString = X.b(paramString, "$upgradeLink", str1);
    } 
    if (paramString.contains("$Year"))
      paramString = X.b(paramString, "$Year", "" + a.aj); 
    if (paramString.contains("$VersionNumber"))
      paramString = X.b(paramString, "$VersionNumber", "" + a.a); 
    if (paramString.contains("$appFullName"))
      paramString = X.b(paramString, "$appFullName", a.a().b()); 
    for (ja ja : this.k.values()) {
      while (paramString.contains(ja.a()))
        paramString = X.b(paramString, ja.a(), ja.b()); 
    } 
    while (paramString.contains(str)) {
      int i;
      String str1 = paramString.substring(0, paramString.indexOf(str));
      String str2 = paramString.substring(str1.length() + str.length(), paramString.indexOf(")", str1.length() + str.length()));
      String str3 = paramString.substring(paramString.indexOf(")", str1.length() + str.length()) + 1);
      try {
        i = Integer.parseInt(str2);
        i = eJ.a(i);
      } catch (NumberFormatException numberFormatException) {
        D.b("Poorly formatted $scaleToDpi() function in line:\n" + paramString);
        break;
      } 
      paramString = str1 + i + str3;
    } 
    paramString = a(m, paramString);
    return a(n, paramString);
  }
  
  private String a(String paramString1, String paramString2) {
    try {
      if (eJ.b() && (paramString2.contains("{") || paramString2.contains("<img") || paramString2.contains("background=")) && paramString2.contains(paramString1)) {
        String str1 = paramString2.substring(0, paramString2.indexOf(paramString1) + paramString1.length());
        int i = str1.length();
        String str2 = "";
        while (true) {
          if (paramString2.charAt(i) == ' ' || I.a(paramString2.charAt(i) + "")) {
            str2 = str2 + paramString2.charAt(i++);
            continue;
          } 
          String str = paramString2.substring(str1.length() + str2.length());
          boolean bool1 = str2.contains("px");
          if (bool1)
            str2 = X.b(str2, "px", ""); 
          boolean bool2 = str2.contains(";");
          if (bool2)
            str2 = X.b(str2, ";", ""); 
          str2 = X.b(str2, "\"", "");
          str2 = str2.trim();
          int j = Integer.parseInt(str2);
          j = eJ.a(j);
          str2 = j + "";
          if (bool1)
            str2 = str2 + "px"; 
          if (bool2)
            str2 = str2 + ";"; 
          paramString2 = str1 + str2 + " " + str;
          break;
        } 
      } 
    } catch (Exception exception) {
      D.b("Failed to parse tag:" + paramString1 + " in line:\n" + paramString2);
    } 
    return paramString2;
  }
  
  public void a(ja paramja) {
    this.k.put(paramja.a(), paramja);
  }
  
  private static String g() {
    ArrayList<String> arrayList = (new n()).a();
    if (arrayList.isEmpty()) {
      File file = new File(j.u());
      File[] arrayOfFile = file.listFiles();
      for (byte b = 0; b < arrayOfFile.length; b++) {
        if (a.a(arrayOfFile[b]))
          arrayList.add(arrayOfFile[b].getAbsolutePath()); 
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder("<ul>\n");
    if (arrayList.size() > 0)
      for (String str1 : arrayList) {
        String str2 = str1.substring(str1.lastIndexOf(File.separator) + 1);
        try {
          stringBuilder.append("<li><a href=\"appAction:openProject?projectPath=" + URLEncoder.encode(str1, "UTF-8") + "\">" + str2 + "</a></li>\n");
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
          Logger.getLogger(iP.class.getName()).log(Level.SEVERE, (String)null, unsupportedEncodingException);
        } 
      }  
    stringBuilder.append("<br><a href=\"appAction:browseProjects\">").append(g.b("Other Projects") + "</a>");
    return stringBuilder.toString();
  }
  
  private static String h() {
    ArrayList<String> arrayList = (new n()).a();
    if (arrayList.size() > 0) {
      String str = arrayList.get(0);
      return str.substring(str.lastIndexOf(File.separator) + 1);
    } 
    return "None";
  }
  
  public void b() {
    t.b(this.g);
    this.e.a();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */