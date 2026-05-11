class Solution {
    public boolean isAnagram(String s, String t) {
        // brute force approach : Sorted array
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b); 

    }
}
