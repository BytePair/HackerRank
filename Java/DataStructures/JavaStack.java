import java.util.*;

class JavaStack {
   
    public static void main(String []argh) {
       
        Scanner sc = new Scanner(System.in);
        Map<Character, Character> tags = new HashMap<Character, Character>();
        tags.put('{', '}');
        tags.put('(', ')');
        tags.put('[', ']');
      
        while (sc.hasNext()) {
            
            String input = sc.next();
            
            /**
             * This is depreciated, use Deque next time...
             * Deque<Character> queue = new ArrayDeque<>()
             */
            LinkedList<Character> list = new LinkedList<Character>();
            
            boolean valid = true;
            
            for (int i = 0; i < input.length(); i++) {
                if (valid == false) {
                    break;
                }
                // opening tags
                if (input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i) == '[') {
                    list.push(input.charAt(i));
                }
                // closing tags                              
                else if (input.charAt(i) == '}' || input.charAt(i) == ')' || input.charAt(i) == ']') {
                    // make sure there is something to pop
                    if (list.size() > 0) {
                        Character lastAdded = list.pop();
                        if (tags.get(lastAdded) != input.charAt(i)) {
                            valid = false;
                        }
                    }
                    else {
                        valid = false;
                    }
                }
                else {
                    valid = false;
                }
            }
            
            // list should be empty at the end
            if (list.size() != 0) {
                valid = false;
            }
            
            System.out.println(valid);
            
        }
      
    }
    
}
