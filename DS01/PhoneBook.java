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
		System.out.print("찾으시는 분의 성함을 입력해주세요 : ");
		pName = scan.nextLine();
		if (mPb.find(pName) >= 0) {
			System.out.println("'" + pName + "'님의 번호는 " + mPb.search(mPb.find(pName)) + "입니다.");
			System.out.println("전화번호를 수정하시겠습니까?(y/n)");
			answer = scan.nextLine();
			if (answer.equals("y")) {
				System.out.print("올바른 전화번호를 입력해주세요 : ");
				pNumber = scan.nextLine();
				mPb.update(pName, pNumber);
			}
		} else {
			System.out.print("찾으시는 번호는 존재하지 않습니다.\n새로운 연락처를 저장하시겠습니까?(y/n)");
			answer = scan.nextLine();
			if (answer.equals("y")) {
				System.out.print("연락처를 입력해주세요 : ");
				pNumber = scan.nextLine();
				mPb.update(pName, pNumber);
			} else {
				System.out.println("저장되지 않았습니다.");
			}
		}
		mPb.print_to_file(fileName);
	}

}
