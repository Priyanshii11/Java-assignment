 //add and take value from command line mode//
 public class add {
    public static void main(String args[])
    {
        
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=a+b;
        System.out.println("sum :" +c);
    }
}
