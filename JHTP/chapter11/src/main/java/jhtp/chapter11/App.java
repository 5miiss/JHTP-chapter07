package jhtp.chapter11;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
            System.out.println(15/0);

        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
