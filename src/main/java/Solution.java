public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
       
       
       if ((x.length()) <= 1){
        return false;
       }elif(x.substring(x.length()-2).equals("ly")){

       
       return true;
       }else{

        return false;
       }
      
       
        
    }

    public String conCat(String s1, String s2) {
        
        if (s2.substring(0,0).equals(s1.substring(s1.length()-1, s1.length()))){
        return s1.substring(0,s1.length()-1) + s2;

        } else {
        return s1+s2;
        }

        
    }

    public String withoutX(String s1) {
        s1.substring(0, 1).equals("x")
    }

    public String fizzString(String s1) {
        //implement code here
        return "";
    }

    public String fizzString2(int x) {
        //implement code here
        return "";
    }

}
