public class Main {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder buffer = new StringBuilder();

        short index = 0;
        short first_length = (short) strs[0].length();
        Character temp;

        while (index < first_length) {
            temp = strs[0].charAt(index);
            for (int i = 0; i < strs.length; i++) {
                if (index >= strs[i].length() || !temp.equals(strs[i].charAt(index))) {
                    return buffer.toString();
                }
            }
            buffer.append(temp);
            index++;
        }

        return buffer.toString();
    }
}