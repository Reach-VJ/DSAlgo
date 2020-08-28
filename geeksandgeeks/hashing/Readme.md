**Hashing** 

1. Search, Insert and Delete --> O(1)
2. Size and isEmpty --> O(1)
3. Not useful for sorting, prefix and closest values.
4. Hash collision - Chaining
5. Three types of chaining.
   * LinkedList - O(l), not cache friendly. Java has implemented until 7.
   * ArrayList  - O(l), cache friendly.
   * Self balanced tree(AVL, Red black tree) - O(log l), no cache friendly. Java 8 using tree for chaining.

**HashSet**

Important methods : 
    add O(1) -> return true. Will get false if you add an existing element.
    contains O(1) --> return ture if elements exists.
    remove O(1) --> return true if success.
    
Loop through elements by two ways, Iteration or enhanced for loop.

        Iterator<Integer> iterator = hashSet.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        
        for(Integer integer : hashSet) {
                    System.out.print(integer+" ");
        }
    
    
    
    