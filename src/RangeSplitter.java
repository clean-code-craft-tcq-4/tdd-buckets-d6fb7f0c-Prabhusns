import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RangeSplitter {

	public static List<RangeListPojo> rangeConsecutiveNumbers(List<Integer> nums) {
		if (nums == null) {
			return null;
		}
		nums = nums.stream().sorted().collect(Collectors.toList());

		List<Integer> currentList = new ArrayList<>();
		List<RangeListPojo> rangeOp = new ArrayList<>();

		int count = 0;
		for (int i = 0; i < nums.size(); i++) {
			if (currentList.size() == 0) {
				currentList.add(nums.get(i));
				count += 1;
			}
			if (i != nums.size() - 1) {
				if (nums.get(i) == nums.get(i + 1)) {
					count += 1;
				} else if (nums.get(i + 1) - nums.get(i) == 1) {
					currentList.add(nums.get(i + 1));
					count += 1;
				} else if (nums.get(i) != nums.get(i + 1) - 1) {
					rangeOp.add(new RangeListPojo(currentList, count));
					currentList = new ArrayList<>();
					count = 0;
				}
			} else {
				if (currentList.size() > 0) {
					rangeOp.add(new RangeListPojo(currentList, count));
					currentList = new ArrayList<>();
					count = 0;
				}
			}
		}
		return rangeOp;
	}

}
