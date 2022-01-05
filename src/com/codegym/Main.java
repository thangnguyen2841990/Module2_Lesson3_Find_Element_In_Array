package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String [] students = {"Thắng","Cường","Thủy","Việt","lịch"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length;i++){
           if (students[i].equals(input_name)){  // Hàm equals: so sánh 2 chuỗi dựa trên nội dung của chuỗi
               System.out.println("Position of the students in the list "+ input_name+ " is "+ i);
               isExist = true;
               break;
            }
        }
        if (isExist == false){
            System.out.println("Not found"+input_name+" in the list.");
        }
    }
}
