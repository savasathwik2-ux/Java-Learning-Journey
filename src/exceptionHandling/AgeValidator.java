package exceptionHandling;

public class AgeValidator {
    static void checkAge(int age){
        if(age >= 18){
            System.out.println("Eligible to vote");
        }
        else {
            throw new IllegalArgumentException("Age must above 18");
        }
    }
    public static void main(String[] args){
        try{
            checkAge(12);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
