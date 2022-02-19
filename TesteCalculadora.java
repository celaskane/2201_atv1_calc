import java.util.*;
public class TesteCalculadora {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione qual operacao deseja realizar:\n1) Soma\n2) Subtracao\n3) Multiplicacao\n4) Divisao");
        int op1 = sc.nextInt();
        do{
            System.out.println("Digite dois valores:");
            double n1 = sc.nextInt();
            double n2 = sc.nextInt();

            switch(op1){
                case 1:
                    System.out.println(n1+n2);
                    break;
                case 2:
                    System.out.println(n1-n2);
                    break;
                case 3:
                    System.out.println(n1*n2);
                    break;
                case 4:
                    System.out.println(n1/n2);
                    break;
                case 5:
                    sc.close();
            }
        } while(op1 != 5);
    }
}