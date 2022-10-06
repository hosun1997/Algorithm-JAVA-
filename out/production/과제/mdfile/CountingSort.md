# CountingSort [계수정렬]

## (1 <= n < k)

```
countingSort(A[], B[], n)
{
    for (i ← 1) to k
        C[i] ← 0;
    
    for (j ← 1) to n
        C[A[j]]++;
        
    for (i ← 2) to k
        C[i] ← C[i] + C[i+1];
        
    for (j ← n) downto 1 {
        B[C[A[j]]] ← A[j];
        C[A[j]]--;
    }
        
}
```


## (0 <= n < k)

```
countingSort(A[], B[], n)
{
    for (i ← 1) to k+1
        C[i] ← 0;
    
    for (j ← 1) to n
        C[A[j]+1]++;
        
    for (i ← 2) to k+1
        C[i] ← C[i] + C[i-1];
        
    for (j ← n) downto 1 {
        B[C[A[j]+1]] ← A[j];
        C[A[j]+1]--;
    }
        
}
```

## (-k < n < k)

```
countingSort(A[], B[], n)
{
    for (i ← 1) to k+1
        C[i] ← 0;
    
    for (j ← 1) to n
        C[A[j]+1]++;
        
    for (i ← 2) to k+1
        C[i] ← C[i] + C[i-1];
        
    for (j ← n) downto 1 {
        B[C[A[j]+1]] ← A[j];
        C[A[j]+1]--;
    }
        
}
```