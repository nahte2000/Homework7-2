public class MaxHeap implements Heap {
    int size;

    Integer[] data;

    public MaxHeap(int capacity) {
        data = new Integer[capacity];
        size = 0;
    }

    // build a heap based on data
    // to be implemented in O(nlogn)
    public void MaxHeapLogN(Integer[] data) {
        int n = data.length;
        for(int i = 0; i < n; i++)
        {
            int p = data[(i-1)/2];
            int l = data[(2*i)+1];
            int r = data[(2*i)+2];
            for(int j = n; j > 0; j/=2)
            {
                if()
            }
        }
    }

    // build a heap based on data
    // to be implemented in O(n)
    public void MaxHeapN(Integer[] data) {
        int n = data.length;
        for(int i = 0; i < n; i++) {
            int p = data[(i-1)/2];
            int l = data[(2*i)+1];
            int r = data[(2*i)+2];
            if (l < n && data[l] > data[p])
                p = l;
            if (r < n && data[r] > data[p])
                p = r;
            if (p != i) {
                int swap = data[i];
                data[i] = data[p];
                data[p] = swap;

                MaxHeapN(data);
            }
        }



    }
    }

    // add an item to the heap
    public boolean add(Integer item) {
            data[size - 1] = item;
            size++;

    }

    // return the max item in the heap
    public Integer get() {
        return data[size];
    }

    // remove the root item
    public Integer pop() {
        // homework
        return null;
    }
}
