# Exercício de Aprendizado em Java

Este projeto é um exercício de aprendizado em Java, focado em conceitos fundamentais de programação, como princípios orientados a objetos, manipulação de entrada/saída e manipulação de dados. O exercício consiste em criar um programa para ler dados de um pedido com N itens (onde N é fornecido pelo usuário) e, em seguida, exibir um resumo do pedido conforme o exemplo fornecido.

## Proposta do Exercício
O exercício consiste em:

- Ler dados para um pedido com N itens (N fornecido pelo usuário).
- Exibir um resumo do pedido.

## Exemplo de Resumo
```
Momento do Pedido: dd/MM/yyyy HH:mm:ss
Status do Pedido: [Status do Pedido]
Cliente: [Nome do Cliente] - ([Data de Nascimento do Cliente]) - [Email do Cliente]
Itens do Pedido:
        - [Nome do Produto], [Preço do Produto], Quantidade: [Quantidade], Subtotal: [Subtotal]
        ...
Preço Total: [Preço Total]

```


## Detalhes de Implementação
Este programa Java utiliza diversos conceitos, incluindo:

- Princípios orientados a objetos: Classes como `Cliente`, `Pedido`, `ItemPedido`, `Produto` são criadas para modelar entidades do mundo real.
- Manipulação de entrada: O programa recebe entrada do usuário usando a classe `Scanner`.
- Manipulação de datas: As datas são analisadas e formatadas usando a classe `SimpleDateFormat`.
- Enumeração: O enum `OrderStatus` é utilizado para representar o status de um pedido.

## Visão Geral do Código
```java
// Declarações de importação

public class Main {
    public static void main(String[] args) throws ParseException {
        // Definindo localidade padrão, inicializando Scanner e formatações de data

        // Lendo dados do cliente
        System.out.println("Digite os dados do cliente: ");
        // Lendo nome do cliente, email e data de nascimento

        // Lendo dados do pedido
        System.out.println("Digite os dados do pedido: ");
        // Lendo status do pedido

        // Criando um objeto Pedido com os dados do cliente
        // Solicitando ao usuário o número de itens no pedido

        // Iterando para ler dados de cada item
        for (int i = 1; i <= numberItem; i++) {
            // Lendo dados do item: nome do produto, preço e quantidade

            // Criando um objeto ItemPedido e adicionando-o ao pedido
        }

        // Exibindo resumo do pedido
        // Momento do pedido, status, detalhes do cliente

        // Exibindo itens do pedido e seu subtotal
        for (ItemPedido item : pedido.getItens()) {
            // Imprimindo nome do produto, preço, quantidade e subtotal
        }

        // Exibindo preço total do pedido
    }
}
```

Este exercício abrange vários conceitos de programação Java e serve como uma experiência prática de aprendizado para iniciantes.

## Exemplo do resultado
```
Name: Bruno Arouca
Email: Bruno@gmail.com
Birth date: 30/09/1998
Enter order data:

Status: PROCESSING
How many items to this order? 2
Enter #1 item data:

Product name: TV
Product price: 2000
Quantity: 2
Enter #2 item data:

Product name: Mouse
Product price: 90
Quantity: 2

Order moment: 01/03/2024 00:45:25
Order status: PROCESSING
Client: Bruno Arouca - (30/09/1998) - Bruno@gmail.com
Order items:
TV, 2000.0, Quantity: 2, Subtotal: 4000.0
Mouse, 90.0, Quantity: 2, Subtotal: 180.0
Total Price: 4180.0
```
