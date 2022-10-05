# HeapSort [힙정렬]

### Min Heap

```
heapSort(A, n)
{
    buildHeap(A, n)
    for (i ← n) downto 2 {
        A[1] ↔ A[i];
        heapify(A, 1, i-1);
    }
}

buildHeap(A[], n)                                       // make 'A' to 'Heap'
{
    for i ← ⌊ n/2 ⌋ downto 1 {
        heapify(A, i, n);
    }
}

heapify(A, k, n) {                                      // n: max index(= array 'A' size), satisfy Heap's properties.
    left ← 2k; right ← 2k+1;                            // two child nodes
    if (right <= n) then {                              // have two child nodes
        if(A[left] < A[right]) then smaller ← left;
                               else smaller ← right;
    }
    else if (left <= n) then smaller ← left;            // only have left child node
    else return;                                        // A[k] is leaf node
    
    if (A[smaller] < A[k]) then {                       // change root node ↔ smaller node
        A[k] ↔ A[smaller];
        heapify(A, smaller, n);
    }    
}

```

### Max Heap

```
heapSort(A, n)
{
   buildHeap(A, n);
   for (i ← n) downto 2 {
        A[1] ↔ A[i];
        heapify(A, 1, i-1);
   }
}

buildHeap(A[], n)                                       // make 'A' to 'Heap'
{
    for (i ← ⌊ n/2 ⌋) downto 1 {
        heapify(A, i, n)
    }   
}

heapify(A, k, n) {                                      // n: max index(= array 'A' size), satisfy Heap's properties.
       left ← 2k; right ← 2k+1;
       if (right <= n) then {
          if(A[left] < A[right]) then large ← right;
                                 else large ← left;
       }
       else if (left <= n) then large ← left;
       else return;
       
       if (A[large] > A[k]) {
           A[large] ↔ A[k];
           heapify(A, large, n);
       }
}
```