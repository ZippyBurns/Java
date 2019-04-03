public class StringManipulationTest {
    public static void main(String[] args) {
        StringManipulation manipulator = new StringManipulation();

        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hello     ", "     World    ");
        System.out.println(str); // HelloWorld
    
        // /////////////////
        // char letter = 'o';
        // int a = manipulator.getIndexOrNull("Coding", letter);
        // int b = manipulator.getIndexOrNull("Hello World", letter);
        // int c = manipulator.getIndexOrNull("Hi", letter);
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // String word = "Hello";
        // String subString = "llo";
        // String notSubString = "world";
        // Integer a = manipulator.getIndexOrNull(word, subString);
        // Integer b = manipulator.getIndexOrNull(word, notSubString);
        // System.out.println(a); // 2
        // System.out.println(b); // null


}
}

