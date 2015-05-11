package lesson13.Delete_from_TaskList;


public class ArrayClass<E> {
    private E[] array;

    public E getElem(int index) {
        return this.array[index];
    }

    public ArrayClass(E[] array) {
        this.array = array;
    }

}
