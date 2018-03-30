import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pb {
	public class Person {
		String phoneNumber;
		String name;
	}

	int linesCount;
	private Person[] mPerson;

	Pb(String fileName, int size) {
		mPerson = new Person[size];

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			linesCount = 0;
			String line = br.readLine();

			while (line != null) {
				mPerson[linesCount] = new Person();
				String linesplit[] = line.split(" ");
				mPerson[linesCount].name = linesplit[0];
				mPerson[linesCount].phoneNumber = linesplit[1];
				linesCount++;
				line = br.readLine();
			}

			br.close();
			System.out.println("주소록 읽기 성공.");

		} catch (FileNotFoundException e) {
			System.out.println("주소록 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
		}
	}

	int find(String name) {
		int i = 0;
		while (i < linesCount) {
			if (mPerson[i].name.equals(name)) {
				return i;
			}
			i++;
		}
		return -1;
	}

	String search(int number) {
		if (number >= 0) {
			return mPerson[number].phoneNumber;
		} else {
			return "없음";
		}
	}

	void update(String name, String phoneNumber) {
		if (this.find(name) >= 0) {
			System.out.print("\"" + name + "\"의 번호를 " + mPerson[this.find(name)].phoneNumber + " - > ");
			mPerson[this.find(name)].phoneNumber = phoneNumber;
			System.out.println(mPerson[this.find(name)].phoneNumber + "(으)로 전화번호가 수정되었습니다.");
		} else {
			mPerson[linesCount] = new Person();
			mPerson[linesCount].name = name;
			mPerson[linesCount].phoneNumber = phoneNumber;
			System.out.println("\"" + name + "\"님의 전화번호가 " + mPerson[linesCount].phoneNumber + "(으)로 저장되었습니다.");
			linesCount++;
		}
	}

	void print_to_file(String fileName) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, false));
			int i = 0;
			String[] txt = new String[linesCount];
			while (i <= linesCount && mPerson[i]!=null) {
				txt[i] = (mPerson[i].name + " " + mPerson[i].phoneNumber);
				bw.append(txt[i]);
				bw.newLine();
				i++;
			}
			System.out.println("파일 출력 완료");
			
			bw.flush();
			bw.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
