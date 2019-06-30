package animals;

public class Animal {

    private Integer age;
    private Double weight;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void run(){
        System.out.println("跑动");
    }
    public void eat(){
        System.out.println("吃东西");
    }
}
