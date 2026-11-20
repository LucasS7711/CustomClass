public class Garage {
   
   
   // instance varibles
   int horsepower;
   int numSeats;
   int year;
   int LastMaintenanceYear;
   double cost;
   double weight;
   double mileage;
   boolean isManual;
   boolean isGas;
   String driveTrainType;
   String carType;
   String modList;
   String name;
   String color;
   
   //constructors
   public static void Garage() {
      int horsepower = 215;
      int numSeats = 2;
      int year = 1989;
      int LastMaintenanceYear =2025;
      double cost = 14000;
      double weight = 2137.75;
      double mileage  = 12000;
      boolean isManual = true;
      boolean isGas = true;
      String driveTrainType = "5 speed manual";
      String carType = "Eunos Roadster";
      String modList = "wide body kit, turbo";
      String name = "Na mx5 Miata";
      String color  = "Midnight Purple";
   }
   
   //methods
   
   // add mods allows you to add a mod to a list of mods
   public void addMod(String mod) {
   
   }
   
   // remove mod allows you to take a mod off the list
   public void removeMod(String mod) {
   
   }
   
   // maintenance updates the year maintenance was done to the current year
   public void maintenance() {
   
   }
   
   // drive allows you to add a specific number of miles to the car
   public void drive(double miles) {
   
   }
   
   // paint allows you to change the color of the car
   public void paint(String paintColor) {
   
   }
   
   // stats displays the current stats of the car
   public String stats() {
      return null;
   }
}