import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an low number ");
        int low = sc.nextInt();
        System.out.println("enter an high number ");
        int high = sc.nextInt();
        System.out.println(Solution.countOdds(low,high));
    }
}
class Solution {
    public static int countOdds( int low, int high) {
        if (low %2==0 && high%2==0){
            return (high-low)/2;
        }
        return (high-low)/2+1;
    }
}
