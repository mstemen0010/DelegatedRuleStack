/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nocom.utils.skunk.rulestack;

import java.util.function.Function;

/**
 *
 * @author matthew.stemen
 */

public class RuleDelegateFunction implements Function<Object, String> {

    Delegate<String> localDelegate = null;
    String localDelegateType = null;

    @Override
    public String apply(Object t) {
        return localDelegate.convert(localDelegateType);
    }
    
    @FunctionalInterface
    public interface Delegate<T> {
        String convert(T t);
    }
    
    // Lambda to check an empty string
    static public Delegate<String> emptyString = s -> s = "" ;

    static public Delegate<String> toUpperString = s -> s.toUpperCase();
    
    static public Delegate<String> toLowerString = s -> s.toLowerCase();
    
    public RuleDelegateFunction(Delegate<String> delegate, String type)
    {
        this.localDelegate = delegate;
        this.localDelegateType = type;
    }
    
   
    
}
