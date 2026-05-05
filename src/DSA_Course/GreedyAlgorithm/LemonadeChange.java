package DSA_Course.GreedyAlgorithm;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int[] wallet = new int[2]; // wallet[0] = $5, wallet[1] = $10
        for (int i = 0; i < bills.length; i++) {
            int b = bills[i];
            if (b == 5) {
                wallet[0]++;
            } else if (b == 10) {
                wallet[1]++;
                wallet[0]--;
            } else { // b == 20
                if (wallet[1] > 0) {
                    wallet[1]--;
                    wallet[0]--;
                } else {
                    wallet[0] = wallet[0] - 3;
                }
            }
            if (wallet[0] < 0) return false;
        }
        return true;
    }
}
