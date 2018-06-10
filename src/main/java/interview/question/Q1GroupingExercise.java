package interview.question;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeMap;
public class Q1GroupingExercise {

    private static Map<String, Integer> namesToNumPurchases = new HashMap<String, Integer>() {{
        put("Chris", 10);
        put("Bob", 5);
        put("David", 5);
        put("Sue", 12);
        put("Jim", 3);
    }};

    /*
        Required output:

        3: Jim
        5: Bob, David
        10: Chris
        12: Sue
     */

    public static void main(String[] args) {
        Iterator<Map.Entry<String, Integer>> it = namesToNumPurchases.entrySet().iterator();
        Map<Integer,List<String>> result = new HashMap<Integer,List<String>>();
        while (it.hasNext()) {
            Map.Entry<String, Integer> pair = it.next();
            Integer id = pair.getValue();
            String name = pair.getKey();
            if ( result.containsKey(id)) {
                List<String> listStr = result.get(id);
                listStr.add(name);
            }
            else {
                List<String> newList = new ArrayList<String>();
                newList.add(name);
                result.put(id,newList);
            }
        }
        Map<Integer, List<String>> treeMap = new TreeMap<Integer,List<String>>(result);

        for (Integer id : treeMap.keySet()) {
            StringBuffer buf = new StringBuffer();
            buf.append(id);
            buf.append(":");
            List<String> names = treeMap.get(id);
            for(String name:names) {
                buf.append(name+",");
            }
            String outStr = buf.toString();
            System.out.println(outStr.substring(0,outStr.length() -1));
        }
    }
}
