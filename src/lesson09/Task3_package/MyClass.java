package lesson09.Task3_package;

public class MyClass implements Cloneable {
    private int rom;
    private String firm;
    private double diagonal;
    private CPU cpu;

    enum CPU {Intel_Core_i5, Intel_Core_i7, Intel_Core_i3, AMD_A4}

    public MyClass(CPU cpu, int rom, String firm, double diagonal) {
        this.rom = rom;
        this.firm = firm;
        this.diagonal = diagonal;
        this.cpu = cpu;
    }

    @Override
    public boolean equals(Object o) {

        if (null == o) return false;
        if (this.getClass() != o.getClass()) return false;

        MyClass myClass = (MyClass) o;
        if ((this.cpu == myClass.cpu) && (this.rom == myClass.rom) && (this.diagonal == myClass.diagonal) && (this.firm != null && myClass.firm != null && this.firm.equals(myClass.firm)))
            return true;
        else return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        MyClass o = (MyClass) super.clone();
        return o;

    }

    @Override
    public String toString() {
        return "Notebook " + firm + ", " + cpu + " cpu, " + rom + " GB rom, diagonal " + diagonal + "-inch";
    }

    public CPU getCpu() {
        return cpu;
    }

    public int getRom() {
        return rom;
    }

    public String getFirm() {
        return firm;
    }

    public double getDiagonal() {
        return diagonal;
    }
}
