
public class User(){

  public User(String name, String password){
    // map of menu item to #
  }
  public class transaction(){
    String restName;
    Vendor myVendor;
    HashMap<String,int> myOrder;

    public transaction(String vendor, HashMap<String,int> order){
      restName = vendor;
      Vendor myVendor = new Vendor(restName);
      myOrder = order;
    }

    public double tScore(){
      HashMap a = this.MyOrder;
      double temp = 0.0;
      for(String key: a.keySet()){
        int numItems = a.get(key);
        MenuItem mIt = new MenuItem(key);
        temp+=mIt.outCO2()*numItems;
      }
      return temp;
    }
    public double eqCO2(){
      double a = this.tScore();
      double vOP = myVendor.getVOp();
      return a*vOP;
    }
    // vendor in the constructor of transaction
    // display list of menu and place to put in amount
    // sum method of eqCO2 * sum by V_Op
    // method eq. CO2 output/meal
    // user input will give vendor and food
      // food method
      // V_op
      //Vendor M.getVOp
    // Food method


    // vendor + map of menu items to how many????

    public class Vendor(){
      MenuItem[] myMenu;
      Double myVop;
      String myName;

      public vendor(String name){
        myName = name;
        myVop= getVOp(name);
        myMenu = getMenu(name);
      }
      public double getVOp(String name){
        // access througb dict V_op with name of rest as keys;
        return V_Op;
      }

      public MenuItem[] getMenu(String name){
        // access through another map with name as keys
        return menu;
      }



            //menu, V_op
      // method returns V_op

      public class MenuItem{
        Food myMainFood;
        Double myMainFoodAmt; //in kg's from a map
        String myItem;

        public MenuItem(String item){
          myItem = item;
          myMainFoodAmt = getMainFoodAmt(item);
          myMainFood = getMainFood(item);
        }
        public double getMainFoodAmt(String item){
          //accessing map = mAmt;
          return mAmt;
        }
        public Food getMainFood(String item){
          // accessing map = mFood
          return mFood;
        }

        public double outCO2(){
          Food f = getMainFood();
          double CO2 = f.getco2kg();
          double amt = myMainFoodAmt;
          return CO2*amt;
        }




        // main ingred. and map



        //array of food
        // How much of each associated food
        // menu item --> component, quant (kg) in food of
        //method eqCO2()
        // map that link menu item to food class
        // two maps one is menu item --> serving size
            // menu item --> food


        public class Food(){
          String myType;
          Double myco2kg;

          public Food(String name, Double co2kg){
            String myType = name;
            Double myco2kg = co2kg;
          }

          public String getType(){
            return myType;
          }

          public double getco2kg(){
            return myco2kg;
          }
          // instance variables
              // 1. Type Beef
              // 2. Amount in kgs
          // what food, how much?
          //method returns what kind
              // name
          //method returns how much
              // amount
          /// Method for eq.Co2
        }
      }
    }
  }
}
