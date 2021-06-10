public class ReverseWord {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
    public static String reverseWords(String s) {
        String[] string = s.split(" +");
        StringBuilder finalString = new StringBuilder();
        for(int i = string.length - 1;i>=0;i--){
            finalString.append(string[i]);
            finalString.append(" ");
        }
        return finalString.toString().strip();
    }
}
