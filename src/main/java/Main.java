public class Queue_Level_2
{
	public static void main(String[] args)
	{
		
	}
    public static <T> void printQ(Queue<T> q1)
    {
       Queue <T> q2=QueueCopy(q1);      
       while (!q2.isEmpty())
        System.out.println(q2.remove());  
       return;
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
    public static Queue<Integer> level2_ex1(Queue<Character> q1)
    {
        Queue<Character> q2=QueueCopy(q1);
        Queue<Integer> q3 = new Queue<>();
        char a= q2.remove();
        int x=1;
        while (!q2.isEmpty())
        {
            char b=q2.remove();
            if (a==b)
               x++;
            else
            {
                q3.insert(x);
                x=1;
            }
            a=b;        
        }  
        q3.insert(x);
        return q3;  
    }
    public static boolean level2_ex2(Queue<String> q1)
    {
        Queue<String> q2=QueueCopy(q1);
        Queue<String> q3=QueueCopy(q1);
        int a=0;
        while(!q3.isEmpty())
        {
            a++;
            q3.remove();
        }
        for (int i=0; i<a; i++)
        {
            String b=q2.remove();
            q3=QueueCopy(q1);
            for (int j=0; j<a; j++)
            {
                String c=q3.remove();
                if (i!=j)
                {
                    if (b.equals(c))
                        return true;
                }
            }
        }
        return false;
    }
    public static Queue<Integer> delNum(Queue<Integer> q1, int a)
    {
        Queue<Integer> q2 = QueueCopy(q1);
        Queue<Integer> q3 = new Queue<>();
        while (!q2.isEmpty())
        {   
            int b = q2.remove();
            if (b!=a)
               q3.insert(b);
        }
        return q3;
    }
    public static <T> boolean inQueue(Queue<T> q1, T a)
    {
        Queue<T> q2 = QueueCopy(q1);
        while (!q2.isEmpty())
        {
            if (q2.remove().equals(a))
                return true;
        } 
        return false;   
    }
    public static Queue<Integer> level2_ex3(Queue<Integer> q1)
    {
        Queue<Integer> q2 = QueueCopy(q1);
        Queue<Integer> q3 = new Queue<>();
        while (!q2.isEmpty())
        {
            int b=q2.remove();
            if (!inQueue(q3, b))
                q3.insert(b);
            else
                q2=delNum(q2, b);
        }  
        return q3; 
    }
    public static Queue<Integer> level2_ex4(Queue<Integer> q1)
    {
        Queue<Integer> q2 = new Queue<>(); 
        Queue<Integer> q3 = new Queue<>(); 

        while (!q1.isEmpty())
        {
            int min = q1.remove();
            q2.insert(min);
            while (!q1.isEmpty())
            {
                int v = q1.remove();
                if (v < min) min = v;
                q2.insert(v);
            }

            while (!q2.isEmpty())
            {
                int v = q2.remove();
                if (v == min)
                    q3.insert(v);
                else
                    q1.insert(v);
            }
        }
        return q3;
    }
    public static Queue<Integer> Level2_ex5(Queue<Integer> q1, Queue<Integer> q2)
    {
        Queue<Integer> q3 = QueueCopy(q1);
        Queue<Integer> q4 = QueueCopy(q2);
        Queue<Integer> q5 = new Queue<>();

        while (!q3.isEmpty() && !q4.isEmpty())
        {
            int a = q3.head();
            int b = q4.head();
            if (a <= b)
                q5.insert(q3.remove());
            else
                q5.insert(q4.remove());
        }
        while (!q3.isEmpty()) 
            q5.insert(q3.remove());
        while (!q4.isEmpty()) 
            q5.insert(q4.remove());

        return q5;
    }
    public static int Level2_ex6(Queue<Integer> q1)
    {
        int a=0;
        int b=0;
        Queue<Integer> q2 = QueueCopy(q1);
        while (!q2.isEmpty())
        {
            if (q2.remove()%2==0)
                a++;
            else 
            {
                if (a>b)
                    b=a;
                a=0;
            } 
        }
        if (b==0)    
            return a;
        return b;
    }
}
--------------------------------------------------
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
----------------------------------------------------------------------------
import java.util.*;
public class BinNode_Homework
{
    public static void main(String[] args) {
		BinNode<Integer> t15 = new BinNode<Integer>(15);
		BinNode<Integer> t14 = new BinNode<Integer>(14);
		BinNode<Integer> t9 = new BinNode<Integer>(9);
		BinNode<Integer> t3 = new BinNode<Integer>(3);
        t14.setLeft(t9);
		t14.setRight(t3);
		BinNode<Integer> t2 = new BinNode<Integer>(2);
		BinNode<Integer> t1 = new BinNode<Integer>(1);
		t1.setLeft(t3);
		t1.setRight(t2);
        BinNode<Integer> tree = new BinNode<Integer>(t15, 3, t14);
		//tree.getLeft().setLeft(new BinNode<Integer>(t9, 6, new BinNode<Integer>(7)));
		//tree.getLeft().setRight(new BinNode<Integer>(new BinNode<Integer>(34), 56, new BinNode<Integer>(12)));
		//System.out.println(tree);

		//BinNode<Integer> t = fromString("( ( ( 9 6 7 ) 1 null ) 3 ( null 2 4 ) )");

		//System.out.println(t);

		//String s = levelToString(t);

		//System.out.println(s);
        
        //ex1And2(tree);
		//ex3(tree);
        //Node<Integer> lst = ex5(tree);
        //System.out.println(lst);
        tree.display();
		System.out.println(treeHeight(tree));
		System.out.println(isBalanced(tree));
		System.out.println(leafCount(tree));
		System.out.println(allIsIn(tree, t14));
        System.out.println(sequentialTreeN(t1, 3));
	}

	/* Construct from in-order with brackets */
	public static BinNode<Integer> fromString(String s) {
		StringTokenizer tokenizer = new StringTokenizer(s);
		return fromString(tokenizer);
	}

	/* Construct from in-order with brackets */
	public static BinNode<Integer> fromString(StringTokenizer tokenizer) {
		if (!tokenizer.hasMoreElements())
			return null;
		String s = tokenizer.nextToken();
		if (s.equals("null"))
			return null;
		if (s.equals("(")) {
			BinNode<Integer> left = fromString(tokenizer);
			s = tokenizer.nextToken();
			Integer value = Integer.valueOf(s);
			BinNode<Integer> right = fromString(tokenizer);
			s = tokenizer.nextToken();
			if (!s.equals(")"))
				System.out.println("Note: missing ')'");
			return new BinNode<Integer>(left, value, right);
		}
		return new BinNode<Integer>(Integer.valueOf(s));
	}

	/*
	 * Type 1: Tree Scan
	 */
	public static void preOrder(BinNode<Integer> t) {
		if (t != null) {
			System.out.println(t.getValue());
			preOrder(t.getLeft());
			preOrder(t.getRight());
		}
	}

	/*
	 * Type 1: Tree Scan (generic method)
	 */
	public static <T> void inOrder(BinNode<T> t) {
		if (t != null) {
			inOrder(t.getLeft());
			System.out.println(t.getValue());
			inOrder(t.getRight());
		}
	}

    public static <T> void postOrder(BinNode<T> t) {
		if (t != null) {
			postOrder(t.getLeft());
			postOrder(t.getRight());
            System.out.println(t.getValue());
		}
	}

	/*
	 * Type 3: Is there a node that meet a condition?
	 */
	public static boolean existsValue(BinNode<Integer> t, int x) {
		if (t == null)
			return false;

		if (t.getValue() == x)
			return true;

		boolean left = existsValue(t.getLeft(), x);

		boolean right = existsValue(t.getRight(), x);

		return left || right;
	}

	/*
	 * Type 4: Do all nodes meet a condition?
	 */
	public static boolean eachHasTwoChildren(BinNode<Integer> t) {

		// leaf node
		if (!t.hasLeft() && !t.hasRight())
			return true;

		// only one child
		if (!t.hasRight() || !t.hasLeft())
			return false;

		return eachHasTwoChildren(t.getLeft()) && eachHasTwoChildren(t.getRight());
	}
	
	
	/*
	 * Type 2: Count
	 */
	public static int countLeaves(BinNode<Integer> t) {
		if (t == null)
			return 0;
		if (!t.hasLeft() && !t.hasRight())
			return 1;
		return countLeaves(t.getLeft()) + countLeaves(t.getRight());
	}

	/*
	 * Type 2a: Sum
	 */
	public static int sumPos(BinNode<Integer> t) {
		if (t == null)
			return 0;

		int a = 0;

		if (t.getValue() > 0)
			a = t.getValue();

		return a + sumPos(t.getLeft()) + sumPos(t.getRight());
	}

	/*
	 * Type 1: Tree Scan
	 */
	public static void printEven(BinNode<Integer> t) {

		if (t != null) {

			printEven(t.getLeft());

			int value = t.getValue();

			if (value % 2 == 0)
				System.out.println(value);

			printEven(t.getRight());
		}
	}

	/*
	 * Type 2: Count
	 */
	public static int countNodesAbove(BinNode<Integer> t, int saf) {
		if (t == null)
			return 0;

		int left = countNodesAbove(t.getLeft(), saf);

		int right = countNodesAbove(t.getRight(), saf);

		int current = 0;
		if (t.getValue() > saf)
			current = 1;

		return current + left + right;
	}

	/*
	 * Scan level by level. Return a string of all nodes. Author: Eitan Hanam, 2025
	 */
	public static String levelToString(BinNode<Integer> t) {
		Queue<BinNode<Integer>> q = new Queue<BinNode<Integer>>();
		q.insert(t);
		String str = "";
		while (!q.isEmpty()) {
			BinNode<Integer> t1 = q.remove();
			str += t1.getValue() + " ";

			// don't work on dummy nodes
			if (t1.getValue() != -1) {

				if (t1.hasLeft())
					q.insert(t1.getLeft());
				else
					q.insert(new BinNode<Integer>(-1));

				if (t1.hasRight())
					q.insert(t1.getRight());
				else
					q.insert(new BinNode<Integer>(-1));
			}
		}
		return str;
	}

	/*
	 * Construct a tree by an array of level-order scan. The array includes null
	 * markers for single-child null nodes. Author: Eitan Hanam, 2025
	 */
	public static BinNode<Integer> construct(int[] arr) {
		Queue<BinNode<Integer>> q = new Queue<BinNode<Integer>>();
		BinNode<Integer> t = new BinNode<Integer>(arr[0]);
		q.insert(t);
		int i = 0;
		while (q.isEmpty() == false) {
			BinNode<Integer> t1 = q.remove();
			if (arr[i] != -1) {
				t1.setLeft(new BinNode<Integer>(arr[i]));
				q.insert(t1.getLeft());
			}
			i++;
			if (i < arr.length && arr[i] != -1) {
				t1.setRight(new BinNode<Integer>(arr[i]));
				q.insert(t1.getRight());
			}
			i++;
		}
		return t;
	}
    public static <T> void ex1And2(BinNode<T> t)
    {
        if (t == null)
            return;
        Queue<BinNode<T>> q = new Queue<BinNode<T>>();
        q.insert(t);
        int curr = 1; 
        int next = 0; 
        while (!q.isEmpty()) {
            BinNode<T> n = q.remove();
            System.out.print(n.getValue());
            curr--;
            if (n.hasLeft()) {
                q.insert(n.getLeft());
                next++;
            }
            if (n.hasRight()) {
                q.insert(n.getRight());
                next++;
            }
            if (curr > 0)
                System.out.print(" ");
            else {
                System.out.println();
                curr = next;
                next = 0;
            }
        }  
    }

    public static <T> void ex3(BinNode<T> t)
    {
        if (t == null)
            return;
        Queue<BinNode<T>> q = new Queue<BinNode<T>>();
        q.insert(t);
        int curr = 1; 
        int next = 0; 
        while (!q.isEmpty()) {
            BinNode<T> n = q.remove();
            System.out.print(n.getValue());
            curr--;
            if (n.hasRight()) {
                q.insert(n.getRight());
                next++;
            }
            if (curr > 0)
                System.out.print(" ");
            else {
                System.out.println();
                curr = next;
                next = 0;
            }
        }  
    }

    public static <T> Node<T> ex4(BinNode<T> t)
    {
        Node<T> head = null;
        Node<T> tail = null;
        if (t == null)
            return head;
        Queue<BinNode<T>> q = new Queue<BinNode<T>>();
        q.insert(t);
        int curr = 1; 
        int next = 0; 
        while (!q.isEmpty()) {
            BinNode<T> n = q.remove();
            curr--;
            if (n.hasRight()) {
                q.insert(n.getRight());
                next++;
            }
            if (curr == 0) {
                Node<T> newNode = new Node<T>(n.getValue());
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.setNext(newNode);
                    tail = newNode;
                }
                curr = next;
                next = 0;
            }
        }
        return head; 
    }

    public static <T> Node<T> ex5(BinNode<T> t)
    {
        Node<T> head = null;
        Node<T> tail = null;
        if (t == null)
            return head;

        Queue<BinNode<T>> q = new Queue<BinNode<T>>();
        q.insert(t);
        int curr = 1;
        int next = 0;
        boolean leftToRight = true;
        Node<T> tempStack = null; 

        while (!q.isEmpty()) {
            BinNode<T> n = q.remove();
            curr--;

            if (leftToRight) {
                Node<T> newNode = new Node<T>(n.getValue());
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.setNext(newNode);
                    tail = newNode;
                }
            } else {
                Node<T> push = new Node<T>(n.getValue());
                push.setNext(tempStack);
                tempStack = push;
            }

            if (n.hasLeft()) {
                q.insert(n.getLeft());
                next++;
            }
            if (n.hasRight()) {
                q.insert(n.getRight());
                next++;
            }

            if (curr == 0) {
                while (tempStack != null) {
                    Node<T> pop = tempStack;
                    tempStack = tempStack.getNext();
                    Node<T> newNode = new Node<T>(pop.getValue());
                    if (head == null) {
                        head = newNode;
                        tail = newNode;
                    } else {
                        tail.setNext(newNode);
                        tail = newNode;
                    }
                }
                leftToRight = !leftToRight;
                curr = next;
                next = 0;
                tempStack = null;
            }
        }
        return head;
    }

    public static <T> int treeHeight(BinNode<T> t)
	{
		if (t==null)
			return -1;
		return 1+Math.max(treeHeight(t.getLeft()), treeHeight(t.getRight()));
	}

	public static boolean isBalanced(BinNode<Integer> t)
	{
		if (t==null)
			return true;
		if (Math.abs(treeHeight(t.getLeft())-treeHeight(t.getRight()))>1)
			return false;
		return isBalanced(t.getLeft()) && isBalanced(t.getRight());
	}

	public static int leafCount(BinNode<Integer> t)
	{
		if (t==null)
			return 0;
		if (!t.hasLeft()&&!t.hasRight())
			return 1;
		return leafCount(t.getLeft())+leafCount(t.getRight());
	}

	public static boolean isIn(BinNode<Integer> t, int a)
	{
		if (t==null)
			return false;
		if (t.getValue()==a)
			return true;
		return isIn(t.getLeft(), a) || isIn(t.getRight(), a);
	}

	public static boolean allIsIn(BinNode<Integer> t1, BinNode<Integer> t2)
	{
		if (t2==null)
			return true;
		if (!isIn(t1, t2.getValue()))
			return false;
		return allIsIn(t1, t2.getLeft()) && allIsIn(t1, t2.getRight());
	}

	public static int nodeCount(BinNode<Integer> t)
	{
		if (t==null)
			return 0;
		return 1+ nodeCount(t.getLeft())+nodeCount(t.getRight());
	}

	public static int isInCount(BinNode<Integer> t, int a)
	{
		int b=0;
		if (t==null)
			return 0;
		if (t.getValue()==a)
			b++;
		return b + isInCount(t.getLeft(), a) + isInCount(t.getRight(), a);
	}

	public static boolean sequentialTreeN(BinNode<Integer> t, int n)
	{
		for (int i=1; i<=n; i++)
		{
			if (isInCount(t, i)!=1)
				return false;
		}
		return true;	
	}

}
