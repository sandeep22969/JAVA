class Hello
{
    public static void main(String a[])
    {
        int num1=9;   //4 bytes
        byte by=127;  //8 bytes
        short sh=558; //2 bytes
        long l=5854l; //1 bytes

        float f=5.8f; //4 bytes
        double d=5.8; //8 bytes

        char c='k';   //2 bytes

        boolean b=true;


        System.out.println(num1);
        System.out.println(by);
        System.out.println(sh);
        System.out.println(l);

        System.out.println(f);
        System.out.println(d);

        System.out.println(c);

        System.out.println(b);
    }
}
