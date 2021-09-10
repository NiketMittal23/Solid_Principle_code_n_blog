package Liskov_Substitution_Principle;

public class nonVeg implements category{

    void item(){
        nonVeg n = new nonVeg();
        System.out.println("YOu Ordered NON-VEG");
    }
}
