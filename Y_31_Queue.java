public class Y_31_Queue {

    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // enqueue //add
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        //drqueue
        public static int remove(){
            
        }
    }

    public static void main(String[] args) {

    }
}