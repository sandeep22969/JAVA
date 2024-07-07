class Hello
{
    public static void main(String args[])
    {
        int x=7;
        int y=5;
        int a=5;
        int b=9;
        boolean result1 = a < b && x > y; //true and true
        boolean result2 = a > b || x < y;     //false or false
        boolean result3 = a>b;            //false
        System.out.println(result1);      //true
        System.out.println(result2);      //false
        System.out.println(!result3);     //true
        
    }
}
