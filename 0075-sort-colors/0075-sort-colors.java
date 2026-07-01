class Solution {
    public void sortColors(int[] arr) {
        // BUBBLE SORT
        // int n= arr.length;
        // for(int i=0 ; i<n-1 ; i++){
        //     for(int j=0 ; j<n-i-1 ; j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }

       // ARRAY LIST
        // ArrayList<Integer> zero = new ArrayList<>();
        // ArrayList<Integer> one = new ArrayList<>();
        // ArrayList<Integer> two = new ArrayList<>();

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == 0) {
        //         zero.add(arr[i]);
        //     } else if (arr[i] == 1) {
        //         one.add(arr[i]);
        //     } else {
        //         two.add(arr[i]);
        //     }
        // }
        // ArrayList<Integer> ans = new ArrayList<>();

        // ans.addAll(zero);
        // ans.addAll(one);
        // ans.addAll(two);

        // for (int j = 0; j < arr.length; j++) {
        //     arr[j] = ans.get(j);
        // }
       
       // COUNT
    //    int count =1 ;
    //    int zero=0;
    //    int one =0 ;
    //    int two=0;
    //    for(int i=0 ; i<arr.length ; i++){
    //        if(arr[i]==0){
    //         zero++;
    //        }else if(arr[i]==1){
    //         one++;
    //        }else{
    //         two++;
    //        }
    //    }
    //    ArrayList<Integer> ans = new ArrayList<>();
    //    while(zero--> 0){
    //      ans.add(0);
    //    }
    //    while(one--> 0){
    //     ans.add(1);
    //    }
    //    while(two--> 0){
    //     ans.add(2);
    //    }
    //    for(int j = 0 ; j<arr.length ; j++){
    //     arr[j] = ans.get(j);
    //    }
   
     // DUTCH NATIONAL FLAG
     int n= arr.length;
     int low = 0;
     int mid =0 ;
     int high = n-1;

     while(mid<=high){
        if(arr[mid]==0){
            int temp = arr[mid];
            arr[mid] = arr[low];
            arr[low] = temp;
            mid++;
            low++;
        }
        else if(arr[mid] == 1){
            mid++;
        }else{
            int temp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = temp;
            high--;
        }
     }
    }
}