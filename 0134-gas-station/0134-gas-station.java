class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int curr = 0;
        int start = 0;

        int gascost = 0, totalcost =0;

        for(int i =0; i < n; i++){

            if(curr < 0){
                curr = 0;
                start = i;
            }

            curr += gas[i] - cost[i];

            gascost += gas[i];
            totalcost += cost[i];

        }

        if(gascost < totalcost) return -1;

        return start;
    }
}