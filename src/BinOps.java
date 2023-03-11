public class BinOps {
    public String sum(String a, String b) {
        int i = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        int result = i + y;
        System.out.println("Результат сложения переведенных строк из двоичной системы в int: \n" + result);
        String binary = Integer.toBinaryString(result);
        System.out.println("Результат перевода из int в двоичную систему: ");
        return binary;
    }

    public String mult(String a, String b) {
        int n = Integer.parseInt(a, 2);
        int m = Integer.parseInt(b, 2);
        int result = n * m;
        System.out.println("Результат умножения переведенных строк из двоичной системы в int: \n" + result);
        String binary = Integer.toBinaryString(result);
        System.out.println("Результат перевода из int в двоичную систему: ");
        return binary;
    }
}