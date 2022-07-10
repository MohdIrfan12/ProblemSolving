package scalar.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

// You are given a nested list of integers nestedList. Each element is either an integer or a
// list whose elements may also be integers or other lists. Implement an iterator to flatten it.
//
//Implement the NestedIterator class:
public class NestedIterator {

    ArrayList<Integer> list = new ArrayList<>();
    int index = 0;

    NestedIterator(ArrayList<NestedInteger> nestedList) {
        flattenList(nestedList);
    }

    private void flattenList(ArrayList<NestedInteger> nestedList) {
        for (NestedInteger item : nestedList) {
            if (item.isInteger()) {
                list.add(item.getInteger());
            } else {
                flattenList(item.getList());
            }
        }
    }


    int next() {
        return list.get(index++);
    }

    boolean hasNext() {
        return index < list.size();
    }

    public static void main(String[] args) {

    }


    class NestedInteger<T> {

        private final T x;

        NestedInteger(T x) {
            this.x = x;
        }

        // Return true if this NestedInteger holds a single integer, rather than a nested list.
        boolean isInteger() {
            if (x instanceof ArrayList) {
                return false;
            }
            return true;
        }

        // Return the single integer that this NestedInteger holds, if it holds a single integer.
        // The result is 1e9 if this NestedInteger holds a nested list.
        int getInteger() {
            return (int) x;
        }

        // Return the nested list that this NestedInteger holds, if it holds a nested list.
        // The result is an empty ArrayList if this NestedInteger holds a single integer.
        ArrayList<NestedInteger> getList() {
            return (ArrayList<NestedInteger>) x;
        }
    }
}
