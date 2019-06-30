package chicken_traffic;

public class Chicken {
    private int male = 5;
    private int female = 3;
    private int son = 3;

    public void buy(int money,int num){
        for(int f = 0; f <= num;f++){
            for(int m = 0; m <= num;m++){
                for(int s = 0; s <= num;s++){
                    if((m+f+s)==money && ((f*female+m*male+s/son) == money) && (s%son == 0)){
                        System.out.println("公鸡："+m+"，母鸡："+f+"，小鸡："+s);
                        System.out.println();
                    }
                }
            }
        }
    }
}
