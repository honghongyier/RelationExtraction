// Relation Extraction using Composite Kernel -- RECK
// -- a kernel-based relation extractor
// Copyright (c) 2011
// Truc-Vien T. Nguyen. All Rights Reserved.
//
// RECK is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.

// RECK is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.

// You should have received a copy of the GNU General Public License
// along with RECK.  If not, see <http://www.gnu.org/licenses/>.
//
// For more information, bug reports, fixes, contact:
//    Truc-Vien T. Nguyen
//    trucvien.nguyen@gmail.com
//    http://sites.google.com/site/trucviennguyen/

package reck;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * An interface that act as a set of relations.
 *
 * @author Truc-Vien T. Nguyen
 */
public interface RelationSet extends Set {

    /** The size of this set */
    public int size();
    
    /** Returns true if this set contains no elements */
    public  boolean isEmpty();
    
    /** Returns true if this set contains the specified element */
    public  boolean contains(Object o);
    
    /** Get an iterator for this set */
    public Iterator iterator();
    
    /** Returns an array containing all of the elements in this set */
    //public Object[] toArray();
    
    //public Object[] toArray(Object[] a);
    
    /** Add an existing relation. Returns true when the set is modified. */
    public  void add(String id, String type, String subtype, 
            Entity entity1, Entity entity2, ArrayList relationTree, 
            Mention mention1, Mention mention2);
    
    /** Add an existing entity. Returns true when the set is modified. */
    public  boolean add(Object o);
    
    /** Add an existing relation. Returns true when the set is modified. */
    public  boolean remove(String id);
    
    /** Remove an element from this set. */
    public  boolean remove(Object o);
    
    /** 
     * Returns true if this set contains all of the elements of the 
     *  specified collection
     */
    // public  boolean containsAll(Collection c);
    
    /**
     * Adds all of the elements in the specified collection to this set if
     * they're not already present (optional operation)
     */
    public boolean addAll(Collection c);
    
    /**
     * Retains only the elements in this set that are contained in the
     * specified collection (optional operation)
     */
    // public  boolean retainAll(Collection c);
    
    /**
     * Removes from this set all of its elements that are contained in the
     * specified collection (optional operation)
     */
    // public  boolean removeAll(Collection c);
    
    /** Removes all of the elements from this set (optional operation) */
    // public void clear();


    // Comparison and hashing

    /** Compares the specified object with this set for equality */
    // public  boolean equals(Object o);

    /** Returns the hash code value for this set */
    // public int hashCode();
    
    /** Get a relation by its Id */
    public Relation getRelationById(String id);
    
    public Relation getRelationByMentions(Mention mention1, Mention mention2);
    
    /** Get all relations */
    public RelationSet get();

    /** Select relations by type */
    public RelationSet get(String type);

    /** Select relations by a set of types. Expects a Set of String. */
    public RelationSet get(Set types);

    /** Get the document this set is attached to. */
    public Document getDocument();
}
