package basics;



public class Hello {
    public static void main(String[] args) {
        int n = 17;
        int nearestSquare;
        int count = 0;
        double square =  Math.pow(n , 0.5);
        if(square == (int) square){
            System.out.println(n/square);
            System.out.println("True");
        }
        while(n != 0){
            nearestSquare = (int) Math.pow(n , 0.5);
            n = n-(nearestSquare * nearestSquare);
            count ++;
        }
        if(count % 2 == 0){
            System.out.println("false");
        }
        else {
            System.out.println("true");
        }
    }
}
