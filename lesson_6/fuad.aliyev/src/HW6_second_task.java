//2) Есть 2 массива упорядоченных по возрастанию. Получите 3й массив, который объединит все эти элементы, но также в возрастающем      порядке.
//
//    Пример ввода:
//    a = {1, 3, 5}
//    b = {2, 4, 8, 9, 12}
//    Результат:
//    c = {1, 2, 3, 4, 5, 8, 9, 12}

public class HW6_second_task {

    public static void main(String[] args) {
        int firstArray[] = {1, 3, 5};
        int secondArray[] = {2, 4, 8, 9, 12};
        int result[] = sortArray(concatArrays(firstArray,secondArray));
        for(int i = 0; i < concatArrays(firstArray,secondArray).length; i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] concatArrays(int firstArray[], int secondArray[]) {
        int concatArray[] = new int[(firstArray.length + secondArray.length)];
        for(int i = 0; i < firstArray.length; i++) {
            concatArray[i] = firstArray[i];
        }
        int j = firstArray.length;
        for(int i = 0; i < secondArray.length; i++) {
            concatArray[j] = secondArray[i];
            j++;
        }
        return concatArray;
    }

    private static int[] sortArray(int array[]) {
        for(int i = 0; i < array.length; i++) {
            int min = i;
            int buf;
            for(int j = i + 1; j < array.length; j++)
                if(array[j] < array[min])
                    min = j;
            buf = array[i];
            array[i] = array[min];
            array[min] = buf;
        }
        return array;
    }
}
