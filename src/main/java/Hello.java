public class Hello {
    public void str (String str){
        System.out.println(str);
    }

    public void num(int num1, int num2){
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        Hello obj=new Hello();
        String tutor="Hello world";
        obj.str(tutor);
        int num1=1;
        int num2=1;
        obj.num(num1,num2);
    }
}
