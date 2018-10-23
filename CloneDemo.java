class TestClone implements Cloneable  {

    int a;
    double b;
    TestClone CloneTest(){
        try {
            return(TestClone)super.clone();

        }
        catch (CloneNotSupportedException e){
            System.out.println("Cloning not available");
            return this;
                    }
    }

}

public class CloneDemo {
    public static void main(String[] args)
    {
        TestClone x1 =new TestClone();
        TestClone x2;
        x1.a=10; x1.b = 20.98;
        x2 = x1.CloneTest();
        x2.a = 11;
        System.out.println(x2.a);
        System.out.println(x1.a);
    }
}