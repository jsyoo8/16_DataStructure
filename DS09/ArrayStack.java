import java.util.ArrayList;

public class ArrayStack extends ArrayList<Object> {

	public ArrayStack() { // 내용 작성
		super();
	}

	public Object peek() { // 내용 작성
		if (super.isEmpty()) {
			return "Stack is Empty";
		}
		return super.get(this.size() - 1);
	}

	public Object pop() { // 내용 작성
		if (super.isEmpty()) {
			return "Stack is Empty";
		}
		Object p = super.get(this.size() - 1);
		super.remove(this.size() - 1);
		return p;
	}

	public Object push(Object object) { // 내용 작성
		super.add(object);
		return object;
	}

	public int size() { // 내용 작성
		return super.size();
	}
}