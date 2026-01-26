import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

class Main{
    public static void main(String[] args){

        // int n, k;
        // System.out.println("Enter n & k : ");
        // Scanner sca = new Scanner(System.in);
        // n = sca.nextInt();
        // k = sca.nextInt();
        // int[] arr= new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sca.nextInt();
        // }
        //  Map<Integer,Integer> map = new HashMap<>();
        //  for(int i=0;i<arr.length;i++){
        //     if(!map.containsKey(k - arr[i])){
        //         map.put(arr[i],i);
        //     }
        //     else {
        //         System.out.println(map.get(k - arr[i]) + " " + i);
        //         break;
        //     }
        //  }
        
//Longest Subarray with sun k
  
        // int left=0 ,right =0;
        // int sum =arr[0],len=0;
        // while(right < n){
        //     while(left <= right && sum >k){
        //         sum -= arr[left];
        //         left++;
        //     }
        //     if(sum == k){
        //         len = Math.max(len, (right - left));
        //     }
        //     right++;
        //     if(right < n) sum += arr[right];
        // }
        // System.out.println(len);

//Longest Subarray with sun k
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int len = 0,sum =0;
        // for(int i=0;i<arr.length;i++){
        //     sum += arr[i];
        //      if(sum == k){
        //         len = i + 1;
        //      }
        //      if(map.ContainsKey(sum - k)){
        //         len = Math.max(len,i - (sum - k));
        //      }

        //      if(!map.containsKey(sum)){
        //         map.put(sum,i);
        //      }
        // }
        // System.out.println(len);

        // int[] arr1= new int[n];
        // int[] hash = new int[n + 2];

        // for(int i=0;i<n;i++){
        //     arr[i] = sca.nextInt();
        //     hash[arr[i]]++;
        // }
        // // for(int i=0;i<n;i++){
        // //     arr1[i] = sca.nextInt();
        // // }
        // for (int i = 1; i <= n + 1; i++) {
        //  if (hash[i] == 0) {
        // System.out.println(i);
        // break;
        //     }
        
        // HashSet <Integer> set = new HashSet<>();
        // for(int i=0;i<n;i++){
        // arr[i] = sca.nextInt();
        // }
        // for(int i=0;i<n;i++){
        // arr1[i] = sca.nextInt();
        // }

        // Union of two arrays

        // int i=0,j=0;
        // while(i <n){
        //     if(arr[i] <= arr1[j]){
        //         if(!set.contains(arr[i]))
        //         set.add(arr[i]);
        //         i++;
        //     }
        //     else{
        //         j++;
        //     }
        // }
        // while (j < n) {
        //     set.add(arr1[j++]);
        // }
        // // HashSet <Integer> set = new HashSet<>();
        // ArrayList<Integer> lis = new ArrayList<>();
        // for(int i : arr){
        //     if(i !=0 )
        //     lis.add(i);
        // }
        // for(int i=0;i<lis.size();i++){
        //     arr[i] = lis.get(i);
        // }
        // for(int i =lis.size();i<n;i++)
        // arr[i] = 0;
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i] + " ");
        // } 
        // int j = -1;
        // for(int i=0;i<n;i++){
        //     if(arr[i] == 0){
        //     j = i;
        //     break;
        //     }
        // }
        
        // if(j != -1){
        // for(int  i =j + 1 ;i < n;i++){
        //     if(arr[i] != 0){
        //         arr[j] = arr[i];
        //         arr[i] = 0;
        //         j++;
        //     }
        // }
        // }
        // for(int x=0;x<n;x++){
        //     System.out.print(arr[x] + " ");
        // } 
        // for(int i=0;i<arr.length;i++){
        //     set.add(arr[i]);
        //     set.add(arr1[i]);
        // }

        // Intersection 

//         int i=0,j=0;
//        while (i < n && j < n) {

//     if (arr[i] < arr1[j]) {
//         i++;
//     } 
//     else if (arr[i] > arr1[j]) {
//         j++;
//     } 
//     else {
//         set.add(arr[i]);
//         i++;
//         j++;
//     }
// }


// Iterator<Integer> se = set.iterator();
// while (se.hasNext()) {
//     System.out.print(se.next());
// }

    int n;
    Scanner scanner = new Scanner(System.in);
    n  = scanner.nextInt();
    int[] arr= new int[n];
    for(int i=0;i<n;i++){
        arr[i] = scanner.nextInt();
    }
// Dutch National Flag Algorithm

    // int low =0,mid=0,high= n - 1;
    // while(mid <= high){
    //     if(arr[mid] == 0){
    //         swap(arr,mid,low);
    //         low++;
    //         mid++;
    //     }
    //     else if(arr[mid] == 1){
    //         mid++;
    //     }
    //     else{
    //         swap(arr,mid, high);
    //         high--;
    //     }
    // }
    // for(int a : arr){
    //     System.out.println(a);
    // }

//Majority element ( > N /2 times)

// Map<Integer,Integer> map = new HashMap<>();
// for(int i=0;i<n;i++){
//     if(!map.containsKey(arr[i]))
//     map.put(arr[i],1);
//     else{
//         map.put(arr[i],map.get(arr[i]) + 1);
//     }
// }
// for(int key : map.keySet()){
//     if(map.get(key) > n / 2){
//     System.out.println("Majority element:"+ " " + key);
//     return;
//     }
// }

// Moose voting algorithm
    // int count =0,element=0,count1=0;
    // for(int i=0;i<arr.length;i++){
    //     if(count == 0){
    //         element = arr[i];
    //         count = 1;
    //     }
    //     if(arr[i] == element){
    //         count++;
    //     }
    //     else{
    //         count--;
    //     }
    //     if(count == 0) continue;
    // }

    // for(int i=0;i<arr.length;i++){
    //     if(arr[i] == element) count1++;
    // }

    // if(count1 > arr.length / 2) System.out.println(element);

// Kadane's Algorithm
//    int sum =0,max = Integer.MIN_VALUE,start=0,end=0,tempstart = 0;
//    for(int i=0;i<arr.length;i++){
//     sum += arr[i];
//     if(sum > max){ max = sum;
//         end = i;
//         start = tempstart;
//     }
//     if(sum < 0){ sum =0;
//         tempstart = i +1;
//     }
//    }
//    System.out.println(max);
//    for(int i = start;i<=end;i++){
//     System.out.print(arr[i] + " ");
//    }

// Next Permutation
    int ind = -1;

    // Step 1: find breakpoint
    for (int i = n - 2; i >= 0; i--) {
        if (arr[i] < arr[i + 1]) {
            ind = i;
            break;
        }
    }

    // Step 2: if no breakpoint, reverse entire array
    if (ind == -1) {
        revarr(arr, 0, n - 1);
        return;
    }

    // Step 3: find just greater element & swap
    for (int i = n - 1; i > ind; i--) {
        if (arr[i] > arr[ind]) {
            swap(arr, ind, i);
            break;
        }
    }

    // Step 4: reverse the suffix
    revarr(arr, ind + 1, n - 1);

     scanner.close();
    }
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b] = temp;
    }
    public static void revarr(int[] arr,int a,int b){
         while (a < b) {
        swap(arr, a, b);
        a++;
        b--;
        }
    }
}