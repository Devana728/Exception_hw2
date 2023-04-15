

/*2) Если необходимо, исправьте данный код
    try {
       int d = 0;
       double catchedRes1 = intArray[8] / d;
       System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
       System.out.println("Catching exception: " + e);
    }
    */
public class TASK2 {

    public static void main(String[] args) {

        devArray();
    }




    public static void devArray () {

        int[] intArray = {1, 2, 3, 4, 6, 7, 8, 9};

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound " + e);
        } catch (NullPointerException e) {
            System.out.println("Nulls are not alowed" + e);
        }
    }

}