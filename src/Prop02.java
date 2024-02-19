import java.util.Scanner;
public class Prop02 {
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int years = n / 365;
        int months = (n % 365) / 30 ;
        int days = (n % 365) % 30;
        System.out.printf("%d days = %d years + %d months + %d days", n, years, months, days);
    }
}
