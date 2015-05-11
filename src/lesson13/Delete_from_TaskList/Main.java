package lesson13.Delete_from_TaskList;

/**
 * Написать класс, который умеет хранить в себе массив любых типов данных. Реализовать метод, который возвращает любой элемент массива по индексу
 */
public class Main {
    public static void main(String[] args) {
        Integer[] masint = {1,2,3,4,5,6,7};
        ArrayClass<Integer> classint = new ArrayClass<Integer>(masint);
        int elem = classint.getElem(3);
        System.out.println(elem);

        String[] masstr = {"q","w","t"};
        ArrayClass<String> classstr = new ArrayClass<String>(masstr);
        String elems = classstr.getElem(2);
        System.out.println(elems);
    }
}
