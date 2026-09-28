import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();

        for (int input : asteroids) {
            boolean exploded = false;

            while (!s.isEmpty() && s.peek() > 0 && input < 0) {
                if (s.peek() > Math.abs(input)) {
                    exploded = true;
                    break;
                } else if (s.peek() < Math.abs(input)) {
                    s.pop();
                } else {
                    exploded = true;
                    s.pop();
                    break;
                }
            }

            if (!exploded) {
                s.push(input);
            }
        }

        int[] ans = new int[s.size()];
        for (int i = 0; i < s.size(); i++) {
            ans[i] = s.get(i);
        }

        return ans;
    }
}