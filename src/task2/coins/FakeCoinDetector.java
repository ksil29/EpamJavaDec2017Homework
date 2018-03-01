package task2.coins;

public class FakeCoinDetector {

    private enum Weight {LIGHTER, HEAVIER}

    public static void detectFakeCoin(int[] coins) {

        int fakeNumber;
        Weight weight;

        if (coins[0] + coins[1] + coins[2] + coins[3] == coins[4] + coins[5] + coins[6] + coins[7]) {
            if (coins[8] + coins[9] + coins[10] == coins[0] + coins[1] + coins[2]) {
                fakeNumber = 12;
                if (coins[11] > coins[0]) {
                    weight = Weight.HEAVIER;
                } else {
                    weight = Weight.LIGHTER;
                }
            } else {
                if (coins[8] + coins[9] + coins[10] > coins[0] + coins[1] + coins[2]) {
                    weight = Weight.HEAVIER;
                    if (coins[8] > coins[9]) {
                        fakeNumber = 9;
                    } else {
                        fakeNumber = 10;
                    }
                } else {
                    weight = Weight.LIGHTER;
                    if (coins[8] > coins[9]) {
                        fakeNumber = 10;
                    } else {
                        fakeNumber = 9;
                    }
                }
                if (coins[8] == coins[9]) {
                    fakeNumber = 11;
                }
            }
        } else {
            if (coins[0] + coins[1] + coins[2] + coins[3] > coins[4] + coins[5] + coins[6] + coins[7]) {
                if (coins[0] + coins[1] + coins[4] == coins[2] + coins[3] + coins[8]) {
                    weight = Weight.LIGHTER;
                    if (coins[5] == coins[6]) {
                        fakeNumber = 8;
                    } else if (coins[5] > coins[6]) {
                        fakeNumber = 7;
                    } else {
                        fakeNumber = 6;
                    }
                } else if (coins[0] + coins[1] + coins[4] > coins[2] + coins[3] + coins[8]) {
                    weight = Weight.HEAVIER;
                    if (coins[0] > coins[1]) {
                        fakeNumber = 1;
                    } else {
                        fakeNumber = 2;
                    }
                } else {
                    if (coins[2] == coins[3]) {
                        weight = Weight.LIGHTER;
                        fakeNumber = 5;
                    } else {
                        weight = Weight.HEAVIER;
                        if (coins[2] > coins[3]) {
                            fakeNumber = 3;
                        } else {
                            fakeNumber = 4;
                        }
                    }
                }
            } else {
                if (coins[0] + coins[1] + coins[4] == coins[2] + coins[3] + coins[8]) {
                    weight = Weight.HEAVIER;
                    if (coins[5] == coins[6]) {
                        fakeNumber = 8;
                    } else if (coins[5] < coins[6]) {
                        fakeNumber = 7;
                    } else {
                        fakeNumber = 6;
                    }
                } else if (coins[0] + coins[1] + coins[4] < coins[2] + coins[3] + coins[8]) {
                    weight = Weight.LIGHTER;
                    if (coins[0] < coins[1]) {
                        fakeNumber = 1;
                    } else {
                        fakeNumber = 2;
                    }
                } else {
                    if (coins[2] == coins[3]) {
                        weight = Weight.HEAVIER;
                        fakeNumber = 5;
                    } else {
                        weight = Weight.LIGHTER;
                        if (coins[2] < coins[3]) {
                            fakeNumber = 3;
                        } else {
                            fakeNumber = 4;
                        }
                    }
                }
            }
        }
        System.out.printf("Fake coin is %d, it is %s\n", fakeNumber, weight.toString().toLowerCase());
    }
}
