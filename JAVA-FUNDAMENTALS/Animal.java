class Animal{
    void eat();{
System.out.println("eating");
    }
    void class Bird extend Animal{

        void Sleep(){
            System.out.println("sleeping");
        }
        public class overridingexample1{
            public static void main(String[] args);
            Animal a=new Bird();
            a.eating();
        }
    }


}
