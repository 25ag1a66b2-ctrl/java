class TwoSum{
    public static void main(String... args) {
    int[]sum={2,7,11,15};
    int target=9;
    int result[] = twoSum(sum,target);
    for(int p:result){
        System.out.println(p);
    }
    }
    
    public static int[] twoSum(int[] s, int t){
        int array[]=new int[2];
        for (int i=0;i<s.length;i++){
            if(t==s[i]+s[i+1]){
                array[0]=i;
                array[1]=i+1;
                return array;
            }
            
        }
        return null;
    }
  
}