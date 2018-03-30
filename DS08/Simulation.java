import java.util.Random;

public class Simulation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gains = 0;
		Random random = new Random();
		ExponentialRandom randombuy = new ExponentialRandom(5);
		ExponentialRandom randomsell = new ExponentialRandom(10);
		int bt = randombuy.nextInt();
		int st = randomsell.nextInt();

		Queue bought = new Queue();
		Queue sold = new Queue();

		for (int time = 0; time <= 100; time++) {
			System.out.printf("-------- Time :%3d (s) --------\n", time);
			if (bt == time) {
				bought.add(random.nextInt(1500), random.nextInt(20));
				System.out.print("bought(구매 정보 저장) ");
				bought.print();
				bt += randombuy.nextInt();
			}
			if (st == time) {
				sold.add(random.nextInt(1500), random.nextInt(20));
				System.out.print("sold(판매 정보 저장)   ");
				sold.print();
				st += randomsell.nextInt();
				while (bought.fAmount() < sold.fAmount() && bought.size() != 0 && sold.size() != 0) {
					gains += bought.fAmount() * (sold.fPrice() - bought.fPrice());
					sold.reAmount(sold.fAmount() - bought.fAmount());
					bought.remove();
				}
				while(bought.fAmount() >= sold.fAmount() && sold.size() != 0 && bought.size() != 0){
				gains += sold.fAmount() * (sold.fPrice() - bought.fPrice());
				bought.reAmount(bought.fAmount() - sold.fAmount());
				sold.remove();
				}
				System.out.print("bought(판매 요청 이후) ");
				bought.print();
				System.out.print("sold(판매 요청 이후)   ");
				sold.print();
				System.out.println("Gains : " + gains + "원");
			}
		}
	}
}
