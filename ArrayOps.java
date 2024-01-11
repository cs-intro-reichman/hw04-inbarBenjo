public class ArrayOps {
    public static void main(String[] args) 
    {
       // int [] arrMiss = new int [3];
      int [] arrMiss = {3,1,2,3};
      //int [] arrayTwo = {1,3,3,1}; 
      // System.out.println(findMissingInt(arrMiss)); 
      System.out.println(secondMaxValue(arrMiss));
     //System.out.println(containsTheSameElements(arrMiss, arrayTwo));
     //System.out.println(isSorted(arrMiss));


    }
    
    public static int findMissingInt (int [] array)
     {
        int lengthArry = array.length ;
        int counter = 0; 
        int find = 0; 
        int miss = 0; 
        
        while (counter <= lengthArry)
        {
            for ( int i =0; i< lengthArry; i ++ )
             {
              if ( array [i] == counter)  
              {
                  find = 1; 
              }  
             }
             if (find == 0)
             {
                 miss = counter;
             }
             find = 0; 
             counter ++;

        }  
        return miss;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0]; 
        int secondMax= 0; 
        int counter=0;
        for (int i= 0; i < array.length; i++)
        {
            if( array[i] > max )
            {
                max =array[i]; 
            }
        }
        //secondMax = array[0];
        for (int i= 0; i < array.length; i++)
        {   
            if (array[i]== max)
            {
                counter++; 
            }
            else
            {
               if ( array[i]> secondMax )
               {
                secondMax = array[i]; 
               }
            }
            
        }
        if ( counter > 1)
        {
            return max;
        }
        else
        {
            return secondMax;
        }
        
    }
    

    public static int[] comparelong(int [] array1, int[] array2 )
    {
        int length1 = array1.length; 
        int length2 = array2.length; 
        if ( length1 > length2)
        {
             return array1; 
        }
        else
        {
            return array2;
        }
    }
    public static int[] compareShort(int[] array1, int[] array2 )
    {
        int length1 = array1.length; 
        int length2 = array2.length; 
        if ( length1 < length2)
        {
             return array1; 
        }
        else
        {
            return array2;
        }
    }



    public static boolean containsTheSameElements(int [] array1,int [] array2) 
    {
        boolean find = false ; 
        int [] longArr = comparelong(array1,array2); 
        int [] shortArr = compareShort(array1,array2);
        int counter = 0; 
        int num =0 ; 
        
            while (counter < longArr.length)
            {
            num= longArr[counter]; 
             for (int i =0; i < shortArr.length ; i ++)
             {
                if (num == shortArr[i])
                {
                   find= true; 
                }
             }
             if ( find != true)
             {
                return false; 
                
             }
             else {
                find = false; 
             }
             counter ++;
            }

            return true; 

        }  
    
    

    public static boolean isSorted(int [] array) 
    {
        boolean up = true;
        boolean down = true;
        for ( int i =0 ; i < array.length -1; i ++ )
        {
            if (up == true)
            {
            if ( i <= (array.length - 1))
             {
                if ( array[i] <= array[i+1])
                 {
                 up = true;
                 }
                 else                      
                 {
                  up = false;
                 }
             } 
             else {
                up = true;
             } 
            } 
        }
        
         for ( int i =0 ; i < array.length -1; i ++ )
        {
            if (down == true)
            {
            if ( i <= (array.length - 1))
             {
                if ( array[i] >= array[i+1])
                 {
                 down = true;
                 }
                 else                      
                 {
                  down = false;
                 }
             } 
             else {
                down = true;
             } 
            } 
        }
        if ( up == true || down == true)
        {
            return true; 
        }
        else {
             return false;
        }

       
    }

}
