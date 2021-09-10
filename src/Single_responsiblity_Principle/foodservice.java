package Single_responsiblity_Principle;

public class foodservice {
    void orderbooked(String item,String name){

        System.out.println("The order of "+item+" placed to "+name+" ");
    }

    public static void main(String[] args) {
        order or =new order();
        customer c = new customer();
        foodservice food =new foodservice();
        food.orderbooked(or.item,c.name);
    }
}

