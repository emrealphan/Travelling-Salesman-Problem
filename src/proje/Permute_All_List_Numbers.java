package proje;


import java.util.ArrayList;
import java.util.Collections;


public class Permute_All_List_Numbers {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    static public ArrayList<Integer> arrayList = new ArrayList<>();
    static public ArrayList<Integer> yolTut = new ArrayList<>();
    static public ArrayList<Integer> sortedArrayList = new ArrayList<>();

    static void permute4(int N, int[][] adjacencyMatrix, int[] a, int k) {
        int[] tut = new int[N];

        int yol = 0;
        ShortestPath dene = new ShortestPath();

        if (k == a.length) {
            for (int i = 0; i < a.length; i++) {

                tut[i] = a[i];
                yolTut.add(a[i]);
                if (i == 0) {

                    System.out.print("");
                  
                    dene.dijkstra(adjacencyMatrix, 40, tut[i]);
                    yol += dene.yol[tut[i]];
                }

              
                if (i > 0) {                          
                    //not djikstrada mesafeyi elle kontrol ediceksen 33 53 60 yaz
                    dene.dijkstra(adjacencyMatrix, tut[i - 1], tut[i]);
                    yol += dene.yol[tut[i]];

                }

                // System.out.print(  "["+(a[i]+1)+"]" );
                if (i != a.length - 1) {
                    
                } else {
                   // System.out.print(ANSI_BLUE + ">" + ANSI_RESET);
                    dene.dijkstra(adjacencyMatrix, tut[i], 40);

                    yol += dene.yol[40];
                    arrayList.add(yol);
                    sortedArrayList.add(yol);
                    //  Collections.sort(arrayList);
                    Collections.sort(sortedArrayList);
                    //System.out.print(">[41]");
                    //System.out.print(" toplam yol = [" + yol + "]");

                }

            }

           // System.out.println();

        } else {
            for (int i = k; i < a.length; i++) {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;

                permute4(N, adjacencyMatrix, a, k + 1);

                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }

    }

}
