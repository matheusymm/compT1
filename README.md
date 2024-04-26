- Integrantes
	- Ivan Capeli Navas, 802286
	- Matheus Yuiti Moriy Miata, 802097
	- Vítor Milanez, 804319
---
Implementação de um analisador léxico para a Linguagem Algorítmica (LA) desenvolvida pelo professor Jander.

- Executar com o corretor automático:
``` Shell
# java -jar caminhoCompilador caminhoJar gcc caminhoTemp caminhoCasosTeste 
# "RAs" Trabalho
java -jar /home/matheusymm/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar "java -jar /home/matheusymm/compT1/lexico/target/lexico-1.0-SNAPSHOT-jar-with-dependencies.jar" gcc /home/matheusymm/compT1/temp /home/matheusymm/casos-de-teste "802286, 802097, 804319" t1
```  

- Executar manualmente:
``` Shell
# java -jar CaminhoJarWirhDependencies caminhoEntrada caminhoSaida 
java -jar ./target/lexico-1.0-SNAPSHOT-jar-with-dependencies.jar ~/1.casos_teste_t1/entrada/1-algoritmo_2-3_apostila_LA.txt ~/1.casos_teste_t1/saida/1-algortimo_2-3_apostila_LA.txt
```
