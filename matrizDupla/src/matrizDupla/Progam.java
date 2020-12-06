package matrizDupla;

import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite tamanho Matriz");
		int n = sc.nextInt();//leitura do tamanho da matriz
		int[][] mat = new int[n][n]; 
            
		// primeiro for incrementa linha int[X][n]; 
		for (int i = 0; i < mat.length; i++) { 
			// este segundo for incrementa coluna int[n][X]; 
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				System.out.println(mat[i][j]);
			}
		}
		System.out.println("Main diagonal:");
		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i] + " ");
		}

		System.out.println();
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative nanbers: "+count);
		
		
		sc.close();
	}

}
