package ywh;

public class hkx {
	
	   private static boolean result; // ��̬���������ڴ洢���н��
	    public void equilateral(int a,int b,int c) {
	        if(a==b && b==c){
	        	result = true;
	        }
	    }
	    public void isosceles(int a,int b, int c) {
	        if(a==b || a==c || b==c ){
	        	if(a+b>c && a+c>b && b+c>a){
	        		result = true;
	        	}
	        }
	    }
	    public void scalene(int a,int b,int c) {
	    	if(a+b>c && a+c>b && b+c>a){
	    		if(a!=b || b!=c){
	    			result = true;
	    		}
	    	}
	    }         
	    
	    public void clear() {     
	        result = false;
	    }
	    
	    public boolean getResult() {
	        return result;
	    }
	}


