CREATE DATABASE IF NOT EXISTS estacionamento;
USE estacionamento;

CREATE TABLE vaga (
    idVaga int NOT NULL AUTO_INCREMENT,
    numero int NOT NULL,
    rua varchar(50) NOT NULL,
    obliqua boolean NOT NULL,
    PRIMARY KEY (idVaga)
);

CREATE TABLE `motorista` (
    idMotorista int NOT NULL AUTO_INCREMENT,
    nomeCompleto varchar(150) NOT NULL,
    genero varchar(15) NOT NULL,
    rg varchar(50) NOT NULL,
    cpf varchar(50) NOT NULL,
    celular varchar(50) NOT NULL,
    email varchar(150) NOT NULL,
    senha varchar(150) NOT NULL,
    PRIMARY KEY (idMotorista)
);