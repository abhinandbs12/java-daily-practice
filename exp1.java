import java.util.Scanner;
public class exp1 {
    public static void main(String[] args){
        System.out.println("SHOPPING CART CALCULATOR");
        System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);
        int amount=sc.nextInt();
        if(amount<=1000){
            System.out.println("The final amount after discount is: "+amount);
        
        }
        else if(amount>1000 &&amount<=5000){
            int discount=(amount*10)/100;
            amount = amount-discount;
            System.out.println("The final amount after discount is: "+amount);

        }
        else if(amount>5000 && amount<=10000){
            int discount=(amount*20)/100;
            amount = amount-discount;
            System.out.println("The final amount after discount is: "+amount);

        }
        else{
            int discount=(amount*25)/100;
            amount = (amount-discount)-500;
            System.out.println("The final amount after discount is: "+amount);

        }
    }
}
    
