package bloc1;

public class FizzBuzz {

    public static String FIZZ = "Fizz";
    public static String BUZZ = "Buzz";
    public static String FIZZ_BUZZ = FIZZ+BUZZ;

    public String repondre(int value) {
//        if (value % 5 == 0 && value % 3 == 0)
//            return FIZZ_BUZZ;
//        if (value % 5 == 0)
//            return BUZZ;
//        if (value % 3 == 0)
//            return FIZZ;
//        return String.valueOf(value);


        if(value % 5 != 0 && value % 3 != 0)
            return String.valueOf(value);
        if(value % 5 != 0)
            return FIZZ;
        if(value % 3 != 0)
            return BUZZ;
        return FIZZ_BUZZ;
    }

    public String repondre2(int value) {
//        if (value % 5 == 0 && value % 3 == 0)
//            return FIZZ_BUZZ;
//        if (value % 5 == 0)
//            return BUZZ;
//        if (value % 3 == 0)
//            return FIZZ;
//        return String.valueOf(value);


        if(value % 5 != 0 && value % 3 != 0)
            return String.valueOf(value);
        if(value % 5 != 0)
            return FIZZ;
        if(value % 3 != 0)
            return BUZZ;
        return FIZZ_BUZZ;
    }
}
