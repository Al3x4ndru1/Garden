import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args){
        Integer a = -1;
        Integer b = -2;
        int[] nums = {1,3,5,7,9,11,13,16,17};

        int f = findLHS(nums);
        System.out.println(f);
        int c = b-a;
        //System.out.println(c);
    }



    public static int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                Integer a = map.get(nums[i]);
                a++;
                map.replace(nums[i],a);
            }
            else{
                map.put(nums[i],1);
            }
        }
        if(map.size()<2) {
            return 0;
        }else{
            int key = Integer.MAX_VALUE;
            int value = 0;
            for (Map.Entry<Integer, Integer> a : map.entrySet()) {
                if (key == Integer.MAX_VALUE) {
                    key = a.getKey();
                    value = a.getValue();
                } else {
                    if (a.getKey() - key == 1 || a.getKey() - key == -1) {
                        if (max < value + a.getValue()) {
                            max = value + a.getValue();
                        }

                        key = a.getKey();
                        value = a.getValue();
                    }
                }
            }
        }
        return max;
    }

}
