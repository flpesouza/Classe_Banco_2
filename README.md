Classes Cliente, ContaCorrente e Agencia conforme abaixo:
a) A classe Agencia tem os atributos: nome (String), número e dígito do tipo inteiro. Crie um construtor, os métodos
de acesso e os modificadores.
b) A classe ContaCorrente tem os atributos número e dígito, ambos inteiros, o atributo agência do tipo Agencia e o
atributo saldo (double). Crie um construtor, os métodos de acesso e os modificadores. Crie também um método
depositar que receba um parâmetro double com o valor do depósito e aumente o saldo da conta. Crie também um
método sacar que receba um parâmetro double com o valor do saque e diminua o saldo da conta. A conta não pode
ficar negativa. Neste caso, deve ser impresso uma mensagem que o saque não foi efetuado e o método deve retornar
zero. Caso contrário, o método deve retornar o valor sacado. Crie também um método consultarSaldo que não
recebe parâmetros e retorne o saldo. Crie, finalmente, um método imprimirSaldo que imprima o número da conta
corrente com dígito, o número da agência com dígito e o saldo da conta corrente.
c) A classe Cliente possui os atributos nome e cpf, ambos do tipo String, e um atributo conta do tipo ContaCorrente.
Crie um construtor, os métodos de acesso e os modificadores.
