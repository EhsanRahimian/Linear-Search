
package programforlinearsearch;

// This function returns index of element x in arr[]
public class ProgramForLinearSearch {
    public static int linear(int arr[],int x){
        for (int i=0;i<arr.length;i++){
        // Return the index of the element if the element is found 
            if(arr[i]==x)
                return i;
        }
        // return -1 if the element is not found
        return -1;
                
    }

    
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        int x = 7;
        ProgramForLinearSearch ob = new ProgramForLinearSearch();
        int result=ob.linear(arr,x);
        if (result ==-1)
            System.out.println("Element not present"); 
		else
		System.out.println("Element found at index " + result);
        
    }
    
}
