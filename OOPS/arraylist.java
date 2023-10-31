/*
 content of array list:
a,b,c ,a,b,e

iterate this array

a,2 b,2 

 */

package OOPS;

public class arraylist {

    public static int duplicate(int s1[], int n){
        
    if(n == 0){
        return n;
    }
    int a[] = new int [n];
    int j=0;
    for(int i =0; i<n-1 ;i++)
    {
        if(a[i]!=a[i+1]){
            a[j++]=a[i];
        }
    }
    a[j++] = a[n-1];
    for(int i =0;i<j;i++){
        a[i] = a[i];
    }
    return j;
    }
public static void main(String[] args,int s) {
        int a[] = {'a','b','c','a','b','e'};
        int n = a.length;

        n= removeduplicate(a, n);

        for(int i=0 ; i<n;i++){
            System.out.println(a[i]+" ");
        }
}
private static int removeduplicate(int[] a, int n) {
    return 0;
}    
}
