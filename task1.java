// 1 Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов
//  c1 и c2, начиная с c1.

// Пример. (n = 6, c1='a', c2='b') -> "ababab"
// (n = 8, c1='x', c2='y') -> "xyxyxyxy"

// static String buildString(int n, char c1, char c2) {
//     // TODO: 28.03.2023 Домашнее задание!
//     return null;

public class task1 {

    public static String ConcatChar(int n, char c1, char c2) {
        StringBuilder str = new StringBuilder();
        char currentChar = c1;
        for (int i = 0; i < n; i++) {
            str.append(currentChar);
            currentChar = (currentChar == c1) ? c2 : c1;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        int n = 6;
        char c1 = 'a';
        char c2 = 'b';
        String result = ConcatChar(n, c1, c2);
        System.out.println(result);
    }
}