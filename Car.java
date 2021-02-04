class Car{
  private Integer id;
  private String license;
  private Account driver;
  private Integer passegenger;

  public Car(String license, Account driver){
    this.license = license;
    this.driver = driver;
  }

  void printDataCar(){
    if(passegenger != null){
      System.out.println("License: " + license + " Driver: " + driver.name + " Passegenger: " + passegenger);
    }
  }

  //Getter and Setters

  //ID
  public Integer getId(){
    return id;
  }

  public void setId(Integer passegenger){
    this.passegenger = passegenger;
  }

  //License
  public String getLicense(){
    return license;
  }

  //driver
  public Account getDriver(){
    return driver;
  }

  public void setDriver(Account driver){
    this.driver = driver;
  }

  public void setLicense(String license){
    this.license = license;
  }

  //Passegenger
  public Integer getPassegenger(){
    return passegenger;
  }

  public void setPassengenger(Integer passegenger){
    if(passegenger == 4){
      this.passegenger = passegenger;
    }else{
      System.out.println("Necesitas Asignar 4 Pasajeros");
    }
  }
  
  

}
