package task;
import java.util.*;
public class rand_t1 
{
	
	    public static void main(String[] args) {
	        int array[]={1,2,3,4,5,6,7};
	        ShuffleElememt(array);
	        System.out.println("Shuffled Array: "+ Arrays.toString(array));
	    }
	    
	    public static void ShuffleElememt(int array[])
	    {
	     
	        Random rand= new Random();
	        for(int i=array.length-1; i>0; i--)
	        {
	            int j=rand.nextInt(i+1);
	            
	            int temp= array[j];
	            array[j]=array[i];
	            array[i]=temp;
	        }
	    }
}
