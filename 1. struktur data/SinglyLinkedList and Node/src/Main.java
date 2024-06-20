import datastructure.CustomList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustomList customList = new CustomList();

        System.out.println("test case");

        System.out.println("delete when list is empty");
        customList.deleteByValue(1);
        customList.display();

        System.out.println("insert at end");
        int[] a = {1, 2, 3, 4, 5};
        for (int num : a) {
            customList.insertAtEnd(num);
        }
        customList.display();

        System.out.println("insert at beginning");
        int[] b = {6, 7, 6, 8, 9, 0};
        for(int num : b) {
            customList.insertAtBeginning(num);
        }
        customList.display();

        System.out.println("delete from the end");
        customList.deleteByValue(5);
        customList.display();

        System.out.println("delete from the beginning");
        customList.deleteByValue(0);
        customList.display();

        System.out.println("delete from the middle");
        customList.deleteByValue(1);
        customList.display();

        System.out.println("delete the first value");
        customList.deleteByValue(6);
        customList.display();
    }
}