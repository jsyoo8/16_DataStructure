public class ArgumentTest {
	public static void main(String args[]) {
		System.out.print("��ȯ�� ������ \n");
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] : " + args[i]);
		}
		new RPN(new Transform().infixToPostfix(args));
	}
}