package chicken_traffic;

public class Traffic {
    private int self = 500;
    private int bus = 300;
    private int train = 400;
    private int air = 1000;

    public void travle(int money){
        if(money >= self){
            System.out.println("自驾");
        }else{}
        if(money >= bus){
            System.out.println("大巴车");
        }else{}
        if(money >= train){
            System.out.println("火车");
        }else {}
        if (money >= air){
            System.out.println("飞机");
        }else {}
    }
}
