package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> tails = new ArrayList<>(value.length()+1);

        for(int valueIndex = 0; valueIndex <= value.length(); valueIndex++) {
            tails.add(value.substring(valueIndex));
        }

        return tails;
    }
}
