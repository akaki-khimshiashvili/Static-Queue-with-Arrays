public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(5);
        queue.enQueue(3);
        queue.enQueue(6);
//        queue.enQueue(1);
//        queue.enQueue(1);
        queue.enQueue(1);
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.enQueue(8);
        queue.enQueue(9);
        queue.enQueue(12);

        System.out.println("Queue is Empty: "+queue.isEmpty());
        System.out.println("Queue is Full: "+queue.isFull());
        System.out.println(queue.getSize());

        queue.show();
    }
}