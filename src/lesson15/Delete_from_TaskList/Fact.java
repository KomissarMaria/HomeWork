package lesson15.Delete_from_TaskList;

import java.util.ArrayList;

/**
 * Разобраться с методом fact (рекурсия)
 */
public class Fact {

    public static interface IFinish {
        void done(long result);
    }

    public static class Finish implements IFinish {
        @Override
        public void done(long result) {
            // System.out.println(result);
        }
    }

    public static class Task extends Thread {
        IFinish finish;
        int n, endn;
        ArrayList<Long> rez;

        public Task(int n, int endn, IFinish finish, ArrayList<Long> rez) {
            this.n = n;
            this.finish = finish;
            this.endn = endn;
            this.rez = rez;
        }

        private long fact(int x, int endx) {
            return (x == endx) ? 1 : x * fact(x - 1, endx);
        }

        public void run() {
            long res = fact(n, endn);
            rez.add(res);
            if (finish != null)
                finish.done(res);
        }
    }

    public static void main(String[] args) {
        ArrayList<Long> rez = new ArrayList<Long>();
        long Factorial = 1;
        Task t = new Task(5, 0, new Finish(), rez);
        Task t1 = new Task(10, 5, new Finish(), rez);
        Task t2 = new Task(15, 10, new Finish(), rez);
        Task t3 = new Task(20, 15, new Finish(), rez);

        t.start();
        t1.start();
        t2.start();
        t3.start();
        for (Long elem : rez) {
            Factorial *= elem;
        }
        System.out.println(Factorial);
    }
}
