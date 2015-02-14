public class Stack{
    String[] s;
    public Stack(int size)
    {
        s=new String[size];
    }
    int first=0;
    public void push(String item)
    {
        first++;
        s[first]=item;
    }
    public String pop()
    {
        String item;
        item=s[first];
        first--;
        return item;
    }
}