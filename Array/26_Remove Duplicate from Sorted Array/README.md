
# Leetcode-26
This problem about remove the duplication from an array.



## Documentation

[Documentation](https://linktodocumentation)

First we have to understand that we have given a non decreassing or an increasing array.
on this type of array the first element already unique.

So I take k's value as 1. Then I run a loop from 1 index to last of the array and compare each of the element to their previous element. 

If the current element and the previous element is not equal then i assume that the current element is not a duplicate element then i increase the value of "K". At the same time i also store the current value on the k th index on the "nums" array. So that after i can easily find out the unique value from the same array "nums" .

