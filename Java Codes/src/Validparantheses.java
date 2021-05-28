import java.util.Stack;

public class Validparantheses {
    public static void main(String[] args) {
        System.out.println(isValid("([{])"));
    }
    public static boolean isValid(String s){
        Stack<Character> characterStack = new Stack(); //O(n)
        for(char c :  s.toCharArray()){ //O(n)
            if(c=='(' || c=='[' ||  c=='{'){
                characterStack.add(c);
            }else{
                if(characterStack.isEmpty())return false;
                if(c==']' &&  characterStack.peek()!='[')return false;
                if(c==')' &&  characterStack.peek()!='(')return false;
                if(c=='}' &&  characterStack.peek()!='{')return false;
                characterStack.pop();
            }
        }

        return characterStack.isEmpty();
    }
}
