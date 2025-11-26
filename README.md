🐾 Clínica Veterinária – Sistema em Java

Este projeto implementa um sistema básico de gestão para uma clínica veterinária, utilizando Java e conceitos de Programação Orientada a Objetos (POO).

O sistema permite cadastrar e gerenciar:

Animais (Gato, Cachorro)

Veterinários

Consultas

Tudo é controlado por um menu simples no console.

📌 Funcionalidades

Cadastrar animais (nome, idade, espécie)

Cadastrar veterinários (id, nome, CPF, telefone)

Agendar consultas entre animal e veterinário

Listar animais, veterinários e consultas

Atualizar a data de consultas

Remover consultas

📂 Estrutura de Classes

Animal – classe base com nome, idade, espécie e método EmitirSom()

Gato – emite “Miau miau”

Cachorro – emite “Au au”

Veterinario – ID, nome, CPF e telefone

Consulta – contém animal, veterinário e data

ClinicaPetMain – menu principal e controle das listas

🧱 Conceitos Utilizados

Herança

Sobrescrita de métodos

Encapsulamento

Composição

Uso de ArrayList para armazenamento
