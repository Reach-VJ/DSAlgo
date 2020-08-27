package target150.after150;

public class BulbSwitcherIV1529 {

    public static void main(String [] args) {
        String target = "11110";
        BulbSwitcherIV1529 bulb = new BulbSwitcherIV1529();
        System.out.println("Number of flips : "+bulb.minFlips(target));
    }

    public int minFlips(String target) {
        char preChar = '0';
        int minFlips = 0;
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != preChar) {
                minFlips++;
                preChar = preChar == '0' ? '1' : '0';
            }
        }
        return minFlips;
    }
}
