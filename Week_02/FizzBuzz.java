class Solution {
    public static String outFizz = "Fizz";
    public static String outBuzz = "Buzz";
    public static String outFizzBuzz = "FizzBuzz";
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        int i = 1;
        while ( i <= n) {
            if (i % 15 == 0) {
                res.add(outFizzBuzz);
                i++;
                continue;
            }
            if (i % 3 == 0) {
                res.add(outFizz);
                i++;
                continue;
            }
            if (i % 5 == 0) {
                res.add(outBuzz);
                i++;
                continue;
            }
            res.add(String.valueOf(i++));
        }
        return res;
    }
}
