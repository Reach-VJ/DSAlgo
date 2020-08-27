**Recursion functionality time and space complexity**

Time : O(n)   
Space : O(n) 

Note : Each function added to Stack to maintain caller state.

**Tail Recursion**

Recursion stores the state of caller function.
In modern compilers, if child function is last statement, it do not store the state of caller function. 
Its called child recursion. 

**Advantage** : Less space allocation for a stack. 

That is why Quick sort faster compare to Merge sort.
Use InOrder, PreOrder traverse in Tree traversal. It will take less space.

