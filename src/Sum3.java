import com.sun.source.tree.ContinueTree;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.lang.*;

public class Sum3 {
    public static int[][] matrix = new int[5][5];

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

      matrix = CreateMatrix(matrix);
      int node = 0;
      for (int i=node;i< matrix.length;i++){
          list.add(i);
      }
      int a =CalculatingSalesman(0, list);
        System.out.println(a);


        // Showing the matrix
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix.length;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int CalculatingSalesman(int node, ArrayList<Integer> list){
        try {
            System.out.println(list.indexOf(node) + " " + node + "BUG");
            list.remove(list.indexOf(node));
        }
        catch (Exception e){
            System.out.println(list.indexOf(node) + " " + node + "BUG");
            return matrix[node][0];
        }
        int i=0;
        ArrayList<Integer> lista = new ArrayList<>();
        for(Integer a : list){

            if(list.isEmpty()){
                return matrix[node][0];
            }else {
                try {
                    if(list.indexOf(a) + 1<= list.size()) {
                        lista.add(matrix[node][a] + CalculatingSalesman(list.get(list.indexOf(a) + 1), list));
                    }else{
                        return matrix[node][0];
                    }
                    }
                catch (Exception e){

                }
            }
            i++;
        }
        int minn = lista.indexOf(Collections.min(lista));
        System.out.println(minn);
        return(minn);
    }

    //Creating the matrix random
    private static int[][] CreateMatrix(int[][] matrix) {
        Random random = new Random();
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i==j){
                    matrix[i][j]=0;
                }else{
                    matrix[i][j]= random.nextInt(100);
                }
            }

        }
        return matrix;
    }
}
