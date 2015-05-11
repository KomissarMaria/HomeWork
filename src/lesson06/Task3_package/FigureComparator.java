package lesson06.Task3_package;

import java.util.Comparator;

public class FigureComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Figure f1 = (Figure) o1;
        Figure f2 = (Figure) o2;
        if (f1.findsquare() > f2.findsquare()) return 1;
        else if (f1.findsquare() == f2.findsquare()) return 0;
        else if (f1.findsquare() < f2.findsquare()) return -1;

        return 0;
    }
}
