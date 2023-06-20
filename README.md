# JAVA
Atividades e Projetos desenvolvidos no curso Java Completo Programação Orientada a Objetos + Projetos ministrado por Nelio Alves, na plataforma Udemy.

### Tratamento de Strings
Formata String:

toLowerCase(); == transforma tudo em minusculo (de: ABC • para: abc)

toUpperCase(); == tranforma tudo em maiusculo (de: Abc • para: ABC)

trim();== remove espaços em branco no final (de: ABC    # • para: ABC#


Recorta String:

substring(int inicio);  == cria uma nova string com base na string de referencia. ( substring(1); = (de: abc • para: bc) )

substing(int inicio, int fim); ==  cria uma nova string com base na string de referencia, mas recortando o intervalo informado. (substring 1, 3); = (de: abcdef • para: bcd) )


Substitui String:

replace(char, char); == substitui uma caracter dentro da string. ( replace('o', 'a') = (de: bolo • para: bala) )

replace(substring, substring); == substitui um conjunto (substring) dentro da string. ( replace("Ana","Lua") = de: Eu me chamo Ana • para: Eu me chamo Lua) )


Busca Posição String:

IndexOf; == Exibe a primeira posição (número inteiro) da substring.

LastIndexOf; == Exibe a ultima posição (número inteiro)  da substring.


Outros:

str.Split("") == 'fatia' a string. Ou seja, se eu tenho uma frase, ele separa cada palavra, separada por espaço em uma string.


