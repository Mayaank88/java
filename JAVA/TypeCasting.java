public class TypeCasting {
    
    public static void main(String[] args) {
        
        byte b = 10;
        char c = 'a'; //when this got multiplied with the int, it got converted or its vale was converted into its ascii value and then it got multiplied.
        short s = 1024;
        int a = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (a / c) - (d - s);
        //float + int - double = double ; coz the max size is of the double datatype.
        
        System.out.println((f * b) + " " + (a / c) + " " + (d - s));
        System.out.println(result);
    }
}
