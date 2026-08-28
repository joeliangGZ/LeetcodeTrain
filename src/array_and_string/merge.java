package array_and_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge {

    public int[][] merge(int[][] intervals) {

        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        
        for(int i = 0; i<n; i++) {

            int L = intervals[i][0];
            int R = intervals[i][1];
            if(merged.isEmpty() || merged.get(merged.size() - 1)[1] < L) {
                merged.add(new int[]{L, R});
            } else {
                merged.get(merged.size() -1)[1] = Math.max(merged.get(merged.size() -1)[1], R);
            }

        }

        return merged.toArray(new int[merged.size()][]);
        
    }

    // 我们用数组 merged 存储最终的答案。

    // 首先，我们将列表中的区间按照左端点升序排序。然后我们将第一个区间加入 merged 数组中，并按顺序依次考虑之后的每个区间：

    // 如果当前区间的左端点在数组 merged 中最后一个区间的右端点之后，那么它们不会重合，我们可以直接将这个区间加入数组 merged 的末尾；

    // 否则，它们重合，我们需要用当前区间的右端点更新数组 merged 中最后一个区间的右端点，将其置为二者的较大值。

    
}
