#include<stdio.h>

int removeDuplicate(int * nums[], int length)
{
    int k = 1;
    for(int i=1; i<length; i++){
        if(nums[i] != nums[i-1])
        {
            nums[k] = nums[i];
            k++;
        }
    }
    return k;
}

int main(){
    printf("hello world");
    return 0;
}