import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> { // 람다함수를 통한 문제풀이

            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);

            if (c1 != c2) {
                return c1 - c2;
            }

            return s1.compareTo(s2); // 문자열 전체를 비교. 예시:'c'(99) - 'e'(101) = -2를 리턴
        });

        return strings;
    }
}