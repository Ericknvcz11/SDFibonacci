import java.util.List;
import java.util.ArrayList;

public class FibonacciSucc {
    public static List<Integer> numbers() {
        List<Integer> serie = new ArrayList<>();
        int n1 = 0, n2 = 1, sum = 0;
        while (sum <= 1500000) {
            serie.add(sum);
            n1 = n2;
            n2 = sum;
            sum = n1 + n2;	
        }
        return serie;
    }
    
}

