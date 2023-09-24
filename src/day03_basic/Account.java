package day03_basic;

//  帳戶
public class Account {
    int cash;
    void withdraw(int amount)   {   //  提withdraw款 & amount金額
        cash = cash - amount;
    }
    void deposit(int amount)    {   //  deposit存款 & amount金額
        cash = cash + amount;
    }
    void transfer(int amount, Account act)   {   //  transfer轉帳 & amount金額
        this.withdraw(amount);   //  自己提款
        act.deposit(amount);   // 對方提款
    }
}
