class FindLarge{
    int[] numbers = {1, 4, 6, 8, 9};
    public static void main(String[] args) {
        FindLarge find = new FindLarge();
      int largest = find.largeNum();
      System.out.println("largest number is :" +largest);
       
        
    }
    public int largeNum(){
        int large = numbers[0];
   for(int i=0;i<numbers.length;i++){
    if(numbers[i]>large){
        large= numbers[i];
    }
 
   }
return large;

    }
}