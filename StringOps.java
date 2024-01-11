public class StringOps {
    public static void main(String[] args)
     {   
        String str = "MMMM"; 
        char ch = 'M'; 
        //String strtest = "  Intro to coMPuter  sCIEnce"; 
        //System.out.println(capVowelsLowRest(strtest)); 
        //System.out.println(camelCase(strtest));
        int [] arrTEST = allIndexOf(str,ch);
        int length = arrTEST.length; 
        for (int i=0; i < length; i++)
        {
            System.out.print(arrTEST[i] );
        }

        

    }

    public static String capVowelsLowRest (String str)
     {
        String strNew = "";
        int strlength = str.length();
        int counter  =0; 
        char ch = str.charAt(0);  
        while (counter < strlength )
        {
            if (str.charAt(counter) == 'e' || str.charAt(counter) == 'a' 
            || str.charAt(counter) == 'i' || str.charAt(counter) == 'o' ||  str.charAt(counter) == 'u')
            {
                 strNew =  strNew +  (char)(str.charAt(counter)- 32); 

            }
            else 
            {
                if ( str.charAt(counter) > 64 && str.charAt(counter) < 91)
                {
                     strNew =  strNew +  (char)(str.charAt(counter) + 32); 
                }
                   else
                   {
                    strNew =  strNew +  (char) str.charAt(counter); 
                    }
            }
             counter ++; 
         }
           
           return strNew; 

     }
        

    

    public static String camelCase (String str) 
    {
        String strNew = ""; 
        int counterword = 0 ; 
        int counter = 0 ; 
        int strlength = str.length();
        while (str.charAt(counter) == ' ')
        {
            counter ++ ; 
        }
        while (str.charAt(counter) != ' ' && counter < strlength - 1) 
        {
              if(str.charAt(counter) > 64 && str.charAt(counter) < 91 )
              {
                strNew = strNew+(char)(str.charAt(counter)+ 32);
              }
              else
              {
                 strNew = strNew+(char)(str.charAt(counter));
              }
            counter ++ ; 
        }
           
        for ( int i=counter; i < strlength; i ++)
        {    
            if ( str.charAt(i) != ' ')
            {
             if (str.charAt(i-1) == ' ')
             {
                if ( str.charAt(i) > 96 && str.charAt(i) < 123)
                {
                    strNew = strNew+(char)(str.charAt(i)- 32);
                }
                else 
                {
                    strNew = strNew+(char)(str.charAt(i));
                }               
             }
             else 
             {
                 if(str.charAt(i) > 64 && str.charAt(i) < 91 )
                  {
                     strNew = strNew+ (char)(str.charAt(i)+ 32);
                  }
                   else
                   {
                     strNew = strNew+ (char)(str.charAt(i));
                   }
             }
            }

        }

        return strNew;
    }

    public static int[] allIndexOf (String string, char chr)
     {   
        int counter = 0; 
        int numChar = 0; 
        int lengthstr= string.length(); 
        while (counter < lengthstr)
        {
            if( string.charAt(counter) ==  chr)
            {
                numChar++; 
            }
            counter ++; 
        }
        int [] arrnew = new int [numChar]; 
        counter=0; 
        for (int i =0; i < lengthstr; i ++)
        {
            if (string.charAt(i) == chr)
            {
                 arrnew[counter]= i ; 
                 counter ++; 
            }
        }

        return arrnew;
    }
}
