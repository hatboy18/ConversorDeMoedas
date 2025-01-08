# ConversorDeMoedas
Conversor de Moedas
Este projeto é um conversor de moedas que utiliza a ExchangeRateAPI para realizar conversões entre o dólar americano (USD) e três outras moedas: peso argentino (ARS), peso colombiano (COP) e real brasileiro (BRL).

O sistema foi desenvolvido com o objetivo de ser simples, intuitivo e eficiente, permitindo ao usuário realizar cálculos de conversão de forma rápida e sem complicações.

Funcionalidades
Conversão de valores do dólar americano (USD) para:
Peso argentino (ARS)
Peso colombiano (COP)
Real brasileiro (BRL)
Conversão de valores das moedas mencionadas acima para o dólar americano (USD).
Integração com a ExchangeRateAPI para obter as taxas de câmbio mais atualizadas.
Como Usar
Selecione a Moeda: O sistema oferece opções para escolher entre as moedas disponíveis (USD, ARS, COP, BRL).
Digite o Valor: Insira o valor que deseja converter.
Obtenha o Resultado: O sistema processará a solicitação e apresentará a conversão com base nas taxas de câmbio mais recentes.
A interface foi projetada para ser intuitiva, eliminando a necessidade de instruções detalhadas. O sistema pode ser utilizado diretamente, mesmo por quem não possui experiência prévia com conversores de moeda.

Tecnologias Utilizadas
Linguagem: Java
API de Taxas de Câmbio: ExchangeRateAPI
Estrutura do Código
O código está organizado de forma modular para facilitar a manutenção e o entendimento:

Conversor: Classe principal responsável por realizar as conversões e interagir com a API.
Modelo de Dados: Estrutura para deserializar e armazenar os dados JSON retornados pela API.
Interface Usuário: Sistema interativo para entrada e saída de dados do usuário.
Requisitos
Java 17 ou superior.
Dependências externas gerenciadas pelo Maven ou adicionadas manualmente:
Gson (biblioteca para manipulação de JSON)
Melhorias Futuras
Adicionar suporte para mais moedas.
Implementar uma interface gráfica para facilitar o uso.
Permitir armazenamento offline de taxas de câmbio para uso sem conexão com a internet.
Sinta-se à vontade para explorar, modificar e contribuir para este projeto. Feedbacks e sugestões são sempre bem-vindos!
