# MergeSort [병합정렬]

## 1. Ascending MergeSort ( x ← last index )

```
quickSort(A[], p, r)
{
    if (p < r) then {
        q ← partition(A, p, r);
        quickSort(A, p, q-1);
        qucikSort(A, q+1, r);
    }
}

partition(A[], p, r) 
{
   x ← A[r];
   i ← p-1;
   for (j ← p) to (r-1) {
       if (A[j] <= x) then A[++i] ↔ A[j];
   }
   A[i+1] ↔ A[r];
   return i+1;
}
```

## 2. Descending MergeSort ( x ← last index )

```
quickSort(A[], p, r)
{
    if (p < r) then {
        q ← partition(A, p, r);
        quickSort(A, p, q-1);
        qucikSort(A, q+1, r);
    }
}

partition(A[], p, r) 
{
   x ← A[r];
   i ← p-1;
   for (j ← p) to (r-1) {
       if (A[j] >= x) then A[++i] ↔ A[j];
   }
   A[i+1] ↔ A[r];
   return i+1;
}
```

## 3. Ascending MergeSort ( x ← first index )

```
quickSort(A[], p, r)
{
    if (p < r) then {
        q ← partition(A, p, r);
        quickSort(A, p, q-1);
        qucikSort(A, q+1, r);
    }
}

partition(A[], p, r) 
{
   x ← A[p];
   i ← r+1;
   for (j ← r) downto 2 {
       if (A[j] <= x) then A[--i] ↔ A[j];
   }
   A[i-1] ↔ A[p];
   return i-1;
}
```

## 4. Descending MergeSort ( x ← first index )

```
quickSort(A[], p, r)
{
    if (p < r) then {
        q ← partition(A, p, r);
        quickSort(A, p, q-1);
        qucikSort(A, q+1, r);
    }
}

partition(A[], p, r) 
{
   x ← A[r];
   i ← p-1;
   for (j ← p) to (r-1) {
       if (A[j] >= x) then A[++i] ↔ A[j];
   }
   A[i+1] ↔ A[r];
   return i+1;
}
```