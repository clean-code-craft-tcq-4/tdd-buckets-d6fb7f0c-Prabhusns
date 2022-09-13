import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestCase {
	@Test
	public void testRanges() {
		List<Integer> nums = Arrays.asList(2, 3, 3, 5, 4, 10, 11, 12, 18, 19, 19, 19, 19, 20, 13, 25);
	//	assertNull(RangeSplitter.rangeConsecutiveNumbers(null));
		assertNull(RangeSplitter.rangeConsecutiveNumbers(nums));
		List<RangeListPojo> rangeOp = RangeSplitter.rangeConsecutiveNumbers(nums);
		assertTrue(rangeOp.get(0).getListVal() == null);
	}

}
