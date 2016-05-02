class Marathon {
    public static void main(String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }
        int fastest_runner_index = calcFastestRunnerIndex(times);
        System.out.println("1st: " + names[fastest_runner_index] + ": " + times[fastest_runner_index]);
    }



    private static int calcFastestRunnerIndex(int[] times){
        int res_index = 0;
        int res_time = Integer.MAX_VALUE;
        for ( int idx = 0; idx < times.length; ++idx ){
            if ( res_time > times[idx] ){
                res_index = idx;
                res_time = times[idx];
            }
        }
        return res_index;
    }
}