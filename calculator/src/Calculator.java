public class Calculator {
    public static int add(int num1,int num2){
        return num1 + num2;
    }
    public static int subtract(int num1,int num2){
        return num1 - num2;
    }
    public static int multiplication(int num1,int num2){
        return num1 * num2;
    }
    public static int division(int num1,int num2){
        return num1 / num2;
    }
    public static int square(int num){
        return num*num;
    }
    public static int factorial(int num){
        if(num>1){
        return num * factorial(num-1);
        }
        else{
        return 1;
        }
    }
}
