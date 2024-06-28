import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedListImpl linkedListImpl = new LinkedListInstance();
        start(linkedListImpl);
    }

    public static void start(LinkedList linkedList) {
        while (true) {
            menu();
            switch (scanner.nextLine().trim()) {
                case "0": {
                    return;
                }
                case "1": {
                    linkedList.printList();
                    break;
                }
                case "2": {
                    System.out.print("\nValue node: ");
                    ListItem newItem = linkedList.createNode(scanner.nextLine().trim());
                    newItem = linkedList.addHead(newItem);
                    if (newItem != null) System.out.println(newItem);
                    else System.out.println("\nAdd failure !");
                    break;
                }
                case "3": {
                    System.out.print("\nValue node: ");
                    ListItem newItem = linkedList.createNode(scanner.nextLine().trim());
                    newItem = linkedList.addTail(newItem);
                    if (newItem != null) System.out.println(newItem);
                    else System.out.println("\nAdd failure !");
                    break;
                }
                case "4": {
                    System.out.print("\nValue node you want: ");
                    String value = scanner.nextLine();
                    System.out.print("\nValue node after: ");
                    ListItem newItem = linkedList.createNode(scanner.nextLine().trim());
                    newItem = linkedList.addAfterNode(value, newItem);
                    if (newItem != null) System.out.println(newItem);
                    else System.out.println("\nAdd failure !");
                    break;
                }
                case "5": {
                    System.out.print("\nValue node you want: ");
                    String value = scanner.nextLine();
                    System.out.print("\nValue node before: ");
                    ListItem newItem = linkedList.createNode(scanner.nextLine().trim());
                    newItem = linkedList.addBeforeNode(value, newItem);
                    if (newItem != null) System.out.println(newItem);
                    else System.out.println("\nAdd failure !");
                    break;
                }
                case "6": {
                    System.out.println("\nSearch: ");
                    ListItem resultSearch = linkedList.searchNode(scanner.nextLine());
                    if (resultSearch != null) System.out.println(resultSearch);
                    else System.out.println("\nNot found !");
                    break;
                }
                case "7": {
                    System.out.println("\nSearch: ");
                    ListItem resultSearch = linkedList.searchNode(scanner.nextLine());
                    if (resultSearch != null) System.out.println(resultSearch);
                    else System.out.println("\nNot found !");

                    System.out.println("\nNew value: ");
                    String newValue = scanner.nextLine();
                    resultSearch = linkedList.updateNode(resultSearch.getValue(), newValue);
                    if (resultSearch != null) System.out.println(resultSearch);
                    else System.out.println("\nUpdate failure !");
                    break;
                }
                case "8": {
                    System.out.println("\nValue node: ");
                    String valueNode = scanner.nextLine();
                    boolean remove = linkedList.removeNode(valueNode);
                    if (remove) System.out.println("\nNode removed !");
                    else System.out.println("\nNode don't existed !");
                    break;
                }
                case "9": {
                    boolean remove = linkedList.removeNodeHead();
                    if (remove) System.out.println("\nNode head removed !");
                    else System.out.println("\nNode head don't existed !");
                    break;
                }
                case "10": {
                    boolean remove = linkedList.removeNodeTail();
                    if (remove) System.out.println("\nNode tail removed !");
                    else System.out.println("\nNode tail don't existed !");
                    break;
                }
                case "11": {
                    System.out.print("\nValue node after: ");
                    String value = scanner.nextLine();
                    ListItem resultSearch = linkedList.searchNode(value);
                    if (resultSearch == null) System.out.println("\nNot found !");
                    else {
                        boolean remove = linkedList.removeAfterNode(value);
                        if (remove) System.out.printf("\nNode after node %s removed !", value);
                        else System.out.printf("\nNode after %s don't existed !", value);
                    }

                    break;
                }
                case "12": {
                    System.out.print("\nValue node before: ");
                    String value = scanner.nextLine();
                    ListItem resultSearch = linkedList.searchNode(value);
                    if (resultSearch == null) System.out.println("\nNot found !");
                    else {
                        boolean remove = linkedList.removeBeforeNode(value);
                        if (remove) System.out.printf("\nNode before node %s removed !", value);
                        else System.out.printf("\nNode before %s don't existed !", value);
                    }

                    break;
                }

                default:
                    break;
            }
        }
    }

    public static void menu() {
        System.out.print("\n0.  quit");
        System.out.print("\n1.  show linked list");
        System.out.print("\n2.  add head");
        System.out.print("\n3.  add tail");
        System.out.print("\n4.  add after node");
        System.out.print("\n5.  add before node");
        System.out.print("\n6.  search node");
        System.out.print("\n7.  update node");
        System.out.print("\n8.  remove node");
        System.out.print("\n9.  remove node head");
        System.out.print("\n10. remove node tail");
        System.out.print("\n11. remove after node");
        System.out.print("\n12. remove before node");
        System.out.print("\nYour option: ");
    }
}