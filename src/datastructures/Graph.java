package datastructures;

import java.util.LinkedList;

public class Graph {
    private LinkedList<Integer>[]  adjacencyList;
    private  int Vertices;// number of nodes/vertices of the graph '
    private int Edges; // number of edges between the vertices of the graph


    public Graph( int nodes){
        this.Vertices=nodes;
        this.Edges=0;
        this.adjacencyList= new LinkedList[nodes];
        for(int vertex_At_Index=0; vertex_At_Index<Vertices; vertex_At_Index++){
            adjacencyList[vertex_At_Index]=new LinkedList<>();
        }
    }

    public void addEdgeBetweenVertices(int vertex1,int vertex2){
        adjacencyList[vertex1].add(vertex2);
        adjacencyList[vertex2].add(vertex1);
        Edges++;
    }

    public String toString() {
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append( Vertices +" vertices,"+  Edges + " edges"+ " in the Graph"+"\n" );
        for(int v=0; v<Vertices; v++){
            stringBuilder.append(v + ": ");
            for (int w: adjacencyList[v]){
                stringBuilder.append(w + " ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    // TODO: look into StringBuilder
    // TODO: add Depth First Search Traversal
     // TODO: addBreadth first Search Traversal
    // TODO: add Dijkstra's Alogorithim
    // TODO: add Prim's Alogorithim
    // TODO: add Kruskal's Alogorithim
    // TODO: add Trees-Completed






}
