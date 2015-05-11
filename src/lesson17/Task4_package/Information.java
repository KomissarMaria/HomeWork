package lesson17.Task4_package;

import java.util.Arrays;

public class Information {
    public String name;
    public String surname;
    public Adress address;
    public String[] phones;
    public String[] sites;

    @Override
    public String toString() {
        String rezult = "Human: " + name + " " + surname + " lives in " + address.toString() + '\n' + "phones: " + Arrays.toString(phones) + '\n' + "sites: " + Arrays.toString(sites);
        return rezult;
    }

}

