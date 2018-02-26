package task2.coins;

public class Main {

    private static int[] firstCoinHeavier = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] firstCoinLighter = {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] secondCoinHeavier = {0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] secondCoinLighter = {0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] thirdCoinHeavier = {0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] thirdCoinLighter = {0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] fourthCoinHeavier = {0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] fourthCoinLighter = {0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] fifthCoinHeavier = {0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0};
    private static int[] fifthCoinLighter = {0, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0};
    private static int[] sixthCoinHeavier = {0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0};
    private static int[] sixthCoinLighter = {0, 0, 0, 0, 0, -6, 0, 0, 0, 0, 0, 0};
    private static int[] seventhCoinHeavier = {0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0};
    private static int[] seventhCoinLighter = {0, 0, 0, 0, 0, 0, -7, 0, 0, 0, 0, 0};
    private static int[] eighthCoinHeavier = {0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0};
    private static int[] eighthCoinLighter = {0, 0, 0, 0, 0, 0, 0, -8, 0, 0, 0, 0};
    private static int[] ninthCoinHeavier = {0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0};
    private static int[] ninthCoinLighter = {0, 0, 0, 0, 0, 0, 0, 0, -9, 0, 0, 0};
    private static int[] tenthCoinHeavier = {0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0};
    private static int[] tenthCoinLighter = {0, 0, 0, 0, 0, 0, 0, 0, 0, -10, 0, 0};
    private static int[] eleventhCoinHeavier = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 11, 0};
    private static int[] eleventhCoinLighter = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -11, 0};
    private static int[] twelfthCoinHeavier = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12};
    private static int[] twelfthCoinLighter = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -12};

    public static void main(String[] args) {
        Coins.fakeCoin(firstCoinHeavier);
        Coins.fakeCoin(firstCoinLighter);
        Coins.fakeCoin(secondCoinHeavier);
        Coins.fakeCoin(secondCoinLighter);
        Coins.fakeCoin(thirdCoinHeavier);
        Coins.fakeCoin(thirdCoinLighter);
        Coins.fakeCoin(fourthCoinHeavier);
        Coins.fakeCoin(fourthCoinLighter);
        Coins.fakeCoin(fifthCoinHeavier);
        Coins.fakeCoin(fifthCoinLighter);
        Coins.fakeCoin(sixthCoinHeavier);
        Coins.fakeCoin(sixthCoinLighter);
        Coins.fakeCoin(seventhCoinHeavier);
        Coins.fakeCoin(seventhCoinLighter);
        Coins.fakeCoin(eighthCoinHeavier);
        Coins.fakeCoin(eighthCoinLighter);
        Coins.fakeCoin(ninthCoinHeavier);
        Coins.fakeCoin(ninthCoinLighter);
        Coins.fakeCoin(tenthCoinHeavier);
        Coins.fakeCoin(tenthCoinLighter);
        Coins.fakeCoin(eleventhCoinHeavier);
        Coins.fakeCoin(eleventhCoinLighter);
        Coins.fakeCoin(twelfthCoinHeavier);
        Coins.fakeCoin(twelfthCoinLighter);
    }
}
