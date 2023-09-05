//title: 키패드 누르기
//link - https://school.programmers.co.kr/learn/courses/30/lessons/67256
package etc;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int left = 10; // *의 값
        int right = 12; // #의 값

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                left = number;
            } else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                right = number;
            } else {
                int leftDist = getDistance(left, number);
                int rightDist = getDistance(right, number);

                if (leftDist < rightDist || (leftDist == rightDist && hand.equals("left"))) {
                    answer.append("L");
                    left = number;
                } else {
                    answer.append("R");
                    right = number;
                }
            }
        }

        return answer.toString();
    }

    private int getDistance(int thumb, int target) {
        thumb = (thumb == 0) ? 11 : thumb;
        target = (target == 0) ? 11 : target;

        int thumbX = (thumb - 1) / 3;
        int thumbY = (thumb - 1) % 3;
        int targetX = (target - 1) / 3;
        int targetY = (target - 1) % 3;

        return Math.abs(thumbX - targetX) + Math.abs(thumbY - targetY);
    }
}






