import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        byte opc, contador = 0;
        int n, m;
        do {
            System.out.println("Seleccione la operación que desea realizar: ");
            System.out.println("1.Verificar que dos matrices son iguales");
            System.out.println("2.Sumar dos matrices");
            System.out.println("3. Generar una matriz 0 de n x m(nula)");
            System.out.println("4.Obtener el inverso aditivo de una matriz de n x m");
            System.out.println("5.Restar dos matrices");
            System.out.println("6.Multiplicar un escalar por una matriz de n x m");
            System.out.println("7.Multiplicar 2 matrices compatibles");
            System.out.println("8.Multiplicar 2 matrices compatibles");
            System.out.println("9.Obtener la inversa de una matriz de tamaño n");
            System.out.println("10.Obtener el determinante de una matriz de tamaño n");
            opc = entrada.nextByte();
            contador++;
        } while (opc <= 0 || opc > 10 || contador == 3);
        System.out.println("\n");

        switch (opc) {
            case 1 -> {
                System.out.println("Numero de filas de la matriz A:");
                int a = entrada.nextInt();
                System.out.println("Numero de columnas de la matriz A:");
                int b = entrada.nextInt();
                System.out.println("Numero de filas de la matriz B:");
                int c = entrada.nextInt();
                System.out.println("Numero de columnas de la matriz B:");
                int d = entrada.nextInt();

                if (a != c || b != d) {
                    System.out.println("Las matrices no son iguales");
                    break;
                }
                int matrizA[][] = new int[a][b];
                int matrizB[][] = new int[c][d];

                System.out.println("Elementos de la matriz A");
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < c; j++) {
                        System.out.print("a" + (i + 1) + (j + 1) + " = ");
                        matrizA[i][j] = entrada.nextInt();
                    }

                }

                System.out.println("\nElementos de la matriz B");
                for (int i = 0; i < b; i++) {
                    for (int j = 0; j < d; j++) {
                        System.out.print("a" + (i + 1) + (j + 1) + " = ");
                        matrizB[i][j] = entrada.nextInt();
                    }

                }
                int cont = 0;
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < c; j++) {
                        if (matrizA[i][j] != matrizB[i][j]) {
                            cont++;
                        }
                    }
                    if (cont > 0) {
                        System.out.println("Las matrices no son iguales");
                    }
                }

            }

            case 2 -> {

                System.out.println("Numero de filas de ambas matrices: ");
                n = entrada.nextInt();
                System.out.println("Numero de columnas de ambas matrices: ");
                m = entrada.nextInt();

                int matrizA[][] = new int[n][m];
                int matrizB[][] = new int[n][m];
                int matrizSuma[][] = new int[n][m];

                System.out.println("Elementos de la matriz A");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print("a" + (i + 1) + (j + 1) + " = ");
                        matrizA[i][j] = entrada.nextInt();
                    }

                }

                System.out.println("\nElementos de la matriz B");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print("a" + (i + 1) + (j + 1) + " = ");
                        matrizB[i][j] = entrada.nextInt();
                    }

                }

                System.out.println("\n2Matriz suma");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j];
                        System.out.print(matrizSuma[i][j] + "\t");
                    }
                    System.out.print("\n");

                }

            }

            case 3 -> {

                System.out.println("Numero de filas: ");
                n = entrada.nextInt();
                System.out.println("Numero de columnas: ");
                m = entrada.nextInt();

                int matriz[][] = new int[n][m];

                System.out.println("\nMatriz nula");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        matriz[i][j] = 0;
                        System.out.print(matriz[i][j] + "\t");
                    }
                    System.out.println("\n");
                }

            }

            case 4 -> {

                System.out.println("Numero de filas: ");
                n = entrada.nextInt();
                System.out.println("Numero de columnas: ");
                m = entrada.nextInt();

                int matriz[][] = new int[n][m];

                System.out.println("Elementos de la matriz");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print("a" + (i + 1) + (j + 1) + " = ");
                        matriz[i][j] = entrada.nextInt();
                    }
                }
                System.out.println("\nInverso aditivo de la matriz");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        matriz[i][j] = matriz[i][j] * (-1);
                        System.out.print(matriz[i][j] + "\t");
                    }
                    System.out.println("\n");
                }

            }

            case 5 -> {
                System.out.println("Numero de filas de ambas matrices: ");
                n = entrada.nextInt();
                System.out.println("Numero de columnas de ambas matrices: ");
                m = entrada.nextInt();

                int matrizA[][] = new int[n][m];
                int matrizB[][] = new int[n][m];
                int matrizSuma[][] = new int[n][m];

                System.out.println("Elementos de la matriz A");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print("a" + (i + 1) + (j + 1) + " = ");
                        matrizA[i][j] = entrada.nextInt();
                    }

                }

                System.out.println("\nElementos de la matriz B");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print("a" + (i + 1) + (j + 1) + " = ");
                        matrizB[i][j] = entrada.nextInt();
                    }

                }

                System.out.println("\n2Matriz suma");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        matrizSuma[i][j] = matrizA[i][j] - matrizB[i][j];
                        System.out.print(matrizSuma[i][j] + "\t");
                    }
                    System.out.print("\n");

                }

            }

            case 6 -> {

                System.out.println("Numero de filas: ");
                n = entrada.nextInt();
                System.out.println("Numero de columnas: ");
                m = entrada.nextInt();
                System.out.println("Escalar: ");
                int k = entrada.nextInt();

                int matriz[][] = new int[n][m];

                System.out.println("Elementos de la matriz");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print("a" + (i + 1) + (j + 1) + " = ");
                        matriz[i][j] = entrada.nextInt();
                    }

                }

                System.out.println("Elementos multiplicados por el escalar");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        matriz[i][j] = matriz[i][j] * (k);
                        System.out.print(matriz[i][j] + "\t");
                    }
                    System.out.println("\n");
                }
            }

            case 7 -> {
                System.out.println("Numero de filas de la matriz A: ");
                n = entrada.nextInt();
                System.out.println("Numero de columnas de la matriz A: ");
                m = entrada.nextInt();

                System.out.println("Numero de filas de la matriz B: ");
                int n2 = entrada.nextInt();
                System.out.println("Numero de columnas de la matriz B: ");
                int m2 = entrada.nextInt();

                while (m != n2) {
                    System.out.println("Las matrices no son compatibles, intente de nuevo");
                    System.out.println("Numero de filas de la matriz A: ");
                    n = entrada.nextInt();
                    System.out.println("Numero de columnas de la matriz A: ");
                    m = entrada.nextInt();

                    System.out.println("Numero de filas de la matriz B: ");
                    n2 = entrada.nextInt();
                    System.out.println("Numero de columnas de la matriz B: ");
                    m2 = entrada.nextInt();
                }

                int matrizA[][] = new int[n][m];
                int matrizB[][] = new int[n2][m2];
                int matrizProducto[][] = new int[n][m2];

                System.out.println("Elementos de la matriz A");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print("a" + (i + 1) + (j + 1) + " = ");
                        matrizA[i][j] = entrada.nextInt();
                    }

                }

                System.out.println("\nElementos de la matriz B");
                for (int i = 0; i < n2; i++) {
                    for (int j = 0; j < m2; j++) {
                        System.out.print("a" + (i + 1) + (j + 1) + " = ");
                        matrizB[i][j] = entrada.nextInt();
                    }

                }

                System.out.println("Producto de las matrices A y B: ");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m2; j++) {
                        matrizProducto[i][j] = matrizA[i][j] * matrizB[i][j];

                    }
                }

            }

            case 8 -> {
                // Urilizar el arreglo
                System.out.println("Orden de la matriz cuadrada: ");
                n = entrada.nextInt();

                int matriz[][] = new int[n][n];

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {

                        if (i == j) {
                            System.out.print("1\t");
                        } else {
                            System.out.print("0\t");
                        }

                    }
                    System.out.println("\n");
                }

            }

            case 9 -> {

            }

            case 10 -> {
                System.out.println("Orden de la matriz cuadrada: ");
                n = entrada.nextInt();

                int matriz[][] = new int[n][n];

                System.out.println("Elementos de la matriz");
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                        System.out.print("a" + (i + 1) + (j + 1) + " = ");
                        matriz[i][j] = entrada.nextInt();
                    }
                }
                if (n == 1) {
                    System.out.println("|A|=" + matriz[0][0]);
                } else if (n == 2) {
                    int n1 = matriz[0][0] * matriz[1][1];
                    int n2 = matriz[1][0] * matriz[0][1];
                    System.out.println("|A|=" + (n1 - n2));
                } else if (n == 3) {
                    int determinante;
                    int cofactor[][] = new int[n][n];

                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            cofactor[i][j] = (matriz[i + 1][j + 1] - matriz[i + 2][j + 2]);

                            if (i + j % 2 != 0) {
                                cofactor[i][j] = cofactor[i][j] * (-1);
                            }
                        }
                        for (i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                determinante = matriz[i][j] * cofactor[i][j];
                            }
                        }

                    }

                    entrada.close();

                }
            }

        }
    }
}
