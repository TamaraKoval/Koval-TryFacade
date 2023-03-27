public class Main {

    public static void main(String[] args) {

        BinOps bins = new BinOps();

        System.out.println(bins.sum("101", "110")); // 5 + 6 = 11(10), т.е. 1011(2);

        System.out.println(bins.mult("101", "110")); // 5 * 6 = 10(10), т.е. 11110(2)

        System.out.println(bins.sum("8", "10")); // неподходящий аргумент
    }
}
