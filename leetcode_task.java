package poredno_demo_file;

import java.util.Scanner;

public class leetcode_task {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(minDeletionSize(scanner.nextLine().split(",")));
    }
	
	public static int minDeletionSize(String[] strs) {
        int deleteCount = 0;
        int numRows = strs.length;
        int numCols = strs[0].length();
        
        for (int col = 0; col < numCols; col++) {
            for (int row = 1; row < numRows; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    deleteCount++;
                    break;
                }
            }
        }
        
        return deleteCount;
    }
}
