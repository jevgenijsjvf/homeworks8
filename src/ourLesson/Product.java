package ourLesson;

public class Product {
    String name;
    double regularPrice;
    double discount;

    public String getName()    {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice()   {
        return regularPrice;
    }
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount()   {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double calculateActualPrice() {
        double actualPrice = (regularPrice * (100-discount))/100;
        return actualPrice;
    }

    public void printInformation(Product product) {
        double actualResult = product.calculateActualPrice();
        System.out.println();
        System.out.println("Product: name = " + product.getName() + ", regular price = " + product.getRegularPrice() + " EUR, discount = " + product.getDiscount() + "%, actual price = " + actualResult + " EUR");
    }
}
