import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class TesteCalculadora {
    public static void main(String Args[]) {
        Valor v1 = new Valor();
        Valor v2 = new Valor();
        Valor v3 = new Valor();

        List <Valor> valores = Arrays.asList(v1, v2, v3);
        for (Valor v: valores){
            System.out.println(v.soma());
        }
    }
}