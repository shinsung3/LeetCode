public class Duplicate_Zeros {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 3, 0, 0, 5, 0 };
		duplicateZeros(arr);
	}

	public static void duplicateZeros(int[] arr) {
		int idx = 0;
		int arrCopy[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrCopy[i] = arr[i];
		}
		int i = 0;
		while (true) {
			if (arrCopy[i] == 0) {
				arr[idx] = arrCopy[i];
				idx++;
				if(idx==arr.length)
					break;
				arr[idx] = 0;
				idx++;
				if(idx==arr.length)
					break;
			} else {
				arr[idx] = arrCopy[i];
				idx++;
				if(idx==arr.length)
					break;
			}
			i++;
		}
//		System.out.println(Arrays.toString(arr));
	}
}