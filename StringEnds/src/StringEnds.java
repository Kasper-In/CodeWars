
//Является ли вторая строка окончанием первой
public class StringEnds {

    public static boolean solution(String str, String ending) {
        if (str == null || ending == null){
            return false;
        }
        int length = str.length() >= ending.length() ? str.length() - ending.length() : str.length();
        String strEnd = str.substring(length);

        return strEnd.equals(ending); //str.endsWith(ending); и больше ничего
    }

    public static void main(String[] args) {
        System.out.println(solution("abc", "abc"));
    }
}
