public class IntegerSet{
  
       private static final int MAX_SET_SIZE = 101; 
        // set contains numbers from 1 to 100
       private final boolean[] boolArr = new boolean[ MAX_SET_SIZE ];
 
      public static IntegerSet union( IntegerSet set1, IntegerSet set2 ){
      
             union.boolArr[ i ] = set1.boolArr[ i ] || set2.boolArr[ i ];
       }
          IntegerSet union = new IntegerSet();
          System.arraycopy( set1.boolArr, 0, union.boolArr, 0,MAX_SET_SIZE);
          for ( int i = 0; i < MAX_SET_SIZE; i++ )
          {
              if ( set2.boolArr[ i ] )
              {
                  union.boolArr[ i ] = true;
              }
          }
          return union;
      
      
      public static IntegerSet intersection( IntegerSet set1, IntegerSet set2){
      
          IntegerSet intersection = new IntegerSet();
          for ( int i = 0; i < MAX_SET_SIZE; i++ ){
          
             intersection.boolArr[ i ] = set1.boolArr[ i ] && set2.boolAr[i];
          }
          return intersection;
      }
      
      public void insertElement( int element ) { boolArr[ element ] = true; }
      
      public void deleteElement( int element ) { boolArr[ element ] = false; }
      
      @Override
      public String toString()
      {
          boolean isEmpty = true;
          StringBuilder string = new StringBuilder();
         string.append( "{ " );
          for ( int i = 0; i < MAX_SET_SIZE; i++ )
          {
              if ( boolArr[ i ] )
              {
                  isEmpty = false;
                  string.append( i ).append( ' ' );
              }
          }
          return isEmpty ? "---" : string.append( '}').toString();
      }
      
      public boolean isEqual( IntegerSet set )
      {
          for ( int i = 0; i < MAX_SET_SIZE; i++ )
          {
              if ( boolArr[ i ] != set.boolArr[ i ] )
              {
                  return false;
             }
          }
          return true;
      }
      
      public static void Lab31( String[] args )
      {
          IntegerSet integerSet1 = new IntegerSet();
          System.out.println("intergerSet1 is empty: " + integerSet1 );
          IntegerSet integerSet2 = new IntegerSet();
        System.out.println("empty set union empty set is empty set:  " + union( integerSet1, integerSet2 ) );
          IntegerSet universe = new IntegerSet();
          for ( int i = 0; i <  MAX_SET_SIZE; i++  )
          {
              universe.boolArr[ i ] = true;
          }
          System.out.println( "universe: " + universe );
          System.out.println("empty set union universe = universe:  " + union( integerSet1, universe ) );
          System.out.println("empty set intersection universe = empty set:  " + intersection( integerSet1, universe ) );
          integerSet1.insertElement( 0 );
          System.out.println("intergerSet1 has only element 0: " + integerSet1 );
         System.out.println("intergerSet1 != integerSet2: isEqual: " + integerSet1.isEqual( integerSet2 ) );
         System.out.println("intergerSet2 != integerSet1: isEqual: " + integerSet2.isEqual( integerSet1 ) );
         integerSet2.insertElement( 0 );
         System.out.println("intergerSet1 == integerSet2: isEqual: " +                 integerSet1.isEqual( integerSet2 ) );
         integerSet1.deleteElement( 0 );
         System.out.println("intergerSet1 is empty: " + integerSet1 );
     }
