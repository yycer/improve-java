package com.frankie.demo.oop.innerclass;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 16:12
 */
public class DataStructure {

    private final static int N = 15;
    private int[] arr = new int[N];

    public DataStructure(){
        for (int i = 0; i < N; i++){
            arr[i] = i;
        }
    }

    public void printEven(){
        EvenIterator ei = this.new EvenIterator();
        while (ei.hasNext()){
            System.out.println(ei.next());
        }
    }


    private class EvenIterator implements DataStructureIterator{
        private int idx = 0;

        @Override
        public boolean hasNext() {
            return idx < N;
        }

        @Override
        public Integer next() {
            int ans = arr[idx];
            idx += 2;
            return ans;
        }
    }

    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
