drop database if exists 20201164010003_hospital;
create database 20201164010003_hospital;

use 20201164010003_hospital;

create table paciente(
id int auto_increment primary key not null,
nome varchar (150) not null,
cpf varchar (14) unique not null,
doenca varchar(50) not null
);

create table medico(
id int auto_increment unique primary key not null,
nome varchar (150) not null,
matricula int unique not null,
especialidade varchar (50) not null,
salario decimal (6,2) not null
);

create table consulta (
id_medico int, 
id_paciente int, 
foreign key (id_medico) references medico(id),
foreign key (id_paciente) references paciente(id),
primary key (id_medico, id_paciente),
horario datetime not null,
valor decimal (5,2)
);
