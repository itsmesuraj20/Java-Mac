package Recursion.Backtracking;

import java.util.*;

public class backtracking {
    // BACKTRACKING TUTORIAL IN JAVA
    // Let's learn step by step with simple examples!
    
    // ==========================================
    // EXAMPLE 1: SIMPLE PATH FINDING IN MAZE
    // ==========================================
    
    public static boolean solveMaze(int[][] maze, int x, int y, int[][] solution) {
        int n = maze.length;
        
        // Base case: reached destination
        if (x == n-1 && y == n-1) {
            solution[x][y] = 1;
            return true;
        }
        
        // Check if current position is valid
        if (x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1) {
            
            // Mark current cell as part of solution
            solution[x][y] = 1;
            
            // Try moving right
            if (solveMaze(maze, x, y + 1, solution)) {
                return true;
            }
            
            // Try moving down
            if (solveMaze(maze, x + 1, y, solution)) {
                return true;
            }
            
            // BACKTRACK: Unmark current cell
            solution[x][y] = 0;
        }
        
        return false;
    }
    
    // ==========================================
    // EXAMPLE 2: GENERATE ALL SUBSETS
    // ==========================================
    
    public static void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        // Base case: we've considered all elements
        if (index == nums.length) {
            result.add(new ArrayList<>(current)); // Add copy of current subset
            return;
        }
        
        // Choice 1: Include current element
        current.add(nums[index]);
        generateSubsets(nums, index + 1, current, result);
        
        // BACKTRACK: Remove the element we just added
        current.remove(current.size() - 1);
        
        // Choice 2: Don't include current element
        generateSubsets(nums, index + 1, current, result);
    }
    
    // ==========================================
    // EXAMPLE 3: N-QUEENS PROBLEM (SIMPLIFIED)
    // ==========================================
    
    public static boolean solveNQueens(int[][] board, int row) {
        int n = board.length;
        
        // Base case: All queens placed successfully
        if (row >= n) {
            return true;
        }
        
        // Try placing queen in each column of current row
        for (int col = 0; col < n; col++) {
            
            // Check if it's safe to place queen here
            if (isSafe(board, row, col)) {
                
                // Make choice: Place queen
                board[row][col] = 1;
                
                // Recursively place queens in next rows
                if (solveNQueens(board, row + 1)) {
                    return true;
                }
                
                // BACKTRACK: Remove queen if it doesn't lead to solution
                board[row][col] = 0;
            }
        }
        
        return false; // No solution found
    }
    
    // Helper function to check if queen placement is safe
    public static boolean isSafe(int[][] board, int row, int col) {
        int n = board.length;
        
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        
        // Check diagonal (top-left to bottom-right)
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        
        // Check diagonal (top-right to bottom-left)
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        
        return true;
    }
    
    // ==========================================
    // EXAMPLE 4: PERMUTATIONS
    // ==========================================
    
    public static void generatePermutations(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> result) {
        // Base case: current permutation is complete
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        // Try each unused number
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                
                // Make choice: use this number
                current.add(nums[i]);
                used[i] = true;
                
                // Recurse
                generatePermutations(nums, current, used, result);
                
                // BACKTRACK: undo the choice
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }
    
    // ==========================================
    // MAIN METHOD WITH TEST CASES
    // ==========================================
    
    public static void main(String[] args) {
        System.out.println("=== BACKTRACKING EXAMPLES ===\n");
        
        // Test 1: Maze solving
        System.out.println("1. MAZE SOLVING:");
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        int[][] solution = new int[4][4];
        
        if (solveMaze(maze, 0, 0, solution)) {
            System.out.println("Path found:");
            printMatrix(solution);
        } else {
            System.out.println("No path found");
        }
        
        // Test 2: Generate subsets
        System.out.println("\n2. SUBSETS OF [1,2,3]:");
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), subsets);
        
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
        
        // Test 3: N-Queens (4x4 board)
        System.out.println("\n3. 4-QUEENS SOLUTION:");
        int[][] board = new int[4][4];
        
        if (solveNQueens(board, 0)) {
            System.out.println("Solution found:");
            printMatrix(board);
        } else {
            System.out.println("No solution exists");
        }
        
        // Test 4: Permutations
        System.out.println("\n4. PERMUTATIONS OF [1,2,3]:");
        int[] permNums = {1, 2, 3};
        List<List<Integer>> permutations = new ArrayList<>();
        generatePermutations(permNums, new ArrayList<>(), new boolean[permNums.length], permutations);
        
        for (List<Integer> perm : permutations) {
            System.out.println(perm);
        }
    }
    
    // Helper method to print 2D array
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

/*
THE BACKTRACKING PATTERN:

1. BASE CASE: 
   - Check if we've reached a complete solution
   - If yes, return true/add to results

2. MAKE CHOICES:
   - Try each possible option at current step

3. RECURSE:
   - Call the function recursively with the new choice

4. BACKTRACK:
   - Undo the choice if it doesn't lead to a solution
   - This is the KEY step that makes it "backtracking"

5. RETURN:
   - Return false if no solution found at this level

REMEMBER: The "undo" step is what makes it backtracking!
*/

