package Open_closed_Principle;


public class foodservice {
    void orderbooked(String item,String name,String category){
        System.out.println("Category= "+category);
        System.out.println("The order of "+item+" placed to "+name+" ");
    }

    public static void main(String[] args) {
        order or =new order();
        customer c = new customer();
        category c1 = new category();
        foodservice food =new foodservice();
        food.orderbooked(c1.item,c.name, c1.category);
    }
}

