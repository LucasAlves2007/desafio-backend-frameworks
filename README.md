# Desafio Backend Frameworks

## Objetivo

Este repositório tem como objetivo demonstrar, na prática, a utilização de dois frameworks back-end distintos, aplicando o conceito de Arquitetura em Camadas (MVC) e evidenciando diferenças entre tecnologias baseadas em linguagens diferentes.

Os projetos desenvolvidos foram:

* Node.js com Express
* Java com Spring Boot

---

## Tecnologias Utilizadas

### Node.js / Express

* Ambiente: Node.js
* Framework: Express
* Gerenciador de dependências: npm

### Java / Spring Boot

* Linguagem: Java
* Framework: Spring Boot
* Gerenciador de dependências: Maven

---

## Comparação entre os Frameworks

### Facilidade de Configuração

O Node.js com Express possui uma configuração inicial extremamente simples, exigindo poucos comandos (npm init e npm install).
Já o Spring Boot, apesar de oferecer ferramentas como o Spring Initializr, possui uma configuração mais robusta e com mais arquivos envolvidos.

Conclusão:
Node.js é mais rápido para começar, enquanto Spring Boot exige mais estrutura inicial.

---

### Verbosidade do Código

O Express utiliza menos código para realizar tarefas simples, sendo mais direto e flexível.
O Spring Boot, por utilizar fortemente conceitos de orientação a objetos e anotações, tende a ser mais verboso.

Conclusão:
Node.js é mais enxuto, enquanto Spring Boot é mais estruturado e detalhado.

---

### Gerenciamento de Dependências

No Node.js, as dependências são gerenciadas pelo npm, através do arquivo package.json.
No Spring Boot, o gerenciamento é feito pelo Maven, utilizando o arquivo pom.xml.

Conclusão:
Ambos são eficientes, porém o Maven é mais robusto e comum em aplicações corporativas.

---

## Arquitetura em Camadas (MVC)

Ambos os projetos foram organizados seguindo o padrão MVC (Model-View-Controller), adaptado para APIs back-end (sem camada de view).

### Model

Responsável pela representação dos dados da aplicação.

* Node: UserModel.js
* Spring: User.java

---

### Controller

Responsável por receber as requisições HTTP e retornar respostas.

* Node: UserController.js
* Spring: UserController.java

---

### Service / Routes

* No Spring Boot, a camada Service contém a lógica de negócio.
* No Express, a camada de Routes faz a intermediação entre requisição e controller.

Isso demonstra como diferentes frameworks organizam responsabilidades de forma distinta.

---

## Comunicação entre Camadas

O fluxo de funcionamento das aplicações segue o seguinte padrão:

1. O cliente realiza uma requisição HTTP
2. A requisição é recebida pela camada de rotas (Node) ou controller (Spring)
3. O controller processa a requisição
4. A lógica é delegada ao service (Spring) ou diretamente ao model (Node)
5. Os dados são retornados ao cliente em formato JSON

---

## Estrutura do Projeto

```bash
desafio-backend-frameworks/
│
├── node-express/
│   ├── controllers/
│   ├── models/
│   ├── routes/
│
├── java-springboot/
│   └── src/main/java/com/example/demo/
│       ├── controller/
│       ├── model/
│       └── service/
```

---

## Conclusão

O desenvolvimento com Node.js/Express se destaca pela simplicidade, rapidez e flexibilidade, sendo ideal para aplicações leves e protótipos.

Por outro lado, o Spring Boot oferece uma arquitetura mais robusta, organizada e escalável, sendo amplamente utilizado em sistemas corporativos de maior porte.

Assim, a escolha entre os frameworks depende do contexto do projeto e dos requisitos de escalabilidade e manutenção.

---

## Autor

Aluno: Lucas R. da Silva Alves
Curso: ADS
Matrícula: 01849525
Projeto desenvolvido para a disciplina de Backend Frameworks.
