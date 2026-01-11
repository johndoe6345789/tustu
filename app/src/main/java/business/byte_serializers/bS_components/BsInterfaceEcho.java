package business.byte_serializers.bS_components;

import G.R;
import G.GInterfaceAg;
import G.GInterfaceAb;
import G.AeInterfaceMikeTostring;
import G.g;
import bH.c;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BsInterfaceEcho implements GInterfaceAg, GInterfaceAb, g {
  R a;
  
  Map b = new HashMap<>();
  
  long c = 0L;
  
  final Object d = new Object();
  
  BnInterfaceOscar e;
  
  g f = null;
  
  boolean g = false;
  
  public BsInterfaceEcho(BnInterfaceOscar paramo, R paramR) {
    this.e = paramo;
    this.a = paramR;
    paramR.C().a(this);
    paramR.C().a(this);
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    f f = a(paramInt1);
    f.a(f, paramInt2, paramArrayOfint.length);
    this.c = System.currentTimeMillis();
    c();
    synchronized (this.d) {
      this.d.notify();
    } 
  }
  
  private f a(int paramInt) {
    f f = (f)this.b.get(Integer.valueOf(paramInt));
    if (f == null) {
      f = new f(this);
      f.a(paramInt);
      this.b.put(Integer.valueOf(paramInt), f);
    } 
    return f;
  }
  
  private void b() {
    if (this.g)
      return; 
    ArrayList arrayList = new ArrayList();
    synchronized (this.b) {
      arrayList.addAll(this.b.values());
      this.b.clear();
    } 
    for (f f : arrayList)
      a(f); 
  }
  
  private void a(f paramf) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(252);
    byte[] arrayOfByte = new byte[7];
    arrayOfByte[0] = -32;
    arrayOfByte[1] = (byte)this.a.O().x();
    arrayOfByte[2] = (byte)paramf.a();
    arrayOfByte = c.a(arrayOfByte, paramf.b(), 3, 2, this.e.d().g());
    arrayOfByte = c.a(arrayOfByte, paramf.c(), 5, 2, this.e.d().g());
    TostringInBnPackage.b(arrayOfByte);
    this.e.e().a((BnInterfaceTango)TostringInBnPackage);
  }
  
  public void a() {
    this.g = true;
    if (this.f != null)
      this.f.a(); 
  }
  
  private void c() {
    if (this.f == null || !this.f.isAlive() || this.f.b) {
      this.f = new g(this);
      this.f.start();
    } 
  }
  
  public boolean a(String paramString, AeInterfaceMikeTostring parambT) {
    try {
      a(true);
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
    } 
    return true;
  }
  
  public void a(String paramString) {
    try {
      a(false);
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
    } 
  }
  
  private void a(boolean paramBoolean) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(252);
    byte[] arrayOfByte = new byte[3];
    arrayOfByte[0] = -31;
    arrayOfByte[1] = (byte)(paramBoolean ? 1 : 0);
    TostringInBnPackage.b(arrayOfByte);
    this.e.e().a((BnInterfaceTango)TostringInBnPackage);
  }
  
  public void a(String paramString, int paramInt) {}
  
  public void b(String paramString, int paramInt) {}
  
  public void a(String paramString, boolean paramBoolean) {
    if (paramBoolean) {
      TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
      TostringInBnPackage.a(252);
      byte[] arrayOfByte = new byte[3];
      arrayOfByte[0] = -30;
      arrayOfByte[1] = -1;
      TostringInBnPackage.b(arrayOfByte);
      try {
        this.e.e().a((BnInterfaceTango)TostringInBnPackage);
      } catch (BnInterfaceOscar o1) {
        Logger.getLogger(e.class.getName()).log(Level.SEVERE, "Failed to send client all pages burned message.", (Throwable)o1);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bS/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */