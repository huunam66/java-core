package DTO;

public class test2 extends test1 {

    @Override
    public void show1() {
        System.out.println("show 1 - test 2");
    }
    
    public void show3() {
        super.show2();
    }
}
