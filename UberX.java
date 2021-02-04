class UberX extends Car{
  String brand;
  String model;
  private Integer passegenger;

    public UberX(String license, Account driver, String brand, String model){
      super(license,driver);
      this.brand = brand;
      this.model = model;
    }

    @Override
    void printDataCar(){
    if(passegenger != null){
      System.out.println("Model: " + model + " Brand " + brand);
    }
  }
}