import java.util.Arrays;

//расчет чисел Трибоначии. Как Фибоначи, только элемент получается как сумма 3 предыдущих членов
public class Tribonacci {

    public double[] tribonacci(double[] s, int n) {

        double[] arr = Arrays.copyOf(s,n);
        for (int i = s.length; i < n; i++) {
            arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
        }
        return arr;
    }

    public static void main(String[] args) {
        Tribonacci tr = new Tribonacci();
        System.out.println(Arrays.toString(tr.tribonacci(new double []{1,1,1},10)));
    }
}
