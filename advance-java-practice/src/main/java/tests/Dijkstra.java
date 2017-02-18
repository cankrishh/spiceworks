package tests;

/**
 * Created by OMPRAKASH on 9/23/2016.
 */

import java.math.BigInteger;
import java.util.Iterator;

import java.util.*;
import java.util.PriorityQueue;

/**
 * Created by rahulkhairwar on 29/01/16.
 *<br /><br />
 * Hackerrank Question Link : <b>https://www.hackerrank.com/challenges/dijkstrashortreach</b>
 */
public class Dijkstra
{
    static final int infinity = Integer.MAX_VALUE;
    private static int t, nodes, edges;
    static int[] distance;
    static List<Edge>[] list;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
/*		System.out.print("Enter the number of nodes you want in the graph : ");
		nodes = in.nextInt();
		System.out.print("\nEnter the number of edges : ");
		edges = in.nextInt();
		createGraph();
		findShortestPaths(0);
		System.out.println("The shortest path to all nodes from node 0 is : ");
		for (int i = 0; i < nodes; i++)

			System.out.println(i + " : " + distance[i]);*/

        t = in.nextInt();

        while (t-- > 0)
        {
            nodes = in.nextInt();
            edges = in.nextInt();

            createGraph();

            int start = in.nextInt() - 1;

            findShortestPaths(start);

            for (int i = 0; i < nodes; i++)
            {
                if (i == start)
                    continue;
                else
                {
                    if (distance[i] != infinity)
                        System.out.print(distance[i] + " ");
                    else
                        System.out.print(-1 + " ");
                }
            }

            System.out.println();
        }
    }

    static void createGraph()
    {
        list = new ArrayList[nodes];

        for (int i = 0; i < edges; i++)
        {
            int from, to, weight;

            from = in.nextInt() - 1;
            to = in.nextInt() - 1;
            weight = in.nextInt();

            if (list[from] == null)
                list[from] = new ArrayList<>();

            list[from].add(new Edge(to, weight));

            if (list[to] == null)
                list[to] = new ArrayList<>();

            list[to].add(new Edge(from, weight));
        }
    }

    static void findShortestPaths(int node)
    {
        distance = new int[nodes];

        for (int i = 0; i < nodes; i++)
            distance[i] = infinity;

        distance[node] = 0;

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Node(node, 0, -1));


        while (priorityQueue.size() > 0)
        {
            Node min = priorityQueue.poll();

            for (Edge curr : list[min.node]) {
                if (distance[min.node] + curr.weight < distance[curr.to]) {
                    distance[curr.to] = distance[min.node] + curr.weight;
                    priorityQueue.add(new Node(curr.to, distance[curr.to], min.node));

                }
            }
        }
    }



    private static class Edge
    {
        int to, weight;

        public Edge(int to, int weight)
        {
            this.to = to;
            this.weight = weight;
        }

    }

    static class Node implements Comparable<Node>
    {
        int node, shortestPathWeight, parent;

        private PriorityQueue<Integer> highs = new PriorityQueue<Integer>(Integer::compareTo);

        private PriorityQueue<Integer> lows = new PriorityQueue<Integer>((arg0, arg1) -> arg1.compareTo(arg0));

        public Node(int node, int shortestPathWeight, int parent)
        {
            this.node = node;
            this.shortestPathWeight = shortestPathWeight;
            this.parent = parent;
        }

        @Override
        public int compareTo(Node o)
        {
            return Integer.compare(this.shortestPathWeight, o.shortestPathWeight);
        }


    }

}