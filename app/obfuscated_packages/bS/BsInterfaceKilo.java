package bS;

import bT.BtInterfaceAlpha;
import bT.BtInterfaceBravo;
import bT.BtInterfaceCharlie;
import bT.BtInterfaceDelta;
import bT.BtComponentAlpha;
import bT.BtComponentBravo;
import bT.BtComponentCharlie;
import bT.BtComponentDelta;
import bT.BtInterfaceEcho;
import bT.BtInterfaceFoxtrot;
import bT.BtInterfaceGolf;
import bT.BtInterfaceHotel;
import bT.BtInterfaceIndia;
import bT.BtInterfaceJuliet;
import bT.BtInterfaceLima;
import bT.BtInterfaceMike;
import bT.BtInterfaceNovember;
import bT.BtInterfaceOscar;
import bT.NetworkInBtPackage;
import bT.BtInterfaceQuebec;
import bT.BtInterfaceRomeo;
import bT.BtInterfaceSierra;
import bT.BtInterfaceTango;
import bT.BtInterfaceUniform;
import bT.BtInterfaceVictor;
import bT.BtInterfaceWhiskey;
import bT.BtInterfaceXray;
import bT.BtInterfaceYankee;
import bT.BtInterfaceZulu;
import java.util.HashMap;
import java.util.Map;

public class BsInterfaceKilo {
  private final Map BtComponentAlpha = new HashMap<>();
  
  protected BsInterfaceKilo() {
    BtComponentAlpha();
  }
  
  private void BtComponentAlpha() {
    this.BtComponentAlpha.put(Integer.valueOf(255), new BtComponentCharlie());
    this.BtComponentAlpha.put(Integer.valueOf(254), new BtComponentDelta());
    this.BtComponentAlpha.put(Integer.valueOf(251), new BtInterfaceJuliet());
    this.BtComponentAlpha.put(Integer.valueOf(240), new BtInterfaceEcho());
    this.BtComponentAlpha.put(Integer.valueOf(239), new BtInterfaceGolf());
    this.BtComponentAlpha.put(Integer.valueOf(237), new BtInterfaceHotel());
    this.BtComponentAlpha.put(Integer.valueOf(238), new BtInterfaceFoxtrot());
    this.BtComponentAlpha.put(Integer.valueOf(250), new NetworkInBtPackage());
    this.BtComponentAlpha.put(Integer.valueOf(253), new BtInterfaceQuebec());
    this.BtComponentAlpha.put(Integer.valueOf(246), new BtInterfaceUniform());
    this.BtComponentAlpha.put(Integer.valueOf(252), new BtInterfaceZulu());
    this.BtComponentAlpha.put(Integer.valueOf(245), new BtInterfaceAlpha());
    this.BtComponentAlpha.put(Integer.valueOf(244), new BtInterfaceBravo());
    this.BtComponentAlpha.put(Integer.valueOf(243), new BtComponentAlpha());
    this.BtComponentAlpha.put(Integer.valueOf(235), new BtInterfaceRomeo());
    this.BtComponentAlpha.put(Integer.valueOf(234), new BtInterfaceIndia());
    this.BtComponentAlpha.put(Integer.valueOf(230), new BtInterfaceWhiskey());
    this.BtComponentAlpha.put(Integer.valueOf(249), new BtInterfaceVictor());
    this.BtComponentAlpha.put(Integer.valueOf(218), new BtInterfaceNovember());
    this.BtComponentAlpha.put(Integer.valueOf(217), new BtInterfaceOscar());
    this.BtComponentAlpha.put(Integer.valueOf(226), new BtInterfaceTango());
    this.BtComponentAlpha.put(Integer.valueOf(215), new bT.k());
    this.BtComponentAlpha.put(Integer.valueOf(216), new BtInterfaceLima());
    this.BtComponentAlpha.put(Integer.valueOf(225), new BtInterfaceDelta());
    this.BtComponentAlpha.put(Integer.valueOf(224), new BtInterfaceSierra());
    this.BtComponentAlpha.put(Integer.valueOf(223), new BtInterfaceMike());
    this.BtComponentAlpha.put(Integer.valueOf(221), new BtInterfaceYankee());
    this.BtComponentAlpha.put(Integer.valueOf(222), new BtInterfaceXray());
    this.BtComponentAlpha.put(Integer.valueOf(227), new BtComponentBravo());
    this.BtComponentAlpha.put(Integer.valueOf(241), new BtInterfaceCharlie());
  }
  
  public BtComponentAlpha BtComponentAlpha(int paramInt) {
    return (BtComponentAlpha)this.BtComponentAlpha.get(Integer.valueOf(paramInt));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bS/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */