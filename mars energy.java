public class classwork {
    // create the starting point for our program
    public static void main(String[] args) {
       
    //display a title to our user
    System.out.println("\n\n welcome to the mars base energy grid \n\n");
    
        //create our first array and then intialize it with vaulues
        // create our solar panel array in MegaWatts (MW)
        // each one the these represent the energy output of a solar panel
        int[] solarPanels = {30, 45, 25, 35, 50};
    
        //create our second array and then intialize it with values
        // create our wind turbine array in megawatts
        //each value represents the energy output of a wind tourbine
        int[] windTurbines = {20, 30, 25, 40, 35};
    
        //create a variable to store our total energy output we get from our solar panels
        int totalSolarEnergy = 0;
    
        // create a loop to iterate through our solar panels to calculate the total energy output of our solar panels
    // this solarPanels.length calculates the length of our array
        for (int i = 0; i < solarPanels.length; i++){
            // add the current solar panel element to our total solar energy
           // totalSolarEnergy += solarPanels[1]; this is a shortcut of the below code
            totalSolarEnergy = totalSolarEnergy + solarPanels[i];
         // display the current solar panel element and calculatioins to our user
         System.out.println("the current solar panel element is: " + solarPanels[i] + "MW\n\n");
    //
    System.out.println("The current total of our solar energy is:" + totalSolarEnergy + "MW\n\n");
    }
    // create a variable to store our total energy output we get from all of our wind turbines
    // we are intializing this variable to - because we have not calculated it yet
    int totalWindEnergy = 0;
    
    // create a loop to iterate through our wind turbines to calculate the total energy output of all of our wind turbines
    // this type of loop will be a for loop
    for(int i = 0; i<windTurbines.length; i++){
        // add the current wind turbine element from our array to out total wind energy
        totalWindEnergy = totalWindEnergy + windTurbines[i];
    }
    
    // create a variable to store our total energy output for our entire grid
    // we are intializing this variable to 0 because we have not calculated the total energy output yet
    int totalEnergyFromAllsources = 0;
    //calculate our total energy output from all of our sources
    totalEnergyFromAllsources = totalSolarEnergy + totalWindEnergy;
    //report the energy output to our user
    System.out.println("\\n\n Hello traveler. The energy Within the system is as follows \n\n ");
    // fisplay the total energy output for our solar panels
    System.out.println("the total energy output for all of our solar panels is:" + totalSolarEnergy + "MW\n\n");
    //display the total energy output for the wind turbines
    System.out.println("The total energy output for our wind turpines is: " + totalWindEnergy + "MW\n\n");
    // display the total energy output for our entire energy grid from all sources
    System.out.println("The total energy output from our entire energy grid is:" + totalEnergyFromAllsources + "MW\n\n");
    
    // display end of report
    System.out.println(" End of energy report for our mars base alpha energy grid\n\n");
    
    }
    
    
    
    
    
   
    
       
    }
    