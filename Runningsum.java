
package runningsum;
import java.util.*;
public class Runningsum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    static int[] runningSum(int[] nums){
        int[] ans=new int[nums.length];
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            ans[i]=nums[i]+ ans[i-1];
        }
        return ans;
    }
            
}
