
public class BinaryHeap {
	int maxSize;
	int a[];
	int size;
	
	public BinaryHeap(int maxSize) {
		// TODO Auto-generated constructor stub
		this.maxSize = maxSize;
		a = new int[maxSize];
		size = -1;
	}
	public int getMin(){
		if(size>-1){
		return a[0];
		}
		else{
			System.out.println("Heap empty");
			return -1;
		}
	}
	public void addElement(int data){
		if(size == maxSize - 1){
			System.out.println("Heap full");
		}else{
			++size;
			a[size] = data;
			heapify(a,size);
		}
	}
	public int extractMin(){
		if(size>-1){
			int min = a[0];
			a[0] = a[size];
			--size;
			heapifyDown(a);
			return min;
		}else{
			System.out.println("Heap Empty");
			return -1;
		}
	}

	private void heapifyDown(int[] a) {
		// TODO Auto-generated method stub
		int index = 0;
		while(index <= size/2){
			int minChild = index;
			if(getChild(2*index +1) >= getChild(2*index + 2))
				minChild = 2*index + 2;
			else if(getChild(2*index +1) < getChild(2*index + 2)){
				minChild = 2*index +1;
			}
			if(minChild<=size){
			if(a[index] > a[minChild]){
				int temp = a[index];
				a[index] = a[minChild];
				a[minChild] = temp;
			}
			}
			else{
				break;
			}
			index = minChild;
		}
	}
	private int getChild(int i) {
		// TODO Auto-generated method stub
		if( i <= size) return a[i];
		else
		return Integer.MAX_VALUE;
	}
	private void heapify(int[] a, int index){
		while( index > 0){
			int parent = getParent(index);
			if(a[index] < a[parent]){
				int temp = a[index];
				a[index] = a[parent];
				a[parent] = temp;
			}else{
				break;
			}
			index = parent;
		}
	}
	private int getParent(int i){
		return (i-1)/2;
	}
	
}
