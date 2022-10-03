//РЕКУРСИЯ
//Сколько раз надо перемножить цифры числа до момента, пока не останется число одноцифренное
//(39: 3*9=27, 2*7=14, 1*4=4. Ответ: 3)
public class Persist {

    public static int persistence(long n) {
        if (n < 10){
            return 0;
        }
        long newN = 1;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            newN *= Long.parseLong(String.valueOf(s.charAt(i)));
        }

        return persistence(newN) + 1;
    }

    public static void main(String[] args) {
        System.out.println(persistence(4));
    }
}
