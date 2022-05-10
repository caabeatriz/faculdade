Algoritmo "calcularalgo"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Carol Silva
// Data atual  : 5/9/2022
funcao calculo(numeroUm,numeroDois:real):real
inicio
retorne numeroUm + numeroDois
fimfuncao

Var
// Seção de Declarações das variáveis 
numeroUm, numeroDois, resultado: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Digite um numero:")
leia(numeroUm)

escreval("Digite outro numero:")
leia(numeroDois)

resultado <- calculo(numeroUm, numeroDois)
escreva(" Resultado:", resultado)

Fimalgoritmo
