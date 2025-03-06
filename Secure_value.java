class Secure_value{
    int res;
    public void checkSum(int targetSum){
        if(targetSum==10 || targetSum==32){
            res=1;
        }
        if(targetSum<=10||targetSum>=32||targetSum%2!=0){
            res= 0;
        }

        for(int i=3;i<=7;i+=2){
            for(int j =6;j<=8;j+=2){
                for(int k=1;k<=9;k++){
                    int third= k-1;

                    if(i+j+third+k==targetSum){
                        res+=1;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Secure_value s= new Secure_value();
        s.checkSum(16);

        System.out.print(s.res);
    }
}