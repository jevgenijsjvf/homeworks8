package HW7;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayService service = new ArrayService();
        ArrayServiceTest testRunner = new ArrayServiceTest();
        int[] array = service.create(5);
        service.printArrayToConsole(array);
        service.fillArrayWithRandomNumbers(array);
        service.printArrayToConsole(array);
        service.sumInArray(array);
        service.swap(array);
        service.printArrayToConsole(array);
        service.sortArray(array);
        service.printArrayToConsole( array);


    }

}
