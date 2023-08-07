
import java.util.*;
public class Cash implements IPayment {
    @Override
    public void pay(User user,IService service) {
        Random r = new Random();
        int number = r.nextInt();
        // number stores the random integer in decimal form
        String Hexadecimal = Integer.toHexString(number);
        // toHexString(n) converts number to hexadecimal form
        System.out.println("Please use Payment code #" + Hexadecimal+" to pay in any payment system");
        user.setTransactionStatus(true);
    }
}
