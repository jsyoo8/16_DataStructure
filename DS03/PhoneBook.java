import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class PhoneBook {

	private Person start;

	public class Person {
		Person next;
		String name;
		String phoneNumber;
		Person() {
			
		}

		Person(Person x, Person nextPerson) {
			this.name = x.name;
			this.phoneNumber = x.phoneNumber;
			this.next = nextPerson;
		}
	}

	PhoneBook(String fileName) {
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			Person x = new Person();
			String line = br.readLine();
			while (line != null) {
				StringTokenizer parser = new StringTokenizer(line, " ");
				while (parser.hasMoreTokens()) {
					x.name = parser.nextToken();
					x.phoneNumber = parser.nextToken();
				}
				line = br.readLine();
				this.insert(x);
				System.out.println("���� : " + x.name + " - " + x.phoneNumber);

			}
			br.close();
			System.out.println("���� �б� ����.");

		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
		}
	}

	public void insert(Person x) {
		if (start == null || start.name.compareTo(x.name) > 0) {
			start = new Person(x, start);
		} else {
			Person p = start;
			while (p.next != null) {
				if (p.next.name.compareTo(x.name) > 0) {					
					break;
				}
				p = p.next;
			}
			p.next = new Person(x, p.next);
		}
	}

	void print(String fileName) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, false));
			int i = 1;
			System.out.println("��ȭ��ȣ�θ� ����մϴ�.");
			for (Person p = start; p != null; p = p.next) {
				bw.append(i + " : " + p.name + " " + p.phoneNumber);
				System.out.println(i + " : " + p.name + " " + p.phoneNumber);
				bw.newLine();
				i++;
			}
			System.out.println("���� ��� �Ϸ�");

			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
