class Solution {
    public boolean lemonadeChange(int[] bills) {
        boolean isCharged = true;
        int tenNums = 0;
        int fixNums = 0;
        int looseCharge = 0;
        if (bills.length == 0) {
            return isCharged;
        }
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fixNums++;
                looseCharge += 5;
                continue;
            }
            if (bills[i] == 10 && fixNums > 0) {
                tenNums++;
                fixNums--;
                looseCharge += 5;
                continue;
            }
            if (bills[i] == 20 && fixNums > 0 && looseCharge > 10) {
                if (tenNums > 0) {
                    tenNums--;
                    fixNums--;
                } else {
                    fixNums -= 3;
                }
                looseCharge -= 15;
                continue;
            }
            isCharged = false;
            break;
        }
        return isCharged;
    }
}
