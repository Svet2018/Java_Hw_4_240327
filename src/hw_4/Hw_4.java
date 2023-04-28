package hw_4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Hw_4 {

    /*
    Пусть дан LinkedList с несколькими элементами.
    Реализуйте метод, который вернет “перевернутый” список.
    Постараться не обращаться к листу по индексам.
    Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() -
    помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
    first() - возвращает первый элемент из очереди, не удаляя.
    Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
    *реализовать вторую задачу через собственный класс используя в основе массив
     */

    private int num = 0;
    private int number = 0;


    //Метод генерирует случайное число
    int numGen(){
        num = (int) (Math.random() * 100);
        return num;
    }

    int number(){
        return number;
    }

    //Метод генерирует лист
    LinkedList<Integer> list(int number) {
        LinkedList<Integer> listNum = new LinkedList<>();
        for (int i = 0; i < number; i++){
            listNum.add(numGen());
        }
        return listNum;
    }

    //Метод вводит пользовательсткие данные
    int numIn(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    //Метод распечатывает лист
    void printList(LinkedList<Integer> list){
        for (int s : list){
            System.out.print(s + " ");
        }
    }

    //Метод переворачивает лист
    LinkedList<Integer> printListReverse(LinkedList<Integer> list){
        LinkedList<Integer> list1 = (LinkedList<Integer>) list.clone();
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++){
            newList.add(list1.getLast());
            list1.removeLast();
        }
        return newList;
    }

    //Метод вычисляет сумму элементов листа
    int sumList(LinkedList<Integer> list) {
        LinkedList<Integer> list1 = (LinkedList<Integer>) list.clone();
        ListIterator<Integer> listIter = list1.listIterator();
        int sum = 0;
        while (listIter.hasNext()) {
            sum = sum + listIter.next();
        }
        return sum;
    }

    //Метод выводит на печать сумму элементов списка
    void sumPrint(int sum){
        System.out.print(sum);
    }

    //Метод помещает элемент в конец очереди
    LinkedList<Integer> enqueue(LinkedList<Integer> list, int num){
        list.addLast(num);
        return list;
    }

    //Метод возвращает первый элемент из очереди и удаляет его
    int dequeue (LinkedList<Integer> list){
        int n = list.removeFirst();
        return n;
    }

     //Метод возвращает первый элемент из очереди, не удаляя.
     int first (LinkedList<Integer> list){
         int n = list.getFirst();
         return n;
     }




}
