//Java program to find frequency of each element in array

class ElementFrequency {
    public static void main(String args[]) {
        int[] array = {0,1,3,0,5,3,5,1,-1,-5};
        int arraySize = array.length;
        boolean[] visited = new boolean[arraySize];
        
        for(int i = 0; i < arraySize;i++) {
            if(visited[i]) continue;
            int count = 1;
            for(int j = i+1; j < arraySize; j++) {
                if(array[i]==array[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(array[i]+" occurs "+count+" number of times");
        }
    }
}