class minno {  
        //Initialize array  
static int [] a = {25, 11, 7, 75, 56};  
static int min(){
          
        int min = a[0];  
         
        for (int i = 0; i < a.length; i++) {  
            //Compare elements of array with min  
           if(a[i] <min)  
               min = a[i];  	
        }     
return min;
}  
public static void main(String[] args) {  
System.out.println("Smallest element present in given array: " + min());  
}
}  