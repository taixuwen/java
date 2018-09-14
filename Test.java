public class Test{
    public static void main(String[] args){
        int N=99;
        for(int i=N;i>=0;i=i-1)
        {
            if(i>=1)
                System.out.printf("%d bottles of beer on the wall,%d bottles of beer.\nTake one down.\nPass it around.\n%d                                       bottles of beer on the wall.\n", i, i,i - 1);
            else
                System.out.printf("No more bottles of beer on the wall.");
            System.out.println("********************************\n");
        }
        for(int i=N;i>=0;i=i-1)
        {
            if(i>=1)
               {
                    System.out.printf("%d bottles of beer on the wall,%d bottles of beer.\nTake one down.\nPass it around.\n%d                                       bottles of beer on the wall.\n", i, i,i - 1);
                    System.out.printf("%d bottles of beer on the wall.\n", i - 1);
               }
            else
                System.out.println("No more bottles of beer on the wall.");
            System.out.println("********************************\n");
        }
    }
}