
public class Calculator {

    public int addition( int a , int b ){
        return a + b ; 
    }

    public int substraction( int number1 , int number2 ){
        return number1 - number2 ; 
    }

    public static void main( String[] args ){
        // create an instance of calculator class to test calculator methode 
        Calculator calculator = new Calculator() ; 
        
        // test manually addtion methode 
        System.out.println(calculator.addition( 1 , -7 ) ) ; 
        // teste manually substraction methode 
        System.out.println( calculator.substraction( 2 , 9 )) ; 
    }
}