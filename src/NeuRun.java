import java.util.*;

public class NeuRun {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][][] arr = new int[n][n][2];
        int max = 0;
        while (max < n) {
            int a = s.nextInt();
            int m = s.nextInt();
            if (m != 0) {
                for (int u = 1; u <= m; u++) {
                    int to = s.nextInt();
                    for (int r = 0; r < 2; r++) {
                        int dort = s.nextInt();
                        arr[a - 1][to - 1][r] = dort;
                        arr[to - 1][a - 1][r] = dort;
                    }
                }
            }
            max++;
        }
        int msg = s.nextInt();
        int[][] msgarr = new int[msg][2];
        for (int i = 1; i <= msg; i++) {
            msgarr[i][0] = s.nextInt();
            msgarr[i][1] = s.nextInt();
        }
        boolean distance = false;
        System.out.println("Is distance or time more important for you? type d for distance an t for time :)");
        if(s.next().equalsIgnoreCase("d")){
            distance = true;
        }else{
            distance = false;
        }
        int dist = 0;
        int time = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= msg; i++) {
            int fr = msgarr[i][0];
            int to = msgarr[i][1];
            Edges[] edges ={
                    new Edges(0,1,4),
                    new Edges(0,2,2),
                    new Edges(0,3,6),
                    new Edges(2,3,3)
            };
            Graph g = new Graph(edges);
            g.calculateShortestDistance();
            g.printResult();
        }
        }
    }

