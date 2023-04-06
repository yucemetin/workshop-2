package abstract_demo;

public class CustomerManager {
    private BaseDatabaseManager baseDatabaseManager;

    public CustomerManager(BaseDatabaseManager baseDatabaseManager) {
        this.baseDatabaseManager = baseDatabaseManager;
    }

    public void getCustomers() {
        baseDatabaseManager.getData();
    }
}
