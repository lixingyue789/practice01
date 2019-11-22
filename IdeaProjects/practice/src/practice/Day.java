package practice;

/**
 * Author:lxy1999
 * Created:2019/11/9
 */
public enum Day {
    monday("星期1"),tuesday("星期2"),wednesday("星期3"),
    thursday("星期4"),friday("星期5"),saturday("星期6"),sunday("星期7");

    private String name;

    private Day(String name){
        this.name = name;
    }
}
