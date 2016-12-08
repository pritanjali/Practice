import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by eplisgh on 11/10/2016.
 */
public class SockMerchant {

    public int calculatePair(final Integer values[]){
        Map<Integer, Integer> pairs= new HashMap<Integer, Integer>();

        for(int i=0;i<values.length;i++)

        {

            if(pairs.containsKey(values[i]))
            {
                int val=pairs.get(values[i]);
                pairs.remove(values[i]);
                pairs.put(values[i],++val);
            }
            else
                pairs.put(values[i],1);
        }

        int count=0;
        for (Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
            int val=entry.getValue()/2;
            count=count+val;
        }

       return count;

    }
    }

