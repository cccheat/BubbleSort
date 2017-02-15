
public class Main implements Comparable<Integer> {
	Integer[] Jan;
	public int SIZE = 200;
	public int Position1 = 0;
	public int Position2 = 1;

	public void randp(int n) {
		Jan = new Integer[n];
		int num = n;
		for (int i = 0; i < n; i++) {
			Jan[i] = num;
			num--;
		}
		shuffle(Jan);
	}

	public void shuffle(Integer[] ar) {
		for (int i = 0; i < ar.length; i++) {
			int random = i + (int) (Math.random() * (ar.length - i));
			int randomElement = ar[random];
			ar[random] = ar[i];
			ar[i] = randomElement;
		}
	}

	public void init() {
		randp(SIZE);
	}

	public void bubbleSort() {
		init();
		if(Jan[Position1].compareTo(Jan[Position2]) == 0){
		
		}
	}

	@Override
	public int compareTo(Integer o) {
		if (o > Jan[Position1])
			return 1;
		else if (o < Jan[Position1])
			return -1;
		else
			return 0;
	}
}