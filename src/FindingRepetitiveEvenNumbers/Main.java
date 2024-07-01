package FindingRepetitiveEvenNumbers;
import java.util.Arrays;


public class Main {
	public static void main(String[]args) {
		int[]list= {2,3,2,1,7,8,5,5,8,7,1,90};
		int[] duplicate=new int[list.length];
		int startIndex=0;
		for(int i=0;i<list.length;i++) {
			for(int j=0;j<list.length;j++) {
				if(i!=j&&list[i]==list[j]&&list[i]%2==0) {
					if(!hasIt(duplicate,list[i])) {
						duplicate[startIndex++]=list[i];
					}
					break;
				}
				
			}
		}
		for(int value:duplicate) {
			if(value!=0) {
				System.out.println(value);
			}
		}
		
	}
	public static boolean hasIt(int[]list,int value) {
		for(int i:list) {
			if(i==value) {
				return true;
			}
			
				
			
		}
		return false;
	}

}

