public class Main {
    public static void main(String[] args) {
        System.out.println(hasTeen(22,23,34));
    }

    public static boolean hasTeen(int par1,int par2,int par3){
        if (((par1<=19)&&(par1>=13))|| ((par2<=19)&&(par2>=13))  || ((par3<=19)&&(par3>=13))){
            return true;
        } else {
            return false;
        }
    }
    public static boolean isTeen(int x){
        if ((x<=19)&&(x>=13)){
            return true;
        }else {
            return false;
        }
    }

}