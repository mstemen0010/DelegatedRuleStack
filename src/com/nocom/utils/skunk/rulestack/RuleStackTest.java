/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nocom.utils.skunk.rulestack;

import com.nocom.utils.skunk.rulestack.RuleElement.RuleBlock;
import java.util.Iterator;

/**
 *
 * @author matthew.stemen
 */
public class RuleStackTest {
    
    
   
    
    
   
    public static void main(String[] args) {
        
        RuleDelegateFunction.Delegate delegateOne = RuleDelegateFunction.emptyString;
        RuleDelegateFunction.Delegate delegateTwo = RuleDelegateFunction.toLowerString;
        RuleDelegateFunction.Delegate delegateThree = RuleDelegateFunction.toUpperString;
        
        RuleStackTest myRuleStackTest = new RuleStackTest();
        RuleStack myRuleStack = new RuleStack();
       
        
        RuleBlock myRuleBlockOne = RuleBlock.RuleBlockOne;
        RuleBlock myRuleBlockTwo = RuleBlock.RuleBlockTwo;
        RuleBlock myRuleBlockThree = RuleBlock.RuleBlockThree;
        
        myRuleBlockOne.bindDelegate(delegateOne);
        myRuleBlockTwo.bindDelegate(delegateThree);
        myRuleBlockThree.bindDelegate(delegateTwo);
        
        myRuleStack.add(myRuleBlockOne);
        myRuleStack.add(myRuleBlockTwo);
        myRuleStack.add(myRuleBlockThree);
        
        
        Iterator<RuleBlock> it = myRuleStack.iterator();
        while(it.hasNext()) {
            RuleBlock rb = it.next();
            if( rb != null ) {
                String s = rb.apply("Test");
                System.out.println("s = " + s );
                
                switch( rb ) {
                    case RuleBlockOne:
                        rb.apply("Data");
                        break;
                    case RuleBlockTwo:
                        rb.apply("Data");
                        break;
                    case RuleBlockThree:
                        rb.apply("Data");
                        break;
                }
            }
                
        }
        
        
    }
}
