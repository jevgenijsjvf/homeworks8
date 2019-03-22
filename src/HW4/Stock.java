package HW4;

public class Stock {
    String company;
    double currentValue;
    double max;
    double min;

    public Stock(String company, double currentValue) {
        this.company = company;
        this.currentValue = currentValue;
        this.max = currentValue;
        this.min = currentValue;
    }

    public void printInformation () {
        System.out.println("Название компании: "+getCompany());
        System.out.println("Текущая стоимость акции: "+getCurrentValue()+" $");
        System.out.println("Минимальная цена акции: "+getMin()+" $");
        System.out.println("Максимальная цена акции: "+getMax()+" $");
        System.out.println();
}

    public double getMax() {
        return max;
    }
    public double getMin() {
        return min;
    }
    public String getCompany() {
        return company;
    }
    public double getCurrentValue() {
        return currentValue;
    }

    public double updatePrice (double currentValue){
        this.currentValue=currentValue;

        if (currentValue>getMax()) {
            max=currentValue;
        }
        if (currentValue<getMin()) {
            min=currentValue;
        }
        return currentValue;
    }



}
