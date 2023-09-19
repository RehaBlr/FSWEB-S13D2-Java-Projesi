public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("isPalindrome");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(55162));
        System.out.println(isPalindrome(98655689));

        System.out.println("isPalindromeSecond");
        System.out.println(isPalindromeSecond(-1221));
        System.out.println(isPalindromeSecond(11212));
        System.out.println(isPalindromeSecond(55162));
        System.out.println(isPalindromeSecond(98655689));

        System.out.println("isPerfectNumber");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println(isPerfectNumber(0));

        System.out.println("numberToWords");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
        System.out.println(numberToWords(1007));

        System.out.println("getEventDigitSum");
        System.out.println(getEventDigitSum(1234));
        System.out.println(getEventDigitSum(111124));
        System.out.println(getEventDigitSum(-9543256));

        System.out.println("getFirstDigitAndLastDigitSum");
        System.out.println(getFirstDigitAndLastDigitSum(123));
        System.out.println(getFirstDigitAndLastDigitSum(565));
        System.out.println(getFirstDigitAndLastDigitSum(253));

        System.out.println("hasSameLastDigit");
        System.out.println(hasSameLastDigit(123,563,12));
        System.out.println(hasSameLastDigit(565,869,2,9));
        System.out.println(hasSameLastDigit(253,555,981));

    }

    public static boolean isPalindrome(int num){
        int number = Math.abs(num);
        char[] digits = String.valueOf(number).toCharArray();
        String reversed = "";

        for(int i = digits.length-1; i>=0 ; i--){
            reversed += digits[i];
        }
        return reversed.equals(String.valueOf(number));
    }
    public static boolean isPalindromeSecond(int num){
        num = Math.abs(num);
        int originalNum = num;
        int reversedNumber = 0;
        while(num >0){
            int digit = num%10;
            reversedNumber = reversedNumber*10 +digit;
            num = num/10;
        }
        return originalNum ==reversedNumber;
    }

    public static boolean isPerfectNumber (int num){
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return num == sum;
    }

    public static String numberToWords(int num){
        if (num < 0) {
            return "Invalid Value";
        }
        String text = "";
        char[] numArray = String.valueOf(num).toCharArray();
        for (char digit : numArray) {
            switch (digit) {
                case '0':
                    text += "Zero ";
                    break;
                case '1':
                    text += "One ";
                    break;
                case '2':
                    text += "Two ";
                    break;
                case '3':
                    text += "Three ";
                    break;
                case '4':
                    text += "Four ";
                    break;
                case '5':
                    text += "Five ";
                    break;
                case '6':
                    text += "Six ";
                    break;
                case '7':
                    text += "Seven ";
                    break;
                case '8':
                    text += "Eight ";
                    break;
                case '9':
                    text += "Nine ";
                    break;
            }
        }
        return text.trim();
    }

    public static int getEventDigitSum(int num) {
        num = Math.abs(num);

        int sum = 0;
        while (num > 0) {

            if (num % 2 == 0) {
                sum += num % 10;
            }
            num = num / 10;
        }
        return sum;
    }

    public static int getFirstDigitAndLastDigitSum(int num) {
        int lastDigit = num % 10;
//        char[] numChars = String.valueOf(num).toCharArray();

        int firstDigit = Integer.parseInt(String.valueOf(num).substring(0, 1));
        return lastDigit + firstDigit;

    }
    public static boolean hasSameLastDigit(int ...nums){
        int[] digits = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            digits[i] = nums[i] % 10;
        }

        for(int i = 0; i < digits.length; i++){
            for(int j = i + 1; j < digits.length; j++){
                if(digits[i] == digits[j]){
                    return true;
                }
            }
        }

        return false;

    }
}