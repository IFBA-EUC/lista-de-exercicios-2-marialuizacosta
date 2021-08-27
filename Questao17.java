public class Questao17 {
    static final int mi = 1;
    static final int ma = 999;
    static final String[] RN_CEM = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    static final String[] RN_DEZ = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    static final String[] RN_UNI = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};


   public String generate(int num){
      if (num < mi || num > ma) {
       throw new IllegalArgumentException(
       String.format("O número é maior do que o possível "));
        }

        return new StringBuilder()
                .append(RN_CEM[num % 1000 / 100])
                .append(RN_DEZ[num % 100 / 10])
                .append(RN_UNI[num % 10])
                .toString();
    }
}

