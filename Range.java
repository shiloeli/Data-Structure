
public class Range {

	private int[] a;
	private int k;

	public Range(int[] a, int k) {
		int arrk[] = new int[k + 1];
		int i = 0;
		while (i < a.length) {
			arrk[a[i++]]++;
		}
		int arrk2[] = new int[k + 1];
		int j = 0;
		int temp = 0;
		while (j < arrk2.length) {
			temp += arrk[j];
			arrk2[j++] = temp;
		}
		this.a = arrk2;
		this.k = k;
	}

	public int query(int a, int b) {
		if (a == 0)
			return this.a[b];
		return this.a[b] - this.a[a - 1];
	}
}
