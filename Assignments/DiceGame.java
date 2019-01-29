class DiceGame {
    public static void main(String[] args){
        int n=0;
        while(n<100){
            System.out.prinln(D4);
            System.out.println(D6);
            System.out.println(D20);
            n++;
        }


    }
    public static int getD4(){
        int D4 = (int)(Math.random()*4) + 1;
        return D4;
    }
    public static int getD6(){
        int D6 = (int)(Math.random()*6) + 1;
        return D6;
    }
    public static int getD20(){
        int D20 = (int)(Math.random()*20) + 1;
        return D20;
    }
}