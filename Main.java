import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        PenController penController = new PenController();

        int flag = 1;
        while (flag == 1) {

            System.out.println("Menu");
            System.out.println();
            System.out.println("1:Buy a pen");
            System.out.println("2:Exit");
            System.out.println("Choose: ");

            int choice;
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("How many pens do you want to buy?");
                    int noOfPen = sc.nextInt();

                    PenModel pen = new PenModel();
                    PenView penView = new PenView();
                    penController.setPen(pen);
                    penController.setPenView(penView);

                    penController.setPenName("Trimax");
                    penController.setPenBrand("Reynolds");
                    penController.setPenPrice(50);
                    penController.setPenColor("Blue");

                    int sold = penController.sellPen(noOfPen);
                    if (sold == -1) {

                        System.out.println("No of pen sold: " + noOfPen);
                        penController.updateView();

                        System.out.println("Here's your bill");
                        System.out.println(pen.getPrice() + " * " + noOfPen + " = ₹" + pen.getPrice() * noOfPen);
                        System.out.println();
                    } else {
                        System.out.println("Out of Stock");
                        System.out.println("Pen left in stock: " + sold);
                        System.out.println();
                    }

                    break;
                case 2:
                    flag = 0;
                    System.out.println("Thanks for visiting");
                    break;
                default:
                    System.out.println("Input not valid");
                    break;
            }

        }

    }
}
