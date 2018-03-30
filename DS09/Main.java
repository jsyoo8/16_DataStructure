import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack a = new ArrayStack();
		ArrayQueue b = new ArrayQueue();
		Random rd = new Random();
		for (int i = 0; i < 10; i++) {
			a.push(rd.nextInt(100));
			b.addQueue(rd.nextInt(100));
		}
		System.out.println("********** Test ArrayStack **********");
		for (int j = 0; j < 11; j++) {
			System.out.print(j+" : "+a.peek() + " / " + a.pop());
			System.out.println();
		}
		System.out.println("\n********** Test ArrayQueue **********");
		for (int k = 0; k < 11; k++) {
			System.out.print(k+" : "+b.first() + " / " + b.deQueue());
			System.out.println();
		}
	}

}