import java.util.Scanner;

class Node { // КЛАСС – СТРУКТУРА ЭЛЕМЕНТА СПИСКА
    public int value; // значение
    public Node next; // поле – ссылка (указатель) на следующий узел

    Node(int value, Node next) { // конструктор класса
        this.value = value;
        this.next = next;
    }
}

class List {
    private Node head;
    private Node tail;

    public void CreateHead() {
        Scanner in = new Scanner(System.in);
        head = new Node(0, null);
        tail = head;

        System.out.print("Введите количество элементов: ");
        int s = in.nextInt();
        for (int i = 0; i < s; i++) {
            int val = in.nextInt();
            tail.next = new Node(val, null);
            tail = tail.next;
        }
    }

    public void CreateTail() { // добавление элементов с перемещением головы (наращивание с головы) ! сойдёт
        Scanner in = new Scanner(System.in);
        head = null;
        System.out.println("Введите количество элементов: ");
        int s = in.nextInt();
        for (int i = 0; i < s; i++) {
            int val = in.nextInt();
            head = new Node(val, head);
        }
    }

    public void AddLast(int val) {
        Node newtail = new Node(val, null);
        Node ref = head;
        while (ref.next != null) { // пока не последний элемент
            ref = ref.next;
        }
        ref.next = newtail;

    }

    public void Insert(int val, int pos) { // просто вставил пока не понял чё происходит
        // создается новый элемент со значением 44 – для вставки
        Node newNode = new Node(val, null);
        Node ref = head; // используем временную переменную
        int k = 1; // счетчик элементов
        // поиск нужного положения узла для вставки
        while (ref.next != null && (k < pos)) {
            ref = ref.next;
            k++;
        }
        // переброска ссылок при вставке элемента
        newNode.next = ref.next.next;
        ref.next = newNode;
    }

    public void RemoveLast() {
        // создаем вспомогательную переменную
        Node ref = head;
        // перемещаемся на предпоследний элемент
        while (ref.next.next != null) {
            ref = ref.next;
        }
        // полю next предпоследнего элемента присваиваем null
        ref.next = null;

    }

    public String toString() {
        Node ref = head;
        String out = "";
        while (ref != null) {
            out += " " + ref.value;
            ref = ref.next;
        }
        return out;
    }
}

public class Task3 {
    public static void main(String[] args) {
        List list = new List();
        list.CreateHead();
        // list.CreateTail();
        // list.AddLast();
        list.Insert(12, 2);
        list.AddLast(20);
        list.RemoveLast();
        System.out.println(list);
    }
}