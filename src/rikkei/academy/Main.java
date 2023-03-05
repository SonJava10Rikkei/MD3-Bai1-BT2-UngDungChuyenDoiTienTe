package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Ứng dụng chuyển đổi tiền tệ");
            System.out.println("1. Chuyển từ USD sang VND");
            System.out.println("2. Chuyển từ VND sang USD");
            System.out.println("0. Exit");
            System.out.println("Xin mời nhập lựa chọn của bạn: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Mời nhập số USD cần đổi: ");
                    double usd = input.nextDouble();
                    double usdToVnd = usd * 23000;
                    System.out.println(usd + " USD" + " bằng: " + usdToVnd + " VND");
                    break;
                case 2:
                    System.out.println("Mời nhập số VND cần đổi: ");
                    double vnd = input.nextDouble();
                    double vndToUsd = vnd / 23000;
                    System.out.println(vnd + " VND" + " bằng: " + vndToUsd + " USD");
                    break;
                case 0:
                    System.out.println("Bạn đã thoắt ứng dụng! ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Hãy nhập lại lựa chọn mà bạn muốn! ");
            }
        }
    }
}

