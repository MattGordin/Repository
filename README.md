# Repository-03
  
Passageiro (id_passageiro, nome, cpf, passaporte, data_nascimento, endereco)
    Contato (telefone, email, id_passageiro)
    Reserva (id_reserva, data, assento, id_passageiro, id_voo)
        Cartao_Embarque (id_cartao, data_emissao, portao, id_reserva)

Voo (id_voo, codigo, data_partida, hora_partida, data_chegada, hora_chegada, duracao_prevista, id_aeronave, id_companhia, id_aeroporto_origem, id_aeroporto_destino)

Companhia (id_companhia, nome, codigo, contato)
     Aeronave (id_aeronave, codigo, modelo, capacidade, id_companhia)

Aeroporto (id_aeroporto, nome, codigo, cidade, país)
     Voo (origem e destino)
     
