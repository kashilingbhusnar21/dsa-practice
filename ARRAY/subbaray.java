package ARRAY;

public class subbaray {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 1, 2, 1, 1, 1, 1, 0, 2};
        int k = 6;
        int maxlen = 0;
        int i=0;
        int sum =0;
//sliding window and two pointer
        // if sum < k then addd of j
        //if sum > k then division of i
        for(int j=0;j<arr.length;j++) {
            sum += arr[j];

            while (sum > k) {
                sum = sum - arr[i];
                i++;
            }
            if (sum == k) {
                maxlen = Math.max(maxlen, j - i + 1);
            }
        }
        System.out.println(maxlen);
    }


}
