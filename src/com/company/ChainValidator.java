package com.company;

import java.util.HashMap;
import java.util.List;

public class ChainValidator {

    private final HashMap<Integer, Boolean> map = new HashMap<>(); // key = hash, value = true if the character is present, and false otherwise
    private int missing = 0;

    private void annaliseInt (int n, boolean singleItem) {
        Boolean b = map.get(n);
        if (b == null) {
            if (singleItem) {
                map.put(n, true);
            } else {
                map.put(n, false);
                missing++;
            }
        } else if (!b && singleItem) {
            map.put(n, true);
            missing--;
        }
    }

    public boolean validate (List<Node> nodes) {
        missing = 0;
        map.clear();
        for (Node node: nodes) {
            List<Integer> keys = node.getKeys();
            if (keys.size() == 1) {
                annaliseInt(keys.get(0), true);
            } else {
                for (Integer key: keys) {
                    annaliseInt(key, false);
                }
            }
        }
        return missing == 0;
    }

}
