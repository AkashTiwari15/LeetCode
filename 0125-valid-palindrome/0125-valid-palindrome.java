class Solution {
    public boolean isLetterOrDigit1(char ch) {
    if ((ch >= 'a' && ch <= 'z') ||
        (ch >= 'A' && ch <= 'Z') ||
        (ch >= '0' && ch <= '9')) {
        return true;
    }
    return false;
}
    public boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder ans2 = new StringBuilder();

        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (isLetterOrDigit1(ch)) {
                ans.append(Character.toLowerCase(ch));
            }
        }

        String s1 = ans.toString();
        for (int i = s1.length() - 1; i >= 0; i--) {
            ans2.append(s1.charAt(i));
        }

        String s2 = ans2.toString();
        return s1.equals(s2);
    }
}