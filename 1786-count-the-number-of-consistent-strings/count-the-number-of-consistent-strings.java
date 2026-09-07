class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        HashSet<Character> s = new HashSet<>();

        for(char c : allowed.toCharArray()) {
            s.add(c);
        }

        int cn = 0;

        for(String w : words) {

            boolean r = true;

            for(char c : w.toCharArray()) {

                if(!s.contains(c)) {
                    r = false;
                    break;
                }
            }

            if(r) {
                cn++;
            }
        }

        return cn;
    }
}