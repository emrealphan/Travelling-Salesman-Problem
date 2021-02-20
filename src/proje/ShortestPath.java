package proje;


public class ShortestPath {

    public final int NO_PARENT = -1;
    public int[] yol = new int[81];

    // Kaynak düğümden kastım startVertex 40 yani kocaeli
    // verdiğim vertexlerden kesinlikle geçmeli daha sonra yapılacak
    public void dijkstra(int[][] adjacencyMatrix,
            int startVertex, int... vertices) {

        int nVertices = adjacencyMatrix[0].length;

        // shortestDistances[i] kaynak düğümünden i ye
        // en kısa yolu verir
        int[] shortestDistances = new int[nVertices];

        // added[i] doğru olur eğer
        // i en kısa yol ağacındaysa
        // ya da i ye olan uzaklık hesaplanmışsa
        boolean[] added = new boolean[nVertices];

        // Bütün en kısa yolları sonsuz olarak
        // bütün added[i] de false olarak tanımladık
        for (int vertexIndex = 0; vertexIndex < nVertices;
                vertexIndex++) {
            shortestDistances[vertexIndex] = Integer.MAX_VALUE;
            added[vertexIndex] = false;
        }

        // Bir düğümün kendisine olan uzaklığı 0'dır
        shortestDistances[startVertex] = 0;

        // parents[] shortestPath'i tutmak için
        int[] parents = new int[nVertices];

        // başlangıç düğümünün parenti yok
        parents[startVertex] = NO_PARENT;

        //Bütün düğümlerden en kısa yolları bulma
        //Ben burayı all değilde spesifik olarak
        //belirttiğim vertexler yapıcam
        //boolean bir değerle : ayrıca 10'dan fazla dolanıyorsa da banlıyacam daha ilerde
        for (int i = 1; i < nVertices; i++) {

            // Henüz işlenmemiş düğüm kümesinden minimum mesafedeki düğümü seçin
            // En yakın düğüm her zaman ilk başta, başlangıç düğümüne eşit
            int nearestVertex = -1;
            int shortestDistance = Integer.MAX_VALUE;
            for (int vertexIndex = 0;
                    vertexIndex < nVertices;
                    vertexIndex++) {
                if (!added[vertexIndex]
                        && shortestDistances[vertexIndex]
                        < shortestDistance) {
                    nearestVertex = vertexIndex;
                    shortestDistance = shortestDistances[vertexIndex];
                }
            }

            // İşlenmiş  düğümü ekliyoruz
            added[nearestVertex] = true;

            // Kaynak düğümünden komşu düğümlere
            // olan uzaklık güncelleniyor
            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
                int edgeDistance = adjacencyMatrix[nearestVertex][vertexIndex];

                if (edgeDistance > 0
                        && ((shortestDistance + edgeDistance)
                        < shortestDistances[vertexIndex])) {
                    parents[vertexIndex] = nearestVertex;
                    shortestDistances[vertexIndex] = shortestDistance
                            + edgeDistance;
                    yol[vertexIndex] = shortestDistances[vertexIndex];
                }
            }
        }

       // printSolution(startVertex, shortestDistances, parents, vertices);

    }

    //BURADAN AŞŞAĞISININ ÇALIŞMASINI KAPATTIK, KONSOLA YAZARAK PROGRAMI YAVAŞLATMASIN DİYE
    public void printSolution(int startVertex,
            int[] distances,
            int[] parents, int... vertices) {

        int nVertices = distances.length;
        // System.out.print("Vertex\t\tDistance\t\tPath");

        for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
            for (int j = 0; j < vertices.length; j++) {
                if (vertexIndex == vertices[j]) {
                    if (vertexIndex != startVertex) {
                        //  System.out.print(" " + (startVertex + 1) + " den>>");
                        // System.out.print((vertexIndex + 1) + "\t ");
                        // System.out.print(distances[vertexIndex] + "\t");

                        //geçtiğimiz yolları bu fonkta bahsediyoruz
                        int p = 0;
                        printPath(p, vertexIndex, parents);
                    }
                }
            }
        }
    }

    //gidilen path'i yazan
    public void printPath(int p, int currentVertex,
            int[] parents) {

        // Base case : kaynak düğümün işlenmesi
        if (currentVertex == NO_PARENT) {
            return;
        }

        printPath(p + 1, parents[currentVertex], parents);
        if (p != 0) {

            System.out.print((currentVertex + 1) + "→");
        }

    }

}
