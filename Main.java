import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i<=N; i++) {
            for (int j =N; j>=i; j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
             }
             for(int l=2;l<=i;l++)
             {
                System.out.print("*");
             }
            System.out.println();
        }
        int nsp=N+3;
        for(int m=2;m<=N-1;m++)
            {
                for(int o=1;o<=m;o++)
                {
                    System.out.print(" ");
                }
                for(int p=1;p<=nsp;p++)
                {
                    System.out.print("*");
                }
                nsp-=2;
                System.out.println();
            }
        
    }
}