package target150.forty2fifty;

import java.text.DecimalFormat;

public class PowOfXandN {

	public static void main(String [] args) {

		Solution solution = new Solution();
		System.out.println(solution.myPow(2.00000
                ,10));
	}

}

class Solution {
    public double myPow(double x, int n) {
        if(n > Integer.MAX_VALUE || n <= (Integer.MIN_VALUE))
            return 0.0;
        if(n == 0 || x == 1 )
            return 1;
        if(n == 1)
            return x;
        boolean negativFlag = false;
        double pow = 1.0;

        if(n<0) {
        	n = Math.abs(n);
        	negativFlag = true;
        }

        for(int i = 0; i < n; i++) {
        	pow = pow * x;
        }

        return negativFlag == true ? 1/pow : pow;

    }
}
