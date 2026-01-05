public class Queue_Base_Sort
{
    public static void main(String[] args) 
    {
        System.out.println(indexOfDigit(203940, 4));
    }
    public static int len(int x)
    {
        int a=0;
        while (x>0)
        {
           x=x/10;
           a++;
        }
        return a;    
    }
    public static int maxInQueue(Queue<Integer> q1)
    {
        Queue<Integer> q2=QueueCopy(q1);
        int a=q2.remove();
        while(!q2.isEmpty())
        {
            int b=q2.remove();
            if (b>a)
                a=b;
        }
        return a;    
    }
    public static <T> Queue<T> QueueCopy(Queue<T> q1)
    {
        Queue<T> q2=new Queue<T>();
        Queue<T> q3=new Queue<T>();
        while (!q1.isEmpty())
        {
            T a= q1.remove();
            q2.insert(a);
            q3.insert(a);
        }    
        while (!q3.isEmpty())
            q1.insert(q3.remove());
        return q2;      
    }
    public static int indexOfDigit(int a, int b)
    {
        for (int i=0; i<b; i++)
            a/=10;
        return a%10;   
    }
    public static void sort(Queue<Integer> q)
    {
        Queue<Integer> a=new Queue<>[10];

    }
}
