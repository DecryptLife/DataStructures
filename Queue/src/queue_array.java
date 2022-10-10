
class Queue
{
    int[] arr;
    int rear;
    int front;
    int cap;
    Queue(int size,int ele)
    {
        arr = new int[size];
        cap = size;
        arr[front] = ele;
        rear = 0;
        front = 0;
    }

    void enque(int ele)
    {
        if(rear +1 > cap)
        {
            System.out.println("Queue already full");
            return;
        }
        rear++;
        arr[rear] = ele;
    }

    int deque()
    {
        if(rear < 0)
            return -1;
        int res = arr[front];
        for(int i=0;i<rear;i++)
        {
            arr[i] = arr[i+1];
        }
        rear = rear-1;
        return res;
    }

    int rear()
    {
        return arr[rear];
    }

    int front()
    {
        return arr[front];
    }

    int size()
    {
        return rear+1;
    }

    boolean isEmpty()
    {
        return (rear > -1)?true:false;
    }

}
public class queue_array {

    public static void main(String[] args) {
        int size = 10;
        Queue q = new Queue(size, 10);
        q.enque(20);
        q.enque(30);
        q.enque(15);
        System.out.println(q.deque() == -1?"Queue is empty":"Element dequed");
        System.out.println(q.rear());
        System.out.println(q.front());
        System.out.println(q.size());
        System.out.println(q.deque());
        System.out.println(q.rear());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.deque() == -1?"Queue is empty":"Element dequed");
        System.out.println(q.deque() == -1?"Queue is empty":"Element dequed");
        System.out.println(q.deque() == -1?"Queue is empty":"Element dequed");
        System.out.println(q.size());

    }
}
