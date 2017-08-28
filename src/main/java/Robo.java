public class Robo {


    private int x;
    private int y;
    private char direcao;

    private double xyArea;

    /**
     *
     * @param area
     * @param x1
     * @param y1
     * @param frente
     */
    public Robo(int area, int x1, int y1, char frente){
        x = x1;
        y = y1;
        direcao = frente;

        xyArea = Math.sqrt(area);
    }


    public String toString() {
        return x+" "+y+" "+direcao;
    }

    public String exploracao(String comando){
        int tam = comando.length(), contador = 0;

        while(contador < tam) {
            char exec = comando.charAt(contador);

            switch(exec) {
                case 'E':
                    if (direcao == 'N'){
                        direcao = 'O';
                        break;
                    }
                    if (direcao == 'S'){
                        direcao = 'L';
                        break;
                    }
                    if (direcao == 'L'){
                        direcao = 'N';
                        break;
                    }
                    if (direcao == 'O'){
                        direcao = 'S';
                        break;
                    }

                case 'D':
                    if (direcao == 'N'){
                        direcao = 'L';
                        break;
                    }
                    if (direcao == 'S'){
                        direcao = 'O';
                        break;
                    }
                    if (direcao == 'L'){
                        direcao = 'S';
                        break;
                    }
                    if (direcao == 'O'){
                        direcao = 'N';
                        break;
                    }

                case 'M':
                    if (direcao == 'O' && x >= 1) x--;
                    if (direcao == 'L' && x < xyArea) x++;
                    if (direcao == 'N' && y < xyArea) y++;
                    if (direcao == 'S' && y >= 1) y--;
            }

            contador++;
        }

        return this.toString();

    }
}
