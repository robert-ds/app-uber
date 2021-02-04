import java.util.Map;

class Uberblack extends Car{
  Map<String, ArrayList<String, Integer>> typeCarAcceted;
  ArrayList<String> seatMaterial;


  public Uberblack(String license, Account driver,
  Map<String, ArrayList<String, Integer>> typeCarAcceted,
  ArrayList<String> seatMaterial;){
    super(license, driver);
    this.typeCarAcceted = typeCarAcceted;
    this.seatMaterial = seatMaterial;
  }

}