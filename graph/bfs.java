package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs 
{

	static ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();
	
	public static void main(String[] args) 
	{
	
		int n = 7, m = 7; 
		
		for (int i = 0; i <= n; i++) 
			adj.add(new ArrayList<Integer>());
		
		// edge 1---2
		adj.get(1).add(2); 
		

		// edge 2---3
		
		adj.get(3).add(2);
		
		// edge 2---1
		adj.get(2).add(1);
		
		
		// adge 2--7
		adj.get(2).add(7);
		adj.get(2).add(3);
		adj.get(7).add(2);
		adj.get(3).add(5);
		
		adj.get(4).add(6);
		adj.get(5).add(3);
		adj.get(5).add(7);
		adj.get(6).add(4);
		adj.get(7).add(5);
		System.out.println("Representation of Graph"); 
		System.out.println(adj); 
		boolean vis[] = new boolean[8];
		
		System.out.println(bfs(1));
	}
	
	public static ArrayList<Integer> bfs(int V)
	{
		ArrayList<Integer> bfs = new ArrayList<>(); 
        boolean vis[] = new boolean[8]; 
        Queue<Integer> q = new LinkedList<>();
        
        q.add(1); 
        vis[1] = true; 
        
        while (!q.isEmpty())
        {
            Integer node = q.poll();
            bfs.add(node); 
 
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            for(Integer it: adj.get(node)) {
                if(vis[it] == false) {
                    vis[it] = true; 
                    q.add(it); 
                } 
            }
        }
        
        return bfs; 
	}
	
	
	
}
