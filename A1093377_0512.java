import java.util.Random;
import java.util.Scanner;

class A1093377_0512{
    private static final int PORK_DUMPLINGS = 5000;
    private static final int BEEF_DUMPLINGS = 3000;
    private static final int VEGETABLE_DUMPLINGS = 1000;
    private static final int MIN_ORDER_SIZE = 10;
    private static final int MAX_ORDER_SIZE = 50;

    private static int availablePorkDumplings = PORK_DUMPLINGS;
    private static int availableBeefDumplings = BEEF_DUMPLINGS;
    private static int availableVegetableDumplings = VEGETABLE_DUMPLINGS;

    private static synchronized void serveDumplings(String dumplingType, int quantity) {
        switch (dumplingType) {
            case "豬肉水餃":
                if (availablePorkDumplings >= quantity) {
                    availablePorkDumplings -= quantity;
                    System.out.println("銷售 " + quantity + " 顆豬肉水餃");
                } else {
                    System.out.println("豬肉水餃售完");
                }
                break;
            case "牛肉水餃":
                if (availableBeefDumplings >= quantity) {
                    availableBeefDumplings -= quantity;
                    System.out.println("銷售 " + quantity + " 顆牛肉水餃");
                } else {
                    System.out.println("牛肉水餃售完");
                }
                break;
            case "蔬菜水餃":
                if (availableVegetableDumplings >= quantity) {
                    availableVegetableDumplings -= quantity;
                    System.out.println("銷售 " + quantity + " 顆蔬菜水餃");
                } else {
                    System.out.println("蔬菜水餃售完");
                }
                break;
        }
    }

    private static class Customer implements Runnable {
        private final Random random = new Random();
        private final int customerId;

        public Customer(int customerId) {
            this.customerId = customerId;
        }

        @Override
        public void run() {
            int dumplingQuantity = random.nextInt(MAX_ORDER_SIZE - MIN_ORDER_SIZE + 1) + MIN_ORDER_SIZE;
            String dumplingType = getRandomDumplingType();
            serveDumplings(dumplingType, dumplingQuantity);
            System.out.println("顧客 " + customerId + " 點了 " + dumplingQuantity + " 顆" + dumplingType);

            try {
                Thread.sleep(3000); // 等待下一位顧客點餐前的暫停時間
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private String getRandomDumplingType() {
            int randomNum = random.nextInt(3);
            switch (randomNum) {
                case 0:
                    return "豬肉水餃";
                case 1:
                    return "牛肉水餃";
                case 2:
                    return "蔬菜水餃";
                default:
                    return "未知";
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入同時光顧的顧客數目：");
        int numCustomers = scanner.nextInt();
        scanner.close();

        Thread[] customerThreads = new Thread[numCustomers];

        for (int i = 0; i < numCustomers; i++) {
            customerThreads[i] = new Thread(new Customer(i + 1));
            customerThreads[i].start();
        }

        // 等待所有顧客執行緒結束
        for (int i = 0; i < numCustomers; i++) {
            try {
                customerThreads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("水餃售完，營業結束");
    }
}


