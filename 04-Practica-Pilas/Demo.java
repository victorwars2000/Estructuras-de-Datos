public class Demo {
    private static final Stack stack = new Stack();
    private static final Stack stack1 = new Stack();
    private static final Stack stack2 = new Stack();
    private static final Stack stack3 = new Stack();

    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        menuPrincipal();
        int op = Utilities.enterInteger("Enter option: ");
        while (op != 3) {
            switch (op) {
            case 1:
                Utilities.clearConsole();
                problem1();
                break;
            case 2:
                Utilities.clearConsole();
                problem2();
                break;
            default:
                System.out.println("ERROR!");
                break;
            }
            menuPrincipal();
            op = Utilities.enterInteger("Enter option: ");
        }

    }

    /**
     * 1.- Push the element x into the stack 2.- Delete the element present at the
     * top of the stack 3.- Print the maximun element in the stack
     * <p>
     * Sample Input: 10 1 97 2 1 20 2 1 26 1 20 2 3 1 91 3
     * <p>
     * Output: 91 26
     */
    public static void problem1() {
        menu1();
        int counter = 0;
        int numberOfQueries = 0;
        do
            numberOfQueries = Utilities.enterInteger("Give me the number of queries: \n");
        while ((numberOfQueries < 1) || (numberOfQueries > 100000));

        while (counter < numberOfQueries) {
            int op = Utilities.enterInteger("");
            switch (op) {
            case 1:
                stack.push(Utilities.enterInteger(""));
                break;
            case 2:
                stack.pop();
                break;
            case 3:
                stack.max();
                System.out.println(ANSI_GREEN + stack.max() + ANSI_RESET);
                break;
            default:
                System.out.println("ERROR!");
                break;
            }
            counter++;
        }
        Utilities.clearConsole();
        System.out.print("Output:\n");
        stack.print();

    }

    /**
     * Sample Input 5 3 4 1 1 1 2 3 2 3 4 1 4 1 1
     *
     * Sample Output 5
     */

    public static void problem2() {

        menu2();
        int op = Utilities.enterInteger(": ");
        do {
            switch (op) {
            case 1:
                Utilities.clearConsole();
                try {
                    int[] heigth = input(Utilities.enterString(""));
                    stack1.setNumElements(heigth[0]);
                    stack2.setNumElements(heigth[1]);
                    stack3.setNumElements(heigth[2]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Index Out of Bounds");
                }
                break;
            case 2:
                Utilities.clearConsole();
                addCylinders(stack1);
                addCylinders(stack2);
                addCylinders(stack3);
                break;
            case 3:
                Utilities.clearConsole();
                int maximumHeight = stack1.maximumHeight(stack2, stack3);
                System.out.println("Max: " + maximumHeight);
                break;
            default:
                break;
            }
            menu2();
            op = Utilities.enterInteger("Enter option: ");
        } while ((op > 0) && (op < 4));
    }

    public static int[] input(String in) {
        String[] valores = in.split(" ");
        int dimension = valores.length;
        int[] numbers = new int[dimension];
        int index = 0;
        for (String val : valores) {
            numbers[index] = Integer.parseInt(val);
            index++;
        }
        return numbers;
    }

    public static void addCylinders(Stack stack) {
        int counter = 0;
        int[] cylinders = input(Utilities.enterString(""));
        try {
            while (counter < stack.getNumElements()) {
                stack.push(cylinders[counter]);
                counter++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Out of Bounds");
        }
    }

    public static void menuPrincipal() {
        System.out.printf("%n%s%n%s%n%s%n", "1.-Maximum Element", "2.-Equal Stacks", "3.-Exit");
    }

    public static void menu1() {
        System.out.printf("%s%n%s%n%s%n ", "1.- Push the element x into the stack",
                "2.- Delete the element present at the top of the stack", "3.- Print the maximun element in the stack");
    }

    public static void menu2() {
        System.out.printf("%s%n%s%n%s%n%s%n", "1.- Add number of cylinders in stacks", "2.-Add cylinders in the stack",
                "3.-Result", "4.-Exit");
    }

}
