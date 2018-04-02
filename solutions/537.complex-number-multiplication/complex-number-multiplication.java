class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] str1 = a.split("\\+|i"); //+需要转义\+
        String[] str2 = b.split("\\+|i");
        int x1 = Integer.parseInt(str1[0]);
        int y1 = Integer.parseInt(str1[1]);
        int x2 = Integer.parseInt(str2[0]);
        int y2 = Integer.parseInt(str2[1]);
        return (x1*x2 - y1*y2) + "+" +(x2*y1 + x1*y2) + "i";
    }
}
