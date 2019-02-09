//1) Создайте функцию, которая заполняет 2-мерный массив треугольником Паскаля (элемент, который на строчке ниже, равен сумме 2х верхних элементов, которые стоят рядом; по бокам стоят единицы), изображение на картинке:

public class HW5_first_task {

    public static void main(String[] args) {
        int array[][] = new int[10][10];
        initializeWholeArray(array);
    }

    private static void initializeWholeArray(int array[][]) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = initializeOneElementOfArray(i,j);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int initializeOneElementOfArray(int rowOfElement, int columnOfElement) {
        if((rowOfElement - columnOfElement) < 0)
            return 0;
        else {
            int result = factorial(rowOfElement) / (factorial(columnOfElement) *
                                                    factorial((rowOfElement - columnOfElement)));
            return result;
        }
    }

    private static int factorial(int number) {
        int factorialSum = 1;
        if(number == 0)
            return 1;
        else
            while(number > 1) {
                factorialSum *= number;
                number--;
            }
            return factorialSum;

    }
}
