import java.util.ArrayList;

public class ArrayQueue extends ArrayList<Object> {

	public ArrayQueue() { // 내용 작성
		super();
	}

	public Object first() { // 내용 작성
		if (super.isEmpty()) {
			return "Queue is Empty";
		}
		return super.get(0);
	}

	public Object deQueue() { // 내용 작성
		if (super.isEmpty()) {
			return "Queue is Empty";
		}
		Object p = super.get(0);
		super.remove(0);
		return p;
	}

	public Object addQueue(Object object) { // 내용 작성
		super.add(object);
		return object;
	}

	public int size() { // 내용 작성
		return super.size();
	}

}