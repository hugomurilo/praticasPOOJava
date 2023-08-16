# Programa de Pedidos
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE) 

## Sobre o exercício 
Objetivo da atividade é praticar composições de objetos. Além disso, tive que fazer uma pequena adaptação para utilizar o pacote java.time que foi implementado a partir do Java 8 em vez de usar o pacote Date.
Sequência realizada:
1) Enumeração para o status do pedido;
2) Classe Client usando a classe LocalDate;
3) Classe OrdemItem, compondo a classe Product (tem um);
4) Classe Order, compondo a classe Client (tem um) e OrderItem (tem muitos), a qual foi instanciada por uma List implementada pela ArrayList;
5) Método total() da classe Order, utilizando um for each para percorer a lista e somar os subTotal() de cada objeto do tipo orderItem;
6) Classe Program para o test no console: cada classe foi instanciada recebendo como argumentos de entrada do usuário. Foi utilizado na implementação da lógica do programa um laço for para criar a lista de pedidos;
7) Métodos toString na classe Client, OrderItem e Order, com uma peculiaridade nesta última, utilizando o StringBuilder para que o texto final seja mais perfomático, não utilizando muito recurso de memória. Foi na construção desse método que verifiquei a necessidade de implementar outros toString nas outras classes conforme a necessidade.

## Modelo de domínio UML
![modelo de domínio](https://github.com/hugomurilo/praticasPOOJava/blob/main/assets/imgReadme/dominioPedidos.PNG)
## Programa em Execução
![execução do programa](https://github.com/hugomurilo/praticasPOOJava/blob/main/assets/imgReadme/Pedidos.PNG)

# Conceitos de POO aplicados
- Encapsulamento
- Sobrecarga
- Composição de objetos
  
# Ferramentas utilizadas 
- Eclipse IDE

# Autor 
[<img src="https://avatars.githubusercontent.com/u/129471528?v=4" width=130><br><sub>Hugo Murilo</sub>](https://github.com/hugomurilo)

https://www.linkedin.com/in/hugo-murilo/
