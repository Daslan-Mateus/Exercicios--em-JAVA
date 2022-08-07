
public class Tabuada {
    public static void tabuada(int num) {
        System.out.println("---------------");
        for (int c = 0; c <= 10; c++) {
            int res = num * c;
            System.out.println(num + " * " + c + " = " + res);
        }
        System.out.println("---------------");

    }

    public static void main(String[] args) {
        tabuada(10);
    }

}
