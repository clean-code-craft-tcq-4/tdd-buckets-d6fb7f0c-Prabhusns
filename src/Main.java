import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 3, 3, 5, 4, 10, 11, 12, 18, 19, 19, 19, 19, 20, 13, 25);
		List<RangeListPojo> rangeOp = RangeSplitter.rangeConsecutiveNumbers(nums);
		System.out.println("Range, Readings");
		rangeOp.stream().forEach(s -> System.out.println(s));
	}

}
