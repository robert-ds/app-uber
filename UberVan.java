import java.util.Map;
import java.util.ArrayList;

class UberVan extends Car{

  Map<String, Map<String,Integer>> typeCarAcceted;
  ArrayList<String> seatMaterial;
  private Integer passegenger;

  public UberVan(String license, Account driver){
    super(license, driver);
  }

  public UberVan(String license, Account driver,
  Map<String, Map<String,Integer>> typeCarAcceted,
  ArrayList<String> seatMaterial){
    super(license, driver);
    this.typeCarAcceted = typeCarAcceted;
    this.seatMaterial = seatMaterial;
  }

  @Override
  public void setPassengenger(Integer passegenger){
    if(passegenger == 6){
      this.passegenger = passegenger;
    }else{
      System.out.println("Neceesitas Asignar 6 Pasajeros");
    }
  }

}