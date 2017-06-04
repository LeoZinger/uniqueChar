import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by leo.zinger on 5/22/17.
 */
public class UniqueChar {
    Boolean uniqueChars(String s){
        HashSet<Character> hashset = new HashSet();
        int len = s.length();

        for (int i = 0; i < len; i++){
            //hashMap.put(s.charAt[i], hashMap.get(charAt[i] + 1));
            if (hashset.contains(s.charAt(i)))
            {
                return false;
            }
            else
            {
                hashset.add(s.charAt(i));
            }
        }

        return true;

    }
}
