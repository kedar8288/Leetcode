package daily_leetcode;

public class GasStation {
    //134

    public static int canComplete(int[] gas, int[] cost){
            
    
        if(gas.length != cost.length){
return -1;
        }

        int totalGas = 0;
        int totalCost = 0;
        for(int i=0; i < gas.length; i ++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas < totalCost){
            return -1;
        }
    
        int currentGas = 0;
        int start = 0;

        for(int j=0; j < gas.length; j++ ){
            currentGas += gas[j] - cost[j];
            if(currentGas < 0){
                currentGas =0;
                start = j + 1;
            }

        }

        return start;
    }


    public static void main(String[] args) {
        
        System.out.println(canComplete(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
        System.out.println(canComplete(new int[]{3,1,1}, new int[]{1,2,2}));

    }

}
