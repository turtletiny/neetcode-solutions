class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){  
            return false;
        }

        //initialise lists to store characters 
        char[] tChar = new char[t.length()];
        char[] sChar = new char[s.length()];


        //populate lists with characters
        for (int i = 0; i < s.length(); i++){  //note - we know they have the same length since it was checked first
            tChar[i] = t.charAt(i);
            sChar[i] = s.charAt(i);

        }

        //sort arrays alphabetically
        Arrays.sort(sChar); 
        Arrays.sort(tChar);

        return Arrays.equals(tChar, sChar); //returns boolean 

}
}