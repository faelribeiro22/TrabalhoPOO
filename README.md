# TrabalhoPOO
SIGH – Sistema Informatizado de Gestão
Hoteleira
Fabricio Leyes Ontivero, Maruan Hamdan, Rafael Ribeiro, Silvano Júnior
1. Objetivo
Este trabalho tem o objetivo de consolidar o conhecimento sobre Programação
Orientada a Objetos implementando um sistema para hotéis.
2. Regras de Negócio
O sistema de gestão hoteleira, gerencia entradas (​ check­in​ ), saídas (​ check­out​ ) e
reservas de clientes. O administrador do sistema é o usuário responsável pela manutenção
de todas as informações do sistema.
O hotel possui 10 suítes. Eles são classificados em três categorias:
Categoria   Valor da Diária   Quantidade    Capacidade
Standard    R$ 150.00             5             2
Luxo        R$ 200.00             3             4
Master      R$ 350.00             2             4

O cliente ao chegar no hotel deve realizar seu cadastro caso não tenha. Deve dar
entrada (​ check­in​ ) em sua hospedagem. Caso o cliente não possua uma reserva, devem
ser informados ao sistema o código do cliente, o código do apartamento, a data de
entrada, a data de previsão de saída e o número de hóspedes que ocupará o quarto. Para
completar o ​ check­in com sucesso, o sistema deve validar as seguintes regras: (1) o
quarto deve estar disponível no período entre a data de entrada e a data de saída; (2) o
período de permanência no hotel deve ser de pelo menos um dia; (3) período de
permanência no hotel não deve conflitar com as reservas existentes; e (4) o número de
hóspedes não deve exceder a capacidade do quarto. Se o cliente tiver uma reserva, o
número da reserva deve ser fornecido, os dados confirmados e o ​ check­in validado. Neste
caso, a reserva deixará de existir.
Quando o cliente deixa o hotel, ele deve fazer o ​ check­out​ . Para isso, é necessário
apenas o fornecimento do número do quarto. Assim, o sistema armazenará a data de saída
e calculará o valor da estadia, de acordo com o número de diárias, valor da diária. Após,
será exibido o relatório de estadia do cliente.
Um cliente pode também efetuar a reserva de um quarto para um dado período.
Para isso, o administrador insere os mesmos dados necessários para a realização de
check­in​ , com a diferença de que a data de entrada será uma data de entrada prevista. As
regras de validação também são as mesmas. Caso o cliente não apareça na data de entrada
prevista, a reserva deve ser removida do sistema, não aparecendo como uma reserva
válida. O cliente pode cancelar a reserva, requisitando para o administrador.

3. Requisitos Funcionais
1. Caso não tenha cadastro de cliente, realizar o cadastro contendo as seguintes
informações:
a. Nome
b. Código do cliente
c. CPF
d. Telefone

2. O sistema deve permitir a realização de ​ check­in dos hóspedes. Devem ser
fornecidos os dados necessários para a realização do ​ check­in (código do cliente,
código do quarto, data de entrada, data de previsão de saída e número de hóspedes
que ocupará o quarto) e validadas as regras mencionadas no texto.
3. O sistema deve permitir a realização de ​ check­out dos hóspedes. Ao final, deve
ser exibido o relatório da estadia do cliente, contendo as seguintes informações:
a. Nome e código do cliente
b. Número do quarto, tipo e valor da diária
c. Data de entrada
d. Data de saída
e. Número de hóspedes
f. Número de diárias
g. Valor total da estadia.

4. O sistema deve permitir a realização de reservas de quartos. A reserva somente é
feita por clientes já cadastrados no sistema.
5. O sistema deve permitir as seguintes consultas
a. Por cliente. Deve ser exibido o nome, código e telefone de contato do
cliente, bem como suas reservas e ocupações realizadas por ele.
b. Por quarto. Devem ser exibidos o tipo, valor da diária e capacidade do
quarto, bem como se ele se encontra ocupado, suas reservas e histórico de
ocupações.
6. O sistema deve fornecer um relatório do hotel contendo as seguintes informações:
a. Número total de quartos;
b. Número de quartos ocupados;
c. Valor total recebido no mês (a cada ​ check­out​ , o valor total da estadia é o
valor recebido);
d. Número de hospedes total do mês;
e. Número de reservas com entrada na data atual.
