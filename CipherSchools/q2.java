public class Main{
    public static void main(String[] args) {
        int num = 50;
        double decimal = 25.75;
        char letter = 'A';
        boolean isJavaFun = true;
      
        System.out.println("Original values:");
        System.out.println("Integer: " + num);
        System.out.println("Double: " + decimal);
        System.out.println("Character: " + letter);
        System.out.println("Boolean: " + isJavaFun);

        double numToDouble = num; 
        int charToInt = letter;   

        System.out.println("\nAfter Type Conversion:");
        System.out.println("Integer to Double: " + numToDouble);
        System.out.println("Character to Integer (ASCII): " + charToInt);
    }
}
