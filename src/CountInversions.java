import java.util.ArrayList;


public class CountInversions {
	
	private ArrayList<Integer> list = new ArrayList<Integer>();
	private int totalInversions = 0;
	public int firstIndex, lastIndex;
	
	public CountInversions(ArrayList<Integer> l){
		
		list = l;
		firstIndex = 0;
		lastIndex = list.size() - 1;
		
	}
	
	public int getTotalInversions(){
		
		return totalInversions;
		
	}
	
	public void countTotalInversions(int low, int high){
		
		int pivotPoint = 0;
		
		if (high > low){
			
			pivotPoint = partition(low, high, pivotPoint);
			countTotalInversions(low, pivotPoint - 1);
			countTotalInversions(pivotPoint + 1, high);
			
		}
		
	}
	
	private int partition(int low, int high, int pivotPoint){
		
		int pivotItem = list.get(low);
		int j = low;
		
		for (int i = low + 1; i <= high; i++){
			if (list.get(i) < pivotItem){
				j++;
				swap(i, j);
				totalInversions++;
			}
		}
		pivotPoint = j;
		swap(low, pivotPoint);
		return pivotPoint;
	}
	
	private void swap(int num1, int num2){
		
		int temp = list.get(num1);
		list.set(num1, list.get(num2));
		list.set(num2, temp);
		
	}

}
