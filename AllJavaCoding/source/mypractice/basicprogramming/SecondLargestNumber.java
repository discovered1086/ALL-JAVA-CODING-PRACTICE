package mypractice.basicprogramming;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Integer[] intArray = {13, 36, 24, 38, 48, 87, 98, 102};

        //Integer [] sortedArray=new Integer[intArray.length];

        //Arrays.sort(intArray);
        int counter;
        int intValue=-1;
        for (int i = 0; i <= intArray.length - 1; i++) {
            counter=0;
            intValue=intArray[i];
            for (int j = 0; j <= intArray.length - 1; j++) {
                if(intArray[j]>intArray[i]){
                    counter++;
                }
            }

            if(counter==2){
                break;
            }
        }

        //System.out.println(Arrays.toString(intArray));
        //System.out.println(intArray[2]);

        System.out.println("The third largest number is "+intValue);
    }
}
