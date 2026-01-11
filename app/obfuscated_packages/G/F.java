package G;

import A.l;
import J.f;
import J.g;
import V.a;
import V.g;
import bH.D;
import bH.X;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class F extends Q implements co, Serializable, Cloneable {
  private String e = "basicRequestReply";
  
  private String f = "big";
  
  private int g = 0;
  
  private int h = 300;
  
  private int i = 250;
  
  private boolean j = true;
  
  private boolean k = false;
  
  private boolean l = false;
  
  private int[] m = null;
  
  private int n = 0;
  
  private int o = 2;
  
  private int[] p = null;
  
  private String[] q = null;
  
  private H[] r = null;
  
  private H[] s = null;
  
  private H[] t = null;
  
  private H[] u = null;
  
  private H[] v = null;
  
  private H[] w = null;
  
  private H x = null;
  
  private H y = null;
  
  private H z = null;
  
  private H A = null;
  
  private H B = null;
  
  private H C = null;
  
  private String D = null;
  
  private H E = null;
  
  private H F = null;
  
  private H G = null;
  
  private H H = null;
  
  private int I = 0;
  
  private int J = -1;
  
  private int K = -1;
  
  private int L = 15;
  
  private int M = 0;
  
  private int N = 300;
  
  public static int a = 14;
  
  private int O = a;
  
  private int P = 0;
  
  private final Map Q = new HashMap<>();
  
  private int R = 115200;
  
  private int S = -1;
  
  private String T = "COM1";
  
  private String U = "t";
  
  private String V = null;
  
  private boolean W = false;
  
  private int X = -1;
  
  private int Y = -1;
  
  private int Z = -1;
  
  private boolean aa = false;
  
  private boolean ab = true;
  
  private int ac = 15;
  
  private boolean ad = false;
  
  private boolean ae = false;
  
  private int af = -1;
  
  private int ag = -1;
  
  private String ah = "";
  
  private int[] ai = null;
  
  private int aj = Integer.MAX_VALUE;
  
  private boolean ak = false;
  
  private boolean al = true;
  
  private boolean am = false;
  
  private boolean an = true;
  
  private cV ao = null;
  
  private cR ap = null;
  
  private String aq = null;
  
  private List ar = null;
  
  private List as = null;
  
  private int at = 50;
  
  private boolean au = false;
  
  private boolean av = true;
  
  private dj aw = null;
  
  private dj ax = null;
  
  private dj ay = null;
  
  private dj az = null;
  
  private dj aA = null;
  
  private String aB = null;
  
  private boolean aC = false;
  
  private boolean aD = false;
  
  private boolean aE = true;
  
  private boolean aF = true;
  
  private boolean aG = true;
  
  private boolean aH = false;
  
  private long aI = 0L;
  
  private boolean aJ = false;
  
  private boolean aK = true;
  
  private boolean aL = false;
  
  private String aM = null;
  
  private dj aN = null;
  
  private String aO = null;
  
  private dj aP = null;
  
  List b = new ArrayList();
  
  List c = null;
  
  int d = 0;
  
  public static boolean a(String paramString) {
    return (paramString.equals("pageReadCommand") || paramString.equals("pageIdentifier") || paramString.equals("pageValueWrite") || paramString.equals("pageChunkWrite") || paramString.equals("pageActivate") || paramString.equals("pageActivationDelay") || paramString.equals("blockReadTimeout") || paramString.equals("writeBlocks") || paramString.equals("interWriteDelay") || paramString.equals("endianness") || paramString.equals("nPages") || paramString.equals("ochBlockSize") || paramString.equals("ochGetCommand") || paramString.equals("queryCommand") || paramString.equals("versionInfo") || paramString.equals("pageSize") || paramString.equals("burnCommand") || paramString.equals("tableWriteCommand") || paramString.equals("blockingFactor") || paramString.equals("getCommand") || paramString.equals("crc32CheckCommand") || paramString.equals("messageEnvelopeFormat") || paramString.equals("tsWriteBlocks") || paramString.equals("filterEchoBytes") || paramString.equals("validateArrayBounds") || paramString.equals("tableBlockingFactor") || paramString.equals("tableCrcCommand") || paramString.equals("sendTablesWithoutEnvelope") || paramString.equals("maxUnusedRuntimeRange") || paramString.equals("turboBaudOnCommand") || paramString.equals("turboBaudOffCommand") || paramString.equals("scatteredOchGetCommand") || paramString.equals("retrieveConfigError") || paramString.equals("useLegacyFTempUnits") || paramString.equals("enable2ndByteCanId") || paramString.equals("outputChannelStartOffset") || paramString.equals("parameterStartOffset") || paramString.equals("envelopedScanCommands") || paramString.equals("replayConfigTable") || paramString.equals("replayReadCommand") || paramString.equals("replayRecordCountParam") || paramString.equals("defaultBaudRate") || paramString.equals("refreshLocalStoreOnActivity") || paramString.equals("delayAfterPortOpen") || paramString.equals("protocol") || paramString.equals("restrictSquirtRelationship") || paramString.equals("forceBigEndianProtocol") || paramString.equals("readSdCompressed") || paramString.equals("noCommReadDelay") || paramString.equals("defaultIpAddress") || paramString.equals("defaultIpPort") || paramString.equals("defaultRuntimeRecordPerSec") || paramString.equals("ignoreMissingBitOptions") || paramString.equals("autoBurnOnPageChange") || paramString.equals("surpressConfigErrorVerbiage"));
  }
  
  public void a(String paramString1, String paramString2) {
    try {
      if (paramString1.equals("pageReadCommand")) {
        c(X.c(paramString2, ","));
      } else if (paramString1.equals("pageIdentifier")) {
        d(X.c(paramString2, ","));
      } else if (paramString1.equals("pageValueWrite")) {
        e(X.c(paramString2, ","));
      } else if (paramString1.equals("pageChunkWrite")) {
        f(X.c(paramString2, ","));
      } else if (paramString1.equals("crc32CheckCommand")) {
        g(X.c(paramString2, ","));
      } else if (paramString1.equals("burnCommand")) {
        a(X.c(paramString2, ","));
      } else if (paramString1.equals("pageActivate")) {
        h(X.c(paramString2, ","));
      } else if (paramString1.equals("pageActivationDelay")) {
        b(X.g(paramString2));
      } else if (paramString1.equals("blockReadTimeout")) {
        c(X.g(paramString2));
      } else if (paramString1.equals("writeBlocks")) {
        a(paramString2.equals("on"));
      } else if (paramString1.equals("tsWriteBlocks")) {
        e(paramString2.equals("on"));
      } else if (paramString1.equals("interWriteDelay")) {
        d(X.g(paramString2));
      } else if (paramString1.equals("endianness")) {
        d(paramString2);
      } else if (paramString1.equals("nPages")) {
        a(X.g(paramString2));
      } else if (paramString1.equals("pageSize")) {
        a(X.d(paramString2, ","));
      } else if (paramString1.equals("ochBlockSize")) {
        o(X.g(paramString2));
      } else if (paramString1.equals("ochGetCommand")) {
        f(paramString2);
      } else if (paramString1.equals("getCommand")) {
        g(paramString2);
      } else if (paramString1.equals("queryCommand")) {
        h(paramString2);
      } else if (paramString1.equals("versionInfo")) {
        i(paramString2);
      } else if (paramString1.equals("tableWriteCommand")) {
        t(paramString2);
      } else if (paramString1.equals("blockingFactor")) {
        I(X.g(paramString2));
      } else if (paramString1.equals("messageEnvelopeFormat")) {
        c(paramString2);
      } else if (paramString1.equals("filterEchoBytes")) {
        f(Boolean.parseBoolean(paramString2));
      } else if (paramString1.equals("validateArrayBounds")) {
        g(Boolean.parseBoolean(paramString2));
      } else if (paramString1.equals("tableBlockingFactor")) {
        H(X.g(paramString2));
      } else if (paramString1.equals("maxUnusedRuntimeRange")) {
        v(X.g(paramString2));
      } else if (paramString1.equals("tableCrcCommand")) {
        n(paramString2);
      } else if (paramString1.equals("sendTablesWithoutEnvelope")) {
        h((Boolean.parseBoolean(paramString2) || paramString2.equals("on")));
      } else if (paramString1.equals("retrieveConfigError")) {
        B(paramString2);
      } else if (paramString1.equals("turboBaudOnCommand")) {
        D(paramString2);
      } else if (paramString1.equals("turboBaudOffCommand")) {
        E(paramString2);
      } else if (paramString1.equals("scatteredOchGetCommand")) {
        o(paramString2);
      } else if (paramString1.equals("useLegacyFTempUnits")) {
        k(Boolean.parseBoolean(paramString2));
      } else if (paramString1.equals("enable2ndByteCanId")) {
        l(Boolean.parseBoolean(paramString2));
      } else if (paramString1.equals("parameterStartOffset")) {
        b(X.d(paramString2, ","));
      } else if (paramString1.equals("outputChannelStartOffset")) {
        z(X.g(paramString2));
      } else if (paramString1.equals("envelopedScanCommands")) {
        d(paramString2.equals("enabled"));
      } else if (paramString1.equals("replayConfigTable")) {
        q(paramString2);
      } else if (paramString1.equals("replayReadCommand")) {
        C(paramString2);
      } else if (paramString1.equals("replayRecordCountParam")) {
        r(paramString2);
      } else if (paramString1.equals("protocol")) {
        s(paramString2);
      } else if (paramString1.equals("defaultBaudRate")) {
        J(X.g(paramString2));
      } else if (paramString1.equals("refreshLocalStoreOnActivity")) {
        m(Boolean.parseBoolean(paramString2));
      } else if (paramString1.equals("delayAfterPortOpen")) {
        A(X.g(paramString2));
      } else if (paramString1.equals("restrictSquirtRelationship")) {
        this.al = Boolean.parseBoolean(paramString2);
      } else if (paramString1.equals("forceBigEndianProtocol")) {
        this.am = Boolean.parseBoolean(paramString2);
      } else if (paramString1.equals("readSdCompressed")) {
        this.aG = Boolean.parseBoolean(paramString2);
      } else if (paramString1.equals("noCommReadDelay")) {
        o(Boolean.parseBoolean(paramString2));
      } else if (paramString1.equals("defaultRuntimeRecordPerSec")) {
        C(Integer.parseInt(paramString2));
      } else if (paramString1.equals("defaultIpAddress")) {
        l.a(paramString2);
      } else if (paramString1.equals("defaultIpPort")) {
        l.a(Integer.parseInt(paramString2));
      } else if (paramString1.equals("ignoreMissingBitOptions")) {
        p(Boolean.parseBoolean(paramString2));
      } else if (paramString1.equals("autoBurnOnPageChange")) {
        q(Boolean.parseBoolean(paramString2));
      } else if (paramString1.equals("surpressConfigErrorVerbiage")) {
        r(Boolean.parseBoolean(paramString2));
      } else {
        throw new g("Command:" + paramString1 + " undefined.");
      } 
    } catch (Exception exception) {
      throw new g("Error setting:" + paramString1 + " with value:" + paramString2 + " \nReason: " + exception.getMessage());
    } 
  }
  
  public void a(String paramString1, String paramString2, int paramInt) {
    if (paramInt < 0) {
      a(paramString1, paramString2);
    } else {
      try {
        if (paramString1.equals("pageReadCommand")) {
          e(paramString2, paramInt);
        } else if (paramString1.equals("pageIdentifier")) {
          f(paramString2, paramInt);
        } else if (paramString1.equals("pageValueWrite")) {
          g(paramString2, paramInt);
        } else if (paramString1.equals("pageChunkWrite")) {
          h(paramString2, paramInt);
        } else if (paramString1.equals("crc32CheckCommand")) {
          i(paramString2, paramInt);
        } else if (paramString1.equals("burnCommand")) {
          a(paramString2, paramInt);
        } else if (paramString1.equals("pageActivate")) {
          j(paramString2, paramInt);
        } else if (paramString1.equals("pageActivationDelay")) {
          b(X.g(paramString2));
        } else if (paramString1.equals("blockReadTimeout")) {
          c(X.g(paramString2));
        } else if (paramString1.equals("writeBlocks")) {
          a(paramString2.equals("on"));
        } else if (paramString1.equals("tsWriteBlocks")) {
          e(paramString2.equals("on"));
        } else if (paramString1.equals("interWriteDelay")) {
          d(X.g(paramString2));
        } else if (paramString1.equals("endianness")) {
          d(paramString2);
        } else if (paramString1.equals("nPages")) {
          a(X.g(paramString2));
        } else if (paramString1.equals("pageSize")) {
          b(paramString2, paramInt);
        } else if (paramString1.equals("ochBlockSize")) {
          o(X.g(paramString2));
        } else if (paramString1.equals("ochGetCommand")) {
          f(paramString2);
        } else if (paramString1.equals("getCommand")) {
          g(paramString2);
        } else if (paramString1.equals("queryCommand")) {
          h(paramString2);
        } else if (paramString1.equals("versionInfo")) {
          i(paramString2);
        } else if (paramString1.equals("tableWriteCommand")) {
          t(paramString2);
        } else if (paramString1.equals("blockingFactor")) {
          I(X.g(paramString2));
        } else if (paramString1.equals("messageEnvelopeFormat")) {
          c(paramString2);
        } else if (paramString1.equals("filterEchoBytes")) {
          f(Boolean.parseBoolean(paramString2));
        } else if (paramString1.equals("validateArrayBounds")) {
          g(Boolean.parseBoolean(paramString2));
        } else if (paramString1.equals("tableBlockingFactor")) {
          H(X.g(paramString2));
        } else if (paramString1.equals("maxUnusedRuntimeRange")) {
          v(X.g(paramString2));
        } else if (paramString1.equals("tableCrcCommand")) {
          n(paramString2);
        } else if (paramString1.equals("sendTablesWithoutEnvelope")) {
          h((Boolean.parseBoolean(paramString2) || paramString2.equals("on")));
        } else if (paramString1.equals("retrieveConfigError")) {
          B(paramString2);
        } else if (paramString1.equals("turboBaudOnCommand")) {
          D(paramString2);
        } else if (paramString1.equals("turboBaudOffCommand")) {
          E(paramString2);
        } else if (paramString1.equals("scatteredOchGetCommand")) {
          o(paramString2);
        } else if (paramString1.equals("useLegacyFTempUnits")) {
          k(Boolean.parseBoolean(paramString2));
        } else if (paramString1.equals("enable2ndByteCanId")) {
          l(Boolean.parseBoolean(paramString2));
        } else if (paramString1.equals("parameterStartOffset")) {
          b(X.d(paramString2, ","));
        } else if (paramString1.equals("outputChannelStartOffset")) {
          z(X.g(paramString2));
        } else if (paramString1.equals("envelopedScanCommands")) {
          d(paramString2.equals("enabled"));
        } else if (paramString1.equals("replayConfigTable")) {
          q(paramString2);
        } else if (paramString1.equals("replayReadCommand")) {
          C(paramString2);
        } else if (paramString1.equals("replayRecordCountParam")) {
          r(paramString2);
        } else if (paramString1.equals("protocol")) {
          s(paramString2);
        } else if (paramString1.equals("defaultBaudRate")) {
          J(X.g(paramString2));
        } else if (paramString1.equals("refreshLocalStoreOnActivity")) {
          m(Boolean.parseBoolean(paramString2));
        } else if (paramString1.equals("delayAfterPortOpen")) {
          A(X.g(paramString2));
        } else if (paramString1.equals("restrictSquirtRelationship")) {
          this.al = Boolean.parseBoolean(paramString2);
        } else if (paramString1.equals("forceBigEndianProtocol")) {
          this.am = Boolean.parseBoolean(paramString2);
        } else if (paramString1.equals("readSdCompressed")) {
          this.aG = Boolean.parseBoolean(paramString2);
        } else if (paramString1.equals("noCommReadDelay")) {
          o(Boolean.parseBoolean(paramString2));
        } else if (paramString1.equals("defaultRuntimeRecordPerSec")) {
          C(Integer.parseInt(paramString2));
        } else if (paramString1.equals("defaultIpAddress")) {
          l.a(paramString2);
        } else if (paramString1.equals("defaultIpPort")) {
          l.a(Integer.parseInt(paramString2));
        } else if (paramString1.equals("ignoreMissingBitOptions")) {
          p(Boolean.parseBoolean(paramString2));
        } else {
          throw new g("Command:" + paramString1 + " undefined.");
        } 
      } catch (Exception exception) {
        throw new g("Error setting:" + paramString1 + " with value:" + paramString2 + " \nReason: " + exception.getMessage());
      } 
    } 
  }
  
  public void a() {
    if (this.ap != null)
      this.ap.e(); 
  }
  
  public void a(String paramString, String[] paramArrayOfString) {
    G g = new G(this);
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if (this.Q.containsKey(paramArrayOfString[b])) {
        G g1 = (G)this.Q.get(paramArrayOfString[b]);
        Iterator<E> iterator = g1.iterator();
        while (iterator.hasNext())
          g.add(iterator.next()); 
      } else {
        if (!paramArrayOfString[b].trim().startsWith("\"") || !paramArrayOfString[b].trim().endsWith("\""))
          throw new g("Malformed Command String: " + paramArrayOfString[b]); 
        H h = c(x(paramArrayOfString[b]), 0);
        if (h.c())
          a(h); 
        G g1 = new G(this);
        g1.add((E)h);
        this.Q.put(paramArrayOfString[b], g1);
        g.add((E)h);
      } 
    } 
    this.Q.put(paramString, g);
  }
  
  private String x(String paramString) {
    if (paramString.charAt(0) == '"')
      paramString = paramString.substring(1); 
    if (paramString.endsWith("\""))
      paramString = paramString.substring(0, paramString.length() - 1); 
    return paramString;
  }
  
  public G b(String paramString) {
    return (G)this.Q.get(paramString);
  }
  
  public boolean b() {
    for (String str : this.Q.keySet()) {
      if (b(str).a())
        return true; 
    } 
    return false;
  }
  
  public Collection c() {
    ArrayList<G> arrayList = new ArrayList();
    for (String str : this.Q.keySet()) {
      G g = b(str);
      if (g.a())
        arrayList.add(g); 
    } 
    return arrayList;
  }
  
  public List d() {
    if (this.c == null) {
      this.c = new ArrayList();
      for (String str : this.Q.keySet()) {
        if (!str.contains("\""))
          this.c.add(str); 
      } 
    } 
    return this.c;
  }
  
  public boolean a(String paramString1, String paramString2, boolean paramBoolean) {
    for (String str : this.Q.keySet()) {
      if (str.equals(paramString1)) {
        b(paramString1).a(paramBoolean);
        b(paramString1).a(paramString2);
        return true;
      } 
    } 
    return false;
  }
  
  public void c(String paramString) {
    if (paramString.equals("msEnvelope_1.0")) {
      f f = new f();
      f.d(this.J);
      a((cR)f);
      a((cV)new g());
    } else {
      throw new g("Unknown Envelope format defined for setting messageEnvelopeFormat\nKnown format(s): msEnvelope_1.0");
    } 
  }
  
  public boolean e() {
    return f().equals("big");
  }
  
  public String f() {
    return this.f;
  }
  
  public void d(String paramString) {
    this.f = paramString;
  }
  
  public int g() {
    return this.g;
  }
  
  public void a(int paramInt) {
    this.g = paramInt;
  }
  
  public int h() {
    return this.h;
  }
  
  public void b(int paramInt) {
    this.h = paramInt;
  }
  
  public int i() {
    return (this.ap != null) ? this.i : (this.i * 3 / 2);
  }
  
  public void c(int paramInt) {
    this.i = paramInt;
  }
  
  public boolean j() {
    return (H() || (this.j && D() instanceof f));
  }
  
  public void a(boolean paramBoolean) {
    D.d("Set Write Blocks on = " + paramBoolean);
    this.j = paramBoolean;
  }
  
  public int k() {
    return (this.j && this.o < 3) ? 3 : this.o;
  }
  
  public void d(int paramInt) {
    this.o = paramInt;
  }
  
  public H e(int paramInt) {
    return (aA() == null) ? null : ((paramInt >= 0 && (aA()).length > paramInt) ? aA()[paramInt] : aA()[0]);
  }
  
  public void a(String[] paramArrayOfString) {
    a(a(paramArrayOfString, this.m));
  }
  
  public void a(String paramString, int paramInt) {
    if (this.r == null)
      this.r = new H[this.g]; 
    a(this.r, paramString, paramInt);
  }
  
  public void b(String[] paramArrayOfString) {
    H[] arrayOfH = a(paramArrayOfString, this.m);
    if (this.r != null && this.r.length == arrayOfH.length)
      for (byte b = 0; b < arrayOfH.length; b++) {
        if (this.r[b].b().isEmpty())
          arrayOfH[b] = this.r[b]; 
      }  
    a(arrayOfH);
  }
  
  public int f(int paramInt) {
    return this.p[paramInt];
  }
  
  public int[] l() {
    return this.p;
  }
  
  public void a(int[] paramArrayOfint) {
    this.p = paramArrayOfint;
  }
  
  public void b(String paramString, int paramInt) {
    int i;
    if (this.g < paramInt)
      throw new g("Attempt to set page size on page number higher than set number of pages! Was nPages set before page declaration?"); 
    try {
      i = Integer.parseInt(paramString);
    } catch (NumberFormatException numberFormatException) {
      throw new g("Invalid integer value for pageSize: " + paramString);
    } 
    if (this.p == null)
      this.p = new int[this.g]; 
    this.p[paramInt] = i;
  }
  
  public byte[] g(int paramInt) {
    return a(paramInt, 0, f(paramInt));
  }
  
  public H h(int paramInt) {
    return (paramInt >= (aB()).length) ? aB()[0] : aB()[paramInt];
  }
  
  public byte[] a(int paramInt1, int paramInt2, int paramInt3) {
    H h = h(paramInt1);
    return h.a(paramInt2, paramInt3, null);
  }
  
  public byte[] a(String paramString, int[] paramArrayOfint) {
    if (ax() == null || ax().length() < 1)
      throw new g("Table write command not set in current configuration.\nCan not generate a valid send command."); 
    byte[] arrayOfByte = new byte[paramArrayOfint.length + 2];
    try {
      arrayOfByte[0] = ax().getBytes()[0];
      arrayOfByte[1] = z(paramString);
      for (byte b = 0; b < paramArrayOfint.length; b++)
        arrayOfByte[b + 2] = (byte)paramArrayOfint[b]; 
    } catch (Exception exception) {
      throw new g("Error generating Table write command.", exception);
    } 
    return arrayOfByte;
  }
  
  public int m() {
    return i() * 3;
  }
  
  public H c(String paramString, int paramInt) {
    H h = new H(this, paramInt);
    h.a(paramString);
    if (h.c()) {
      T.a().a(h);
      return h;
    } 
    return a(h);
  }
  
  public H e(String paramString) {
    H h = new H(this, 0);
    h.a(paramString);
    return a(h);
  }
  
  public H a(H paramH) {
    String str = paramH.b();
    try {
      boolean bool = paramH.c();
      if (bool)
        str = y(str); 
      int i = (str.indexOf("%") != -1) ? str.indexOf("%") : str.length();
      if (i == -1 && str.indexOf("\\") == -1 && str.indexOf("%") == -1) {
        paramH.b("");
        paramH.a(str.getBytes());
        return paramH;
      } 
      paramH.b(str.substring(i));
      if (paramH.e().indexOf("%2o") != -1) {
        paramH.a(2);
      } else if (paramH.e().indexOf("%o") != -1) {
        paramH.a(1);
      } 
      if (paramH.e().indexOf("%2c") != -1) {
        paramH.b(2);
      } else if (paramH.e().indexOf("%c") != -1) {
        paramH.b(1);
      } 
      str = str.substring(0, i);
      A(str);
      int j = x();
      j = bool ? -1 : j;
      byte[] arrayOfByte = d(str, j);
      paramH.a(arrayOfByte);
    } catch (NumberFormatException numberFormatException) {
      numberFormatException.printStackTrace();
      throw new g("Unable to parse SendCommand:" + str + "\nCould not convert to number " + numberFormatException.getMessage(), numberFormatException);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new g("Unable to parse SendCommand:" + str, exception);
    } 
    return paramH;
  }
  
  private String y(String paramString) {
    ArrayList arrayList = dl.a(paramString);
    aI aI = E();
    for (String str1 : arrayList) {
      String str2 = X.b(str1, "$", "");
      try {
        int i = (int)i.a(aI, str2);
        aM aM = aI.c(str2);
        if (aM.i().equals("array")) {
          D.a("$Var used in config file, Can not be an array. Line:\n" + paramString, null, null);
          continue;
        } 
        String str = Integer.toString(i, 16).toUpperCase();
        if (str.length() > 2)
          str = str.substring(str.length() - 2, str.length()); 
        while (str.length() < 2)
          str = "0" + str; 
        str = "x" + str;
        paramString = X.b(paramString, str1, str);
      } catch (g g) {
        if (this.d++ < 3)
          D.a("$Var name used in config file, but not found as a valid Parameter. Line:\n" + paramString, (Exception)g, null); 
      } catch (Exception exception) {
        if (this.d++ < 3)
          D.a("Error trying to use $Var name config file row. Line:\n" + paramString, exception, null); 
      } 
    } 
    return paramString;
  }
  
  private void e(H paramH) {
    aR.a().a(paramH);
    ArrayList arrayList = dl.a(paramH.b());
    for (String str : arrayList) {
      str = X.b(str, "$", "");
      try {
        aR.a().a(this.ah, str, paramH);
      } catch (a a) {
        D.d(str + " appears to be an invalid EcuParameter");
        Logger.getLogger(F.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
      } 
    } 
  }
  
  public static byte[] d(String paramString, int paramInt) {
    StringTokenizer stringTokenizer = new StringTokenizer(paramString, "\\");
    byte[] arrayOfByte = new byte[stringTokenizer.countTokens()];
    for (byte b = 0; stringTokenizer.hasMoreTokens(); b++) {
      String str = stringTokenizer.nextToken();
      if (!b && !paramString.startsWith("\\")) {
        arrayOfByte[b] = str.getBytes()[0];
      } else if (b == 1 && paramInt >= 0 && arrayOfByte.length > 2 && z(str) <= 16) {
        arrayOfByte[b] = (byte)paramInt;
      } else {
        arrayOfByte[b] = z(str);
      } 
    } 
    return arrayOfByte;
  }
  
  private static byte z(String paramString) {
    byte b = 10;
    if (paramString.startsWith("x")) {
      paramString = paramString.substring(1);
      b = 16;
    } else {
      b = 8;
    } 
    return (byte)Integer.parseInt(paramString, b);
  }
  
  private H[] a(String[] paramArrayOfString, int[] paramArrayOfint) {
    H[] arrayOfH = new H[paramArrayOfString.length];
    for (byte b = 0; b < arrayOfH.length; b++) {
      String str = paramArrayOfString[b];
      if (str != null && str.indexOf("%2i") != -1)
        str = X.b(str, "%2i", aG()[b]); 
      arrayOfH[b] = c(str, y(b));
    } 
    return arrayOfH;
  }
  
  private H[] a(H[] paramArrayOfH, String paramString, int paramInt) {
    if (paramString != null && paramString.indexOf("%2i") != -1) {
      if (aG() == null || (aG()).length < paramInt - 1 || aG()[paramInt] == null || aG()[paramInt].isEmpty())
        throw new g("2 byte pageIdentifier used, but no page identifier has been defined for previously for page"); 
      paramString = X.b(paramString, "%2i", aG()[paramInt]);
    } 
    if (paramInt > paramArrayOfH.length - 1)
      throw new g("Attempt to set command on page higher than defined page count."); 
    paramArrayOfH[paramInt] = c(paramString, y(paramInt));
    return paramArrayOfH;
  }
  
  public void c(String[] paramArrayOfString) {
    b(a(paramArrayOfString, this.m));
  }
  
  public void e(String paramString, int paramInt) {
    if (this.s == null)
      this.s = new H[this.g]; 
    a(this.s, paramString, paramInt);
  }
  
  public void d(String[] paramArrayOfString) {
    this.q = paramArrayOfString;
  }
  
  public void f(String paramString, int paramInt) {
    if (this.q == null)
      this.q = new String[this.g]; 
    this.q[paramInt] = paramString;
  }
  
  public H i(int paramInt) {
    return (aC() != null && (aC()).length > paramInt) ? aC()[paramInt] : null;
  }
  
  public void e(String[] paramArrayOfString) {
    if (paramArrayOfString != null) {
      c(a(paramArrayOfString, this.m));
    } else {
      c((H[])null);
    } 
  }
  
  public void g(String paramString, int paramInt) {
    if (this.t == null)
      this.t = new H[this.g]; 
    a(this.t, paramString, paramInt);
  }
  
  public H j(int paramInt) {
    return (aD() != null && (aD()).length > paramInt) ? aD()[paramInt] : null;
  }
  
  public void f(String[] paramArrayOfString) {
    d(a(paramArrayOfString, this.m));
  }
  
  public void h(String paramString, int paramInt) {
    if (this.u == null)
      this.u = new H[this.g]; 
    a(this.u, paramString, paramInt);
  }
  
  public boolean k(int paramInt) {
    return (aE() != null && (aE()).length > paramInt);
  }
  
  public H l(int paramInt) {
    return (aE() != null) ? aE()[paramInt] : null;
  }
  
  public void g(String[] paramArrayOfString) {
    e(a(paramArrayOfString, this.m));
  }
  
  public void i(String paramString, int paramInt) {
    if (this.w == null)
      this.w = new H[this.g]; 
    a(this.w, paramString, paramInt);
  }
  
  public byte[] m(int paramInt) {
    return (aF() == null || (aF()).length == 0) ? null : ((paramInt >= (aF()).length) ? aF()[0].d() : aF()[paramInt].d());
  }
  
  public void h(String[] paramArrayOfString) {
    f(a(paramArrayOfString, this.m));
  }
  
  public void j(String paramString, int paramInt) {
    if (this.v == null)
      this.v = new H[this.g]; 
    a(this.v, paramString, paramInt);
  }
  
  public void n(int paramInt) {
    this.I = paramInt;
  }
  
  public int n() {
    aI aI = E();
    if (this.J == -1 && aI != null) {
      int i = 0;
      Iterator<aH> iterator = aI.K().q();
      while (iterator.hasNext()) {
        aH aH = iterator.next();
        if (aH.a() + aH.l() > i)
          i = aH.a() + aH.l(); 
      } 
      this.J = i;
    } 
    return this.J;
  }
  
  public void o(int paramInt) {
    this.J = paramInt;
    if (D() != null && D() instanceof f) {
      f f = (f)D();
      f.d(paramInt);
    } 
  }
  
  public H o() {
    return this.x;
  }
  
  public void f(String paramString) {
    this.au = (paramString.contains("%2o") && paramString.contains("%2c"));
    this.x = c(paramString, this.n);
  }
  
  public void g(String paramString) {
    this.y = c(paramString, this.n);
  }
  
  public H p() {
    return this.z;
  }
  
  public void h(String paramString) {
    this.z = c(paramString, 0);
  }
  
  public H q() {
    return this.A;
  }
  
  public void i(String paramString) {
    this.A = c(paramString, 0);
  }
  
  public int r() {
    return (this.S > 0) ? this.S : aQ();
  }
  
  public void j(String paramString) {
    if (paramString != null)
      this.S = X.g(paramString); 
  }
  
  public void p(int paramInt) {
    this.S = paramInt;
  }
  
  public String s() {
    return this.T;
  }
  
  public void k(String paramString) {
    this.T = paramString;
  }
  
  public int t() {
    return this.L;
  }
  
  public void q(int paramInt) {
    this.L = paramInt;
  }
  
  public String u() {
    return this.ah;
  }
  
  public void l(String paramString) {
    this.ah = paramString;
  }
  
  public boolean v() {
    return this.W;
  }
  
  public void b(boolean paramBoolean) {
    this.W = paramBoolean;
  }
  
  public H w() {
    return (this.y != null) ? this.y : this.x;
  }
  
  private void f(H paramH) {
    this.y = paramH;
  }
  
  public int x() {
    return (this.X == -1) ? this.Y : this.X;
  }
  
  public void r(int paramInt) {
    if (this.aE)
      this.X = paramInt; 
    aP();
  }
  
  public String y() {
    return this.V;
  }
  
  public void m(String paramString) {
    this.V = paramString;
  }
  
  public int z() {
    return this.P;
  }
  
  public void s(int paramInt) {
    this.P = paramInt;
  }
  
  public int A() {
    return this.af;
  }
  
  public void t(int paramInt) {
    this.af = paramInt;
  }
  
  public int B() {
    return this.ag;
  }
  
  public void u(int paramInt) {
    this.ag = paramInt;
  }
  
  public cV C() {
    return this.ao;
  }
  
  public void a(cV paramcV) {
    this.ao = paramcV;
  }
  
  public cR D() {
    return this.ap;
  }
  
  public void a(cR paramcR) {
    this.ap = paramcR;
  }
  
  public aI E() {
    return (this.aq != null) ? h.a().a(this.aq) : null;
  }
  
  public void a(aI paramaI) {
    if (paramaI != null) {
      this.aq = paramaI.ac();
    } else {
      this.aq = null;
    } 
  }
  
  public boolean F() {
    return this.ab;
  }
  
  public void c(boolean paramBoolean) {
    this.ab = paramBoolean;
  }
  
  public boolean G() {
    return this.aa;
  }
  
  public void d(boolean paramBoolean) {
    this.aa = paramBoolean;
  }
  
  private int A(String paramString) {
    if (this.Y == -1 && paramString.length() > 2 && paramString.startsWith("w")) {
      StringTokenizer stringTokenizer = new StringTokenizer(paramString, "\\");
      int i = stringTokenizer.countTokens();
      for (byte b = 0; stringTokenizer.hasMoreTokens(); b++) {
        String str = stringTokenizer.nextToken();
        if (b == 1 && str.startsWith("x") && i > 2)
          this.Y = z(str); 
      } 
    } 
    return this.Y;
  }
  
  public boolean H() {
    return this.k;
  }
  
  public void e(boolean paramBoolean) {
    this.k = paramBoolean;
  }
  
  public void f(boolean paramBoolean) {
    D.d("FilterEchoBytes activated:" + paramBoolean);
    this.ae = paramBoolean;
  }
  
  public boolean I() {
    return this.ak;
  }
  
  public void g(boolean paramBoolean) {
    this.ak = paramBoolean;
  }
  
  public String J() {
    return this.D;
  }
  
  public void n(String paramString) {
    this.D = paramString;
  }
  
  public boolean K() {
    return this.l;
  }
  
  public void h(boolean paramBoolean) {
    this.l = paramBoolean;
  }
  
  public void a(List paramList) {
    if (paramList != null) {
      this.ar = new ArrayList();
      this.ar.addAll(paramList);
    } else {
      this.ar = null;
    } 
  }
  
  public List L() {
    return this.ar;
  }
  
  public int M() {
    return this.at;
  }
  
  public void v(int paramInt) {
    this.at = paramInt;
  }
  
  public boolean N() {
    return (this.au && this.av);
  }
  
  private void B(String paramString) {
    this.C = c(paramString, 0);
  }
  
  public H O() {
    return this.C;
  }
  
  private void C(String paramString) {
    this.E = c(paramString, 0);
  }
  
  public int P() {
    return this.Z;
  }
  
  public void w(int paramInt) {
    this.Z = paramInt;
  }
  
  private void D(String paramString) {
    this.F = c(paramString, 0);
  }
  
  private void E(String paramString) {
    this.G = c(paramString, 0);
  }
  
  public H Q() {
    return this.F;
  }
  
  public H R() {
    return this.G;
  }
  
  public dj S() {
    return this.aw;
  }
  
  public void a(dj paramdj) {
    this.aw = paramdj;
  }
  
  public boolean T() {
    return (this.ax != null && this.ax.a() != 0.0D);
  }
  
  public void b(dj paramdj) {
    this.ax = paramdj;
  }
  
  public boolean U() {
    return (this.ay != null && this.ay.a() != 0.0D);
  }
  
  public void c(dj paramdj) {
    this.ay = paramdj;
  }
  
  public boolean V() {
    return (this.az != null && this.az.a() != 0.0D);
  }
  
  public void d(dj paramdj) {
    this.az = paramdj;
  }
  
  public boolean W() {
    return this.aC;
  }
  
  public void i(boolean paramBoolean) {
    this.aC = paramBoolean;
    t(paramBoolean);
  }
  
  private void t(boolean paramBoolean) {
    for (dg dg : this.b)
      dg.a(paramBoolean); 
  }
  
  public void a(dg paramdg) {
    this.b.add(paramdg);
  }
  
  public void b(dg paramdg) {
    this.b.remove(paramdg);
  }
  
  public boolean X() {
    return (this.aA != null && this.aA.a() != 0.0D);
  }
  
  public void e(dj paramdj) {
    this.aA = paramdj;
  }
  
  public String Y() {
    return (this.aA instanceof bR) ? ((bR)this.aA).c() : null;
  }
  
  public H Z() {
    return this.H;
  }
  
  public void o(String paramString) {
    this.H = c(paramString, 0);
  }
  
  public String aa() {
    return this.aB;
  }
  
  public void p(String paramString) {
    this.aB = paramString;
  }
  
  public List ab() {
    return this.as;
  }
  
  public void b(List paramList) {
    this.K = -1;
    if (paramList != null) {
      int i = 0;
      for (w w : paramList)
        i += w.c(); 
      this.K = i;
    } 
    this.as = paramList;
  }
  
  public boolean ac() {
    return (X() && this.as != null && ad() > 0 && !this.aD);
  }
  
  public int ad() {
    return this.K;
  }
  
  public boolean x(int paramInt) {
    return (this.r != null && ((this.r.length > paramInt && this.r[paramInt].d() != null && (this.r[paramInt].d()).length > 0) || this.r.length == 1));
  }
  
  public void j(boolean paramBoolean) {
    this.aD = paramBoolean;
  }
  
  public boolean ae() {
    return this.an;
  }
  
  public void k(boolean paramBoolean) {
    this.an = paramBoolean;
  }
  
  public void l(boolean paramBoolean) {
    this.aE = paramBoolean;
  }
  
  public int y(int paramInt) {
    return (paramInt < 0) ? 0 : ((this.m != null && this.m.length > paramInt) ? this.m[paramInt] : 0);
  }
  
  public void b(int[] paramArrayOfint) {
    this.m = paramArrayOfint;
  }
  
  public int af() {
    return this.n;
  }
  
  public void z(int paramInt) {
    this.n = paramInt;
  }
  
  public String ag() {
    return this.aM;
  }
  
  public void q(String paramString) {
    this.aM = paramString;
  }
  
  public void f(dj paramdj) {
    this.aN = paramdj;
  }
  
  public String ah() {
    return this.aO;
  }
  
  public void r(String paramString) {
    this.aO = paramString;
  }
  
  public int ai() {
    return (int)((this.aP == null) ? 0.0D : this.aP.a());
  }
  
  public void g(dj paramdj) {
    this.aP = paramdj;
  }
  
  public boolean aj() {
    return this.aF;
  }
  
  public void m(boolean paramBoolean) {
    this.aF = paramBoolean;
  }
  
  public int ak() {
    return this.M;
  }
  
  public void A(int paramInt) {
    this.M = paramInt;
  }
  
  public boolean B(int paramInt) {
    return (this.e.equals("XCP") || (this.s.length > paramInt && this.s[paramInt].f() > 0 && this.s[paramInt].g() > 0));
  }
  
  public String al() {
    return this.e;
  }
  
  public void s(String paramString) {
    if (paramString.equals("basicRequestReply") || paramString.equals("XCP")) {
      this.e = paramString;
    } else {
      throw new g("Unsupported Protocol " + paramString + ", supported values: \"" + "basicRequestReply" + "\", " + "XCP");
    } 
  }
  
  public int am() {
    return this.e.equals("basicRequestReply") ? 6 : 0;
  }
  
  public boolean an() {
    return this.al;
  }
  
  public boolean ao() {
    return this.am;
  }
  
  public boolean ap() {
    return this.ad;
  }
  
  public void n(boolean paramBoolean) {
    this.ad = paramBoolean;
  }
  
  public boolean aq() {
    return this.aG;
  }
  
  public boolean ar() {
    return this.aH;
  }
  
  public void o(boolean paramBoolean) {
    this.aH = paramBoolean;
  }
  
  public int as() {
    return this.ac;
  }
  
  public void C(int paramInt) {
    if (paramInt == 0 || paramInt == 1 || paramInt == 5 || paramInt == 10 || paramInt == 15 || paramInt == 20 || paramInt == 25 || paramInt == 50 || paramInt == 100 || paramInt == 250 || paramInt == 500 || paramInt == 1000) {
      this.ac = paramInt;
    } else {
      D.b("Invalid Default Runtime Read Per Second. Valid values: 0, 1, 5, 10, 15, 20, 25, 50, 100, 250, 500, 1000");
    } 
  }
  
  public boolean at() {
    return this.aJ;
  }
  
  public void p(boolean paramBoolean) {
    this.aJ = paramBoolean;
  }
  
  public boolean au() {
    return this.aL;
  }
  
  public int av() {
    return this.N;
  }
  
  public void D(int paramInt) {
    this.N = paramInt;
  }
  
  public int aw() {
    return this.O;
  }
  
  public void E(int paramInt) {
    boolean bool = (this.O != paramInt) ? true : false;
    this.O = paramInt;
    if (bool) {
      this.L = F(paramInt);
      this.P = 0;
    } 
  }
  
  public int F(int paramInt) {
    byte b = (this.O > 0) ? (750 / this.O) : 750;
    b = (b < 120) ? b : 120;
    if (!this.aH) {
      b = (b > 6) ? b : 6;
      b = (this.S < 19200) ? 20 : b;
    } 
    return b;
  }
  
  public String ax() {
    return this.U;
  }
  
  public void t(String paramString) {
    this.U = paramString;
  }
  
  public int G(int paramInt) {
    return (this.ai == null || paramInt > this.ai.length || paramInt < 0) ? Integer.MAX_VALUE : this.ai[paramInt];
  }
  
  public void H(int paramInt) {
    this.aj = paramInt;
  }
  
  public int ay() {
    return this.aj;
  }
  
  public void I(int paramInt) {
    if (this.g == 0)
      D.a("nPages not defined, blockingFactor can not be set before nPages"); 
    this.ai = new int[this.g];
    for (byte b = 0; b < this.ai.length; b++)
      this.ai[b] = paramInt; 
  }
  
  public F az() {
    F f = new F();
    f.d(f());
    f.a(this.g);
    f.b(h());
    f.c(this.i);
    f.a(this.j);
    f.d(this.o);
    f.a(this.p);
    f.d(aG());
    f.n(this.I);
    f.o(this.J);
    f.q(this.L);
    f.D(this.N);
    f.E(this.O);
    f.p(this.S);
    f.k(this.T);
    f.t(this.U);
    f.c(this.ai);
    f.r(this.X);
    f.w(this.Z);
    f.c(this.x);
    f.f(this.y);
    f.d(this.z);
    f.b(this.A);
    f.a(I.a(aA()));
    f.b(I.a(aB()));
    f.c(I.a(aC()));
    f.d(I.a(aD()));
    f.f(I.a(aF()));
    f.aq = this.aq;
    return f;
  }
  
  private void aP() {
    Field[] arrayOfField = getClass().getDeclaredFields();
    AccessibleObject.setAccessible((AccessibleObject[])arrayOfField, true);
    for (byte b = 0; b < arrayOfField.length; b++) {
      Field field = arrayOfField[b];
      try {
        if (H[].class.isInstance(field.get(this))) {
          H[] arrayOfH = (H[])field.get(this);
          for (byte b1 = 0; b1 < arrayOfH.length; b1++) {
            if (arrayOfH[b1] != null)
              try {
                arrayOfH[b1] = a(arrayOfH[b1]);
              } catch (g g) {
                Logger.getLogger(F.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
              }  
          } 
        } else if (H.class.isInstance(field.get(this))) {
          try {
            H h = (H)field.get(this);
            if (h != null)
              h = a(h); 
          } catch (Exception exception) {}
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        Logger.getLogger(F.class.getName()).log(Level.SEVERE, (String)null, illegalArgumentException);
      } catch (IllegalAccessException illegalAccessException) {
        Logger.getLogger(F.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
      } 
    } 
  }
  
  protected void c(int[] paramArrayOfint) {
    this.ai = paramArrayOfint;
  }
  
  protected void b(H paramH) {
    this.A = paramH;
  }
  
  protected void c(H paramH) {
    this.x = paramH;
  }
  
  protected void d(H paramH) {
    this.z = paramH;
  }
  
  protected H[] aA() {
    return this.r;
  }
  
  protected void a(H[] paramArrayOfH) {
    this.r = paramArrayOfH;
  }
  
  protected H[] aB() {
    return this.s;
  }
  
  protected void b(H[] paramArrayOfH) {
    this.s = paramArrayOfH;
  }
  
  protected H[] aC() {
    return this.t;
  }
  
  protected void c(H[] paramArrayOfH) {
    this.t = paramArrayOfH;
  }
  
  protected H[] aD() {
    return this.u;
  }
  
  protected H[] aE() {
    return this.w;
  }
  
  protected void d(H[] paramArrayOfH) {
    this.u = paramArrayOfH;
  }
  
  protected void e(H[] paramArrayOfH) {
    this.w = paramArrayOfH;
  }
  
  protected H[] aF() {
    return this.v;
  }
  
  protected void f(H[] paramArrayOfH) {
    this.v = paramArrayOfH;
  }
  
  protected String[] aG() {
    return this.q;
  }
  
  protected int[] aH() {
    return this.ai;
  }
  
  private void J(int paramInt) {
    this.R = paramInt;
  }
  
  private int aQ() {
    return this.R;
  }
  
  public boolean aI() {
    return this.aK;
  }
  
  public void q(boolean paramBoolean) {
    this.aK = paramBoolean;
  }
  
  public void r(boolean paramBoolean) {
    this.aL = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/F.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */