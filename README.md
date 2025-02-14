# Atividade: classes Product, Servico e interface Vendavel

## Descrição
Este repositóro é dedicado ao desenvolvimento das classes Product e Servico, atividade do curso de Java: aplicando orientação a objetos. Diferente das outras atividade sobre orientação a objetos, a proposta dessa atividade é iniciar os princípios  de: interface e polimorfismo, da orientação a objetos.

## Detalhes técnicos
Para a realização dessas atividades foi utilizada a IDE Intellij. Não houve instalação de bibliotecas externas. A versão do Java utilizada nas atividades é: Java 21. 

## Pré-requisitos
Antes de executar os códigos Java presentes neste repositório, é necessário instalar o JDK (Java Development Kit).
O JDK é indispensável para compilar o código-fonte (.java) e gerar arquivos .class, que contêm os bytecodes essenciais para que a máquina execute o programa. O bytecode é uma linguagem intermediária compreendida pela Máquina Virtual Java (JVM), mas não diretamente pelos seres humanos. Essa conversão da linguagem Java para bytecode ocorre durante a compilação, por isso a instalação do JDK é imprescindível.

Caso este repositório já incluísse os arquivos .class gerados a partir do código-fonte, seria necessário apenas instalar o JRE (Java Runtime Environment). O JRE fornece o ambiente necessário para executar o bytecode, dispensando a necessidade de compilação. Da mesma forma, se o repositório contivesse um arquivo .jar (um executável Java), apenas a instalação do JRE seria suficiente.

Essas instalações, tanto do JDK quanto do JRE, são importantes porque incluem a Máquina Virtual Java (JVM), responsável por interpretar e executar o bytecode, garantindo a execução do programa Java.

**Link de instalação do JDK e JRE:**
1. JDK: https://www.oracle.com/br/java/technologies/downloads/
2. JRE: https://www.java.com/pt-BR/download/manual.jsp
   
*Importante: ao instalar o JDK escolha a versão com suporte, ela é identificada pela sigla LTS*

**Link de instalação do Intellij e tutorial de uso:**
1. Instalação: https://www.jetbrains.com/pt-br/idea/
2. Tutotrial de uso: https://www.youtube.com/watch?v=0_e9Egeyk2E

*Importante: ao instalar o Intellij escolha a edição community, ela é gratuita*

## Sobre a atividade
Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.

## Sobre programação estrutural x programação orientada a objetos
Em programação existe dois paradigmas: estrutural e orientado a objetos. A linguagem de programação que faz uso do paradigma estrutural desenvolvem em uma programação estruturada, com este paradigma temos as linguagens: C, Cobol, Pascal e Basic, por exemplo. Esse paradigma compreende que o programa deve seguir uma estrutura formada por:


 - Sequências: são comandos escritos de forma sequencial para serem executados;
 - Condições: sequências que só devem ser executada se uma condição for satisfeita;
 - Repetições: sequências que devem ser executadas repetidamente até que uma condição seja satisfeita;

Além disso em programação estruturada o programa é escrito em rotinas (funções) que recebem um bloco de instruções que contém uma ou todas as estruturas citadas acima. Essa rotinas podem ser quebradas em subrotinas. Essas subrotinas podem ser chamadas dentro de rotinas as quais se tornam responsáveis por executar todo o programa. Segue abaixo um exemplo do uso de programação estruurada usando a linguagem C:
```
// exemplo de programação estruturada usando a Linguagem C (sem uso de rotinas):

#include <stdio.h>

int main() {
    // sequência de comandos
    int dividendo, divisor;

    printf("Digite o valor de dividendo: ");
    scanf("%d", &dividendo);

    printf("Digite o valor de divisor: ");
    scanf("%d", &divisor);
    
    // estrutura de condição para verificar se dividendo é divisível por divisor
    if (divisor == 0) {
        printf("Divisão por zero não é permitida.\n");
    } else {
        if (dividendo % divisor == 0) {
            printf("%d é divisível por %d.\n", dividendo, divisor);
        } else {
            printf("%d não é divisível por %d.\n", dividendo, divisor);
        }
    }

    return 0;
}
```
```
// exemplo de programação estruturada usando a Linguagem C (com uso de rotinas):

#include <stdio.h>

// rotina (função) para verificar se dividendo é divisível por divisor
void verificarDivisibilidade(int dividendo, int divisor) {
    
    // estrutura de condição para verificar se dividendo é divisível por divisor
    if (divisor == 0) {
        printf("Divisão por zero não é permitida.\n");
    } else if (dividendo % divisor == 0) {
        printf("%d é divisível por %d.\n", dividendo, divisor);
    } else {
        printf("%d não é divisível por %d.\n", dividendo, divisor);
    }
}

int main() {

    // sequência de comandos
    int dividendo, divisor;

    printf("Digite o valor de dividendo: ");
    scanf("%d", &dividendo);

    printf("Digite o valor de divisor: ");
    scanf("%d", &divisor);

    // chamada da rotina (função)
    verificarDivisibilidade(dividendo, divisor);

    return 0;
}

```
O objetivo do paradigma orientado a objetos é aproximar as estruturas de um programa com as coisas do mundo real, além de fornecer uma maior proteção das variáveis utilizando o princípio de encapsulamento, isso não é visto e nem utilizado em programação estruturada, na verdade a programação estruturada se limita apenas a dizer se uma variável é vísivel ou não dentro de uma função. Além desse princípio existem outros que norteiam o paradigma de orientação a objetos. 

