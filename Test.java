class CountInverse{
	

	static int countInv(int[] arr,int len){
		
		int count=0;
		for(int i=0;i<len-1;i++){

			for(int j=i+1;j<len;j++){

				if(arr[i]>arr[j]){
					count++;

				}

			}


		}

		return count;





	}

	public static void main(String []args){

		int[] arr= {8,4,1,2};
		int len = arr.length;
		int result = countInv(arr,len);

		System.out.println(result);
		


	}





}