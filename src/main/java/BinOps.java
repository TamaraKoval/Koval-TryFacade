public class BinOps {

    public String sum(String a, String b) throws NumberFormatException {
        String result = null;
        try {
            int aBin = Integer.parseInt(a, 2);
            int bBin = Integer.parseInt(b, 2);
            result =  Integer.toBinaryString(aBin + bBin);
        } catch (NumberFormatException exception) {
            System.out.println("Ошибка вычислений: Неподходящий аргумент");
        }
        return result;
    }

    public String mult(String a, String b) {
        String result = null;
        try {
            int aBin = Integer.parseInt(a, 2);
            int bBin = Integer.parseInt(b, 2);
            result =  Integer.toBinaryString(aBin * bBin);
        } catch (NumberFormatException exception) {
            System.out.println("Ошибка вычислений: Неподходящий аргумент");
        }
        return result;
    }
}