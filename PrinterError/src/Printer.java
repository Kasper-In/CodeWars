//Ошибка - символ, не входящий в "a-m"
//Надо подсчитать, сколько ошибок в обшей длине строки
public class Printer {

    public static String printerError(String s) {
        String errors = s.replaceAll("[a-m]", "");
        return errors.length()+ "/" + s.length();
    }

    public static void main(String[] args) {
        System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
    }
}