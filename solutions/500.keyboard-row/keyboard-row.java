class Solution {
    public String[] findWords(String[] words) {
        String line1 = "qwertyuiop", line2 = "asdfghjkl", line3 = "zxcvbnm";
        ArrayList str = new ArrayList();
        for(int i = 0; i < words.length; i++){
            if(containsAll(line1, words[i]) || containsAll(line2, words[i]) || containsAll(line3, words[i])) str.add(words[i]);
        }
        return (String[])str.toArray(new String[str.size()]);   
    }
    
    public boolean containsAll(String line, String words) {
        char c;
        words = words.toLowerCase();
        for(int i = 0; i < words.length(); i++){
            c = words.charAt(i);
            if(line.indexOf(c) == -1) return false;
        }
        return true;
    }
}
