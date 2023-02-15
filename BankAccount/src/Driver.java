public class Driver {
    public static void main(String[] args){
        App bob = new App("Bob");
        bob.deposit(500.0);
        App sandy = new App("Sandy");
        sandy.deposit(200.0);
        bob.transfer(100.0,sandy);
        sandy.withdraw(50.0);
        sandy.withdraw(600.0);
        System.out.println(sandy.getBalance());
    }
}