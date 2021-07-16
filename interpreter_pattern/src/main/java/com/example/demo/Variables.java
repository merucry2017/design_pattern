package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class Variables {
    Map<Variable, Integer> var = new HashMap<>();
    public void put(Variable variable, int value) {
        var.put(variable, value);
    }

    public int get(Variable variable) {
        return var.get(variable);
    }
}
