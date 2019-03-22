package HW6;

public class SimpleNumberCount {
    private int sum=0;
    private int count=0;
    private int n=0;

    public static void main(String[] args) {
        SimpleNumberCount snc=new SimpleNumberCount();
        //snc.simpleNumber(4);
        snc.test1();
    }


    //в этом методе проверяем простое число или нет, т.е. выполняет ли наши устовия. что делится на
    // 1 и только на самого себя. если да возвращаем true есл и нет то false
    public boolean simpleNumber(int n) {
        if (n==1) return false;

        if (n>=2&&n%n==0&&n%1==0) {
             System.out.println("true: "+n);
                return true;
            }
        System.out.println("false: "+n);
        return false;

    }

    public void test1() {
        for (int i=1;i<=500;i++) {
            n++;
          if (n==17||n==71) {
                continue;
            }System.out.println(n);
        }
    }
}
