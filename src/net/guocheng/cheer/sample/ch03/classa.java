package net.guocheng.cheer.sample.ch03;

public class classa {
	public static void main (String []args){
		int aa[]={1,2,3,4,};
//		int c=1;
//		int bb[]=new int[c];
		int temp=0;
		for(int i=1;i<aa.length;i++){
			
		    for(int j=0	
		    		;j<aa.length-i;j++){
		    	if(aa[j]<aa[j+1]){
		    		temp=aa[j];
		    		aa[j]=aa[j+1];
		    		aa[j+1]=temp;
		    	}
		    		
		    }
		}
		for (int i=0;i<aa.length;i++){
			System.out.println(aa[i]);
		}
	}
}
