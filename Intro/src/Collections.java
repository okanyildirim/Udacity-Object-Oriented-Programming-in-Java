import java.util.*;

public class Collections {

    public static void main(String[] args) {

        /*
        // Standart Array
        int[] array;
        array= new int[10];

        for (int i = 0; i <array.length ; i++) {
            array[i]=i;
            System.out.println(array[i]);
        }
        */

        //////////////////////////////////////////////////////// ArrayList
        /*
        ArrayList arrayList=new ArrayList();

        for (int i = 0; i <10 ; i++) {
            arrayList.add(i);
            System.out.print(arrayList.get(i).toString());
        }

        arrayList.add(10,10);
        arrayList.remove(5);

       // arrayList.clone();
        if(arrayList.contains(5)){
            for (int i = 0; i <arrayList.size() ; i++) {
                System.out.println(arrayList.get(i).toString());
            }
        }
        else{
            arrayList.clear();
            for (int i = 0; i <arrayList.size() ; i++) {
                System.out.println(arrayList.get(i).toString());
            }
        }

        */

        /////////////////////////////////////////////Stack
        /*
         Stack stack=new Stack();

        for (int i = 0; i <10 ; i++) {
            stack.push(i);
        }

        for (;true ;) {
            try {
                System.out.println("Size: "+ stack.size()+" Pop: "+ stack.pop().toString()+ " Peek: "+stack.peek().toString());
                if(stack.empty())
                    break;

            }
           catch (Exception e){
                e.getMessage();
               break;
           }
        }

        //stack.search(5);
*/

        ///////////////////////////////////////////Queue
        Queue orders = new LinkedList();
        orders.add("Order1");
        orders.add("Order2");
        orders.add("Order3");
        System.out.print(orders.poll());
        System.out.print(orders.poll());
        System.out.print(orders.poll());

        Deque deque=new LinkedList();
        deque.addFirst(5);
        deque.addFirst(10);
        deque.addFirst(15);
        deque.addLast(100);
        deque.addLast(200);
        System.out.println(deque.getFirst());
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.getLast());
        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        ArrayList <String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        for(String d:days){

            if(d.equals("Tuesday"))
                System.out.println(d+" index: "+ days.indexOf(d));
        }

    }
}
