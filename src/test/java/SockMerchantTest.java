import org.junit.Test;

import java.util.Map;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by eplisgh on 11/10/2016.
 */
public class SockMerchantTest {

    @Test
    public void calculatePair(){
        SockMerchant sockmerchant=new SockMerchant();
        final Integer[] values = new Integer[]{10,20,20,10,10,30,50,10,20,20};
        final int result = sockmerchant.calculatePair(values);
        assertEquals(4, result);

    }
}
