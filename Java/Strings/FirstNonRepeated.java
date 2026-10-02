//Java program to find first non repeated character in a string

class FirstNonRepeated {
    public static void main(String[] args) {
        String str = "aabbbccccddeeeeeefghhhiiij";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First Non-repeated Character: " + ch);
                break;
            }
        }
    }
}