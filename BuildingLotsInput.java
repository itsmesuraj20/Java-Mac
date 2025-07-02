import java.util.Scanner;

public class BuildingLotsInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Method 1: Manual Input
        System.out.println("=== MANUAL INPUT ===");
        
        System.out.print("Enter number of rows (m): ");
        int m = scanner.nextInt();
        
        System.out.print("Enter number of columns (n): ");
        int n = scanner.nextInt();
        
        System.out.println("Enter the matrix elements row by row:");
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        System.out.print("Enter number of buildings to place (i): ");
        int numBuildings = scanner.nextInt();
        
        System.out.print("Enter number of available positions: ");
        int posCount = scanner.nextInt();
        
        System.out.println("Enter the building positions:");
        int[] buildingPositions = new int[posCount];
        for (int i = 0; i < posCount; i++) {
            buildingPositions[i] = scanner.nextInt();
        }
        
        // Call your solution method here
        // int result = solveBuildingLots(m, n, matrix, numBuildings, buildingPositions);
        // System.out.println("Result: " + result);
        
        
        // Method 2: Pre-defined Test Cases
        System.out.println("\n=== PRE-DEFINED TEST CASES ===");
        
        // Example 1
        testCase1();
        
        // Example 2  
        testCase2();
        
        scanner.close();
    }
    
    static void testCase1() {
        System.out.println("Test Case 1:");
        int m = 3, n = 3;
        int[][] matrix = {
            {1, 2, 3},
            {0, 6, 0}, 
            {8, 4, 7}
        };
        int numBuildings = 2;
        int[] buildingPositions = {8, 10};
        
        System.out.println("Input:");
        System.out.println("m = " + m + ", n = " + n);
        System.out.println("Matrix:");
        printMatrix(matrix);
        System.out.println("Number of buildings: " + numBuildings);
        System.out.print("Building positions: ");
        printArray(buildingPositions);
        
        // Call solution here
    }
    
    static void testCase2() {
        System.out.println("\nTest Case 2:");
        int m = 3, n = 3;
        int[][] matrix = {
            {0, 2, 3},
            {0, 6, 0},
            {7, 8, 9}
        };
        int numBuildings = 2;
        int[] buildingPositions = {10, 11, 12};
        
        System.out.println("Input:");
        System.out.println("m = " + m + ", n = " + n);
        System.out.println("Matrix:");
        printMatrix(matrix);
        System.out.println("Number of buildings: " + numBuildings);
        System.out.print("Building positions: ");
        printArray(buildingPositions);
        
        // Call solution here
    }
    
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    
    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

/* 
SAMPLE INPUT FORMAT FOR CONSOLE:

Example 1:
3
3
1 2 3
0 6 0  
8 4 7
2
2
8 10

Example 2:
3
3
0 2 3
0 6 0
7 8 9  
2
3
10 11 12

*/