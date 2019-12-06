import java.util.Comparator;

/**
 * Author:lxy1999
 * Created:2019/9/4
 */
public class personRankComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.rank-o2.rank;
    }
}
