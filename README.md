# 📦 API Collection - Java

## 📌 Descrição
Este projeto implementa uma **API de Coleções em Java**, demonstrando o uso de estruturas de dados como listas, conjuntos e mapas para manipulação eficiente de dados.

## 🚀 Tecnologias Utilizadas
```md
- Java 17+
- Spring Boot
- Maven
- JUnit (para testes)
```

## 📂 Estrutura do Projeto
```sh
/src
  ├── main/java/com/exemplo/collections
  │   ├── controller    # Endpoints da API
  │   ├── service       # Regras de negócio
  │   ├── model         # Modelos de dados
  │   ├── repository    # Manipulação de coleções
  ├── test/java/com/exemplo/collections # Testes unitários
```

## 🔧 Como Executar o Projeto
```sh
# Clone o repositório
git clone https://github.com/Dvd-coder-art/java-api-collections.git

# Acesse o diretório do projeto
cd api-collection-java

# Compile o projeto
mvn clean install

# Execute a aplicação
mvn spring-boot:run
```

## 📌 Endpoints Principais
```sh
GET  /collections/list       # Retorna uma lista de itens
GET  /collections/set        # Retorna um conjunto de itens únicos
GET  /collections/map        # Retorna um mapa chave-valor
POST /collections/add        # Adiciona um item à coleção
```

## 🛠️ Contribuição
```sh
# Faça um fork do projeto
git checkout -b minha-feature

git commit -m 'Adicionando nova funcionalidade'

git push origin minha-feature

# Abra um Pull Request
```

---

## 📝 Licença
Este projeto está sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

