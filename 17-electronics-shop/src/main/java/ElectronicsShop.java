import java.util.Arrays;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int budget) {
        Arrays.sort(keyboards);
        Arrays.sort(drives);

        if (keyboards[0] + drives[0] > budget) {
            return -1;
        }

        int price = 0;
        for (int drive : drives) {
            for (int keyboard : keyboards) {
                int currentPrice = drive + keyboard;
                if (currentPrice > price && currentPrice <= budget) {
                    price = currentPrice;
                }

                if (currentPrice > budget) {
                    break;
                }
            }
        }
        return price;
    }
}
