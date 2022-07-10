package scalar.array;

public class ChristmasTrees {
    // You are given an array A consisting of heights of Christmas trees and an array B of the same size consisting of the cost of each of the trees (Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)), and you are supposed to choose 3 trees (let's say, indices p, q, and r), such that Ap < Aq < Ar, where p < q < r.
    //The cost of these trees is Bp + Bq + Br.
    //
    //You are to choose 3 trees such that their total cost is minimum. Return that cost.
    //
    //If it is not possible to choose 3 such trees return -1.

    public static void main(String[] args) {
//        int ar[] = {1, 3, 5};
//        int ar2[] = {1, 2, 3};

//        int ar[] = {1, 6, 4, 2, 6, 9};
//        int ar2[] = {2, 5, 7, 3, 2, 7};

        int ar[] = {5, 9, 10, 4, 7, 8};
        int ar2[] = {5, 6, 4, 7, 2, 5};

        System.out.println(solution(ar, ar2));
    }

    private static int solution(int tree[], int cost[]) {
        int size = tree.length;
        int result = Integer.MAX_VALUE;
        for (int i = 1; i < size; i++) {
            int secondItem = cost[i];
            int firstItem = Integer.MAX_VALUE;
            int thirdItem = Integer.MAX_VALUE;

            for (int j = 0; j < i; j++) {
                if (tree[j] < tree[i]) {
                    firstItem = Math.min(firstItem, cost[j]);
                }
            }
            for (int j = i + 1; j < size; j++) {
                if (tree[j] > tree[i]) {
                    thirdItem = Math.min(thirdItem, cost[j]);
                }
            }
            if(firstItem!=Integer.MAX_VALUE && thirdItem!=Integer.MAX_VALUE){
                result = Math.min(result,firstItem+secondItem+thirdItem);
            }
        }
        if (result==Integer.MAX_VALUE)
        {
            return -1;
        }else {
            return result;
        }
    }
}
