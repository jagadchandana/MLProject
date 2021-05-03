class Array{
	public static void main(String[] args){
		int[] ar={12,23,34,45,6,56,67,78,89,90,9,87,76};
		printArray(ar);
		}
	public static void printArray(int[] a){
		System.out.print("[");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+", ");
			}
		//System.out.print(Arrays.toString(a));
		System.out.print("\b\b]");
		}
	}
