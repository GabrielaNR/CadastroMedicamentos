CREATE DATABASE farmacia;

USE farmacia;

CREATE TABLE medicamento (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    componenteativo VARCHAR(100) NOT NULL,
    datacadastro DATE NOT NULL
);

