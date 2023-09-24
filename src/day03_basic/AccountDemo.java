package day03_basic;

public class AccountDemo {	//test
    public static void main(String[] args) {
        Account act1 = new Account();
        Account act2 = new Account();
        act1.deposit(1000); //  存款金額
        act2.deposit(800); //  存款金額
        System.out.printf("act1 cash: $%d\n",act1.cash);    //  存款後餘額
        System.out.printf("act2 cash: $%d\n",act2.cash);    //  存款後餘額  
        //cash 屬性沒有初始化，所以值都為 0
        /*-------------------------------------------------------------*/
        act1.withdraw(300); //  提款金額
        act2.withdraw(200); //  提款金額
        System.out.printf("act1 cash: $%d\n",act1.cash);    //  提款後餘額
        System.out.printf("act2 cash: $%d\n",act2.cash);    //  提款後餘額
        /*-------------------------------------------------------------*/
        act1.transfer(500, act2);   //  act1轉帳500$給act
        System.out.printf("act1 cash: $%d\n",act1.cash);    //  轉帳後餘額
        System.out.printf("act2 cash: $%d\n",act2.cash);    //  轉帳後餘額
        /*-------------------------------------------------------------*/
         act2.transfer(400, act1);   //  act1轉帳500$給act
        System.out.printf("act1 cash: $%d\n",act1.cash);    //  轉帳後餘額
        System.out.printf("act2 cash: $%d\n",act2.cash);    //  轉帳後餘額
    }
}
