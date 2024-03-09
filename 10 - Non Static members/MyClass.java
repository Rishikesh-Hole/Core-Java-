public class MyClass {
    public static int staticValue = 42;
    public int instanceValue;

    public static void main(String[] args) {
        MyClass nullObject = null;

        // Accessing static member using the class name
        System.out.println(MyClass.staticValue);

        // Accessing static member using a null-referenced object
        System.out.println(nullObject.staticValue);

        // This would result in a NullPointerException for instance members
        // System.out.println(nullObject.instanceValue);
    }
}
