# Trabalho 1 _ Compiladores 2024/1

**Aluno:** Christian Coronel da Silva Polli
**RA:** 798083

## Pré-requisitos

- Java
- Maven
- **Recomendação: Apache NetBeans**
- Antlr4

## Instruções de instalação

Após instalar o Java e Maven na sua máquina (checar com ```java -version``` e ```mvn -version```), deve-se iniciar um projeto com o Maven no NetBeans (ou editor de código/texto de sua escolha).

No arquivo pom.xml deve-se incluir a dependência e plugin do antlr4, assim como o plugin do maven-assembly (pode-se verificar no código presente neste repositório).

Após isso, deve-se criar uma estrutura de pastas identica à criada para guardar a classe principal do projeto, visto que o funcionamento do ANTLR exige que seja desta maneira.
Cria-se, então, um arquivo .g4 que abrigará as regras da linguagem a ser criada e, ao executar o build do projeto, será criado um código Java equivalente àquela linguagem.
Após a criação correta da linguagem no arquivo .g4, pode-se executar o build do projeto.

## Instruções de execução:

O arquivo executável está localizado no caminho:
<br>
```alguma-lexico/target/alguma-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar```
<br>


Para executá-lo, é necessário um arquivo de entrada (.txt) contendo texto (algoritmo na linguagem em questão) e um arquivo de saída (.txt) para escrita dos tokens no formato <'valor','tipo'>

para clonar o repositório, basta ter o git instalado e utilizar o comando: 
```python
 git clone <url http do repositorio>
``` 
(possível usar ssh e outros métodos que achar melhor)

