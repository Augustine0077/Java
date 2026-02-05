public class Break_continue {
    public static void main(String[] args){
        for(int i =1;i < 10;i++){
            if(i==5){
                //break; here till the number 4 will be printed rest will not print
                continue; //here the nuber 5 will skip rest of tem are printed
            }
            System.out.print(i+ " ");

        }

    }
}
