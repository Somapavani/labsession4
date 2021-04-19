public class CountVowel {    
    public static void main(String[] args) {      
        int vCount = 0;   
        String str = "This is pavani";      
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {      
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                vCount++;    
            }       
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
          
            }    
        }    
        System.out.println("Number of vowels: " + vCount);       
    }    
}   