package com.array;

public class WindowSliding {
    public static void main(String[] args) {
        int []arr={1,8,30,-5,20,7};
        int k=3;
        System.out.println(findMaxSum(arr,k));

    }
    public static int findMaxSum(int []arr,int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxSum=sum;
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]+arr[i-k];
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        return maxSum;
    }
}
