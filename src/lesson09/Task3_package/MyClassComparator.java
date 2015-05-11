package lesson09.Task3_package;

import java.util.Comparator;

public class MyClassComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        MyClass h1 = (MyClass) o1;
        MyClass h2 = (MyClass) o2;
        int rezult = 0;

        if (h1.getCpu() == h2.getCpu())
            rezult = (h1.getRom() == h2.getRom()) ? 0 : (h1.getRom() > h2.getRom()) ? -1 : 1;
        else
            switch (h1.getCpu()) {
                case Intel_Core_i7:
                    switch (h2.getCpu()) {
                        case Intel_Core_i5:
                            rezult = (h2.getRom() > h1.getRom() ? 0 : -1);
                            break;
                        case Intel_Core_i3:
                            rezult = -1;
                            break;
                        case AMD_A4:
                            rezult = -1;
                            break;
                    }
                    break;
                case Intel_Core_i5:
                    switch (h2.getCpu()) {
                        case Intel_Core_i7:
                            rezult = (h1.getRom() > h2.getRom() ? 0 : 1);
                            break;
                        case Intel_Core_i3:
                            rezult = (h2.getRom() > h1.getRom() ? 0 : -1);
                            break;
                        case AMD_A4:
                            rezult = 1;
                            break;
                    }
                    break;
                case Intel_Core_i3:
                    switch (h2.getCpu()) {
                        case Intel_Core_i7:
                            rezult = 1;
                            break;
                        case Intel_Core_i5:
                            rezult = (h1.getRom() > h2.getRom() ? 0 : 1);
                            break;
                        case AMD_A4:
                            rezult = 1;
                            break;
                    }
                    break;
                case AMD_A4:
                    rezult = 1;
                    break;
            }

        return rezult;
    }
}
