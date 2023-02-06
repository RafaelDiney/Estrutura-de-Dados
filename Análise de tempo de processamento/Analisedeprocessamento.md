# Análise de tempo de processamento entre métodos de ordenação

:point_right:Implementação e adequação do algoritmo InsertionSort no código de ordenação com o algoritmo BubbleSort
desenvolvido em aula, gerar uma tabela com os tempos gastos na ordenação de cada algoritmo e por fim analisar o 
comportamento.

:bookmark_tabs: **Tabela de Testes**

![Imagem1](https://user-images.githubusercontent.com/91790222/216859236-0d882d93-1667-4517-aedc-86cf47217766.png)

:bookmark_tabs:Foi realizado um cálculo de média dos três testes de cada tamanho de vetor, e a partir desse resultado foi gerado o gráfico a seguir:

![image](https://user-images.githubusercontent.com/91790222/216859281-8d84d3b7-a83b-4a50-9d10-644d7819722b.png)

:bookmark_tabs:Depois do levantamento do tempo gasto na ordenação dos vetores para cada algoritmo é gritante a diferença entre o BubbleSort e o InsetionSort, 
mas a explicação está na lógica de cada, já que o BubbleSort trabalha selecionando dois elementos do vetor e troca eles de posição se estiverem
fora de ordem, enquanto o InsertionSort pega um elemento compara com o resto da lista e o classifica, diminuindo o número de comparações e o tempo
de processamento, tornando o insertionSort mais eficiente do que o BubbleSort.
