public class Test
{
    public static <T extends Order> T max(T a, T b) // type extends order . type before name of method and type before each thing that max 
   													// that max is taking in
    {
        if(a.greaterThan(b))
        {
            return a;
        }
        return b;
    }
}