
# 🛒 produtosAPI

API REST desenvolvida em **Spring Boot** para gerenciamento de produtos, com operações de **CRUD completo** e persistência em banco de dados H2.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (em memória)
- Maven

---

## 📦 Funcionalidades

- ✅ Criar produto
- 🔍 Listar todos os produtos
- 📄 Buscar produto por ID
- ✏️ Atualizar produto
- ❌ Deletar produto

---

## 📁 Estrutura do Projeto

```
produtosAPI/
├── produtosApi/           # Código-fonte Java
│   └── model/             # Classe Produto
│   └── repository/        # Interface ProdutoRepository
│   └── controller/        # Controller com os endpoints
│   └── ProdutosApiApplication.java
├── application.properties # Configurações do H2
```

---

## ⚙️ Como Executar

1. Clone o projeto:
   ```bash
   git clone https://github.com/Luanhp0/produtosAPI.git
   cd produtosAPI
   ```

2. Rode com sua IDE ou use o Maven:
   ```bash
   ./mvnw spring-boot:run
   ```

3. Acesse a API:
   ```
   http://localhost:8080
   ```

4. Console do H2 (opcional):
   ```
   http://localhost:8080/h2-console
   ```

---

## 📌 Exemplos de Endpoints

- `GET /produtos` – Lista todos os produtos  
- `GET /produtos/{id}` – Retorna produto por ID  
- `POST /produtos` – Cria novo produto  
- `PUT /produtos/{id}` – Atualiza produto  
- `DELETE /produtos/{id}` – Deleta produto  

---

## 📋 Exemplo de JSON para POST/PUT

```json
{
  "nome": "Notebook Lenovo",
  "descricao": "Ryzen 5, 8GB RAM, 256GB SSD",
  "preco": 3799.99
}
```

---

## 🧠 Autor

**Luanhp0**  
[GitHub](https://github.com/Luanhp0)

---

## 📝 Licença

Este projeto está sob a licença MIT. Sinta-se livre para usá-lo e contribuir!
