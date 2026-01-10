import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

class Main{
    public static void main(String[] args){
        int n, k;
        System.out.println("Enter n & k : ");
        Scanner sca = new Scanner(System.in);
        n = sca.nextInt();
        k = sca.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sca.nextInt();
        }
         Map<Integer,Integer> map = new HashMap<>();
         for(int i=0;i<arr.length;i++){
            if(!map.containsKey(k - arr[i])){
                map.put(arr[i],i);
            }
            else {
                System.out.println(map.get(k - arr[i]) + " " + i);
                break;
            }
         }
        
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
        }
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
    }
