package ourLesson;

public class CLassWithObjectTest {
    public static void main (String[] args) {
        ClassWithObject classWithObject = new ClassWithObject();
        printToConsole(classWithObject);
        fillObjectVariables(classWithObject);
        printToConsole(classWithObject);
        fill2ObjectVariables(classWithObject);
        printToConsole(classWithObject);
           }
    public static void printToConsole(ClassWithObject classWithObject) {
        System.out.println("Byte = "+ classWithObject.byteVariable);
        System.out.println("Short = "+ classWithObject.shortVariable);
        System.out.println("Integer = "+ classWithObject.integerVariable);
        System.out.println("Long = "+ classWithObject.longVariable);
        System.out.println("Float = "+ classWithObject.floatVariable);
        System.out.println("Double = "+ classWithObject.doubleVariable);
        System.out.println("Character = "+ classWithObject.characterVariable);
        System.out.println("Boolean = "+ classWithObject.booleanVariable);
    }

    public static void fillObjectVariables(ClassWithObject classWithObject) {
        classWithObject.byteVariable = 13;
        classWithObject.shortVariable = 432;
        classWithObject.integerVariable = 15476;
        classWithObject.longVariable = 6745654123412L;
        classWithObject.floatVariable = 341.13F;
        classWithObject.doubleVariable = 53454.123;
        classWithObject.characterVariable = 'A';
        classWithObject.booleanVariable = false;
    }
    public static void fill2ObjectVariables(ClassWithObject classWithObject) {
        classWithObject.byteVariable = 11;
        classWithObject.shortVariable = 111;
        classWithObject.integerVariable = 11111;
        classWithObject.longVariable = 111111111L;
        classWithObject.floatVariable = 111.11F;
        classWithObject.doubleVariable = 11111.1211;
        classWithObject.characterVariable = 'A';
        classWithObject.booleanVariable = true;
    }
}
