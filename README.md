# Módulo 2 - Projeto Avaliativo 1

## Descrição  
A LABMedicine deseja criar a API Rest da aplicação LABMedical, que foi desenvolvida anteriormente por você.
Este software será utilizado em todos os atendimentos médicos dos hospitais da rede.

## Motivação
Essa aplicação é um sistema de gerenciamento de consultas médicas que resolve problemas relacionados ao armazenamento e organização de informações de pacientes, médicos e consultas. 
Com a utilização dos endpoints disponíveis, é possível cadastrar e atualizar informações de médicos e pacientes, cadastrar e atualizar informações de consultas e exames, listar pacientes e endereços,
buscar informações de pacientes e consultas pelo identificador e excluir pacientes, consultas e exames.

## Utilização
Para utilizar a aplicação, é necessário fazer requisições HTTP aos endpoints correspondentes, passando as informações necessárias em formato JSON no corpo da requisição.
As requisições de cadastro e atualização de informações de médicos, pacientes, consultas e exames devem ser feitas utilizando os métodos POST e PUT, respectivamente.
A listagem de pacientes e endereços pode ser feita utilizando o método GET, e a busca de informações de pacientes e consultas pelo identificador e exclusão de pacientes, 
consultas e exames pode ser feita utilizando os métodos GET e DELETE, respectivamente.

Para cada endpoint, é necessário passar os parâmetros correspondentes de acordo com a documentação da API.
Além disso, é necessário enviar os dados em formato JSON com as informações requeridas, de acordo com o formato especificado na documentação da API.

## Tecnologias
A aplicação LABMedical utiliza uma série de tecnologias para sua construção.
Para o desenvolvimento da API REST, foi utilizada a biblioteca Spring Boot 3.0.6 em conjunto com o framework Spring Data JPA para a persistência dos dados em um banco de dados Oracle.
Além disso, o projeto conta com o uso do plugin Spring Boot Maven e do plugin Maven Compiler, que auxiliam na compilação e execução da aplicação.

Outras dependências importantes incluem o Jackson Datatype JSR310 para serialização de datas em formato JSON,
o MapStruct para a criação de mapeamentos entre objetos, o Hibernate Validator para validação de dados, e o HttpClient para realizar requisições HTTP.

## Possíveis Melhorias
* Adição de recursos de autenticação e autorização, para garantir a segurança e o controle de acesso ao sistema.
* Implantação de um sistema de backup e recuperação de dados, para evitar perda de informações e garantir a disponibilidade do sistema.
* Integração com outros sistemas de saúde, como hospitais e clínicas, para ampliar a abrangência do sistema e facilitar a troca de informações entre eles
* Adoção de padrões de código e arquitetura, como o Clean Code e o Domain-Driven Design, para tornar o código mais organizado e fácil de manter.




   Desenvolvido por:
   Pedro Lima do Nascimento
   <a href="https://www.linkedin.com/in/pedro-lima-12b92332/">Linkedin | <a href="https://github.com/GitdoPedro">Github
