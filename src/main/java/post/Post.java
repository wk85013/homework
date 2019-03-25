package post;

import java.util.Scanner;

public class Post {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float length, width;
        int height;
        System.out.print("Please enter object's post.getLength: ");
        length = scanner.nextFloat();
        System.out.print("Please enter object's width: ");
        width = scanner.nextFloat();
        System.out.print("Please enter object's height: ");
        height = scanner.nextInt();
        Box box3 = new Box3();
        Box box5 = new Box5();

        if (box3.validate(length, width, height)) {
            System.out.println("Box3");
        } else if (box5.validate(length, width, height)) {
            System.out.println("Box5");
        } else
            System.out.println("OtherBox");

    }
}
