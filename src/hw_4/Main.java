package hw_4;

import java.util.LinkedList;

public class Main {

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
    public static void main(String[] args) {
        ex();
    }

    static void ex(){
        System.out.print("Введите длину листа: ");
        Hw_4 linkedList = new Hw_4();
        int len = linkedList.numIn();
        LinkedList<Integer> list1 = linkedList.list(len);
        System.out.print("Вы ввели длину листа равную: " + len);
        System.out.println();
        System.out.println();
        System.out.print("Cгенерирован первый лист: ");
        linkedList.printList(list1);
        System.out.println();
        System.out.println();
        System.out.print("Сумма элементов первого листа равна: ");
        linkedList.sumPrint(linkedList.sumList(list1));
        System.out.println();
        System.out.println();
        LinkedList<Integer> list2 = linkedList.printListReverse(list1);
        System.out.print("Распечатан перевернутый лист: ");
        linkedList.printList(list2);
        System.out.println();
        System.out.println();
        System.out.print("Добавьте последний элемент листа: ");
        LinkedList<Integer> list3 = (LinkedList<Integer>) list1.clone();
        int last = linkedList.numIn();
        System.out.print("Распечатан новый лист с последним элементом равным " + last + ": ");
        linkedList.printList(linkedList.enqueue(list3, last));
        System.out.println();
        System.out.println();
        System.out.print("Удаляем первый элемент первого листа и его возвращаем. Удаленный элемент равен: ");
        LinkedList<Integer> list4 = (LinkedList<Integer>) list1.clone();
        int n = linkedList.dequeue(list4);
        System.out.println(n);
        System.out.print("Распечатан новый лист с удаленным первым элементом: ");
        linkedList.printList(list4);
        System.out.println();
        System.out.println();
        System.out.print("Получаем первый элемент первого листа без удаления элемента: ");
        LinkedList<Integer> list5 = (LinkedList<Integer>) list1.clone();
        System.out.println(linkedList.first(list5));
        System.out.print("Распечатан новый лист без удаленния первого элемента: ");
        linkedList.printList(list5);
        System.out.println();
    }
}