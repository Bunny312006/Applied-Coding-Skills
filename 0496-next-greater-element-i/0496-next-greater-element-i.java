class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> S = new Stack<>();
        HashMap<Integer, Integer> m = new HashMap<>();
        
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!S.isEmpty() && nums2[i] >= S.peek()) {
                S.pop();
            }
            if (S.isEmpty()) {
                m.put(nums2[i], -1);
            } else {
                m.put(nums2[i], S.peek());
            }
            S.push(nums2[i]);
        }
        
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = m.get(nums1[i]);
        }
        return ans;
        
    }
}