public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
		if (nums == null)
			return null;
		return construct(nums, 0, nums.length - 1);
	}

	public TreeNode construct(int[] nums, int start, int end) {
		if (start > end)
			return null;
		int max_idx = start;
		for (int i = start + 1; i <= end; i++) {
			if (nums[i] > nums[max_idx])
				max_idx = i;
		}
		TreeNode node = new TreeNode(nums[max_idx]);
		node.left = construct(nums, start, max_idx - 1);
		node.right = construct(nums, max_idx + 1, end);
		return node;
	}
}
