/**
 * Author:lxy1999
 * Created:2019/9/2
 */
public class Person implements Comparable<Person>{
    public int age;
    public int rank;
    public String name;

    @Override
    public String toString() {
        return String.format("{age="+age+"}"+"{rank="+rank+"}");
    }
//    public void getInfo(){
//        System.out.println("age="+age);
//    }

    @Override
    public int compareTo(Person o) {
        if(this.age<o.age){
            return -1;
        }else if(this.age == o.age){
            return 0;
        }else{
            return 1;
        }
    }
}
