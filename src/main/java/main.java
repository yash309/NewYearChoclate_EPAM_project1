import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
        newYearGift[] gifts = new newYearGift[5];
        gifts[0] = new chocolate("Silk",10);
        gifts[1] = new sweets("KajuKatli",20);
        gifts[2] = new chocolate("DarkFantasy",5);
        gifts[3] = new sweets("BoondiLaddu",2);
        gifts[4] = new chocolate("5Star",15);

        Scanner ob = new Scanner(System.in);
        int x = 1;
        System.out.println("Enter your choice");
        System.out.println("1 to View candies in specific range of their quantities");
        System.out.println("2 to Pack specific Gift");
        System.out.println("0 to exit");
        while(x!=0)
        {
            System.out.println("=============================================================2");
            System.out.println("Please Choose your option");
            x = ob.nextInt();
            switch(x){
                case 1:
                    System.out.println("Enter Range");
                    int l = ob.nextInt();
                    int r = ob.nextInt();
                    int c = 0;
                    System.out.println("Gifts available in the given range of quantities are: ");
                    for (int i = 0; i < 5; i++)
                    {
                        if(gifts[i].getQuantity()>=l && gifts[i].getQuantity()<=r ) {
                            System.out.println(gifts[i].getName());
                            c++;
                        }
                    }
                    if(c==0)
                    {
                        System.out.println("No Gifts Found");
                    }
                    System.out.println("Thanks for Visiting................");
                    break;

                case 2:
                    System.out.println("Enter the name of gift for packing");
                    String s = ob.next();
                    int f = 0;
                    for (int i = 0; i < 5; i++)
                    {
                        if(s.toLowerCase().equals(gifts[i].getName().toLowerCase()))
                        {
                            gifts[i].pack();
                            f = 1;
                            break;
                        }
                    }
                    if(f==0){
                        System.out.println("Your Gift is not found, Please enter the gift name from the available gifts");
                        for (int i = 0; i < 5 ; i++)
                        {
                            System.out.println(gifts[i].getName());
                        }
                    }
                    System.out.println("Thanks for visiting........");
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }

    }
}
