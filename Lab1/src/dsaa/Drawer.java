package dsaa;



public class Drawer {
    private static void drawLine(int n, char ch) {
        // TODO


    }



    public static void drawPyramid(int n) {

        int amountoflet = 2*n -1;
        int row = 1;

        for (int x = 0; x<n; x++)
        {

            int x1 = (2*row)-1;
            int star = (amountoflet-x1)/2;
            String rzad = ".".repeat(star ) + "X".repeat(x1)+ ".".repeat(star ) ;
            System.out.println(rzad);
            row++;
            }


//
        }




    public static void drawChristmassTree(int n) {

        for (int a = 1; a<n+1; a++ )
        {
            int amountofrows = a;
            int amountoflet = 2*n -1;
            int row = 1;

          for (int x = 0; x<amountofrows; x++)
         {

                int x1 = (2*row)-1;
                int star = (amountoflet-x1)/2;
                String rzad = ".".repeat(star ) + "X".repeat(x1)+ ".".repeat(star ) ;
                System.out.println(rzad);
                row++;
            }


//
    }}
}


