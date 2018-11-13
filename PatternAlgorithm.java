public class PatternAlgorithm {

    
    public static void main(String[] args) {
       String patt="AABAACAADAABAAABAA";
       String match="AABA";
       int patt_len=patt.length();
       int match_len=match.length();
       for(int i=0 ; i < (patt_len-match_len); i++)
       {
           int j;
           int count=0;
           for(j=0;j< match_len;j++)
           {
               if(patt.charAt(i+j)!=match.charAt(j))
               {
                   break;
               }
               count++;
           }
            if(count == match_len)
            {
                System.out.println("Present at index: " + i);
            }
           
           
           
           
       }