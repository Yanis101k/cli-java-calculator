
public class Calculator {

    public int addition( int a , int b ){
        return a + b ; 
    }

    public int substraction( int number1 , int number2 ){
        return number1 - number2 ; 
    }

    public static void main( String[] args ){

        Calculator claculator = new Calculator() ; 
        System.out.println( claculator.substraction( 2 , 9 )) ; 
    }
}