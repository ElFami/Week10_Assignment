public class Final {
    final void method1(){
        System.out.println("This is a final method!");
    }
}

class b extends Final{
    void method2(){
        //Compile Error
        System.out.println("Illegal");
    }
}
