public class ArmStrongnumber {
    public static void main(String[] args) {
        int n=9474;
        int temp=n;
        int last_digit;
        int sum=0;
        
        while(temp>0){
        last_digit=temp%10;
        temp=temp/10;
        sum=sum+(last_digit*last_digit*last_digit*last_digit);
        }

        if(sum==n){
            System.out.print("armstrong number");
        }else{
            System.out.print("not an armstrong number");
        }
    }
}
