/**
 * OOPSBannerApp UC3 – OOPS Banner Application using String.join()
 *
 * This program prints the word "OOPS" in banner format using stars (*)
 * and uses String.join() instead of string concatenation.
 *
 * @author Developer
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
                " ***** ",
                " ***** ",
                " ***** ",
                " ***** "
        ));

        System.out.println(String.join(" ",
                "*     *",
                "*     *",
                "*     *",
                "*      "
        ));

        System.out.println(String.join(" ",
                "*     *",
                "*     *",
                "*****  ",
                " ***** "
        ));

        System.out.println(String.join(" ",
                "*     *",
                "*     *",
                "*      ",
                "      *"
        ));

        System.out.println(String.join(" ",
                "*     *",
                "*     *",
                "*      ",
                "      *"
        ));

        System.out.println(String.join(" ",
                "*     *",
                "*     *",
                "*      ",
                "*     *"
        ));

        System.out.println(String.join(" ",
                " ***** ",
                " ***** ",
                "*      ",
                " ***** "
        ));

    }
}