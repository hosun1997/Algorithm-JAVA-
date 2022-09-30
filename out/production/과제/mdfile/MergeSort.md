# MergeSort [병합정렬]

## 1. Ascending MergeSort

```
mergeSort(A[], p, r)
{
    if (p < r) then {
        q = ⌊ (p+r) / 2 ⌋;
        mergeSort(A, p, q);
        mergeSort(A, q+1, r);
        merge(A, p, q, r);
    }
}

merge(A[], p, q, r)
{
    i ← p; j ← q+1; t ← 1;
    
    while ((i <= q) and (j <= r)) {
        if(A[i] <= A[j])
        then tmp[t++] = A[i++];
        else tmp[t++] = A[j++];
    }                               // [Left Sort Array], [Right Sort Array] push [TMP]
    
    while (i <= q) {
        tmp[t++] = A[i++];
    }                               // [Left Sort Array] push [TMP] (※[Right Sort] is Flush)
    
    while (j <= r) {
        tmp[t++] = A[j++];
    }                               // [Right Sort Array] push [TMP] (※[Left Sort] is Flush)
    
    i ← p; t ← 1;
    while (i <= r) {
        A[i++] = tmp[t++];
    }
}

p : Array's first Index / r : Array's last Index
```

## 2. Descending MergeSort

```
mergeSort(A[], p, r)
{
    if (p < r) then {
        q = ⌊ (p+r) / 2 ⌋;
        mergeSort(A, p, q);
        mergeSort(A, q+1, r);
        merge(A, p, q, r);
    }
}

merge(A[], p, q, r)
{
    i ← p; j ← q+1; t ← 1;
    
    while ((i <= q) and (j <= r)) {
        if(A[i] <= A[j])
        then tmp[t++] = A[j++];
        else tmp[t++] = A[i++];
    }                               // [Left Sort Array], [Right Sort Array] push [TMP]
    
    while (i <= q) {
        tmp[t++] = A[i++];
    }                               // [Left Sort Array] push [TMP] (※[Right Sort] is Flush)
    
    while (j <= r) {
        tmp[t++] = A[j++];
    }                               // [Right Sort Array] push [TMP] (※[Left Sort] is Flush)
    
    i ← p; t ← 1;
    while (i <= r) {
        A[i++] = tmp[t++];
    }
}
```