Descrição do Programa de Banco em Java
Este programa simula um sistema bancário básico que permite a criação e a gestão de contas bancárias. Ele oferece funcionalidades essenciais como a criação de contas, depósitos, saques e consulta de saldo. A interação com o usuário é realizada através do terminal, onde ele pode escolher diferentes operações para executar.

Funcionalidades Principais
Criar Conta: Permite a criação de uma nova conta bancária com um número único e o nome do titular.
Depositar: Permite adicionar dinheiro a uma conta específica.
Sacar: Permite retirar dinheiro de uma conta, desde que haja saldo suficiente.
Consultar Saldo: Permite verificar o saldo atual de uma conta específica.
Estrutura do Programa
O programa é dividido em três classes principais: Conta, Banco e Main.

Classe Conta
Responsabilidade: Representa uma conta bancária individual.
Atributos:
numero (String): Número da conta.
titular (String): Nome do titular da conta.
saldo (double): Saldo atual da conta.
Métodos:
depositar(double valor): Adiciona uma quantia ao saldo da conta.
sacar(double valor): Subtrai uma quantia do saldo da conta, se houver saldo suficiente.
getSaldo(): Retorna o saldo atual da conta.
Classe Banco
Responsabilidade: Gerencia várias contas bancárias.
Atributos:
contas (Map<String, Conta>): Um mapa que associa números de contas a objetos Conta.
Métodos:
criarConta(String numero, String titular): Cria uma nova conta bancária.
buscarConta(String numero): Busca uma conta pelo número.
depositar(String numero, double valor): Deposita dinheiro em uma conta.
sacar(String numero, double valor): Saca dinheiro de uma conta.
consultarSaldo(String numero): Consulta o saldo de uma conta.
Classe Main
Responsabilidade: Contém o método main que executa o programa e interage com o usuário.
Métodos:
main(String[] args): Gerencia a lógica de interação com o usuário através de um loop de entrada de comandos.
Conceitos Utilizados
Encapsulamento:

As classes Conta e Banco encapsulam seus dados e métodos, ocultando a implementação interna e expondo apenas o necessário através de métodos públicos.
Coleções:

Uso de HashMap para armazenar e gerenciar múltiplas contas bancárias de maneira eficiente.
Manipulação de Strings e Entradas:

Interação com o usuário através de Scanner para ler entradas do terminal.
Controle de Fluxo:

Uso de estruturas de controle como while, switch, if e else para gerenciar o fluxo de operações no programa.
Orientação a Objetos:

Criação de objetos Conta e Banco que interagem entre si.
Uso de métodos de instância para realizar operações específicas nas contas bancárias.
Tratamento de Erros Simples:

Verificação de condições como saldo insuficiente e valores inválidos para operações financeiras, proporcionando feedback ao usuário.
