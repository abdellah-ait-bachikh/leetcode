

class PolindromBumber {

    static public boolean isPalindrome(int x) {
        for (int i = 0, j = Integer.toString(x).length() - 1; i < j; i++, j--) {
            if (Integer.toString(x).charAt(i) != Integer.toString(x).charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print(isPalindrome(12321));
    }

}