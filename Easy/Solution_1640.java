public class Solution_1640 {

	public static void main(String[] args) {
		int[] arr = { 88, 75 };
		int[][] pieces = { { 78 }, { 4, 64 }, { 91 } };
		boolean ans = canFormArray(arr, pieces);
		System.out.println(ans);
	}

	static boolean canFormArray(int[] arr, int[][] pieces) {

		boolean ans = false;
		for (int i = 0; i < arr.length; i++) {
			ans = false;
			for (int j = 0; j < pieces.length; j++) {
				if (arr[i] == pieces[j][0]) {
					ans = true;
					int idx = i;
					for (int k = 0; k < pieces[j].length; k++) {
						if (arr[idx] == pieces[j][k]) {
//							System.out.println(arr[idx]);
						} else {
							return false;
						}
						if (idx < arr.length)
							idx++;
					}
					idx--;
					i = idx;
				}
			}
			if (!ans)
				return false;
		}

		return ans;
	}
}