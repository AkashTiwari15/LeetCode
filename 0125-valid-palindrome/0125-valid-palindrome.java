// class Solution {
//     public boolean isLetterOrDigit1(char ch) {
//     if ((ch >= 'a' && ch <= 'z') ||
//         (ch >= 'A' && ch <= 'Z') ||
//         (ch >= '0' && ch <= '9')) {
//         return true;
//     }
//     return false;
// }
//     public boolean isPalindrome(String s) {
//         StringBuilder ans = new StringBuilder();
//         StringBuilder ans2 = new StringBuilder();

//         int n = s.length();
//         for (int i = 0; i < n; i++) {
//             char ch = s.charAt(i);
//             if (isLetterOrDigit1(ch)) {
//                 ans.append(Character.toLowerCase(ch));
//             }
//         }

//         String s1 = ans.toString();
//         for (int i = s1.length() - 1; i >= 0; i--) {
//             ans2.append(s1.charAt(i));
//         }

//         String s2 = ans2.toString();
//         return s1.equals(s2);
//     }
// }

class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);

            // Skip non-alphanumeric from left
            if (!((ch1 >= 'A' && ch1 <= 'Z') ||
                  (ch1 >= 'a' && ch1 <= 'z') ||
                  (ch1 >= '0' && ch1 <= '9'))) {
                left++;
                continue;
            }

            // Skip non-alphanumeric from right
            if (!((ch2 >= 'A' && ch2 <= 'Z') ||
                  (ch2 >= 'a' && ch2 <= 'z') ||
                  (ch2 >= '0' && ch2 <= '9'))) {
                right--;
                continue;
            }

            // Convert uppercase to lowercase
            if (ch1 >= 'A' && ch1 <= 'Z') {
                ch1 = (char)(ch1 + 32);
            }

            if (ch2 >= 'A' && ch2 <= 'Z') {
                ch2 = (char)(ch2 + 32);
            }

            // Compare characters
            if (ch1 != ch2) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}