    // Chapater 1, 1.1-Is Unique
	// Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
	
	// Using a Set
	public Boolean isUnique(String input) {
		if (input.length() > 128)
			return false; // you cannot have more than 128 unique characters in ASCII
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (!characterSet.contains(letter)) {
                characterSet.add(letter);
            } else {
                return false;
            }
        }

        return true;
    }
	
	// Using an Array [ASCII]
	public Boolean isUnique(String input) {
		if (input.length() > 128)
			return false; // you cannot have more than 128 unique characters in ASCII
        int[] ascii = new int[128];
        for (int i = 0; i < input.length(); i++) {
            int index = (int) input.charAt(i); // casting to an int to get the characters ascii conversion
            if (ascii[index] == 0) {
                ascii[index] = 1;
            } else if (ascii[index] == 1)
                return false;
        }

        return true;
    }