-- Médicos
INSERT INTO medicos (nome_completo, genero, data_nascimento, cpf, rg, estado_civil, telefone, email, naturalidade, crm, especializacao_clinica, senha)
VALUES ('José da Silva', 'Masculino', '1980-05-15', '123.456.789-10', '1234567', 'Solteiro', '(11) 99999-9999', 'jose.silva@email.com', 'São Paulo', 'CRM1234', 'Cardiologia', '1234'),
       ('Maria Souza', 'Feminino', '1975-08-25', '987.654.321-00', '7654321', 'Casado', '(11) 98888-8888', 'maria.souza@email.com', 'Rio de Janeiro', 'CRM5678', 'Pediatria', '5678');

--Pacientes
INSERT INTO pacientes (nome_completo, genero, data_nascimento, cpf, rg, estado_civil, telefone, email, naturalidade, alergias, cuidados_especificos, contato_emergencia, convenio, carteira_convenio, validade_convenio, endereco_id)
VALUES ('Dr. Andre Santana Nunes', 'Masculino', '1990-01-01', '111.222.333-44', '1122334', 'Solteiro', '(11) 77777-7777', 'joao.silva@email.com', 'São Paulo', NULL, NULL, '(11) 77777-7777', NULL, NULL, NULL, 1),
       ('Dr. João Victor Mendes de Oliveira', 'Masculino', '1985-04-20', '444.555.666-77', '2233445', 'Casado', '(11) 66666-6666', 'ana.souza@email.com', 'Rio de Janeiro', 'Amendoim', 'Cuidados com pressão', '(11) 66666-6666', NULL, NULL, NULL, 2);

--Endereços
INSERT INTO endereco (cep, cidade, estado, logradouro, numero, complemento, bairro, ponto_referencia)
VALUES ('01310-100', 'São Paulo', 'SP', 'Avenida Paulista', 1000, 'Apto 123', 'Bela Vista', 'Próximo ao MASP'),
       ('22250-040', 'Rio de Janeiro', 'RJ', 'Rua Senador Vergueiro', 200, NULL, 'Flamengo', 'Próximo ao Parque do Flamengo'),
       ('40301-015', 'Salvador', 'BA', 'Rua Portas do Carmo', 71, NULL, 'Sé', 'Próximo ao Pelourinho'),
       ('90250-190', 'Porto Alegre', 'RS', 'Avenida Nilo Peçanha', 1915, 'Sala 301', 'Três Figueiras', 'Próximo ao shopping Iguatemi');
--Consultas
INSERT INTO Consultas (motivo_consulta, data_hora, descricao_problema, medicacao_receitada, dosagem_precaucao, paciente_id, medico_id)
VALUES
('Dor de cabeça', '2023-04-25 10:30:00', 'Paciente apresenta dor de cabeça intensa e persistente há 2 dias', 'Dipirona', 'Tomar 1 comprimido de 6 em 6 horas', 1, 2),
('Febre', '2023-04-26 15:45:00', 'Paciente apresenta febre alta há 2 dias', 'Paracetamol', 'Tomar 1 comprimido de 6 em 6 horas', 2, 1),
('Dor nas costas', '2023-04-27 11:20:00', 'Paciente apresenta dor nas costas há 1 semana', 'Anti-inflamatório', 'Tomar 1 comprimido de 12 em 12 horas', 1, 1),
('Dor de garganta', '2023-04-28 09:10:00', 'Paciente apresenta dor de garganta e dificuldade para engolir há 3 dias', 'Antibiótico', 'Tomar 1 comprimido de 8 em 8 horas', 2, 2);

--Exames
INSERT INTO Exames (nome_exame, data_hora, tipo_exame, laboratorio, arquivo_exame, resultado_exame, paciente_id, medico_id)
VALUES
('Hemograma completo', '2023-04-25 14:00:00', 'Sangue', 'Laboratório ABC', NULL, 'Hemograma dentro dos valores de referência', 1, 2),
('Ultrassonografia', '2023-04-26 11:00:00', 'Imagem', 'Clínica XYZ', NULL, 'Alteração na vesícula biliar', 2, 1),
('Tomografia', '2023-04-27 09:30:00', 'Imagem', 'Hospital DEF', NULL, 'Ausência de alterações significativas', 1, 1),
('Eletrocardiograma', '2023-04-28 13:20:00', 'Cardiovascular', 'Clínica GHI', NULL, 'Sinusalidade cardíaca normal', 2, 2);