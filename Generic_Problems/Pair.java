public class Pair<T1,T2> // defining types up here
{
    private T1 value1;
    private T2 value2;
    
    public Pair(T1 val1 , T2 val2)
    {
        this.value1 = val1;
        this.value2 = val2;
    }
    
    public String toString()
    {
        return this.value1 + " " + this.value2;
    }
}