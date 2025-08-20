
class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] elements) {
        if(elements == null || elements.length == 0)return "no result";
        String firstElement = elements[0];
        String result = "";
        for(int i =0 ;i<firstElement.length();i++){
            char currentChar = firstElement.charAt(i);
            for (int j =1 ; j< elements.length;j++){
                if(i>=elements[j].length() || elements[j].charAt(i)!= currentChar){
                    return result;
                }
            }
            result = result+currentChar;
        }

        return result;
    }

    public static void main(String args[]) {
        System.out.println(longestCommonPrefix(new String[] { "flower", "flow", "floght" }));
    }
}
