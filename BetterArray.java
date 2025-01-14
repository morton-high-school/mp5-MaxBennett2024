public class BetterArray {
    private int size;
    public int[] array;
    public BetterArray(){
        size = 0;
        array = new int[0];
    }
    public BetterArray(int length){
        size = 0;
        array = new int[length];
    }
    //Returns the number of elements in the list

    public int size(){
        return size;
    }

    //appends item to the end of the list; returns true

    public boolean add(int item){
        if(array.length==0){
            int[] dup = new int[1];
            array = new int[dup.length];
            for(int i =0;i<array.length;i++){
                array[i] = dup[i];
            }
        }
        if(size>=array.length){
            int[] duplicate = new int[array.length*2];
            for(int i =0;i<array.length;i++){
                duplicate[i] = array[i];
            }
            array = new int[duplicate.length];
            for(int i =0;i<duplicate.length;i++){
                array[i] = duplicate[i];
            }
        }
        array[size] = item;
        size++;
        return true;
    }

    // Inserts item at position index, moving elements at position index and higher to 
    // the right and adds 1 to size

    public void add(int index, int item){

    }

    // Returns the element at position index in the list

    public int get(int index){
        return array[index];
    }

    // replaces the element at position index with item; returns the element formerly at position index

    public int set(int index, int item){
        int temp = array[index];
        array[index] = item;
        return temp;
    }

    //Removes element from position index, moving elements at position index+1 and
    //higher to the left and subtracts 1 from size; returns the element formerly at
    //position index

    public int remove(int index){
        return array[index];
    }
}
