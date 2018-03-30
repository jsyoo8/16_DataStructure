public class Transform {
	private ArrayStack stack;

	public String[] infixToPostfix(String[] args) {
		if (args == null) {
			return null;
		} else {
			ArrayStack p = new ArrayStack(args.length);
			stack = new ArrayStack(args.length);
			for (int i = 0; i < args.length; i++) {
				if (args[i].equals("(")) {
					p.push(args[i]);
				} else if (args[i].equals(")")) {
					while (!p.peek().equals("(")) {
						stack.push(p.pop());
					}
					p.pop();
				} else if (args[i].equals("A") || args[i].equals("S") || args[i].equals("D") || args[i].equals("M")) {
					if (p.isEmpty() == true || this.precedence((String) p.peek()) > this.precedence(args[i])) {
					} else {
						while (p.isEmpty() == false && !p.peek().equals("(")) {
							stack.push(p.pop());
						}
					}
					p.push(args[i]);
				} else {
					stack.push(args[i]);
				}
			}
			while (p.isEmpty() == false) {
				stack.push(p.pop());
			}
			String[] postStack = new String[stack.size()];
			while (stack.isEmpty() == false){
				p.push(stack.pop());
			}
			int index = 0;
			System.out.print("변환된 후위식 :");
			while (p.isEmpty() == false){
				postStack[index] = (String)p.pop();
				System.out.print(" "+postStack[index]);
				index++;
			}
			System.out.println();
			return postStack;
		}
	}

	public int precedence(String token) {
		switch (token) {
		case "A":
		case "S": {
			return 3;
		}
		case "M":
		case "D": {
			return 2;
		}
		case "(": {
			return 1;
		}
		default: {
			return 4;
		}
		}
	}
}
