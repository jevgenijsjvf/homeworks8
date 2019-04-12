package HW12Final;


import java.math.BigDecimal;

public class Service {
    public static void main(String[] args) {

//        for (Category category: Category.values()) {
//            System.out.println(category);
//        }
        Database database=new Database();
        Product item = new Product("Hiesense 55",new BigDecimal(458.25), Category.TV);

        database.addProduct(item);
        Product item1 = new Product("Samsung 55",new BigDecimal(458.25), Category.TV);
        database.addProduct(item1);
        Product item2 = new Product("LG 42",new BigDecimal(458.25), Category.TV);
        database.addProduct(item2);

        System.out.println(database.products);

        database.setDiscountbyID((long)2,new BigDecimal(0.5));
        System.out.println(database.products);

        database.setDescriptionbyID((long)2,"This is Korean TV");
        System.out.println(database.products);

        try {
            System.out.println( database.findById((long)2));
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }
    }
}
