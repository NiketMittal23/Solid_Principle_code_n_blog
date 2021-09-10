package Liskov_Substitution_Principle;

public class veg extends nonVeg{

    void item(){
        veg v = new veg();
        System.out.println("You Ordered VEG");
    }
}
