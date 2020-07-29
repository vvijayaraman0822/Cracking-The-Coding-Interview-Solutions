// Chapater 1, 1.2-Check Permutations
// Given two Strings, write a method to decide if one is a permutation of another 
// Example - String a = "HeyThere", String b = "HyeThree", return true;
 
	private static boolean isPermutations(String a, String b) {
        if (a.length() != b.length())
            return false;
        HashMap<Character, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char letter = a.charAt(i);
            if (!resultMap.containsKey(letter)) {
                resultMap.put(letter, 1);
            } else {
                resultMap.put(letter, resultMap.get(letter) + 1);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            char letter = b.charAt(i);
            if (!resultMap.containsKey(letter)) {
                return false;
            } else {
                resultMap.put(letter, resultMap.get(letter) - 1);
            }
        }

        Set<Integer> finalSet = new HashSet<Integer>(resultMap.values());
        return finalSet.size() == 1 && finalSet.contains(0);
    }
