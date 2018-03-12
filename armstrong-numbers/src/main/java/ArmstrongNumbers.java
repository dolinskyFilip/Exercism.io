class ArmstrongNumbers {


    boolean isArmstrongNumber(int numberToCheck) {
        String l = Integer.toString(numberToCheck);
        int digitAmount = l.length();
        int result = 0;
        int lastDigit;
        int temp=numberToCheck;
        while (temp != 0) {
            lastDigit = temp % 10;
            result += Math.pow(lastDigit, digitAmount);
            temp /= 10;
        }
        return(numberToCheck==result);
    }
}
