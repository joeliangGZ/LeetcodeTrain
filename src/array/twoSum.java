package array;

public class twoSum {

    public int[] twoSum(int[] numbers, int target) {
        
        int n = numbers.length;

        int i = 0, j = n-1;
        while(i < j) {
            int sum = numbers[i] + numbers[j];

            if(sum == target) {
                return new int[]{i+1, j+1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[]{};
    }

    // numbers = [2,7,11,15], target = 9

    // i = 0  j = 3      n = 4 
    // + == 9?  new int result = int(i, j);
    // + < 9  i++;  while i < j 
    // + > 9  j--;

    // 2 7 11 15 
    // 2      15  17 
    // 2   11     13
    // 2 7        9 

    // [0,0,3,4]
    // 0 0 3 4 
    // 0     4 4 
    // 0    3  3 
    
}
