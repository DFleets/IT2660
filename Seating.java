/*IT2660
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seating;
import java.util.Scanner;
/**
 *
 * @Dorrell Fleets
 */
public class Seating {

    /**
     * @param args the command line arguments
     */
    
    public static boolean full(char[][] plane)
	{
        for (char[] plane1 : plane) {
            for (int x = 0; x < plane[0].length; x++) {
                if (plane1[x] != 'X') {
                    return false;
                }
            }
        }
		return true;
    
        }
    
        public static int findRow(String numSeat) 
         {
		char rowChar = numSeat.charAt(0);
		return (int) rowChar - 48 - 1;
	}
        
        
        public static int findColumn(String numSeat)
          {
		char colChar = numSeat.charAt(1);
        switch (colChar) {
            case 'A':
                return 0;
            case 'B':
                return 1;
            case 'C':
                return 2;
            case 'D':
                return 3;
            default:
                return -1;
        }

	}
        
        public static void display(char[][] plane) {
		for (int i = 0; i < plane.length; i++) {

			System.out.print((i + 1) + " ");
			for (int x = 0; x < plane[0].length; x++) {
				System.out.print(plane[i][x] + " ");
		
				if (x == 1)
					System.out.print(" ");
			}

			System.out.println();
		}
	}

    
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        System.out.println("Seating Chart");
        
        System.out.println("");
        
        
                char[][] plane = { { 'A', 'B', 'C', 'D' }, 
                                 { 'A', 'B', 'C', 'D' }, 
                                  { 'A', 'B', 'C', 'D' },
                                  { 'A', 'B', 'C', 'D' },
                                  { 'A', 'B', 'C', 'D' },
                                  { 'A', 'B', 'C', 'D' }, 
                                  { 'A', 'B', 'C', 'D' }, };
                
                Scanner in = new Scanner(System.in);
                String decision = "Y";
		while (decision.equals("Y")& !full(plane)) 
		{
                   display(plane);
			System.out.print("Enter a seat.. i.e 1A, 3C, etc(ALL CAPS PLZ): ");

			boolean okSeat = false;
			while (okSeat == false) {
				String seat = in.nextLine();
				int r = findRow(seat);
				int c = findColumn(seat);
                           
                                if (plane[r][c] == 'X')
		System.out.print("Seat is full find another");
				else {
					plane[r][c] = 'X';
					okSeat = true;
				}
			}
			System.out.print("Continue.. 'Y' or 'N' ");
			decision = in.nextLine();
		}

		System.out.println("Plane seating: ");
		display(plane);
                                
 
                
 
      
    }    
        
}
