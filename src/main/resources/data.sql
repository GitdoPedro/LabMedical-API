-- Médicos
INSERT INTO medico (nome_completo, genero, data_nascimento, cpf, rg, estado_civil, telefone, email, naturalidade, crm, especializacao_clinica, senha)VALUES('Dr. Andre Santana Nunes', 'Masculino', '25/08/75', '123.456.789-10', '1234567', 'Solteiro', '(11) 99999-9999', 'jose.silva@email.com', 'São Paulo', 'CRM1234', 'Cardiologia', 'senha12345');
INSERT INTO medico (nome_completo, genero, data_nascimento, cpf, rg, estado_civil, telefone, email, naturalidade, crm, especializacao_clinica, senha)VALUES('Dr. João Victor Mendes de Oliveira', 'Masculino', '25/08/75', '987.654.321-00', '7654321', 'Casado', '(11) 98888-8888', 'maria.souza@email.com', 'Rio de Janeiro', 'CRM5678', 'Pediatria', 'senha5678');

--Endereços
INSERT INTO endereco (cep, cidade, logradouro, numero, complemento, bairro, ponto_referencia) VALUES('01310-100', 'São Paulo', 'Avenida Paulista', 1000, 'Apto 123', 'Bela Vista', 'Próximo ao MASP');
INSERT INTO endereco (cep, cidade, logradouro, numero, complemento, bairro, ponto_referencia) VALUES('22250-040', 'Rio de Janeiro', 'Rua Senador Vergueiro', 200, NULL, 'Flamengo', 'Próximo ao Parque do Flamengo');
INSERT INTO endereco (cep, cidade, logradouro, numero, complemento, bairro, ponto_referencia) VALUES('40301-015', 'Salvador', 'Rua Portas do Carmo', 71, NULL, 'Sé', 'Próximo ao Pelourinho');
INSERT INTO endereco (cep, cidade, logradouro, numero, complemento, bairro, ponto_referencia) VALUES('90250-190', 'Porto Alegre','Avenida Nilo Peçanha', 1915, 'Sala 301', 'Três Figueiras', 'Próximo ao shopping Iguatemi');

--Pacientes
INSERT INTO paciente (nome_completo, genero, data_nascimento, cpf, rg, estado_civil, telefone, email, naturalidade, alergias, cuidados_especificos, contato_emergencia, convenio, carteira_convenio, validade_convenio, endereco_id)
VALUES ('Pedro Lima do Nascimento', 'Masculino', '15/05/90', '111.222.333-44', '1122334', 'Solteiro', '(11) 77777-7777', 'joao.silva@email.com', 'São Paulo', NULL, NULL, '(11) 77777-7777', NULL, NULL, NULL, 1);
INSERT INTO paciente (nome_completo, genero, data_nascimento, cpf, rg, estado_civil, telefone, email, naturalidade, alergias, cuidados_especificos, contato_emergencia, convenio, carteira_convenio, validade_convenio, endereco_id)
VALUES ('Arthur Coimbra', 'Masculino', '14/11/85', '444.555.666-77', '2233445', 'Casado', '(11) 66666-6666', 'ana.souza@email.com', 'Rio de Janeiro', 'Amendoim', 'Cuidados com pressão', '(11) 66666-6666', NULL, NULL, NULL, 2);


--Consultas
INSERT INTO consulta (motivo_consulta, data_hora, descricao_problema, medicacao_receitada, dosagem_precaucao, paciente_id, medico_id)
VALUES('Dor de cabeça', '25/04/2023 10:30:00', 'Paciente apresenta dor de cabeça intensa e persistente há 2 dias', 'Dipirona', 'Tomar 1 comprimido de 6 em 6 horas', 1, 2);
INSERT INTO consulta (motivo_consulta, data_hora, descricao_problema, medicacao_receitada, dosagem_precaucao, paciente_id, medico_id)
VALUES('Febre', '26/04/2022 15:45:00', 'Paciente apresenta febre alta há 2 dias', 'Paracetamol', 'Tomar 1 comprimido de 6 em 6 horas', 2, 1);
INSERT INTO consulta (motivo_consulta, data_hora, descricao_problema, medicacao_receitada, dosagem_precaucao, paciente_id, medico_id)
VALUES('Dor nas costas', '01/01/2022 11:20:00', 'Paciente apresenta dor nas costas há 1 semana', 'Anti-inflamatório', 'Tomar 1 comprimido de 12 em 12 horas', 1, 1);
INSERT INTO consulta (motivo_consulta, data_hora, descricao_problema, medicacao_receitada, dosagem_precaucao, paciente_id, medico_id)
VALUES('Dor de garganta', '28/04/2022 09:10:00', 'Paciente apresenta dor de garganta e dificuldade para engolir há 3 dias', 'Antibiótico', 'Tomar 1 comprimido de 8 em 8 horas', 2, 2);

--Exames
INSERT INTO exame (nome_exame, data_hora, tipo_exame, laboratorio, arquivo_exame, resultado_exame, paciente_id, medico_id) VALUES
('Hemograma completo', '25/04/2023 14:00:00', 'Sangue', 'Laboratório ABC', NULL, 'Hemograma dentro dos valores de referência', 1, 2);
INSERT INTO exame (nome_exame, data_hora, tipo_exame, laboratorio, arquivo_exame, resultado_exame, paciente_id, medico_id) VALUES
('Ultrassonografia', '26/04/2023 11:00:00', 'Imagem', 'Clínica XYZ', NULL, 'Alteração na vesícula biliar', 2, 1);
INSERT INTO exame (nome_exame, data_hora, tipo_exame, laboratorio, arquivo_exame, resultado_exame, paciente_id, medico_id)
VALUES('Tomografia', '27/04/2023 09:30:00', 'Imagem', 'Hospital DEF', NULL, 'Ausência de alterações significativas', 1, 1);
INSERT INTO exame (nome_exame, data_hora, tipo_exame, laboratorio, arquivo_exame, resultado_exame, paciente_id, medico_id) VALUES
('Eletrocardiograma', '28/04/2023 13:20:00', 'Cardiovascular', 'Clínica GHI', NULL, 'Sinusalidade cardíaca normal', 2, 2);
