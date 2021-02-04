class Main{

    public static void main(String[] args){
      System.out.println("Hola mundo");
      UberX uberX = new UberX("AMQ123",new Account("Andres Herrera","24470652"), "Chevrolet", "Sonic");
      uberX.setPassengenger(4);
      uberX.printDataCar();

      UberVan uberVan = new UberVan("AMQ332", new Account("Andres Herrera","24470652"));
      uberVan.setPassengenger(6);
      uberVan.printDataCar();
      /*Car car2 = new Car("AM#OO",new Account("Andrea Herrera","28833990"));
      car2.passegenger = 3;
      car2.printDataCar();*/
    }

}