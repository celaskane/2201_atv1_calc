import java.util.*;
public class TesteCalculadora {
    public static void main(String Args[]) {
        int op1 = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("\nSelecione qual operacao deseja realizar:\n1) Soma\n2) Subtracao\n3) Multiplicacao\n4) Divisao\n5) Sair");
            op1 = sc.nextInt();
            if(op1 != 5){
                System.out.println("\nDigite dois valores:");
                double n1 = sc.nextInt();
                double n2 = sc.nextInt();
                
                switch(op1){
                    case 1:
                        System.out.printf("\nResultado = %f\n", n1+n2);
                        break;
                    case 2:
                        System.out.printf("\nResultado = %f\n", n1-n2);
                        break;
                    case 3:
                        System.out.printf("\nResultado = %f\n", n1*n2);
                        break;
                    case 4:
                        System.out.printf("\nResultado = %f\n", n1/n2);
                        break;
                    case 5:
                        sc.close();
                }
            }
            else sc.close();
        } while(op1 != 5);
    }
}