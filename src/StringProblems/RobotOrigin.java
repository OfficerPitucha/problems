package StringProblems;

import java.util.Map;

public class RobotOrigin {
    public boolean judgeCircle(String moves) {
        Map<Character, Integer[]> horizontal = Map.of('L', new Integer[]{-1, 0}, 'R', new Integer[]{1, 0}, 'D', new Integer[]{0, -1}, 'U', new Integer[]{0, 1});
        int horSum = 0;
        int verSum = 0;
        for (int i = 0; i < moves.length(); i++){
            horSum += horizontal.get(moves.charAt(i))[0];
            verSum += horizontal.get(moves.charAt(i))[1];
        }
        return horSum == 0 && verSum == 0;
    }
}
