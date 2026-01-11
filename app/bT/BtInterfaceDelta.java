package bT;

import G.R;
import G.SerializableImpl;
import G.ManagerUsingArrayList;
import V.ExceptionInVPackage;
import bH.TostringInBoPackage;
import bN.BnInterfaceKilo;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bO.TostringInBoPackage;
import bO.ExceptionInBoPackage;
import bO.TostringInBnPackage;
import bS.ExceptionInVPackage;
import bS.BsInterfaceDelta;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtInterfaceDelta implements ExceptionInVPackage {
  public int ExceptionInVPackage() {
    return 225;
  }
  
  public void ExceptionInVPackage(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.ExceptionInVPackage() != ExceptionInVPackage())
      throw new ExceptionInBsPackage("PID:DAQ_WRITE_DAQ Wrong handler! this handler is for 0x" + Integer.toHexString(ExceptionInVPackage()).toUpperCase()); 
    BnInterfaceKilo BnInterfaceKilo = paramo.BsInterfaceDelta();
    R r = paramo.f();
    byte[] arrayOfByte = paramt.TostringInBoPackage();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:DAQ_WRITE_DAQ valid packet data not found."); 
    if (arrayOfByte.length != 7)
      throw new ExceptionInBsPackage("PID:DAQ_WRITE_DAQ invalid packet data length, expected 7 bytes, found: " + (arrayOfByte.length + 1)); 
    try {
      TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.ExceptionInVPackage().b();
      BsInterfaceDelta BsInterfaceDelta = paramo.BnInterfaceKilo();
      int i = BsInterfaceDelta.TostringInBoPackage();
      int ExceptionInBoPackage = BsInterfaceDelta.BsInterfaceDelta();
      int m = BsInterfaceDelta.e();
      byte b = arrayOfByte[0];
      int n = TostringInBoPackage.ExceptionInVPackage(arrayOfByte[1]);
      long l1 = TostringInBoPackage.b(arrayOfByte, 3, 4, BnInterfaceKilo.g(), false);
      TostringInBoPackage TostringInBoPackage = BsInterfaceDelta.b(i);
      if (TostringInBoPackage == null || i > BsInterfaceDelta.b() || ExceptionInBoPackage > TostringInBoPackage.ExceptionInVPackage() || m > TostringInBoPackage.TostringInBoPackage()) {
        TostringInBnPackage.ExceptionInVPackage(254);
        byte[] arrayOfByte2 = new byte[1];
        arrayOfByte2[0] = 34;
        TostringInBnPackage.b(arrayOfByte2);
        paramo.ExceptionInVPackage(paramt);
        return;
      } 
      TostringInBnPackage.ExceptionInVPackage(255);
      byte[] arrayOfByte1 = new byte[0];
      TostringInBnPackage l2 = BsInterfaceDelta.ExceptionInVPackage(i, ExceptionInBoPackage, m);
      int i1 = ExceptionInVPackage(r, l1);
      l2.ExceptionInVPackage(i1);
      l2.ExceptionInVPackage(n);
      long l3 = System.currentTimeMillis();
      List list = ExceptionInVPackage(r, i1, n);
      ManagerUsingArrayList.ExceptionInVPackage().BsInterfaceDelta();
      for (SerializableImpl SerializableImpl : list) {
        try {
          ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(r.TostringInBoPackage(), SerializableImpl.aL(), TostringInBoPackage.n());
        } catch (ExceptionInVPackage a1) {
          Logger.getLogger(D.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
        } 
      } 
      ManagerUsingArrayList.ExceptionInVPackage().e();
      if (m < TostringInBoPackage.TostringInBoPackage() - 1) {
        BsInterfaceDelta.f(m + 1);
      } else {
        BsInterfaceDelta.BsInterfaceDelta(-1);
        BsInterfaceDelta.e(-1);
        BsInterfaceDelta.f(-1);
      } 
      TostringInBnPackage.b(arrayOfByte1);
      paramo.ExceptionInVPackage((BnInterfaceTango)TostringInBnPackage);
      return;
    } catch (ExceptionInBoPackage|BnInterfaceOscar ExceptionInBoPackage) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInBoPackage);
      TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.ExceptionInVPackage().b();
      TostringInBnPackage.ExceptionInVPackage(254);
      byte[] arrayOfByte1 = new byte[1];
      arrayOfByte1[0] = 34;
      TostringInBnPackage.b(arrayOfByte1);
      try {
        paramo.ExceptionInVPackage((BnInterfaceTango)TostringInBnPackage);
      } catch (BnInterfaceOscar o1) {
        bH.D.ExceptionInVPackage("Unable to send response packet.");
        Logger.getLogger(TostringInBnPackage.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      } 
      return;
    } 
  }
  
  private List ExceptionInVPackage(R paramR, int paramInt1, int paramInt2) {
    ArrayList<SerializableImpl> arrayList = new ArrayList();
    Iterator<SerializableImpl> iterator = paramR.q();
    while (iterator.hasNext()) {
      SerializableImpl SerializableImpl = iterator.next();
      if (SerializableImpl.ExceptionInVPackage() >= paramInt1 && SerializableImpl.ExceptionInVPackage() < paramInt1 + paramInt2)
        arrayList.add(SerializableImpl); 
    } 
    return arrayList;
  }
  
  private int ExceptionInVPackage(R paramR, long paramLong) {
    if (paramLong < paramR.O().n())
      return (int)paramLong; 
    SerializableImpl SerializableImpl = b(paramR, paramLong);
    if (SerializableImpl == null) {
      bH.D.ExceptionInVPackage("Can not find ExceptionInVPackage channel at address 0x" + Long.toHexString(paramLong).toUpperCase());
      return (int)paramLong;
    } 
    return SerializableImpl.ExceptionInVPackage();
  }
  
  private SerializableImpl b(R paramR, long paramLong) {
    Iterator<SerializableImpl> iterator = paramR.q();
    while (iterator.hasNext()) {
      SerializableImpl SerializableImpl = iterator.next();
      if (SerializableImpl.x() == paramLong)
        return SerializableImpl; 
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */