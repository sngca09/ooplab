class strrev {  
public static String reverse(String str){  
    String words[]=str.split("\\s");  
    String reverse="";  
    for(String w:words){  
        StringBuilder st=new StringBuilder(w);  
        st.reverse();  
        reverse +=st.toString()+" ";  
    }  
    return reverse.trim();  
}  
 
public static void main(String[] args) {  
    System.out.println(strrev.reverse("the world is every beautiful"));  
    System.out.println(strrev.reverse("how do you do"));    
    }  
}  