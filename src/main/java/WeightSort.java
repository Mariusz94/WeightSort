import java.util.LinkedHashMap;
import java.util.Map;

public class WeightSort {

    public static String orderWeight(String string) {
    String[] numbersString = string.split(" ");
        Map<Integer,String> map = new LinkedHashMap<>();

        for (String s : numbersString) {
            map.put(sumDigits(s),s);
        }
        System.out.println(map);
        return "";
    }

    public static int sumDigits(String string){
        char[] digits = string.toCharArray();
        int sum=0;
        for (char digit : digits) {
            sum = sum + Integer.parseInt(String.valueOf(digit));
        }
        return sum;
    }
}