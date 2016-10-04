/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nocom.utils.skunk.rulestack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/**
 *
 * @author matthew.stemen
 */
public class RuleStack implements List<RuleElement.RuleBlock> 
{
    
    List<RuleElement.RuleBlock> myList = new ArrayList<>();
    
    @Override
    public int size() {
        return myList.size();
    }

    @Override
    public boolean isEmpty() {
        return myList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return myList.contains(o);
    }

    @Override
    public Iterator<RuleElement.RuleBlock> iterator() {
        return myList.iterator();
    }

    @Override
    public Object[] toArray() {
        return myList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return myList.toArray(a);
    }

    @Override
    public boolean add(RuleElement.RuleBlock e) {
        return myList.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return myList.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return myList.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends RuleElement.RuleBlock> c) {
        return myList.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return myList.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return myList.removeAll(c);
    }

    @Override
    public void clear() {
        myList.clear();
    }

    @Override
    public List<RuleElement.RuleBlock> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<RuleElement.RuleBlock> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection<? extends RuleElement.RuleBlock> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RuleElement.RuleBlock get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RuleElement.RuleBlock set(int index, RuleElement.RuleBlock element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int index, RuleElement.RuleBlock element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RuleElement.RuleBlock remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<RuleElement.RuleBlock> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
