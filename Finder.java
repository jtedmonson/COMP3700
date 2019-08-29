public class Finder {

    public int[] intArray;

    public int findMax(int[] intArray) {
        if(intArray.length > 0) {
        int i;
        int max = intArray[0];
        for(i = 1; i < intArray.length; i++){
            if (intArray[i] > max)
                max = intArray[i];
        return max;}}

        else return null;
    }
    public int findMin(int[] intArray) {
        if(intArray.length > 0) {
            int j;
            int min = intArray[0];
            for(j = 1; j < intArray.length; j++){
             if (intArray[j] > min)
                 min = intArray[j];
             return min;}}

        else return null;
    }
}
