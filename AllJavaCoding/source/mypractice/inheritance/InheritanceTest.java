package mypractice.inheritance;

/**
 * Created by IntelliJ IDEA.
 * User: CO21321
 * Date: Aug 26, 2013
 * Time: 5:28:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class InheritanceTest {

    class Super {
        public int a;

        protected Super(int a) {
            this.a = a;
        }
    }

    class Sub extends Super{

        public Sub(int a){
            super(a);
        }

        public Sub(){
            super(5);
        }
    }
}
