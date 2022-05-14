package Q1b;

public class RoboApp {

	public static void main(String[] args) {
		
		Robo robo = new Robo();

	}

}
/*
Implemente o problema do robô andando em uma sala, conforme o diagrama abaixo.



A partir do construtor, deve ser definida a quantidade máxima de linhas e colunas da sala
(tamanho do ambiente). O construtor pode ser capaz também de indicar a posição inicial do
robô ou, se não for informada a posição inicial, o Robo começa na posição (0,0).

Internamente deve haver um atributo que indica para onde o Robo está virado (Norte, Sul, Leste, Oeste).

Os métodos da classe Robo tem as seguintes funcionalidades:

- girarPara() - muda o Robo para apontar para uma outra direção (N, S, L, O). Caso alguma direção
 inválida seja fornecida, o Robo não executa o giro.

- mostrarPosicao() - retorna uma String no formato "x, y" representando a posição atual do Robo

- andar() - faz com que o robô se desloque 1 posição, para a direção em que o Robo está virado:

Norte - soma 1 no eixo y
Sul() - subtrai 1 no eixo y
Leste() - soma 1 no eixo x
Oeste() - subtrai 1 no eixo x
Desta forma, o ato de andar modifica as variáveis de posição do robô (x e y).

Você deve verificar se é possível executar o movimento andar(), pois ele deve respeitar o 
tamanho máximo definido para o ambiente.
 */