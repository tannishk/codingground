
import java.lang.Math; // header stuff MUST go above the first class

// our main class becomes a file but the main method is still found
public class node
{
  String item;
  node next;
};
public class queue
{
  node first,last;
  public queue()
  {
    first=null;
    last=null;
  }
  private boolean isEmpty()
  {
    return first==null;
  }
  public void enque(String item)
  {
    if(first==null)
    {
      first=new node();
      first.item=item;
      first.next=null;
      last=first;
    }
    else
    {
      node oldlast=last;
      last=new node();
      last.item=item;
      last.next=null;
      oldlast.next=last;
    }
  }
  public String deque()
  {
    String item=first.item;
    first=first.next;
    if(isEmpty())
    {
      last=null;
    }
      return item;
    
  }
};
public class HelloWorld
{
  public static void main(String[] args)
  {
    queue q=new queue(); 
    q.enque("i");
    q.enque("am");
    q.enque("tannishk");
    System.out.print(q.deque()+q.deque()+q.deque());
  }
}
// this
