package BasicWeb;

public class RemoveJunkString {
	
	public static void main(String[] args) {
	
	String str = "#################&&&&&&&&&&&&&&&NayanaSmi******ra))))))))";
	
    String newstr = str.replaceAll("[^a-zA-Z0-10]","");
    
    System.out.println("The replaced string is =====>" + newstr);
    


    int num=153;
    
    int temp=num;
    
    int count=0;
    
    while(num>0) {
    	
    	int r = num%10;
    	
    	num= num/10;
        
    	count= count+r*r*r;
    }
    
    System.out.println(count);
}
}