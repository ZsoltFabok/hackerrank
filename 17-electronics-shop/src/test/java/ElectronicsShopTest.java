import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectronicsShopTest {
    @Test
    public void sample00() {
        int[] keyboards = {40, 50, 60};
        int[] drives = {5, 8, 12};
        int budget = 60;
        assertEquals(58, ElectronicsShop.getMoneySpent(keyboards, drives, budget));
    }

    @Test
    public void sample01() {
        int[] keyboards = {3, 1};
        int[] drives = {5, 2, 8};
        int budget = 10;
        assertEquals(9, ElectronicsShop.getMoneySpent(keyboards, drives, budget));
    }

    @Test
    public void sample02() {
        int[] keyboards = {5};
        int[] drives = {4};
        int budget = 5;
        assertEquals(-1, ElectronicsShop.getMoneySpent(keyboards, drives, budget));
    }
}
