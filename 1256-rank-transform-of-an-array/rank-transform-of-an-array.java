class Solution {
    public int[] arrayRankTransform(int[] arr)
    {
         int n = arr.length;
int[] copy = Arrays.copyOf(arr, n);

Arrays.sort(copy);

Map<Integer, Integer> map = new HashMap<>();
int rank = 1;

for (int i = 0; i < n; i++) {
    if (!map.containsKey(copy[i])) {
        map.put(copy[i], rank++);
        System.out.println(copy[i]+" "+map.get(copy[i]));
    }
}

int[] ans = new int[n];
for (int i = 0; i < n; i++) {
    ans[i] = map.get(arr[i]);
}

return ans;
    }
}