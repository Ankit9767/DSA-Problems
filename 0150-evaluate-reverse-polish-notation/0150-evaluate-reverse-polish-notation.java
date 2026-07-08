class Solution {
    public int evalRPN(String[] tokens) {
      Deque<Integer> stack = new ArrayDeque<>();
      for(String s : tokens){
        if("+-*/".contains(s)){
            int b = stack.pop();
            int a = stack.pop();
            switch(s){
                case "+": stack.push(a + b); break;
                case "-": stack.push(a - b); break;
                case "*": stack.push(a * b); break;
                case "/": stack.push(a / b); break;
            }
        }
        else {
            stack.push(Integer.parseInt(s));
        }
      }
    return stack.pop();
    }
}