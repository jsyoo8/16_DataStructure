import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("데이터 크기 : ");
		int size = scan.nextInt();
		int a[] = new int[size];
		Random Rd = new Random();

		Search sh = new Search();
		for (int i = 0; i < size; i++) {
			a[i] = Rd.nextInt(size);
		}
		int testValue = a[Rd.nextInt(size)];
		long end1, start1, t1, end2, start2, t2;

		System.out.println("찾으려는 값 : " + testValue);

		start1 = System.nanoTime();
		int p = sh.sequentialSearch(a, testValue);
		end1 = System.nanoTime();
		t1 = end1 - start1;

		sh.sQprintMassage(p, t1);

		Arrays.sort(a);
		start2 = System.nanoTime();
		int q = sh.binarySearch(a, testValue);
		end2 = System.nanoTime();
		t2 = end2 - start2;

		sh.bNprintMassage(q, t2);
	}
}