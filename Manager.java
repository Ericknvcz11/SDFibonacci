import java.util.List;

public class Manager {
    public static void saveNumbers(List<Integer> numbers) {
    }
    
    public static void saveEvenNumbers(List<Integer> evenNumbers) {
    }
    
    public static void saveOddNumbers(List<Integer> oddNumbers) {
    }
    
    public static void ejecutar(List<Integer> numbers) {
        saveNumbers(numbers);
        saveEvenNumbers(Splitter.evenNum(numbers));
        saveOddNumbers(Splitter.oddNum(numbers));
    }
}
