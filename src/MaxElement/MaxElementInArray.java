package MaxElement;

public class MaxElementInArray {
    // Задача 1.
    //Создать класс MaxElementInArray, содержащий метод,
    // который находит максимальный элемент массива и возвращает его:
    //
    //создать класс MaxElementInArray, содержащую имя массива (private int[] ints)
    //Создать конструктор , принимающий массив public MaxElementInArray( int[] ints ){ this.ints = ints;}
    //Написать метод, находящий максимальный элемент массива
    //В классе Main: создать массив целых чисел, cоздать обьект (экземпляр) класса MaxElementInArray
    // для этого массива и вывести на экран значение максимального элемента этого массива

    private int[] ints;


    public MaxElementInArray(int[] ints) {
        this.ints = ints;
    }

    public int maxValue() {
        int max = ints [0];
        for ( int index = 0; index < ints.length; index++ ){
            if( ints[index]>max){
                max=ints[index];
            }
        }
        return max;
    }

}


