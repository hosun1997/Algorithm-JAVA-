# BubbleSort[버블정렬]

## 1. Ascending SelectionSort( base : fill in from the right )

```
bubbleSort(A[], n)
{
    for (last ← n) downto 2 {
        for (i ← 1) to last -1 {
            if (A[last] < A[i]) then A[last] ↔ A[i]; 
        }       
    }
}
```

```
bubbleSort(A[], n)                  // Upgrade-Version
{
    for (last ← n) downto 2 {
        stored ← TRUE;
        for (i ← 1) to last -1 {
            if (A[last] < A[i]) then { 
            A[last] ↔ A[i];
            stored ← FALSE;
            }
        }       
        if (stored = TRUE) then return;
    }
}
```

## 2. Ascending SelectionSort( base : fill in from the left)

```
bubbleSort(A[], n)
{
    for (i ← 1) to n {
        stored ← TRUE;
        for(last ← n) downto 2 {
            if(A[last] < A[last-1]) then {
                A[last] ↔ A[last-1];
                stored ← FALSE;                 
            }
        }
        if (stored = TRUE) then return;
    }
}
```

## 3. Descending SelectionSort( base : fill in from the right)

```
bubbleSort(A[], n)
{
    for (last ← n) downto 2 {
        stored ← TRUE;
        for (i ← 1) to last-1 {
            if(A[i] < A[i+1]) then {
                A[i] ↔ A[i+1];
                stored ← FALSE;                 
            }
        }
        if (stored = TRUE) then return;
    }
}
```

## 4. Descending SelectionSort( base : fill in from the left)

```
bubbleSort(A[], n)
{
    for (i ← 1) to n {
        stored ← TRUE;
        for (last ← n) to 2 {
            if(A[last] > A[last-1]) then {
                A[last] ↔ A[last-1];
                stored ← FALSE;                 
            }
        }
        if (stored = TRUE) then return;
    }
}
```