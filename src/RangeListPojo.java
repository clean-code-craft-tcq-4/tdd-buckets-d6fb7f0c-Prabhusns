import java.util.ArrayList;
import java.util.List;

public class RangeListPojo {
	List<Integer> listVal = new ArrayList<>();
	int count = 0;

	public List<Integer> getListVal() {
		return listVal;
	}

	public void setListVal(List<Integer> listVal) {
		this.listVal = listVal;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public RangeListPojo(List<Integer> listVal, int count) {
		super();
		this.listVal = listVal;
		this.count = count;
	}

	@Override
	public String toString() {
		return listVal.get(0) + "-" + listVal.get(listVal.size() - 1) + "," + count;
	}

}
