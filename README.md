# Sistemas Distribuídos
Aplicação de manipulação e armazenamento de grafos online.
Servidor multi-thread feito utilizando Thrift recebe requisições dos clientes.
Grafo é do tipo G(V,A), sendo V uma lista de vértices e A uma lista de arestas.
Um vértice é dado por:

Vertex{
int: nome,
int: cor,
string: descricao,
double: peso}

Uma aresta é dada por:

Edge{
int: v1
int: v2
double: peso
int: flag
string: descricao
}

Sendo v1 e v2 nomes dos vértices e flag = 1 indica aresta direcionada e flag = 2 indica aresta bi-direcional.



