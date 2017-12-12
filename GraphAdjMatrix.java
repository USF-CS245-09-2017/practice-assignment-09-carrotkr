/**
 * GraphAdjMatrix
 */
public class GraphAdjMatrix implements Graph {
	private int[][] adjMatrix;
	private int size;
	private boolean[] marked;

	/**
	 * Constructs and returns a graph with the number of vertices passed as the argument.
	 * Vertices have IDs, numbered 0, 1, …, vertices-1.
	 * No edges exist between vertices at instantiation.
	 * 
	 * @param
	 */
	public GraphAdjMatrix(int vertices) {
		this.size = vertices;
		
		adjMatrix = new int[vertices][vertices];
	}

	/**
	 * Adds an undirected edge or weight w between two vertices.
	 * 
	 * @param
	 * @param
	 * @param
	 */
	@Override
	public void addEdge(int v1, int v2, int weight) { 
		this.adjMatrix[v1][v2] = weight;
		this.adjMatrix[v2][v1] = weight;
	}
	
	/**
	 * Returns the weight of the edge between vertices v1 and v2.
	 * May return 0 or a negative number if such an edge does not exist.
	 * 
	 * @param
	 * @param
	 * @return
	 */
	@Override
	public int getEdge(int v1, int v2) {

		return adjMatrix[v1][v2];
	}
	
	/**
	 * Creates the minimum spanning tree from the source graph.
	 * Removes any edges in the graph which are not in the minimum spanning tree.
	 * Returns the weight of the minimum spanning tree.
	 * 
	 * @return
	 */
	@Override
	public int createSpanningTree() {

		return 0;
	}
	
	private void visit(int vertex) {
		marked[vertex] = true;
	}
	
	@Override
	public void addEdge(int v1, int v2) {
		
	}

	@Override
	public void topologicalSort() {

	}
}