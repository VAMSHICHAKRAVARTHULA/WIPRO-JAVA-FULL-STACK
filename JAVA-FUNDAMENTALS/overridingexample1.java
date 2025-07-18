class Animal
{
    void sleep()
    {
System.out.println("eating");
    }
}
     class Bird extends Animal
    {

        void eat()
        {
            System.out.println("sleeping");
        }
    }

        public class overridingexample1
    {
            public static void main(String[] args)
            {
              Animal a=new Bird();
               a.sleep();
            }
    }



