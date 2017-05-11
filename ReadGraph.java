

import java.util.Scanner;
import java.util.Arrays;

public class ReadGraph {
	private static String[] vertices;
	private static AdjListNode[] returnListGlobal;

public static String[] readVertices(Scanner fileIn) {
int numberOfVertices = fileIn.nextInt();
String[] returnString= new String[numberOfVertices];
for(int i = 0; i<numberOfVertices; i++) {
returnString[i] = fileIn.next();
}
Arrays.sort(returnString);
vertices=returnString;
return returnString;

}

public static AdjListNode[] readEdgesAdjList(Scanner fileIn) {
	
	returnListGlobal = new AdjListNode[vertices.length];
	

	while(fileIn.hasNext()==true) {
		int vertexListIndex= Arrays.binarySearch(vertices,fileIn.next());
		int secondArg= Arrays.binarySearch(vertices, fileIn.next());
		int weightVal= fileIn.nextInt();
		returnListGlobal[vertexListIndex] = new AdjListNode(secondArg,weightVal, returnListGlobal[vertexListIndex]);

	}
	return returnListGlobal;
}
}





