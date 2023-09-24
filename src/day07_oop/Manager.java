package day07_oop;

public class Manager extends Employee {

    public Manager() {
    }

    public Manager(int salary) {
        super(salary);
    }
    
    @Override // 覆寫註解(檢查覆寫是否合法)
    public void job() {
        System.out.println("管理");
    }
    
    public void report() { // 一般方法
        System.out.println("寫報告");
    }
    
}

/*
為什麼需要提供無參數建構子？這可能是因為有些時候你希望在創建物件時不必立即設置初始值。
例如，如果你使用了 new 關鍵字來創建 Manager 物件時不傳入參數，就會使用這個無參數建構子。
這樣，你可以在之後的程式中再設定 Manager 物件的屬性（如薪水），或者使用默認值來初始化屬性。
*/