Para aproximar as estruturas de um programa com as coisas do mundo real, a POO como é chamada a programação orientada a objetos, definiu o conceito de classe e de objeto. Sendo a classe responsável por comportar os atributos (características) e métodos (comportamentos) de um objeto, servindo posteriormente de molde para a criação de objetos os quais tem tais atributos e fazem uso de tais métodos que podem ou não alterar o seu estado inicial.

Hoje em dia a maioria dos sistemas são desenvolvidos utilizando o paradigma de orientação a objetos, e a linguagem Java foi a pioneira no uso deste paradigma que revolucionou o reúso do código, a manutenção do código e a escrita do código. 

## Conteúdo estudado e aprendido no desenvolvimento da atividade
- **Interface:** é um conjunto de métodos que podem ser implementados pelas classes. As interfaces não possui construtor porque não há como instanciar um objeto de uma interface. Também é característica das interfaces poderem herdar de outra interface, além de uma classe poder implementar várias interfaces. Isso auxilia muito no contexto de herança múltipla, algo que não é permitido em Java. Vamos ver a sintaxe das interfaces para entender melhor:

```
public interface Veiculo{
    void ligar(); // método sem retorno e sem implementação
    void desligar(){
        System.out.println("Carro desligado!"); // método sem retorno e com implementação
    }
}
public class Carro implements Veiculo{

    @Override // anotação que indica sobrescrita do método
    public void ligar(){
        System.out.println("Carro ligado!"); // método da interface implementado na classe
    }

    @Override // anotação que indica sobrescrita do método
    public void desligar(){
        System.out.println("Carro desligado!"); // método da interface implementado na classe
    }
}
```
- **Polimorfismo: sobrescrita e sobrecarga:** 
sobrescrita é quando implementamos um método e alteramos como o método irá fazer o que ele se propôs a fazer. Por exemplo, Cachorro e Gato se comunicam, contudo de formas diferentes, logo o método *comunicar()* seria para o Cachorro latir e para o Gato miar, ou seja, um único método usado de formas diferentes, esse é outro pilar da POO que é o **Polimorfismo**. Além da sobrescrita, é usado outra forma de reúso de métodos chamada de: sobrecarga. A sobrecarga se caracteriza pela mudança na assinatura do método. Por exemplo, o método **somar(int valor1, int valor2){}** essa sintaxe do método somar() é a assinatura dele, se eu fizer **somar(int valor1, int valor2, int valor3){}** eu estou alterando essa assinatura, logo estou fazendo uma sobrecarga, mas essa sobrecarga só acontece se eu reutilizar o método na mesma classe e com o mesmo nome alterando a sua assinatura ou em classes diferentes mas mantendo o mesmo nome do método e alterando a sua assinatura. Um caracteriza da sobrecarga é que ela não depende de herança, a sobrescrita só ocorre se houver herança entre as classes ou implementação de interface.

```
// exemplo de sobrecarga

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }
}
```
```
// exemplo de sobrescrita

public class Animal {
    public void fazerSom() {
        System.out.println("Som genérico de animal");
    }
}

public class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }
}
```
## Para saber mais
**Artigo sobre Orientação a Objetos:** [Artigo da Alura](https://www.alura.com.br/artigos/poo-programacao-orientada-a-objetos?srsltid=AfmBOoqZjVNt8nPtFAt0LFlfnhWQHJYHp9cwkibk2cTSP_QMhWmORV5I)


