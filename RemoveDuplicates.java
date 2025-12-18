import java.util.*;

public class RemoveDuplicates
{
	
public static void main(String[] args)
{
  removeUsingCollection(454700);
  removeDuplicatesNum(454700);
   removeDuplicatesCNumArray(new int[]{4,5,4,7,0,0});
   removeDuplicatesNumArray(new int[]{4,5,4,7,0,0});
}	

static void removeDuplicatesNumArray(int[] array)
{	
  
   boolean[] seen=new boolean[10]; //no matter the array length ,booloean array has to be 10 in size for all numbers to fit in
   
   int i=0;
   System.out.print("result from removeDuplicatesNum Array  ");
   int arrayLen= array.length;
   System.out.println(arrayLen);
   while(i<arrayLen)
   {
	 if(!seen[array[i]])
	 {
       seen[array[i]]=true;
       System.out.print(array[i]+" ");	   
	 }

     i++;	 
   }   
  
   System.out.println();
   
	
}

static void removeDuplicatesCNumArray(int[] array)
{	
  Set<Integer> set = new HashSet<>();
  for(int arr:array)
  {
    set.add(arr);
  }	  
   
   System.out.println("result from removeDuplicatesNum Array using Collection: "+set);
   
	
}


	
static void removeDuplicatesNum(int input)
{
	int result=0;
	int place=1;
	boolean[] seen=new boolean[10];
	while(input>0)
	{
		int digit=input%10;
		if(!seen[digit])
		{
         seen[digit]=true;
         result+=digit*place;
         place*=10;
        }
 

          input = input/10; 
		

	}
	System.out.println("result from removeDuplicatesNum: "+result);
}	
	
	
 static void removeUsingCollection(int input)
{
 
  StringBuilder sb=new StringBuilder();
  String strInput = Integer.toString(input);
  Set<Character> set=new HashSet<>();
  for(char chr:strInput.toCharArray())
  {
    if(set.add(chr))
	{
		sb=sb.append(chr);
	}
  }
  
  System.out.println(Integer.valueOf(sb.toString()));
     
	
}	





	
	
}

	