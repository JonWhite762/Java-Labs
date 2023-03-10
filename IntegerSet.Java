public IntegerSet {
    private boolean[] set;
    // default constructor
    public IntegerSet(){
        // array to store values in range 0 to 100(inclusive)
        set = new boolean[101];

        // loop for set length times
        for(int i=0; i<set.length; i++){

            // set value at index i to false
            set[i] = false;
        }
    }
    public static IntegerSet union(IntegerSet a, IntegerSet b){
        // create new empty set
        IntegerSet s = new IntegerSet();

        // loop for set length times
        for(int i=0; i<s.set.length; i++){

            // update value at index i with set a and b values
            // either of them is true value is true, false otherwise
            s.set[i] = ( a.set[i] || b.set[i] );
        }
        // return new set
        return s;
    }
    public static IntegerSet intersection (IntegerSet a, IntegerSet b){
        // create new empty set
        IntegerSet s = new IntegerSet();

        // loop for set length times
        for(int i=0; i<s.set.length; i++){

            // update value at index i with set a and b values
            // either of them is false value is false, true otherwise
            s.set[i] = ( a.set[i] && b.set[i] );
        }
        // return new set
        return s;
    }
    public void insertElement(int index){
        // set index value to true
        set[index] = true;
    }
    public void deleteElement(int index){
        // set index value to false
        set[index] = false;
    }
    @Override
    public String toString(){
        String s = "{ ";

        // flag to know set is empty or not
        boolean empty = true;

        for(int i=0; i<set.length; i++){

            // if set value at index i is true
            if(set[i]){

                // make flag true and add index to result
                empty = false;
                s = s + i +" ";
            }
        }

        // add closing brase to result
        s = s + "}";

        // if empty flag true means set is empty
        if(empty){
            // set result to "{ --- }"
            s = "{ --- }";
        }
        // return result string
        return s;
    }

    public boolean isEqualTo(IntegerSet o){
        // loop for set length times
        for(int i=0; i<set.length; i++){
            // if current set and other set value at index i is not same
            if(set[i] != o.set[i]){
                // return false
                return false;
            }
        }
        // return true, if above loop does not return false
        return true;
    }


}   