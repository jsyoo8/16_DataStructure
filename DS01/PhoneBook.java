import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		String fileName = "PhoneBook.txt";
		int size = 100;

		String pName;
		String pNumber;
		String answer;
		Pb mPb = new Pb(fileName, size);
		Scanner scan = new Scanner(System.in);
		System.out.print("ã���ô� ���� ������ �Է����ּ��� : ");
		pName = scan.nextLine();
		if (mPb.find(pName) >= 0) {
			System.out.println("'" + pName + "'���� ��ȣ�� " + mPb.search(mPb.find(pName)) + "�Դϴ�.");
			System.out.println("��ȭ��ȣ�� �����Ͻðڽ��ϱ�?(y/n)");
			answer = scan.nextLine();
			if (answer.equals("y")) {
				System.out.print("�ùٸ� ��ȭ��ȣ�� �Է����ּ��� : ");
				pNumber = scan.nextLine();
				mPb.update(pName, pNumber);
			}
		} else {
			System.out.print("ã���ô� ��ȣ�� �������� �ʽ��ϴ�.\n���ο� ����ó�� �����Ͻðڽ��ϱ�?(y/n)");
			answer = scan.nextLine();
			if (answer.equals("y")) {
				System.out.print("����ó�� �Է����ּ��� : ");
				pNumber = scan.nextLine();
				mPb.update(pName, pNumber);
			} else {
				System.out.println("������� �ʾҽ��ϴ�.");
			}
		}
		mPb.print_to_file(fileName);
	}

}
