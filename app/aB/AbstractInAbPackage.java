package aB;

import A.AInterfaceEcho;
import A.IO;
import A.AInterfaceYankee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public AbstractInAbPackagebstract class AbstractInAbPackage implements IO {
  ArrayList a = new ArrayList();
  
  ArrayList b = new ArrayList();
  
  public void a(AInterfaceYankee paramy) {
    if (!this.b.contains(paramy))
      this.b.add(paramy); 
  }
  
  public void b(AInterfaceYankee paramy) {
    this.b.remove(paramy);
  }
  
  protected void a(List paramList) {
    for (AInterfaceYankee AInterfaceYankee : this.b)
      AInterfaceYankee.a(paramList); 
  }
  
  public void a(AInterfaceEcho parame) {
    this.a.add(parame);
  }
  
  public void b(AInterfaceEcho parame) {
    this.a.remove(parame);
  }
  
  protected void a() {
    Iterator<AInterfaceEcho> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((AInterfaceEcho)iterator.next()).a(); 
  }
  
  protected void b() {
    Iterator<AInterfaceEcho> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((AInterfaceEcho)iterator.next()).b(); 
  }
  
  protected void c() {
    Iterator<AInterfaceEcho> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((AInterfaceEcho)iterator.next()).c(); 
  }
  
  protected void d() {
    Iterator<AInterfaceEcho> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((AInterfaceEcho)iterator.next()).d(); 
  }
  
  protected void AInterfaceEcho() {
    Iterator<AInterfaceEcho> iterator = this.a.iterator();
    while (iterator.hasNext())
      ((AInterfaceEcho)iterator.next()).AInterfaceEcho(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aB/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */