/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nocom.utils.skunk.rulestack;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Function;

/**
 *
 * @author matthew.stemen
 */
public class RuleElement {
    
    public enum RuleBlock implements Function<Object, String> {
        
        RuleBlockUndefined( null, "empty", "empty", "empty"),
        RuleBlockOne( null, "RuleOneKey", "RuleOneName", "RuleOneData" ),
        RuleBlockTwo( null, "RuleTwoKey", "RuleTwoName", "RuleTwoData" ),
        RuleBlockThree( null, "RuleThreeKey", "RuleThreeName", "RuleThreeData" )
        ;
        
        private RuleDelegateFunction.Delegate funct;
        
        private String blockKey = null;
        private String blockName = null;
        private String blockData = null;
        
        RuleBlock( RuleDelegateFunction.Delegate funct, String ruleBlockKey, String ruleBlockName, String ruleBlockData  ) {
            this.funct = funct;
            this.blockKey = ruleBlockKey;
            this.blockName = ruleBlockName;
            this.blockData = ruleBlockData;
        }
        
        public String getBlockKey() {
            return blockKey;
        }
        
        public String getBlockName() {
            return blockName;
        }
          
        public String getBlockData() {
            return blockData;
        }
        
        public void bindDelegate( RuleDelegateFunction.Delegate  newDelegate) {
            this.funct = newDelegate;
        }

        @Override
        public String apply(Object t) {
            String ts = "";
            if( funct != null ) {
                ts = funct.convert(t);
            }                            
            return ts;
        }
             
        public static RuleBlock getRuleBlockForString(String ruleBlockName) {
           
            RuleBlock ruleBlockFound = RuleBlockUndefined;
            Iterator<RuleBlock> it = Arrays.asList(RuleBlock.values()).iterator();
            while(it.hasNext()) {    
                ruleBlockFound = it.next();                    
                if( ruleBlockFound != null && ruleBlockFound.equals(ruleBlockName)) {
                    break;
                }            
            }
            return ruleBlockFound;
        }
    }            
}
