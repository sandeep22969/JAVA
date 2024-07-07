class Hello
{
    public static void main(String args[])
    {
        int x=7.6;
        int y=5.2; 
        
        boolean less_than = x < y;
        boolean great_than = x > y;
        boolean equal_to = x == y;
        boolean less_equal_to = x <= y;
        boolean great_equal_to = x >= y;
        boolean not_equal = x!=y; 

        System.out.println(less_than);
        System.out.println(great_than);
        System.out.println(equal_to);
        System.out.println(less_equal_to);
        System.out.println(great_equal_to);
        System.out.println(not_equal);
    }
}
