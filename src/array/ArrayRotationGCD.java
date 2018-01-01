package array;

public class ArrayRotationGCD {

	void leftRotate(int arr[],int d,int n){
		
		int i,j,k,temp,gcd;
		gcd = gcd(d,n);
		
		for(i=0;i<gcd;i++){
			temp = arr[0];
			j=i;
			
			while(true){
				k = j+d;
				if(k>=n){
					k = k-n;
				}
				if(k==i){
					break;
				}
				arr[j] = arr[k];
				j = k;
			}
			
			arr[j] = temp;
		}
		
	}
	
	int gcd(int a,int b){
		if(b == 0){
			return a;
		}else{
			return gcd(b,a%b);
		}
		
	}
	
	void printArray(int arr[], int size) 
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
	
	public static void main(String[] args) {
        ArrayRotationGCD rotate = new ArrayRotationGCD();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }
	
}
