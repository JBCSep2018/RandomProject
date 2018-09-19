package me.afua;

public class Main {
    private int myvariable;

    public static void main(String[] args) {

        Person jj = new Person();
        jj.setMyName("Josemy");
        jj.setAge(100);


        System.out.println("Hello, my name is "+jj.getMyName()+" and I am "+jj.getAge()+" years old");

    }

    public int returnMyVariable(int variable)
    {
        return variable+1;
    }
}
