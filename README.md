# Repository-03
  
Passageiro (id_passageiro, nome, cpf, passaporte, data_nascimento, endereco)
    Contato (telefone, email, id_passageiro)
Reserva (id_reserva, data, assento, id_passageiro, id_voo)
Cartao_Embarque (id_cartao, data_emissao, portao, id_reserva)
Voo (id_voo, data_partida, hora_partida, data_chegada, hora_chegada, duracao_prevista, id_aeronave, id_companhia, id_aeroporto_origem, id_aeroporto_destino)
Companhia (id_companhia, nome, contato)
Aeronave (id_aeronave, modelo, capacidade, id_companhia)
Aeroporto (id_aeroporto, nome, cidade, país)

Passageiro (1) - (N) Reserva
Passageiro (1) - (N) Contato
Reserva    (1) - (1) Cartão de Embarque
Reserva    (N) - (1) Voo
Companhia  (1) - (N) Aeronave
Companhia  (1) - (N) Voo
Aeronave   (1) - (N) Voo
Aeroporto  (1) - (N) Voo (Origem e Destino)
