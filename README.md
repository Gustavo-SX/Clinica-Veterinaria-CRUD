🐾 Clínica Veterinária – Sistema CRUD em Java

Este projeto é um sistema simples de cadastro e gerenciamento para uma clínica veterinária, desenvolvido totalmente em Java utilizando os conceitos de Programação Orientada a Objetos (POO).

O sistema permite administrar:

Animais (Gatos e Cachorros)

Veterinários

Consultas

Leituras, atualizações e remoções de dados

Tudo isso através de um menu interativo no console.

📌 Funcionalidades
🔹 1. Cadastro

Cadastrar Animal

Nome

Idade

Espécie (Gato ou Cachorro)

Cadastrar Veterinário

ID do veterinário

Nome

CPF

Telefone

Agendar Consulta

Seleciona animal pelo índice da lista

Seleciona veterinário

Define data

🔹 2. Leitura

Listar todos os animais cadastrados

Listar veterinários

Listar consultas agendadas

🔹 3. Atualização

Alterar a data de uma consulta existente

🔹 4. Remoção

Remover uma consulta pelo ID

📂 Estrutura do Projeto
src/
├── Animal.java
├── Gato.java
├── Cachorro.java
├── Veterinario.java
├── Consulta.java
└── ClinicaPetMain.java

🧱 Classes
Animal (abstrata)

Classe base para todos os animais, contendo:

nome

idade

espécie

método abstrato EmitirSom()

Gato

Especialização de Animal, sobrescreve:

EmitirSom() → "Miau miau"

Cachorro

Especialização de Animal, sobrescreve:

EmitirSom() → "Au au"

Veterinario

Armazena informações de um veterinário:

idveterinario

nome

cpf

telefone

Consulta

Agrupa:

Data da consulta

Animal

Veterinário

Possui também:

setData() para atualizar a data

ClinicaPetMain

Arquivo principal, responsável por:

Menu

Entrada de dados

Manipular listas

ArrayList<Animal>

ArrayList<Veterinario>

ArrayList<Consulta>

▶️ Como Executar

Certifique-se de ter o Java 8+ instalado.

Compile todas as classes:

javac *.java


Execute o programa principal:

java ClinicaPetMain


O menu aparecerá no console.

💡 Exemplos de Uso
➤ Cadastrar Animal
Nome: Rex
Idade: 4
Espécie: cachorro

➤ Cadastrar Veterinário
ID: 1
Nome: Dr. João
CPF: 000.000.000-00
Telefone: 99999-9999

➤ Agendar Consulta
Selecione Animal: 0 - Rex
Selecione Veterinário: 0 - Dr. João
Data: 15/12/2025

🧪 Conceitos de POO Utilizados

Herança (Gato e Cachorro → Animal)

Classes abstratas

Polimorfismo (EmitirSom() sobrescrito)

Encapsulamento (getters e setters)

Composição (Consulta contém Animal e Veterinário)

🛠 Tecnologias Utilizadas

Java SE

Scanner (entrada de dados)

ArrayList (armazenamento)

📘 Objetivo Educacional

Este projeto serve como prática para:

Modelagem orientada a objetos

Uso de listas dinâmicas

Estruturação de CRUD no console

Manipulação de objetos e relacionamentos

🤝 Contribuições

Sinta-se livre para enviar melhorias, novas funcionalidades ou sugestões.