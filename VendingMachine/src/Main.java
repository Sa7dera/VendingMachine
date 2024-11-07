

interface VendingMachine{
    double insertMoney();

    String selectItem();

    default void connectToServer(){
        System.out.println("polaczenie z serwerem");
    }

    static void shutdown(){
        System.out.println("zakonczenie pracy");
    }


}

class VendingMachineImpl implements VendingMachine{
    public double insertMoney(){
        System.out.println("wyplata");
        return 0;
    }
    public String selectItem(){
        System.out.println("wybor");
        return "";
    }
    public void connectToServer(){
        System.out.println("polaczenie z serwerem");
    }
    public void shutdown(){
        System.out.println("zakonczenie pracy");
    }
}




public class Main {
    public static void main(String[] args) {

        VendingMachineImpl vendingMachine = new VendingMachineImpl();
        vendingMachine.insertMoney();
        vendingMachine.selectItem();
        vendingMachine.connectToServer();
        vendingMachine.shutdown();

    }
}