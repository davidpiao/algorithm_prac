//title: 폰캣몬
//link - https://school.programmers.co.kr/learn/courses/30/lessons/1845
package lv1;

import java.util.HashSet;

class 폰캣몬 {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        HashSet<Integer> numsSet = new HashSet<>();

        for (int num : nums) {
            numsSet.add(num);
        }

        if (numsSet.size() > max) {
            return max;
        } else {
            return numsSet.size();
        }
    }
}
