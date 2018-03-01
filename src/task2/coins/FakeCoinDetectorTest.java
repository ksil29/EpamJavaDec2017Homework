package task2.coins;

public class FakeCoinDetectorTest {

    private static int[] firstCoinHeavierArray = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] firstCoinLighterArray = {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] secondCoinHeavierArray = {0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] secondCoinLighterArray = {0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] thirdCoinHeavierArray = {0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] thirdCoinLighterArray = {0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] fourthCoinHeavierArray = {0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] fourthCoinLighterArray = {0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] fifthCoinHeavierArray = {0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0};
    private static int[] fifthCoinLighterArray = {0, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0};
    private static int[] sixthCoinHeavierArray = {0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0};
    private static int[] sixthCoinLighterArray = {0, 0, 0, 0, 0, -6, 0, 0, 0, 0, 0, 0};
    private static int[] seventhCoinHeavierArray = {0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0};
    private static int[] seventhCoinLighterArray = {0, 0, 0, 0, 0, 0, -7, 0, 0, 0, 0, 0};
    private static int[] eighthCoinHeavierArray = {0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0};
    private static int[] eighthCoinLighterArray = {0, 0, 0, 0, 0, 0, 0, -8, 0, 0, 0, 0};
    private static int[] ninthCoinHeavierArray = {0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0};
    private static int[] ninthCoinLighterArray = {0, 0, 0, 0, 0, 0, 0, 0, -9, 0, 0, 0};
    private static int[] tenthCoinHeavierArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0};
    private static int[] tenthCoinLighterArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, -10, 0, 0};
    private static int[] eleventhCoinHeavierArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 11, 0};
    private static int[] eleventhCoinLighterArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -11, 0};
    private static int[] twelfthCoinHeavierArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12};
    private static int[] twelfthCoinLighterArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -12};

    public static void main(String[] args) {
        FakeCoinDetector.detectFakeCoin(firstCoinHeavierArray);
        FakeCoinDetector.detectFakeCoin(firstCoinLighterArray);
        FakeCoinDetector.detectFakeCoin(secondCoinHeavierArray);
        FakeCoinDetector.detectFakeCoin(secondCoinLighterArray);
        FakeCoinDetector.detectFakeCoin(thirdCoinHeavierArray);
        FakeCoinDetector.detectFakeCoin(thirdCoinLighterArray);
        FakeCoinDetector.detectFakeCoin(fourthCoinHeavierArray);
        FakeCoinDetector.detectFakeCoin(fourthCoinLighterArray);
        FakeCoinDetector.detectFakeCoin(fifthCoinHeavierArray);
        FakeCoinDetector.detectFakeCoin(fifthCoinLighterArray);
        FakeCoinDetector.detectFakeCoin(sixthCoinHeavierArray);
        FakeCoinDetector.detectFakeCoin(sixthCoinLighterArray);
        FakeCoinDetector.detectFakeCoin(seventhCoinHeavierArray);
        FakeCoinDetector.detectFakeCoin(seventhCoinLighterArray);
        FakeCoinDetector.detectFakeCoin(eighthCoinHeavierArray);
        FakeCoinDetector.detectFakeCoin(eighthCoinLighterArray);
        FakeCoinDetector.detectFakeCoin(ninthCoinHeavierArray);
        FakeCoinDetector.detectFakeCoin(ninthCoinLighterArray);
        FakeCoinDetector.detectFakeCoin(tenthCoinHeavierArray);
        FakeCoinDetector.detectFakeCoin(tenthCoinLighterArray);
        FakeCoinDetector.detectFakeCoin(eleventhCoinHeavierArray);
        FakeCoinDetector.detectFakeCoin(eleventhCoinLighterArray);
        FakeCoinDetector.detectFakeCoin(twelfthCoinHeavierArray);
        FakeCoinDetector.detectFakeCoin(twelfthCoinLighterArray);
    }
}
