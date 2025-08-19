package easy;
class PolindromBumber {

    static public boolean isPalindrome(int x) {
        String stringNumber = Integer.toString(x);
        for (int i = 0, j = stringNumber.length() - 1; i < j; i++, j--) {
            if (stringNumber.charAt(i) != stringNumber.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.print(isPalindrome(123));
    }

}