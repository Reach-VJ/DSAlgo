package target150.after150;

public class NumberOfStepsToZero1342 {

    public static void main(String[] args) {
        NumberOfStepsToZero1342 stepsObj = new NumberOfStepsToZero1342();
        int steps = stepsObj.numberOfSteps(123);
        System.out.println("Steps -> " + steps);
    }

    int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if(num%2 == 0 )
                num/=2;
            else
                num--;
            steps++;
        }
        return steps;
    }
}

