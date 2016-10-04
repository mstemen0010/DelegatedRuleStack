/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nocom.utils.skunk;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


/**
 *
 * @author matthew.stemen
 * 
 * A type of ArrayDeque, is a better and more efficient improvement of 
 * java.util.Vector that allows the array elements to be in a  given layer and 
 * also to able to get all the elements as iterator 
 * by specifying a specific layer by id
 * 
 * @param <E>
 */


public class LayeredArrayDeque<E> extends ArrayDeque<E>{
       
    public enum Order {
        Asc,
        Dsc;
    }
    
    
    
    private HashSet<Integer> layerIds;        
    private Integer currentLayerId = -1;
    private Order currentSortOrder = Order.Asc;
        
    public LayeredArrayDeque( )
    {
        layerIds = new HashSet<>();
        
    }
    
    public void setOrder( Order newOrder )
    {
        this.currentSortOrder = newOrder;
    }

    /**
     * @param layerIdToSet the currentLayerId to set
     */
    public void setCurrentLayerId(Integer layerIdToSet) {
        if( this.layerIds.contains(layerIdToSet)) {
            this.currentLayerId = layerIdToSet;    
        }        
    }
    
    @Override
    public Iterator<E> iterator(){
        // return an iterator based on the current layerId
        ArrayList<E> elements = new ArrayList<>();
        
        return elements.iterator();
    }
    
    
    
}
