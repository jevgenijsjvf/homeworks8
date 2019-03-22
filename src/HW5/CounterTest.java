package HW5;

public class CounterTest {
    public static void main(String[]args) {
        Counter counter = new Counter(0,1);

        System.out.println();
        System.out.println(counter.increment()+" Now value is: "+counter.getValue()+" Step is: " +counter.getStep());
        System.out.println(counter.increment()+" Now value is: "+counter.getValue()+" Step is: " +counter.getStep());
        System.out.println(counter.decrement()+" Now value is: "+counter.getValue()+" Step is: " +counter.getStep());
        System.out.println(counter.decrement()+" Now value is: "+counter.getValue()+" Step is: " +counter.getStep());
        System.out.println(counter.decrement()+" Now value is: "+counter.getValue()+" Step is: " +counter.getStep());
        System.out.println(counter.increment()+" Now value is: "+counter.getValue()+" Step is: " +counter.getStep());
        counter.clear();
        counter.setValuePrev(counter.getValue());
        System.out.println("Now value is: "+counter.getValue());
        counter.setValue(105);
        System.out.println("Returned value: " +counter.getValue());
        System.out.println(counter.getValue()+" Now value is: "+counter.getValue());
        System.out.println(counter.increment()+" Now value is: "+counter.getValue()+" Step is: " +counter.getStep());
        String st =counter.setStep(1);
        System.out.println(counter.decrement()+ st+" Now value is: "+counter.getValue()+" Step is: " +counter.getStep());

    }
}
