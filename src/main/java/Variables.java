public class Variables {
    // Constant
    // final keyword makes it immutable
    public static final Integer test = 1;


    // Conversion of Types
    public static Integer convertStringToInteger(String string) {
        return Integer.valueOf(string);
    }

    public static String convertIntegerToString(Integer integer) {
        return String.valueOf(integer);
    }

    public static Float convertIntegerToFloat(Integer integer) {
        return Float.valueOf(integer);
    }

    public static Integer convertFloatToInteger(Float floatVar) {
        return Math.round(floatVar);
    }
}
