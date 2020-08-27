package target150.onetoten;

public class IntReverse7 {

    public static void main(String [] args) {
        //int intValue = -926;
        int intValue = Integer.MAX_VALUE+1111;
        int reverseInt = new IntReverse7().reverse1(intValue);
        System.out.println("Integer : "+intValue +" Reverse : "+reverseInt);
    }

    //Normal Approach
    public int reverse(int x) {

        String intStr = String.valueOf(x);
        int startIndex = 0;
        int endIndex = intStr.length()-1;

        if(intStr.charAt(startIndex) =='-')
            startIndex++;
        if(intStr.charAt(intStr.length()-1) == '0')
            endIndex++;
        StringBuilder subString = new StringBuilder(intStr.substring(startIndex,endIndex));

        String sign = startIndex == 1 ? "-":"";

        x = Integer.parseInt(sign+subString.reverse().toString());

        return x;
    }

    //Better Approach
    public int reverse1(int x) {
        long finalValue = x;
        long result = 0;

        while(finalValue != 0) {
            result = result*10+finalValue%10;
            finalValue = finalValue/10;
        }

        if(result > Integer.MAX_VALUE || result <Integer.MIN_VALUE) return 0;
        return (int)result;

    }
}


