import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by eplisgh on 21/11/2016.
 */
public class RealEstate {

    public void setClientSpace() {
        Map<Integer,Integer> clientSpace=new HashMap<Integer, Integer>();
        Map<Integer,Integer> houseSpace=new HashMap<Integer, Integer>();

        clientSpace.put(5,110);
        clientSpace.put(9,500);
        clientSpace.put(20,400);

        houseSpace.put(10,100);
        houseSpace.put(2,200);
        houseSpace.put(30,300);

        for(Integer i : clientSpace.keySet()){
            if(!clientSpace.get(i).equals(houseSpace.get(i))){

            }
        }

    }
    public static void main(String args[]){
        RealEstate realEstate=new RealEstate();
        realEstate.setClientSpace();
    }
}
