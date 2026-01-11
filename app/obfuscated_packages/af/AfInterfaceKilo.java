package af;

import ad.AdInterfaceAlpha;
import ad.AdInterfaceBravo;
import ad.ExceptionInAdPackage;
import ae.AeInterfaceDelta;
import ae.AeInterfaceMike;
import ae.AeInterfaceOscar;
import ae.IOInAePackage;
import ae.AeInterfaceSierra;
import ae.AeInterfaceUniform;
import ae.ExceptionExtensionInAePackage;
import bH.D;
import bH.ExceptionInAdPackage;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AfInterfaceKilo implements AeInterfaceSierra, AdInterfaceAlpha {
  List AeInterfaceDelta = new ArrayList();
  
  n e;
  
  private boolean f = false;
  
  public AfInterfaceKilo(n paramn) {
    this.e = paramn;
  }
  
  public List AdInterfaceAlpha(ae.k paramk) {
    return this.AeInterfaceDelta;
  }
  
  public List AdInterfaceBravo(ae.k paramk) {
    return this.AeInterfaceDelta;
  }
  
  public void AdInterfaceAlpha(String paramString, Object paramObject) {}
  
  public AeInterfaceDelta AdInterfaceAlpha(ae.k paramk, IOInAePackage paramp, AeInterfaceUniform paramu) {
    null = new AeInterfaceDelta();
    int i = AdInterfaceAlpha(paramp);
    if (i == 0) {
      null.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceBravo);
      null.AdInterfaceAlpha("No MegaSquirt Found.");
      return null;
    } 
    if (!AdInterfaceAlpha(i)) {
      null.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceBravo);
      null.AdInterfaceAlpha("Warning!! Wrong ECU TYPE found. MS2 expected, found MS3");
      return null;
    } 
    if ((i & AeInterfaceOscar.z) > 0) {
      paramu.AdInterfaceAlpha("The firmware on your ECU does not support jumperless reflash.");
      if (!paramu.AdInterfaceBravo("Turn off Megasquirt/Microsquirt.")) {
        null.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceBravo);
        null.AdInterfaceAlpha("Cancelled by user.");
        return null;
      } 
      if (!paramu.AdInterfaceBravo("Install boot jumper shunt onto B/LD on the CPU card, or ground the bootload wire.")) {
        null.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceBravo);
        null.AdInterfaceAlpha("Cancelled by user.");
        return null;
      } 
      if (!paramu.AdInterfaceBravo("Turn on Megasquirt/Microsquirt.")) {
        null.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceBravo);
        null.AdInterfaceAlpha("Cancelled by user.");
        return null;
      } 
      i = 0;
      for (byte AdInterfaceBravo = 0; AdInterfaceBravo < 2 && i == 0; AdInterfaceBravo++) {
        j.AdInterfaceAlpha(paramp);
        i = AdInterfaceAlpha(paramp);
        if (i == 0 && !paramu.AdInterfaceBravo("ECU does not appear to be on, Turn on Megasquirt/Microsquirt.")) {
          null.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceBravo);
          null.AdInterfaceAlpha("Cancelled by user.");
          return null;
        } 
      } 
      if ((i & AeInterfaceOscar.w) != AeInterfaceOscar.w && (i & AeInterfaceOscar.x) != AeInterfaceOscar.x) {
        null.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceBravo);
        null.AdInterfaceAlpha("ECU not found, cannot continue.");
        return null;
      } 
    } 
    if (!j.AdInterfaceBravo(paramp)) {
      if ((i & AeInterfaceOscar.z) != 0) {
        try {
          null = AdInterfaceBravo(paramp, paramu);
        } catch (ExceptionExtensionInAePackage ExceptionExtensionInAePackage) {
          null.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceBravo);
          null.AdInterfaceAlpha("Protocol Exception, should be no Envelope.");
          return null;
        } 
        if (null.AdInterfaceAlpha() == AeInterfaceDelta.AdInterfaceBravo)
          return null; 
      } else {
        try {
          boolean bool = this.e.j();
          this.e.i();
          null = j.AdInterfaceAlpha(paramp, j.AdInterfaceAlpha(paramp, this.e));
        } catch (ExceptionExtensionInAePackage ExceptionExtensionInAePackage) {
          null.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceBravo);
          null.AdInterfaceAlpha("Protocol Exception, likely AdInterfaceAlpha bug in the firmware loader.");
          return null;
        } 
      } 
    } else if ((i & 0x200) == 0) {
      try {
        null = AdInterfaceBravo(paramp, paramu);
        if (null.AdInterfaceAlpha() == AeInterfaceDelta.AdInterfaceBravo)
          return null; 
        while (true) {
          if (!paramu.AdInterfaceBravo("Turn off Megasquirt/Microsquirt.")) {
            null.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceBravo);
            null.AdInterfaceAlpha("Cancelled by user.");
            return null;
          } 
          if (!paramu.AdInterfaceBravo("Please remove the boot jumper or disconnect the boot wire from ground.")) {
            null.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceBravo);
            null.AdInterfaceAlpha("Cancelled by user.");
            return null;
          } 
          if (!paramu.AdInterfaceBravo("Turn on Megasquirt/Microsquirt.")) {
            null.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceBravo);
            null.AdInterfaceAlpha("Cancelled by user.");
            return null;
          } 
          if (!j.AdInterfaceBravo(paramp)) {
            D.ExceptionInAdPackage("Bootstrap found ok!");
            null = j.AdInterfaceAlpha(paramp, false);
            if (null.AdInterfaceAlpha() == AeInterfaceDelta.AdInterfaceBravo)
              return null; 
            break;
          } 
        } 
      } catch (ExceptionExtensionInAePackage ExceptionExtensionInAePackage) {
        ExceptionExtensionInAePackage.printStackTrace();
        null.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceBravo);
        null.AdInterfaceAlpha("Protocol Exception, should be no Envelope.");
        return null;
      } 
    } 
    return j.AdInterfaceAlpha(paramp);
  }
  
  public AeInterfaceDelta AdInterfaceAlpha(IOInAePackage paramp, AeInterfaceUniform paramu) {
    AeInterfaceDelta AeInterfaceDelta = new AeInterfaceDelta();
    AeInterfaceDelta.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceAlpha);
    j.e(paramp);
    if (this.f) {
      if (!paramu.AdInterfaceBravo("Turn off Megasquirt/Microsquirt.")) {
        AeInterfaceDelta.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceBravo);
        AeInterfaceDelta.AdInterfaceAlpha("Cancelled by user.");
        return AeInterfaceDelta;
      } 
      if (!paramu.AdInterfaceBravo("Please remove the boot jumper or disconnect the boot wire from ground if fitted.")) {
        AeInterfaceDelta.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceBravo);
        AeInterfaceDelta.AdInterfaceAlpha("Cancelled by user.");
        return AeInterfaceDelta;
      } 
      if (!paramu.AdInterfaceBravo("Turn on Megasquirt/Microsquirt.")) {
        AeInterfaceDelta.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceBravo);
        AeInterfaceDelta.AdInterfaceAlpha("Cancelled by user.");
        return AeInterfaceDelta;
      } 
    } 
    return AeInterfaceDelta;
  }
  
  public int AdInterfaceAlpha(IOInAePackage paramp) {
    int i = 0;
    i = ExceptionInAdPackage(paramp);
    if (i == 0 || i == 4) {
      int j = AeInterfaceDelta(paramp);
      AeInterfaceMike AeInterfaceMike = AeInterfaceOscar.AdInterfaceAlpha(j);
      i = AeInterfaceMike.AdInterfaceBravo();
    } else {
      i |= AdInterfaceBravo(paramp);
    } 
    return i;
  }
  
  public int AdInterfaceBravo(IOInAePackage paramp) {
    int i = 0;
    byte[] arrayOfByte1 = { 77 };
    boolean bool = this.e.j();
    this.e.h();
    byte[] arrayOfByte2 = null;
    try {
      arrayOfByte2 = paramp.AdInterfaceAlpha(arrayOfByte1, 2);
    } catch (ExceptionExtensionInAePackage ExceptionExtensionInAePackage) {
      D.ExceptionInAdPackage("protocol error for M command: " + ExceptionExtensionInAePackage.getLocalizedMessage());
      return 0;
    } finally {
      if (bool)
        this.e.i(); 
    } 
    if (arrayOfByte2 == null || arrayOfByte2.length < 2) {
      D.ExceptionInAdPackage("No Response to M command");
      return 0;
    } 
    int j = arrayOfByte2[0] + 256 * arrayOfByte2[1];
    i |= j;
    D.ExceptionInAdPackage("M command returned: " + Integer.toHexString(j));
    return i;
  }
  
  public int ExceptionInAdPackage(IOInAePackage paramp) {
    byte[] arrayOfByte1 = { 81 };
    byte[] arrayOfByte2 = null;
    try {
      arrayOfByte2 = paramp.AdInterfaceAlpha(arrayOfByte1, 20, 600);
    } catch (ExceptionExtensionInAePackage ExceptionExtensionInAePackage) {
      Logger.getLogger(k.class.getName()).log(Level.SEVERE, "Protocol Error querying signature", (Throwable)ExceptionExtensionInAePackage);
    } 
    if (arrayOfByte2 == null || arrayOfByte2.length == 0)
      return 0; 
    if (arrayOfByte2[0] == 77 && arrayOfByte2[1] == 83 && arrayOfByte2[2] == 51)
      return 2; 
    if (arrayOfByte2[0] == 77 && arrayOfByte2[1] == 83 && arrayOfByte2[2] == 50 && arrayOfByte2[3] == 69 && arrayOfByte2[4] == 120)
      return 1; 
    if (arrayOfByte2[0] == 84 && arrayOfByte2[1] == 114 && arrayOfByte2[2] == 97 && arrayOfByte2[3] == 110 && arrayOfByte2[4] == 115)
      return 1; 
    if (arrayOfByte2[0] == 77 && arrayOfByte2[1] == 83 && arrayOfByte2[2] == 73 && arrayOfByte2[3] == 73)
      return 9; 
    if (arrayOfByte2[0] == 71 && arrayOfByte2[1] == 80 && arrayOfByte2[2] == 73 && arrayOfByte2[3] == 79)
      return 9; 
    if (arrayOfByte2[0] == 77 && arrayOfByte2[1] == 83 && arrayOfByte2[2] == 104 && arrayOfByte2[3] == 105 && arrayOfByte2[4] == 102)
      return 9; 
    if (arrayOfByte2[0] == 81)
      return 0; 
    if ((arrayOfByte2[0] & 0xF0) == 224 && (arrayOfByte2[1] & 0xF0) == 0 && arrayOfByte2[2] == 62)
      return 4; 
    D.ExceptionInAdPackage(" ..Garbled reply.. ");
    return 0;
  }
  
  private int AeInterfaceDelta(IOInAePackage paramp) {
    byte[] arrayOfByte = new byte[1];
    arrayOfByte[0] = -73;
    try {
      byte[] arrayOfByte1 = paramp.AdInterfaceAlpha(arrayOfByte, 6, 200);
      return (arrayOfByte1 == null || arrayOfByte1.length == 0 || arrayOfByte1[0] != -36) ? -1 : ExceptionInAdPackage.AdInterfaceAlpha(arrayOfByte1, 1, 2, true, false);
    } catch (ExceptionExtensionInAePackage ExceptionExtensionInAePackage) {
      Logger.getLogger(k.class.getName()).log(Level.SEVERE, "Protocol Error probing for monitor", (Throwable)ExceptionExtensionInAePackage);
      return -1;
    } 
  }
  
  protected AeInterfaceDelta AdInterfaceBravo(IOInAePackage paramp, AeInterfaceUniform paramu) {
    null = new AeInterfaceDelta();
    paramu.AdInterfaceAlpha("Loading bootstrap");
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("S0100000626F6F7473747261702E73313906\nS11340004D5332457874726120526576202A2A2AEB\nS11340102A2A20004D53322F4578747261204C6F48\nS113402061646572203032204D617920323030373E\nS1074030202A2A2AEA\nS113C000CF3FFF16C4ECCECC8CCD3000CC0006273D\nS113C01007180A30700434F9CC0AA02708CE300679\nS113C02069300434FB16C03116CC8720FBC006C02F\nS113C030181B9F1801AE300C1801AE300E1801AE5B\nS113C04030101801AE3012CE003A0D0040180B0229\nS113C05000347900350C0040CE0037E6008400C47B\nS113C060080454F7180B800039CE0000088E003BFA\nS113C0702FFA16C2C4CC3A5B8400C40104441518D8\nS113C0800CC4F43A5B1800AE00201800AEC4F8CC1F\nS113C0903A5C200D1800AE00201800AEC4F8CC3A6B\nS113C0A05B16CC6E1B847938F779330A793067795B\nS113C0B0309C7938451C0252FC1C0009101C0242B9\nS113C0C0E01C0003101D001E401D000201CE0000F4\nS113C0D0B754597E300ACE0250B7466EEA39A7FEED\nS113C0E0300ACE02406EEA32C6FE300A088E0007DD\nS113C0F02FDE7938FB7938FC793957FE39AB0D00DE\nS113C10004FE39AD0D0008FE39AF0D0010FE39B143\nS113C1100D00201D000810FE32D20D00C01C0001CD\nS113C12010FE38FB0D00011D0002FE1D0003EF1D73\nS113C1300009EF1C000C1379025A180BFF025C1D56\nS113C140026AC01C026CC01D024A0C1C024C0C7911\nS113C1503911793912CE00C91808000DE600CE0055\nS113C16000871800AE006469AF69AF16CC581B8411\nS113C170830516B7C5C2008200B7C55141B7C55182\nS113C1804108B7C52601088E00002B0F2E058C0030\nS113C190322308CE00C9E600526B007900CA180B9E\nS113C1A02400CB7932E67932E77938C57938C67913\nS113C1B038F37932B67932B71803FFFF32B4180373\nS113C1C0FFFF32B21C0040FE1C004988CE00480C20\nS113C1D00008E600C4FB6B8887F6327B5959EA886D\nS113C1E06B001C0041201D004A0C790042180B14FE\nS113C1F002477900E0180B1400E1180B1400E279EF\nS113C20000E3180B0C00E8180B0C00E97900E47942\nS113C21032C2CE008218080040790083180B6700F0\nS113C22084180BB000850C0080CE0000CD0086E69B\nS113C2304055C6005527F818084080088E009F2FE7\nS113C240EE7939B7180BEE001F10EF1804392730B8\nS113C2508E793A991804004439B91803004430100F\nS113C260180332B23012FD3010EC40180439633038\nS113C2700CF3300CB339B9497C3963EE407E39B9DB\nS113C280CE003F18080055180800AA7939177939E3\nS113C29018073C180432F5300E180432F3300CFC45\nS113C2A0300CFD3012AC4025BD2208FC300EBC32EF\nS113C2B0B423B37938F31803FFFF32B41803FFFF34\nS113C2C032B220A2180B270100180B3001053D1BC8\nS113C2D09FF73A9918270210F63A99C101182601D6\nS113C2E0CE1804391139C51804391339C71804395B\nS113C2F01539C91804391739CB1804391939CD1827\nS113C3000C391B39CF180C391C39D0180C391D398C\nS113C310D1180C391E39D2180C391F39D3180C39DD\nS113C3202039D41804392139D51804392339D718B8\nS113C33004392539D91804392739DB1804392B393C\nS113C340DF1804392D39E11804392F39E318043979\nS113C3503139E51804393339E71804393539E9181E\nS113C36004393739EB1804393939ED1804393B39B4\nS113C370EF1804393D39F11804393F39F3180439F9\nS113C3804139F51804394339F71804394539F9188E\nS113C39004394739FB1804394939FD1804394B3934\nS113C3A0FF1804394D3A011804394F3A0318043977\nS113C3B0513A05180439533A07180439553A0918FB\nS113C3C00C39573A0B180C39583A0C180439593AA5\nS113C3D00D1804395B3A0F1804395D3A11180C39F9\nS113C3E05F3A13180C39603A14180C39613A15186D\nS113C3F00C39623A16180439633A17180439653A45\nS113C40019180439673A1B180439693A1D18043994\nS113C4106B3A1F1804396D3A21180C39793A2D18E2\nS113C4200C397A3A2E1804397D3A311804397B3A9A\nS113C4302F180439813A351804397F3A33180439EE\nS113C440833A37180439853A39180439873A3B183E\nS113C4500439893A3D1804398B3A3F1804398D3A26\nS113C460411804398F3A43180439913A451804396C\nS113C470933A47180439953A49180439973A4B18AE\nS113C4800439993A4D180C399B3A4F180C399C3A97\nS113C49050180C399D3A517931341803FFFF32B4E6\nS113C4A01803FFFF32B2CE00CB0D00800C0008F65B\nS113C4B000CC2A3487F63A99B74509E6E239C56BC8\nS113C4C080180D8000CFF63134E8807B3134723A25\nS113C4D099F63A99C18D2310793A99CE00CCE600A9\nS113C4E02AFC180C313400CFA71B813D180B3D00EA\nS113C4F0303DA7A7A7000000B72114107A0105A7B3\nS113C500A7A71F010540FBB7123D00001410180B2C\nS113C510000038180B800037180B0000CA180B0CE9\nS113C52000CB180B000046180B00004CCF4000CE87\nS113C53003CDECE2C53F6CE22FFF0435F506300075\nS113C5401F00CC80FB1C00CB01CE05DC8E00000458\nS113C55035FA1D00CB011632CA810D26F986E01684\nS113C56032D58608200686E01632D5871632D5865F\nS113C5703E1632D51632CACE304DA100270B1A030F\nS113C5808E308626F586E120DFEE010500A1319884\nS113C590A23213A331A3A4322DA5320EA63235A79D\nS113C5A031B3A831CAA93247AA329EAB3296AC3213\nS113C5B08EAD3286AE3278AF3270B4309CB630AACB\nS113C5C0B73086B8314786DC1632D5B6001A163233\nS113C5D0D5B6001B1632D586E0063028180B43006A\nS113C5E03C180B00003F3C3D3D3D163365C60453EB\nS113C5F06BAF863F18167A0030790103CE0400CC65\nS113C60040001810B754CE80000762720030638077\nS113C61026EACE0400CC38001810B754CE800007A8\nS113C6204C33C601532721C63C7B00305454CD04FF\nS113C630008D020027015451C4037B01030711F646\nS113C6400030CB04C13B2BE1180B3D0030063026F3\nS113C65034CE80006A00180B410106180B800105D6\nS113C660A7A7A7B601052AFB482AF8303DB7966C60\nS113C67000180B4001061633B39726081AE204008B\nS113C6800436EC3D3A204C163365F600305454CD54\nS113C69004008D020027015451C4037B0103F600FA\nS113C6A030C13F2611CE0400CC38001810B754CE48\nS113C6B0800007B92011CE0400CC40001810B754F4\nS113C6C0CE800007A82000B601058430260586E048\nS113C6D006302886E60630281632BFA6001632D564\nS113C6E00630261632BFEC001632D5180F1632D596\nS113C6F00630261632BF1632CA180E52A60016325B\nS113C700D5085326F786E00630281632BF1632CAFB\nS113C710180E52C10137271BB75085012615163252\nS113C720CA180E63801632CAB78116330E33261721\nS113C7300820091632CA16333033260B085326D381\nS113C74086E020C31632CA5326FA86E620B9072C9F\nS113C7500631A61632BF1632CA1632DE2702200868\nS113C7606A008786E006302886E50630281632BF40\nS113C770C6023720A90705C6023720A21B82EE8312\nS113C78008086E831B9E3DB7751A091632B6EE87EC\nS113C7901632B6EE851632B6EE831632B6EE81B791\nS113C7A0C5B781B7C51632B6A6801632D50630266F\nS113C7B01632CA6A800630261632BFB7C5B781B7AB\nS113C7C0C56E810630261632BF6E830630261632B9\nS113C7D0BF6E850630261632BF6E87063026071FC9\nS113C7E01A178E301A250A8E3FF72205B7570630DE\nS113C7F02686E4063028B7C5071B180F07173D0720\nS113C80009180E0705B781B7C53D1E00CC200220CC\nS113C810F9B600CF3D1F00CC80FB7A00CF3D3B8EA4\nS113C820400025148EFF8024098EF7802519C6FF49\nS113C8303A3D1AE2F800200F1F001C300E8E000053\nS113C84025098E00002204C6013A3DC73A3D343B17\nS113C85007CC2B4E2715AC0027483BB751C5012602\nS113C86005EC008CFFFF3A2639202C6C008720321F\nS113C870343B07AA2B2C271AA1002726E6005226B0\nS113C88021B751C5012604E601200C180E09A600A3\nS113C89020056A0087200B070C8E40002504070D35\nS113C8A020003A303D3686307A0105323D3B8E8099\nS113C8B000250C8EC000250C180B3F0030200518F5\nS113C8C00B3E0030F600305454CD04008D02002796\nS113C8D0015451C4037B0103C1003A270F6C008645\nS113C8E0207A0106070DB6010584303D6C008620D0\nS113C8F07A0106B7211410180B800105A7A7A71FFA\nS113C900010540FBB712B6010584303DF600CCC4E6\nS113C91020260306CBFEF600CFB638F3260CC14121\nS113C9202608180B013A9906CC4D7932B67932B7FC\nS113C9301803FFFF32B41803FFFF32B2B638F327EF\nS113C9407B8105182701A38106182701A3810718F5\nS113C9502701A38108182701A38109182701CC8185\nS113C9601E18270203811F1827021281201827028C\nS113C9701D81211827021D81221827021D812318D9\nS113C98027021D81241827021D81251827021D81D5\nS113C990261827021D81271827021D81281827021F\nS113C9A01D81291827021D812A1827021D81281894\nS113C9B02700BF8129182700D306CBDBC177271FA7\nS113C9C0C165272DC172273BC121273EC163274280\nS113C9D0C150275AC1512766C153277C06CBDB18A7\nS113C9E00B0538FF180B2838F3180B0132FF06CB60\nS113C9F0DB180B0538FF180B2838F3180B0232FF2D\nS113CA0006CBDB180B0538FF2029180B1E38F3065C\nS113CA10CBDB7932E67932E7180B0138F3180B02D5\nS113CA2032B6180C391100CF72391106CB61180BCC\nS113CA300A38FF180B2838F37932FF06CBDB79323A\nS113CA40E67932E7180B0438F31803001432B618E9\nS113CA500C400000CF06CB617932E67932E7180B3F\nS113CA600538F31803002032B6180C401400CF0622\nS113CA70CB617B32A3C1101824015B87B745C60183\nS113CA8018270152180B2938F306CBDB7B32F7B693\nS113CA9032A38100260220067938F306CAE1F6386B\nS113CAA0FFC10A2708180C38FF38F320037938F33C\nS113CAB0F632F7C10427057938F32025C604F13886\nS113CAC0F7271E1D3067401D306780F632F77B382C\nS113CAD0F7180B0438F7F6395FC50127041C395FD2\nS113CAE0027938FFF638F306CBDB7B32A506CB7828\nS113CAF07B32A606CB787B32A106CB787B32A27937\nS113CB0038C57938C6B632FF26187932E67932E765\nS113CB10180B0338F3180432A132B6877A00CF0613\nS113CB20CB617238F379307106CBDBB7C5FC32A523\nS113CB30F338C5B7C5FD38C5027D38C5BD32A11867\nS113CB40250098B632FF81011827008A7932E679E8\nS113CB5032E7180B0338F3180432A132B6877A008F\nS113CB60CF1C00CB8806CBDBC121266AB638C7812F\nS113CB7005810A180B0138C77238F3205EC1782684\nS113CB80044AC5DC00C121264DB638C720EAC1538A\nS113CB90264420E4C161263E20DEC166263820D822\nS113CBA0C165263220D2C174262C20CCC179262618\nS113CBB020C6C146262020C0C169261A20BAC172E7\nS113CBC0261420B4C173260E20AEC17426081D009D\nS113CBD008104AC50C007938F32072FE32B61826C4\nS113CBE0006BF738F318270064FC32F5FE32F3C308\nS113CBF00F422401087C32B47E32B206CC4DFE32A0\nS113CC00E6087E32E6BE32B61824002EF638F3C1AA\nS113CC1003260CFC32A51AE6877A00CF06CC4DC158\nS113CC2004260AA6E240007A00CF06CC4DC10526B0\nS113CC3007A6E240147A00CF20137932E67932E76E\nS113CC407932B67932B71D00CB887938F30B1D00E1\nS113CC504CFF180BFF004E0B3BED8413ED86B7D44D\nS113CC60131AE6ED863A13B7C61AE6B7C63DEE8246\nS113CC70ED843BB7C6492404180A3070270718020C\nS10FCC8031710434F93A3D10EF3E20FB02\nS113FF80CC4ECC4ECC4ECC4ECC4ECC4ECC4ECC4E9D\nS113FF90CC4ECC4ECC4ECC4ECC4ECC4ECC4ECC4E8D\nS113FFA0CC4ECC4ECC4ECC4ECC4ECC4ECC4ECC4E7D\nS113FFB0CC4ECC4ECC4ECC4ECC4ECC4ECC4ECC4E6D\nS113FFC0CC4ECC4ECC4ECC4ECC4ECC4ECC4ECC4E5D\nS113FFD0CC4ECC4ECC4EC90CCC4ECC4ECC4ECC4E92\nS113FFE0CC4ECC4ECC4ECC4ECC4ECC4ECC4ECC4E3D\nS113FFF0CC4ECC4ECC4ECC4ECC4ECC4ECC4EC00087\nS903C0003C".getBytes());
    AdInterfaceBravo AdInterfaceBravo = new AdInterfaceBravo();
    AdInterfaceAlpha a1 = null;
    try {
      a1 = AdInterfaceBravo.AdInterfaceAlpha(byteArrayInputStream);
    } catch (ExceptionInAdPackage ExceptionInAdPackage) {
      Logger.getLogger(k.class.getName()).log(Level.SEVERE, "Failed to parse bootstrap", (Throwable)ExceptionInAdPackage);
      null.AdInterfaceAlpha(AeInterfaceDelta.AdInterfaceBravo);
      null.AdInterfaceAlpha("Failed to parse bootstrap");
      return null;
    } 
    null = j.AdInterfaceAlpha(paramp);
    if (null.AdInterfaceAlpha() == AeInterfaceDelta.AdInterfaceBravo)
      return null; 
    null = j.ExceptionInAdPackage(paramp);
    return (null.AdInterfaceAlpha() == AeInterfaceDelta.AdInterfaceBravo) ? null : j.AdInterfaceAlpha(a1, paramp, paramu, (AeInterfaceOscar)null);
  }
  
  private boolean AdInterfaceAlpha(int paramInt) {
    return ((AeInterfaceOscar.w | paramInt) == paramInt);
  }
  
  public void AdInterfaceAlpha(boolean paramBoolean) {
    this.f = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/af/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */