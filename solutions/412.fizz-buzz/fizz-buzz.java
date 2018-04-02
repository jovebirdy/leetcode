class Solution {
    public  List<String> fizzBuzz(int n) {
        final int size = n;
        return new java.util.AbstractList<String>() {
            public static final String FIZZ_BUZZ = "FizzBuzz";
            public static final String FIZZ = "Fizz";
            public static final String BUZZ = "Buzz";

            @Override
            public String get(int index) {
                index ++;
                if(index % 15 == 0){
                    return FIZZ_BUZZ;
                }else if(index % 3 == 0){
                    return FIZZ;
                }else if(index % 5 == 0){
                    return BUZZ;
                }else{
                    return String.valueOf(index);
                }
            }
            @Override
            public int size() {
                return size;
            }
        };
    }
}
