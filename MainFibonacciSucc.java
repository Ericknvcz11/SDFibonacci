import java.util.List;
import java.util.ArrayList;

public class MainFibonacciSucc {
    public static void main(String[] args) {
        List<Integer> fibonacci = FibonacciSucc.numbers();
        List<Integer> evenFibonacci = Splitter.evenNum(fibonacci);
        List<Integer> oddFibonacci = Splitter.oddNum(fibonacci);
        
        System.out.println(" Secuancia Fibonacci");
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
        
        Manager.ejecutar(fibonacci);
        
        System.out.println("\n Numeros pares");
        for (int num : evenFibonacci) {
            System.out.print(num + " ");
        }
        
        System.out.println("\n Numeros impares");
        for (int num : oddFibonacci) {
            System.out.print(num + " ");
        }
    }
}
