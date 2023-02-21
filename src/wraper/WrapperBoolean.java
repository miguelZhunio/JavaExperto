package wraper;

public class WrapperBoolean {
    public static void ClaseBoolean() {
        Integer num1 = 6, num2 = 43;

        boolean primBoolean = num1 > num2; // false
        Boolean BooleanObj = Boolean.valueOf(primBoolean);
        Boolean objBoo = Boolean.valueOf(num1 > num2);
        Boolean objBoo2 = objBoo;

        System.out.println("objBoo2 == objBoo = " + (objBoo2 == objBoo));

        System.out.println("objBoo == primBoolean = " + (objBoo == primBoolean));
        System.out.println("(objBoo2 == primBoolean = " + (objBoo2 == primBoolean));

        boolean primBoolean2 = objBoo.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);

        // Reflexion o metadata del objeto
        // control + d

        


    }
}
