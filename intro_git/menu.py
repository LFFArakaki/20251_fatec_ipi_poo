import calculadora

def menu():
    escolha = int(input("Selecione uma das opções:\n1. Somar\n2. Subtrair\n3. Multiplicar\n4. Dividir\n0. Sair\n"))
    if escolha == 1:
        a = int(input("Insira o primeiro número para a soma: "))
        b = int(input("Insira o segundo número para a soma: "))
        print(calculadora.somar(a, b))
    if escolha == 2:
        a = int(input("Insira o primeiro número para a subtração: "))
        b = int(input("Insira o segundo número para a subtração: "))
        print(calculadora.subtrair(a, b))
    if escolha == 3:
        a = int(input("Insira o primeiro número para a multiplicação: "))
        b = int(input("Insira o segundo número para a multiplicação: "))
        print(calculadora.multiplicar(a, b))
    if escolha == 4:
        a = int(input("Insira o primeiro número para a divisão: "))
        b = int(input("Insira o segundo número para a divisão: "))
        print(calculadora.dividir(a, b))
    if escolha == 0:
        print("Obrigado por utilizar o programa!")
        exit
        
menu()