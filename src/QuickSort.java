public class QuickSort {
        private int[] data;
        public void setData(int[] data) {
            this.data = data;
        }
        private int partition (int start, int end){
            int pivot = this.data[end];
            int i = (start - 1);
            for (int j = start; j<= end; j++){
                if (this.data[j]<pivot){
                    i++;
                    int t = this.data[i];
                    this.data[i] = this.data[j];
                    this.data[j] = t;
                }
            }
            int t = this.data[i+i];
            this.data[i+1] = this.data[end];
            this.data[end] = t;
            return (i+1);
        }
        public void quicksort(int start, int end){
            if(start < end){
                int p = partition(start,end);
                quicksort(start,p -1 );
                quicksort(p + 1, end);
            }
        }
        public void printArr(int n){
            int i;
            for(i= 0; i<n; i++)
                System.out.println(this.data[i]+" ");
        }

        public static void main(String[] args) {
            String[] Food = {"sugar_g","fiber_g","serving_size_g"};
            int n = Food.length;
            System.out.println("""
                Before sorting array elements are -\s""");
            QuickSort _myQS = new QuickSort();
            _myQS.setData(Food);
            _myQS.printArr(n);
            _myQS.quicksort(0, n-1);
            System.out.println("\nAfter sorting elements are - ");
            _myQS.printArr(n);
            System.out.println();
        }
    }
    