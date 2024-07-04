import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main1 {

//    public static int romayNumer(String strg){
//
//        int nums = 0;
//
//        for (int i = 0 ; i < strg.length() - 1; i--){
//            if (strg.charAt(i) == "I"){
//                nums + =1;
//            }
//        }
//    }


    public static void main(String[] args) {

//
//        List<String> name  = new ArrayList<>();
//
//        name.add("ALlAye");
//
//      name.forEach(name -> name);

//
//        Stack<Integer> stack = new Stack<>();
//
//        // Push elements onto the stack
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        // Print stack elements
//        System.out.print("Stack after pushes: ");
//
//        // Peek at the top element
//        System.out.println("Top element is: " + stack.peek());
//
//        // Pop elements from the stack
//        System.out.println("Popped element: " + stack.pop());
//        System.out.println("Popped element: " + stack.peek());
//
//        // Print stack elements after pops
//        System.out.print("Stack after pops: ");
//
//        // Check if the stack is empty
//        System.out.println("Is stack empty? " + stack.isEmpty());
//
//        // Pop the last element
//        System.out.println("Popped element: " + stack.pop());
//
//        // Check if the stack is empty after popping all elements
//        System.out.println("Is stack empty? " + stack.isEmpty());
//

//        List<String> name = new ArrayList<>();
//
//        name.add("ALLAYE");
//        name.add("ABDI");
//        name.add("MARIAMMYWIFE");
//
//        List<Integer> mapS = new ArrayList<>();
//        mapS.add(3);
//        mapS.add(2);
//        mapS.add(1);

//
//        name.stream().forEach(System.out::println);
//
//        name.stream().forEach(names -> System.out.println(name));

        //      name.stream().filter(n -> n.length() > 4 && n.length() > 8 ).forEach(System.out::println);


        //       mapS.stream().map(n -> n+n).forEach(System.out::println);


//
//        int nums = 0;
//
//     for(Integer i : mapS) {
//         nums += i;
//     }
//        System.out.println(nums);


        //   mapS.stream().sorted().forEach(System.out::println);

        //  mapS.forEach(System.out::println);


//        List<Integer> reversedList = IntStream.range(0, mapS.size())
//                .mapToObj(i -> mapS.get(mapS.size() - i - 1))
//                .collect(Collectors.toList());
//
//        System.out.println(reversedList);



        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(30);
        st.push(25);
        System.out.println(st);
        System.out.println(st.empty());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.peek());
    }




}
