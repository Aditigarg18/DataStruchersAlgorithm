class Solution {

    static class Item {
        int value;
        int weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {

        int n = val.length;

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            items[i] = new Item(val[i], wt[i]);
        }

        // Sort by value/weight ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare(
                (double) b.value / b.weight,
                (double) a.value / a.weight));

        double totalValue = 0.0;
        int currentWeight = 0;

        for (Item item : items) {

            // Take whole item
            if (currentWeight + item.weight <= capacity) {
                currentWeight += item.weight;
                totalValue += item.value;
            }

            // Take fractional part
            else {
                int remaining = capacity - currentWeight;
                totalValue += ((double) item.value / item.weight) * remaining;
                break;
            }
        }

        return totalValue;
    }
}
