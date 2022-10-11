class Deque
{
    int[] arr;
    int front;
    int rear;
    int cap;
    int count;
    Deque(int size, int ele)
    {

        front = 0;
        rear = 0;
        cap =size;
        arr = new int[size];
        arr[0] = ele;
        count = 0;

    }

    void insertRear(int ele)
    {
        if(count == cap)
        {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear] = ele;
        count++;
    }

    void insertFront(int ele)
    {
        if( count == cap)
        {
            System.out.println("Queue is full");
            return;
        }
        if(rear < 0)
            arr[0] = ele;
        for(int i=rear+1;i>0;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = ele;
        rear++;
        count++;
    }

    int rear()
    {
        return  rear >-1?arr[rear]:-1;
    }

    int front(){
        return rear >-1?arr[0]:-1;
    }

    void display()
    {
        if(count == 0)
        {
            System.out.println("No elements in queue");
            return;
        }
        for(int i=0;i<rear+1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    int size()
    {
        return count;
    }

    int deleteFront()
    {
        if(count == 0)
        {
            System.out.println("No elements in queue to be removed");
            rear = -1;
            return -1;
        }
        count--;
        int res = arr[0];
        arr[0] = -1;

        if(rear == 0){
            arr[0] = -1;
            count--;
            rear--;
        }

        for(int i=1;i<=rear;i++)
        {
            arr[i-1] = arr[i];
        }
        rear --;

        return res;
    }

    int deleteRear()
    {
        if(count == 0)
        {
            System.out.println("No elements in queue to be removed");
            return -1;
        }
        int res = arr[rear];
        arr[rear] = -1;
        rear--;
        count--;
        return res;
    }

    boolean isEmpty()
    {
        return count == 0;
    }
}

public class deque_array_imp {

    public static void main(String[] args) {
        Deque dq = new Deque(10,8);
        dq.display();
        dq.insertRear(20);
        dq.display();
        dq.insertFront(30);
        dq.display();
        dq.deleteFront();
        dq.display();
        dq.deleteRear();
        dq.display();
        dq.deleteFront();
        dq.display();
        System.out.println(dq.isEmpty());

    }
}
