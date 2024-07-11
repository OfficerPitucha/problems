import java.util.*;

class Solution {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int[][] edges = new int[2][2];
        for (int i = 0; i < edges.length; i++)
            edges[i] = new int[2];
        edges[0][1] = 1;
        edges[1][0] = 0;
        edges[1][1] = 2;
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        System.out.println(graph);
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        Set<Integer> visited = new HashSet<>();
        return dfs(source, destination, graph, visited);
    }

    private boolean dfs(int node, int destination, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        if (node == destination) {
            return true;
        }
        visited.add(node);
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                if (dfs(neighbor, destination, graph, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}