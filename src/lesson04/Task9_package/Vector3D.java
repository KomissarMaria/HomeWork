package lesson04.Task9_package;

public class Vector3D {
    private int x, y, z;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String sum(Vector3D vector1, Vector3D vector2) {
        int sumx = vector1.x + vector2.x;
        int sumy = vector1.y + vector2.y;
        int sumz = vector1.z + vector2.z;

        return "{" + sumx + ";" + sumy + ";" + sumz + "}";
    }

    public int scalarmul(Vector3D vector1, Vector3D vector2) {
        int mulx = vector1.x * vector2.x;
        int muly = vector1.y * vector2.y;
        int mulz = vector1.z * vector2.z;

        return mulx + muly + mulz;
    }

    public String vectormul(Vector3D vector1, Vector3D vector2) {
        int mulx = vector1.y * vector2.z - vector1.z * vector2.y;
        int muly = vector1.z * vector2.x - vector1.x * vector2.z;
        int mulz = vector1.x * vector2.y - vector1.y * vector2.x;

        return "{" + mulx + ";" + muly + ";" + mulz + "}";
    }

}
