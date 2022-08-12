package Q1b;

public class RoboApp {

	public static void main(String[] args) {
		
		Robo robo = new Robo();

	}

}
/*
Implemente o problema do rob� andando em uma sala, conforme o diagrama abaixo.



A partir do construtor, deve ser definida a quantidade m�xima de linhas e colunas da sala
(tamanho do ambiente). O construtor pode ser capaz tamb�m de indicar a posi��o inicial do
rob� ou, se n�o for informada a posi��o inicial, o Robo come�a na posi��o (0,0).

Internamente deve haver um atributo que indica para onde o Robo est� virado (Norte, Sul, Leste, Oeste).

Os m�todos da classe Robo tem as seguintes funcionalidades:

- girarPara() - muda o Robo para apontar para uma outra dire��o (N, S, L, O). Caso alguma dire��o
 inv�lida seja fornecida, o Robo n�o executa o giro.

- mostrarPosicao() - retorna uma String no formato "x, y" representando a posi��o atual do Robo

- andar() - faz com que o rob� se desloque 1 posi��o, para a dire��o em que o Robo est� virado:

Norte - soma 1 no eixo y
Sul() - subtrai 1 no eixo y
Leste() - soma 1 no eixo x
Oeste() - subtrai 1 no eixo x
Desta forma, o ato de andar modifica as vari�veis de posi��o do rob� (x e y).

Voc� deve verificar se � poss�vel executar o movimento andar(), pois ele deve respeitar o 
tamanho m�ximo definido para�o�ambiente.
 */