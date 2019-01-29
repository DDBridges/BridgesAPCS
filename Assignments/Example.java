class Example{
    public static void main(String[] args){
        int x = 15;
        if(isEven(x)) {
            System.out.println("X is Even.");
        }
        else{
            System.out.println("X is Odd.");
        }
        
        }
    public Boolean isEven(int x){
            return x % 2 == 0;
    }
}