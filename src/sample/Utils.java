package sample;

public class Utils {

    public static void log(Object... args) {
        for(Object o : args) {
            System.out.print(o.toString() + " ");
        }
    }

    // 度数转弧度
    // test case: sin 90° == 1
    public static double angle2radian(double angle) {
        return angle / 180 * Math.PI;
    }

}
